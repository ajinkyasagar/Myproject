package com.d2h.service.controller;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.d2h.service.domain.ContactUs;
import com.d2h.service.domain.Customer;
import com.d2h.service.domain.Payment;
import com.d2h.service.serviceimpl.SpeedyTurtleOTPGenerator;
import com.d2h.service.services.login.auth.FBConnection;
import com.d2h.service.services.login.auth.GoogleAuthHelper;
import com.d2h.service.util.CustomerService;
import com.d2h.service.util.PaymentServiceImpl;
import com.d2h.service.util.SmsSender;

/**
 * CustomerController class will expose a series of RESTful end points
 */
@Controller
public class CustomerController {

	@Autowired
	private CustomerService custService;
	
	@Autowired
	private PaymentServiceImpl paymentService;
	
/*	@Autowired
	GoogleAuthHelper helper;*/
	private static final Logger log = Logger.getLogger(CustomerController.class);
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public @ResponseBody List<Customer> getAllCustomers() {
		log.info("CustomerController.getAllCustomers - Return customer details.");
		return custService.getAllCustomers();
	}
	
	@RequestMapping(value = "/getpayment", method = RequestMethod.POST)
	public @ResponseBody Payment getPaymentDetails(@RequestBody Payment payment) {
		log.info("CustomerController.getAllCustomers - Return customer details.");
		return paymentService.getPaymentInfo(payment);
	}
	
	
	
	
	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public  int insertCustomer(@RequestBody Customer customer) {
		customer.setCustomerLoginCreatedDate(new SimpleDateFormat("dd-M-yyyy hh:mm:ss").format(new Date()));
		return custService.insertCustomer(customer);
	}
	
	@RequestMapping(value = "/otp", method = RequestMethod.POST)
	public  @ResponseBody Customer oTPCustomer(@RequestBody Customer customer) {
		if(customer != null && customer.getMobileNumber().length() == 10){
			try {
				String otp = SpeedyTurtleOTPGenerator.getOtp(generateUniqueId());
				customer.setOtp(otp);
				SmsSender.SMSSender("speedyturtleindia", "765125", "91"+customer.getMobileNumber(), "Your OTP for SpeedyTurtle login is "+ otp+". OTP will expire in next 10 mins", "WebSMS", "0");
			} catch (InvalidKeyException e) {
				e.printStackTrace();
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
		}
		else {
			customer = new Customer();
			customer.setErrorMessage("InValid Mobile Number  " + customer.getMobileNumber());
		}
		return customer/*custService.insertCustomer(customer)*/;
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Customer loginCustomer(@RequestBody Customer customer) {
		String mobileNumber = customer.getMobileNumber();
		String password = customer.getPassword();
		System.out.println("mobileNumber : "+mobileNumber + " - password : "+password);
		Customer cust =  custService.loginCustomer(customer);
		if(cust != null){
			if(cust.getMobileNumber().equals(mobileNumber)){
				if(cust.getPassword().equals(password)){
					cust.setErrorMessage("Valid Mobile Number and password");
				}
				else {
					cust.setErrorMessage("Invalid Passord " + password);
				}
			}
			else {
				cust.setErrorMessage("Invalid User/Mobile Number " + mobileNumber);
			}
		}
		else {
			cust = new Customer();
			cust.setErrorMessage("InValid Mobile Number "+ mobileNumber);
		}
		if(StringUtils.hasLength(cust.getMobileNumber())){
			cust.setValid(true);
		}else{
			cust.setValid(false);
		}
		return cust;
	}
	
	@RequestMapping(value = "/forgetPassword", method = RequestMethod.POST)
	public @ResponseBody Customer forgetPassword(@RequestBody Customer customer) {
		String mobileNumber = customer.getMobileNumber();
		Customer cust =  custService.forgetPassword(customer);
		if(cust != null){
			//SmsSender.SMSSender("speedyturtleindia", "765125", customer.getMobileNumber(), "Your password is "+cust.getPassword(), "WebSMS", "0");
		}
		else {
			cust = new Customer();
			cust.setErrorMessage("InValid Mobile Number " + mobileNumber);
		}
		return cust;
	}
	
	@RequestMapping(value = "/updateCustomer", method = RequestMethod.GET)
	public @ResponseBody int updateCustomer(@PathVariable("custId") Customer customer) {
		return custService.updateCustomer(customer);
	}
	
	@RequestMapping(value = "/contactUs", method = RequestMethod.POST)
	public @ResponseBody int contactUs(@RequestBody ContactUs contactUs) {
		return custService.contactUs(contactUs);
	}
	
	@RequestMapping(value = "/logingoogle", method = RequestMethod.GET, produces = "text/plain; charset=utf-8" )
	public @ResponseBody String loginUsingGoogle() {
		
		GoogleAuthHelper helper = new GoogleAuthHelper();
		return helper.buildLoginUrl();
	}
	
	
	@RequestMapping(value = "/jsonformat", method = RequestMethod.GET )
	public @ResponseBody String jSonFormat(String authCode) throws IOException {
		GoogleAuthHelper helper = new GoogleAuthHelper();
		String json = helper.getUserInfoJson(authCode);
		return json;
	}
	
	
	@RequestMapping(value = "/loginfacebook", method = RequestMethod.GET, produces = "text/plain; charset=utf-8" )
	public @ResponseBody String loginUsingFaceBook() {
		FBConnection fBook = new FBConnection();
		String faceBookUrl = fBook.getFBAuthUrl();
		System.out.println("Face Book login details : "+faceBookUrl);
		return faceBookUrl;
	}
	
	/*@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@Consumes(MediaType.APPLICATION_JSON)
	public int insertUser(@RequestBody User user) {
		return userService.insertUser(user);
	}*/
	
	/*@RequestMapping(value = "/employees", method = RequestMethod.POST)
	public ResponseEntity<String> createEmployee(@RequestBody EmployeeVO employee)
	{
	    System.out.println(employee);
	    return new ResponseEntity(HttpStatus.CREATED);
	}*/
	
	/*@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@Consumes(MediaType.APPLICATION_JSON)
	public int insertUser(@RequestBody User user) {
		return userService.insertUser(user);
	}*/
	
/*	@RequestMapping("/hello/{player}")
	public @ResponseBody Message message1(@PathVariable String player) {

		Message msg = new Message(player, "Hello " + player);
		return msg;
	}*/

	/**
	 * Create an error REST response.
	 * @param sMessage
	 * @return
	 */
	/**
	 * Injector methods.
	 *
	 * @param studentService_p
	 *            the new student service
	 */
	public void setStudentService(CustomerService studService_p) {
		custService = studService_p;
	}
	
	private String generateUniqueId() {      
        UUID idOne = UUID.randomUUID();
        String str=""+idOne;        
        int uid=str.hashCode();
        String filterStr=""+uid;
        str=filterStr.replaceAll("-", "");
        return str;
    }
	/*public static void main(String[] args) {
		Customer customer =  new Customer();
		customer.setMobileNumber("9422915439");
//		customer.setMobileNumber("9987330777");
		new CustomerController().oTPCustomer(customer);
		
		try {
			for (int i = 0; i <5; i++) {
				System.out.println("Your otp is : "+SpeedyTurtleOTPGenerator.getOtp(new CustomerController().generateUniqueId()));
			}
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}*/
}

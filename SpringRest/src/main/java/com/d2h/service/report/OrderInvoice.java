package com.d2h.service.report;

import java.io.File;
import java.io.StringWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import com.d2h.service.domain.Address;
import com.d2h.service.domain.CustOrder;
import com.d2h.service.util.ReportConstants;
import com.d2h.service.util.SpeedyTurtleMailService;

public class OrderInvoice
{
    public static void main( String[] args )
        throws Exception
    {/*
        
         *   first, get and initialize an engine
         

        VelocityEngine ve = new VelocityEngine();
        ve.init();

        
         *   organize our data 
         

        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("Sl_No", "1");
        map.put("name", "Indian gate Basmati Rice");
        map.put("price", "$100.00");
        map.put("count", "4.00");
        map.put("Total", "$400.00");
        list.add( map );
 
        map = new HashMap<String, String>();
        map.put("Sl_No", "2");
        map.put("name", "Sakti Bhog Atta");
        map.put("price", "$60");
        map.put("count", "4.00");
        map.put("Total", "$240.00");
        list.add( map );

        map = new HashMap<String, String>();
        map.put("Sl_No", "3");
        map.put("name", "Best Cashew");
        map.put("price", "$750");
        map.put("count", "3.00");
        map.put("Total", "$2250.00");
        list.add( map );

        
         *  add that list to a VelocityContext
         

        VelocityContext context = new VelocityContext();
        context.put("groceryList", list);
        String name = "Hemanta Patasani";
        context.put("name", name);

        
         *   get the Template  
         

        Template t = ve.getTemplate( "./src/email_html.vm" );

        
         *  now render the template into a Writer, here 
         *  a StringWriter 
         

        StringWriter writer = new StringWriter();

        t.merge( context, writer );

        
         *  use the output in the body of your emails
         
        new SpeedyTurtleMailService().sendMail(writer.toString());
        System.out.println( writer.toString() );
    */
    	
//    new OrderInvoice().mailServiceHtml(list, address, orderId);
    }
    public void mailServiceHtml(ArrayList<Map<String, String>> list, Address address, String orderId, CustOrder order, double totalSalePrice){

        /*
         *   first, get and initialize an engine
         */

        VelocityEngine ve = new VelocityEngine();
 Properties props=new Properties();
            props.put("resource.loader", "class");
            props.put("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
            props.put("runtime.log.logsystem.class", "org.apache.velocity.runtime.log.NullLogChute");
		
		
        ve.init(props);

        /*
         *   organize our data 
         */

      /*  ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("Sl_No", "1");
        map.put("name", "Indian gate Basmati Rice");
        map.put("price", "$100.00");
        map.put("count", "4.00");
        map.put("Total", "$400.00");
        list.add( map );
 
        map = new HashMap<String, String>();
        map.put("Sl_No", "2");
        map.put("name", "Sakti Bhog Atta");
        map.put("price", "$60");
        map.put("count", "4.00");
        map.put("Total", "$240.00");
        list.add( map );

        map = new HashMap<String, String>();
        map.put("Sl_No", "3");
        map.put("name", "Best Cashew");
        map.put("price", "$750");
        map.put("count", "3.00");
        map.put("Total", "$2250.00");
        list.add( map );*/

        /*
         *  add that list to a VelocityContext
         */
java.util.Date d= new java.util.Date();
        VelocityContext context = new VelocityContext();
        context.put("groceryList", list);
        String name = order.getCustomer().getFirstName()+" "+order.getCustomer().getLastName();
        context.put(ReportConstants.SubTotal, totalSalePrice);
        context.put(ReportConstants.CustomerName, name);
        context.put(ReportConstants.Address, ""+address.getAddressLine1()+", "+address.getAddressLine2()+", "+address.getLandMark()+", "+address.getLocality()+", "+
        		address.getCity()+", "+address.getState()+", "+address.getCountry());
        context.put(ReportConstants.MobileNumber, ""+order.getCustomer().getMobileNumber());
        context.put(ReportConstants.Email, order.getCustomer().getEmail());
        context.put(ReportConstants.Date,d.toString());
        context.put(ReportConstants.Discount,order.getCouponDiscount());
        context.put(ReportConstants.Total,totalSalePrice- new Double(order.getCouponDiscount()));

        /*
         *   get the Template  
         */
        String basePath = new File("").getAbsolutePath();
	    System.out.println(basePath);

//	    String path = new File(basePath+"\\src\\main\\java\\com\\d2h\\service\\report\\email_html.vm").getAbsolutePath();
//        Template t = ve.getTemplate( "email_html.vm" );
        
        Template t = loadTemplate();


        /*
         *  now render the template into a Writer, here 
         *  a StringWriter 
         */

        StringWriter writer = new StringWriter();
        
     /*   ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        ve.init();
        Template t = ve.getTemplate( "./resources/email_html.vm" );
        t.merge( context, writer );*/
        
        /*
         *  use the output in the body of your emails
         */
//        System.out.println( writer.toString() );
        
        
        
        
       /* Properties p = new Properties(); 

        p.setProperty( "resource.loader", "class" );
        p.setProperty( "class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader" );
        Velocity.init(p);
        Template template = Velocity.getTemplate( "/WEB-INF/template/email_html.vm" );
//        VelocityContext context = new VelocityContext();
//        context.put("ProjName", proj.getName());
//        context.put("SubmissionDate", DateFormat.getDateInstance().format(dt));

        StringWriter writer = new StringWriter();
*/      t.merge( context, writer );
//		System.out.println(writer.toString());
        new SpeedyTurtleMailService().sendMail(writer.toString(), order.getCustomer().getEmail());
    
    }
    
    private Template loadTemplate(){
    	Template t = null;
    	  try {
    	    Properties props=new Properties();
            props.put("resource.loader", "class");
            props.put("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
            props.put("runtime.log.logsystem.class", "org.apache.velocity.runtime.log.NullLogChute");
	
		
			
			VelocityEngine ve = new VelocityEngine();
            ve.init(props);
            t = ve.getTemplate("email_html.vm");
    	  }
    	 catch (  Exception e) {
    	    e.getMessage();
    	  }
    	  return t;
    	}
}

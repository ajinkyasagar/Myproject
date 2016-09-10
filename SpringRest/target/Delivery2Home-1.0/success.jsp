<%@page import="java.security.MessageDigest"%>
<%@page import="java.security.NoSuchAlgorithmException"%>
<html>
    <body>

   
<%
 

        String amount = request.getParameter("amount");
	String productinfo= request.getParameter("productinfo");
	String txnid = request.getParameter("txnid");
	String phone = request.getParameter("phone");
	String firstname = request.getParameter("firstname");
	String key = "JBZaLc";
	String salt = "GQs7yium";
	String status = request.getParameter("status");
	String r_h =request.getParameter("hash");
        String hashString="";
        String udf1 =request.getParameter("udf1");
        String udf2 =request.getParameter("udf2");
        String udf3 =request.getParameter("udf3");
        String udf4 =request.getParameter("udf4");
        String udf5 =request.getParameter("udf5");
        String p_Id = request.getParameter("payuMoneyId");
        String additionalCharges = request.getParameter("additionalCharges");
		String errors=request.getParameter("error");
		String mode=request.getParameter("mode");
		String bank_ref_num =request.getParameter("bank_ref_num");
        out.println("Your paymnet with Payment ID is :" + p_Id + "is ");
        //String udf2 = request.getParameter("udf2");
        String hash;
        String email = request.getParameter("email");
        if(status=="success"){
                if(additionalCharges!=null){
		String hashSequence = additionalCharges+"|"+salt+"|"+status+"||||||"+udf5+"|"+udf4+"|"+udf3+"|"+udf2+"|"+udf1+"|"+email+"|"+firstname+"|"+productinfo+"|"+amount+"|"+txnid+"|";
		
		
			hashString=hashSequence.concat(key);
                        out.println(hashString);
                        hash=hashCal("SHA-512",hashString);
                        out.println(hash);
			if(r_h.equals(hash)){
		         out.println("Successfull with additiona charges");
                        out.println("Transaction details:");
                            out.println("Amount:"+amount);
                            out.println("additionalCharges:"+additionalCharges);
                            out.println("Status of Transaction:"+status);}
			                  
                        else {out.println("Transaction details:");
                            out.println("Amount:"+amount);
                            out.println("additionalCharges:"+additionalCharges);
                            out.println("Status of Transaction:"+status);
                        }
                }
                else {
        String hashSequence = salt+"|"+status+"||||||"+udf5+"|"+udf4+"|"+udf3+"|"+udf2+"|"+udf1+"|"+email+"|"+firstname+"|"+productinfo+"|"+amount+"|"+txnid+"|";
		
		
			hashString=hashSequence.concat(key);
                        out.println(hashString);
                        hash=hashCal("SHA-512",hashString);
                        out.println(hash);
			if(r_h.equals(hash)){
		         out.println("Successfull");
                        out.println("Transaction details:");
                            out.println("Amount:"+amount);
                            out.println("additionalCharges:"+additionalCharges);
                            out.println("Status of Transaction:"+status);}
			                  
                        else{ out.println("failure");
                        out.println("Transaction details:");
                            out.println("Amount:"+amount);
                            out.println("additionalCharges:"+additionalCharges);
                            out.println("Status of Transaction:"+status);}
                }	
				
				
				
				 
        }else {
			
			
			out.println("Transaction details:");
                            out.println("Amount:"+amount);
                            out.println("additionalCharges:"+additionalCharges);
                            out.println("Status of Transaction:"+status);
                    
							
					}
						
						
	
			 String redirectURL = "http://delivery2home.com/Delivery2Home/#/success?ordersubmitted=1"+"&amount="+amount+"&txnid="+txnid+"&p_Id="+p_Id+"&bank_ref_num="+bank_ref_num+"&mode="+mode;
		
        response.sendRedirect(redirectURL);
	%>
<%!
	public String hashCal(String type,String str){
		byte[] hashseq=str.getBytes();
		StringBuffer hexString = new StringBuffer();
		try{
		MessageDigest algorithm = MessageDigest.getInstance(type);
		algorithm.reset();
		algorithm.update(hashseq);
		byte messageDigest[] = algorithm.digest();
            
		

		for (int i=0;i<messageDigest.length;i++) {
			String hex=Integer.toHexString(0xFF & messageDigest[i]);
			if(hex.length()==1) hexString.append("0");
			hexString.append(hex);
		}
			
		}catch(NoSuchAlgorithmException nsae){ }
		
		return hexString.toString();


	}
%>
    </body>
</html>
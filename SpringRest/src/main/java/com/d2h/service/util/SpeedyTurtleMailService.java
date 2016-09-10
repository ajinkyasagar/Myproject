/**
 * 
 */
package com.d2h.service.util;

/**
 * @author Hemanta
 *
 */
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SpeedyTurtleMailService {
   public static void main(String[] args) {
	   SpeedyTurtleMailService spTurtle = new SpeedyTurtleMailService();
	   spTurtle.sendMail("","");
   }
   public void sendMail(String message1, String mailIds){

	      // Recipient's email ID needs to be mentioned.
//	      String to = "hemanta04@gmail.com, sagarthakare1@gmail.com, Sudhirkothem@gmail.com, hiteshkumarsahu1990@gmail.com";//change accordingly
	   String to = mailIds+", "+"hemanta04@gmail.com, sagarthakare1@gmail.com, Sudhirkothem@gmail.com, hiteshkumarsahu1990@gmail.com";

	      // Sender's email ID needs to be mentioned
	      String from = "speedyturtleindia@gmail.com";//change accordingly
	      final String username = "speedyturtleindia@gmail.com";//change accordingly
	      final String password = "hemanta76";//change accordingly

	      // Assuming you are sending email through relay.jangosmtp.net
	      String host = "smtp.gmail.com";

	      Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.smtp.host", host);
	      props.put("mail.smtp.port", "587");

	      // Get the Session object.
	      Session session = Session.getInstance(props,
	      new javax.mail.Authenticator() {
	         protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication(username, password);
	         }
	      });

	      try {
	         // Create a default MimeMessage object.
	         Message message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.setRecipients(Message.RecipientType.TO,
	         InternetAddress.parse(to));

	         // Set Subject: header field
	         message.setSubject("SpeedyTurtle Mail Service");
	         message.setContent(message1, "text/html");
	         // Now set the actual message
	         /*message.setText("Hello, Welcome to SpeedyTurtle Mailing service "
	            + "Thanks ");*/
//	         message.setText(message1);

	         // Send message
	         Transport.send(message);

	         System.out.println("Sent message successfully....");

	      } catch (MessagingException e) {
	            throw new RuntimeException(e);
	      }
	   
   }
}

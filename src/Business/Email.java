/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Session;
import javax.mail.Transport;


/**
 *
 * @author namithajc
 */
public class Email {
    
public static void sendMail(String Subject,String username,String Password,String receipent)
{
	// email ID of Recipient.
	String recipient = receipent;

	// email ID of Sender.
	String sender = "citycommitee@gmail.com";

	// using host as localhost
	String host = "localhost";

//	 Getting system properties
	Properties properties = System.getProperties();
//
//	// Setting up mail server
        properties.setProperty("mail.smtp.host",host);
	properties.setProperty("mail.smtp.port", "25");
//        Properties p = new Properties();
//        p.put("mail.smtp.auth","true");
//        p.put("mail.smtp.starttls.enable","true");
//        p.put("mail.smtp.host", "smtp.gmail.com");
//        p.put("mail.smtp.port","587");
//
//	// creating session object to get properties
         Session session = Session.getDefaultInstance(properties);
//	Session session;
//        session = Session.getDefaultInstance(p,new javax.mail.Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication(){
//                return new PasswordAuthentication("citycommitee@gmail.com","Qwerty@12");
//
//            }
//    });

	try
	{
		// MimeMessage object.
		MimeMessage message = new MimeMessage(session);

		// Set From Field: adding senders email to from field.
		message.setFrom(new InternetAddress(sender));

		// Set To Field: adding recipient's email to from field.
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));

		// Set Subject: subject of the email
		message.setSubject("This is Subject");

		// set body of the email.
		message.setText("This is a test mail");

		// Send email.
		Transport.send(message);
		System.out.println("Mail successfully sent");
	}
	catch (MessagingException mex)
	{
		mex.printStackTrace();
	}
}
}

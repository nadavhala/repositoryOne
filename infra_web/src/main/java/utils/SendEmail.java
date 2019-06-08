package utils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


public class SendEmail {


    static public void sendMail(String to, String header, String messageBody) {


        // Recipient's email ID needs to be mentioned.
        // String to = "d.bar6531@gmail.com";

        // Sender's email ID needs to be mentioned
        String from = "automationprojectmail@gmail.com";

        // Assuming you are sending email from localhost
        String host = "automationprojectmail@gmail.com";

        // Get system properties
        Properties properties = System.getProperties();


        // Setup mail server
        properties.setProperty("mail.smtp.host", host);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", 587);

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties, new Authenticator()
        { protected PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication("automationprojectmail@gmail.com", "automationandshit");
        }
        });
        try

        {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject(header);

            // Now set the actual message
            message.setText(messageBody);

            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (
                MessagingException mex)

        {
            mex.printStackTrace();
        }
    }

}






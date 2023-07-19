import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailService {

    public static void main(String[] args) {

        // Sender's email and password
        String senderEmail = "your-email@example.com";
        String senderPassword = "your-email-password";

        // Recipient's email address
        String recipientEmail = "recipient-email@example.com";

        // Setup mail server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.example.com");
        properties.put("mail.smtp.port", "587");

        // Create a session with the sender's credentials
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Create a MimeMessage object
            MimeMessage message = new MimeMessage(session);

            // Set the sender and recipient addresses
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));

            // Set the subject and text of the email
            message.setSubject("JavaMail API Test");
            message.setText("This is a test email sent from a Java program.");

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            System.out.println("Failed to send email. Error message: " + e.getMessage());
        }
    }
}
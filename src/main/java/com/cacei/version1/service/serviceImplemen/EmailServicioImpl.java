package com.cacei.version1.service.serviceImplemen;

// Para importar servicios
import org.springframework.beans.factory.annotation.Autowired;
// Servicio
import com.cacei.version1.service.EmailServicio;
// Mail
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.MimeMessageHelper;
import javax.mail.internet.MimeMessage;


@Service("emailServicio")
public class EmailServicioImpl implements EmailServicio {

	@Autowired
	private JavaMailSender mailSender;

	//@Async, le dice a Spring que corra asíncronamente, no espera a que se complete el envío del email, puede continuar con otras tareas
	@Async
	public void sendEmail(SimpleMailMessage email) {
		mailSender.send(email);
	}
}
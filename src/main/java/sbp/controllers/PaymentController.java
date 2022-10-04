package sbp.controllers;

import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sbp.exceptions.NotEnoughMoneyException;
import sbp.models.ErrorDetails;
import sbp.models.PaymentDetails;
import sbp.services.PaymentService;

@RestController
public class PaymentController {
	
	private final PaymentService paymentService;
	
	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
		
		
	}
	
	
	@PostMapping("/payment")
	public ResponseEntity<PaymentDetails> makePayment(){
		PaymentDetails paymentDetails = paymentService.processPayment();
		return ResponseEntity
				.status(HttpStatus.ACCEPTED)
				.body(paymentDetails);
		
	}
}
 
	
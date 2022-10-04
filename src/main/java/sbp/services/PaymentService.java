package sbp.services;

import org.springframework.stereotype.Service;

import sbp.exceptions.NotEnoughMoneyException;
import sbp.models.PaymentDetails;

@Service
public class PaymentService {
	
	public PaymentDetails processPayment() {
		throw new NotEnoughMoneyException();
	}
	

}

package org.jsadaoui.demo.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentResource {

	@Autowired
	@CreditCard @Visa
	private PaymentService visa;

	@Autowired
	@CreditCard @MasterCard
	private PaymentService masterCard;

	@Autowired
	@Paypal
	private PaymentService paypal;
	
	@RequestMapping("/visa")
	public String visa() {
		return "payment:" + visa;
	}
	
	@RequestMapping("/mastercard")
	public String masterCard() {
		return "payment:" + masterCard;
	}
	
	@RequestMapping("/paypal")
	public String paypal() {
		return "payment:" + paypal;
	}
}

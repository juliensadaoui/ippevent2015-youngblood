package org.jsadaoui.demo.payment;

import org.springframework.stereotype.Component;

@Component
@MasterCard
public class MasterCardPaymentService implements PaymentService {
	
	@Override
	public String toString() {
		return "mastercard";
	}
}

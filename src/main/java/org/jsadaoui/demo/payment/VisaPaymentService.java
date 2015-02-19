package org.jsadaoui.demo.payment;

import org.springframework.stereotype.Component;

@Component
@Visa
public class VisaPaymentService implements PaymentService {

	@Override
	public String toString() {
		return "visa";
	}
}

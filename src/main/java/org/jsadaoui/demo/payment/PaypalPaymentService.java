package org.jsadaoui.demo.payment;

import org.springframework.stereotype.Component;

@Component
@Paypal
public class PaypalPaymentService implements PaymentService {

	@Override
	public String toString() {
		return "paypal";
	}
}

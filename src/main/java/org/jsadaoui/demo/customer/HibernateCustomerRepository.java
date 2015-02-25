package org.jsadaoui.demo.customer;

import org.springframework.stereotype.Repository;

@Repository("hibernate")
public class HibernateCustomerRepository implements CustomerRepository {
	@Override
	public String toString() {
		return "hibernate";
	}
}

package org.jsadaoui.demo.customer;

import org.springframework.stereotype.Repository;

@Repository
public class JdbcCustomerRepository implements CustomerRepository {
	@Override
	public String toString() {
		return "jdbc";
	}
}

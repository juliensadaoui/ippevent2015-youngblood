package org.jsadaoui.demo.customer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("jpa")
public class JpaCustomerRepository implements CustomerRepository {
	@Override
	public String toString() {
		return "jpa";
	}
}

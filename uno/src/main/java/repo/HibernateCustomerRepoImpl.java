package repo;

import java.util.List;
import java.util.ArrayList;

import com.Customer;

public class HibernateCustomerRepoImpl implements HibernateCustomerRepo {

	/* (non-Javadoc)
	 * @see repo.HibernateCustomerRepo#findAll()
	 */
	public List<Customer> findAll() {

		List<Customer> customer = new ArrayList<>();
		Customer cust = new Customer();
		cust.setFirstName("David");
		cust.setLastName("Jones");
		customer.add(cust);
		return customer ;

	}
}

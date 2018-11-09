package service;
import com.Customer;
import java.util.*;

import repo.HibernateCustomerRepo;
import repo.HibernateCustomerRepoImpl;

public class CustomerServiceImpl implements CustomerService {
	private HibernateCustomerRepo repo =new HibernateCustomerRepoImpl();
	/* (non-Javadoc)
	 * @see service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		return repo.findAll();
	}

}

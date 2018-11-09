package repo;

import java.util.List;

import com.Customer;

public interface HibernateCustomerRepo {

	List<Customer> findAll();

}
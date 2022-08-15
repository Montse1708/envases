package org.generation.app.service;
import org.generation.app.entity.Customer;

import java.util.List;

public interface ICustomerService {
	/**
	 * Enlista todos los clientes de la base de datos
	 * @param customer
	 * @return Listado de clientes
	 */
	public List<Customer> findAllCustomers();
	/**
	 * Nos guarda el cliente en la base de datos
	 * @param customer Datos del cliente
	 * @return Devuelve el cliente con el Id asignado
	 */
	public Customer save(Customer customer);
	
	/**
	 * Elimina un cliente de la base de datos
	 * @param Id el identificador del cliente a eliminar
	 * @param id
	 */
	public void deleteCustomerById(Long id);
	
	/**
	 * Encontrar un cliente en la base de datos
	 * @param Id identificador del cliente a buscar
	 * @return
	 */
	public Customer findCustomerById(Long Id);
}

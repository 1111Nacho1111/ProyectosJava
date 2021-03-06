package utn.cursojava.sistemabancario.dao;

import java.util.List;

import utn.cursojava.sistemabancario.modelo.Cliente;

public interface IClienteDAO {

	public void agregarClienteDAO(Cliente cliente);
	public List<Cliente> listarClientesDAO();
	public void eliminarCliente(Integer dni);
	public void eliminarTodosClientes();
}

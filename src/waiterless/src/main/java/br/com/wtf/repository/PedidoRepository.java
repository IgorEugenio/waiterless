package br.com.wtf.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.wtf.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long> {
	public Pedido findByIdMesa(int idMesa);
}

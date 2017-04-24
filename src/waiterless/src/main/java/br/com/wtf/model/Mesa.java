package br.com.wtf.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mesa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private ArrayList<Pedido> listPedido = new ArrayList<>();
	private double total;
	
	public void addItemMesaPedido(Pedido pedido){
		this.listPedido.add(pedido);
		this.total+=pedido.getTotal();
	}
	public double getTotalMesa(){
		return total;
	}
	
}

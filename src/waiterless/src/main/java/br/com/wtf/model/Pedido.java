package br.com.wtf.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private ArrayList<Item> pedido = new ArrayList<>();
	private double total;
	private Long id_mesa;
	private boolean status = false; 
	
	public void addItemPedido(Item item,Long id_mesa){
		this.pedido.add(item);
		this.total+=item.getValor();
		this.id_mesa = id_mesa;
	}
	
	public double getTotal(){
		return total;
	}
	
	public boolean getStatus(){
		return status;
	}
	public void setStatus(boolean status){
		this.status = status;
	}
}

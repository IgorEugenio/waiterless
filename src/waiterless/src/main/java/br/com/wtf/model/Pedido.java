package br.com.wtf.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@OneToMany(mappedBy = "pedido")
	private ArrayList<Item> pedido = new ArrayList<>();
	private double total = 0;
	private int idMesa;
	private boolean status = false; 
	
	public void addItemPedido(Item item, int idMesa){
		this.pedido.add(item);
		this.total+=item.getValor();
		this.setIdMesa(idMesa);
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

	public int getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(int idMesa) {
		this.idMesa = idMesa;
	}
}

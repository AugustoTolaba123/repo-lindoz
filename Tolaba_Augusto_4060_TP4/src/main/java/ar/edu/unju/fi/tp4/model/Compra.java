package ar.edu.unju.fi.tp4.model;

import org.springframework.stereotype.Component;

@Component
public class Compra {
	
	private int id;
	private int cantidad;
	private double total;
	public Compra() {
		super();
	}
	
	
	
	
	
	
	
	
	public Compra(int id, int cantidad, double total) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.total = total;
	}








	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Compra [id=" + id + ", cantidad=" + cantidad + ", total=" + total + "]";
	}






}

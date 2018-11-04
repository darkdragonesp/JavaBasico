package es.arelance.banco;

import java.util.List;

public class Usuario {
	private String nombre;
	private String apellidos;
	private String dni;
	private int pinHash;
	private double saldo;
	private List<Movimiento> movimientos;
	
	public Usuario(String dni, Integer pin) {
		super();
		this.dni = dni;
		this.pinHash = pin.hashCode();
	}
	public void modificarPin(Integer pin) {
		this.pinHash=pin.hashCode();
	}
	public boolean pinIsValid(Integer pin) {
		return pin.hashCode()==this.pinHash;
	}
	public double ingresar(double ingreso) {
		this.saldo+=ingreso;
		return this.saldo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getPinHash() {
		return pinHash;
	}

	public void setPinHash(int pinHash) {
		this.pinHash = pinHash;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getDni() {
		return dni;
	}

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos
				+ ", dni=" + dni + ", saldo=" + saldo + ", movimientos="
				+ movimientos + "]";
	}
	
	
}

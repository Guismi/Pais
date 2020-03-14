
	package model;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class Pais {

	private int id;
	private String nome;
	private int populacao;
	private double area;

	static {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
	throw new RuntimeException(e);
	}
	}

	public Pais() {
	super();
	}

	public int getId() {
	return id;
	}

	public void setId(int id) {
	this.id = id;
	}

	public String getNome() {
	return nome;
	}

	public void setNome(String nome) {
	this.nome = nome;
	}

	public int getPopulacao() {
	return populacao;
	}

	public void setPopulacao(int populacao) {
	this.populacao = populacao;
	}

	public double getArea() {
	return area;
	}

	public void setArea(Double area) {
	this.area = area;
	}

	@Override
	public String toString() {
	return "Pais [id=" + id + ", nome=" + nome + ", populacao=" + populacao +", area=" + area +"]";

	}


	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	Pais other = (Pais) obj;
	if (Double.doubleToLongBits(area) !=

	Double.doubleToLongBits(other.area))
	return false;
	if (id != other.id)
	return false;
	if (nome == null) {
	if (other.nome != null)
	return false;
	} else if (!nome.equals(other.nome))

	return false;
	if (populacao != other.populacao)
	return false;
	return true;
	}

	}


package br.com.fiap.si.managebean;

import javax.faces.bean.ManagedBean;

import br.com.fiap.si.bo.Calculadora;

@ManagedBean
public class HelloBean {

	private Double n1;
	private Double n2;
	private String op;

	public Double getN1() {
		return n1;
	}

	public void setN1(Double n1) {
		this.n1 = n1;
	}

	public Double getN2() {
		return n2;
	}

	public void setN2(Double n2) {
		this.n2 = n2;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	// Propriedades de Saida (plceholder)

	private String resultado;
	private String erro;

	public String getResultado() {
		return resultado;
	}

	public String getErro() {
		return erro;
	}

	// Metodo action controller

	public String calcular() {
		Calculadora bo = new Calculadora();
		
		try {
			resultado = bo.calcularFormato(n1, n2, op);
			return "sucesso";
		} catch (Exception e) {
			// TODO: handle exception
			erro = e.getMessage();
			return "erro";
		}
		
		
	}

}

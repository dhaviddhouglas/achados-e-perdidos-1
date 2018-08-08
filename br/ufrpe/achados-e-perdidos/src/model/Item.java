package model;

import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;

public class Item implements Serializable{
	
	//atributos
	private int id = 1;
	private String tipo;
	private String cor;
	private String descricao;
	private String categoria;
	private int quantidade;
	private boolean achado;
	private boolean perdido;
	private boolean devolvido;
	private Departamento departamento;
	private Aluno aluno;
	private String obs;
	private Date data;

	
	
	ArrayList nome = new ArrayList();


	//getters e setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public boolean isAchado() {
		return achado;
	}


	public void setAchado(boolean achado) {
		this.achado = achado;
	}


	public boolean isPerdido() {
		return perdido;
	}


	public void setPerdido(boolean perdido) {
		this.perdido = perdido;
	}


	public boolean isDevolvido() {
		return devolvido;
	}


	public void setDevolvido(boolean devolvido) {
		this.devolvido = devolvido;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public String getObs() {
		return obs;
	}


	public void setObs(String obs) {
		this.obs = obs;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public ArrayList getNome() {
		return nome;
	}


	public void setNome(ArrayList nome) {
		this.nome = nome;
	}


	//tostring
	@Override
	public String toString() {
		return "Item [id=" + id + ", cor=" + cor + ", descricao=" + descricao + ", quantidade=" + quantidade
				+ ", achado=" + achado + ", perdido=" + perdido + ", devolvido=" + devolvido + ", departamento="
				+ departamento + ", aluno=" + aluno + ", obs=" + obs + ", data=" + data + ", nome=" + nome + "]";
	}


	//hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (achado ? 1231 : 1237);
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + (devolvido ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((obs == null) ? 0 : obs.hashCode());
		result = prime * result + (perdido ? 1231 : 1237);
		result = prime * result + quantidade;
		return result;
	}


	//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (achado != other.achado)
			return false;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (departamento == null) {
			if (other.departamento != null)
				return false;
		} else if (!departamento.equals(other.departamento))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (devolvido != other.devolvido)
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (obs == null) {
			if (other.obs != null)
				return false;
		} else if (!obs.equals(other.obs))
			return false;
		if (perdido != other.perdido)
			return false;
		if (quantidade != other.quantidade)
			return false;
		return true;
	
	}
	
	
	//incremeta id, ele a cada intera��o do cadastro incrimenta o id da intera��o anterios em mais 1
	public int incrementaId()
	{
		return this.id + 1;
	}
	
	
	//cadatra o item
	public boolean cadastrarItem(Item item){
		this.tipo = item.tipo;
		this.cor = item.cor;
		this.quantidade = item.quantidade;
		this.departamento = item.departamento;
		this.aluno = item.aluno;
		this.descricao = item.descricao;
		if(item.perdido == true)
		{
			this.setCategoria("Perdido");
			item.achado = false;
		}
		else {
			this.setCategoria("Achado");
			item.achado = true;
		} 
		this.perdido = item. perdido;
		this.achado = item.achado;
		this.data = item.data;
		this.id = item.id;
		return true;
	}
	
	
	//mostrat o status do item
	public String status()
	{
		String temp; 
		if(this.perdido == true) {
			temp = "--Objeto Perdido--"+"\n"+"Tipo: "+ this.tipo +"\n" + "Cor: "+this.cor+"\n"+"Quantidade: "+this.quantidade+"\n"+"Descricao: "+this.descricao+"\n"+"ID: "+this.id+"\n\n";
			return temp;
		}
		else {
			temp = "--Objeto Achado--"+"\n"+"Tipo: "+ this.tipo +"\n" + "Cor: "+this.cor+"\n"+"Quantidade: "+this.quantidade+"\n"+"Descricao: "+this.descricao+"\n"+"ID: "+this.id+"\n\n";
			return temp;	
		}
		
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}


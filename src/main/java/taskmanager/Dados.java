package taskmanager;

import java.util.Date;

public class Dados {
	
	  
	  private String titulo;
	  private String descricao;
	  private String responsavel;
	  private String priority;
	  private Date dataLimite;
	  
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	public Date getDataLimite() {
		return dataLimite;
	}
	public void setDataLimite(Date dataLimite) {
		this.dataLimite = dataLimite;
	}

		
	
		public Dados(String titulo, String descricao, String responsavel, String priority, Date dataLimite) {
		super();
			this.titulo = titulo;
			this.descricao = descricao;
			this.responsavel = responsavel;
			this.priority = priority;
			this.dataLimite = dataLimite;
		}
			
		public Dados() {
			super();
			this.titulo = "";
			this.descricao = "";
			this.responsavel = "";
			this.priority = "";
			this.dataLimite = dataLimite;
		}
	}
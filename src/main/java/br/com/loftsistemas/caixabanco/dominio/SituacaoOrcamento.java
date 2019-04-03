/**
 * @author Dulcidio Sobrinho
 * 27/01/2019
 */
package br.com.loftsistemas.caixabanco.dominio;

/**
 * @author Dulcidio Sobrinho
 *
 */
public enum SituacaoOrcamento {
	
	OK("Orçamento Ok"),
	CANCELADO("Orçamento Cancelado");
	
	private String situacao;
	
	SituacaoOrcamento(String situacao){
		this.situacao=situacao;
	}

	 public String getSituacao(){
		 return situacao;
	 }
}

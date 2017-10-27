package br.sceweb.data_builder;

import org.apache.log4j.Logger;

import br.sceweb.modelo.Empresa;


public class ObtemEmpresa {
	static Logger logger = Logger.getLogger(ObtemEmpresa.class);

	public static Empresa comDadosValidos(){
		Empresa empresa = new Empresa();
		try{
		empresa.setNomeDaEmpresa("Empresa JS");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("Open Informatica");
		empresa.setEndereco("rua taquari");
		empresa.setTelefone("2222");
		empresa.setResponsavel("jose");
		empresa.setTelefoneResponsavel("(011) 3344-5566");
		empresa.setSetor("contabilidade");
		empresa.setEmail("jose@gmail.com");
		} catch(Exception e){
			logger.info("erro classe obtem empresa = " + e.getMessage());
		}
		return empresa;
	}
//	public static Empresa comCNPJ_invalido(){
//		Empresa empresa = comDadosValidos();
//		empresa.setCnpj("8942423200018");
//		return empresa;
//	}
}
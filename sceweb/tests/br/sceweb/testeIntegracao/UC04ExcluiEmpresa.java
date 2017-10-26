package br.sceweb.testeIntegracao;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.data_builder.ObtemEmpresa;
import br.sceweb.modelo.DAOFactory;
import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.IEmpresaDAO;


public class UC04ExcluiEmpresa {
    
	static IEmpresaDAO empresaDAO;
	static Empresa empresa;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = DAOFactory.getDAOFactory(DAOFactory.MYSQL).getEmpresaDAO();
		empresa = ObtemEmpresa.comDadosValidos();
		empresaDAO.adiciona(empresa);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01UC03ExcluirEmpresa_com_sucesso() {
		assertEquals(1, empresaDAO.exclui("89424232000180"));
	}


}

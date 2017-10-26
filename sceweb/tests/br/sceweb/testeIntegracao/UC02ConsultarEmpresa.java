package br.sceweb.testeIntegracao;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import br.sceweb.data_builder.ObtemEmpresa;
import br.sceweb.modelo.DAOFactory;
import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.IEmpresaDAO;



public class UC02ConsultarEmpresa {
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
		empresaDAO.exclui("89424232000180");
	}

	@Test
	public void CT01UC02ConsultarEmpresa_com_sucesso() {
		assertNotNull(empresaDAO.consultaEmpresa("89424232000180"));
	}
	@Test
	public void CT02UC02ConsultarEmpresa_com_sucesso() {
		assertTrue(empresa.equals(empresaDAO.consultaEmpresa("89424232000180")));
		
	}
	@Test
	public void CT02UC02ConsultarEmpresa_com_cnpj_invalido() {
		assertNull(empresaDAO.consultaEmpresa("8942423200018"));
	}

}
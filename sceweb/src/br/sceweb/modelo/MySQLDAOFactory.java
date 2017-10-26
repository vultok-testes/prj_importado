package br.sceweb.modelo;

//MySQL concrete DAO Factory implementation
import java.sql.*;

import br.sceweb.servico.FabricaDeConexoes;

public class MySQLDAOFactory extends DAOFactory {
	

	/**
	 * A chamada para o construtor default de FabricaDeConexoes() obtem uma conexao 
	 * o db remoto
	 * @return - uma conexao
	 */
	public static Connection createConnection() {
		return new FabricaDeConexoes().getConnection();
	}

	public IConvenioDAO getConvenioDAO() {
		
		return new MySQLConvenioDAO();
	}

	public IEmpresaDAO getEmpresaDAO() {
		
		return new MySQLEmpresaDAO();
	}

}
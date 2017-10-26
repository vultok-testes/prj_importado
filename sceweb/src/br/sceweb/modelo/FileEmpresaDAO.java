package br.sceweb.modelo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.apache.log4j.Logger;

public class FileEmpresaDAO implements IEmpresaDAO {
	String fileName = "C://temp//empresa";
	Logger logger = Logger.getLogger("FileEmpresaDAO.class");
	public FileEmpresaDAO(){
		
	}
	
	public FileEmpresaDAO(String path){
		fileName = path;
	}

	@Override
	public int adiciona(Empresa empresa) {
		ObjectOutputStream objectOut;
		try {
			objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
			objectOut.writeObject(empresa);
			objectOut.close();
		} catch (FileNotFoundException e) {
			logger.error(e.getMessage());
			return 0;
			
		} catch (IOException e) {
			logger.error(e.getMessage());
			return 0;
		}			
	
		return 1;
	}

	@Override
	public int exclui(String cnpj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Empresa consultaEmpresa(String cnpj) {
		// TODO Auto-generated method stub
		return null;
	}

}

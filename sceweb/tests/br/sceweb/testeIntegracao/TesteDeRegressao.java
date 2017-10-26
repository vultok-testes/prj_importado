package br.sceweb.testeIntegracao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ UC01CadastrarEmpresa.class, UC02ConsultarEmpresa.class, UC04ExcluiEmpresa.class })
public class TesteDeRegressao {

}

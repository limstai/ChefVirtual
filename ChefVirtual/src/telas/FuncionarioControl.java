package telas;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.stage.Stage;

public class FuncionarioControl {
	private StringProperty nome = new SimpleStringProperty("");
	private StringProperty sobrenome = new SimpleStringProperty("");
	private StringProperty cpf = new SimpleStringProperty("");
	private StringProperty email = new SimpleStringProperty("");
	private StringProperty senha = new SimpleStringProperty("");
	
	public Funcionario boundaryToFuncionario() {
		Funcionario cadfun = new Funcionario();
		cadfun.setNome(nome.get());
		cadfun.setSobrenome(sobrenome.get());
		cadfun.setCpf(cpf.get());
		cadfun.setEmail(email.get());
		cadfun.setSenha(senha.get());
		return cadfun;
	}
	public void FuncionarioBoundary(Funcionario cadfun) {
		if (cadfun != null) {
			nome.set(cadfun.getNome());
			sobrenome.set(cadfun.getSobrenome());
			cpf.set(cadfun.getCpf());
			email.set(cadfun.getEmail());
			senha.set(cadfun.getSenha());
		}
				
	}
	
	public void cadastrar() {
		LoginFunBoundary lf = new LoginFunBoundary();
		try {
			FuncionarioBoundary.getStage().close();
			lf.start(new Stage());			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

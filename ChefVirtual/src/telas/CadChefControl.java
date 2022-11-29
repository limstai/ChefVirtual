package telas;

import java.time.LocalDate;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.stage.Stage;

public class CadChefControl {
	private StringProperty nome = new SimpleStringProperty("");
	private StringProperty sobrenome = new SimpleStringProperty("");
	private StringProperty cpf = new SimpleStringProperty("");
	private StringProperty email = new SimpleStringProperty("");
	private StringProperty senha = new SimpleStringProperty("");
	private StringProperty certificado = new SimpleStringProperty("");	
	private ObjectProperty<LocalDate> nascimento = new SimpleObjectProperty<>(LocalDate.now());


	public CadChef boundaryToCadChef() {
		CadChef cadchef = new CadChef();
		cadchef.setNome(nome.get());
		cadchef.setSobrenome(sobrenome.get());
		cadchef.setCpf(cpf.get());
		cadchef.setNascimento(nascimento.get());
		cadchef.setEmail(email.get());
		cadchef.setSenha(senha.get());
		cadchef.setCertificado(certificado.get());
		return cadchef;
	}
	public void CadChefToBoundary(CadChef cadchef) {
		if (cadchef != null) {
			nome.set(cadchef.getNome());
			sobrenome.set(cadchef.getSobrenome());
			cpf.set(cadchef.getCpf());
			nascimento.set(cadchef.getNascimento());
			email.set(cadchef.getEmail());
			senha.set(cadchef.getSenha());
		}
	}
	public void clearBoundary() {
		CadChef cadchef = new CadChef();
		CadChefToBoundary(cadchef);
					
	}

	public void cadastrar() {
		LoginBoundary lg = new LoginBoundary();
		try {
			CadChefBoundary.getStage().close();
			lg.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void cadastroComum() {
		CadcomumBoundary cdc = new CadcomumBoundary();

		try {
			CadChefBoundary.getStage().close();
			cdc.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	public void cadastroRestaurante() {
		CadRestauranteBoundary cdr = new CadRestauranteBoundary();
		try {
			CadChefBoundary.getStage().close();
			cdr.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public StringProperty nomeProperty() {
		return this.nome;
	}
	public StringProperty sobrenomeProperty() {
		return this.sobrenome;
	}
	public StringProperty userProperty() {
		return this.cpf;
	}
	public StringProperty senhaProperty() {
		return this.senha;
	}		
	public StringProperty emailProperty() {
		return this.email;
	}
	public StringProperty certificadoProperty() {
		return this.certificado;
	}
	public ObjectProperty<LocalDate> nascimentoProperty() {
		return this.nascimento;
	}
}



	
	
	


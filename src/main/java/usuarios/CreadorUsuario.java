package usuarios;

import organizacion.Organizacion;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class CreadorUsuario {
	private String usuario;
	private String contrasenia;
	
	// private int totalAttempts = 3;
	
	private AccountFieldValidation validator = new AccountFieldValidation();

	public String getUsuario() {
		return usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}
		
	public Usuario crearUsuario(String newUser, String newPassword, String tipoUsuario, Organizacion organizacion) throws FileNotFoundException, ClassNotFoundException, CreationError, SQLException {
		if(!validator.validateUser(newUser)) throw new CreationError("El usuario no cumple los requisitos.");
		if(!validator.validatePassword(newPassword)) throw new CreationError("La password no cumple los requisitos.");
		if(validator.weakPassword(newPassword)) throw new CreationError("La password es demasiado debil. Por favor, elija otra.");
		
		if(tipoUsuario == "admin") {
			return new UsuarioAdministrador(newUser, newPassword, organizacion, true);
		} else if (tipoUsuario == "estandard"){
			return new UsuarioEstandard(newUser, newPassword, organizacion, true);
		}else {
			throw new CreationError("No reconozco el tipo de usuario");
		}

	}
	
	
	
	
	
	
	/*
	public CreadorUsuario(String NewUser, String NewPassword) throws CreationError, FileNotFoundException, ClassNotFoundException, SQLException {
		if(!validator.validateUser(NewUser)) throw new CreationError("El usuario no cumple los requisitos.");
		if(!validator.validatePassword(NewPassword)) throw new CreationError("La password no cumple los requisitos.");
		if(validator.weakPassword(NewPassword)) throw new CreationError("La password es demasiado debil. Por favor, elija otra.");
		
		this.usuario = NewUser;
		this.contrasenia = NewPassword;
	} */
	
	/*
	public void ExecuteLogin(String tempUser, String tempPass) throws AttemptError {
		
		//String tempUser;
		//String tempPass;
		
		if(totalAttempts != 0) {
			if(usuario.equals(tempUser) && contrasenia.equals(tempPass)) {
				System.out.println("Successfully Logged In!");
			} else {
				System.out.println("El usuario y/o contrase�a no coinciden.");
				totalAttempts--;
			}
		} else {
			throw new AttemptError("Has alcanzado el maximo numero de intentos. Por favor, intente m�s tarde.");
		}
	}
	*/
	
}
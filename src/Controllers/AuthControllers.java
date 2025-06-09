package Controllers;

import Views.AuthView;

public class AuthControllers {
	
	private AuthView vista;

	public AuthControllers() {
		
		vista = new AuthView();		
	}
	public void Inicio() {
		
		vista.Inicio();
	}
	public void Login() {
		vista.Login();
	}
	public void Registro() {
		vista.Registro();
	}
	

}

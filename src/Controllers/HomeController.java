package Controllers;

import Models.Cliente;
import Views.HomeView;
import Views.UsersView;

public class HomeController {
	
	private HomeView vista;

	public HomeController() {
		
		vista = new HomeView();
		
	}
	public void Menu() {
		vista.Menu();
	}
	public void PanelHabitaciones1() {
		vista.PanelHabitaciones1();
	}
	public void Clientes() {
		vista.Clientes();
	}
	public void Rentas() {
		vista.Rentas();
	}
	public void TiposHabitacion() {
		vista.TiposHabitacion();
	}
	public void Tarifas() {
		vista.Tarifas();
	}
	public void DatosUsuario(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
	public void EditarTarifa(int idTarifa) {
	    UsersView uv = new UsersView();
	    uv.EditarTarifa(idTarifa); 
	}


}

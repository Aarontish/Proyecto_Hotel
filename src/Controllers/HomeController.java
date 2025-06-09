package Controllers;

import Views.HomeView;

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


}

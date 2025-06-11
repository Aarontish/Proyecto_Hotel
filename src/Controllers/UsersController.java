package Controllers;


import Models.Cliente;
import Models.Habitacion;
import Views.AuthView;
import Views.HomeView;
import Views.UsersView;

public class UsersController {
	
	private UsersView vista;
	

	public void Clientes() {
	    new HomeView().Clientes(); 
	}
	public void Tarifas() {
	    new HomeView().Tarifas(); 
	}


	public UsersController() {
		vista = new UsersView();
	}
	
	public void PanelHabitaciones3() {
		vista.PanelHabitaciones3();
	}
	
	public void PanelHabitaciones2() {
		vista.PanelHabitaciones2();
	}
	
	/*public void DetallesHabitacion1() {
		vista.DetallesHabitacion1();
	}*/
	
	public void DetallesHabitacion2(Habitacion habitacion) {
	    new UsersView().DetallesHabitacion2(habitacion);
	}

	
	public void ClientesEliminar() {
		vista.ClientesEliminar();
	}
	
	public void DatosUsuario(Cliente cliente) {
	    vista.DatosUsuario(cliente);
	}

	
	public void EditarDatosCliente(Cliente cliente) {
	    vista.EditarDatosCliente(cliente);
	}

	
	public void CrearNuevoCliente() {
		vista.CrearNuevoCliente();
	}
	
	public void DatosRenta() {
		vista.DatosRenta();
	}
	
	public void DatosRenta2() {
		vista.DatosRenta2();
	}
	
	public void RentasModificarReserva() {
		vista.RentasModificarReserva();
	}
	
	public void DetallesHabitacion4() {
		vista.DetallesHabitacion4();
	}
	
	public void DetallesFamiliar() {
		vista.DetallesFamiliar();
	}
	
	public void EliminarTipodeHabitacion() {
		vista.EliminarTipodeHabitacion();
	}
	
	public void CrearTipoHabitacion() {
		vista.CrearTipoHabitacion();
	}
	
	public void EditarHabitacion() {
		vista.EditarHabitacion();
	}
	
	public void CrearTarifa() {
		vista.CrearTarifa();
	}
	
	public void HabitacionNoEncontrada() {
		vista.HabitacionNoEncontrada();
	}
	
	public void ClienteNoEncontrado() {
		vista.ClienteNoEncontrado();
	}


	public void Crear_habitaciones() {
		vista.Crear_habitaciones();
	}
	
	public void DetallesHabitacion1(Habitacion habitacion) {
	    new UsersView().DetallesHabitacion1(habitacion);
	}
	
	public void EditarTarifa() {
		vista.EditarTarifa();
	}
}

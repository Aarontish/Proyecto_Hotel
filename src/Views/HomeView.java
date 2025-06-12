package Views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import com.formdev.flatlaf.FlatLightLaf;

import Controllers.HomeController;
import Controllers.UsersController;
import Models.Cliente;
import Models.ConectionModel;
import Models.Habitacion;
import Models.Tarifa;
import Models.UsersModel;
import Models.Cliente;


public class HomeView {
	
	public class UsersView {
	    DefaultTableModel tableModel;
	    JTable tableTarifas;
	    
	    public void Tarifas() {   
	    }

		public void DatosUsuario(Cliente cliente) {		
		}
		
	}

	public HomeView() {
	}
	

	public void Menu() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("Button.arc", 90); // Esquinas redondas
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1180, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel(); // Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel(); // Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JButton btnTiposDeHabitaciones = new JButton("<html>Tipos de habitaciones &#8594;</html>");
		btnTiposDeHabitaciones.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeHabitaciones.setForeground(new Color(255, 255, 255));
		btnTiposDeHabitaciones.setBackground(new Color(56, 54, 41));
		btnTiposDeHabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnTiposDeHabitaciones.setBounds(974, 0, 180, 23);
		btnTiposDeHabitaciones.setBorderPainted(false);
		btnTiposDeHabitaciones.setFocusPainted(false);
		btnTiposDeHabitaciones.setContentAreaFilled(true);
		btnTiposDeHabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.TiposHabitacion();

			}
		});
		panel_2.add(btnTiposDeHabitaciones);

		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); // Botón superior rentas
		btnrentas.setForeground(Color.WHITE);
		btnrentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnrentas.setFocusPainted(false);
		btnrentas.setContentAreaFilled(true);
		btnrentas.setBorderPainted(false);
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		btnrentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomeController hc = new HomeController();
				hc.Rentas();
			}
		});
		panel_2.add(btnrentas);

		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); // Botón superior clientes
		btnclientes.setForeground(Color.WHITE);
		btnclientes.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnclientes.setFocusPainted(false);
		btnclientes.setContentAreaFilled(true);
		btnclientes.setBorderPainted(false);
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);
		btnclientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Clientes();

			}
		});
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); // Botón superior habitaciones
		btnhabitaciones.setForeground(Color.WHITE);
		btnhabitaciones.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnhabitaciones.setFocusPainted(false);
		btnhabitaciones.setContentAreaFilled(true);
		btnhabitaciones.setBorderPainted(false);
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		btnhabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomeController hc = new HomeController();
				hc.PanelHabitaciones1();

			}
		});

		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); // Botón superior tarifas
		btntarifas.setForeground(Color.WHITE);
		btntarifas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btntarifas.setFocusPainted(false);
		btntarifas.setContentAreaFilled(true);
		btntarifas.setBorderPainted(false);
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		btntarifas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomeController hc = new HomeController();
				hc.Tarifas();
			}
		});
		panel_2.add(btntarifas);

		JLabel logo = new JLabel(""); // Logo
		logo.setBounds(0, 0, 170, 95);
		// CORRECCIÓN: Usar getResource para cargar la imagen
		ImageIcon icon2 = new ImageIcon(getClass().getResource("/Images/logo.png"));
		Image imagen2 = icon2.getImage().getScaledInstance(170, 95, Image.SCALE_SMOOTH);
		logo.setIcon(new ImageIcon(imagen2));
		panel_1.add(logo);

		JLabel Titulo = new JLabel("Bienvenidos"); // Titulo
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 410, 73);
		panel_1.add(Titulo);

		JLabel menuTitulo = new JLabel("Menú:"); // Texto menú
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 38));
		menuTitulo.setBounds(60, 131, 144, 56);
		panel.add(menuTitulo);

		JPanel panel_3 = new JPanel(); // Recuadro al fondo de los botones
		panel_3.setBackground(new Color(56, 54, 41));
		panel_3.setBounds(60, 190, 660, 360);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JButton botonPanelDeHabitaciones = new JButton(
				"<html><div style='text-align:center;'>Panel de Habitaciones<br><br></div></html>"); // Botón panel de
																										// //
																										// habitaciones
		botonPanelDeHabitaciones.setFont(new Font("Jost*", Font.BOLD, 16));
		botonPanelDeHabitaciones.setBackground(new Color(255, 214, 10));
		botonPanelDeHabitaciones.setBounds(22, 10, 125, 150);
		botonPanelDeHabitaciones.setVerticalTextPosition(SwingConstants.BOTTOM); // Para poner texto debajo de la imagen
																					// // dentro del botón
		botonPanelDeHabitaciones.setHorizontalTextPosition(SwingConstants.CENTER);
		botonPanelDeHabitaciones.setHorizontalAlignment(SwingConstants.CENTER);
		botonPanelDeHabitaciones.setVerticalAlignment(SwingConstants.CENTER);
		botonPanelDeHabitaciones.setIconTextGap(1);
		// CORRECCIÓN: Usar getResource para cargar la imagen
		ImageIcon icon121 = new ImageIcon(getClass().getResource("/Images/cama_individual.png"));
		Image imagen121 = icon121.getImage().getScaledInstance(70, 80, Image.SCALE_SMOOTH);
		botonPanelDeHabitaciones.setIcon(new ImageIcon(imagen121));
		botonPanelDeHabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		botonPanelDeHabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomeController hc = new HomeController();
				hc.PanelHabitaciones1();

			}
		});
		panel_3.add(botonPanelDeHabitaciones);

		JButton botonClientes = new JButton("Clientes"); // Botón de clientes
		botonClientes.setFont(new Font("Jost*", Font.BOLD, 16));
		botonClientes.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		botonClientes.setBackground(new Color(255, 214, 10));
		botonClientes.setBounds(182, 10, 125, 150);
		botonClientes.setVerticalTextPosition(SwingConstants.BOTTOM); // Para poner texto debajo de la imagen dentro del
																		// botón
		botonClientes.setHorizontalTextPosition(SwingConstants.CENTER);
		botonClientes.setHorizontalAlignment(SwingConstants.CENTER);
		botonClientes.setVerticalAlignment(SwingConstants.CENTER);
		botonClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Clientes();

			}
		});
		botonClientes.setIconTextGap(1);
		// CORRECCIÓN: Usar getResource para cargar la imagen
		ImageIcon s1 = new ImageIcon(getClass().getResource("/Images/clientes.png"));
		Image s2 = s1.getImage();
		Image s3 = s2.getScaledInstance(65, 60, Image.SCALE_SMOOTH);
		botonClientes.setIcon(new ImageIcon(s3));
		botonClientes.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		panel_3.add(botonClientes);

		JButton botonRentas = new JButton("Rentas"); // Botón de rentas
		botonRentas.setFont(new Font("Jost*", Font.BOLD, 16));
		botonRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		botonRentas.setBackground(new Color(255, 214, 10));
		botonRentas.setBounds(347, 10, 125, 150);
		botonRentas.setVerticalTextPosition(SwingConstants.BOTTOM); // Para poner texto debajo de la imagen dentro del
																	// botón
		botonRentas.setHorizontalTextPosition(SwingConstants.CENTER);
		botonRentas.setHorizontalAlignment(SwingConstants.CENTER);
		botonRentas.setVerticalAlignment(SwingConstants.CENTER);
		botonRentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Aquí podrías abrir la ventana de Rentas
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Rentas();
			}
		});
		botonRentas.setIconTextGap(1);
		// CORRECCIÓN: Usar getResource para cargar la imagen
		ImageIcon icon112 = new ImageIcon(getClass().getResource("/Images/renta.png"));
		Image imagen112 = icon112.getImage().getScaledInstance(70, 80, Image.SCALE_SMOOTH);
		botonRentas.setIcon(new ImageIcon(imagen112));
		panel_3.add(botonRentas);

		JButton botonTiposDeHabitaciones = new JButton(
				"<html><div style='text-align:center;'>Tipos de Habitaciones<br><br></div></html>"); // Botón tipos de
																										// // habitación
		botonTiposDeHabitaciones.setFont(new Font("Jost*", Font.BOLD, 16));
		botonTiposDeHabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		botonTiposDeHabitaciones.setBackground(new Color(255, 214, 10));
		botonTiposDeHabitaciones.setBounds(512, 10, 125, 150);
		botonTiposDeHabitaciones.setVerticalTextPosition(SwingConstants.BOTTOM); // Para poner texto debajo de la imagen
																					// // dentro del botón
		botonTiposDeHabitaciones.setHorizontalTextPosition(SwingConstants.CENTER);
		botonTiposDeHabitaciones.setHorizontalAlignment(SwingConstants.CENTER);
		botonTiposDeHabitaciones.setVerticalAlignment(SwingConstants.CENTER);
		botonTiposDeHabitaciones.setIconTextGap(1);
		// Asigna un ícono exclusivo a botonTiposDeHabitaciones
		ImageIcon iconTiposHabitaciones = new ImageIcon(getClass().getResource("/Images/cama_doble.png"));
		Image imagenTiposHabitaciones = iconTiposHabitaciones.getImage().getScaledInstance(70, 80, Image.SCALE_SMOOTH);
		botonTiposDeHabitaciones.setIcon(new ImageIcon(imagenTiposHabitaciones));
		botonTiposDeHabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.TiposHabitacion();

			}
		});
		panel_3.add(botonTiposDeHabitaciones);

		JButton botonTarifas = new JButton("Tarifas"); // Botón de tarifas
		botonTarifas.setFont(new Font("Jost*", Font.BOLD, 16));
		botonTarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		botonTarifas.setBackground(new Color(255, 214, 10));
		botonTarifas.setBounds(22, 199, 125, 150);
		botonTarifas.setVerticalTextPosition(SwingConstants.BOTTOM); // Para poner texto debajo de la imagen dentro del
																		// // botón
		botonTarifas.setHorizontalTextPosition(SwingConstants.CENTER);
		botonTarifas.setHorizontalAlignment(SwingConstants.CENTER);
		botonTarifas.setVerticalAlignment(SwingConstants.CENTER);
		botonTarifas.setIconTextGap(1);
		// CORRECCIÓN: Usar getResource para cargar la imagen
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/Images/tarifa_por_hora.png"));
		Image imagen1 = icon1.getImage().getScaledInstance(50, 60, Image.SCALE_SMOOTH);
		botonTarifas.setIcon(new ImageIcon(imagen1));
		botonTarifas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Tarifas();

			}
		});
		panel_3.add(botonTarifas);

		JLabel decoracion = new JLabel(""); // imagen junto al menú
		decoracion.setBounds(730, 150, 424, 400);
		// CORRECCIÓN: Usar getResource para cargar la imagen
		ImageIcon icon12 = new ImageIcon(getClass().getResource("/Images/decoracion.png"));
		Image imagen12 = icon12.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
		decoracion.setIcon(new ImageIcon(imagen12));
		panel.add(decoracion);

		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public void PanelHabitaciones1() {

		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("Button.arc", 90); // Esquinas redondas
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1180, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel(); // Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel(); // Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel logo = new JLabel(""); // Logo
		logo.setBounds(0, 0, 170, 95);
		ImageIcon icon423 = new ImageIcon(getClass().getResource("/Images/logo.png"));
		Image imagen423 = icon423.getImage().getScaledInstance(170, 95, Image.SCALE_SMOOTH);
		logo.setIcon(new ImageIcon(imagen423));
		panel_1.add(logo);

		JLabel Titulo = new JLabel("Panel de Habitaciones"); // Titulo
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 410, 73);
		panel_1.add(Titulo);

		JLabel menuTitulo = new JLabel("Habitaciones:"); // Texto menú
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 38));
		menuTitulo.setBounds(131, 126, 283, 56);
		panel.add(menuTitulo);
		
		JButton botonVolver = new JButton(""); // Boton para volver atrás
		botonVolver.setBounds(60, 132, 36, 36);
		botonVolver.setForeground(new Color(255, 255, 255));
		botonVolver.setBackground(new Color(255, 255, 255));
		botonVolver.setBorderPainted(false);
		botonVolver.setFocusPainted(false);
		botonVolver.setContentAreaFilled(true);
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Menu();
			}
		});
		ImageIcon icon2006 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
		Image imagen2006 = icon2006.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
		botonVolver.setIcon(new ImageIcon(imagen2006));
		panel.add(botonVolver);

		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); // Botón superior tipos de
																								// habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnTiposDeRentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.TiposHabitacion();
			}
		});
		btnTiposDeRentas.setBounds(974, 0, 180, 23);
		btnTiposDeRentas.setBorderPainted(false);
		btnTiposDeRentas.setFocusPainted(false);
		btnTiposDeRentas.setContentAreaFilled(true);
		panel_2.add(btnTiposDeRentas);

		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); // Botón superior rentas
		btnrentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Rentas();
			}
		});
		btnrentas.setForeground(Color.WHITE);
		btnrentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnrentas.setFocusPainted(false);
		btnrentas.setContentAreaFilled(true);
		btnrentas.setBorderPainted(false);
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);

		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); // Botón superior clientes
		btnclientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Clientes();
			}
		});
		btnclientes.setForeground(Color.WHITE);
		btnclientes.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnclientes.setFocusPainted(false);
		btnclientes.setContentAreaFilled(true);
		btnclientes.setBorderPainted(false);
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);

		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); // Botón superior habitaciones
//		btnhabitaciones.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose(); // Cierra la ventana actual del menú
//				PanelHabitaciones1 conexion = new PanelHabitaciones1();
//				conexion.frame.setVisible(true); 
//			}
//		});
		btnhabitaciones.setForeground(Color.WHITE);
		btnhabitaciones.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnhabitaciones.setFocusPainted(false);
		btnhabitaciones.setContentAreaFilled(true);
		btnhabitaciones.setBorderPainted(false);
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);

		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); // Botón superior tarifas
		btntarifas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Tarifas();
			}
		});
		btntarifas.setForeground(Color.WHITE);
		btntarifas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btntarifas.setFocusPainted(false);
		btntarifas.setContentAreaFilled(true);
		btntarifas.setBorderPainted(false);
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);


		final boolean[] modoEliminar = {false};
	
		JButton btnEliminarHabitacion = new JButton("Eliminar habitación");
		btnEliminarHabitacion.setBackground(new Color(239, 35, 60));
		btnEliminarHabitacion.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnEliminarHabitacion.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnEliminarHabitacion.setForeground(Color.WHITE);
		btnEliminarHabitacion.setBounds(131, 193, 280, 40);
		btnEliminarHabitacion.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        modoEliminar[0] = true;
		        JOptionPane.showMessageDialog(null, " Modo eliminar activado. Selecciona una habitación.");
		    }
		});
		panel.add(btnEliminarHabitacion);

		
		JButton btncrearhabitaciones = new JButton("Crear habitacion"); // Botón prinicipal eliminar cliente
		btncrearhabitaciones.setBackground(new Color(255, 255, 0));
		btncrearhabitaciones.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btncrearhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btncrearhabitaciones.setForeground(Color.BLACK);
		btncrearhabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					frame.dispose();
					UsersController hc = new UsersController();
					hc.Crear_habitaciones();	
			}
		});
		btncrearhabitaciones.setBounds(430, 193, 280, 40);
		panel.add(btncrearhabitaciones);

		
		

		
		ConectionModel conn = new ConectionModel();
		List<Habitacion> listaHabitaciones = new UsersModel().obtenerHabitaciones(conn.getConnection());

		int x = 131;
		int y = 257;
		int contador = 0;

		for (Habitacion habitacion : listaHabitaciones) {
		    JButton btnHabitacion = new JButton(habitacion.getNombre());
		    btnHabitacion.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		    btnHabitacion.setBackground(new Color(0, 187, 249));
		    btnHabitacion.setBounds(x, y, 150, 150);
		    btnHabitacion.setVerticalTextPosition(SwingConstants.BOTTOM);
		    btnHabitacion.setHorizontalTextPosition(SwingConstants.CENTER);
		    btnHabitacion.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));

		    ImageIcon icon = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		    Image imagen = icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		    btnHabitacion.setIcon(new ImageIcon(imagen));

		    btnHabitacion.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            if (modoEliminar[0]) {
		                int confirm = JOptionPane.showConfirmDialog(null,
		                    "¿Estás seguro de que deseas eliminar la habitación \"" + habitacion.getNombre() + "\"?",
		                    "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

		                if (confirm == JOptionPane.YES_OPTION) {
		                    ConectionModel conn = new ConectionModel();
		                    boolean eliminado = new UsersModel().eliminarHabitacion(conn.getConnection(), habitacion.getId_habitacion());
		                    if (eliminado) {
		                        JOptionPane.showMessageDialog(null, "✅ Habitación eliminada correctamente.");
		                        modoEliminar[0] = false;
		                        frame.dispose();
		                        new HomeController().PanelHabitaciones1();
		                    } else {
		                        JOptionPane.showMessageDialog(null, "❌ Error al eliminar la habitación.");
		                    }
		                } else {
		                    modoEliminar[0] = false;
		                }
		            } else {
		                frame.dispose(); 
		                new UsersController().DetallesHabitacion1(habitacion);
		            }
		        }
		    });

		        
		            
		    panel.add(btnHabitacion);
		    contador++;
		    if (contador % 4 == 0) {
		        x = 131;
		        y += 198;
		    } else {
		        x += 200;
		    }
		}
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public void Clientes() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("Button.arc", 90); // Esquinas redondas
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1180, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel logo = new JLabel("");
		logo.setBounds(0, 0, 170, 95);
		logo.setBounds(0, 0, 170, 95);
		ImageIcon icon20065 = new ImageIcon(getClass().getResource("/Images/logo.png"));
		Image imagen20065 = icon20065.getImage().getScaledInstance(170, 95, Image.SCALE_SMOOTH);
		logo.setIcon(new ImageIcon(imagen20065));
		panel_1.add(logo);

		JLabel Titulo = new JLabel("Panel de clientes\r\n");
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 410, 73);
		panel_1.add(Titulo);

		JLabel menuTitulo = new JLabel("Clientes:");
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 38));
		menuTitulo.setBounds(131, 126, 245, 56);
		panel.add(menuTitulo);

		JButton botonVolver = new JButton("");
		botonVolver.setBounds(60, 132, 36, 36);
		botonVolver.setForeground(new Color(255, 255, 255));
		botonVolver.setBackground(new Color(255, 255, 255));
		botonVolver.setBorderPainted(false);
		botonVolver.setFocusPainted(false);
		botonVolver.setContentAreaFilled(true);
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomeController hc = new HomeController();
				hc.Menu();
			}
		});
		ImageIcon icon2006 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
		Image imagen2006 = icon2006.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
		botonVolver.setIcon(new ImageIcon(imagen2006));
		panel.add(botonVolver);

		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>");
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnTiposDeRentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomeController hc = new HomeController();
				hc.TiposHabitacion();
			}
		});
		btnTiposDeRentas.setBounds(974, 0, 180, 23);
		btnTiposDeRentas.setBorderPainted(false);
		btnTiposDeRentas.setFocusPainted(false);
		btnTiposDeRentas.setContentAreaFilled(true);
		panel_2.add(btnTiposDeRentas);

		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>");
		btnrentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomeController hc = new HomeController();
				hc.Rentas();
			}
		});
		btnrentas.setForeground(Color.WHITE);
		btnrentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnrentas.setFocusPainted(false);
		btnrentas.setContentAreaFilled(true);
		btnrentas.setBorderPainted(false);
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);

		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>");
		btnclientes.setForeground(Color.WHITE);
		btnclientes.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnclientes.setFocusPainted(false);
		btnclientes.setContentAreaFilled(true);
		btnclientes.setBorderPainted(false);
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);

		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>");
		btnhabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomeController hc = new HomeController();
				hc.PanelHabitaciones1();
			}
		});
		btnhabitaciones.setForeground(Color.WHITE);
		btnhabitaciones.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnhabitaciones.setFocusPainted(false);
		btnhabitaciones.setContentAreaFilled(true);
		btnhabitaciones.setBorderPainted(false);
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);

		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>");
		btntarifas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomeController hc = new HomeController();
				hc.Tarifas();
			}
		});
		btntarifas.setForeground(Color.WHITE);
		btntarifas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btntarifas.setFocusPainted(false);
		btntarifas.setContentAreaFilled(true);
		btntarifas.setBorderPainted(false);
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);


		final boolean[] modoEliminar = {false};

		JButton btnEliminarCliente = new JButton("Eliminar Cliente");
		btnEliminarCliente.setBackground(new Color(239, 35, 60));
		btnEliminarCliente.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnEliminarCliente.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnEliminarCliente.setForeground(Color.WHITE);
		btnEliminarCliente.setBounds(131, 193, 245, 40);
		panel.add(btnEliminarCliente);

		btnEliminarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modoEliminar[0] = true;
				JOptionPane.showMessageDialog(null, " Modo eliminar activado. Selecciona un cliente.");
			}
		});

		JButton btnCrearClienteNuevo = new JButton("Crear cliente nuevo");
		btnCrearClienteNuevo.setForeground(Color.BLACK);
		btnCrearClienteNuevo.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
		btnCrearClienteNuevo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnCrearClienteNuevo.setBackground(Color.YELLOW);
		btnCrearClienteNuevo.setBounds(388, 193, 245, 40);
		btnCrearClienteNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				UsersController hc = new UsersController();
				hc.CrearNuevoCliente();
			}
		});
		panel.add(btnCrearClienteNuevo);

		int x = 131;
		int y = 257;
		int contador = 0;

		ConectionModel conn = new ConectionModel();
		List<Cliente> listaClientes = new UsersModel().obtenerClientes(conn.getConnection());

		for (Cliente cliente : listaClientes) {
			JButton btnCliente = new JButton(cliente.getIdClientes() + " - " + cliente.getNombreCliente());
			btnCliente.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
			btnCliente.setBackground(new Color(0, 175, 185));
			btnCliente.setBounds(x, y, 150, 150);
			btnCliente.setVerticalTextPosition(SwingConstants.BOTTOM);
			btnCliente.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCliente.setHorizontalAlignment(SwingConstants.CENTER);
			btnCliente.setVerticalAlignment(SwingConstants.CENTER);
			btnCliente.setIconTextGap(1);
			btnCliente.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));

			ImageIcon icon = new ImageIcon(getClass().getResource("/Images/usuario.png"));
			Image imagen = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			btnCliente.setIcon(new ImageIcon(imagen));

			btnCliente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (modoEliminar[0]) {
						int confirm = JOptionPane.showConfirmDialog(null,
								"¿Estás seguro de que deseas eliminar a " + cliente.getNombreCliente() + "?",
								"Confirmar eliminación", JOptionPane.YES_NO_OPTION);

						if (confirm == JOptionPane.YES_OPTION) {
							ConectionModel conn = new ConectionModel();
							boolean eliminado = new UsersModel().eliminarCliente(conn.getConnection(), cliente.getIdClientes());

							if (eliminado) {
								JOptionPane.showMessageDialog(null, "✅ Cliente eliminado correctamente.");
								modoEliminar[0] = false;
								frame.dispose();
								new UsersController().Clientes();
							} else {
								JOptionPane.showMessageDialog(null, "❌ Error al eliminar el cliente.");
							}
						} else {
							modoEliminar[0] = false;
						}
					} else {
						frame.dispose();
						UsersController hc = new UsersController();
						hc.DatosUsuario(cliente);
					}
				}
			});

			panel.add(btnCliente);

			contador++;
			if (contador % 4 == 0) {
				x = 131;
				y += 198;
			} else {
				x += 200;
			}
		}

		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public void Rentas() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("Button.arc", 90); // Esquinas redondas
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1180, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel(); // Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel(); // Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel logo = new JLabel(""); // Logo
		logo.setBounds(0, 0, 170, 95);
		ImageIcon icon01 = new ImageIcon(getClass().getResource("/Images/logo.png"));
		Image imagen01 = icon01.getImage().getScaledInstance(170, 95, Image.SCALE_SMOOTH);
		logo.setIcon(new ImageIcon(imagen01));
		panel_1.add(logo);

		JLabel Titulo = new JLabel("Rentas\r\n"); // Titulo
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 410, 73);
		panel_1.add(Titulo);

		JLabel menuTitulo = new JLabel("Verde disponible/Rojo ocupado/Mantenimiento\r\n"); // Texto menú
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 22));
		menuTitulo.setBounds(131, 126, 579, 56);
		panel.add(menuTitulo);

		JButton botonVolver = new JButton(""); // Boton para volver atrás
		botonVolver.setForeground(new Color(255, 255, 255));
		botonVolver.setBackground(new Color(255, 255, 255));
		botonVolver.setBorderPainted(false);
		botonVolver.setFocusPainted(false);
		botonVolver.setContentAreaFilled(true);
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Menu();
			}
		});
		botonVolver.setBounds(60, 132, 36, 36);
		ImageIcon icon10 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
		Image imagen10 = icon10.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
		botonVolver.setIcon(new ImageIcon(imagen10));
		panel.add(botonVolver);

		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); // Botón superior tipos de
																								// habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnTiposDeRentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.TiposHabitacion();
			}
		});
		btnTiposDeRentas.setBounds(974, 0, 180, 23);
		btnTiposDeRentas.setBorderPainted(false);
		btnTiposDeRentas.setFocusPainted(false);
		btnTiposDeRentas.setContentAreaFilled(true);
		panel_2.add(btnTiposDeRentas);

		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); // Botón superior rentas
//		btnrentas.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose(); // Cierra la ventana actual del menú
//				Rentas conexion = new Rentas();
//				conexion.frame.setVisible(true); 
//			}
//		});
		btnrentas.setForeground(Color.WHITE);
		btnrentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnrentas.setFocusPainted(false);
		btnrentas.setContentAreaFilled(true);
		btnrentas.setBorderPainted(false);
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);

		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); // Botón superior clientes
		btnclientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Clientes();
			}
		});
		btnclientes.setForeground(Color.WHITE);
		btnclientes.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnclientes.setFocusPainted(false);
		btnclientes.setContentAreaFilled(true);
		btnclientes.setBorderPainted(false);
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);

		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); // Botón superior habitaciones
		btnhabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.PanelHabitaciones1();; 
			}
		});
		btnhabitaciones.setForeground(Color.WHITE);
		btnhabitaciones.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnhabitaciones.setFocusPainted(false);
		btnhabitaciones.setContentAreaFilled(true);
		btnhabitaciones.setBorderPainted(false);
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);

		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); // Botón superior tarifas
		btntarifas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Tarifas();
			}
		});
		btntarifas.setForeground(Color.WHITE);
		btntarifas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btntarifas.setFocusPainted(false);
		btntarifas.setContentAreaFilled(true);
		btntarifas.setBorderPainted(false);
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);

		JButton btnCuartoA1 = new JButton("Cuarto A1"); // Botón Cuarto A1
		btnCuartoA1.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA1.setBackground(new Color(50, 186, 124));
		btnCuartoA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.DatosRenta2();	
			}
		});
		btnCuartoA1.setBounds(131, 257, 150, 150);
		btnCuartoA1.setVerticalTextPosition(SwingConstants.BOTTOM); // Para poner texto debajo de la imagen dentro del
																	// botón
		btnCuartoA1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA1.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA1.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA1.setIconTextGap(1);
		btnCuartoA1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		ImageIcon icon6 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		Image imagen6 = icon6.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		btnCuartoA1.setIcon(new ImageIcon(imagen6));
		panel.add(btnCuartoA1);

		JButton btnCuartoB1 = new JButton("Cuarto B1"); // Botón Cuarto B1
		btnCuartoB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.DatosRenta();
			}
		});
		btnCuartoB1.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnCuartoB1.setBackground(new Color(239, 35, 60));
		btnCuartoB1.setBounds(131, 455, 150, 150);
		btnCuartoB1.setVerticalTextPosition(SwingConstants.BOTTOM); // Para poner texto debajo de la imagen dentro del
																	// botón
		btnCuartoB1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB1.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB1.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB1.setIconTextGap(1);
		ImageIcon icon5 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		Image imagen5 = icon5.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		btnCuartoB1.setIcon(new ImageIcon(imagen5));
		panel.add(btnCuartoB1);

		JButton btnCuartoA2 = new JButton("Cuarto A2"); // Botón Cuarto A2
		btnCuartoA2.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.DatosRenta2();
			}
		});
		btnCuartoA2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoA2.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA2.setIconTextGap(1);
		btnCuartoA2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA2.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnCuartoA2.setBackground(new Color(50, 186, 124));
		btnCuartoA2.setBounds(331, 257, 150, 150);
		ImageIcon icon4 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		Image imagen4 = icon4.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		btnCuartoA2.setIcon(new ImageIcon(imagen4));
		panel.add(btnCuartoA2);

		JButton btnCuartoB2 = new JButton("Cuarto B2"); // Botón Cuarto B2
		btnCuartoB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.DatosRenta2();
			}
		});
		btnCuartoB2.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoB2.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB2.setIconTextGap(1);
		btnCuartoB2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB2.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnCuartoB2.setBackground(new Color(50, 186, 124));
		btnCuartoB2.setBounds(331, 455, 150, 150);
		ImageIcon icon7 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		Image imagen7 = icon7.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		btnCuartoB2.setIcon(new ImageIcon(imagen7));
		panel.add(btnCuartoB2);

		JButton btnCuartoA3 = new JButton("Cuarto A3"); // Botón Cuarto A3
		btnCuartoA3.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.DatosRenta();
			}
		});
		btnCuartoA3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoA3.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA3.setIconTextGap(1);
		btnCuartoA3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA3.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnCuartoA3.setBackground(new Color(239, 35, 60));
		btnCuartoA3.setBounds(531, 257, 150, 150);
		ImageIcon icon8 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		Image imagen8 = icon8.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		btnCuartoA3.setIcon(new ImageIcon(imagen8));
		panel.add(btnCuartoA3);

		JButton btnCuartoA4 = new JButton("Cuarto A4"); // Botón Cuarto A4
		btnCuartoA4.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.DatosRenta();
			}
		});
		btnCuartoA4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoA4.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA4.setIconTextGap(1);
		btnCuartoA4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA4.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnCuartoA4.setBackground(SystemColor.activeCaptionBorder);
		btnCuartoA4.setBounds(731, 257, 150, 150);
		ImageIcon icon23 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		Image imagen23 = icon23.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		btnCuartoA4.setIcon(new ImageIcon(imagen23));
		panel.add(btnCuartoA4);

		JButton btnCuartoA5 = new JButton("Cuarto A5"); // Botón Cuarto A5
		btnCuartoA5.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.DatosRenta2();
			}
		});
		btnCuartoA5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoA5.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA5.setIconTextGap(1);
		btnCuartoA5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA5.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnCuartoA5.setBackground(new Color(50, 186, 124));
		btnCuartoA5.setBounds(931, 257, 150, 150);
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		Image imagen1 = icon1.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		btnCuartoA5.setIcon(new ImageIcon(imagen1));
		panel.add(btnCuartoA5);

		JButton btnCuartoB3 = new JButton("Cuarto B3"); // Botón Cuarto B3
		btnCuartoB3.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.DatosRenta();
			}
		});
		btnCuartoB3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoB3.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB3.setIconTextGap(1);
		btnCuartoB3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB3.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnCuartoB3.setBackground(new Color(239, 35, 60));
		btnCuartoB3.setBounds(531, 455, 150, 150);
		ImageIcon icon42 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		Image imagen42 = icon42.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		btnCuartoB3.setIcon(new ImageIcon(imagen42));
		panel.add(btnCuartoB3);

		JButton btnCuartoB4 = new JButton("Cuarto B4"); // Botón Cuarto B4
		btnCuartoB4.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.DatosRenta2();
			}
		});
		btnCuartoB4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoB4.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB4.setIconTextGap(1);
		btnCuartoB4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB4.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnCuartoB4.setBackground(new Color(50, 186, 124));
		btnCuartoB4.setBounds(731, 455, 150, 150);
		ImageIcon icon44 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		Image imagen44 = icon44.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		btnCuartoB4.setIcon(new ImageIcon(imagen44));
		panel.add(btnCuartoB4);

		JButton btnCuartoB5 = new JButton("Cuarto B5"); // Botón Cuarto B5
		btnCuartoB5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.DatosRenta();
			}
		});
		btnCuartoB5.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoB5.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB5.setIconTextGap(1);
		btnCuartoB5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB5.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnCuartoB5.setBackground(new Color(239, 35, 60));
		btnCuartoB5.setBounds(931, 455, 150, 150);
		ImageIcon icon3 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		Image imagen3 = icon3.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		btnCuartoB5.setIcon(new ImageIcon(imagen3));
		panel.add(btnCuartoB5);

		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public void TiposHabitacion() {
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			UIManager.put("Button.arc", 0); // Esquinas redondas
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1180, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel(); // Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel(); // Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel logo = new JLabel(""); // Logo
		logo.setBounds(0, 0, 170, 95);
		// CORREGIDO: new ImageIcon(getClass().getResource("/Images/logo.png"));
		ImageIcon portada1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
		Image portada2 = portada1.getImage();
		Image portada3 = portada2.getScaledInstance(170, 95, Image.SCALE_SMOOTH);
		logo.setIcon(new ImageIcon(portada3));
		panel_1.add(logo);

		JLabel Titulo = new JLabel("Tipos  de habitaciones:"); // Titulo
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 410, 73);
		panel_1.add(Titulo);

		JButton botonVolver = new JButton(""); // Boton para volver atrás
		botonVolver.setForeground(new Color(255, 255, 255));
		botonVolver.setBackground(new Color(255, 255, 255));
		botonVolver.setBorderPainted(false);
		botonVolver.setFocusPainted(false);
		botonVolver.setContentAreaFilled(true);
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Menu();
			}
		});
		botonVolver.setBounds(60, 132, 50, 50);
		// CORREGIDO: new
		// ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
		ImageIcon f1 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
		Image f2 = f1.getImage();
		Image f3 = f2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
		botonVolver.setIcon(new ImageIcon(f3));
		panel.add(botonVolver);

		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); // Botón superior tipos de
																								// habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnTiposDeRentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
																					

//		btnTiposDeRentas.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose(); // Cierra la ventana actual del menú
//				TiposHabitacion conexion = new TiposHabitacion();
//				conexion.frame.setVisible(true); 
//			}
//		});
		btnTiposDeRentas.setBounds(974, 0, 180, 23);
		btnTiposDeRentas.setBorderPainted(false);
		btnTiposDeRentas.setFocusPainted(false);
		btnTiposDeRentas.setContentAreaFilled(true);
		panel_2.add(btnTiposDeRentas);

		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); // Botón superior rentas
		btnrentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Rentas();
			}
		});
		btnrentas.setForeground(Color.WHITE);
		btnrentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnrentas.setFocusPainted(false);
		btnrentas.setContentAreaFilled(true);
		btnrentas.setBorderPainted(false);
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);

		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); // Botón superior clientes
		btnclientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Clientes();
			}
		});
		btnclientes.setForeground(Color.WHITE);
		btnclientes.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnclientes.setFocusPainted(false);
		btnclientes.setContentAreaFilled(true);
		btnclientes.setBorderPainted(false);
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);

		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); // Botón superior habitaciones
		btnhabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.PanelHabitaciones1();
			}
		});
		btnhabitaciones.setForeground(Color.WHITE);
		btnhabitaciones.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnhabitaciones.setFocusPainted(false);
		btnhabitaciones.setContentAreaFilled(true);
		btnhabitaciones.setBorderPainted(false);
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);

		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); // Botón superior tarifas
		btntarifas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Tarifas();
			}
		});
		btntarifas.setForeground(Color.WHITE);
		btntarifas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btntarifas.setFocusPainted(false);
		btntarifas.setContentAreaFilled(true);
		btntarifas.setBorderPainted(false);
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);

		// CORREGIDO: new ImageIcon(getClass().getResource("/Images/busqueda.png"));
		ImageIcon u1 = new ImageIcon(getClass().getResource("/Images/busqueda.png"));
		Image u2 = u1.getImage();
		Image u3 = u2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
		final String placeholder = "BUSCAR";

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(152, 193, 217));
		panel_3.setBounds(131, 193, 300, 440);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblImagen1 = new JLabel();
		lblImagen1.setBounds(50, 39, 200, 200);
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/Images/foto1.png"));
		Image imagen1 = icon1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		lblImagen1.setIcon(new ImageIcon(imagen1));
		panel_3.add(lblImagen1);

		JLabel lblTexto1 = new JLabel("Habitaciones:");
		lblTexto1.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 20));
		lblTexto1.setBounds(92, 249, 135, 20);
		panel_3.add(lblTexto1);

		JLabel lblEstandar = new JLabel("Estandar");
		lblEstandar.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		lblEstandar.setBounds(92, 10, 135, 20);
		panel_3.add(lblEstandar);

		JLabel lblTexto1_2 = new JLabel("3");
		lblTexto1_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		lblTexto1_2.setBounds(147, 289, 40, 29);
		panel_3.add(lblTexto1_2);

		JButton btnNewButton_1_1_1_1 = new JButton("Detalles");
        btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.DetallesHabitacion4();
        	}
        });
		btnNewButton_1_1_1_1.setBackground(new Color(255, 230, 167));
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1_1.setBounds(92, 375, 124, 55);

		panel_3.add(btnNewButton_1_1_1_1);

		// Segundo panel
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(152, 193, 217));
		panel_2_1.setBounds(461, 193, 300, 440);
		panel.add(panel_2_1);

		JLabel lblImagen2 = new JLabel();
		lblImagen2.setBounds(49, 36, 200, 200);
		ImageIcon icon2 = new ImageIcon(getClass().getResource("/Images/foto2.png"));
		Image imagen2 = icon2.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		lblImagen2.setIcon(new ImageIcon(imagen2));
		panel_2_1.add(lblImagen2);

		JLabel lblTexto1_1 = new JLabel("Habitaciones:");
		lblTexto1_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		lblTexto1_1.setBounds(86, 246, 135, 20);
		panel_2_1.add(lblTexto1_1);

		JLabel lblTexto1_1_2 = new JLabel("Familiar");
		lblTexto1_1_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		lblTexto1_1_2.setBounds(86, 10, 135, 20);
		panel_2_1.add(lblTexto1_1_2);

		JLabel lblTexto1_2_1 = new JLabel("4");
		lblTexto1_2_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		lblTexto1_2_1.setBounds(138, 288, 40, 29);
		panel_2_1.add(lblTexto1_2_1);

		JButton btnNewButton_1_1_1 = new JButton("Detalles");
        btnNewButton_1_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.DetallesFamiliar();
        		
        	}
        });
		btnNewButton_1_1_1.setBackground(new Color(255, 230, 167));
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1.setBounds(86, 375, 124, 55);
		panel_2_1.add(btnNewButton_1_1_1);

		// Tercer panel
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(152, 193, 217));
		panel_1_1.setBounds(811, 193, 300, 440);
		panel.add(panel_1_1);

		JLabel lblImagen3 = new JLabel();
		lblImagen3.setBounds(51, 41, 200, 200);
		ImageIcon icon3 = new ImageIcon(getClass().getResource("/Images/foto3.png"));
		Image imagen3 = icon3.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		lblImagen3.setIcon(new ImageIcon(imagen3));
		panel_1_1.add(lblImagen3);

		JLabel lblTexto1_1_1 = new JLabel("Habitaciones:");
		lblTexto1_1_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		lblTexto1_1_1.setBounds(86, 251, 135, 20);
		panel_1_1.add(lblTexto1_1_1);

		JLabel lblTexto1_1_1_1 = new JLabel("Suite");
		lblTexto1_1_1_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		lblTexto1_1_1_1.setBounds(86, 10, 135, 20);
		panel_1_1.add(lblTexto1_1_1_1);

		JLabel lblTexto1_2_1_1 = new JLabel("5");
		lblTexto1_2_1_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		lblTexto1_2_1_1.setBounds(139, 281, 40, 29);
		panel_1_1.add(lblTexto1_2_1_1);

		JButton btnNewButton_1_1 = new JButton("Detalles");
		btnNewButton_1_1.setBackground(new Color(255, 230, 167));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(86, 375, 124, 55);
//        btnNewButton_1_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose(); // Cierra la ventana actual del menú
//				DetallesHabitacion4 conexion = new DetallesHabitacion4();
//				conexion.frame.setVisible(true); 	
//			}
//		});
		panel_1_1.add(btnNewButton_1_1);

		JButton btnNewButton_1_1_1_1_1 = new JButton("Eliminar");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.EliminarTipodeHabitacion();
        	}
        });
		btnNewButton_1_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1_1_1.setBackground(new Color(239, 35, 60));
		btnNewButton_1_1_1_1_1.setBounds(131, 131, 124, 55);
		panel.add(btnNewButton_1_1_1_1_1);

		JButton btnNewButton_1_1_1_1_1_1 = new JButton("Editar\r\n");
        btnNewButton_1_1_1_1_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.EditarHabitacion();
        	}
        });
		btnNewButton_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1_1_1_1.setBackground(new Color(44, 196, 196));
		btnNewButton_1_1_1_1_1_1.setBounds(265, 128, 124, 55);
		panel.add(btnNewButton_1_1_1_1_1_1);

		JButton btnNewButton_1_1_1_1_1_1_1 = new JButton("Crear tipo");
        btnNewButton_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.CrearTipoHabitacion();
        	}
        });
		btnNewButton_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1_1_1_1_1.setBackground(Color.YELLOW);
		btnNewButton_1_1_1_1_1_1_1.setBounds(399, 127, 154, 55);
		panel.add(btnNewButton_1_1_1_1_1_1_1);

		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public void Tarifas() {
	    try {
	        UIManager.setLookAndFeel(new FlatLightLaf());
	        UIManager.put("Button.arc", 0);
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }

	    JFrame frame = new JFrame();
	    frame.setResizable(false);
	    frame.setBounds(100, 100, 1180, 700);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JPanel panel = new JPanel();
	    panel.setBackground(new Color(255, 255, 255));
	    frame.getContentPane().add(panel, BorderLayout.CENTER);
	    panel.setLayout(null);

	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(0, 0, 0));
	    panel_1.setBounds(0, 0, 1164, 95);
	    panel.add(panel_1);
	    panel_1.setLayout(null);

	    JPanel panel_2 = new JPanel();
	    panel_2.setBackground(new Color(55, 54, 48));
	    panel_2.setBounds(0, 95, 1164, 26);
	    panel.add(panel_2);
	    panel_2.setLayout(null);

	    JLabel logo = new JLabel("");
	    logo.setBounds(0, 0, 170, 95);
	    ImageIcon icon12 = new ImageIcon(getClass().getResource("/Images/logo.png"));
	    Image imagen12 = icon12.getImage().getScaledInstance(170, 95, Image.SCALE_SMOOTH);
	    logo.setIcon(new ImageIcon(imagen12));
	    panel_1.add(logo);

	    JLabel Titulo = new JLabel("Tarifas");
	    Titulo.setForeground(new Color(255, 255, 255));
	    Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
	    Titulo.setBounds(180, 11, 410, 73);
	    panel_1.add(Titulo);

	    JLabel menuTitulo = new JLabel("Tipos de tarifas:");
	    menuTitulo.setFont(new Font("Jost*", Font.BOLD, 38));
	    menuTitulo.setBounds(131, 126, 400, 56);
	    panel.add(menuTitulo);

	    JButton botonVolver = new JButton("");
	    botonVolver.setForeground(new Color(255, 255, 255));
	    botonVolver.setBackground(new Color(255, 255, 255));
	    botonVolver.setBorderPainted(false);
	    botonVolver.setFocusPainted(false);
	    botonVolver.setContentAreaFilled(true);
	    botonVolver.addActionListener(e -> {
	        frame.dispose();
	        HomeController hc = new HomeController();
	        hc.Menu();
	    });
	    botonVolver.setBounds(60, 132, 36, 36);
	    ImageIcon icon69 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
	    Image imagen69 = icon69.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
	    botonVolver.setIcon(new ImageIcon(imagen69));
	    panel.add(botonVolver);

	    JButton btnTiposDeHabitaciones = new JButton("<html>Tipos de habitaciones &#8594;</html>");
		btnTiposDeHabitaciones.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeHabitaciones.setForeground(new Color(255, 255, 255));
		btnTiposDeHabitaciones.setBackground(new Color(56, 54, 41));
		btnTiposDeHabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
	btnTiposDeHabitaciones.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame.dispose(); // Cierra la ventana actual del menú
			HomeController hc = new HomeController();
			hc.TiposHabitacion();
		}
	});
		btnTiposDeHabitaciones.setBounds(974, 0, 180, 23);
		btnTiposDeHabitaciones.setBorderPainted(false);
		btnTiposDeHabitaciones.setFocusPainted(false);
		btnTiposDeHabitaciones.setContentAreaFilled(true);
		panel_2.add(btnTiposDeHabitaciones);

		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>");
	btnrentas.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame.dispose(); // Cierra la ventana actual del menú
			HomeController hc = new HomeController();
			hc.Rentas();
		}
	});
		btnrentas.setForeground(Color.WHITE);
		btnrentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnrentas.setFocusPainted(false);
		btnrentas.setContentAreaFilled(true);
		btnrentas.setBorderPainted(false);
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);

		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>");
		btnclientes.setForeground(Color.WHITE);
		btnclientes.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnclientes.setFocusPainted(false);
		btnclientes.setContentAreaFilled(true);
		btnclientes.setBorderPainted(false);
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);;
		btnclientes.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame.dispose(); // Cierra la ventana actual del menú
			HomeController hc = new HomeController();
			hc.Clientes();
		}
	});
		panel_2.add(btnclientes);

		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>");
		btnhabitaciones.setForeground(Color.WHITE);
		btnhabitaciones.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnhabitaciones.setFocusPainted(false);
		btnhabitaciones.setContentAreaFilled(true);
		btnhabitaciones.setBorderPainted(false);
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
	btnhabitaciones.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame.dispose(); // Cierra la ventana actual del menú
			HomeController hc = new HomeController();
			hc.PanelHabitaciones1();
		}
	});
		panel_2.add(btnhabitaciones);

		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>");
		btntarifas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btntarifas.setForeground(Color.WHITE);
		btntarifas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btntarifas.setFocusPainted(false);
		btntarifas.setContentAreaFilled(true);
		btntarifas.setBorderPainted(false);
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);

	    // Tabla y modelo:
	    final DefaultTableModel tableModel = new DefaultTableModel(
	        new String[] { "ID Tarifa", "Nombre de tarifa", "Precio", "Condicion" }, 0
	    );
	    final JTable tableTarifas = new JTable(tableModel);
	    tableTarifas.setFont(new Font("Dialog", Font.PLAIN, 14));
	    tableTarifas.setRowHeight(25);
	    tableTarifas.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 16));
	    tableTarifas.getTableHeader().setBackground(new Color(55, 54, 48));
	    tableTarifas.getTableHeader().setForeground(Color.WHITE);

	    JScrollPane scrollPane = new JScrollPane(tableTarifas);
	    scrollPane.setBounds(131, 250, 950, 350);
	    panel.add(scrollPane);

	    TableColumnModel tcm = tableTarifas.getColumnModel();
	    tcm.removeColumn(tcm.getColumn(0));

	    // Botón eliminar
	    JButton btnEliminarTarifa = new JButton("Eliminar");
	    btnEliminarTarifa.setBackground(new Color(239, 35, 60));
	    btnEliminarTarifa.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
	    btnEliminarTarifa.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
	    btnEliminarTarifa.setForeground(Color.WHITE);
	    btnEliminarTarifa.addActionListener(e -> {
	        int selectedRow = tableTarifas.getSelectedRow();
	        if (selectedRow >= 0) {
	            int confirm = JOptionPane.showConfirmDialog(frame,
	                "¿Seguro que deseas eliminar esta tarifa?",
	                "Confirmar eliminación",
	                JOptionPane.YES_NO_OPTION
	            );
	            if (confirm == JOptionPane.YES_OPTION) {
	                int idTarifa = (int) tableModel.getValueAt(selectedRow, 0);
	                ConectionModel conn = new ConectionModel();
	                boolean eliminado = new UsersModel().eliminarTarifa(conn.getConnection(), idTarifa);
	                if (eliminado) {
	                    JOptionPane.showMessageDialog(frame, "✅ Tarifa eliminada correctamente.");
	                    tableModel.removeRow(selectedRow);
	                } else {
	                    JOptionPane.showMessageDialog(frame, "❌ Error al eliminar la tarifa.");
	                }
	            }
	        } else {
	            JOptionPane.showMessageDialog(frame, "❗Selecciona una tarifa primero.");
	        }
	    });
	    btnEliminarTarifa.setBounds(131, 193, 150, 40);
	    panel.add(btnEliminarTarifa);

	    JButton btnEditarTarifa = new JButton("Editar");
		btnEditarTarifa.setBackground(new Color(50, 186, 125));
		btnEditarTarifa.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnEditarTarifa.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnEditarTarifa.setForeground(Color.WHITE);
		
		btnEditarTarifa.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int selectedRow = tableTarifas.getSelectedRow();
		        if (selectedRow >= 0) {
		            int idTarifa = (int) tableModel.getValueAt(selectedRow, 0);
		            frame.dispose();
		            HomeController hc = new HomeController();
		            hc.EditarTarifa(idTarifa); // <-- Así mandas el ID
		        } else {
		            JOptionPane.showMessageDialog(frame, "Selecciona una tarifa para editar.", "Advertencia",
		                JOptionPane.WARNING_MESSAGE);
		        }
		    }
		});

		
		btnEditarTarifa.setBounds(291, 193, 150, 40);
		panel.add(btnEditarTarifa);
	    
	    JButton btnCrearTarifaNueva = new JButton("Crear");
	    btnCrearTarifaNueva.setForeground(Color.DARK_GRAY);
	    btnCrearTarifaNueva.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
	    btnCrearTarifaNueva.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
	    btnCrearTarifaNueva.setBackground(Color.YELLOW);
	    btnCrearTarifaNueva.setBounds(451, 193, 150, 40);
	    btnCrearTarifaNueva.addActionListener(e -> {
	        frame.dispose();
	        UsersController hc = new UsersController();
	        hc.CrearTarifa();
	    });
	    panel.add(btnCrearTarifaNueva);
	    List<Tarifa> tarifas = new UsersModel().obtenerTarifas(new ConectionModel().getConnection());
	    for (Tarifa t : tarifas) {
	        tableModel.addRow(new Object[]{ t.getId(), t.getNombre(), t.getPrecio(), t.getCondicion() });
	    }

	    frame.getContentPane().add(panel);
	    frame.repaint();
	    frame.revalidate();
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	}
	private void cargarDatosTabla(DefaultTableModel tableModel) {
	    ConectionModel conn = new ConectionModel();
	    List<Tarifa> tarifas = new UsersModel().obtenerTarifas(conn.getConnection());

	    for (Tarifa t : tarifas) {
	        Object[] fila = {
	            t.getId(),
	            t.getNombre(),
	            t.getPrecio(),
	            t.getCondicion()
	        };
	        tableModel.addRow(fila);
	    }
	}
//============================================================================================================	
	
	
	
	
	
	}


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

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatLightLaf;

import Controllers.HomeController;
import Controllers.UsersController;
import Models.Cliente;
import Models.ConectionModel;
import Models.Habitacion;
import Models.TarifaModel;
import Models.UsersModel;

public class UsersView {
	
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	protected Habitacion habitacion;

	public UsersView() {
		
	}
	
	
	public void PanelHabitaciones3() {
		
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
		
		JPanel panel_1 = new JPanel(); //Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel(); //Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel logo = new JLabel(""); //Logo
		logo.setBounds(0, 0, 170, 95);
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
        Image imagen1 = icon1.getImage().getScaledInstance(170, 95, Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(imagen1));
		panel_1.add(logo);
		
		JLabel Titulo = new JLabel("Panel de Habitaciones"); //Titulo 
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 500, 73);
		panel_1.add(Titulo);
		
		JLabel menuTitulo = new JLabel("Habitaciones"); //Texto menú
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 38));
		menuTitulo.setBounds(131, 126, 370, 56);
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
				hc.PanelHabitaciones1();

			}
		});
		botonVolver.setBounds(60, 132, 50, 50);
		ImageIcon icon2 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
        Image imagen2 = icon2.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        botonVolver.setIcon(new ImageIcon(imagen2));
		panel.add(botonVolver);
		
		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnTiposDeRentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTiposDeRentas.setBounds(974, 0, 180, 23);
		btnTiposDeRentas.setBorderPainted(false);
        btnTiposDeRentas.setFocusPainted(false);
        btnTiposDeRentas.setContentAreaFilled(true);
		panel_2.add(btnTiposDeRentas);
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
		btnrentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnrentas.setForeground(Color.WHITE);
		btnrentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnrentas.setFocusPainted(false);
		btnrentas.setContentAreaFilled(true);
		btnrentas.setBorderPainted(false);
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
		btnclientes.setForeground(Color.WHITE);
		btnclientes.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnclientes.setFocusPainted(false);
		btnclientes.setContentAreaFilled(true);
		btnclientes.setBorderPainted(false);
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
		btnhabitaciones.setForeground(Color.WHITE);
		btnhabitaciones.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnhabitaciones.setFocusPainted(false);
		btnhabitaciones.setContentAreaFilled(true);
		btnhabitaciones.setBorderPainted(false);
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
		btntarifas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btntarifas.setForeground(Color.WHITE);
		btntarifas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btntarifas.setFocusPainted(false);
		btntarifas.setContentAreaFilled(true);
		btntarifas.setBorderPainted(false);
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);
		
		JButton btnBuscar = new JButton(""); //Boton para la barra de busqueda
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(720, 140, 40, 40);
		ImageIcon icon5 = new ImageIcon(getClass().getResource("/Images/busqueda.png"));
        Image imagen5 = icon5.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        btnBuscar.setIcon(new ImageIcon(imagen5));
		btnBuscar.setBorderPainted(false);
		btnBuscar.setFocusPainted(false);
		btnBuscar.setContentAreaFilled(true);
		panel.add(btnBuscar);
		
		JTextField textField = new JTextField("BUSCAR"); //Texto de ejemplo
		textField.setToolTipText("");
		textField.setBounds(770, 140, 290, 40);
		textField.setColumns(10);
		textField.setBackground(new Color(217, 217, 217));
        textField.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
        textField.setForeground(Color.GRAY);
        final String placeholder = "BUSCAR"; //Borra el texto de ejemplo al escribir en el campo
        textField.addFocusListener(new FocusAdapter() {

            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(Color.GRAY);
                }
            }
        });
		panel.add(textField);	
		
		JButton btnCuartoB3 = new JButton("Cuarto B3"); //Botón Cuarto B3
		btnCuartoB3.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoB3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoB3.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB3.setIconTextGap(1);
		btnCuartoB3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB3.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB3.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoB3.setBackground(new Color(0, 187, 249));
		btnCuartoB3.setBounds(131, 257, 150, 150);
		ImageIcon icon13 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen13 = icon13.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoB3.setIcon(new ImageIcon(imagen13));
		panel.add(btnCuartoB3);
		
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
	
	public void PanelHabitaciones2() {
		
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
		
		JPanel panel_1 = new JPanel(); //Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel(); //Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel logo = new JLabel(""); //Logo
		logo.setBounds(0, 0, 170, 95);
		ImageIcon icon12 = new ImageIcon(getClass().getResource("/Images/logo.png"));
        Image imagen12 = icon12.getImage().getScaledInstance(170, 95, Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(imagen12));
		panel_1.add(logo);
		
		JLabel Titulo = new JLabel("Panel de Habitaciones"); //Titulo 
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 475, 73);
		panel_1.add(Titulo);
		
		JLabel menuTitulo = new JLabel("Seleccione la habitación que desea eliminar"); //Texto menú
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 26));
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
				hc.PanelHabitaciones1();
			}
		});
		botonVolver.setBounds(60, 132, 50, 50);
		ImageIcon icon11 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
        Image imagen11 = icon11.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        botonVolver.setIcon(new ImageIcon(imagen11));
		panel.add(botonVolver);
		
		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
		btnclientes.setForeground(Color.WHITE);
		btnclientes.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnclientes.setFocusPainted(false);
		btnclientes.setContentAreaFilled(true);
		btnclientes.setBorderPainted(false);
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
		btnhabitaciones.setForeground(Color.WHITE);
		btnhabitaciones.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnhabitaciones.setFocusPainted(false);
		btnhabitaciones.setContentAreaFilled(true);
		btnhabitaciones.setBorderPainted(false);
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		btnhabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.PanelHabitaciones1();
			}
		});
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);
		
		JButton btnBuscar = new JButton(""); //Boton para la barra de busqueda
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(720, 140, 40, 40);
		ImageIcon icon13 = new ImageIcon(getClass().getResource("/Images/busqueda.png"));
        Image imagen13 = icon13.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        btnBuscar.setIcon(new ImageIcon(imagen13));
		btnBuscar.setBorderPainted(false);
		btnBuscar.setFocusPainted(false);
		btnBuscar.setContentAreaFilled(true);
		panel.add(btnBuscar);
		
		JTextField textField = new JTextField("BUSCAR"); //Texto de ejemplo
		textField.setToolTipText("");
		textField.setBounds(770, 140, 290, 40);
		textField.setColumns(10);
		textField.setBackground(new Color(217, 217, 217));
        textField.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
        textField.setForeground(Color.GRAY);
        final String placeholder = "BUSCAR"; //Borra el texto de ejemplo al escribir en el campo
        textField.addFocusListener(new FocusAdapter() {

            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(Color.GRAY);
                }
            }
        });
		panel.add(textField);	
		
		JButton btnEliminarCliente = new JButton("Eliminar Habitación"); //Botón prinicipal eliminar cliente
		btnEliminarCliente.setBackground(new Color(239, 35, 60));
		btnEliminarCliente.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnEliminarCliente.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarCliente.setForeground(Color.WHITE);
		btnEliminarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminarCliente.setBounds(131, 193, 280, 40);
		panel.add(btnEliminarCliente);
		
		JButton btnCuartoA1 = new JButton("Cuarto A1"); //Botón Cuarto A1
		btnCuartoA1.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA1.setBackground(new Color(0, 187, 249));
		btnCuartoA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoA1.setBounds(131, 257, 150, 150);
		btnCuartoA1.setVerticalTextPosition(SwingConstants.BOTTOM); //Para poner texto debajo de la imagen dentro del botón
		btnCuartoA1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA1.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA1.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA1.setIconTextGap(1);
		btnCuartoA1.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen1 = icon1.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoA1.setIcon(new ImageIcon(imagen1));
		panel.add(btnCuartoA1);
		
		JButton btnCuartoB1 = new JButton("Cuarto B1"); //Botón Cuarto B1
		btnCuartoB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoB1.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB1.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoB1.setBackground(new Color(0, 187, 249));
		btnCuartoB1.setBounds(131, 455, 150, 150);
		btnCuartoB1.setVerticalTextPosition(SwingConstants.BOTTOM); //Para poner texto debajo de la imagen dentro del botón
		btnCuartoB1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB1.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB1.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB1.setIconTextGap(1);
		ImageIcon icon6 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen6 = icon6.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoB1.setIcon(new ImageIcon(imagen6));
		panel.add(btnCuartoB1);
		
		JButton btnCuartoA2 = new JButton("Cuarto A2"); //Botón Cuarto A2
		btnCuartoA2.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoA2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoA2.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA2.setIconTextGap(1);
		btnCuartoA2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA2.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA2.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoA2.setBackground(new Color(0, 187, 249));
		btnCuartoA2.setBounds(331, 257, 150, 150);
		ImageIcon icon2 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen2 = icon2.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoA2.setIcon(new ImageIcon(imagen2));
		panel.add(btnCuartoA2);
		
		JButton btnCuartoB2 = new JButton("Cuarto B2"); //Botón Cuarto B2
		btnCuartoB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoB2.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoB2.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB2.setIconTextGap(1);
		btnCuartoB2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB2.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB2.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoB2.setBackground(new Color(0, 187, 249));
		btnCuartoB2.setBounds(331, 455, 150, 150);
		ImageIcon icon7 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen7 = icon7.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoB2.setIcon(new ImageIcon(imagen7));
		panel.add(btnCuartoB2);
		
		JButton btnCuartoA3 = new JButton("Cuarto A3"); //Botón Cuarto A3
		btnCuartoA3.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoA3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoA3.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA3.setIconTextGap(1);
		btnCuartoA3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA3.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA3.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoA3.setBackground(new Color(0, 187, 249));
		btnCuartoA3.setBounds(531, 257, 150, 150);
		ImageIcon icon3 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen3 = icon3.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoA3.setIcon(new ImageIcon(imagen3));
		panel.add(btnCuartoA3);
		
		JButton btnCuartoA4 = new JButton("Cuarto A4"); //Botón Cuarto A4
		btnCuartoA4.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoA4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoA4.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA4.setIconTextGap(1);
		btnCuartoA4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA4.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA4.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoA4.setBackground(new Color(0, 187, 249));
		btnCuartoA4.setBounds(731, 257, 150, 150);
		ImageIcon icon4 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen4 = icon4.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoA4.setIcon(new ImageIcon(imagen4));
		panel.add(btnCuartoA4);
		
		JButton btnCuartoA5 = new JButton("Cuarto A5"); //Botón Cuarto A5
		btnCuartoA5.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoA5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoA5.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA5.setIconTextGap(1);
		btnCuartoA5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA5.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA5.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoA5.setBackground(new Color(0, 187, 249));
		btnCuartoA5.setBounds(931, 257, 150, 150);
		ImageIcon icon5 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen5 = icon5.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoA5.setIcon(new ImageIcon(imagen5));
		panel.add(btnCuartoA5);
		
		JButton btnCuartoB3 = new JButton("Cuarto B3"); //Botón Cuarto B3
		btnCuartoB3.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoB3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoB3.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB3.setIconTextGap(1);
		btnCuartoB3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB3.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB3.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoB3.setBackground(new Color(0, 187, 249));
		btnCuartoB3.setBounds(531, 455, 150, 150);
		ImageIcon icon8 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen8 = icon8.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoB3.setIcon(new ImageIcon(imagen8));
		panel.add(btnCuartoB3);
		
		JButton btnCuartoB4 = new JButton("Cuarto B4"); //Botón Cuarto B4
		btnCuartoB4.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoB4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoB4.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB4.setIconTextGap(1);
		btnCuartoB4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB4.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB4.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoB4.setBackground(new Color(0, 187, 249));
		btnCuartoB4.setBounds(731, 455, 150, 150);
		ImageIcon icon9 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen9 = icon9.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoB4.setIcon(new ImageIcon(imagen9));
		panel.add(btnCuartoB4);
		
		JButton btnCuartoB5 = new JButton("Cuarto B5"); //Botón Cuarto B5
		btnCuartoB5.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoB5.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB5.setIconTextGap(1);
		btnCuartoB5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB5.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB5.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoB5.setBackground(new Color(0, 187, 249));
		btnCuartoB5.setBounds(931, 455, 150, 150);
		ImageIcon icon10 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen10 = icon10.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoB5.setIcon(new ImageIcon(imagen10));
		panel.add(btnCuartoB5);
		
		JButton btnEliminarHabitacionA1 = new JButton("Eliminar Habitación");
		btnEliminarHabitacionA1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int respuesta = JOptionPane.showConfirmDialog(
		                null, 
		                "¿Estás seguro de que desea eliminar esta habitación?","Confirmación",JOptionPane.YES_NO_OPTION,   JOptionPane.WARNING_MESSAGE  );

		        if (respuesta == JOptionPane.YES_OPTION) {
		            JOptionPane.showMessageDialog(
		                null,"Habitación eliminada.", "exito", JOptionPane.INFORMATION_MESSAGE);
		        }
		    }
		});

		btnEliminarHabitacionA1.setBackground(new Color(239, 35, 60));
		btnEliminarHabitacionA1.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 12));
		btnEliminarHabitacionA1.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarHabitacionA1.setForeground(Color.WHITE);
		btnEliminarHabitacionA1.setBounds(131, 418, 150, 23);
		panel.add(btnEliminarHabitacionA1);
		
		JButton btnEliminarHabitacionA2 = new JButton("Eliminar Habitación"); //Botón eliminar Cuarto A2
		btnEliminarHabitacionA2.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
			        int respuesta = JOptionPane.showConfirmDialog(
			                null, 
			                "¿Estás seguro de que desea eliminar esta habitación?","Confirmación",JOptionPane.YES_NO_OPTION,   JOptionPane.WARNING_MESSAGE  );

			        if (respuesta == JOptionPane.YES_OPTION) {
			            JOptionPane.showMessageDialog(
			                null,"Habitación eliminada.", "exito", JOptionPane.INFORMATION_MESSAGE);
			        }
			    }
			});
		btnEliminarHabitacionA2.setForeground(Color.WHITE);
		btnEliminarHabitacionA2.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 12));
		btnEliminarHabitacionA2.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarHabitacionA2.setBackground(new Color(239, 35, 60));
		btnEliminarHabitacionA2.setBounds(331, 418, 150, 23);
		panel.add(btnEliminarHabitacionA2);
		
		JButton btnEliminarHabitacionA3 = new JButton("Eliminar Habitación"); //Botón eliminar Cuarto A3
		btnEliminarHabitacionA3.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
			        int respuesta = JOptionPane.showConfirmDialog(
			                null, 
			                "¿Estás seguro de que desea eliminar esta habitación?","Confirmación",JOptionPane.YES_NO_OPTION,   JOptionPane.WARNING_MESSAGE  );

			        if (respuesta == JOptionPane.YES_OPTION) {
			            JOptionPane.showMessageDialog(
			                null,"Habitación eliminada.", "exito", JOptionPane.INFORMATION_MESSAGE);
			        }
			    }
			});
		btnEliminarHabitacionA3.setForeground(Color.WHITE);
		btnEliminarHabitacionA3.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 12));
		btnEliminarHabitacionA3.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarHabitacionA3.setBackground(new Color(239, 35, 60));
		btnEliminarHabitacionA3.setBounds(531, 418, 150, 23);
		panel.add(btnEliminarHabitacionA3);
		
		JButton btnEliminarHabitacionA4 = new JButton("Eliminar Habitación"); //Botón eliminar Cuarto A4
		btnEliminarHabitacionA4.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
			        int respuesta = JOptionPane.showConfirmDialog(
			                null, 
			                "¿Estás seguro de que desea eliminar esta habitación?","Confirmación",JOptionPane.YES_NO_OPTION,   JOptionPane.WARNING_MESSAGE  );

			        if (respuesta == JOptionPane.YES_OPTION) {
			            JOptionPane.showMessageDialog(
			                null,"Habitación eliminada.", "exito", JOptionPane.INFORMATION_MESSAGE);
			        }
			    }
			});
		btnEliminarHabitacionA4.setForeground(Color.WHITE);
		btnEliminarHabitacionA4.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 12));
		btnEliminarHabitacionA4.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarHabitacionA4.setBackground(new Color(239, 35, 60));
		btnEliminarHabitacionA4.setBounds(731, 418, 150, 23);
		panel.add(btnEliminarHabitacionA4);
		
		JButton btnEliminarHabitacionA5 = new JButton("Eliminar Habitación"); //Botón eliminar Cuarto A5
		btnEliminarHabitacionA5.setForeground(Color.WHITE);
		btnEliminarHabitacionA5.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 12));
		btnEliminarHabitacionA5.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarHabitacionA5.setBackground(new Color(239, 35, 60));
		btnEliminarHabitacionA5.setBounds(931, 418, 150, 23);
		panel.add(btnEliminarHabitacionA5);
		
		JButton btnEliminarHabitacionB1 = new JButton("Eliminar Habitación"); //Botón eliminar Cuarto B1
		btnEliminarHabitacionB1.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
			        int respuesta = JOptionPane.showConfirmDialog(
			                null, 
			                "¿Estás seguro de que desea eliminar esta habitación?","Confirmación",JOptionPane.YES_NO_OPTION,   JOptionPane.WARNING_MESSAGE  );

			        if (respuesta == JOptionPane.YES_OPTION) {
			            JOptionPane.showMessageDialog(
			                null,"Habitación eliminada.", "exito", JOptionPane.INFORMATION_MESSAGE);
			        }
			    }
			});
		btnEliminarHabitacionB1.setForeground(Color.WHITE);
		btnEliminarHabitacionB1.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 12));
		btnEliminarHabitacionB1.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarHabitacionB1.setBackground(new Color(239, 35, 60));
		btnEliminarHabitacionB1.setBounds(131, 616, 150, 23);
		panel.add(btnEliminarHabitacionB1);
		
		JButton btnEliminarHabitacionB2 = new JButton("Eliminar Habitación"); //Botón eliminar Cuarto B2
		btnEliminarHabitacionB2.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
			        int respuesta = JOptionPane.showConfirmDialog(
			                null, 
			                "¿Estás seguro de que desea eliminar esta habitación?","Confirmación",JOptionPane.YES_NO_OPTION,   JOptionPane.WARNING_MESSAGE  );

			        if (respuesta == JOptionPane.YES_OPTION) {
			            JOptionPane.showMessageDialog(
			                null,"Habitación eliminada.", "exito", JOptionPane.INFORMATION_MESSAGE);
			        }
			    }
			});
		btnEliminarHabitacionB2.setForeground(Color.WHITE);
		btnEliminarHabitacionB2.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 12));
		btnEliminarHabitacionB2.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarHabitacionB2.setBackground(new Color(239, 35, 60));
		btnEliminarHabitacionB2.setBounds(331, 616, 150, 23);
		panel.add(btnEliminarHabitacionB2);
		
		JButton btnEliminarHabitacionB3 = new JButton("Eliminar Habitación"); //Botón eliminar Cuarto B3
		btnEliminarHabitacionB3.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
			        int respuesta = JOptionPane.showConfirmDialog(
			                null, 
			                "¿Estás seguro de que desea eliminar esta habitación?","Confirmación",JOptionPane.YES_NO_OPTION,   JOptionPane.WARNING_MESSAGE  );

			        if (respuesta == JOptionPane.YES_OPTION) {
			            JOptionPane.showMessageDialog(
			                null,"Habitación eliminada.", "exito", JOptionPane.INFORMATION_MESSAGE);
			        }
			    }
			});
		btnEliminarHabitacionB3.setForeground(Color.WHITE);
		btnEliminarHabitacionB3.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 12));
		btnEliminarHabitacionB3.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarHabitacionB3.setBackground(new Color(239, 35, 60));
		btnEliminarHabitacionB3.setBounds(531, 616, 150, 23);
		panel.add(btnEliminarHabitacionB3);
		
		JButton btnEliminarHabitacionB4 = new JButton("Eliminar Habitación"); //Botón eliminar Cuarto B4
		btnEliminarHabitacionB4.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
			        int respuesta = JOptionPane.showConfirmDialog(
			                null, 
			                "¿Estás seguro de que desea eliminar esta habitación?","Confirmación",JOptionPane.YES_NO_OPTION,   JOptionPane.WARNING_MESSAGE  );

			        if (respuesta == JOptionPane.YES_OPTION) {
			            JOptionPane.showMessageDialog(
			                null,"Habitación eliminada.", "exito", JOptionPane.INFORMATION_MESSAGE);
			        }
			    }
			});
		btnEliminarHabitacionB4.setForeground(Color.WHITE);
		btnEliminarHabitacionB4.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 12));
		btnEliminarHabitacionB4.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarHabitacionB4.setBackground(new Color(239, 35, 60));
		btnEliminarHabitacionB4.setBounds(731, 616, 150, 23);
		panel.add(btnEliminarHabitacionB4);
		
		JButton btnEliminarHabitacionB5 = new JButton("Eliminar Habitación"); //Botón eliminar Cuarto B5
		btnEliminarHabitacionB5.setForeground(Color.WHITE);
		btnEliminarHabitacionB5.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 12));
		btnEliminarHabitacionB5.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarHabitacionB5.setBackground(new Color(239, 35, 60));
		btnEliminarHabitacionB5.setBounds(931, 616, 150, 23);
		panel.add(btnEliminarHabitacionB5);
		
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void DetallesHabitacion1(Habitacion habitacion) {

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

		JPanel panel_1 = new JPanel(); //Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel(); //Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel logo = new JLabel(""); //Logo
		logo.setBounds(0, 0, 170, 95);
		// Corrected image path
		ImageIcon portada1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
	    Image portada2 = portada1.getImage();
	    Image portada3 = portada2.getScaledInstance(170, 95,Image.SCALE_SMOOTH);
	    logo.setIcon(new ImageIcon(portada3));
		panel_1.add(logo);

		JLabel Titulo = new JLabel("Panel de Habitaciones"); //Titulo
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 500, 73);
		panel_1.add(Titulo);

		JLabel menuTitulo = new JLabel("Detalles de la habitación:"); //Texto menú
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 38));
		menuTitulo.setBounds(131, 126, 650, 56);
		panel.add(menuTitulo);

		JButton botonVolver = new JButton(""); // Boton para volver atrás
		botonVolver.setForeground(new Color(255, 255, 255));
		botonVolver.setBackground(new Color(255, 255, 255));
		botonVolver.setBorderPainted(false);
		botonVolver.setFocusPainted(false);
		botonVolver.setContentAreaFilled(true);
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonVolver.setBounds(60, 132, 50, 50);
		// Corrected image path
		ImageIcon f1 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
		Image f2 = f1.getImage();
		Image f3 = f2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
		botonVolver.setIcon(new ImageIcon(f3));
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.PanelHabitaciones1();	
			}
		});
		panel.add(botonVolver);


		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
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
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
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
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 187, 249));
		panel_3.setBounds(131, 193, 300, 440);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(45, 11, 200, 200);
		// Corrected image path
		ImageIcon v1 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		Image v2 = v1.getImage();
		Image v3 = v2.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(v3));
		panel_3.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(habitacion.getNombre());
		lblNewLabel_1.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(100, 222, 200, 20); // Ajusta ancho si es necesario
		panel_3.add(lblNewLabel_1);

		JLabel textoHabitacion = new JLabel("Tipo de habitación:");
		textoHabitacion.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		textoHabitacion.setBounds(80, 253, 145, 20);
		panel_3.add(textoHabitacion);

		JLabel lblNewLabel_2 = new JLabel("Estándar");
		lblNewLabel_2.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(115, 284, 70, 20);
		panel_3.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Camas:");
		lblNewLabel_3.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_3.setBounds(120, 315, 60, 20);
		panel_3.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setText(habitacion.getCapacidad_max() + " camas");
		lblNewLabel_4.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(68, 340, 168, 20);
		panel_3.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Ocupante:");
		lblNewLabel_5.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_5.setBounds(110, 365, 80, 20);
		panel_3.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Diego Ontiveros");
		lblNewLabel_6.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(90, 396, 125, 20);
		panel_3.add(lblNewLabel_6);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 187, 249));
		panel_4.setBounds(441, 193, 340, 140);
		panel.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblNewLabel_7 = new JLabel("Historial de rentas:");
		lblNewLabel_7.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_7.setBounds(10, 11, 320, 30);
		panel_4.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("rentado del 14 al 15 de mayo 2024");
		lblNewLabel_8.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(10, 52, 320, 20);
		panel_4.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("rentanado del 13 al 23 de agosto 2018");
		lblNewLabel_9.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(10, 83, 320, 20);
		panel_4.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("rentado del  4 al 7 de abril 2016");
		lblNewLabel_10.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(10, 114, 320, 20);
		panel_4.add(lblNewLabel_10);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 187, 249));
		panel_5.setBounds(441, 344, 340, 140);
		panel.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblNewLabel_11 = new JLabel("Tarifas:");
		lblNewLabel_11.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_11.setBounds(10, 11, 320, 30);
		panel_5.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("$650 pesos por noche");
		lblNewLabel_12.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setBounds(10, 52, 320, 20);
		panel_5.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("descuento los dias primero de cada mes");
		lblNewLabel_13.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setBounds(10, 83, 320, 20);
		panel_5.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("costo $350 pesos");
		lblNewLabel_14.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setBounds(10, 114, 320, 14);
		panel_5.add(lblNewLabel_14);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 187, 249));
		panel_6.setBounds(441, 495, 340, 138);
		panel.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_15 = new JLabel("Servicios extras:");
		lblNewLabel_15.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_15.setBounds(10, 11, 320, 30);
		panel_6.add(lblNewLabel_15);

		JLabel lblNewLabel_16 = new JLabel();
		lblNewLabel_16.setText(habitacion.getDescripcion());
		lblNewLabel_16.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_16.setForeground(Color.WHITE);
		lblNewLabel_16.setBounds(10, 52, 320, 20);
		panel_6.add(lblNewLabel_16);

		

		JButton btnOcupado = new JButton("OCUPADO");
		btnOcupado.setBackground(new Color(239, 35, 60));
		btnOcupado.setForeground(Color.WHITE);
		btnOcupado.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnOcupado.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnOcupado.setBounds(845, 200, 270, 60);
		panel.add(btnOcupado);

//		JButton btnHistorial = new JButton("Descargar historial");
//		btnHistorial.setBackground(new Color(255, 214, 10));
//		btnHistorial.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
//		btnHistorial.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
//		btnHistorial.setBounds(845, 495, 270, 60);
//		panel.add(btnHistorial);

		JButton btnEditarHabitacion = new JButton("Editar habitación");
		btnEditarHabitacion.setBackground(new Color(50, 186, 124));
		btnEditarHabitacion.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnEditarHabitacion.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEditarHabitacion.setBounds(845, 566, 270, 60);
		btnEditarHabitacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				new UsersController().DetallesHabitacion2(habitacion);
			}
		});
		panel.add(btnEditarHabitacion);
		
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void DetallesHabitacion2(Habitacion habitacion) {

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

		JPanel panel_1 = new JPanel(); //Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel(); //Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel logo = new JLabel(""); //Logo
		logo.setBounds(0, 0, 170, 95);
		// CORREGIDO: new ImageIcon(getClass().getResource("/Images/logo.png"));
		ImageIcon portada1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
	    Image portada2 = portada1.getImage();
	    Image portada3 = portada2.getScaledInstance(170, 95,Image.SCALE_SMOOTH);
	    logo.setIcon(new ImageIcon(portada3));
		panel_1.add(logo);

		JLabel Titulo = new JLabel("Panel de Habitaciones"); //Titulo
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 500, 73);
		panel_1.add(Titulo);

		JLabel menuTitulo = new JLabel("Detalles de la habitación:"); //Texto menú
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 38));
		menuTitulo.setBounds(131, 126, 610, 56);
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
				UsersController hc = new UsersController();
				hc.DetallesHabitacion1(habitacion);
			}
		});
		botonVolver.setBounds(60, 132, 50, 50);
		// CORREGIDO: new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
		ImageIcon f1 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
		Image f2 = f1.getImage();
		Image f3 = f2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
		botonVolver.setIcon(new ImageIcon(f3));
		panel.add(botonVolver);


		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
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
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
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
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 187, 249));
		panel_3.setBounds(131, 193, 300, 440);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(45, 11, 200, 200);
		// CORREGIDO: new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		ImageIcon v1 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		Image v2 = v1.getImage();
		Image v3 = v2.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(v3));
		panel_3.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Cuarto B3");
		lblNewLabel_1.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(100, 222, 100, 20);
		panel_3.add(lblNewLabel_1);

		JLabel textoHabitacion = new JLabel("Tipo de habitación:");
		textoHabitacion.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		textoHabitacion.setBounds(80, 253, 145, 20);
		panel_3.add(textoHabitacion);

		JLabel lblNewLabel_2 = new JLabel("Estándar");
		lblNewLabel_2.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(115, 284, 70, 20);
		panel_3.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Camas:");
		lblNewLabel_3.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_3.setBounds(120, 315, 60, 20);
		panel_3.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(68, 340, 168, 20);
		panel_3.add(lblNewLabel_4);

		JButton btnEditarHabitacion = new JButton("Editar habitación");
		btnEditarHabitacion.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String nuevoNombre = textField_1.getText().trim();
		        String capacidadStr = textField_2.getText().trim();
		        String nuevaDescripcion = textField_3.getText().trim();

		        if (nuevoNombre.isEmpty() || capacidadStr.isEmpty() || nuevaDescripcion.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "❗Todos los campos son obligatorios.");
		            return;
		        }

		        int nuevaCapacidad;
		        try {
		            nuevaCapacidad = Integer.parseInt(capacidadStr);
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(null, "❗La capacidad debe ser un número válido.");
		            return;
		        }

		        // Actualizar en la base de datos:
		        ConectionModel conn = new ConectionModel();
		        boolean exito = new UsersModel().editarHabitacion(conn.getConnection(),
		                habitacion.getId_habitacion(), nuevoNombre, nuevaCapacidad, nuevaDescripcion);

		        if (exito) {
		            JOptionPane.showMessageDialog(null, "✅ Habitación actualizada correctamente.");
		            frame.dispose();
		            new HomeController().PanelHabitaciones1();
		        } else {
		            JOptionPane.showMessageDialog(null, "❌ Error al actualizar la habitación.");
		        }
		    }
		});

		
		
		btnEditarHabitacion.setBackground(new Color(50, 186, 124));
		btnEditarHabitacion.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnEditarHabitacion.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEditarHabitacion.setBounds(845, 566, 270, 60);
		panel.add(btnEditarHabitacion);
		
		JLabel lblNewLabel_5 = new JLabel("Nombres de cuarto:");
		lblNewLabel_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Jost*", Font.BOLD, 22));
		lblNewLabel_5.setBounds(441, 193, 300, 40);
		panel.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setText(habitacion.getNombre());
		textField_1.setBackground(new Color(192, 192, 192));
		textField_1.setBounds(441, 244, 350, 40);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Camas:");
		lblNewLabel_6.setFont(new Font("Jost*", Font.BOLD, 22));
		lblNewLabel_6.setBounds(441, 295, 270, 40);
		panel.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setText(String.valueOf(habitacion.getCapacidad_max()));
		textField_2.setBackground(new Color(192, 192, 192));
		textField_2.setBounds(441, 346, 350, 40);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Descrpcion:");
		lblNewLabel_7.setFont(new Font("Jost*", Font.BOLD, 22));
		lblNewLabel_7.setBounds(441, 397, 270, 40);
		panel.add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setText(habitacion.getDescripcion());
		textField_3.setBackground(new Color(192, 192, 192));
		textField_3.setBounds(441, 448, 350, 40);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		
		
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void ClientesEliminar() {
		
		try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.put("Button.arc", 90); // Esquinas redondas
            UIManager.put("Button.arc", 90);
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
		panel_1.setBounds(0, 0, 1164, 95);
		panel_1.setBackground(new Color(0, 0, 0));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 95, 1164, 26);
		panel_2.setBackground(new Color(55, 54, 48));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setBounds(0, 0, 170, 95);
		
		ImageIcon icon13 = new ImageIcon(getClass().getResource("/Images/logo.png"));
        Image imagen13 = icon13.getImage().getScaledInstance(170, 95, Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(imagen13));   
		panel_1.add(logo);
		
		JLabel Titulo = new JLabel("Clientes\r\n");
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 410, 73);
		panel_1.add(Titulo);
		
		JLabel menuTitulo = new JLabel("Clientes:");
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 38));
		menuTitulo.setBounds(131, 126, 410, 56);
		panel.add(menuTitulo);
		
		JButton botonVolver = new JButton("");
		botonVolver.setForeground(new Color(255, 255, 255));
		botonVolver.setBackground(new Color(255, 255, 255));
		botonVolver.setBorderPainted(false);
		botonVolver.setFocusPainted(false);
		botonVolver.setContentAreaFilled(true);
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Clientes();
			}
		});
		botonVolver.setBounds(60, 132, 50, 50);	
		ImageIcon icon15 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
        Image imagen15 = icon15.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        botonVolver.setIcon(new ImageIcon(imagen15));
		panel.add(botonVolver);
		
		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>");
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		btnrentas.setBorderPainted(false);
		btnrentas.setContentAreaFilled(true);
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>");
		btnclientes.setForeground(Color.WHITE);
		btnclientes.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnclientes.setFocusPainted(false);
		btnclientes.setBorderPainted(false);
		btnclientes.setContentAreaFilled(true);
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>");
		btnhabitaciones.setForeground(Color.WHITE);
		btnhabitaciones.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnhabitaciones.setFocusPainted(false);
		btnhabitaciones.setBorderPainted(false);
		btnhabitaciones.setContentAreaFilled(true);
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		btnclientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.PanelHabitaciones1();
			}
		});
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>");
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
		btntarifas.setBorderPainted(false);
		btntarifas.setContentAreaFilled(true);
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(720, 140, 40, 40);	
		ImageIcon icon12 = new ImageIcon(getClass().getResource("/Images/busqueda.png"));
        Image imagen12 = icon12.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        btnBuscar.setIcon(new ImageIcon(imagen12));
		btnBuscar.setBorderPainted(false);
		btnBuscar.setFocusPainted(false);
		btnBuscar.setContentAreaFilled(true);
		panel.add(btnBuscar);
		
		JTextField textField = new JTextField("BUSCAR");
		textField.setToolTipText("");
		textField.setBounds(770, 140, 290, 40);
		textField.setColumns(10);
		textField.setBackground(new Color(217, 217, 217));
        textField.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
        textField.setForeground(Color.GRAY);
        final String placeholder = "BUSCAR";
        textField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(Color.GRAY);
                }
            }
        });
		panel.add(textField);	
		
		JButton btnEliminarCliente = new JButton("Eliminar Cliente");
		btnEliminarCliente.setBackground(new Color(239, 35, 60));
		btnEliminarCliente.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		btnEliminarCliente.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarCliente.setForeground(Color.WHITE);
		btnEliminarCliente.setFocusPainted(false);
		btnEliminarCliente.setContentAreaFilled(true);
		btnEliminarCliente.setBorderPainted(false);
		btnEliminarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
			}
		});
		btnEliminarCliente.setBounds(131, 417, 150, 26);
		panel.add(btnEliminarCliente);
		
		JButton btnCliente1 = new JButton("Usuario#123");
		btnCliente1.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCliente1.setBackground(new Color(0, 175, 185));
		btnCliente1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCliente1.setBounds(131, 257, 150, 150);
		btnCliente1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCliente1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCliente1.setHorizontalAlignment(SwingConstants.CENTER);
		btnCliente1.setVerticalAlignment(SwingConstants.CENTER);
		btnCliente1.setIconTextGap(1);
		btnCliente1.setFocusPainted(false);
		btnCliente1.setContentAreaFilled(true);
		btnCliente1.setBorderPainted(false);
		btnCliente1.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/Images/usuario.png"));
        Image imagen1 = icon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        btnCliente1.setIcon(new ImageIcon(imagen1));
		panel.add(btnCliente1);
		
		JButton btnCliente6 = new JButton("Usuario#123");
		btnCliente6.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCliente6.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCliente6.setBackground(new Color(0, 175, 185));
		btnCliente6.setBounds(131, 453, 150, 150);
		btnCliente6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCliente6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCliente6.setHorizontalAlignment(SwingConstants.CENTER);
		btnCliente6.setVerticalAlignment(SwingConstants.CENTER);
		btnCliente6.setIconTextGap(1);
		btnCliente6.setFocusPainted(false);
		btnCliente6.setContentAreaFilled(true);
		btnCliente6.setBorderPainted(false);
		
		ImageIcon icon2= new ImageIcon(getClass().getResource("/Images/usuario.png"));
        Image imagen2= icon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        btnCliente6.setIcon(new ImageIcon(imagen1));
		panel.add(btnCliente6);
		
		JButton btnCliente2 = new JButton("Usuario#123");
		btnCliente2.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCliente2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCliente2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCliente2.setVerticalAlignment(SwingConstants.CENTER);
		btnCliente2.setIconTextGap(1);
		btnCliente2.setFocusPainted(false);
		btnCliente2.setContentAreaFilled(true);
		btnCliente2.setBorderPainted(false);
		btnCliente2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCliente2.setHorizontalAlignment(SwingConstants.CENTER);
		btnCliente2.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCliente2.setBackground(new Color(0, 175, 185));
		btnCliente2.setBounds(331, 257, 150, 150);
		ImageIcon icon3= new ImageIcon(getClass().getResource("/Images/usuario.png"));
        Image imagen3= icon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        btnCliente2.setIcon(new ImageIcon(imagen3));
		panel.add(btnCliente2);
		
		JButton btnCliente7 = new JButton("Usuario#123");
		btnCliente7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCliente7.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCliente7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCliente7.setVerticalAlignment(SwingConstants.CENTER);
		btnCliente7.setIconTextGap(1);
		btnCliente7.setFocusPainted(false);
		btnCliente7.setContentAreaFilled(true);
		btnCliente7.setBorderPainted(false);
		btnCliente7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCliente7.setHorizontalAlignment(SwingConstants.CENTER);
		btnCliente7.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCliente7.setBackground(new Color(0, 175, 185));
		btnCliente7.setBounds(331, 453, 150, 150);
		ImageIcon icon4= new ImageIcon(getClass().getResource("/Images/usuario.png"));
        Image imagen4= icon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        btnCliente7.setIcon(new ImageIcon(imagen4));
		panel.add(btnCliente7);
		
		JButton btnCliente3 = new JButton("Usuario#123");
		btnCliente3.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCliente3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCliente3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCliente3.setVerticalAlignment(SwingConstants.CENTER);
		btnCliente3.setIconTextGap(1);
		btnCliente3.setFocusPainted(false);
		btnCliente3.setContentAreaFilled(true);
		btnCliente3.setBorderPainted(false);
		btnCliente3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCliente3.setHorizontalAlignment(SwingConstants.CENTER);
		btnCliente3.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCliente3.setBackground(new Color(0, 175, 185));
		btnCliente3.setBounds(531, 257, 150, 150);
		ImageIcon icon5 = new ImageIcon(getClass().getResource("/Images/usuario.png"));
        Image imagen5 = icon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        btnCliente3.setIcon(new ImageIcon(imagen3));
		panel.add(btnCliente3);
		
		JButton btnCliente4 = new JButton("Usuario#123");
		btnCliente4.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCliente4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCliente4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCliente4.setVerticalAlignment(SwingConstants.CENTER);
		btnCliente4.setIconTextGap(1);
		btnCliente4.setFocusPainted(false);
		btnCliente4.setContentAreaFilled(true);
		btnCliente4.setBorderPainted(false);
		btnCliente4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCliente4.setHorizontalAlignment(SwingConstants.CENTER);
		btnCliente4.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCliente4.setBackground(new Color(0, 175, 185));
		btnCliente4.setBounds(731, 257, 150, 150);
		ImageIcon icon6= new ImageIcon(getClass().getResource("/Images/usuario.png"));
        Image imagen6= icon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        btnCliente4.setIcon(new ImageIcon(imagen6));
		panel.add(btnCliente4);
		
		JButton btnCliente5 = new JButton("Usuario#123");
		btnCliente5.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCliente5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCliente5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCliente5.setVerticalAlignment(SwingConstants.CENTER);
		btnCliente5.setIconTextGap(1);
		btnCliente5.setFocusPainted(false);
		btnCliente5.setContentAreaFilled(true);
		btnCliente5.setBorderPainted(false);
		btnCliente5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCliente5.setHorizontalAlignment(SwingConstants.CENTER);
		btnCliente5.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCliente5.setBackground(new Color(0, 175, 185));
		btnCliente5.setBounds(931, 257, 150, 150);
		ImageIcon icon7= new ImageIcon(getClass().getResource("/Images/usuario.png"));
        Image imagen7= icon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        btnCliente5.setIcon(new ImageIcon(imagen7));
		panel.add(btnCliente5);
		
		JButton btnCliente8 = new JButton("Usuario#123");
		btnCliente8.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCliente8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCliente8.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCliente8.setVerticalAlignment(SwingConstants.CENTER);
		btnCliente8.setIconTextGap(1);
		btnCliente8.setFocusPainted(false);
		btnCliente8.setContentAreaFilled(true);
		btnCliente8.setBorderPainted(false);
		btnCliente8.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCliente8.setHorizontalAlignment(SwingConstants.CENTER);
		btnCliente8.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCliente8.setBackground(new Color(0, 175, 185));
		btnCliente8.setBounds(531, 453, 150, 150);
		ImageIcon icon8= new ImageIcon(getClass().getResource("/Images/usuario.png"));
        Image imagen8 = icon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        btnCliente8.setIcon(new ImageIcon(imagen8));
		panel.add(btnCliente8);
		
		JButton btnCliente9 = new JButton("Usuario#123");
		btnCliente9.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCliente9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCliente9.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCliente9.setVerticalAlignment(SwingConstants.CENTER);
		btnCliente9.setIconTextGap(1);
		btnCliente9.setFocusPainted(false);
		btnCliente9.setContentAreaFilled(true);
		btnCliente9.setBorderPainted(false);
		btnCliente9.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCliente9.setHorizontalAlignment(SwingConstants.CENTER);
		btnCliente9.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCliente9.setBackground(new Color(0, 175, 185));
		btnCliente9.setBounds(731, 453, 150, 150);
		ImageIcon icon10= new ImageIcon(getClass().getResource("/Images/usuario.png"));
        Image imagen10 = icon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        btnCliente9.setIcon(new ImageIcon(imagen10));
		panel.add(btnCliente9);
		
		JButton btnCliente10 = new JButton("Usuario#123");
		btnCliente10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCliente10.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCliente10.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCliente10.setVerticalAlignment(SwingConstants.CENTER);
		btnCliente10.setIconTextGap(1);
		btnCliente10.setFocusPainted(false);
		btnCliente10.setContentAreaFilled(true);
		btnCliente10.setBorderPainted(false);
		btnCliente10.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCliente10.setHorizontalAlignment(SwingConstants.CENTER);
		btnCliente10.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCliente10.setBackground(new Color(0, 175, 185));
		btnCliente10.setBounds(931, 453, 150, 150);
		ImageIcon icon11= new ImageIcon(getClass().getResource("/Images/usuario.png"));
        Image imagen11= icon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        btnCliente10.setIcon(new ImageIcon(imagen10));
		panel.add(btnCliente10);
		
		JButton btnEliminarCliente2 = new JButton("Eliminar Cliente");
		btnEliminarCliente2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminarCliente2.setForeground(Color.WHITE);
		btnEliminarCliente2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		btnEliminarCliente2.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarCliente2.setBackground(new Color(239, 35, 60));
		btnEliminarCliente2.setBounds(331, 417, 150, 26);
		btnEliminarCliente2.setFocusPainted(false);
		btnEliminarCliente2.setContentAreaFilled(true);
		btnEliminarCliente2.setBorderPainted(false);
		panel.add(btnEliminarCliente2);
		
		JButton btnEliminarCliente3 = new JButton("Eliminar Cliente");
		btnEliminarCliente3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminarCliente3.setForeground(Color.WHITE);
		btnEliminarCliente3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		btnEliminarCliente3.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarCliente3.setBackground(new Color(239, 35, 60));
		btnEliminarCliente3.setBounds(531, 417, 150, 26);
		btnEliminarCliente3.setFocusPainted(false);
		btnEliminarCliente3.setContentAreaFilled(true);
		btnEliminarCliente3.setBorderPainted(false);
		panel.add(btnEliminarCliente3);
		
		JButton btnEliminarCliente4 = new JButton("Eliminar Cliente");
		btnEliminarCliente4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminarCliente4.setForeground(Color.WHITE);
		btnEliminarCliente4.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		btnEliminarCliente4.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarCliente4.setBackground(new Color(239, 35, 60));
		btnEliminarCliente4.setBounds(731, 417, 150, 26);
		btnEliminarCliente4.setFocusPainted(false);
		btnEliminarCliente4.setContentAreaFilled(true);
		btnEliminarCliente4.setBorderPainted(false);
		panel.add(btnEliminarCliente4);
		
		JButton btnEliminarCliente5 = new JButton("Eliminar Cliente");
		btnEliminarCliente5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminarCliente5.setForeground(Color.WHITE);
		btnEliminarCliente5.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		btnEliminarCliente5.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarCliente5.setBackground(new Color(239, 35, 60));
		btnEliminarCliente5.setBounds(931, 417, 150, 26);
		btnEliminarCliente5.setFocusPainted(false);
		btnEliminarCliente5.setContentAreaFilled(true);
		btnEliminarCliente5.setBorderPainted(false);
		panel.add(btnEliminarCliente5);
		
		JButton btnEliminarCliente6 = new JButton("Eliminar Cliente");
		btnEliminarCliente6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminarCliente6.setForeground(Color.WHITE);
		btnEliminarCliente6.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		btnEliminarCliente6.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarCliente6.setBackground(new Color(239, 35, 60));
		btnEliminarCliente6.setBounds(131, 613, 150, 26);
		btnEliminarCliente6.setFocusPainted(false);
		btnEliminarCliente6.setContentAreaFilled(true);
		btnEliminarCliente6.setBorderPainted(false);
		panel.add(btnEliminarCliente6);
		
		JButton btnEliminarCliente7 = new JButton("Eliminar Cliente");
		btnEliminarCliente7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminarCliente7.setForeground(Color.WHITE);
		btnEliminarCliente7.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		btnEliminarCliente7.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarCliente7.setBackground(new Color(239, 35, 60));
		btnEliminarCliente7.setBounds(331, 613, 150, 26);
		btnEliminarCliente7.setFocusPainted(false);
		btnEliminarCliente7.setContentAreaFilled(true);
		btnEliminarCliente7.setBorderPainted(false);
		panel.add(btnEliminarCliente7);
		
		JButton btnEliminarCliente8 = new JButton("Eliminar Cliente");
		btnEliminarCliente8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminarCliente8.setForeground(Color.WHITE);
		btnEliminarCliente8.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		btnEliminarCliente8.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarCliente8.setBackground(new Color(239, 35, 60));
		btnEliminarCliente8.setBounds(531, 613, 150, 26);
		btnEliminarCliente8.setFocusPainted(false);
		btnEliminarCliente8.setContentAreaFilled(true);
		btnEliminarCliente8.setBorderPainted(false);
		panel.add(btnEliminarCliente8);
		
		JButton btnEliminarCliente9 = new JButton("Eliminar Cliente");
		btnEliminarCliente9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminarCliente9.setForeground(Color.WHITE);
		btnEliminarCliente9.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		btnEliminarCliente9.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarCliente9.setBackground(new Color(239, 35, 60));
		btnEliminarCliente9.setBounds(731, 613, 150, 26);
		btnEliminarCliente9.setFocusPainted(false);
		btnEliminarCliente9.setContentAreaFilled(true);
		btnEliminarCliente9.setBorderPainted(false);
		panel.add(btnEliminarCliente9);
		
		JButton btnEliminarCliente10 = new JButton("Eliminar Cliente");
		btnEliminarCliente10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminarCliente10.setForeground(Color.WHITE);
		btnEliminarCliente10.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		btnEliminarCliente10.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarCliente10.setBackground(new Color(239, 35, 60));
		btnEliminarCliente10.setBounds(931, 613, 150, 26);
		btnEliminarCliente10.setFocusPainted(false);
		btnEliminarCliente10.setContentAreaFilled(true);
		btnEliminarCliente10.setBorderPainted(false);
		panel.add(btnEliminarCliente10);
		
		JButton btnPrincipalEliminarCliente = new JButton("Eliminar Cliente");
		btnPrincipalEliminarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPrincipalEliminarCliente.setForeground(Color.WHITE);
		btnPrincipalEliminarCliente.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
		btnPrincipalEliminarCliente.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnPrincipalEliminarCliente.setBackground(new Color(239, 35, 60));
		btnPrincipalEliminarCliente.setBounds(131, 192, 216, 40);
		btnPrincipalEliminarCliente.setFocusPainted(false);
		btnPrincipalEliminarCliente.setContentAreaFilled(true);
		btnPrincipalEliminarCliente.setBorderPainted(false);
		panel.add(btnPrincipalEliminarCliente);
		
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	
	
	public void DatosUsuario(Cliente cliente) {

		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1180, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel(); //Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel(); //Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel logo = new JLabel(""); //Logo
		logo.setBounds(0, 0, 170, 95);
		// CORREGIDO: new ImageIcon(getClass().getResource("/Images/logo.png"));
		ImageIcon portada1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
	    Image portada2 = portada1.getImage();
	    Image portada3 = portada2.getScaledInstance(170, 95,Image.SCALE_SMOOTH);
	    logo.setIcon(new ImageIcon(portada3));
		panel_1.add(logo);

		JLabel Titulo = new JLabel("Clientes"); //Titulo
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 410, 73);
		panel_1.add(Titulo);

		JLabel menuTitulo = new JLabel("Detalles del cliente"); //Texto menú
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 38));
		menuTitulo.setBounds(131, 126, 500, 56);
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
				hc.Clientes();
			}
		});
		botonVolver.setBounds(60, 132, 50, 50);
		ImageIcon f1 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
		Image f2 = f1.getImage();
		Image f3 = f2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
		botonVolver.setIcon(new ImageIcon(f3));
		panel.add(botonVolver);

		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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

		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);

		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
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
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);

		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
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
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);

		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);
		
		ImageIcon u1 = new ImageIcon(getClass().getResource("/Images/busqueda.png"));
		Image u2 = u1.getImage();
		Image u3 = u2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        final String placeholder = "BUSCAR";

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 175, 185));
		panel_3.setBounds(131, 193, 300, 440);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(45, 11, 200, 200);
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/Images/usuario.png"));
        Image imagen1 = icon1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        lblNewLabel.setIcon(new ImageIcon(imagen1));
		panel_3.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ID del cliente:\r\n");
		lblNewLabel_1.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(90, 222, 135, 20);
		panel_3.add(lblNewLabel_1);

		JLabel textoHabitacion = new JLabel("Nombre:");
		textoHabitacion.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		textoHabitacion.setBounds(120, 283, 145, 20);
		panel_3.add(textoHabitacion);

		JLabel lblNewLabel_3 = new JLabel("Correo:\r\n");
		lblNewLabel_3.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_3.setBounds(120, 326, 60, 20);
		panel_3.add(lblNewLabel_3);

		JLabel lblNewLabel_5 = new JLabel("Telefono\r\n:");
		lblNewLabel_5.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_5.setBounds(120, 368, 80, 20);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblIdCliente = new JLabel("Usuario#" + cliente.getIdClientes());
		lblIdCliente.setForeground(Color.WHITE);
		lblIdCliente.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		lblIdCliente.setBounds(90, 252, 135, 20);
		panel_3.add(lblIdCliente);
		
		JLabel lblNombreCliente = new JLabel(cliente.getNombreCliente());
		lblNombreCliente.setForeground(Color.WHITE);
		lblNombreCliente.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		lblNombreCliente.setBounds(75, 302, 200, 20);
		panel_3.add(lblNombreCliente);
		
		JLabel lblCorreo = new JLabel(cliente.getCorreo());
		lblCorreo.setForeground(Color.WHITE);
		lblCorreo.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		lblCorreo.setBounds(45, 348, 220, 20);
		panel_3.add(lblCorreo);
		
		JLabel lblTelefono = new JLabel(cliente.getTelefono());
		lblTelefono.setForeground(Color.WHITE);
		lblTelefono.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		lblTelefono.setBounds(110, 398, 115, 20);
		panel_3.add(lblTelefono);

		JButton btnHistorial = new JButton("Editar cliente");
		btnHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				new UsersController().EditarDatosCliente(cliente);	
			}
		});
		btnHistorial.setBackground(new Color(50, 186, 124));
		btnHistorial.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnHistorial.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnHistorial.setBounds(856, 573, 270, 60);
		panel.add(btnHistorial);
		
		JLabel HistorialRentas = new JLabel("Historial de rentas:\r\n");
		HistorialRentas.setFont(new Font("Jost*", Font.BOLD, 32));
		HistorialRentas.setBounds(441, 193, 430, 40);
		panel.add(HistorialRentas);
		
//		JButton btnDescargarHistorial = new JButton("Descargar historial ");
//		btnDescargarHistorial.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
//		btnDescargarHistorial.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
//		btnDescargarHistorial.setBackground(new Color(255, 214, 10));
//		btnDescargarHistorial.setBounds(856, 474, 270, 60);
//		panel.add(btnDescargarHistorial);
		
		JLabel FechaRenta1 = new JLabel("Renta 14: día 15 de mayo 2024\r\n");
		FechaRenta1.setBackground(new Color(255, 255, 255));
		FechaRenta1.setFont(new Font("Jost*", Font.BOLD, 16));
		FechaRenta1.setBounds(441, 244, 370, 40);
		panel.add(FechaRenta1);
		
		JLabel FechaRenta2 = new JLabel("Renta 13: día 23 de agosto 2018\r\n");
		FechaRenta2.setFont(new Font("Jost*", Font.BOLD, 16));
		FechaRenta2.setBackground(Color.WHITE);
		FechaRenta2.setBounds(441, 295, 370, 40);
		panel.add(FechaRenta2);
		
		JLabel FechaRenta3 = new JLabel("Renta 12: día 2 de abril 2016\r\n");
		FechaRenta3.setFont(new Font("Jost*", Font.BOLD, 16));
		FechaRenta3.setBackground(Color.WHITE);
		FechaRenta3.setBounds(441, 346, 370, 40);
		panel.add(FechaRenta3);
		
		JLabel lblHabitacionesRentadas = new JLabel("Habitaciones rentadas:");
		lblHabitacionesRentadas.setFont(new Font("Jost*", Font.BOLD, 32));
		lblHabitacionesRentadas.setBounds(441, 397, 430, 40);
		panel.add(lblHabitacionesRentadas);
		
		JLabel lblRentaHabitacin = new JLabel("Renta 14: Habitación normal\r\n");
		lblRentaHabitacin.setFont(new Font("Jost*", Font.BOLD, 16));
		lblRentaHabitacin.setBackground(Color.WHITE);
		lblRentaHabitacin.setBounds(441, 448, 370, 40);
		panel.add(lblRentaHabitacin);
		
		JLabel lblRentaHabitacin_3 = new JLabel("Renta 13: Habitación de lujo\r\n");
		lblRentaHabitacin_3.setFont(new Font("Jost*", Font.BOLD, 16));
		lblRentaHabitacin_3.setBackground(Color.WHITE);
		lblRentaHabitacin_3.setBounds(441, 502, 370, 40);
		panel.add(lblRentaHabitacin_3);
		
		JLabel lblRenta = new JLabel("Renta 12: 2 Habitaciones de lujo\r\n");
		lblRenta.setFont(new Font("Jost*", Font.BOLD, 16));
		lblRenta.setBackground(Color.WHITE);
		lblRenta.setBounds(441, 553, 370, 40);
		panel.add(lblRenta);
		
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void EditarDatosCliente(Cliente cliente) {
		

		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1180, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel(); //Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel(); //Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel logo = new JLabel(""); //Logo
		logo.setBounds(0, 0, 170, 95);
		// CORREGIDO: new ImageIcon(getClass().getResource("/Images/logo.png"));
		ImageIcon portada1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
	    Image portada2 = portada1.getImage();
	    Image portada3 = portada2.getScaledInstance(170, 95,Image.SCALE_SMOOTH);
	    logo.setIcon(new ImageIcon(portada3));
		panel_1.add(logo);

		JLabel Titulo = new JLabel("Clientes"); //Titulo
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 410, 73);
		panel_1.add(Titulo);

		JLabel menuTitulo = new JLabel("Editar datos"); //Texto menú
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 38));
		menuTitulo.setBounds(131, 126, 441, 56);
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
				UsersController hc = new UsersController();
				hc.DatosUsuario(cliente); 
			}
		});
		botonVolver.setBounds(60, 132, 50, 50);
		ImageIcon f1 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
		Image f2 = f1.getImage();
		Image f3 = f2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
		botonVolver.setIcon(new ImageIcon(f3));
		panel.add(botonVolver);

		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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

		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);

		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
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
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);

		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
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
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);

		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);
		// CORREGIDO: new ImageIcon(getClass().getResource("/Images/busqueda.png"));
		ImageIcon u1 = new ImageIcon(getClass().getResource("/Images/busqueda.png"));
		Image u2 = u1.getImage();
		Image u3 = u2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        final String placeholder = "BUSCAR";

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 175, 185));
		panel_3.setBounds(131, 193, 300, 440);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(45, 11, 200, 200);
		// CORREGIDO: new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/Images/usuario.png"));
        Image imagen1 = icon1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        lblNewLabel.setIcon(new ImageIcon(imagen1));
		panel_3.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ID del cliente:\r\n");
		
		lblNewLabel_1.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(90, 222, 135, 20);
		panel_3.add(lblNewLabel_1);

		JLabel textoHabitacion = new JLabel("Nombre:");
		textoHabitacion.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		textoHabitacion.setBounds(120, 272, 145, 20);
		panel_3.add(textoHabitacion);

		JLabel lblNewLabel_3 = new JLabel("Correo:\r\n");
		lblNewLabel_3.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_3.setBounds(120, 326, 60, 20);
		panel_3.add(lblNewLabel_3);

		JLabel lblNewLabel_5 = new JLabel("Telefono\r\n:");
		lblNewLabel_5.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_5.setBounds(120, 368, 80, 20);
		panel_3.add(lblNewLabel_5);

		JButton btnHistorial = new JButton("Editar datos");
		btnHistorial.setBackground(new Color(255, 214, 10));
		btnHistorial.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnHistorial.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		btnHistorial.setBounds(856, 573, 270, 60);
		panel.add(btnHistorial);
//*************************************************************************************************************************	
		btnHistorial.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int respuesta = JOptionPane.showConfirmDialog(
		            null,
		            "¿Estás seguro de que deseas guardar los cambios?",
		            "Confirmación",
		            JOptionPane.YES_NO_OPTION,
		            JOptionPane.QUESTION_MESSAGE
		        );

		        if (respuesta == JOptionPane.YES_OPTION) {
		        	String nombreEditado = textField_2.getText().trim();
		        	String telefonoEditado = textField_3.getText().trim();
		        	String correoEditado = textField_4.getText().trim();

		        	Cliente clienteEditado = new Cliente(cliente.getIdClientes(), nombreEditado, telefonoEditado, correoEditado);

		        	ConectionModel conn = new ConectionModel();
		        	boolean exito = new UsersModel().actualizarCliente(conn.getConnection(), clienteEditado);

		        	if (exito) {
		        	    JOptionPane.showMessageDialog(null, "✅ Datos actualizados exitosamente.");
		        	    frame.dispose();
		                UsersController uc = new UsersController();
		                uc.DatosUsuario(clienteEditado); 
		        	} else {
		        	    JOptionPane.showMessageDialog(null, "❌ Error al actualizar los datos.");
		        	}

		        }
		    }
		});
//*************************************************************************************************************************	
		JLabel menuTitulo_1 = new JLabel("ID del cliente:");
		menuTitulo_1.setFont(new Font("Dialog", Font.BOLD, 24));
		menuTitulo_1.setBounds(441, 193, 400, 40);
		panel.add(menuTitulo_1);
		
		JTextField textField_1 = new JTextField();
		textField_1.setText(String.valueOf(cliente.getIdClientes()));
		textField_1.setEditable(false); 
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(441, 244, 400, 40);
		panel.add(textField_1);
		textField_1.setColumns(10);

		
		JLabel menuTitulo_1_1 = new JLabel("Nombre del cliente:");
		menuTitulo_1_1.setFont(new Font("Dialog", Font.BOLD, 24));
		menuTitulo_1_1.setBounds(441, 295, 400, 40);
		panel.add(menuTitulo_1_1);
		
		// Nombre del cliente:
		textField_2 = new JTextField(); 
		textField_2.setText(cliente.getNombreCliente());
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(441, 346, 400, 40);
		panel.add(textField_2);
		
		JLabel menuTitulo_1_1_1 = new JLabel("Numero del cliente:");
		menuTitulo_1_1_1.setFont(new Font("Dialog", Font.BOLD, 24));
		menuTitulo_1_1_1.setBounds(441, 397, 400, 40);
		panel.add(menuTitulo_1_1_1);
		
		// Número de teléfono":
		 textField_3 = new JTextField();
		textField_3.setText(cliente.getTelefono());
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(441, 448, 400, 40);
		panel.add(textField_3);
		
		JLabel menuTitulo_1_1_1_1 = new JLabel("Correo electronico:");
		menuTitulo_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 24));
		menuTitulo_1_1_1_1.setBounds(441, 499, 400, 40);
		panel.add(menuTitulo_1_1_1_1);
		
		// Correo electrónico:
		textField_4 = new JTextField();
		textField_4.setText(cliente.getCorreo());
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBounds(441, 550, 400, 40);
		panel.add(textField_4);
		
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
	
	public void CrearNuevoCliente() {

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
	    ImageIcon portada1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
	    Image portada2 = portada1.getImage();
	    Image portada3 = portada2.getScaledInstance(170, 95, Image.SCALE_SMOOTH);
	    logo.setIcon(new ImageIcon(portada3));
	    panel_1.add(logo);

	    JLabel Titulo = new JLabel("Panel de clientes:");
	    Titulo.setForeground(new Color(255, 255, 255));
	    Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
	    Titulo.setBounds(180, 11, 500, 73);
	    panel_1.add(Titulo);

	    JLabel menuTitulo = new JLabel("Crear nuevo cliente:");
	    menuTitulo.setFont(new Font("Jost*", Font.BOLD, 38));
	    menuTitulo.setBounds(131, 126, 528, 56);
	    panel.add(menuTitulo);

	    JButton botonVolver = new JButton("");
	    botonVolver.setForeground(new Color(255, 255, 255));
	    botonVolver.setBackground(new Color(255, 255, 255));
	    botonVolver.setBorderPainted(false);
	    botonVolver.setFocusPainted(false);
	    botonVolver.setContentAreaFilled(true);
	    botonVolver.setBounds(60, 132, 50, 50);
	    botonVolver.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png")).getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH)));
	    botonVolver.addActionListener(e -> {
	        frame.dispose();
	        HomeController hc = new HomeController();
	        hc.Clientes();
	    });
	    panel.add(botonVolver);

	    JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>");
	    btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
	    btnTiposDeRentas.setForeground(Color.WHITE);
	    btnTiposDeRentas.setBackground(new Color(56, 54, 41));
	    btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
	    btnTiposDeRentas.setBounds(974, 0, 180, 23);
	    btnTiposDeRentas.addActionListener(e -> {
	        frame.dispose();
	        HomeController hc = new HomeController();
	        hc.TiposHabitacion();
	    });
	    panel_2.add(btnTiposDeRentas);

	    JButton btnTiposDeRentas1 = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas1.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas1.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas1.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas1.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnTiposDeRentas1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.TiposHabitacion();
			}
		});
		btnTiposDeRentas1.setBounds(974, 0, 180, 23);
		btnTiposDeRentas1.setBorderPainted(false);
        btnTiposDeRentas1.setFocusPainted(false);
        btnTiposDeRentas1.setContentAreaFilled(true);
		panel_2.add(btnTiposDeRentas1);
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
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
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
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
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);

	    JPanel panel_3 = new JPanel();
	    panel_3.setBackground(new Color(0, 175, 185));
	    panel_3.setBounds(131, 193, 300, 440);
	    panel.add(panel_3);
	    panel_3.setLayout(null);

	    JLabel lblNewLabel = new JLabel("");
	    lblNewLabel.setBounds(45, 11, 200, 200);
	    lblNewLabel.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Images/usuario.png")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
	    panel_3.add(lblNewLabel);

	    JLabel lblNewLabel_1 = new JLabel("ID del cliente:");
	    lblNewLabel_1.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 20));
	    lblNewLabel_1.setBounds(90, 222, 135, 20);
	    panel_3.add(lblNewLabel_1);

	    JLabel textoHabitacion = new JLabel("Nombre:");
	    textoHabitacion.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
	    textoHabitacion.setBounds(120, 272, 145, 20);
	    panel_3.add(textoHabitacion);

	    JLabel lblNewLabel_3 = new JLabel("Correo:");
	    lblNewLabel_3.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
	    lblNewLabel_3.setBounds(127, 318, 60, 20);
	    panel_3.add(lblNewLabel_3);

	    JLabel lblNewLabel_5 = new JLabel("Telefono:");
	    lblNewLabel_5.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
	    lblNewLabel_5.setBounds(120, 368, 80, 20);
	    panel_3.add(lblNewLabel_5);
	    
	    //Los jtextfield para poder agarra los datos del usuario y subirlo ala base de datos. 
	    //id
	    JTextField textField_1 = new JTextField(); 
	    textField_1.setBounds(441, 258, 350, 40);
	    textField_1.setBackground(new Color(192, 192, 192));
	    panel.add(textField_1);

	    //NOMBRE
	    JTextField textField_2 = new JTextField(); 
	    textField_2.setBounds(441, 358, 350, 40);
	    textField_2.setBackground(new Color(192, 192, 192));
	    panel.add(textField_2);
	    
	    //NUMERO DE TELEFONO
	    JTextField textField_3 = new JTextField();
	    textField_3.setBounds(441, 455, 350, 40);
	    textField_3.setBackground(new Color(192, 192, 192));
	    panel.add(textField_3);
	    
	    //CORREO
	    JTextField textField_4 = new JTextField(); 
	    textField_4.setBounds(441, 555, 350, 40);
	    textField_4.setBackground(new Color(192, 192, 192));
	    panel.add(textField_4);

	    JLabel menuTitulo_1 = new JLabel("ID del cliente:");
	    menuTitulo_1.setFont(new Font("Dialog", Font.BOLD, 24));
	    menuTitulo_1.setBounds(441, 192, 350, 56);
	    panel.add(menuTitulo_1);

	    JLabel menuTitulo_1_1 = new JLabel("Nombre del cliente:");
	    menuTitulo_1_1.setFont(new Font("Dialog", Font.BOLD, 24));
	    menuTitulo_1_1.setBounds(441, 308, 350, 56);
	    panel.add(menuTitulo_1_1);

	    JLabel menuTitulo_1_1_1 = new JLabel("Numero del cliente:");
	    menuTitulo_1_1_1.setFont(new Font("Dialog", Font.BOLD, 24));
	    menuTitulo_1_1_1.setBounds(441, 408, 350, 56);
	    panel.add(menuTitulo_1_1_1);

	    JLabel menuTitulo_1_1_1_1 = new JLabel("Correo electronico:");
	    menuTitulo_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 24));
	    menuTitulo_1_1_1_1.setBounds(441, 505, 350, 56);
	    panel.add(menuTitulo_1_1_1_1);

	    JButton btnHistorial = new JButton("Crear nuevo cliente");
	    btnHistorial.setBackground(new Color(255, 214, 10));
	    btnHistorial.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
	    btnHistorial.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
	    btnHistorial.setBounds(856, 573, 270, 60);
	    panel.add(btnHistorial);
//*************************************************************************************************************************	
	    //BOTON PARA GUARDAR LOS DATOS ALA BASE DE DATOS.
	    btnHistorial.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            String idTexto = textField_1.getText().trim();
	            String nombre = textField_2.getText().trim();
	            String telefono = textField_3.getText().trim();
	            String correo = textField_4.getText().trim();

	            if (idTexto.isEmpty() || nombre.isEmpty() || telefono.isEmpty() || correo.isEmpty()) {
	                JOptionPane.showMessageDialog(frame, "⚠️ Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
	                return;
	            }

	            int id;
	            try {
	                id = Integer.parseInt(idTexto);
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(frame, "⚠️ El ID debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
	                return;
	            }

	            Cliente cliente = new Cliente(id, nombre, telefono, correo);

	            ConectionModel conn = new ConectionModel();
	            boolean exito = new UsersModel().guardarCliente(conn.getConnection(), cliente);

	            if (exito) {
	                JOptionPane.showMessageDialog(frame, "✅ Cliente creado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
	                frame.dispose();
	                HomeController hc = new HomeController();
	                hc.Clientes();
	            } else {
	                JOptionPane.showMessageDialog(frame, "❌ Error al guardar el cliente.", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    });
//*************************************************************************************************************************	

	    frame.getContentPane().add(panel);
	    frame.repaint();
	    frame.revalidate();
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	}

	public void DatosRenta() {

		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1180, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel(); //Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel(); //Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel logo = new JLabel(""); //Logo
		logo.setBounds(0, 0, 170, 95);
		// CORREGIDO: new ImageIcon(getClass().getResource("/Images/logo.png"));
		ImageIcon portada1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
	    Image portada2 = portada1.getImage();
	    Image portada3 = portada2.getScaledInstance(170, 95,Image.SCALE_SMOOTH);
	    logo.setIcon(new ImageIcon(portada3));
		panel_1.add(logo);

		JLabel Titulo = new JLabel("Rentas\r\n"); //Titulo
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 410, 73);
		panel_1.add(Titulo);

		JLabel menuTitulo = new JLabel("Detalles de la habitación:"); //Texto menú
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 38));
		menuTitulo.setBounds(131, 126, 565, 56);
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
				hc.Rentas();	
			}
		});
		botonVolver.setBounds(60, 132, 50, 50);
		// CORREGIDO: new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
		ImageIcon f1 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
		Image f2 = f1.getImage();
		Image f3 = f2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
		botonVolver.setIcon(new ImageIcon(f3));
		panel.add(botonVolver);


		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
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
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
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
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 187, 249));
		panel_3.setBounds(103, 228, 313, 422);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(57, 11, 200, 170);
		// CORREGIDO: new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		ImageIcon v1 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		Image v2 = v1.getImage();
		Image v3 = v2.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(v3));
		panel_3.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Cuarto B3");
		lblNewLabel_1.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(110, 192, 100, 20);
		panel_3.add(lblNewLabel_1);

		JLabel textoHabitacion = new JLabel("Tipo de habitación:");
		textoHabitacion.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		textoHabitacion.setBounds(90, 223, 167, 20);
		panel_3.add(textoHabitacion);

		JLabel lblNewLabel_2 = new JLabel("Suit");
		lblNewLabel_2.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(142, 254, 35, 20);
		panel_3.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Camas:");
		lblNewLabel_3.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_3.setBounds(131, 285, 60, 20);
		panel_3.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("4 Camas individuales");
		lblNewLabel_4.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(76, 316, 168, 20);
		panel_3.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Ocupante:");
		lblNewLabel_5.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_5.setBounds(120, 347, 80, 20);
		panel_3.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Diego Ontiveros");
		lblNewLabel_6.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(90, 378, 154, 20);
		panel_3.add(lblNewLabel_6);

		JButton btnOcupado = new JButton("OCUPADO");
		btnOcupado.setBackground(new Color(239, 35, 60));
		btnOcupado.setForeground(Color.WHITE);
		btnOcupado.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnOcupado.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnOcupado.setBounds(120, 177, 296, 40);
		panel.add(btnOcupado);

		JButton btnHistorial = new JButton("Check out \r\n");
		btnHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    JOptionPane.showMessageDialog(
			        null, 
			        "La habitación se liberará a las 7:00 a.m.", 
			        "Información", 
			        JOptionPane.INFORMATION_MESSAGE
			    );
			}
			});

		btnHistorial.setBackground(new Color(255, 214, 10));
		btnHistorial.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnHistorial.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnHistorial.setBounds(426, 441, 270, 60);
		panel.add(btnHistorial);

		JButton btnEditarHabitacion = new JButton("Liberar habitacion");
		btnEditarHabitacion.setForeground(new Color(255, 255, 255));
		btnEditarHabitacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.DatosRenta2();
			}
		});
	
		btnEditarHabitacion.setBackground(new Color(50, 186, 124));
		btnEditarHabitacion.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnEditarHabitacion.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEditarHabitacion.setBounds(426, 228, 270, 60);
		panel.add(btnEditarHabitacion);
		
		JButton btnModificarReserva = new JButton("Modificar reserva\r\n");
		btnModificarReserva.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
		btnModificarReserva.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnModificarReserva.setBackground(new Color(255, 214, 10));
		btnModificarReserva.setBounds(426, 299, 270, 60);
		btnModificarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.RentasModificarReserva();	
			}
		});
		panel.add(btnModificarReserva);
		
//		JButton btnEditarHabitacion_1_1 = new JButton("Bloquear por mantemiento \r\n");
//		btnEditarHabitacion_1_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
//		btnEditarHabitacion_1_1.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
//		btnEditarHabitacion_1_1.setBackground(SystemColor.activeCaptionBorder);
//		btnEditarHabitacion_1_1.setBounds(426, 370, 270, 60);
//		panel.add(btnEditarHabitacion_1_1);
		
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void DatosRenta2() {

		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1180, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel(); //Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel(); //Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel logo = new JLabel(""); //Logo
		logo.setBounds(0, 0, 170, 95);
		// CORREGIDO: new ImageIcon(getClass().getResource("/Images/logo.png"));
		ImageIcon portada1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
	    Image portada2 = portada1.getImage();
	    Image portada3 = portada2.getScaledInstance(170, 95,Image.SCALE_SMOOTH);
	    logo.setIcon(new ImageIcon(portada3));
		panel_1.add(logo);

		JLabel Titulo = new JLabel("Rentas\r\n"); //Titulo
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 410, 73);
		panel_1.add(Titulo);

		JLabel menuTitulo = new JLabel("Detalles de la habitación:"); //Texto menú
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 38));
		menuTitulo.setBounds(131, 126, 565, 56);
		panel.add(menuTitulo);

		JButton botonVolver = new JButton(""); // Boton para volver atrás
		botonVolver.setForeground(new Color(255, 255, 255));
		botonVolver.setBackground(new Color(255, 255, 255));
		botonVolver.setBorderPainted(false);
		botonVolver.setFocusPainted(false);
		botonVolver.setContentAreaFilled(true);
		botonVolver.setBounds(60, 132, 50, 50);
		// CORREGIDO: new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
		ImageIcon f1 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
		Image f2 = f1.getImage();
		Image f3 = f2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
		botonVolver.setIcon(new ImageIcon(f3));
		panel.add(botonVolver);
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Rentas();
			}
		});


		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
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
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
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
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 187, 249));
		panel_3.setBounds(103, 228, 313, 422);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(57, 11, 200, 170);
		// CORREGIDO: new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		ImageIcon v1 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
		Image v2 = v1.getImage();
		Image v3 = v2.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(v3));
		panel_3.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Cuarto B3");
		lblNewLabel_1.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(110, 192, 100, 20);
		panel_3.add(lblNewLabel_1);

		JLabel textoHabitacion = new JLabel("Tipo de habitación:");
		textoHabitacion.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		textoHabitacion.setBounds(90, 223, 167, 20);
		panel_3.add(textoHabitacion);

		JLabel lblNewLabel_2 = new JLabel("Suit");
		lblNewLabel_2.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(142, 254, 35, 20);
		panel_3.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Camas:");
		lblNewLabel_3.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_3.setBounds(131, 285, 60, 20);
		panel_3.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("4 Camas individuales");
		lblNewLabel_4.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(76, 316, 168, 20);
		panel_3.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Ocupante:");
		lblNewLabel_5.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_5.setBounds(120, 347, 80, 20);
		panel_3.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Diego Ontiveros");
		lblNewLabel_6.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(90, 378, 154, 20);
		panel_3.add(lblNewLabel_6);

		JButton btnOcupado = new JButton("LIBRE");
		btnOcupado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOcupado.setBackground(new Color(50, 186, 124));
		btnOcupado.setForeground(Color.WHITE);
		btnOcupado.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnOcupado.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnOcupado.setBounds(120, 177, 296, 40);
		panel.add(btnOcupado);

		JButton btnHistorial = new JButton("Check out \r\n");
		btnHistorial.setBackground(new Color(255, 214, 10));
		btnHistorial.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnHistorial.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnHistorial.setBounds(426, 441, 270, 60);
		panel.add(btnHistorial);

		JButton btnEditarHabitacion = new JButton("Liberar habitacion");
		btnEditarHabitacion.setForeground(new Color(255, 255, 255));
		btnEditarHabitacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditarHabitacion.setBackground(new Color(50, 186, 124));
		btnEditarHabitacion.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnEditarHabitacion.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEditarHabitacion.setBounds(426, 228, 270, 60);
		panel.add(btnEditarHabitacion);
		
		JButton btnModificarReserva = new JButton("Modificar reserva\r\n");
		btnModificarReserva.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
		btnModificarReserva.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnModificarReserva.setBackground(new Color(255, 214, 10));
		btnModificarReserva.setBounds(426, 299, 270, 60);
		btnModificarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.RentasModificarReserva();	
			}
		});
		panel.add(btnModificarReserva);
		
//		JButton btnEditarHabitacion_1_1 = new JButton("Bloquear por mantemiento \r\n");
//		btnEditarHabitacion_1_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
//		btnEditarHabitacion_1_1.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
//		btnEditarHabitacion_1_1.setBackground(SystemColor.activeCaptionBorder);
//		btnEditarHabitacion_1_1.setBounds(426, 370, 270, 60);
//		panel.add(btnEditarHabitacion_1_1);
		
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void RentasModificarReserva() {

		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1180, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1164, 95);
		panel_1.setBackground(new Color(0, 0, 0));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 95, 1164, 26);
		panel_2.setBackground(new Color(55, 54, 48));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel logo = new JLabel(""); //Logo
		logo.setBounds(0, 0, 170, 95);
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
        Image imagen1 = icon1.getImage().getScaledInstance(170, 95, Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(imagen1));
		panel_1.add(logo);
		
		JLabel Titulo = new JLabel("Rentas:\r\n"); //Titulo 
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 410, 73);
		panel_1.add(Titulo);
		
		JLabel menuTitulo = new JLabel("Modificar reserva:\r\n");
		menuTitulo.setBackground(new Color(255, 255, 255));
		menuTitulo.setBounds(131, 126, 530, 56);
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 38));
		panel.add(menuTitulo);
		
		JButton botonVolver = new JButton("");
		botonVolver.setBounds(60, 132, 50, 50);
		botonVolver.setForeground(new Color(255, 255, 255));
		botonVolver.setBackground(new Color(255, 255, 255));
		botonVolver.setBorderPainted(false);
		botonVolver.setFocusPainted(false);
		botonVolver.setContentAreaFilled(true);
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				UsersController hc = new UsersController();
				hc.DatosRenta();
			}
		});
		ImageIcon icon2 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
        Image imagen2 = icon2.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        botonVolver.setIcon(new ImageIcon(imagen2));
		panel.add(botonVolver);
		

		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
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
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
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
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);
		
		
		ImageIcon u1 = new ImageIcon("Images/busqueda.png");
		Image u2 = u1.getImage();
		Image u3 = u2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        final String placeholder = "BUSCAR";
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(79, 230, 439, 144);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(92, 89, 254, 45);
		panel_3.add(panel_5);
		panel_5.setBackground(Color.BLACK);
		panel_5.setLayout(null);
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setLayout(null);
		panel_5_2.setBackground(Color.WHITE);
		panel_5_2.setBounds(10, 10, 234, 25);
		panel_5.add(panel_5_2);
		
		JLabel lblNewLabel = new JLabel("Dias de hospedaje: 4 dias\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 10, 265, 29);
		panel_3.add(lblNewLabel);
		
		JLabel lblAumentar = new JLabel("Aumentar:\r\n");
		lblAumentar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblAumentar.setBounds(10, 50, 265, 29);
		panel_3.add(lblAumentar);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setBounds(10, 89, 72, 45);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-\r\n");
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1.setBounds(357, 89, 72, 45);
		panel_3.add(btnNewButton_1);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(546, 230, 403, 127);
		panel.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblAgregarUnExtra = new JLabel("Agregar un extra:");
		lblAgregarUnExtra.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAgregarUnExtra.setBounds(21, 10, 265, 29);
		panel_3_1.add(lblAgregarUnExtra);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Desayuno extra", "Comida extra", "Cena extra", "Renta de consola"}));
		comboBox.setBounds(21, 76, 200, 41);
		panel_3_1.add(comboBox);
		
		JLabel lblExtra = new JLabel("Extra:\r\n");
		lblExtra.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblExtra.setBounds(21, 38, 265, 29);
		panel_3_1.add(lblExtra);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBounds(79, 425, 439, 144);
		panel.add(panel_3_2);
		
		JPanel panel_5_3 = new JPanel();
		panel_5_3.setLayout(null);
		panel_5_3.setBackground(Color.BLACK);
		panel_5_3.setBounds(92, 89, 254, 45);
		panel_3_2.add(panel_5_3);
		
		JPanel panel_5_2_1 = new JPanel();
		panel_5_2_1.setLayout(null);
		panel_5_2_1.setBackground(Color.WHITE);
		panel_5_2_1.setBounds(10, 10, 234, 25);
		panel_5_3.add(panel_5_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Las habitaciones usadas son: 2\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 10, 336, 29);
		panel_3_2.add(lblNewLabel_2);
		
		JLabel lblAumentar_1 = new JLabel("Agregar mas:");
		lblAumentar_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblAumentar_1.setBounds(10, 50, 265, 29);
		panel_3_2.add(lblAumentar_1);
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_2.setBounds(10, 89, 72, 45);
		panel_3_2.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("-");
		btnNewButton_2_1.setBackground(Color.RED);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_2_1.setBounds(356, 89, 72, 45);
		panel_3_2.add(btnNewButton_2_1);
		
		JButton btnNewButton_3 = new JButton("Guardar cambios\r\n");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        int respuesta = JOptionPane.showConfirmDialog(
		                null, 
		                "¿Estás seguro de que desea editar esta reservacion?", 
		                "Confirmación", 
		                JOptionPane.YES_NO_OPTION, 
		                JOptionPane.WARNING_MESSAGE
		        );

		        if (respuesta == JOptionPane.YES_OPTION) {
		            JOptionPane.showMessageDialog(
		                null, 
		                "reserva editada.", 
		                "Información", 
		                JOptionPane.INFORMATION_MESSAGE
		            );
		        }
		    }
		});		
		btnNewButton_3.setBackground(new Color(50, 186, 124));
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_3.setBounds(189, 608, 211, 45);
		panel.add(btnNewButton_3);
		
		JButton btnEliminarCliente = new JButton("Eliminar Cliente"); //Botón prinicipal eliminar cliente
		btnEliminarCliente.setBackground(new Color(239, 35, 60));
		btnEliminarCliente.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnEliminarCliente.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarCliente.setForeground(Color.WHITE);
		btnEliminarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void DetallesHabitacion4() {
		
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
		
		JPanel panel_1 = new JPanel(); //Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel(); //Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel logo = new JLabel(""); //Logo
		logo.setBounds(0, 0, 170, 95);
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
        Image imagen1 = icon1.getImage().getScaledInstance(170, 95, Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(imagen1));
		panel_1.add(logo);
		
		JLabel Titulo = new JLabel("Detalles del tipo de habitación"); //Titulo 
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 810, 73);
		panel_1.add(Titulo);
		
		JLabel menuTitulo = new JLabel("<html><div style='text-align: left;'>Cama doble o individual, baño privado y TV.<br>Tipo: Las habitaciones de color café son las estándar</div></html>"); //Texto menú
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 16));
		menuTitulo.setBounds(131, 191, 504, 56);
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
				hc.TiposHabitacion();	
			}
		});
		botonVolver.setBounds(60, 132, 36, 36);
		ImageIcon icon4 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
        Image imagen4 = icon4.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        botonVolver.setIcon(new ImageIcon(imagen4));
		panel.add(botonVolver);
		

		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
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
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
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
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);
		
		JButton btnBuscar = new JButton(""); //Boton para la barra de busqueda
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(720, 140, 40, 40);
		ImageIcon icon5 = new ImageIcon(getClass().getResource("/Images/busqueda.png"));
        Image imagen5 = icon5.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        btnBuscar.setIcon(new ImageIcon(imagen5));
		btnBuscar.setBorderPainted(false);
		btnBuscar.setFocusPainted(false);
		btnBuscar.setContentAreaFilled(true);
		panel.add(btnBuscar);
		
		JTextField textField = new JTextField("BUSCAR"); //Texto de ejemplo
		textField.setToolTipText("");
		textField.setBounds(770, 140, 290, 40);
		((JTextField) textField).setColumns(10);
		textField.setBackground(new Color(217, 217, 217));
        textField.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
        textField.setForeground(Color.GRAY);
        final String placeholder = "BUSCAR"; //Borra el texto de ejemplo al escribir en el campo
        textField.addFocusListener(new FocusAdapter() {

            public void focusGained(FocusEvent e) {
                if (textField.getToolkit().equals(placeholder)) {
                    textField.setToolTipText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (((CharSequence) textField.getToolkit()).isEmpty()) {
                    textField.setToolTipText(placeholder);
                    textField.setForeground(Color.GRAY);
                }
            }
        });
		panel.add(textField);
		
		JButton btnCuartoA1 = new JButton("Cuarto A1"); //Botón Cuarto A1
		btnCuartoA1.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA1.setBackground(new Color(173, 102, 67));
		btnCuartoA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoA1.setBounds(131, 257, 150, 150);
		btnCuartoA1.setVerticalTextPosition(SwingConstants.BOTTOM); //Para poner texto debajo de la imagen dentro del botón
		btnCuartoA1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA1.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA1.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA1.setIconTextGap(1);
		btnCuartoA1.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		ImageIcon icon6 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen6 = icon6.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoA1.setIcon(new ImageIcon(imagen6));
		panel.add(btnCuartoA1);
		
		JButton btnCuartoB1 = new JButton("Cuarto B1"); //Botón Cuarto B1
		btnCuartoB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoB1.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB1.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoB1.setBackground(new Color(0, 187, 249));
		btnCuartoB1.setBounds(131, 455, 150, 150);
		btnCuartoB1.setVerticalTextPosition(SwingConstants.BOTTOM); //Para poner texto debajo de la imagen dentro del botón
		btnCuartoB1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB1.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB1.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB1.setIconTextGap(1);
		ImageIcon icon11 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen11 = icon11.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoB1.setIcon(new ImageIcon(imagen11));
		panel.add(btnCuartoB1);
		
		JButton btnCuartoA2 = new JButton("Cuarto A2"); //Botón Cuarto A2
		btnCuartoA2.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoA2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoA2.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA2.setIconTextGap(1);
		btnCuartoA2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA2.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA2.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoA2.setBackground(new Color(173, 102, 67));
		btnCuartoA2.setBounds(331, 257, 150, 150);
		ImageIcon icon7 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen7 = icon7.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoA2.setIcon(new ImageIcon(imagen7));
		panel.add(btnCuartoA2);
		
		JButton btnCuartoB2 = new JButton("Cuarto B2"); //Botón Cuarto B2
		btnCuartoB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoB2.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoB2.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB2.setIconTextGap(1);
		btnCuartoB2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB2.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB2.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoB2.setBackground(new Color(0, 187, 249));
		btnCuartoB2.setBounds(331, 455, 150, 150);
		ImageIcon icon12 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen12 = icon12.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoB2.setIcon(new ImageIcon(imagen12));
		panel.add(btnCuartoB2);
		
		JButton btnCuartoA3 = new JButton("Cuarto A3"); //Botón Cuarto A3
		btnCuartoA3.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoA3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoA3.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA3.setIconTextGap(1);
		btnCuartoA3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA3.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA3.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoA3.setBackground(new Color(173, 102, 67));
		btnCuartoA3.setBounds(531, 257, 150, 150);
		ImageIcon icon8 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen8 = icon8.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoA3.setIcon(new ImageIcon(imagen8));
		panel.add(btnCuartoA3);
		
		JButton btnCuartoA4 = new JButton("Cuarto A4"); //Botón Cuarto A4
		btnCuartoA4.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoA4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoA4.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA4.setIconTextGap(1);
		btnCuartoA4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA4.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA4.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoA4.setBackground(new Color(0, 187, 249));
		btnCuartoA4.setBounds(731, 257, 150, 150);
		ImageIcon icon9 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen9 = icon9.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoA4.setIcon(new ImageIcon(imagen9));
		panel.add(btnCuartoA4);
		
		JButton btnCuartoA5 = new JButton("Cuarto A5"); //Botón Cuarto A5
		btnCuartoA5.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoA5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoA5.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA5.setIconTextGap(1);
		btnCuartoA5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA5.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA5.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoA5.setBackground(new Color(0, 187, 249));
		btnCuartoA5.setBounds(931, 257, 150, 150);
		ImageIcon icon10 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen10 = icon10.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoA5.setIcon(new ImageIcon(imagen10));
		panel.add(btnCuartoA5);
		
		JButton btnCuartoB3 = new JButton("Cuarto B3"); //Botón Cuarto B3
		btnCuartoB3.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoB3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoB3.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB3.setIconTextGap(1);
		btnCuartoB3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB3.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB3.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoB3.setBackground(new Color(0, 187, 249));
		btnCuartoB3.setBounds(531, 455, 150, 150);
		ImageIcon icon13 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen13 = icon13.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoB3.setIcon(new ImageIcon(imagen13));
		panel.add(btnCuartoB3);
		
		JButton btnCuartoB4 = new JButton("Cuarto B4"); //Botón Cuarto B4
		btnCuartoB4.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoB4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoB4.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB4.setIconTextGap(1);
		btnCuartoB4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB4.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB4.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoB4.setBackground(new Color(0, 187, 249));
		btnCuartoB4.setBounds(731, 455, 150, 150);
		ImageIcon icon14 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen14 = icon14.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoB4.setIcon(new ImageIcon(imagen14));
		panel.add(btnCuartoB4);
		
		JButton btnCuartoB5 = new JButton("Cuarto B5"); //Botón Cuarto B5
		btnCuartoB5.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoB5.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB5.setIconTextGap(1);
		btnCuartoB5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB5.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB5.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoB5.setBackground(new Color(0, 187, 249));
		btnCuartoB5.setBounds(931, 455, 150, 150);
		ImageIcon icon15 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen15 = icon15.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoB5.setIcon(new ImageIcon(imagen15));
		panel.add(btnCuartoB5);
		
		JLabel menuTitulo_1 = new JLabel("Tipo de habitación: Estándar");
		menuTitulo_1.setBackground(new Color(255, 255, 255));
		menuTitulo_1.setFont(new Font("Jost*", Font.BOLD, 34));
		menuTitulo_1.setBounds(131, 126, 579, 56);
		panel.add(menuTitulo_1);
		
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void DetallesFamiliar() {
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
		
		JPanel panel_1 = new JPanel(); //Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel(); //Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel logo = new JLabel(""); //Logo
		logo.setBounds(0, 0, 170, 95);
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
        Image imagen1 = icon1.getImage().getScaledInstance(170, 95, Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(imagen1));
		panel_1.add(logo);
		
		JLabel Titulo = new JLabel("Detalles del tipo de habitación"); //Titulo 
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 810, 73);
		panel_1.add(Titulo);
		
		JLabel menuTitulo = new JLabel("<html><div style='text-align: left;'>Cama doble o individual, baño privado y TV.<br>Tipo: Las habitaciones de color café son las estándar</div></html>"); //Texto menú
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 16));
		menuTitulo.setBounds(131, 191, 550, 56);
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
				hc.TiposHabitacion();	
			}
		});
		botonVolver.setBounds(60, 132, 36, 36);
		ImageIcon icon4 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
        Image imagen4 = icon4.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        botonVolver.setIcon(new ImageIcon(imagen4));
		panel.add(botonVolver);
		
		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnTiposDeRentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnTiposDeRentas1 = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas1.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas1.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas1.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas1.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnTiposDeRentas1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.Menu();
			}
		});
		btnTiposDeRentas1.setBounds(974, 0, 180, 23);
		btnTiposDeRentas1.setBorderPainted(false);
        btnTiposDeRentas1.setFocusPainted(false);
        btnTiposDeRentas1.setContentAreaFilled(true);
		panel_2.add(btnTiposDeRentas1);
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
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
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
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
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);
		
		
		ImageIcon icon5 = new ImageIcon(getClass().getResource("/Images/busqueda.png"));
        Image imagen5 = icon5.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        final String placeholder = "BUSCAR";
		
		JButton btnCuartoA1 = new JButton("Cuarto A1"); //Botón Cuarto A1
		btnCuartoA1.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA1.setBackground(new Color(173, 102, 67));
		btnCuartoA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoA1.setBounds(131, 257, 150, 150);
		btnCuartoA1.setVerticalTextPosition(SwingConstants.BOTTOM); //Para poner texto debajo de la imagen dentro del botón
		btnCuartoA1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA1.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA1.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA1.setIconTextGap(1);
		btnCuartoA1.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		ImageIcon icon6 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen6 = icon6.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoA1.setIcon(new ImageIcon(imagen6));
		panel.add(btnCuartoA1);
		
		JButton btnCuartoB1 = new JButton("Cuarto B1"); //Botón Cuarto B1
		btnCuartoB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoB1.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB1.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoB1.setBackground(new Color(0, 187, 249));
		btnCuartoB1.setBounds(131, 455, 150, 150);
		btnCuartoB1.setVerticalTextPosition(SwingConstants.BOTTOM); //Para poner texto debajo de la imagen dentro del botón
		btnCuartoB1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB1.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB1.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB1.setIconTextGap(1);
		ImageIcon icon11 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen11 = icon11.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoB1.setIcon(new ImageIcon(imagen11));
		panel.add(btnCuartoB1);
		
		JButton btnCuartoA2 = new JButton("Cuarto A2"); //Botón Cuarto A2
		btnCuartoA2.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoA2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoA2.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA2.setIconTextGap(1);
		btnCuartoA2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA2.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA2.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoA2.setBackground(new Color(173, 102, 67));
		btnCuartoA2.setBounds(331, 257, 150, 150);
		ImageIcon icon7 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen7 = icon7.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoA2.setIcon(new ImageIcon(imagen7));
		panel.add(btnCuartoA2);
		
		JButton btnCuartoB2 = new JButton("Cuarto B2"); //Botón Cuarto B2
		btnCuartoB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoB2.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoB2.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB2.setIconTextGap(1);
		btnCuartoB2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB2.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB2.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoB2.setBackground(new Color(0, 187, 249));
		btnCuartoB2.setBounds(331, 455, 150, 150);
		ImageIcon icon12 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen12 = icon12.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoB2.setIcon(new ImageIcon(imagen12));
		panel.add(btnCuartoB2);
		
		JButton btnCuartoA3 = new JButton("Cuarto A3"); //Botón Cuarto A3
		btnCuartoA3.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoA3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoA3.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA3.setIconTextGap(1);
		btnCuartoA3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA3.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA3.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoA3.setBackground(new Color(173, 102, 67));
		btnCuartoA3.setBounds(531, 257, 150, 150);
		ImageIcon icon8 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen8 = icon8.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoA3.setIcon(new ImageIcon(imagen8));
		panel.add(btnCuartoA3);
		
		JButton btnCuartoA4 = new JButton("Cuarto A4"); //Botón Cuarto A4
		btnCuartoA4.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoA4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoA4.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA4.setIconTextGap(1);
		btnCuartoA4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA4.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA4.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoA4.setBackground(new Color(128, 64, 0));
		btnCuartoA4.setBounds(731, 257, 150, 150);
		ImageIcon icon9 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen9 = icon9.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoA4.setIcon(new ImageIcon(imagen9));
		panel.add(btnCuartoA4);
		
		JButton btnCuartoA5 = new JButton("Cuarto A5"); //Botón Cuarto A5
		btnCuartoA5.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoA5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoA5.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoA5.setIconTextGap(1);
		btnCuartoA5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoA5.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoA5.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoA5.setBackground(new Color(0, 187, 249));
		btnCuartoA5.setBounds(931, 257, 150, 150);
		ImageIcon icon10 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen10 = icon10.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoA5.setIcon(new ImageIcon(imagen10));
		panel.add(btnCuartoA5);
		
		JButton btnCuartoB3 = new JButton("Cuarto B3"); //Botón Cuarto B3
		btnCuartoB3.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoB3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoB3.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB3.setIconTextGap(1);
		btnCuartoB3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB3.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB3.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoB3.setBackground(new Color(0, 187, 249));
		btnCuartoB3.setBounds(531, 455, 150, 150);
		ImageIcon icon13 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen13 = icon13.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoB3.setIcon(new ImageIcon(imagen13));
		panel.add(btnCuartoB3);
		
		JButton btnCuartoB4 = new JButton("Cuarto B4"); //Botón Cuarto B4
		btnCuartoB4.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCuartoB4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoB4.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB4.setIconTextGap(1);
		btnCuartoB4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB4.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB4.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoB4.setBackground(new Color(0, 187, 249));
		btnCuartoB4.setBounds(731, 455, 150, 150);
		ImageIcon icon14 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen14 = icon14.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoB4.setIcon(new ImageIcon(imagen14));
		panel.add(btnCuartoB4);
		
		JButton btnCuartoB5 = new JButton("Cuarto B5"); //Botón Cuarto B5
		btnCuartoB5.setFont(new Font("Jost*", Font.BOLD | Font.ITALIC, 14));
		btnCuartoB5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCuartoB5.setVerticalAlignment(SwingConstants.CENTER);
		btnCuartoB5.setIconTextGap(1);
		btnCuartoB5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCuartoB5.setHorizontalAlignment(SwingConstants.CENTER);
		btnCuartoB5.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCuartoB5.setBackground(new Color(0, 187, 249));
		btnCuartoB5.setBounds(931, 455, 150, 150);
		ImageIcon icon15 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen15 = icon15.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        btnCuartoB5.setIcon(new ImageIcon(imagen15));
		panel.add(btnCuartoB5);
		
		JLabel menuTitulo_1 = new JLabel("Tipo de habitación: Familiar");
		menuTitulo_1.setBackground(new Color(255, 255, 255));
		menuTitulo_1.setFont(new Font("Jost*", Font.BOLD, 34));
		menuTitulo_1.setBounds(131, 126, 579, 56);
		panel.add(menuTitulo_1);
		
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void EliminarTipodeHabitacion() {
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

		JPanel panel_1 = new JPanel(); //Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel(); //Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel logo = new JLabel(""); //Logo
		logo.setBounds(0, 0, 170, 95);
		// CORREGIDO: new ImageIcon(getClass().getResource("/Images/logo.png"));
		ImageIcon portada1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
	    Image portada2 = portada1.getImage();
	    Image portada3 = portada2.getScaledInstance(170, 95,Image.SCALE_SMOOTH);
	    logo.setIcon(new ImageIcon(portada3));
		panel_1.add(logo);
		
		
		JLabel Titulo = new JLabel("Tipos  de habitaciones:"); //Titulo
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 500, 73);
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
				hc.TiposHabitacion();
			}
		});
		botonVolver.setBounds(60, 132, 50, 50);
		// CORREGIDO: new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
		ImageIcon f1 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
		Image f2 = f1.getImage();
		Image f3 = f2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
		botonVolver.setIcon(new ImageIcon(f3));
		panel.add(botonVolver);


		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
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
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
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
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
        
        JButton btnNewButton_1_1_1_1_1_1 = new JButton("Eliminar");
        btnNewButton_1_1_1_1_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
		        int respuesta = JOptionPane.showConfirmDialog(
		                null, 
		                "¿Estás seguro de que desea eliminar esta habitacion?", 
		                "Confirmación", 
		                JOptionPane.YES_NO_OPTION, 
		                JOptionPane.WARNING_MESSAGE
		        );

		        if (respuesta == JOptionPane.YES_OPTION) {
		            JOptionPane.showMessageDialog(
		                null, 
		                "habitacion eliminada.", 
		                "Información", 
		                JOptionPane.INFORMATION_MESSAGE
		            );
		        }
		    }
		});		
        btnNewButton_1_1_1_1_1_1.setForeground(Color.WHITE);
        btnNewButton_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1_1_1_1_1_1.setBackground(new Color(239, 35, 60));
        btnNewButton_1_1_1_1_1_1.setBounds(81, 375, 124, 55);
        panel_3.add(btnNewButton_1_1_1_1_1_1);

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
        
        JButton btnNewButton_1_1_1_1_1_2 = new JButton("Eliminar");
        btnNewButton_1_1_1_1_1_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
		        int respuesta = JOptionPane.showConfirmDialog(
		                null, 
		                "¿Estás seguro de que desea eliminar esta habitacion?", 
		                "Confirmación", 
		                JOptionPane.YES_NO_OPTION, 
		                JOptionPane.WARNING_MESSAGE
		        );

		        if (respuesta == JOptionPane.YES_OPTION) {
		            JOptionPane.showMessageDialog(
		                null, 
		                "habitacion eliminada.", 
		                "Información", 
		                JOptionPane.INFORMATION_MESSAGE
		            );
		        }
		    }
		});		
        btnNewButton_1_1_1_1_1_2.setForeground(Color.WHITE);
        btnNewButton_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1_1_1_1_1_2.setBackground(new Color(239, 35, 60));
        btnNewButton_1_1_1_1_1_2.setBounds(86, 375, 124, 55);
        panel_2_1.add(btnNewButton_1_1_1_1_1_2);

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
        
        JButton btnNewButton_1_1_1_1_1_2_1 = new JButton("Eliminar");
        btnNewButton_1_1_1_1_1_2_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
		        int respuesta = JOptionPane.showConfirmDialog(
		                null, 
		                "¿Estás seguro de que desea eliminar esta habitacion?", 
		                "Confirmación", 
		                JOptionPane.YES_NO_OPTION, 
		                JOptionPane.WARNING_MESSAGE
		        );

		        if (respuesta == JOptionPane.YES_OPTION) {
		            JOptionPane.showMessageDialog(
		                null, 
		                "habitacion eliminada.", 
		                "Información", 
		                JOptionPane.INFORMATION_MESSAGE
		            );
		        }
		    }
		});		
        btnNewButton_1_1_1_1_1_2_1.setForeground(Color.WHITE);
        btnNewButton_1_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1_1_1_1_1_2_1.setBackground(new Color(239, 35, 60));
        btnNewButton_1_1_1_1_1_2_1.setBounds(79, 375, 124, 55);
        panel_1_1.add(btnNewButton_1_1_1_1_1_2_1);
        
        JButton btnNewButton_1_1_1_1_1 = new JButton("Eliminar");
        btnNewButton_1_1_1_1_1.setForeground(Color.WHITE);
        btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1_1_1_1_1.setBackground(new Color(239, 35, 60));
        btnNewButton_1_1_1_1_1.setBounds(131, 131, 124, 55);
        panel.add(btnNewButton_1_1_1_1_1);
        
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void CrearTipoHabitacion() {
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
        ImageIcon portada1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
        Image portada2 = portada1.getImage();
        Image portada3 = portada2.getScaledInstance(170, 95,Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(portada3));
        panel_1.add(logo);

        JLabel Titulo = new JLabel("Crear habitación\r\n");
        Titulo.setForeground(new Color(255, 255, 255));
        Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
        Titulo.setBounds(180, 11, 410, 73);
        panel_1.add(Titulo);

		JLabel menuTitulo1 = new JLabel("Crear tipo de habitación");
		menuTitulo1.setBackground(new Color(255, 255, 255));
		menuTitulo1.setFont(new Font("Jost*", Font.BOLD, 34));
		menuTitulo1.setBounds(131, 126, 579, 56);
		panel.add(menuTitulo1);


		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
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
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
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
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);

		JButton botonVolver = new JButton("");
		botonVolver.setForeground(new Color(255, 255, 255));
		botonVolver.setBackground(new Color(255, 255, 255));
		botonVolver.setBorderPainted(false);
		botonVolver.setFocusPainted(false);
		botonVolver.setContentAreaFilled(true);
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.TiposHabitacion();
			}
		});
		botonVolver.setBounds(60, 132, 36, 36);
		ImageIcon icon4 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
        Image imagen4 = icon4.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        botonVolver.setIcon(new ImageIcon(imagen4));
		panel.add(botonVolver);

		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel.setBounds(141, 193, 335, 40);
		panel.add(lblNewLabel);

		JTextField textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setBounds(141, 244, 335, 40);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Descripción:");
		lblNewLabel_1.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel_1.setBounds(141, 295, 335, 40);
		panel.add(lblNewLabel_1);

		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBackground(new Color(192, 192, 192));
		textArea.setBounds(141, 346, 335, 100);
		panel.add(textArea);

		JLabel lblNewLabel_2 = new JLabel("Capacidad máxima:");
		lblNewLabel_2.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel_2.setBounds(550, 193, 335, 40);
		panel.add(lblNewLabel_2);

		JTextField textField_2 = new JTextField();
		textField_2.setBackground(new Color(192, 192, 192));
		textField_2.setBounds(550, 244, 335, 40);
		panel.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Precio por noche:");
		lblNewLabel_3.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel_3.setBounds(550, 295, 335, 40);
		panel.add(lblNewLabel_3);

		JTextField textField_3 = new JTextField();
		textField_3.setBackground(new Color(192, 192, 192));
		textField_3.setBounds(550, 346, 335, 40);
		panel.add(textField_3);
		textField_3.setColumns(10);

		JButton btnCrearHabitacion = new JButton("Crear habitación");
		btnCrearHabitacion.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 20));
		btnCrearHabitacion.setBackground(new Color(255, 214, 10));
		btnCrearHabitacion.setBounds(870, 580, 250, 40);
		btnCrearHabitacion.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		panel.add(btnCrearHabitacion);
		
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void EditarHabitacion() {
		try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.put("Button.arc", 90);
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
        ImageIcon portada1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
        Image portada2 = portada1.getImage();
        Image portada3 = portada2.getScaledInstance(170, 95,Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(portada3));
        panel_1.add(logo);

        JLabel Titulo = new JLabel("Editar habitación");
        Titulo.setForeground(new Color(255, 255, 255));
        Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
        Titulo.setBounds(180, 11, 480, 73);
        panel_1.add(Titulo);

		JLabel menuTitulo1 = new JLabel("Editar tipo de habitación");
		menuTitulo1.setBackground(new Color(255, 255, 255));
		menuTitulo1.setFont(new Font("Jost*", Font.BOLD, 34));
		menuTitulo1.setBounds(131, 126, 600, 56);
		panel.add(menuTitulo1);


		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
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
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
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
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);

		JButton botonVolver = new JButton("");
		botonVolver.setForeground(new Color(255, 255, 255));
		botonVolver.setBackground(new Color(255, 255, 255));
		botonVolver.setBorderPainted(false);
		botonVolver.setFocusPainted(false);
		botonVolver.setContentAreaFilled(true);
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.TiposHabitacion();	
			}
		});
		botonVolver.setBounds(60, 132, 36, 36);
		ImageIcon icon4 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
        Image imagen4 = icon4.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        botonVolver.setIcon(new ImageIcon(imagen4));
		panel.add(botonVolver);

		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel.setBounds(141, 193, 335, 40);
		panel.add(lblNewLabel);

		JTextField textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setBounds(141, 244, 335, 40);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Descripción:");
		lblNewLabel_1.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel_1.setBounds(141, 295, 335, 40);
		panel.add(lblNewLabel_1);

		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBackground(new Color(192, 192, 192));
		textArea.setBounds(141, 346, 335, 100);
		panel.add(textArea);

		JLabel lblNewLabel_2 = new JLabel("Capacidad máxima:");
		lblNewLabel_2.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel_2.setBounds(550, 193, 335, 40);
		panel.add(lblNewLabel_2);

		JTextField textField_2 = new JTextField();
		textField_2.setBackground(new Color(192, 192, 192));
		textField_2.setBounds(550, 244, 335, 40);
		panel.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Precio por noche:");
		lblNewLabel_3.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel_3.setBounds(550, 295, 335, 40);
		panel.add(lblNewLabel_3);

		JTextField textField_3 = new JTextField();
		textField_3.setBackground(new Color(192, 192, 192));
		textField_3.setBounds(550, 346, 335, 40);
		panel.add(textField_3);
		textField_3.setColumns(10);

		JButton btnNewButton = new JButton("Editar habitación");
		btnNewButton.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBackground(new Color(255, 214, 10));
		btnNewButton.setBounds(870, 580, 250, 40);
		btnNewButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		panel.add(btnNewButton);
		
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void CrearTarifa() {
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
	        ImageIcon portada1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
	        Image portada2 = portada1.getImage();
	        Image portada3 = portada2.getScaledInstance(170, 95,Image.SCALE_SMOOTH);
	        logo.setIcon(new ImageIcon(portada3));
	        panel_1.add(logo);

	        JLabel Titulo = new JLabel("Tarifas\r\n");
	        Titulo.setForeground(new Color(255, 255, 255));
	        Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
	        Titulo.setBounds(180, 11, 480, 73);
	        panel_1.add(Titulo);

			JLabel menuTitulo1 = new JLabel("Crear tarifa");
			menuTitulo1.setBackground(new Color(255, 255, 255));
			menuTitulo1.setFont(new Font("Jost*", Font.BOLD, 34));
			menuTitulo1.setBounds(131, 126, 600, 56);
			panel.add(menuTitulo1);


			JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
			btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
			btnTiposDeRentas.setForeground(new Color(255, 255, 255));
			btnTiposDeRentas.setBackground(new Color(56, 54, 41));
			btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
			
			JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
			btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
			btnrentas.setBackground(new Color(56, 54, 41));
			btnrentas.setBounds(883, 0, 81, 23);
			panel_2.add(btnrentas);
			
			JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
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
			btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
			btnclientes.setBackground(new Color(56, 54, 41));
			btnclientes.setBounds(792, 0, 81, 23);
			panel_2.add(btnclientes);
			
			JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
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
			btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
			btnhabitaciones.setBackground(new Color(56, 54, 41));
			btnhabitaciones.setBounds(682, 0, 100, 23);
			panel_2.add(btnhabitaciones);
			
			JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
			btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
			btntarifas.setBackground(new Color(56, 54, 41));
			btntarifas.setBounds(600, 0, 72, 23);
			panel_2.add(btntarifas);

			JButton botonVolver = new JButton("");
			botonVolver.setForeground(new Color(255, 255, 255));
			botonVolver.setBackground(new Color(255, 255, 255));
			botonVolver.setBorderPainted(false);
			botonVolver.setFocusPainted(false);
			botonVolver.setContentAreaFilled(true);
			botonVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose(); // Cierra la ventana actual del menú
					HomeController hc = new HomeController();
					hc.Tarifas();	
				}
			});
			botonVolver.setBounds(60, 132, 36, 36);
			ImageIcon icon4 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
	        Image imagen4 = icon4.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
	        botonVolver.setIcon(new ImageIcon(imagen4));
			panel.add(botonVolver);

			JLabel lblNewLabel = new JLabel("Nombre dela tarifa:");
			lblNewLabel.setFont(new Font("Jost*", Font.BOLD, 24));
			lblNewLabel.setBounds(141, 193, 335, 40);
			panel.add(lblNewLabel);

			JTextField textField = new JTextField();
			textField.setBackground(new Color(192, 192, 192));
			textField.setBounds(141, 244, 335, 40);
			panel.add(textField);
			textField.setColumns(10);

			JLabel lblNewLabel_1 = new JLabel("Condicion:");
			lblNewLabel_1.setFont(new Font("Jost*", Font.BOLD, 24));
			lblNewLabel_1.setBounds(141, 295, 335, 40);
			panel.add(lblNewLabel_1);

			JComboBox<String> comboCondicion = new JComboBox<>();
			comboCondicion.addItem("Reembolsable");
			comboCondicion.addItem("Corporativa");
			comboCondicion.addItem("Promocional");
			comboCondicion.setBackground(new Color(192, 192, 192));
			comboCondicion.setFont(new Font("Jost*", Font.PLAIN, 18));
			comboCondicion.setBounds(141, 346, 335, 40);
			panel.add(comboCondicion);


			JLabel lblNewLabel_2 = new JLabel("Capacidad máxima:");
			lblNewLabel_2.setFont(new Font("Jost*", Font.BOLD, 24));
			lblNewLabel_2.setBounds(550, 193, 335, 40);
			panel.add(lblNewLabel_2);

			JTextField textField_2 = new JTextField();
			textField_2.setBackground(new Color(192, 192, 192));
			textField_2.setBounds(550, 244, 335, 40);
			panel.add(textField_2);
			textField_2.setColumns(10);

			JLabel lblNewLabel_3 = new JLabel("Precio por noche:");
			lblNewLabel_3.setFont(new Font("Jost*", Font.BOLD, 24));
			lblNewLabel_3.setBounds(550, 295, 335, 40);
			panel.add(lblNewLabel_3);

			JTextField textField_3 = new JTextField();
			textField_3.setBackground(new Color(192, 192, 192));
			textField_3.setBounds(550, 346, 335, 40);
			panel.add(textField_3);
			textField_3.setColumns(10);

			JButton btnCrearTarifa = new JButton("Crear");
			btnCrearTarifa.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 20));
			btnCrearTarifa.setBackground(new Color(255, 214, 10));
			btnCrearTarifa.setBounds(870, 580, 250, 40);
			btnCrearTarifa.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
			panel.add(btnCrearTarifa);
			
			btnCrearTarifa.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        String nombre = textField.getText().trim();
			        String precioStr = textField_3.getText().trim();
			        String condicion = comboCondicion.getSelectedItem().toString().trim();

			        if (nombre.isEmpty() || precioStr.isEmpty() || condicion.isEmpty()) {
			            JOptionPane.showMessageDialog(frame, "Todos los campos son obligatorios.", "Advertencia", JOptionPane.WARNING_MESSAGE);
			            return;
			        }

			        double precio;
			        try {
			            precio = Double.parseDouble(precioStr);
			        } catch (NumberFormatException ex) {
			            JOptionPane.showMessageDialog(frame, "El precio debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
			            return;
			        }
			        // Crear tarifa:
			        UsersModel modelo = new UsersModel();
			        ConectionModel conn = new ConectionModel();
			        boolean exito = modelo.crearTarifa(conn.getConnection(), nombre, precio, condicion);

			        if (exito) {
			            JOptionPane.showMessageDialog(frame, "Tarifa creada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
			            frame.dispose();
			            HomeController hc = new HomeController();
			            hc.Tarifas();
			        } else {
			            JOptionPane.showMessageDialog(frame, "Error al crear la tarifa.", "Error", JOptionPane.ERROR_MESSAGE);
			        }
			    }
			});
	
		
			frame.getContentPane().add(panel);
			frame.repaint();
			frame.revalidate();
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
	}
	
	public void EditarTarifa() {
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

		JPanel panel_1 = new JPanel(); //Borde negro
		panel_1.setBounds(0, 0, 1164, 95);
		panel_1.setBackground(new Color(0, 0, 0));
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel(); //Borde gris
		panel_2.setBounds(0, 95, 1164, 26);
		panel_2.setBackground(new Color(55, 54, 48));
		panel.add(panel_2);
		panel_2.setLayout(null);

		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
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
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
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
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);

		JLabel logo = new JLabel(""); //Logo
		logo.setBounds(0, 0, 170, 95);
		ImageIcon icon2 = new ImageIcon(getClass().getResource("/Images/logo.png"));
        Image imagen2 = icon2.getImage().getScaledInstance(170, 95, Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(imagen2));
		panel_1.add(logo);
		
	     JLabel Titulo = new JLabel("Tarifas\r\n");
	     Titulo.setForeground(new Color(255, 255, 255));
	     Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
	     Titulo.setBounds(180, 11, 480, 73);
	     panel_1.add(Titulo);
		
			btntarifas.setForeground(Color.WHITE);
			btntarifas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
			btntarifas.setFocusPainted(false);
			btntarifas.setContentAreaFilled(true);
			btntarifas.setBorderPainted(false);
			btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
			btntarifas.setBackground(new Color(56, 54, 41));
			btntarifas.setBounds(600, 0, 72, 23);
			panel_2.add(btntarifas);

			JButton botonVolver = new JButton("");
			botonVolver.setForeground(new Color(255, 255, 255));
			botonVolver.setBackground(new Color(255, 255, 255));
			botonVolver.setBorderPainted(false);
			botonVolver.setFocusPainted(false);
			botonVolver.setContentAreaFilled(true);
			botonVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose(); // Cierra la ventana actual del menú
					HomeController hc = new HomeController();
					hc.Tarifas();	
				}
			});
			botonVolver.setBounds(60, 132, 36, 36);
			ImageIcon icon4 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
	        Image imagen4 = icon4.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
	        botonVolver.setIcon(new ImageIcon(imagen4));
			panel.add(botonVolver);
		
		JLabel menuTitulo1 = new JLabel("Editar tarifa");
		menuTitulo1.setBackground(new Color(255, 255, 255));
		menuTitulo1.setFont(new Font("Jost*", Font.BOLD, 34));
		menuTitulo1.setBounds(131, 126, 600, 56);
		panel.add(menuTitulo1);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel.setBounds(141, 193, 335, 40);
		panel.add(lblNewLabel);

		JTextField textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setBounds(141, 244, 335, 40);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Descripción:");
		lblNewLabel_1.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel_1.setBounds(141, 295, 335, 40);
		panel.add(lblNewLabel_1);

		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBackground(new Color(192, 192, 192));
		textArea.setBounds(141, 346, 335, 100);
		panel.add(textArea);
		
		
		JLabel lblNewLabel_2 = new JLabel("Tipo de tarifa:");
		lblNewLabel_2.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel_2.setBounds(550, 193, 335, 40);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Jost*", Font.BOLD, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rembolsable", "No rembolsable", "corporativa ", "Promocional"}));
		comboBox.setToolTipText("Rembolsable\r\nNo rembolsable\r\ncorporativa \r\nPromocional\r\n");
		comboBox.setBounds(550, 239, 335, 44);
		panel.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Precio por noche:");
		lblNewLabel_3.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel_3.setBounds(550, 295, 335, 40);
		panel.add(lblNewLabel_3);

		JTextField textField_3 = new JTextField();
		textField_3.setBackground(new Color(192, 192, 192));
		textField_3.setBounds(550, 346, 335, 40);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		
		
		JButton btnGuardarCambios = new JButton("Guardar cambios");
		btnGuardarCambios.setForeground(new Color(0, 0, 0));
		btnGuardarCambios.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		btnGuardarCambios.setBackground(new Color(255, 214, 10));
		btnGuardarCambios.setBounds(870, 580, 250, 40);
		panel.add(btnGuardarCambios);
		
		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	
		
	}
	int idTarifaSeleccionada;
	private JTextField textField; // para nombre
	private JComboBox<String> comboBox; // para condición


	public void EditarTarifa(int idtarifa) {
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
		panel_1.setBounds(0, 0, 1164, 95);
		panel_1.setBackground(new Color(0, 0, 0));
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 95, 1164, 26);
		panel_2.setBackground(new Color(55, 54, 48));
		panel.add(panel_2);
		panel_2.setLayout(null);

		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
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
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
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
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);
		
		JLabel logo = new JLabel("");
		logo.setBounds(0, 0, 170, 95);
		ImageIcon icon2 = new ImageIcon(getClass().getResource("/Images/logo.png"));
	    Image imagen2 = icon2.getImage().getScaledInstance(170, 95, Image.SCALE_SMOOTH);
	    logo.setIcon(new ImageIcon(imagen2));
		panel_1.add(logo);

		JLabel Titulo = new JLabel("Tarifas\r\n");
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 480, 73);
		panel_1.add(Titulo);

		JButton botonVolver = new JButton("");
		botonVolver.setForeground(new Color(255, 255, 255));
		botonVolver.setBackground(new Color(255, 255, 255));
		botonVolver.setBorderPainted(false);
		botonVolver.setFocusPainted(false);
		botonVolver.setContentAreaFilled(true);
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomeController hc = new HomeController();
				hc.Tarifas();	
			}
		});
		botonVolver.setBounds(60, 132, 36, 36);
		ImageIcon icon4 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
	    Image imagen4 = icon4.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
	    botonVolver.setIcon(new ImageIcon(imagen4));
		panel.add(botonVolver);

		JLabel menuTitulo1 = new JLabel("Editar tarifa");
		menuTitulo1.setBackground(new Color(255, 255, 255));
		menuTitulo1.setFont(new Font("Jost*", Font.BOLD, 34));
		menuTitulo1.setBounds(131, 126, 600, 56);
		panel.add(menuTitulo1);

		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel.setBounds(141, 193, 335, 40);
		panel.add(lblNewLabel);

		textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setBounds(141, 244, 335, 40);
		panel.add(textField);
		textField.setColumns(10);

		
		JLabel lblNewLabel_2 = new JLabel("Tipo de tarifa:");
		lblNewLabel_2.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel_2.setBounds(550, 193, 335, 40);
		panel.add(lblNewLabel_2);

		comboBox = new JComboBox<>();
		comboBox.setFont(new Font("Jost*", Font.BOLD, 16));
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Rembolsable", "No rembolsable", "corporativa ", "Promocional"}));
		comboBox.setBounds(550, 239, 335, 44);
		panel.add(comboBox);

		JLabel lblNewLabel_3 = new JLabel("Precio por noche:");
		lblNewLabel_3.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel_3.setBounds(550, 295, 335, 40);
		panel.add(lblNewLabel_3);

		JTextField textField_3 = new JTextField();
		textField_3.setBackground(new Color(192, 192, 192));
		textField_3.setBounds(550, 346, 335, 40);
		panel.add(textField_3);
		textField_3.setColumns(10);

		TarifaModel tarifa = new UsersModel().obtenerTarifaPorId(idtarifa);
		if (tarifa != null) {
			textField.setText(tarifa.getNombre());
			comboBox.setSelectedItem(tarifa.getCondicion());
			textField_3.setText(String.valueOf(tarifa.getPrecio()));
			idTarifaSeleccionada = tarifa.getIdTarifa();
		}

		JButton btnGuardarCambios = new JButton("Guardar cambios");
		btnGuardarCambios.setForeground(new Color(0, 0, 0));
		btnGuardarCambios.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		btnGuardarCambios.setBackground(new Color(255, 214, 10));
		btnGuardarCambios.setBounds(870, 580, 250, 40);
		panel.add(btnGuardarCambios);
		btnGuardarCambios.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String nuevoNombre = textField.getText().trim();
		        String nuevaCondicion = (String) comboBox.getSelectedItem();

		        if (nuevoNombre.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "El nombre no puede estar vacío.");
		            return;
		        }

		        // Conexión y actualización
		        ConectionModel conn = new ConectionModel();
		        boolean actualizado = new UsersModel().actualizarTarifa(conn.getConnection(), idtarifa, nuevoNombre, nuevaCondicion);
		        
		        if (actualizado) {
		            JOptionPane.showMessageDialog(frame, "✅ Tarifa actualizada correctamente.");
		            frame.dispose();
		            new HomeController().Tarifas();
		        } else {
		            JOptionPane.showMessageDialog(frame, "❌ Error al actualizar la tarifa.");
		        }
		    }
		});



		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

		

	public void HabitacionNoEncontrada() {
		
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
		
		JPanel panel_1 = new JPanel(); //Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel(); //Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel logo = new JLabel(""); //Logo
		logo.setBounds(0, 0, 170, 95);
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
        Image imagen1 = icon1.getImage().getScaledInstance(170, 95, Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(imagen1));
		panel_1.add(logo);
		
		JLabel Titulo = new JLabel("Panel de Habitaciones"); //Titulo 
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 540, 73);
		panel_1.add(Titulo);
		
		JLabel menuTitulo = new JLabel("Habitaciones:"); //Texto menú
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 38));
		menuTitulo.setBounds(131, 126, 450, 56);
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
				hc.PanelHabitaciones1();
			}
		});
		botonVolver.setBounds(60, 132, 36, 36);
		ImageIcon icon4 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
        Image imagen4 = icon4.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        botonVolver.setIcon(new ImageIcon(imagen4));
		panel.add(botonVolver);
		
		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
		btnclientes.setForeground(Color.WHITE);
		btnclientes.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnclientes.setFocusPainted(false);
		btnclientes.setContentAreaFilled(true);
		btnclientes.setBorderPainted(false);
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
		btnhabitaciones.setForeground(Color.WHITE);
		btnhabitaciones.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnhabitaciones.setFocusPainted(false);
		btnhabitaciones.setContentAreaFilled(true);
		btnhabitaciones.setBorderPainted(false);
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		btnhabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.PanelHabitaciones1();
			}
		});
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);
		
		JButton btnBuscar = new JButton(""); //Boton para la barra de busqueda
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(720, 140, 40, 40);
		ImageIcon icon5 = new ImageIcon(getClass().getResource("/Images/busqueda.png"));
        Image imagen5 = icon5.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        btnBuscar.setIcon(new ImageIcon(imagen5));
		btnBuscar.setBorderPainted(false);
		btnBuscar.setFocusPainted(false);
		btnBuscar.setContentAreaFilled(true);
		panel.add(btnBuscar);
		
		JTextField textField = new JTextField("BUSCAR"); //Texto de ejemplo
		textField.setToolTipText("");
		textField.setBounds(770, 140, 290, 40);
		textField.setColumns(10);
		textField.setBackground(new Color(217, 217, 217));
        textField.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
        textField.setForeground(Color.GRAY);
        final String placeholder = "BUSCAR"; //Borra el texto de ejemplo al escribir en el campo
        textField.addFocusListener(new FocusAdapter() {

            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(Color.GRAY);
                }
            }
        });
		panel.add(textField);	
		
		JButton btnEliminarCliente = new JButton("Eliminar Habitación"); //Botón prinicipal eliminar cliente
		btnEliminarCliente.setBackground(new Color(239, 35, 60));
		btnEliminarCliente.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnEliminarCliente.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarCliente.setForeground(Color.WHITE);
		btnEliminarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminarCliente.setBounds(131, 193, 280, 40);
		panel.add(btnEliminarCliente);
		
		JLabel lblNewLabel = new JLabel("Habitación no encontrada");
		lblNewLabel.setFont(new Font("Jost*", Font.BOLD, 60));
		lblNewLabel.setBounds(196, 368, 958, 63);
		panel.add(lblNewLabel);
		ImageIcon icon6 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen6 = icon6.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        
    	frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void ClienteNoEncontrado() {
		
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
		
		JPanel panel_1 = new JPanel(); //Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel(); //Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel logo = new JLabel(""); //Logo
		logo.setBounds(0, 0, 170, 95);
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
        Image imagen1 = icon1.getImage().getScaledInstance(170, 95, Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(imagen1));
		panel_1.add(logo);
		
		JLabel Titulo = new JLabel("Clientes"); //Titulo 
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 410, 73);
		panel_1.add(Titulo);
		
		JLabel menuTitulo = new JLabel("Registro de clientes:"); //Texto menú
		menuTitulo.setFont(new Font("Jost*", Font.BOLD, 38));
		menuTitulo.setBounds(131, 126, 570, 56);
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
				hc.Clientes();
			}
		});
		botonVolver.setBounds(60, 132, 50, 50);
		ImageIcon icon4 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
        Image imagen4 = icon4.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        botonVolver.setIcon(new ImageIcon(imagen4));
		panel.add(botonVolver);
		
		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
		btnclientes.setForeground(Color.WHITE);
		btnclientes.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnclientes.setFocusPainted(false);
		btnclientes.setContentAreaFilled(true);
		btnclientes.setBorderPainted(false);
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
		btnhabitaciones.setForeground(Color.WHITE);
		btnhabitaciones.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnhabitaciones.setFocusPainted(false);
		btnhabitaciones.setContentAreaFilled(true);
		btnhabitaciones.setBorderPainted(false);
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		btnhabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.PanelHabitaciones1();
			}
		});
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);
		
		JButton btnBuscar = new JButton(""); //Boton para la barra de busqueda
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(720, 140, 40, 40);
		ImageIcon icon5 = new ImageIcon(getClass().getResource("/Images/busqueda.png"));
        Image imagen5 = icon5.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        btnBuscar.setIcon(new ImageIcon(imagen5));
		btnBuscar.setBorderPainted(false);
		btnBuscar.setFocusPainted(false);
		btnBuscar.setContentAreaFilled(true);
		panel.add(btnBuscar);
		
		JTextField textField = new JTextField("BUSCAR"); //Texto de ejemplo
		textField.setToolTipText("");
		textField.setBounds(770, 140, 290, 40);
		textField.setColumns(10);
		textField.setBackground(new Color(217, 217, 217));
        textField.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 24));
        textField.setForeground(Color.GRAY);
        final String placeholder = "BUSCAR"; //Borra el texto de ejemplo al escribir en el campo
        textField.addFocusListener(new FocusAdapter() {

            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(Color.GRAY);
                }
            }
        });
		panel.add(textField);	
		
		JButton btnEliminarCliente = new JButton("Eliminar cliente"); //Botón prinicipal eliminar cliente
		btnEliminarCliente.setBackground(new Color(239, 35, 60));
		btnEliminarCliente.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnEliminarCliente.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnEliminarCliente.setForeground(Color.WHITE);
		btnEliminarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminarCliente.setBounds(131, 193, 280, 40);
		panel.add(btnEliminarCliente);
		
		JLabel lblNewLabel = new JLabel("Cliente no encontrado");
		lblNewLabel.setFont(new Font("Jost*", Font.BOLD, 60));
		lblNewLabel.setBounds(266, 368, 888, 63);
		panel.add(lblNewLabel);
		
		JButton btnCrearClienteNuevo = new JButton("Crear nuevo cliente");
		btnCrearClienteNuevo.setForeground(Color.BLACK);
		btnCrearClienteNuevo.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 24));
		btnCrearClienteNuevo.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnCrearClienteNuevo.setBackground(Color.YELLOW);
		btnCrearClienteNuevo.setBounds(421, 193, 280, 40);
		panel.add(btnCrearClienteNuevo);
		ImageIcon icon6 = new ImageIcon(getClass().getResource("/Images/cama_matrimonial2.png"));
        Image imagen6 = icon6.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        
        frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void Crear_habitaciones() {
		
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

		JPanel panel_1 = new JPanel(); //Borde negro
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel(); //Borde gris
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel logo = new JLabel(""); //Logo
		logo.setBounds(0, 0, 170, 95);
		// Corrected image path
		ImageIcon portada1 = new ImageIcon(getClass().getResource("/Images/logo.png"));
	    Image portada2 = portada1.getImage();
	    Image portada3 = portada2.getScaledInstance(170, 95,Image.SCALE_SMOOTH);
	    logo.setIcon(new ImageIcon(portada3));
		panel_1.add(logo);

		JLabel Titulo = new JLabel("Panel de Habitaciones"); //Titulo
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 500, 73);
		panel_1.add(Titulo);

		JLabel menuTitulo1 = new JLabel("Crear habitación"); //Texto menú
		menuTitulo1.setBackground(new Color(255, 255, 255));
		menuTitulo1.setFont(new Font("Jost*", Font.BOLD, 34));
		menuTitulo1.setBounds(131, 126, 600, 56);
		panel.add(menuTitulo1);

		JButton botonVolver = new JButton(""); // Boton para volver atrás
		botonVolver.setForeground(new Color(255, 255, 255));
		botonVolver.setBackground(new Color(255, 255, 255));
		botonVolver.setBorderPainted(false);
		botonVolver.setFocusPainted(false);
		botonVolver.setContentAreaFilled(true);
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		botonVolver.setBounds(60, 132, 50, 50);
		// Corrected image path
		ImageIcon f1 = new ImageIcon(getClass().getResource("/Images/flecha_izquierda.png"));
		Image f2 = f1.getImage();
		Image f3 = f2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
		botonVolver.setIcon(new ImageIcon(f3));
		botonVolver.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Cierra la ventana actual del menú
				HomeController hc = new HomeController();
				hc.PanelHabitaciones1();	
			}
		});      
		panel.add(botonVolver);


		JButton btnTiposDeRentas = new JButton("<html>Tipos de habitaciones &#8594;</html>"); //Botón superior tipos de habitaciones
		btnTiposDeRentas.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		btnTiposDeRentas.setForeground(new Color(255, 255, 255));
		btnTiposDeRentas.setBackground(new Color(56, 54, 41));
		btnTiposDeRentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
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
		
		JButton btnrentas = new JButton("<html>Rentas &#8594;</html>"); //Botón superior rentas
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
		btnrentas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnrentas.setBackground(new Color(56, 54, 41));
		btnrentas.setBounds(883, 0, 81, 23);
		panel_2.add(btnrentas);
		
		JButton btnclientes = new JButton("<html>Clientes &#8594;</html>"); //Botón superior clientes
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
		btnclientes.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnclientes.setBackground(new Color(56, 54, 41));
		btnclientes.setBounds(792, 0, 81, 23);
		panel_2.add(btnclientes);
		
		JButton btnhabitaciones = new JButton("<html>Habitaciones &#8594;</html>"); //Botón superior habitaciones
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
		btnhabitaciones.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btnhabitaciones.setBackground(new Color(56, 54, 41));
		btnhabitaciones.setBounds(682, 0, 100, 23);
		panel_2.add(btnhabitaciones);
		
		JButton btntarifas = new JButton("<html>Tarifas &#8594;</html>"); //Botón superior tarifas
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
		btntarifas.setBorder(BorderFactory.createLineBorder(Color.BLACK,0));
		btntarifas.setBackground(new Color(56, 54, 41));
		btntarifas.setBounds(600, 0, 72, 23);
		panel_2.add(btntarifas);
		
		
		
		
		

		JLabel lblNewLabel = new JLabel("Nombre del cuarto:");
		lblNewLabel.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel.setBounds(141, 193, 335, 40);
		panel.add(lblNewLabel);

		JTextField textField_1 = new JTextField();
		textField_1.setBackground(new Color(192, 192, 192));
		textField_1.setBounds(141, 244, 335, 40);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Camas de cuarto:");
		lblNewLabel_2.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel_2.setBounds(550, 193, 335, 40);
		panel.add(lblNewLabel_2);

		JTextField textField_2 = new JTextField();
		textField_2.setBackground(new Color(192, 192, 192));
		textField_2.setBounds(550, 244, 335, 40);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Descripción:");
		lblNewLabel_1.setFont(new Font("Jost*", Font.BOLD, 24));
		lblNewLabel_1.setBounds(141, 295, 335, 40);
		panel.add(lblNewLabel_1);

		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBackground(new Color(192, 192, 192));
		textArea.setBounds(141, 346, 335, 100);
		panel.add(textArea);

			
//#######################################################################################
		JButton btnNewButton = new JButton("Crear habitacion");
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("Jost*", Font.BOLD, 24));
		btnNewButton.setBounds(870, 580, 250, 40);
		panel.add(btnNewButton);
		

		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String nombre = textField_1.getText().trim();
		        String capacidadStr = textField_2.getText().trim();
		        String descripcion = textArea.getText().trim();

		        if (nombre.isEmpty() || capacidadStr.isEmpty() || descripcion.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "❗Todos los campos son obligatorios.");
		            return;
		        }

		        int capacidad;
		        try {
		            capacidad = Integer.parseInt(capacidadStr);
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(null, "❗La capacidad debe ser un número entero.");
		            return;
		        }

		        ConectionModel conn = new ConectionModel();
		        boolean exito = new UsersModel().crearHabitacion(conn.getConnection(), nombre, capacidad, descripcion);

		        if (exito) {
		            JOptionPane.showMessageDialog(null, "✅ Habitación registrada exitosamente.");
		            frame.dispose();
		            new HomeController().PanelHabitaciones1();
		        } else {
		            JOptionPane.showMessageDialog(null, "❌ Error al registrar la habitación.");
		        }
		    }
		});

		frame.getContentPane().add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
}
	
	
}
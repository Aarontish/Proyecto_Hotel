package Views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatLightLaf;

import Controllers.AuthControllers;
import Controllers.HomeController;




public class AuthView {

	public AuthView() {

	}
	public void Inicio() {
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

		JPanel panel_1 = new JPanel(); // Borde negro superior
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel(); // Borde gris debajo del negro
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);

		JLabel logo = new JLabel(""); // Logo
		logo.setBounds(0, 0, 170, 95);
		ImageIcon portada1 = new ImageIcon(getClass().getResource("/images/logo.png"));
		Image portada2 = portada1.getImage();
		Image portada3 = portada2.getScaledInstance(170, 95, Image.SCALE_SMOOTH);
		logo.setIcon(new ImageIcon(portada3));
		panel_1.add(logo);

		JLabel Titulo = new JLabel("Registro/Iniciar sesión"); // Titulo
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 521, 73);
		panel_1.add(Titulo);

		JButton Iniciar_sesion = new JButton("\r\n");
		Iniciar_sesion.setBackground(new Color(255, 214, 10));
		Iniciar_sesion.setBounds(346, 193, 30, 30);
		ImageIcon icon121 = new ImageIcon(getClass().getResource("/images/usuario.png"));
		Image imagen121 = icon121.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		Iniciar_sesion.setIcon(new ImageIcon(imagen121));
		Iniciar_sesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				AuthControllers ac = new AuthControllers();
				ac.Login();
				
			}
		});
		Iniciar_sesion.setBounds(87, 240, 350, 300);
		panel.add(Iniciar_sesion);

		JButton Registro = new JButton("");
		Registro.setBackground(new Color(0, 0, 0));
		ImageIcon icon23 = new ImageIcon(getClass().getResource("/images/usuario.png"));
		Image imagen23 = icon23.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		Registro.setIcon(new ImageIcon(imagen23));
		Registro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				AuthControllers ac = new AuthControllers();
				ac.Registro();
				
			}
		});
		Registro.setBounds(729, 240, 350, 300);
		panel.add(Registro);

		JLabel lblNewLabel = new JLabel("Iniciar sesión\r\n");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel.setBounds(176, 549, 200, 56);
		panel.add(lblNewLabel);

		JLabel lblRegistrarse = new JLabel("Registrarse\r\n");
		lblRegistrarse.setFont(new Font("Dialog", Font.BOLD, 25));
		lblRegistrarse.setBounds(839, 550, 209, 56);
		panel.add(lblRegistrarse);
		
		frame.add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true);
	}
	public void Login() {
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

		JPanel panel_1 = new JPanel(); // Borde negro superior
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 1164, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel(); // Borde gris debajo del negro
		panel_2.setBackground(new Color(55, 54, 48));
		panel_2.setBounds(0, 95, 1164, 26);
		panel.add(panel_2);

		JLabel logo = new JLabel(""); // Logo
		logo.setBounds(0, 0, 170, 95);
		ImageIcon portada1 = new ImageIcon(getClass().getResource("/images/logo.png"));
		Image portada2 = portada1.getImage();
		Image portada3 = portada2.getScaledInstance(170, 95, Image.SCALE_SMOOTH);
		logo.setIcon(new ImageIcon(portada3));
		panel_1.add(logo);

		JLabel Titulo = new JLabel("Iniciar sesión"); // Titulo
		Titulo.setForeground(new Color(255, 255, 255));
		Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
		Titulo.setBounds(180, 11, 410, 73);
		panel_1.add(Titulo);
		ImageIcon c1 = new ImageIcon(getClass().getResource("/images/usuario.png"));
		Image c2 = c1.getImage();
		Image c3 = c2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
		ImageIcon e1 = new ImageIcon(getClass().getResource("/images/informacion.png"));
		Image e2 = e1.getImage();
		Image e3 = e2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);

		JButton botonVolver = new JButton(""); // Boton para volver atrás
		botonVolver.setForeground(new Color(255, 255, 255));
		botonVolver.setBackground(new Color(255, 255, 255));
		botonVolver.setBorderPainted(false);
		botonVolver.setFocusPainted(false);
		botonVolver.setContentAreaFilled(true);
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); 
				AuthControllers ac = new AuthControllers();
				ac.Inicio();
				             
			}
		});
		botonVolver.setBounds(60, 132, 50, 50);
		ImageIcon f1 = new ImageIcon(getClass().getResource("/images/flecha_izquierda.png"));
		Image f2 = f1.getImage();
		Image f3 = f2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
		botonVolver.setIcon(new ImageIcon(f3));
		panel.add(botonVolver);


		JLabel textoUsuario = new JLabel("Usuario:"); // Texto para el campo del usuario
		textoUsuario.setFont(new Font("Jost*", Font.BOLD, 24));
		textoUsuario.setBounds(382, 152, 120, 30);
		panel.add(textoUsuario);

		JTextField usernameField = new JTextField(); // Campo de usuario
		usernameField.setBackground(new Color(233, 236, 239));
		usernameField.setBounds(382, 193, 400, 30);
		panel.add(usernameField);
		usernameField.setColumns(10);

		JLabel userIcon = new JLabel(""); // Icono junto al campo de usuario
		userIcon.setBounds(346, 193, 30, 30);
		ImageIcon g1 = new ImageIcon(getClass().getResource("/images/icon.png"));
		Image g2 = g1.getImage();
		Image g3 = g2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		userIcon.setIcon(new ImageIcon(g3));
		panel.add(userIcon);

		JLabel textoContraseña = new JLabel("Contraseña:"); // Texto para el campo de la contraseña
		textoContraseña.setFont(new Font("Jost*", Font.BOLD, 24));
		textoContraseña.setBounds(382, 272, 170, 30);
		panel.add(textoContraseña);

		JPasswordField passwordField = new JPasswordField(); // Campo de contraseña
		passwordField.setBackground(new Color(233, 236, 239));
		passwordField.setBounds(382, 313, 400, 30);
		panel.add(passwordField);

		JLabel candadoIcon = new JLabel(""); // Icono junto al campo de contraseña
		candadoIcon.setBounds(346, 313, 30, 30);
		ImageIcon h1 = new ImageIcon(getClass().getResource("/images/candado.png"));
		Image h2 = h1.getImage();
		Image h3 = h2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		candadoIcon.setIcon(new ImageIcon(h3));
		panel.add(candadoIcon);

		JButton botonVerContraseña = new JButton("Ver contraseña"); // Boton para ver contraseña
		botonVerContraseña.setFont(new Font("Jost* Medium", Font.PLAIN, 12));
		botonVerContraseña.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		botonVerContraseña.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (passwordField.getEchoChar() == 0) {
					passwordField.setEchoChar('*');
					botonVerContraseña.setText("Ver contraseña");
				} else {
					passwordField.setEchoChar((char) 0);
					botonVerContraseña.setText("Ocultar contraseña");
				}
			}
		});
		botonVerContraseña.setBounds(382, 354, 120, 23);
		panel.add(botonVerContraseña);

		JLabel messageLabel = new JLabel(""); // Etiqueta para mensajes de error/éxito
		messageLabel.setForeground(Color.RED);
		messageLabel.setFont(new Font("Jost*", Font.PLAIN, 14));
		messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		messageLabel.setBounds(382, 450, 400, 25);
		panel.add(messageLabel);

		JButton botonLogin2 = new JButton("Iniciar sesión"); // Boton para iniciar sesión
		botonLogin2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
		botonLogin2.setFont(new Font("Jost* Medium", Font.BOLD, 24));
		botonLogin2.setBackground(new Color(255, 214, 10));
		botonLogin2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomeController hc = new HomeController();
				hc.Menu();
			}
		});
		botonLogin2.setBounds(482, 492, 200, 50);
		panel.add(botonLogin2);
		
		frame.add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true);
	}

//    private void performLogin() {
//        String username = usernameField.getText();
//        String password = new String(passwordField.getPassword());
//
//        if (username.isEmpty() || password.isEmpty()) {
//            messageLabel.setForeground(Color.RED);
//            messageLabel.setText("Por favor, ingresa usuario y contraseña.");
//            return;
//        }
//
//        
//        Usuario usuarioAutenticado = usuarioDAO.login(username, password);
//
//        if (usuarioAutenticado != null) {
//            messageLabel.setForeground(Color.GREEN);
//            messageLabel.setText("¡Bienvenido, " + usuarioAutenticado.getNombreUsuario() + "!");
//            JOptionPane.showMessageDialog(frame, "¡Login exitoso!", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
//
//            frame.dispose();
//            Menu menuWindow = new Menu();
//            menuWindow.frame.setVisible(true);
//
//        } else {
//            messageLabel.setForeground(Color.RED);
//            messageLabel.setText("Usuario o contraseña incorrectos.");
//            JOptionPane.showMessageDialog(frame, "Usuario o contraseña incorrectos.", "Error de Login", JOptionPane.ERROR_MESSAGE);
//        }
//    }
    public void Registro() {
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

        JLabel logo = new JLabel(""); // Logo
        logo.setBounds(0, 0, 170, 95);
        ImageIcon portada1 = new ImageIcon(getClass().getResource("/images/logo.png"));
        Image portada2 = portada1.getImage();
        Image portada3 = portada2.getScaledInstance(170, 95, Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(portada3));
        panel_1.add(logo);
        JButton botonVolver = new JButton(""); // Boton para volver atrás
		botonVolver.setForeground(new Color(255, 255, 255));
		botonVolver.setBackground(new Color(255, 255, 255));
		botonVolver.setBorderPainted(false);
		botonVolver.setFocusPainted(false);
		botonVolver.setContentAreaFilled(true);
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AuthControllers ac = new AuthControllers();
				ac.Inicio();
				
              
			}
		});
		botonVolver.setBounds(60, 132, 50, 50);
		ImageIcon f1 = new ImageIcon(getClass().getResource("/images/flecha_izquierda.png"));
		Image f2 = f1.getImage();
		Image f3 = f2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
		botonVolver.setIcon(new ImageIcon(f3));
		panel.add(botonVolver);
		
        JLabel Titulo = new JLabel("Registro/Iniciar sesión"); // Titulo
        Titulo.setForeground(new Color(255, 255, 255));
        Titulo.setFont(new Font("Jost* Medium", Font.PLAIN, 35));
        Titulo.setBounds(180, 11, 410, 73);
        panel_1.add(Titulo);
        ImageIcon c1 = new ImageIcon(getClass().getResource("/images/usuario.png"));
        Image c2 = c1.getImage();
        Image c3 = c2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);
        ImageIcon e1 = new ImageIcon(getClass().getResource("/images/informacion.png"));
        Image e2 = e1.getImage();
        Image e3 = e2.getScaledInstance(36, 36, Image.SCALE_SMOOTH);

        
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(null); 
        loginPanel.setBackground(new Color(255, 255, 255));
        loginPanel.setBounds(380, 205, 400, 420);

        // Etiqueta de "Iniciar Sesión" (dentro del nuevo panel)
        JLabel loginTitle = new JLabel("Registro\r\n");
        loginTitle.setFont(new Font("Dialog", Font.BOLD, 32));
        loginTitle.setBounds(119, 10, 200, 40);
        loginPanel.add(loginTitle);

        // Campo de Usuario
        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setFont(new Font("Jost*", Font.PLAIN, 18));
        userLabel.setBounds(50, 80, 100, 30);
        loginPanel.add(userLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(50, 115, 300, 35);
        usernameField.setFont(new Font("Jost*", Font.PLAIN, 16));
        loginPanel.add(usernameField);

        // Campo de Contraseña
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setFont(new Font("Jost*", Font.PLAIN, 18));
        passwordLabel.setBounds(50, 160, 150, 30);
        loginPanel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(50, 195, 300, 35);
        passwordField.setFont(new Font("Jost*", Font.PLAIN, 16));
        loginPanel.add(passwordField);

        // Botón de Login (el que realmente enviará las credenciales)
        JButton doLoginButton = new JButton("Ingresar");
        doLoginButton.setBackground(new Color(255, 214, 10));
        doLoginButton.setForeground(new Color(0, 0, 0));
        doLoginButton.setFont(new Font("Jost*", Font.BOLD, 20));
        doLoginButton.setBounds(127, 348, 150, 45);
        doLoginButton.setFocusPainted(false);
        doLoginButton.setBorderPainted(false);
        doLoginButton.setContentAreaFilled(true);
        doLoginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	frame.dispose();
                AuthControllers ac = new AuthControllers();
                ac.Login();
            }
        });
        loginPanel.add(doLoginButton);


        JLabel messageLabel = new JLabel("");
        messageLabel.setForeground(Color.RED); // Inicialmente en rojo para errores
        messageLabel.setFont(new Font("Jost*", Font.PLAIN, 14));
        messageLabel.setBounds(50, 300, 300, 20);
        loginPanel.add(messageLabel);

        panel.add(loginPanel);
        
        JPasswordField passwordField_1 = new JPasswordField();
        passwordField_1.setFont(new Font("Dialog", Font.PLAIN, 16));
        passwordField_1.setBounds(50, 279, 300, 35);
        loginPanel.add(passwordField_1);
        
        JLabel lblConfirmarContrasena = new JLabel("Confirmar contraseña:\r\n");
        lblConfirmarContrasena.setFont(new Font("Dialog", Font.PLAIN, 18));
        lblConfirmarContrasena.setBounds(50, 240, 269, 30);
        loginPanel.add(lblConfirmarContrasena);
        
        frame.add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true);
    }
    

    // --- Lógica del Login ---
//    private void performLogin() {
//        String username = usernameField.getText();
//        String password = new String(passwordField.getPassword()); // Obtiene la contraseña como String
//
//        if (username.isEmpty() || password.isEmpty()) {
//            messageLabel.setForeground(Color.RED);
//            messageLabel.setText("Por favor, ingresa usuario y contraseña.");
//            return;
//        }
//
//
//        Usuario authenticatedUser = usuarioDAO.login(username, password);
//
//        if (authenticatedUser != null) {
//            messageLabel.setForeground(Color.GREEN);
//            messageLabel.setText("¡Login exitoso!");
//            JOptionPane.showMessageDialog(frame, "Bienvenido, " + authenticatedUser.getNombreUsuario() + "!", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
//
//            frame.dispose(); // Cierra la ventana actual del login
//            Menu menuWindow = new Menu(); // Abre la ventana del menú principal
//            menuWindow.frame.setVisible(true);
//
//        } else {
//            messageLabel.setForeground(Color.RED);
//            messageLabel.setText("Credenciales incorrectas. Intenta de nuevo.");
//            JOptionPane.showMessageDialog(frame, "Credenciales incorrectas.", "Error de Login", JOptionPane.ERROR_MESSAGE);
//        }
//    }
	

}

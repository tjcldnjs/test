package ch01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.HomePagePanel;

public class CarReservationPanel extends JFrame implements ActionListener {

	CarDetail carDetail;

	// 배경 패널
	JPanel backgroundPanel = new JPanel();

	// 로고
	private JLabel logoLabel;
	private JLabel headerLabel;

	// 차량 버튼
	private JButton k3;
	private JButton k5;
	private JButton model3;
	private JButton nexo;
	private JButton staria;
	private JButton sonata;
	private JButton avante;
	private JButton kanibal;

	public CarReservationPanel() {
		initData();
		setInitLayout();
		addEventListener();
	}

	public void initData() {

		// 로고 라벨
		logoLabel = new JLabel(new ImageIcon("img/logo2.png"));
		
		// 타이틀 라벨
		headerLabel = new JLabel("차량으로 예약");

		// 차량 버튼
		k3 = new JButton(new ImageIcon("img/k3.png"));
		k5 = new JButton(new ImageIcon("img/k5.png"));
		model3 = new JButton(new ImageIcon("img/MODEL3.png"));
		nexo = new JButton(new ImageIcon("img/넥쏘.png"));
		staria = new JButton(new ImageIcon("img/스타리아.png"));
		sonata = new JButton(new ImageIcon("img/쏘나타.png"));
		avante = new JButton(new ImageIcon("img/아반떼.png"));
		kanibal = new JButton(new ImageIcon("img/카니발.png"));

	}

	public void setInitLayout() {
		// 프레임 설정
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);

		// 패널
		backgroundPanel.setSize(getWidth(), getHeight());
		backgroundPanel.setBackground(Color.WHITE);
		backgroundPanel.setLayout(null);
		add(backgroundPanel);

		// logo 이미지
		logoLabel.setBounds(30, 0, 105, 200);
		logoLabel.setLayout(null);
		backgroundPanel.add(logoLabel);
		
		// header 이미지
		headerLabel.setBounds(200, 60, 300, 100);
		headerLabel.setLayout(null);
		headerLabel.setFont(new Font("궁서", Font.BOLD, 30));
		backgroundPanel.add(headerLabel);

		// 차량 버튼 이미지
		k3.setBounds(60, 230, 200, 200);
		k3.setLayout(null);
		backgroundPanel.add(k3);

		k5.setBounds(280, 230, 200, 200);
		k5.setLayout(null);
		backgroundPanel.add(k5);

		model3.setBounds(500, 230, 200, 200);
		model3.setLayout(null);
		backgroundPanel.add(model3);

		nexo.setBounds(720, 230, 200, 200);
		nexo.setLayout(null);
		backgroundPanel.add(nexo);

		staria.setBounds(60, 550, 200, 200);
		staria.setLayout(null);
		backgroundPanel.add(staria);

		sonata.setBounds(280, 550, 200, 200);
		sonata.setLayout(null);
		backgroundPanel.add(sonata);

		avante.setBounds(500, 550, 200, 200);
		avante.setLayout(null);
		backgroundPanel.add(avante);

		kanibal.setBounds(720, 550, 200, 200);
		kanibal.setLayout(null);
		backgroundPanel.add(kanibal);

		k3.setBorder(null);
		k5.setBorder(null);
		model3.setBorder(null);
		nexo.setBorder(null);
		staria.setBorder(null);
		sonata.setBorder(null);
		avante.setBorder(null);
		kanibal.setBorder(null);

		k3.setContentAreaFilled(false);
		k5.setContentAreaFilled(false);
		model3.setContentAreaFilled(false);
		nexo.setContentAreaFilled(false);
		staria.setContentAreaFilled(false);
		sonata.setContentAreaFilled(false);
		avante.setContentAreaFilled(false);
		kanibal.setContentAreaFilled(false);

		backgroundPanel.add(k3);
		backgroundPanel.add(k5);
		backgroundPanel.add(model3);
		backgroundPanel.add(nexo);
		backgroundPanel.add(staria);
		backgroundPanel.add(sonata);
		backgroundPanel.add(avante);
		backgroundPanel.add(kanibal);

		setVisible(true);
	}

	private void addEventListener() {
		k3.addActionListener(this);
		k5.addActionListener(this);
		model3.addActionListener(this);
		nexo.addActionListener(this);
		staria.addActionListener(this);
		sonata.addActionListener(this);
		avante.addActionListener(this);
		kanibal.addActionListener(this);

		logoLabel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				new HomePagePanel();
				setVisible(false);
			}

		});

	}

	private class BackgroundPanel extends JPanel {
		// private Image backgroundImage;
		private JPanel backgroundPanel;

		// 백그라운드 패널
		public BackgroundPanel() {
			// backgroundImage = new ImageIcon("img/background.jpg").getImage();
			backgroundPanel = new JPanel();
		}

//		@Override
//		protected void paintComponent(Graphics g) {
//			super.paintComponent(g);
//			g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);
//		}
	}

	public static void main(String[] args) {
		new CarReservationPanel();
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == k3) {
			new CarDetail().DetailK3();
		} else if (e.getSource() == k5) {
			new CarDetail().DetailK5();
		} else if (e.getSource() == model3) {
			new CarDetail().DetailModel3();
		} else if (e.getSource() == nexo) {
			new CarDetail().DetailNexo();
		} else if (e.getSource() == staria) {
			new CarDetail().DetailStaria();
		} else if (e.getSource() == sonata) {
			new CarDetail().DetailSonata();
		} else if (e.getSource() == avante) {
			new CarDetail().DetailAvante();
		} else if (e.getSource() == kanibal) {
			new CarDetail().DetailKanibal();
		}
	}
}
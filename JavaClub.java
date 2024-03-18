package HW4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

//import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class JavaClub {
Customer[] cust = new Customer[1000];
Coffee[] coffeeE = new Espresso[1000];
Coffee[] coffeeM = new Macchiato[1000];
Coffee[] coffeeL = new Latte[1000];
Coffee[] coffeeC = new Cappuccino[1000];
int e1 = 0;
int m = 0;
int l = 0;
int c = 0;
String s0 = "";

int i = 0;
int t = 0;
String s2 = "";
String str;
String order_history;
String new_line1 = "";

	public void start() {
		// EventQueue.invokerLater reveal the graphics after everything has loaded
		// Without this, graphics may not appear properly!
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
	
						BufferedImage myPicture = ImageIO.read(new File("coffee.png"));
						JLabel picLabel = new JLabel(new ImageIcon(myPicture));
						//https://www.baeldung.com/java-images#:~:text=We%20can%20do%20it%20using%20Swing%20library%20objects.,JPanel%20jPanel%20%3D%20new%20JPanel%20%28%29%3B%20jPanel.add%20%28picLabel%29%3B
						
						
						JPanel Panel2 = new JPanel();
						Panel2.add(picLabel);
						//Panel2.setSize(new Dimension(myPicture.getWidth(), myPicture.getHeight()));
						//Panel2.setMaximumSize(new Dimension(myPicture.getWidth(), myPicture.getHeight()));
						
						
						JPanel Panel1 = new JPanel();
						JTextField welcome = new JTextField("Welcome to the Java Club!");
						welcome.setFont(new Font("Garamond", Font.BOLD, 60));
						welcome.setHorizontalAlignment(JTextField.CENTER);
						welcome.setEditable(false);
						Panel1.add(welcome);
						//Panel1.setSize(new Dimension(myPicture.getWidth(), myPicture.getHeight()));
						
						JPanel Panel3 = new JPanel();
						JTextField whatText = new JTextField("What would you like to do today?");
						whatText.setFont(new Font("Garamond", Font.ITALIC, 50));
						Panel3.add(whatText);
						
						JPanel Panel4 = new JPanel();
						
						
						JPanel Panel5 = new JPanel();
						JButton order = new JButton("Order");
						order.setFont(new Font("Garamond", Font.BOLD, 20));
						ActionListener actionListener = new ActionListener() {
					         public void actionPerformed(ActionEvent actionEvent) {
					        	//https://alvinalexander.com/java/joptionpane-showinputdialog-examples/
					        	String name = JOptionPane.showInputDialog(Panel4, "What's your name?");
					        	String num = JOptionPane.showInputDialog(Panel4, "What's your phone no. in xxx-xxx-xxxx format?");
					        	String email = JOptionPane.showInputDialog(Panel4,"What's your email address?");
					        	String premium = JOptionPane.showInputDialog(Panel4, "Are you a premium customer - Answer Y for Yes and N for No ?");
					           Component source = (Component) actionEvent.getSource();
					           Object response = JOptionPane.showInputDialog(source,
					               "Choose One?", "JOptionPane Sample",
					               JOptionPane.QUESTION_MESSAGE, null, new String[] { "Espresso", "Cappuccino", "Latte", "Macchiato" },
					               "Espresso");
					       
					        	   
					           if (response == "Espresso") {
					        	   s2 = "Espresso";
					        	   t = 5;
					        	   coffeeE[e1] = new Espresso(0.8,0,0.2); 
					        	   coffeeE[e1].prepare();
					        	   s0 = coffeeE[e1].toString();
					        	   e1++;
					           }
					           else if (response == "Cappuccino") {
					        	   s2 = "Cappuccino";
					        	   t = 6;
					        	   coffeeE[c] = new Cappuccino(0.33,0.34,0.33); 
					        	   coffeeE[c].prepare();
					        	   s0 = coffeeE[c].toString();
					        	   c++;
					           }
					           else if (response == "Latte") {
					        	   s2 = "Latte";
					        	   t = 7;
					        	   coffeeE[l] = new Latte(0.2,0.6,0.2); 
					        	   coffeeE[l].prepare();
					        	   s0 = coffeeE[l].toString();
					        	   l++;
					           }
					           else if (response == "Macchiato") {
					        	   s2 = "Macchiato";
					        	   t = 8;
					        	   coffeeE[m] = new Macchiato(0.7,0.1,0.2); 
					        	   coffeeE[m].prepare();
					        	   s0 = coffeeE[m].toString();
					        	   m++;
					           }
					           else
					        	   t = 0;
					           //https://stackoverflow.com/questions/5175728/how-to-get-the-current-date-time-in-java
					           String timeStamp = new SimpleDateFormat("MM-dd-yyyy HH:mm").format(Calendar.getInstance().getTime());
					           String s1 = "Thank you for your order, " + name + "! Please pay $" + t + " when you pick it up.";
					           if (response != null)
					        	   Toast(s0+ "\r\n" + s1, "Your Order Summary");
					           //Panel4.add(areaScrollPane);
					           //System.out.println("Thank you for your order of " + response + ", " + name + "! Please pay $" + t + " when you pick it up.");
					         cust[i] = new Customer(name, num, email, premium, timeStamp, s2, t);
					         str = cust[i].toString();
					         i++;
					         writeToFile("CustomerList.txt",str);
					         }
					       };
					       order.addActionListener(actionListener);
					       //https://stackoverflow.com/questions/30620507/simple-java-dialog-to-choose-option
						
						
						
						JButton orderHistory = new JButton("Check Order History");
						orderHistory.setFont(new Font("Garamond", Font.BOLD, 20));
						ActionListener actionListener1 = new ActionListener() {
					         public void actionPerformed(ActionEvent actionEvent) {
					        	//https://alvinalexander.com/java/joptionpane-showinputdialog-examples/
					        	String name = JOptionPane.showInputDialog(Panel4, "What's your name?");
					        	String num = JOptionPane.showInputDialog(Panel4, "What's your phone no. in xxx-xxx-xxxx format?");
					        	order_history = readFile(name, num);
					        	Toast(order_history, "Your Order History");
					         }
					         
						};
					       orderHistory.addActionListener(actionListener1);
					        	
					        	
					        	
						JButton subscribe = new JButton("Become a Premium Customer!");
						subscribe.setFont(new Font("Garamond", Font.BOLD, 20));
						ActionListener actionListener2 = new ActionListener() {
					         public void actionPerformed(ActionEvent actionEvent) {
					        	//https://alvinalexander.com/java/joptionpane-showinputdialog-examples/
					        	String name = JOptionPane.showInputDialog(Panel4, "What's your name?");
					        	String num = JOptionPane.showInputDialog(Panel4, "What's your phone no. in xxx-xxx-xxxx format?");
					        	String premium_member = name + ", " + num;
					        	String premium_member1 = premium_member + "\r\n" + "Get a beverage free for every 10 orders placed!";
					        	Toast(premium_member, "Success! You are now a Premium Customer!");
					        	writeToFile("PremiumCustomerList.txt",premium_member);
					        	
					         }
					         
						};
					       subscribe.addActionListener(actionListener2);
						
						Panel5.setLayout(new GridLayout(1,3));
						Panel5.add(order);
						Panel5.add(orderHistory);
						Panel5.add(subscribe);
						//Panel5.add(areaScrollPane);
						//Panel4.setSize(800,10);

						JPanel panel = new JPanel( new GridLayout(5,1,0,10) );
						panel.add( Panel1 );
						panel.add( Panel2 );
						panel.add( Panel3 );
						//panel.add( Panel4 );
						panel.add( Panel5 );
						
						JFrame f = new JFrame();
						//f.setSize(new Dimension(myPicture.getWidth(), myPicture.getHeight()));
						f.setSize(800,800);
						f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
						try {
							UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
						} catch (Exception e) {
							e.printStackTrace();
						}
						
						f.add(panel);
						f.setVisible(true);
					}catch (Exception e) {
					e.printStackTrace();
					}
}
		});
}
	
	//https://stackoverflow.com/questions/7765478/how-to-add-text-area-on-joptionpane
	public static void Toast(Object msg, String title) {
		JOptionPane.showMessageDialog(null,msg, title, JOptionPane.OK_CANCEL_OPTION);
	}
	
	public static String readFile(String name, String num) {
		
		String s3 = name + "," + num;
		String s4 = "";
		try (Scanner fileScanner = new Scanner(Paths.get("CustomerList.txt"))) {
			
			while (fileScanner.hasNextLine()) {
				int n = 0;
				String line = fileScanner.nextLine();
				for (int m = 0; m<s3.length(); m++) {
					if (s3.charAt(m) == line.charAt(m)) {
						n = m;
					}
				}
				if (n == (s3.length()-1)) {
					
					s4 =  line + "\r\n" + s4;
				}
				// parse (convert) this String
				// then add to your ArrayList
				
				//if(line.isEmpty()) {
					//continue; }
				//System.out.println("line " + line);
				
				//String[] strings = line.split(",");
				//arr_S[nums] = new Student(strings[0],Integer.parseInt(strings[1]) ,Integer.parseInt(strings[2]),Integer.parseInt(strings[3]));
				
			}
			fileScanner.close();
}catch (Exception e) {
	e.printStackTrace();
}
return s4;
	}
	
	public static void writeToFile(String filename, String str) {
		try {
			FileWriter fw = new FileWriter(filename, true);
			BufferedWriter bw = new BufferedWriter(fw);
		    PrintWriter pw = new PrintWriter(bw);
			
				pw.println(str);
			    pw.close();
			    
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
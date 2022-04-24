package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUI1 extends JFrame {

	private JTextArea area = new JTextArea(); // Chat Area
	private JScrollPane scroll;
	private JTextField field = new JTextField();// Chat Field
	private JButton button = new JButton();// The Button
	private JLabel label = new JLabel();// A label for the button (i.e., "return")

	Boolean ex = false;
	int excount = 0;

	public GUI1() {

		// Adding the feature enabling to scroll
		scroll = new JScrollPane();
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setSize(660, 420);
		scroll.getViewport().setBackground(Color.black);
		scroll.getViewport().add(area);

		Survey survey = new Survey();
		Device device = new Device();// creates instance of device
		solution sol = new solution(device);

		JFrame frame = new JFrame();
		frame.setSize(675, 500); // SCREEN SIZE
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.getContentPane();

		frame.setTitle("Nils' Final Project - A COSC310 Virtual Assistant"); // Title
		// Adding different parts to frame
		// frame.add(area);
		frame.add(scroll);
		frame.add(field);
		frame.add(button);

		// AREA SETTINGS
		area.setSize(675, 420); // SIZE
		area.setLocation(0, 0); // LOCATION
		area.setBackground(Color.white); // BACKGROUND COLOR
		area.setForeground(Color.BLUE); // TEXT COLOR
		area.setAutoscrolls(true);

		// field settings
		field.setSize(576, 20);
		field.setLocation(1, 420);

		// BUTTON SETTINGS
		button.setSize(675, 60); // SIZE
		button.setLocation(575, 420); // LOCATION

		// LABEL SETTING
		label.setText("RETURN"); // TEXT
		label.setAlignmentY(button.getAlignmentY() - 2);
		button.add(label); // Assigning the Label to the Bottom

		// opening statement
		area.append(
				"-*---*---*---*---*---*---*---*---*---*----*---*--*---*---*---*---*---*---*---*---*---*----*---*--*---*---*---*---*---*---*---*---*---*----*---*----*----*----*---*---*----*---*----*----*-- \n");
		area.append(
				"                                             Hello! I am Nils Kelley's COSC310 Final Project! \n                            "
						+ "                 I am a modification of Team 30's Virtual Product Assistant!! \n"
						+ "-*---*---*---*---*---*---*---*---*---*----*---*--*---*---*---*---*---*---*---*---*---*----*---*--*---*---*---*---*---*---*---*---*---*----*---*----*----*----*---*---*----*---*----*----*-- \n"
						+ "                                            (-)    TO EXIT PRROGRAM: Type 'exit' or 'done'\n"
						+ "                                            (-)    TO SEE KEYWORDS: Type 'keywords' \n"
						+ "                                            (-)    FOR DEFINITION OF KEYWORDS: Type 'define' before the KEYWORD \n"
						+ "                                            (-)    TO TRANSLATE (keywords into GERMAN): Type 'translate' before the KEYWORD \n"
						+ "-*---*---*---*---*---*---*---*---*---*----*---*--*---*---*---*---*---*---*---*---*---*----*---*--*---*---*---*---*---*---*---*---*---*----*---*----*----*----*---*---*----*---*----*----*-- \n"
						+ "Chatbot : How can I help you today? Please input one of the following three options:\n"
						+ "                                   (-) Android Restoration\n"
						+ "                                   (-) To View Keywords\n"
						+ "                                   (-) iPhone Restoration\n");

		// Adding Action Listener for the Button
		button.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// button press
				if (e.getSource() == button) {
					// Getting text from user once BUTTON is pressed
					String userText = field.getText().toLowerCase();// evrything to lower case
					area.append("You: " + userText + "\n");// user input is added to text area
					field.setText("");// reset input box

					// control the survey questions after user has asked to exit
					if (ex) {

						area.append("ChatBot: " + survey.SurveyQuestions.get(excount) + "\n");// ask survey question

						System.out.println(excount);
						System.out.println(survey.SurveyQuestions.size());
						if (excount != 0)
							survey.writer(survey.SurveyQuestions.get(excount - 1) + ": " + userText);// writes question
																										// and answer to
																										// file

						if (excount == (5))
							System.exit(10);// Closing the program once all questions are answered
						excount = excount + 1;
						return;
					}
					// find solution to user input
					String ans = sol.Findsol(userText);

					if (ans.equals("exit")) {// if the user enters exit variable ex is changed

						ex = true;
						area.append(
								"Chatbot: please complete our survey\nplease answer the following questions by entering a score from 1-10\n"
										+ "1-not at all. 10-totaly agree\npress RETURN to contiue\n");
					}

					else
						reply(ans + ".\nChatbot: What else can I help you with today?");

				}

			}

		}); // CLOSING BRACKET for the function that adds the Action Listener to the button

	}
	// SELECT-one-of-the-following method

	// The REPLY METHOD
	public void reply(String input) {
		area.append("Chatbot: " + input + "\n");
	}

}

package view;

import business.Logic;
import buttonClick.Listeners;
import constant.Constants;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Calculator {

    public Calculator() {

        JFrame frame = new JFrame();

        JLabel label1 = new JLabel(Constants.NUMBER_1);
        label1.setBounds(45, 50,100,40);

        JTextField textF1 = new JTextField();
        textF1.setBounds(150, 50, 190, 40);

        JLabel label2 = new JLabel(Constants.NUMBER_2);
        label2.setBounds(45, 110, 100, 40);

        JTextField textF2 = new JTextField();
        textF2.setBounds(150, 110, 190, 40);

        JLabel label3 = new JLabel (Constants.OPERATION);
        label3.setBounds(45, 170, 100, 40);

        JTextField textF3 = new JTextField();
        textF3.setBounds(150, 170, 190, 40);

        JButton button1 = new JButton(Constants.CALCULATE);
        button1.setBounds(45, 230, 295, 40);

        JLabel label4 = new JLabel(Constants.RESULT);
        label4.setBounds(45, 290, 100, 40);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(150, 290, 190, 100);
        textArea.setLineWrap(true);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);

        frame.add(textF1);
        frame.add(textF2);
        frame.add(textF3);
        frame.add(textArea);

        frame.add(button1);

        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);

        ActionListener listener = new Listeners(textF1, textF2, textF3, textArea, new Logic());

        button1.addActionListener(listener);

    }
}
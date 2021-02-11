package buttonClick;

import business.Logic;
import constant.Constants;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listeners implements ActionListener {

    private final JTextField textF1;
    private final JTextField textF2;
    private final JTextField textF3;
    private final JTextArea textArea;
    private final Logic calculation;

    public Listeners(JTextField textF1, JTextField textF2, JTextField textF3, JTextArea textArea, Logic calculation) {
        this.textF1 = textF1;
        this.textF2 = textF2;
        this.textF3 = textF3;
        this.textArea = textArea;
        this.calculation = calculation;
    }

    @Override
    public void actionPerformed(ActionEvent e) throws IllegalArgumentException {
        double num1 = Double.parseDouble(textF1.getText());
        double num2 = Double.parseDouble(textF2.getText());
        char num3 = textF3.getText().charAt(0);

        double answer = 0;

        try {
            if (num3 == '+') {
                answer = calculation.summing(num1, num2);
            } else if (num3 == '-') {
                answer = calculation.minus(num1, num2);
            } else if (num3 == '*') {
                answer = calculation.multiplication(num1, num2);
            } else if (num3 == '/') {
                answer = calculation.division(num1, num2);
            } else {
                textArea.setText(Constants.INCORRECT_NUMBER);
            }
        } catch (IllegalArgumentException ex) {
            textArea.setText(ex.getMessage());
            return;
        }
        String result = answer % 1 == 0 ? String.valueOf((int) answer) : String.valueOf(answer);
        textArea.setText(result);
    }
}

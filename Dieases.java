import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dieases extends JFrame {
    private JTextField fullNameTextField;
    private JTextField dateOfBirthTextField;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    private JCheckBox checkBox7;
    private JCheckBox checkBox8;
    private JCheckBox checkBox9;
    private JCheckBox checkBox10;
    private JCheckBox checkBox11;
    private JCheckBox checkBox12;
    private JCheckBox checkBox13;
    private JComboBox comboBox1;
    private JButton submitFormButton;
if (dateOfBirthTextField.getText().isEmpty()|| fullNameTextField.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "You cant leave the username and/or full name empty");
    }
public Dieases() {
    submitFormButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
}

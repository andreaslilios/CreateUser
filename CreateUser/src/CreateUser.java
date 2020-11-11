
import javax.swing.JOptionPane;

public class CreateUser {

    public static void main(String[] args) {

        String name, lastname, petname;
        String str1, str2, str3, output;
        str1 = JOptionPane.showInputDialog("Please enter your first name: ");
        name = str1;
        str2 = JOptionPane.showInputDialog("Please enter your last name: ");
        lastname = str2;
        str3 = JOptionPane.showInputDialog("Please enter your pets name:");
        petname = str3;

        User u1 = new User(name, lastname, petname);
        u1.username(str1, str2);
        JOptionPane.showMessageDialog(null, u1.username(str1, str2));
        String f_password=u1.password1(str1, str2, str3);
        JOptionPane.showMessageDialog(null, f_password);
        String sec_password=u1.password2(str1, str2);
        JOptionPane.showMessageDialog(null, sec_password);

    }
}

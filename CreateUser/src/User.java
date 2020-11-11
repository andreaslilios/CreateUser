
import java.util.Random;

public class User {

    String name;
    String lastname;
    String petname;

    public User(String n, String l, String p) {
        this.name = n;
        this.lastname = l;
        this.petname = p;
    }

    public String username(String n, String l) {

        StringBuilder sb1 = new StringBuilder(n);
        StringBuilder sb2 = new StringBuilder(l);
        StringBuilder sb = new StringBuilder(11);
        int count = 1 + sb2.length() + 1;
        String username;

        sb.append(sb1.charAt(0));
        sb = sb.append(sb2);
        sb.append("_");
        if (sb2.length() < 9) {
            for (int i = 0; i < (11 - count); i++) {
                sb.append((int) (Math.random() * 10));
            }
        } else {
            sb.append((int) (Math.random() * 10));
        }
        username = sb.toString();

        return username;
    }

    public String password1(String n, String l, String p) {

        StringBuilder sb1 = new StringBuilder(n);
        StringBuilder sb2 = new StringBuilder(l);
        StringBuilder sb3 = new StringBuilder(p);
        StringBuilder sb = new StringBuilder();

        Random random = new Random();
        int orio = 5 + random.nextInt(5);
        int orio2, index, k = 0;
        orio2 = random.nextInt(3);
        for (int i = 0; i < orio; i++) {
            if (orio2 == 0) {
                index = random.nextInt(sb1.length());
                sb.append(sb1.charAt(index));
                k = 1;
            } else if (orio2 == 1) {
                index = random.nextInt(sb2.length());
                sb.append(sb2.charAt(index));
                k = 2;
            } else {
                index = random.nextInt(sb3.length());
                sb.append(sb3.charAt(index));
                k = 3;
            }
            int w = 1;
            if (k == 1) {
                orio2 = 1 + random.nextInt(1);
            }
            if (k == 2) {
                while (w == 1) {
                    orio2 = random.nextInt(3);
                    if (orio2 != 1) {
                        w = 2;
                    }
                }
            }
            if (k == 3) {
                orio2 = random.nextInt(2);
            }
        }
        String pwd1;
        pwd1 = sb.toString();
        Character ch1 = Character.toUpperCase(pwd1.charAt(0));
        Character ch2 = Character.toUpperCase(pwd1.charAt(pwd1.length() - 1));

        sb.setCharAt(0, ch1);
        sb.setCharAt(sb.length() - 1, ch2);
        pwd1 = sb.toString();

        return pwd1;
    }

    public String password2(String n, String l) {
        String pwd2 = null;
        StringBuilder sb1 = new StringBuilder(n);
        StringBuilder sb2 = new StringBuilder(l);
        StringBuilder sb = new StringBuilder();
        sb.append(sb1.charAt(0));
        Random random = new Random();
        int char2 = random.nextInt(101);
        sb.insert(1, char2);
        sb.insert(2, sb2);
        for (int i = 2; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a') {
                sb.setCharAt(i, '@');
            } else if (sb.charAt(i) == 's') {
                sb.setCharAt(i, '$');
            } else if (sb.charAt(i) == 'i') {
                sb.setCharAt(i, '1');
            } else if (sb.charAt(i) == 'o') {
                sb.setCharAt(i, '0');
            }
        }
        pwd2=sb.toString();

        return pwd2;
    }

}

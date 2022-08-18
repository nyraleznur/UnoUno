import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String u, c;
        u = JOptionPane.showInputDialog("Digite su usuario");
        c = JOptionPane.showInputDialog("Digite su clave");
         Usuario us = new Usuario(u, c);
         JOptionPane.showMessageDialog(null,us.getUsuario());
    }



    }

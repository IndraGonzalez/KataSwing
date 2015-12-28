package kataSwing;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.PopupMenu;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Application extends JFrame {

    public static void main(String[] args) {
        new Application().setVisible(true);
    }
    
    public Application(){
        this.setTitle("Money Calculator");
        this.setMinimumSize(new Dimension(500,500));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(menuBar());
        this.setJMenuBar(menuBar());
        //Esconder componentes
       
    }

    private JMenuBar menuBar() {
        JMenuBar component = new JMenuBar();
        component.add(fileMenu());
        component.add(editMenu());
        component.add(helpMenu());
        return component;
    }

    private JMenu fileMenu() {
        JMenu component = new JMenu("File");
        component.add(newOperation());
        component.add(openOperation());
        component.add(exitOperation());
        return component;
    }

    private JMenu editMenu() {
        JMenu component = new JMenu("Edit");
        component.add(cutOperation());
        component.add(copyOperation());
        component.add(pasteOperation());
        return component;
        
    }

    private JMenu helpMenu() {
        JMenu component = new JMenu("Help");
        component.add(aboutOperation());
        return component;
    }

    private JMenuItem newOperation() {
        JMenuItem component = new JMenuItem("New...");
        return component;
    }

    private JMenuItem openOperation() {
        JMenuItem component = new JMenuItem("Open...");
        return component;    
    }

    private JMenuItem exitOperation() {
        JMenuItem component = new JMenuItem("Exit");
        return component;    
    }

    private JMenuItem cutOperation() {
        JMenuItem component = new JMenuItem("Cut");
        return component;    
    }

    private JMenuItem copyOperation() {
        JMenuItem component = new JMenuItem("Copy");
        return component;    
    }

    private JMenuItem pasteOperation() {
        JMenuItem component = new JMenuItem("Paste");
        return component;    
    }

    private JMenuItem aboutOperation() {
        JMenuItem component = new JMenuItem("About...");
        return component;    
    }
}

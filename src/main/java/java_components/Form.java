package java_components;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Form extends JFrame implements ItemListener{

        public ListaDestinos lista;

        //Panel
        JFrame formFrame = new JFrame("Form Frame");

        //Buttons
        JButton formRegButton = new JButton("Registrar");
        JButton formConsultButton = new JButton("Consultar");

        //Combo box
        JComboBox countryBox = new JComboBox();
    
        //Labels
        JLabel formCountryLabel = new JLabel("Pais");
        JLabel formCityLabel = new JLabel("Ciudad");
        JLabel formCountryCommentLabel = new JLabel("Relacion Pais");
        JLabel formNumberLabel = new JLabel("Numero:");
        JLabel formDaysLabel = new JLabel("Dias:");

        //List
        JList formCityList = new JList();

        //ScrollBar
        JScrollBar formDayScrollBar = new JScrollBar();
        JScrollBar formNumberScrollBar = new JScrollBar();

        //TextArea
        JTextArea formRelaTextArea = new JTextArea();
        JTextArea formTextArea = new JTextArea();
    
        public Form(){
            this.formCountryLabel.setBounds(20,20,80,20);
            this.countryBox.setBounds(20,50,150,20);
            this.formCityLabel.setBounds(20,80,80,20);
            this.formCityList.setBounds(20,110,150,80);
            this.formDayScrollBar.setBounds(300,20,20,100);
            this.formNumberScrollBar.setBounds(300,150,20,100);
            this.formCountryCommentLabel.setBounds(20,210,150,20);
            this.formRelaTextArea.setBounds(20, 240,150,100);
            this.formNumberLabel.setBounds(330,180,100,20);
            this.formDaysLabel.setBounds(330,50,100,20);
    
            this.formRegButton.setBounds(20,380,100,20);
            this.formConsultButton.setBounds(150,380,80,20);

            this.formTextArea.setBounds(20,410,200,200);

            //Combo box
            countryBox.addItem("Mexico");
            countryBox.addItem("Argentina");
    
            formFrame.add(formCountryLabel);
            formFrame.add(formCityLabel);
            formFrame.add(formCountryCommentLabel);
            formFrame.add(formDaysLabel);
            formFrame.add(formNumberLabel);
            formFrame.add(formRegButton);
            formFrame.add(formConsultButton);
            formFrame.add(countryBox);
            formFrame.add(formCityList);
            formFrame.add(formDayScrollBar);
            formFrame.add(formNumberScrollBar);
            formFrame.add(formRelaTextArea);
            formFrame.add(formTextArea);
    
            formFrame.setSize(450,650);
            formFrame.setLayout(null);
            formFrame.setLocationRelativeTo(null);
            formFrame.setVisible(true);

            lista = new ListaDestinos();

        }

        public void itemStateChanged(ItemEvent e){
            if(e.getSource()==this.formDayScrollBar){
                this.formDaysLabel.setText("Dias: " + String.valueOf(this.formDayScrollBar));
            }

            if(e.getSource()==this.formNumberScrollBar){
                this.formNumberLabel.setText("Dias: " + String.valueOf(this.formNumberScrollBar));
            }
        }
}

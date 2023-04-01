package java_components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.*;

public class App extends JFrame
{
    public static void main( String[] args )
    {
        final Form FormFrame = new Form();

        FormFrame.formRegButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String pais = FormFrame.countryBox.getSelectedItem().toString();
                String ciudad = FormFrame.formCityList.getSelectedValue ().toString();
                
                FormFrame.formRelaTextArea.setText(pais + "-" + ciudad + "\n");

                FormFrame.lista.agregar(String.valueOf(FormFrame.formNumberScrollBar.getValue()), FormFrame.countryBox.getSelectedItem().toString(),
                FormFrame.formCityList.getSelectedValue().toString(), String.valueOf(FormFrame.formDayScrollBar.getValue()));
            }
        });

        FormFrame.formConsultButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(FormFrame.lista.isEmpty()){
                    FormFrame.formTextArea.setText("Sin datos registrados");
                }

                else{
                    FormFrame.formTextArea.setText(FormFrame.lista.recorrerDestinos());
                }
            }
        });

        FormFrame.countryBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                DefaultListModel modelo = new DefaultListModel();

                FormFrame.formCityList.removeAll();

                switch(FormFrame.countryBox.getSelectedIndex()){
                    case 0:
                        modelo.addElement("Guadalajara");
                        modelo.addElement("Ciudad de Mexico");
                        break;
                    
                    case 1:
                        modelo.addElement("Buenos Aires");
                        modelo.addElement("Cordoba");
                        break;
                }
                FormFrame.formCityList.setModel(modelo);
            }
        });

        FormFrame.formNumberScrollBar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e){
                FormFrame.formNumberLabel.setText("Numero: " + String.valueOf(FormFrame.formNumberScrollBar.getValue()));
            }
        });

        FormFrame.formDayScrollBar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e){
                FormFrame.formDaysLabel.setText("Dias: " + String.valueOf(FormFrame.formDayScrollBar.getValue()));
            }
        });
    }
}

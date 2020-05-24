package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;


public class Controlador implements ActionListener {
    
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model){
        
        this.view = view;
        this.model = model;
        this.view.btnMultiplicar.addActionListener(this);
    }
    
    public void iniciar(){
        
        view.setTitle("MVC Multiplicar");
        view.setLocationRelativeTo(null); //hace que la ventana aparezca en el centro
    }
    
   
    public void actionPerformed(ActionEvent e){
        
        model.setNumeroUno(Integer.parseInt(view.txtNumero_uno.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNumero_dos.getText()));
        model.multiplicar();//no recibe parametros,ya que esta encapsulando gracias a los set ??
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }
  
}

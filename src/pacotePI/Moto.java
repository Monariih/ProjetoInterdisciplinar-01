package pacotePI;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Moto extends Veiculo{

    static String padrao = "###,###.##";
    static DecimalFormat df = new DecimalFormat(padrao);
       
    public Moto(){
    }    
    
   
    //Cadastro dos atributos
    public void cadastraVMoto(){        
        String marca = JOptionPane.showInputDialog("Consecionária Auto City\n\n" + "Qual a marca do veiculo ?");
        String modelo = JOptionPane.showInputDialog("Consecionária Auto City\n\n" + "Qual o modelo do veiculo ?");
        String cor = JOptionPane.showInputDialog("Consecionária Auto City\n\n" + "Qual a cor do veiculo ?");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Consecionária Auto City\n\n" + "Qual o ano do veiculo ?"));
        float preco = Float.parseFloat(JOptionPane.showInputDialog("Consecionária Auto City\n\n" + "Insira o valor de venda do veiculo"));
        int finalPlaca = Integer.parseInt(JOptionPane.showInputDialog("Consecionária Auto City\n\n" + "Insira o digito final da placa do veiculo"));

        setMarca(marca);
        setModelo(modelo);
        setCor(cor);
        setAno(ano);
        setPreco(preco);
        setFinalPlaca(finalPlaca);
    }
    

     @Override
    public String toString(){
        
        return "\n"+"Marca: "+ getMarca() + "\n" 
                +"Modelo: " +getModelo()+"\n"
                +"Ano: "+getAno()+"\n"
                +"Cor: "+getCor()+"\n"
                +"Preço: R$ "+ df.format(getPreco())+"\n"
                +"Digito final da placa: "+getFinalPlaca() + "\n\n";
    }
}
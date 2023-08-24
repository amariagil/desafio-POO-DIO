/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiodio2;

/**
 *
 * @author maria
 */
public class IPhone {

    
    private String modelo;
    private String numeroTelefone;
    private String sistemaOperacional;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
    
    
      public IPhone(String modelo, String numeroTelefone, String sistemaOperacional) {
        this.modelo = modelo;
        this.numeroTelefone = numeroTelefone;
        this.sistemaOperacional = sistemaOperacional;
    }
}

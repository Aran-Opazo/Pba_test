
package Modelo;

/**
 * @author Nibbinthoroniel
 * @version 13 nov 2024
 */

public class Garzon {
    
    String idGarzon,nomGarzon,appatGarzon,apmatGarzon;

    public Garzon() {
    }

    public Garzon(String idGarzon, String nomGarzon, String appatGarzon, String apmatGarzon) {
        this.idGarzon = idGarzon;
        this.nomGarzon = nomGarzon;
        this.appatGarzon = appatGarzon;
        this.apmatGarzon = apmatGarzon;
    }

    public String getIdGarzon() {
        return idGarzon;
    }

    public void setIdGarzon(String idGarzon) {
        this.idGarzon = idGarzon;
    }

    public String getNomGarzon() {
        return nomGarzon;
    }

    public void setNomGarzon(String nomGarzon) {
        this.nomGarzon = nomGarzon;
    }

    public String getAppatGarzon() {
        return appatGarzon;
    }

    public void setAppatGarzon(String appatGarzon) {
        this.appatGarzon = appatGarzon;
    }

    public String getApmatGarzon() {
        return apmatGarzon;
    }

    public void setApmatGarzon(String apmatGarzon) {
        this.apmatGarzon = apmatGarzon;
    }

    @Override
    public String toString() {
        return "Garzon{" + "idGarzon=" + idGarzon + ", nomGarzon=" + nomGarzon + ", appatGarzon=" + appatGarzon + ", apmatGarzon=" + apmatGarzon + '}';
    }
    
}

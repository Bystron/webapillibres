package cat.itb.projecte1.apillibres.model.entitats;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Usuari {
    @Id
    String idUsuari;
    String password;
    String rol;
    double sou;

    public String getidUsuari() {
        return idUsuari;
    }
}





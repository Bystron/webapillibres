package cat.itb.projecte1.apillibres.model.entitats;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Usuari {
    @Id
    private String idUsuari;
    private String password;
    private String rol;
    private double sou;
}





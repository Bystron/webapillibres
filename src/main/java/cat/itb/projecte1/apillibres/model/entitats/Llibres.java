package cat.itb.projecte1.apillibres.model.entitats;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Llibres {
    @Id
    private String idLlibre;
    private String autor;
    private String genere;
    private int any;
}





package cat.itb.projecte1.apillibres.controladors;

import cat.itb.projecte1.apillibres.model.entitats.Usuari;
import cat.itb.projecte1.apillibres.model.entitats.ServeiUsuaris;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ControladorResponseEntity {

private final ServeiUsuaris serveiUsuaris;

    public ControladorResponseEntity(ServeiUsuaris serveiUsuaris) {
        this.serveiUsuaris = serveiUsuaris;
    }

    //proves amb un altre endpoint per consultar usuari
    //si l'id d'usuari no existeix es retorna 404 Not Found

    @GetMapping("/user/{id}")
    public ResponseEntity<?> consultarUsuari(@PathVariable String id) {
        Usuari res = serveiUsuaris.consultarUsuari(id);
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }

    //proves amb un altre endpoint per crear un usuari
    //si es pot crear es retorna CREATED
    @PostMapping("/user")
    public ResponseEntity<?> crearUsusari(@RequestBody Usuari nou){
        Usuari res=serveiUsuaris.afegirUsuari(nou);
        return new ResponseEntity<Usuari>(res, HttpStatus.CREATED);
    }



}

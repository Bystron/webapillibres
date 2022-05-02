package cat.itb.projecte1.apillibres.model.repositoris;

import cat.itb.projecte1.apillibres.model.entitats.Usuari;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoriUsuaris extends JpaRepository<Usuari,String> {
    List<Usuari> findByRol(String r); //l'atribut rol ha d'existir a la classe Usuari
    long countByRol(String r);
    List<Usuari> findBySouLessThan(double sou);
}

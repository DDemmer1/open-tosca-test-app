package de.demmer.dennis.opentoscatestapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Ein Controller der über die GET Anfrage in der URL angesprochen wird.
 * Alle Ergebnisse werden automatisch im JSON Format zurückgegeben
 *
 * Bsp.: http://localhost:8080/id/5 gibt den User mit der ID "5" als JSON zurück
 *
 */
@RestController
public class MainController {


    /**
     * Diese Controller Methode wird aufgerufen wenn die root seite des servers aufgerufen wird (localhost:8080)
     * Sie gibt nur einen String zurück der paar Infos zu Nutzung der REST app gibt
     * @return
     */
    @GetMapping(value = "/")
    public String info() {
        return "/all - Alle user anzeigen <br>/id/x - User mit der ID x anzeigen";
    }

    /**
     * Gibt alle User automatisch als JSON zurück wenn die URL ".../all" entspricht
     * @return
     */
    @GetMapping(value = "/all")
    public List<User> getAllUsers() {
        return OpenToscaTestAppApplication.userList;
    }


    /**
     * Diese Controller Methode wird aufgerufen wenn die URL .../id/{userID} entspricht
     * Sie gibt dann einfach den User mit der entsprechenden ID zurück. Wenn kein User gefunden wurde wird nichts zurückgegeben.
     * @param id
     * @return
     */
    @GetMapping(value = "/id/{userID}")
    public User getUserByID(@PathVariable("userID") int id) {

        //Einfache Binary Search mit Java Collections nach der ID
        int index = Collections.binarySearch(OpenToscaTestAppApplication.userList, new User(id, null, null, null), Comparator.comparingInt(User::getId));

        //Wenn index positiv oder null wird der entsprechende User ausgegeben
        if (index >= 0) return OpenToscaTestAppApplication.userList.get(index);
        else return null;
    }
}

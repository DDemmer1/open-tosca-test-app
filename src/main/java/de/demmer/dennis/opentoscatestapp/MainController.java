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
 * Bsp.: http://localhost:8080/id/5 gibt den User mit der ID 5 im als JSON zurück
 *
 */
@RestController
public class MainController {


    @GetMapping(value = "/")
    public String info() {
        return "/all - Alle user anzeigen <br>/id/x - User mit der ID x anzeigen";
    }

    @GetMapping(value = "/all")
    public List<User> getAllUsers() {
        return OpenToscaTestAppApplication.userList;
    }


    @GetMapping(value = "/id/{userID}")
    public User getUserByID(@PathVariable("userID") int id) {

        List<User> users = OpenToscaTestAppApplication.userList;

        Comparator<User> idComparator = new Comparator<User>() {
            public int compare(User u1, User u2) {
                return u1.getId() - u2.getId();
            }
        };
        int index = Collections.binarySearch(users, new User(id, null, null, null), idComparator);

        if (index >= 0) return users.get(index);

        else return null;
    }
}

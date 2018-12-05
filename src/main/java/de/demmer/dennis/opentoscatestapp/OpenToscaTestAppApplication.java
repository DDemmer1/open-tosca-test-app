package de.demmer.dennis.opentoscatestapp;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class OpenToscaTestAppApplication {

    public static List<User> userList;

	public static void main(String[] args) {

	    //Anlegen der Userliste
		userList = new ArrayList<>();
		userList.add(new User(0,"Dennis","Demmer","DnDmr"));
		userList.add(new User(1,"Marian","Eilers","Ahcos"));
		userList.add(new User(2,"Max","Mustermann", "MMuster"));
		userList.add(new User(3,"John","Dow","JD"));
		userList.add(new User(4,"Fred","Bloggs","FredB"));
		userList.add(new User(5,"Mario","Rossi","Ros"));

        //Starten der SpringApp
		SpringApplication.run(OpenToscaTestAppApplication.class, args);
	}


//NUR ZUM PACKEN NÖTIG!
//@SpringBootApplication
//public class OpenToscaTestAppApplication extends SpringBootServletInitializer {
//
//    public static List<User> userList;
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return configureApplication(builder);
//    }
//
//    public static void main(String[] args) {
//
//        userList = new ArrayList<>();
//		userList.add(new User(0,"Dennis","Demmer","DnDmr"));
//		userList.add(new User(1,"Marian","Eilers","Ahcos"));
//		userList.add(new User(2,"Max","Mustermann", "MMuster"));
//		userList.add(new User(3,"John","Dow","JD"));
//		userList.add(new User(4,"Fred","Bloggs","FredB"));
//		userList.add(new User(5,"Mario","Rossi","Ros"));
//
//        configureApplication(new SpringApplicationBuilder()).run(args);
//    }
//
//    private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {
//        return builder.sources(OpenToscaTestAppApplication.class).bannerMode(Banner.Mode.LOG);
//    }
}

import model.Country;
import model.Player;
import model.PlayerPosition;
import model.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private ArrayList<Team> teams;
    private ArrayList<Player> group;
    private ArrayList<Country> countries;
    private static final int PLAYER_NUMBER = 2;

    public Controller(){
        teams = new ArrayList<>();
        countries = new ArrayList<>();
        group = new ArrayList<>();

        Country colombia = new Country();
        colombia.setId("COL");
        colombia.setName("Colombia");

        countries.add(colombia);

        Scanner scanner = new Scanner(System.in);

        for(int i = 0 ; i<PLAYER_NUMBER ; i++){
            Player player = new Player();
            player.setId(i);

            System.out.println("Escriba el nombre");
            String name = scanner.nextLine();
            player.setName(name);

            System.out.println("Escriba el apellido");
            String lastname = scanner.nextLine();
            player.setName(lastname);

            System.out.println("Digite el numero del pais");
            for(int j=0 ; j<countries.size() ; j++){
                System.out.println(j + " - " + countries.get(j).getName());
            }
            int countryIndex = scanner.nextInt();
            scanner.nextLine();
            player.setCountry(countries.get(countryIndex));

            System.out.println("Digite el numero de dorsal del jugador");
            int dorsal = scanner.nextInt();
            scanner.nextLine();
            player.setNumber(dorsal);

            System.out.println("Escoga la posicion del jugador");
            System.out.println("0 - Portero");
            System.out.println("1 - Defensa");
            System.out.println("2 - Mediocampista");
            System.out.println("3 - Deltantero");
            int positionNumber = scanner.nextInt();
            scanner.nextLine();
            switch (positionNumber){
                case 0:
                    player.setPosition(PlayerPosition.GOALKEEPER);
                    break;
                case 1:
                    player.setPosition(PlayerPosition.DEFENSE);
                    break;
                case 2:
                    player.setPosition(PlayerPosition.MIDFIELDER);
                    break;
                case 3:
                    player.setPosition(PlayerPosition.FORWARDER);
                    break;
            }

            group.add(player);

        }

        for(int i=0 ; i< group.size() ; i++){
            System.out.println(group.get(i).getName());
            System.out.println(group.get(i).getNumber());
        }


        /*
        group = new ArrayList<>();



        Player p1 = new Player();
        p1.setId(1);
        p1.setName("Camilo");
        p1.setLastname("Vargas");
        p1.setCountry(colombia);
        p1.setNumber(1);
        p1.setPosition(PlayerPosition.GOALKEEPER);

        Player p2 = new Player();
        p2.setId(2);
        p2.setName("James");
        p2.setLastname("Rodriguez");
        p2.setCountry(colombia);
        p2.setNumber(10);
        p2.setPosition(PlayerPosition.MIDFIELDER);

        Player p3 = new Player();
        p3.setId(3);
        p3.setName("Falcao");
        p3.setLastname("Garcia");
        p3.setCountry(colombia);
        p3.setNumber(9);
        p3.setPosition(PlayerPosition.FORWARDER);

        group.add(p1);
        group.add(p2);
        group.add(p3);
        System.out.println(group.size());



         */
    }


}

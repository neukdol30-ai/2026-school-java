package Sub11.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test06 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Location> locations = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            String name = sc.next();
            int lati = sc.nextInt();
            int longi = sc.nextInt();

            locations.add(new Location(name, lati, longi));
        }

        System.out.println(locations);

        HashMap<String, Location> locationMap = new HashMap<>();

        for (Location s : locations){
            locationMap.put(s.getName(), s);
        }

        while(true) {
            String name = sc.nextLine();
            if(name.equals("stop")) break;
            System.out.println(locationMap.get(name));
        }
    }
}

class Location {
    String name;
    int lati;
    int longi;

    public Location(String name, int lati, int longi) {
        this.name = name;
        this.lati = lati;
        this.longi = longi;
    }

    String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name +" "+ lati +" "+ longi + "\n";
    }
}

import java.util.ArrayList;
import java.util.List;

public class Park {
    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Attraction: " + name);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Cost: " + cost);
            System.out.println();
        }
    }

    private List<Attraction> attractions;

    public Park() {
        attractions = new ArrayList<>();
    }

    public void addAttraction(Attraction attraction) {
        if (attractions.size() >= 5) {
            System.out.println("Невозможно добавить новый аттракцион. В парке уже присутствует максимальное количество аттракционов.");
        } else {
            attractions.add(attraction);
        }
    }

    public void printAttractionsInfo() {
        for (Attraction attraction : attractions) {
            attraction.printInfo();
        }
    }

    public static void main(String[] args) {
        Park park = new Park();

        park.addAttraction(park.new Attraction("Roller Coaster", "10:00 - 18:00", 10.5));
        park.addAttraction(park.new Attraction("Ferris Wheel", "11:00 - 19:00", 8.5));
        park.addAttraction(park.new Attraction("Carousel", "09:00 - 17:00", 5.0));
        park.addAttraction(park.new Attraction("Bumper Cars", "12:00 - 20:00", 7.0));
        park.addAttraction(park.new Attraction("Haunted House", "18:00 - 24:00", 12.0));

        park.printAttractionsInfo();

        park.addAttraction(park.new Attraction("Water Slide", "10:00 - 18:00", 9.0));
    }
}
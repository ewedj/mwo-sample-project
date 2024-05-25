package pl.edu.agh.mwo;

import pl.edu.agh.mwo.model.PitStop;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<PitStop> pitStops = new ArrayList<>();
        pitStops.add(new PitStop(23, 30.0, 8));
        pitStops.add(new PitStop(14, 31.3, 7));
        pitStops.add(new PitStop(77, 30.2, 8));

        getAveragePitDuration(pitStops);
    }

    private static void getAveragePitDuration(List<PitStop> pitStops) {
        pitStops.stream()
                .mapToDouble(PitStop::getPitDuration)
                .average()
                .ifPresent(System.out::println);
    }
}

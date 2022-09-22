import dtos.Cinema;
import dtos.Viewer;
import services.ViewerStatistics;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            viewers.add(new Viewer()
                            .setName("Alex" + i)
                            .setAge(18 + i)
                            .setCinemas(
                                    List.of(new Cinema()
                                                    .setName("Name" + i)
                                                    .setGenre("Genre" + i)
                                                    .setMovieLength(10 + i)
                                    )
                            )
            );
        }
        ViewerStatistics viewerStatistics = new ViewerStatistics();
        System.out.println(viewerStatistics.averageAge(viewers));
    }
}

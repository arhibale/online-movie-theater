package services;

import dtos.Viewer;

import java.util.List;

public class ViewerStatistics {
    public int averageAge(List<Viewer> viewers) {
        int result = 0;
        for (Viewer viewer : viewers) {
            result += viewer.getAge();
        }
        return result / viewers.size();
    }
}

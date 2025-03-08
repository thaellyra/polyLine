import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PolyLine {
    private List<Point> points;

    public PolyLine() {
    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return String.format("Линия %s", points);
    }

    public List<Line> getLines() {
        if (points == null || points.size() <= 1) {
            return Collections.emptyList();
        }
        List<Line> lines = new ArrayList<>();
        for (int i = 1; i < points.size(); i++) {
            lines.add(new Line(points.get(i - 1), points.get(i)));
        }
        return lines;
    }


    public double getLength() {
        double sum = 0;
        for (Line tmpLine : this.getLines()) {
            sum += tmpLine.getLength();
        }

        return sum;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
import java.util.ArrayList;

public class PolyLine {
    public ArrayList<Point> points = new ArrayList<>();

    public PolyLine() {
    }

    public PolyLine(ArrayList<Point> points) {
        this.points.addAll(points);
    }

    @Override
    public String toString() {
        return String.format("Линия %s", points);
    }

    public ArrayList<Line> getLines() {
        ArrayList<Line> lines = new ArrayList<>();

        int firstIter = 0;
        Point lastPoint = points.getFirst();
        for (Point tmpPoint : points) {
            if (firstIter == 0) {
                firstIter++;
                continue;
            }

            lines.add(new Line(lastPoint, tmpPoint));
            lastPoint = tmpPoint;
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
}
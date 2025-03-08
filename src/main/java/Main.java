import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 5));
        points.add(new Point(2, 8));
        points.add(new Point(5, 3));
        points.add(new Point(8, 9));
        PolyLine polyLine = new PolyLine(points);

        double polyLineLength = polyLine.getLength();
        List<Line> polyLineLines = polyLine.getLines();

        double polyLineLinesLength = 0;
        for (Line tmpLine : polyLineLines) {
            polyLineLinesLength += tmpLine.getLength();
        }

        System.out.println("Результат сравнения длины ломаной линии и суммы длин ее линий: " + (polyLineLength == polyLineLinesLength));

        System.out.println("Ломаная линия до изменения точки {2,8} на {12,8}: " + polyLine);
        polyLine.getPoints().get(1).setX(12);
        System.out.println("Ломаная линия после изменения точки {2,8} на {12,8}: " + polyLine);
    }
}
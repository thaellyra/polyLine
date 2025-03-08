import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PolyLine polyLine = new PolyLine(new ArrayList<>() {{
            add(new Point(1, 5));
            add(new Point(2, 8));
            add(new Point(5, 3));
            add(new Point(8, 9));
        }});

        double polyLineLength = polyLine.getLength();
        ArrayList<Line> polyLineLines = polyLine.getLines();

        double polyLineLinesLength = 0;
        for (Line tmpLine : polyLineLines) {
            polyLineLinesLength += tmpLine.getLength();
        }

        System.out.println("Результат сравнения длины ломаной линии и суммы длин ее линий: " + (polyLineLength == polyLineLinesLength));

        System.out.println("Ломаная линия до изменения точки {2,8} на {12,8}: " + polyLine);
        polyLine.points.get(1).X = 12;
        //polyLine.points.set(1, new Point(12, 8));
        System.out.println("Ломаная линия после изменения точки {2,8} на {12,8}: " + polyLine);
    }
}
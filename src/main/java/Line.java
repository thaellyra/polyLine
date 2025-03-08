public class Line {
    public Point start;
    public Point finish;

    public Line(Point start, Point finish) {
        this.start = start;
        this.finish = finish;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.finish = new Point(x2, y2);
    }

    @Override
    public String toString() {
        return String.format("Линия от %s до %s ", start, finish);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(finish.X - start.X, 2) + Math.pow(finish.Y - start.Y, 2));
    }
}
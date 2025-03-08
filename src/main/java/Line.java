public class Line {
    private Point start;
    private Point finish;

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
        return Math.sqrt(Math.pow(finish.getX() - start.getX(), 2) + Math.pow(finish.getY() - start.getY(), 2));
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getFinish() {
        return finish;
    }

    public void setFinish(Point finish) {
        this.finish = finish;
    }
}
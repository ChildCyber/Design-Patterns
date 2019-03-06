/**
 * ConcreteImplementor 2/2
 */
class PenDrawingAPI implements DrawingAPI {
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("PenDrawingAPI.circle at %f:%f radius %f\n", x, y, radius);
    }
}
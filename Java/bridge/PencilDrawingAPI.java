/**
 * ConcreteImplementor 1/2
 */
class PencilDrawingAPI implements DrawingAPI {
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("PencilDrawingAPI.circle at %f:%f radius %f\n", x, y, radius);
    }
}
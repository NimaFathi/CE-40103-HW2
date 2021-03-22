public class Square extends Foursquare{
    private float edge;
    public Square(float edge) {
        super(edge, edge);
        this.edge = edge;
    }

    @Override
    public float computeArea() {
        return this.edge * this.edge;

    }

    public float getEdge() {
        return this.edge;
    }
}

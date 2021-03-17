public abstract class Foursquare {
    private float width;
    private float height;
    public Foursquare(float width, float height){
        this.height = height;
        this.width = width;
    }
    public abstract float computeArea();
}

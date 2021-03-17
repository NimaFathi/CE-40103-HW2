public class Rectangle extends Foursquare {
    private float height;
    private float width;

    public Rectangle(float width, float height) {
        super(width, height);
        this.width = width;
        this.height = height;
    }

    public float computeArea() {
        return this.width * this.height;
    }

    public float getHeight() {
        return this.height;
    }

    public float getWidth() {
        return this.width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}

public record Circle(double radius) extends GeometricObject
        implements Comparable<Circle> {
    public Circle() {
        this(1.0);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle other) {
            return this.radius == other.radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}

public class Circle extends GeometricObject implements Comparable<Circle>
{
    private double radius;

    public Circle() {}

    public Circle(double radius)
        {
            this.radius = radius;
        }

    public double getRadius()
        {
            return radius;
        }

    public void setRadius(double radius)
        {
            this.radius = radius;
        }

    @Override
    public double getArea()
        {
            return radius * radius * Math.PI;
        }

    public double getDiameter()
        {
            return 2 * radius;
        }

    @Override 
    public double getPerimeter()
        {
            return 2 * radius * Math.PI;
        }

    @Override
    public int compareTo(Circle o)
        {
            if (this.radius > o.radius)
                return 1;
            else if (this.radius < o.radius)
                return -1;
            else
                return 0;
        }

    @Override
    public boolean equals(Object o)
        {
            /* Downcasting */
            /*Circle myCircle = (Circle)o;
            return this.compareTo(myCircle) == 0;*/
            
            /* Or Simply */
            return this.compareTo((Circle)o) == 0;
        }

    public void printCircle()
        {
            System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
        }
}
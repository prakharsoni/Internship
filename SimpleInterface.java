interface Area
{
    void getArea(int len, int bre);
}
class Rectangle implements Area
{
    public void getArea(int len, int bre)
    {
            System.out.println("The Area of the rectangle is : "+(len*bre));
    }
}
class SimpleInterface
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        r1.getArea(4, 5);
    }
}
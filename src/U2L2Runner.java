public class U2L2Runner {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(150,125);
        Rectangle square = new Rectangle(125);
        Rectangle g = new Rectangle();
        //rectangles for code
        System.out.println(r.calculatePerimeter());
        System.out.println(square.calculatePerimeter());
        System.out.println(g.calculatePerimeter());
        //print statements for rectangle perimeter
        System.out.println(r.calculateArea());
        System.out.println(square.calculateArea());
        System.out.println(g.calculateArea());
        //print statements for rectangle areas
        System.out.println("Area "+r.calculateArea()+" Perimeter = "+(2*(r.getLength()+r.getWidth())));
        System.out.println("Area "+square.calculateArea()+" Perimeter = "+(2*(square.getLength()+square.getWidth())));
        System.out.println("Area "+g.calculateArea()+" Perimeter = "+(2*(g.getLength()+g.getWidth())));
        //print statements for area + perimeter

    }
}

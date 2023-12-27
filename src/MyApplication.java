import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        //Link to source file
        File file = new File("C:\\Users\\bipap\\IdeaProjects\\ass1\\src\\source.txt");

        Scanner scanner = new Scanner(file);

        //Shape for points
        Shape shape = new Shape();

        //Variables for the first and previous points
        Point firstPoint = null;
        Point previousPoint = null;

        //Reading points from the file
        while (scanner.hasNext()) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            //Creating a Point with the coordinates
            Point point = new Point(x, y);

            //Adding the point to the Shape
            shape.addPoint(point);

            //Updating the previous point to the current point
            previousPoint = point;
        }



        //Final output
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getAverageSide());
        System.out.println(shape.getLongestSide());
    }
}

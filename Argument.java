package forexam;

public class Argument {
    public static void main(String[] args) {

                // Check if two command line arguments are provided
                if (args.length != 2) {
                    System.out.println("Please provide two command line arguments: radius height");
                    return;
                }

                // Parse command line arguments
                double radius = Double.parseDouble(args[0]);
                double height = Double.parseDouble(args[1]);

                // Calculate surface area
                double surfaceArea = Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height;

                // Display the result
                System.out.println("Radius: " + radius);
                System.out.println("Height: " + height);
                System.out.println("Surface Area of the Cylinder: " + surfaceArea);
            }
        }




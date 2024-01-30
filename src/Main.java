import java.util.Scanner;

public class Main {

    private static int frameStickMeters = 6;
    private static float quantityFramesMeters;
    private static int quantityFrameSticks;
    private static float wainscotingWidth;
    private static float area;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float width, height;

        //float quantityFrameSticks;


        System.out.println("Enter the width of your gate in meters: ");
        width = in.nextFloat();
        System.out.println("Enter the height of your gate in meters: ");
        height = in.nextFloat();
        System.out.println("Enter the wainscoting width in meters: ");
        wainscotingWidth = in.nextFloat();



        area = width * height;
        System.out.println("Your gate have " + area + "m².");

        //The amount material refers to a perimeter
        //The values of width and height are multiples by 2, because in a frame there are 4 sides.
        //In this case multiply the width and height by 2, because are 2 values of widths more 2 values of heights form 4 sides.
        quantityFramesMeters = (2 * width) + (2 * height);
        System.out.println("The frame's quantity in meters is " + quantityFramesMeters + "m.");

        //Caution the result of quantityFrameSticks needs to be int.
        quantityFrameSticks = (int) (quantityFramesMeters / frameStickMeters);
        //System.out.println("Quantity of frames to manufacture the gate structure: " + quantityFrameSticks + "und");
        if (quantityFramesMeters % 1 == 0 && quantityFramesMeters % frameStickMeters == 0) {
            System.out.println("Quantity of frames to manufacture the gate structure: " + quantityFrameSticks + "unt");

        } else {
                quantityFrameSticks = (int) Math.ceil(quantityFrameSticks);
                quantityFrameSticks = quantityFrameSticks + 1;
                System.out.println("Quantity of frames to purchase will be greater than the quantity needed to manufacture the gate structure: " + quantityFrameSticks + "unt");
        }
        aluminiumPaneling();

    }

    public static void aluminiumPaneling() {
        float quantityWainscotingMeters;
        int quantityWainscotingUnits;

        quantityWainscotingMeters = area / wainscotingWidth;
        System.out.println("The wainscoting quantity in meters is: " + quantityWainscotingMeters + "m.");

        quantityWainscotingUnits = (int) Math.ceil(quantityWainscotingMeters / frameStickMeters);
        if (quantityWainscotingUnits == 1) {
            System.out.println("The wainscoting quantity units is: " + quantityWainscotingUnits + "unt.");
        } else {
            System.out.println("The wainscoting quantity units is: " + quantityWainscotingUnits + "unts.");
        }

    }

}
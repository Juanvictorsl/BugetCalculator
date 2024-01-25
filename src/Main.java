import java.util.Scanner;

public class Main {

    private static float quantityFramesMeters;
    private static int quantityFrameSticks;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float width, height, area;

        //float quantityFrameSticks;
        int frameStickMeters = 6;

        System.out.println("Enter the width of your gate in meters: ");
        width = in.nextFloat();
        System.out.println("Enter the height of your gate in meters: ");
        height = in.nextFloat();

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
        if (quantityFrameSticks % 1 == 0 && quantityFrameSticks % frameStickMeters == 0) {
            System.out.println("Quantity of frames to manufacture the gate structure: " + quantityFrameSticks + "unt");

        } else {
                quantityFrameSticks = (int) Math.ceil(quantityFrameSticks);
                quantityFrameSticks = quantityFrameSticks + 1;
                System.out.println("Quantity of frames to purchase will be greater than the quantity needed to manufacture the gate structure: " + quantityFrameSticks + "un");
        }

        //askForMoreMeters(quantityFramesMeters);
        //askForMoreFrames(quantityFrameSticks);

    }


    //Method askForMoreMeters, the objective this method is to add an additional 5% to the number of meters
    //needed to manufacture the gate frame
    /*public static void askForMoreMeters(float quantityFramesMeters) {
       // float moreMeters;
        // totalSticksMeters = (float) (quantityFrameMeters + (quantityFrameMeters * 0.10));
        float totalSticksMeters = (float) (Main.quantityFramesMeters + (Main.quantityFramesMeters * 0.10));
        System.out.println("The total meters quantity of frames to ask for more is: " + totalSticksMeters + "m");

    }

    public static void askForMoreFrames(float quantityFrameSticks) {
        // float moreMeters;
        // totalSticksMeters = (float) (quantityFrameMeters + (quantityFrameMeters * 0.10));
        float totalSticks = (float) (Main.quantityFrameSticks + (Main.quantityFrameSticks * 0.10));
        System.out.println("The total quantity of frames to ask for more is: " + totalSticks);

    } */
}
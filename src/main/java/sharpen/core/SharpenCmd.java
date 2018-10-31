package sharpen.core;

/**
 * Main entry point
 */
public class SharpenCmd {

    public static void main(String[] args) {
        try {
            SharpenApplication AppCmd = new SharpenApplication();
            AppCmd.start(args);
        } catch (Exception ex) {
            System.out.println("Failed to run. Exception:" + ex.getMessage());
            System.exit(1);
        }
    }

}

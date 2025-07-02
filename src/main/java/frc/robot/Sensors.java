package frc.robot;

/**
 * Singleton class to statically manage all sensors on the robot.
 *
 * <p>Usage: Sensors.get[Sensor]();
 */
public class Sensors {
    // Singleton instance
    private static Sensors instance;

    public static Sensors getInstance() {
        if (instance == null) {
            instance = new Sensors();
        }
        return instance;
    }

    // Add sensor fields here, e.g.:
    // private final Gyro gyro;

    private Sensors() {
        // Initialize sensors here
        // e.g. gyro = new Gyro();
    }

    // Add methods to access sensors, e.g.:
    // public static Gyro getGyro() {
    //     return this.getInstance().gyro;
    // }
}

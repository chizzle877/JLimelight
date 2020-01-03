package net.bancino.robotics.jlimelight;

/**
 * A class that extends the regular Limelight to provide advanced features that
 * regular users will not normally need, but are provided for completeness of
 * this API.
 * 
 * @author Jordan Bancino
 * @version 1.0.1
 * @since 1.0.1
 */
public class AdvancedLimelight extends Limelight {
    /**
     * Construct an advanced Limelight object.
     * @param limelightTableName The name of the table to use for this Limelight.
     */
    public AdvancedLimelight(String limelightTableName) {
        super(limelightTableName);
    }

    /**
     * An override of the protected function to allow end users to
     * manually get data from the Limelight table.
     * 
     * @param variableName The variable name to fetch.
     */
    @Override
    public double getDouble(String variableName) {
        return super.getDouble(variableName);
    }

    /**
     * An override of the protected function to allow end users to
     * manually set data in the Limelight table.
     * 
     * @param variableName The variable to set.
     * @param value The value to set the variable to.
     */
    @Override
    public void setNumber(String variableName, Number value) {
        super.setNumber(variableName, value);
    }

    /**
     * Raw Screenspace X
     * @param i
     * @return
     */
    public double getRawScreenspaceX(int i) {
        return getDouble("tx" + Integer.toString(i));
    }

    /**
     * Raw Screenspace Y
     * @param i
     * @return
     */
    public double getRawScreenspaceY(int i) {
        return getDouble("ty" + Integer.toString(i));
    }

    public double getRawArea(int i) {
        return getDouble("ta" + Integer.toString(i));
    }

    public double getRawSkew(int i) {
        return getDouble("ts" + Integer.toString(i));
    }
}
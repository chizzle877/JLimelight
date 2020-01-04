package net.bancino.robotics.jlimelight;

/**
 * A class that extends the regular Limelight to provide advanced features that
 * regular users will not normally need, but are provided for completeness of
 * this API. <br>
 * <b>Raw Targets:</b>
 * 
 * Limelight posts three raw contours to NetworkTables that are not influenced
 * by your grouping mode. That is, they are filtered with your pipeline
 * parameters, but never grouped. X and Y are returned in normalized screen
 * space (-1 to 1) rather than degrees.
 * 
 * <br>
 * <br>
 * <b>Raw Crosshairs:</b> If you are using raw targeting data, you can still
 * utilize your calibrated crosshairs.
 * 
 * @author Jordan Bancino
 * @version 1.0.1
 * @since 1.0.1
 */
public class AdvancedLimelight extends Limelight {

    public static final int RAW_CONTOUR_MIN = 0;
    public static final int RAW_COUNTOUR_MAX = 2;
    public static final int RAW_CROSSHAIR_MIN = 0;
    public static final int RAW_CROSSHAIR_MAX = 1;

    /**
     * Construct an advanced Limelight object.
     * 
     * @param limelightTableName The name of the table to use for this Limelight.
     */
    public AdvancedLimelight(String limelightTableName) {
        super(limelightTableName);
    }

    /**
     * An override of the protected function to allow end users to manually get data
     * from the Limelight table.
     * 
     * @param variableName The variable name to fetch.
     */
    @Override
    public double getDouble(String variableName) {
        return super.getDouble(variableName);
    }

    /**
     * An override of the protected function to allow end users to manually set data
     * in the Limelight table.
     * 
     * @param variableName The variable to set.
     * @param value        The value to set the variable to.
     */
    @Override
    public void setNumber(String variableName, Number value) {
        super.setNumber(variableName, value);
    }

    /**
     * Get a raw countour value.
     * 
     * @param key   The key to fetch.
     * @param index The index of the countour to retrieve. It must be within bounds
     *              of RAW_COUNTOUR_MIN and RAW_CONTOUR_MAX.
     * @throws IllegalArgumentException If the index is out of bounds.
     * @return The value of concatenating the key and the index, provided it is in
     *         bounds.
     */
    protected double getRawContour(String key, int index) {
        if (index >= RAW_CONTOUR_MIN && index <= RAW_COUNTOUR_MAX) {
            return getDouble(key + Integer.toString(index));
        } else {
            throw new IllegalArgumentException("Index out of bounds: " + index);
        }
    }

    /**
     * Raw Screenspace X
     * 
     * @param i The index of the countour to retrieve. It must be within bounds of
     *          RAW_COUNTOUR_MIN and RAW_CONTOUR_MAX.
     * @throws IllegalArgumentException If the index is out of bounds.
     * @return The value of concatenating the raw X screenspace.
     */
    public double getRawScreenspaceX(int i) {
        return getRawContour("tx", i);
    }

    /**
     * Raw Screenspace Y
     * 
     * @param i The index of the countour to retrieve. It must be within bounds of
     *          RAW_COUNTOUR_MIN and RAW_CONTOUR_MAX.
     * @throws IllegalArgumentException If the index is out of bounds.
     * @return The value of concatenating the raw Y screenspace.
     */
    public double getRawScreenspaceY(int i) {
        return getRawContour("ty", i);
    }

    /**
     * Raw Area
     * 
     * @param i The index of the countour to retrieve. It must be within bounds of
     *          RAW_COUNTOUR_MIN and RAW_CONTOUR_MAX.
     * @throws IllegalArgumentException If the index is out of bounds.
     * @return The value of concatenating the area (0% to 100% of image)
     * 
     */
    public double getRawArea(int i) {
        return getRawContour("ta", i);
    }

    /**
     * Raw Skew
     * 
     * @param i The index of the countour to retrieve. It must be within bounds of
     *          RAW_COUNTOUR_MIN and RAW_CONTOUR_MAX.
     * @throws IllegalArgumentException If the index is out of bounds.
     * @return The value of concatenating the skew or rotation (-90 degrees to 0
     *         degrees)
     */
    public double getRawSkew(int i) {
        return getRawContour("ts", i);
    }

    /**
     * Get a raw crosshair value.
     * 
     * @param key   The key to fetch.
     * @param index The index of the countour to retrieve. It must be within bounds
     *              of RAW_CROSSHAIR_MIN and RAW_CROSSHAIR_MAX.
     * @throws IllegalArgumentException If the index is out of bounds.
     * @return The value of concatenating the key and the index, provided it is in
     *         bounds.
     */
    protected double getRawCrosshair(String key, int index) {
        if (index >= RAW_CROSSHAIR_MIN && index <= RAW_CROSSHAIR_MAX) {
            return getDouble(key + Integer.toString(index));
        } else {
            throw new IllegalArgumentException("Index out of bounds: " + index);
        }
    }

    /**
     * Raw Crosshair X in normalized screen space.
     * 
     * @param i The index of the countour to retrieve. It must be within bounds of
     *          RAW_CROSSHAIR_MIN and RAW_ROSSHAIR_MAX.
     * @throws IllegalArgumentException If the index is out of bounds.
     * @return Raw Crosshair Y in normalized screen space.
     */
    public double getRawCrosshairX(int i) {
        return getRawCrosshair("cx", i);
    }

    /**
     * Raw Crosshair Y in normalized screen space.
     * 
     * @param i The index of the countour to retrieve. It must be within bounds of
     *          RAW_CROSSHAIR_MIN and RAW_ROSSHAIR_MAX.
     * @throws IllegalArgumentException If the index is out of bounds.
     * @return Raw Crosshair Y in normalized screen space.
     */
    public double getRawCrosshairY(int i) {
        return getRawCrosshair("cy", i);
    }
}
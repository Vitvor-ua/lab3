package lab3;
import java.awt.Color;

/**
 * Interface representing an image with methods to manipulate pixel colors.
 */
public interface Image {
    /**
     * Retrieves the color of the pixel at the specified coordinates (x, y).
     *
     * @param x the x-coordinate of the pixel
     * @param y the y-coordinate of the pixel
     * @return the color of the pixel at the specified coordinates
     * @throws IndexOutOfBoundsException if the coordinates are out of bounds
     */
    Color getPixelColor(int x, int y);
}
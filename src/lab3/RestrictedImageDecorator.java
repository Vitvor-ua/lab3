package lab3;
import java.awt.Color;

/**
 * Decorator class that restricts access to an image by limiting which pixel coordinates are accessible.
 */
public class RestrictedImageDecorator implements Image {
    private Image realImage;
    private int x1, x2, y1, y2;

    /**
     * Constructs a RestrictedImageDecorator with a specified real image and bounds.
     *
     * @param realImage the image being decorated and restricted
     * @param x1 the minimum x-coordinate (exclusive)
     * @param x2 the maximum x-coordinate (exclusive)
     * @param y1 the minimum y-coordinate (exclusive)
     * @param y2 the maximum y-coordinate (exclusive)
     */
    public RestrictedImageDecorator(Image realImage, int x1, int x2, int y1, int y2) {
        this.realImage = realImage;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    /**
     * Retrieves the color of the pixel at the specified coordinates if they are within the allowed bounds.
     *
     * @param x the x-coordinate of the pixel
     * @param y the y-coordinate of the pixel
     * @return the color of the pixel if access is permitted
     * @throws IllegalArgumentException if the coordinates are outside the permitted region
     */
    @Override
    public Color getPixelColor(int x, int y) {
        if (x > x1 && x < x2 && y > y1 && y < y2) {
            return realImage.getPixelColor(x, y);
        } else {
            throw new IllegalArgumentException("Access denied: coordinates are outside the permitted region.");
        }
    }
}

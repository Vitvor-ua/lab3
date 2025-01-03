package lab3;
import java.awt.Color;

/**
 * Class representing a real image, containing pixel data and allowing manipulation of pixel colors.
 */
public class RealImage implements Image {
    private int width;
    private int height;
    private Color[][] pixels;

    /**
     * Constructs a RealImage with the specified width and height.
     * Initializes the pixel array.
     *
     * @param width the width of the image
     * @param height the height of the image
     */
    public RealImage(int width, int height) {
        this.width = width;
        this.height = height;
        this.pixels = new Color[width][height];
        // Initialization of pixels can be done here
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Color getPixelColor(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            return pixels[x][y];
        } else {
            throw new IndexOutOfBoundsException("Coordinates are out of image bounds.");
        }
    }
}


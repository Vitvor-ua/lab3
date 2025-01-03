import lab3.*;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Image realImage = new RealImage(100, 100);
        Image restrictedImage = new RestrictedImageDecorator(realImage, 10, 50, 10, 50);

        try {
            Color color = restrictedImage.getPixelColor(12, 22);
            System.out.println("Pixel color: " + color);
            Color forbiddenColor = restrictedImage.getPixelColor(2, 3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


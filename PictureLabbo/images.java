import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; 

/**
 * Write a description of class images here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class images extends SimplePicture
{
    /**
     * Constructor that takes no arguments
     */
    public images()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor
         */
        super();
    }

    /**
     * Constructor that takes a file name and creates the picture
     * @param fileName the name of the file to create the picture from
     */
    public images(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param width the width of the desired picture
     * @param height the height of the desired picture
     */
    public images(int width, int height)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a
     * copy of that picture
     */
    public images(images copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public images(BufferedImage image)
    {
        super(image);
    }

    public void grayscale()
    {
        int Avg;
        Pixel sourcePicture[];
        sourcePicture = this.getPixels();
        for (Pixel pixelObj : sourcePicture)
        {
            Avg = (pixelObj.getGreen() + pixelObj.getBlue() + pixelObj.getRed())/3;

            pixelObj.setRed(Avg);
            pixelObj.setBlue(Avg);
            pixelObj.setGreen(Avg);
        }
    }
    public void flipVerticalt()
    {
        int width = this.getWidth();
        int mirrorPoint = width/2;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        for(int y=0; y < getHeight(); y++)
        {
            for (int x= 0; x<mirrorPoint; x++)
            {
                leftPixel = getPixel(x,y);
                rightPixel = getPixel(width-1-x,y);
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }
    public void flipVerticalOtherWay()
    {
        int width = this.getWidth();
        int mirrorPoint = width/2;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        for(int y=0; y < getHeight(); y++)
        {
            for (int x= 0; x<width; x++)
            {
                rightPixel = getPixel(x,y);
                leftPixel = getPixel(width-1-x,y);
                leftPixel.setColor(rightPixel.getColor());
            }
        }
    }
}

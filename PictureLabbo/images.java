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
            for (int x= mirrorPoint; x<width; x++)
            {
                rightPixel = getPixel(x,y);
                leftPixel = getPixel(width-x,y);
                leftPixel.setColor(rightPixel.getColor());
            }
        }
    }

    public void colorSwap()
    {
        Pixel sourcePicture[];
        sourcePicture = this.getPixels();
        int val,Green,Red,Blue;
        for (Pixel pixelObj : sourcePicture)
        {
            Green = pixelObj.getGreen();
            Red = pixelObj.getRed();
            Blue =  pixelObj.getBlue();

            val = Green;
            Green = Red;
            Red = Blue;
            Blue = val;

            pixelObj.setGreen(Green);
            pixelObj.setRed(Red);
            pixelObj.setBlue(Blue);

        }
    }

    public void AmericanTown()
    {
        images America2 = (new images("images\\America2.jpg"));
        //images my_guy = (new images("images\\guyfieri.jpg"));

        Pixel sourcePixel = null;
        //int sourceColor = 0;
        Pixel targetPixel = null;
        //int targetColor= 0;
        //int paintBucket = 0;

        for(int sourceX = 0, targetX=0;
        sourceX < America2.getWidth();
        sourceX = sourceX+2, targetX = targetX+2)
        {
            for (int sourceY = 0, targetY=0;
            sourceY < America2.getHeight();
            sourceY = sourceY+2, targetY = targetY+2)
            {
                sourcePixel = America2.getPixel(sourceX,sourceY);
                targetPixel= this.getPixel(targetX,targetY);
                targetPixel.setColor(sourcePixel.getColor());
                /*
                //mix red
                sourceColor = sourcePixel.getRed();
                targetColor = targetPixel.getRed();
                paintBucket = (sourceColor + targetColor)/2;
                targetPixel.setRed(paintBucket);
                //mix blue
                sourceColor = sourcePixel.getBlue();
                targetColor = targetPixel.getBlue();
                paintBucket = (sourceColor + targetColor)/2;
                targetPixel.setRed(paintBucket);
                //mix green
                sourceColor = sourcePixel.getGreen();
                targetColor = targetPixel.getGreen);
                paintBucket = (sourceColor + targetColor)/2;
                targetPixel.setRed(paintBucket);
                /**/

            }
        }
    }

    public void infiniteGuy(int times)
    {
       images pic =(new images(this));
       Pixel sourcePixel = null;
       Pixel targetPixel = null;
        
        for(int sourceX = 0, targetX=0;
        sourceX < this.getWidth();
        sourceX = sourceX + times, targetX++)
        {
            for (int sourceY = 0, targetY=0;
            sourceY < pic.getHeight();
            sourceY = sourceY + times, targetY++)
            {
                sourcePixel = pic.getPixel(sourceX,sourceY);
                targetPixel = this.getPixel(targetX,targetY);
                targetPixel.setColor(sourcePixel.getColor());
            }
        }
        
      if (times == 128)
      {
          return;
        }
      else
      {
          infiniteGuy(times*2);
        }
    }
    public void copyGuy(int xOff, int yOff, images Source)
    {
        images sourceFile = new images(Source);
        images sourcePicture = new images(this);

        Pixel sourcePixel = null;
        Pixel targetPixel = null;

        //loop throught the colomns
        for (int sourceX = 0, targetX=xOff;
        sourceX < sourceFile.getWidth();
        sourceX++, targetX++)
        {
            //loop through the rows
            for(int sourceY = 0, targetY=yOff;
            sourceY < sourceFile.getHeight();
            sourceY++, targetY++)
            {
                //set the target pixel color to the spurce pixel color
                sourcePixel = sourceFile.getPixel(sourceX,sourceY);
                targetPixel = this.getPixel(targetX,targetY);
                targetPixel.setColor(sourcePixel.getColor());
            }//row loop
        }//col loop
    }//end of copy kait
}

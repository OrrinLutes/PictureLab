import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args)
    {
        images my_guy = new images("images\\guyfieri.jpg");
        //methods and creation of pictures
        //my_guy.explore();
        //my_guy.grayscale();
        //my_guy.write("images\\blandville.jpg");
        //my_guy.flipVerticalt();
        //my_guy.explore();
        //my_guy.write("images\\FlavorTownGoneWrong.jpg");
        //my_guy.flipVerticalOtherWay();
        //my_guy.colorSwap();
        //my_guy.write("images\\Guy_Hulk.jpg");
        //my_guy.AmericanTown();
        //my_guy.write("images\\my_america.jpg");
        //my_guy.infiniteGuy(2);
        //my_guy.explore();
        //my_guy.write("images\\FlavorFlavorFlavorFlavorFlavor.jpg");
        
        //open images to create collage
        images Bland = new images("images\\blandville.jpg");
        images Wrong = new images("images\\FlavorTownGoneWrong.jpg");
        images Hulk = new images("images\\Guy_Hulk.jpg");
        images America = new images("images\\my_america.jpg");
        images Flavor = new images("images\\FlavorFlavorFlavorFlavorFlavor.jpg");
        images Canvas = new images("images\\Guy_Canvas.png");
        Canvas.copyGuy(0,0,my_guy);
        Canvas.copyGuy(580,0,Bland);
        Canvas.copyGuy(1160,0,Wrong);
        Canvas.copyGuy(0,357,Hulk);
        Canvas.copyGuy(580,357,Flavor);
        Canvas.copyGuy(1160,357,America);
        Canvas.write("images\\collage.jpg");
        Canvas.explore();
        
        
    }
}

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
        //my_guy.explore();
        //my_guy.grayscale();
        //my_guy.write("images\\blandville.jpg");
        //my_guy.flipVerticalt();
        //my_guy.write("images\\FlavorTownGoneWrong.jpg");
        my_guy.flipVerticalOtherWay();
        my_guy.explore();
    }
}

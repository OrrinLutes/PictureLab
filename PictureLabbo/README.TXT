

PROJECT TITLE:Picture Labbo
PURPOSE OF PROJECT: to make pictures funny

Orrin Lutes

Greyscale
All i did was improve my old greyscale class, it takes all of the RGB int Values
adds them all together, divides them by 3, sets them to Avg and sets Red, Blue, 
and Green to Avg


flipVerticalt
it gets the width of the image and divides it by two to get a midpoint.
then it goes through the left side of the image, gets a pixel, and sets it to
the right side of the image, simulating reflection across the midpoint.

colorSwap
I wrote this awhile ago and updated it to be clearer. Red, Green, and Blue are
the int values of the RGB, and val is a placeholder value to save green. then it
changes green with red, red with blue, and blue with green. then sets them to
eachother.

AmericanTown
the for loop goes through every other pixel, and changes it to the RGB color of
the american flag. orginally i blended both on every pixel, but since the picture
is mostly white, it looked weird, so i just did every other pixel.

infiniteGuy
this takes the width of the picture and it makes the canavs the orgional picture
each time it is called, but changes the source X each time by taking the user
input and multplying it by 2 each time it is called.

copyGuy
this was used to create the collage. it takes a user X and Y input and makes it
off by that much on a large canvas and then puts it on their, making pictures
on a canvas.


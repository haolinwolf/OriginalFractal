import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {


  public void setup() 
{   
	size(400,400);    
	noLoop(); 
} 
public void draw() 
{   
  background(0);
  noFill();
  stroke(PApplet.parseInt(random(0,250)));
  ellipse(200,200,350,350);
  drawFractal(200,200,345, 345);  
} 
public void drawFractal(int x, int y, int rad, int hei) 
{   
  if( x == 0) 
  {
     
     ellipse(2,y,2,2);
  }
  else 
  {
     stroke(PApplet.parseInt(random(0,250)));
  	 ellipse(x,y, rad, hei);
  	 drawFractal(x-2,y, rad-10, hei-10);
     
     

  }
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}


  public void setup() 
{   
	size(400,400);    
	noLoop(); 
} 
public void draw() 
{   
  background(0);
  noFill();
  stroke(int(random(0,250)));
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
     stroke(int(random(0,250)));
  	 ellipse(x,y, rad, hei);
  	 drawFractal(x-2,y, rad-10, hei-10);
  }
} 

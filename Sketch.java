import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    grass(200, 237);

    house(50, 100, 23,23,23,225,0,0);
    
    door(150, 200, 50, 75, 150, 75, 0);    
  }
  /**
   * draws a grass background from the location and with the size desired
   * @param grassY starting Y value for grass
   * @param grassH total height of the grass
   */
  public void grass(int  grassY, int grassH){
    fill(86, 125, 70);
    rect(0, grassY, width, grassH);
  }
  
  /**
   * Method that draws a house in the postition inputed and with the colors that are inputed
   * @param intX x coordinate of the house
   * @param intY y coordinate of the house
   * @param intMainColorR R code for the main color of the house
   * @param intMainColorG G code for the main color of the house
   * @param intMainColorB B code for the main color of the house
   * @param intSecondaryColorR R code for the secondary color of the house
   * @param intSecondaryColorG G code for the secondary color of the house
   * @param intSecondaryColorB B code for the secondary color of the house
   */
  public void house(int intX, int intY, int intMainColorR, int intMainColorG, int intMainColorB, int intSecondaryColorR, int intSecondaryColorG, int intSecondaryColorB){
     //left pillar
     fill(intSecondaryColorR, intSecondaryColorG, intSecondaryColorB);
     rect(intX, intY, 75,175);
     
     //roof of left pillar
     fill(intMainColorR, intMainColorG, intMainColorB);
     rect(intX - 10, intY - 10,95, 10 );
 
     //right rectangle
     fill(intMainColorR, intMainColorG, intMainColorB);
     rect(intX + 75, intY + 60, 175, 115);
 
     //roof of white rectangle
     fill(intSecondaryColorR, intSecondaryColorG, intSecondaryColorB);
     rect(intX + 65, intY + 50, 195, 10);
 
     //window for left pillar
     fill(0 ,164 ,239);
     ellipse(intX + 37, intY + 75, 50,75);
 
     //left window details
     stroke(23);
     line(intX + 37, intY + 35, intX + 37, intY + 110);
     line(intX + 12, intY + 75, intX + 62, intY + 75 );
    
     // right window 
     fill(0 ,164 ,239);
     rect(intX + 150, intY + 80, 100, 75);
     
     //right window details
     line(intX + 150, intY + 100, intX + 250, intY + 100);
     line(intX + 150, intY + 125, intX + 250, intY + 125);
     line(intX + 175, intY + 80, intX + 175, intY + 155);
     line(intX + 200, intY + 80, intX + 200, intY + 155);
     line(intX + 225, intY + 80, intX + 225, intY + 155);
  }
  /**
   * Draws the door to the house with the desired color and locatiuon
   * @param doorX X coordinate of the door
   * @param doorY Y coordinate of the door
   * @param doorW Width of door
   * @param doorH Height of door
   * @param doorR R code for the color of the door
   * @param doorG G code for the color of the door
   * @param doorB B code for the color of the door
   */
  public void door(float doorX, float doorY, float doorW, float doorH, float doorR, float doorG, float doorB) {

    // draw door
    fill(doorR, doorG, doorB);
    rect(doorX, doorY, doorW, doorH);

    // draw door knob
    fill(255);
    ellipse(doorX + 40, doorY + 50, 10, 10);

  }
  /**
   * Given the X value for the door return the X coordinate that would put it in the middle of the screen
   * @param doorX: X coordinate from the door method
   * @return: X coordinate in the middle of the screen
   */
  public float DoorMidX(float doorX) {
    return width/2;
  }
  /**
   * Given Y value, returns y coordinate at the 1/4 of the screen
   * @param doorY : uses the Y value from door method
   * @return: the y coordinate at 1/4 of the screen
   */
  public float doorY(float doorY) {
    return height/4;
  }
}
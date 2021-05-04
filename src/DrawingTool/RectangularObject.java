package DrawingTool;

public class RectangularObject {
      private int width, height ;
   
  public RectangularObject( int width, int height) {
    this.width = width;
    this.height = height;
  }
   
  public void draw(int left , int top) {
    Drawing.pen().drawRect(left , top, width, height);
    }

}
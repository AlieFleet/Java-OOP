package Classes;

public class Rectangle {
    
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(){

    }
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
    public float getLength(){
        return length;
    }
    public void setLength(float length){
        this.length = length;
    }
        public float getWidth(){
        return width;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public double getArea(){
        //Area = wl
        return width*length;
    }
    public double getParameter(){
        //Parameter = 2(w+l)
        return 2*(width + length);
    }
    public String toString(){
        return "Rectangle[length = %.2f , width = %.2f]".formatted(length, width);
    }

}

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Semaforo
{
    private Square cuadrado1;
    private Square cuadrado2;
    private Square cuadrado3;
    private Circle luzRoja;
    private Circle luzAmarilla;
    private Circle luzVerde;
    private boolean drawn;
    private int currentColor;

    /**
     * Constructor for objects of class Picture
     */
    public Semaforo()
    {
        cuadrado1 = new Square();
        cuadrado2 = new Square();
        cuadrado3 = new Square();  
        luzRoja = new Circle();
        luzAmarilla = new Circle();
        luzVerde = new Circle();
        drawn = false;
        currentColor = 1;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            cuadrado1.moveHorizontal(-140);
            cuadrado1.moveVertical(48);
            cuadrado1.changeSize(60);
            cuadrado1.makeVisible();
            cuadrado1.changeColor("black");
            
            cuadrado2.moveHorizontal(-140);
            cuadrado2.moveVertical(0);
            cuadrado2.changeSize(60);
            cuadrado2.makeVisible();
            cuadrado2.changeColor("black");
            
            cuadrado3.moveHorizontal(-140);
            cuadrado3.moveVertical(-48);
            cuadrado3.changeSize(60);
            cuadrado3.makeVisible();
            cuadrado3.changeColor("black");
            
            luzRoja.moveHorizontal(-53);
            luzRoja.moveVertical(-15);
            luzRoja.changeSize(47);
            luzRoja.makeVisible();
            luzRoja.changeColor("red");
            
            luzAmarilla.moveHorizontal(-53);
            luzAmarilla.moveVertical(35);
            luzAmarilla.changeSize(47);
            luzAmarilla.makeVisible();
            luzAmarilla.changeColor("yellow");
            
            luzVerde.moveHorizontal(-53);
            luzVerde.moveVertical(85);
            luzVerde.changeSize(47);
            luzVerde.makeVisible();
            luzVerde.changeColor("green");
            
            drawn = true;
        }
        if(currentColor==1) 
        {
        luzVerde.changeColor("black");
        luzAmarilla.changeColor("black");
        luzRoja.changeColor("red");
        }
        if(currentColor==2) 
        {
        luzVerde.changeColor("black");
        luzAmarilla.changeColor("yellow");
        luzRoja.changeColor("black");
        }
        if(currentColor==3) 
        {
        luzVerde.changeColor("green");
        luzAmarilla.changeColor("black");
        luzRoja.changeColor("black");
        }
    }
    public void cambiarALuzRoja() 
    {
        currentColor = 1;
        luzVerde.changeColor("black");
        luzAmarilla.changeColor("black");
        luzRoja.changeColor("red");
    }
    public void cambiarAluzAmarilla()
    {
      currentColor = 2;
      luzVerde.changeColor("black");
      luzAmarilla.changeColor("yellow");
      luzRoja.changeColor("black");
    }
    public void cambiarAluzVerde()
    {
        currentColor = 3;
        luzVerde.changeColor("green");
        luzAmarilla.changeColor("black");
        luzRoja.changeColor("black");
    }
    public void setCurrentColor(int newColor)
    {
        currentColor = newColor;
    }
    public int getCurrentColor()
    {
        return currentColor;
    }

}

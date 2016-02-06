import java.awt.*;

public abstract class SuitClass extends ShapeClass
{

    public void setWidth (int newWidth)
    {
	width = newWidth;
	height = (newWidth * 5) / 4;

    }


    public void setHeight (int newHeight)
    {
	height = newHeight;
	width = (newHeight * 4) / 5;


    }



}

package cs1302.p2;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.Parent;

public class ImageBorderPane extends BorderPane
{
    LeftVBox leftPane = new LeftVBox(); 
    CenterVBox centerPane = new CenterVBox(); 
    RightVBox rightPane = new RightVBox();

    static int count = 0;
     
    public ImageBorderPane()
    {
	super();
	
	setLeft(leftPane);
	setCenter(centerPane);
	setRight(rightPane);	
    }
}
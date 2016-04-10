package cs1302.p2;

import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MenuBar;
import javafx.scene.paint.Color;

import cs1302.effects.Artsy;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;

public class TopButtons extends FlowPane
{
    //HBox buttons = new HBox(8); 
    Button checkers = new Button("Checkers");
    Button horizontal = new Button("Horizontal Stripes");
    Button vertical = new Button("Verticle Stripes");
    //MyArtsy ma = new MyArsty();
    public TopButtons()
    {
	super();
	setPadding(new Insets(10));
	setHgap(8);
	setVgap(4);
	getChildren().addAll(checkers,horizontal,vertical);

	checkers.setOnAction(event -> 
	    {
		RightVBox.iv3.setImage(MyArtsy.doCheckers(copyImage(OpenMenu.getImage1()),copyImage(OpenMenu.getImage2()),30));
	    });
	horizontal.setOnAction(event -> 
	    {
		RightVBox.iv3.setImage(MyArtsy.doHorizontalStripes(copyImage(OpenMenu.getImage1()),copyImage(OpenMenu.getImage2()),10));
	    });
	vertical.setOnAction(event -> 
	    {
		RightVBox.iv3.setImage(MyArtsy.doVerticalStripes(copyImage(OpenMenu.getImage1()),copyImage(OpenMenu.getImage2()),10));
	    });
    }
    public Image copyImage(Image src) {
	int width = (int) src.getWidth();
	int height = (int) src.getHeight();
	WritableImage ret = new WritableImage(width, height);
	PixelReader pr = src.getPixelReader();
	PixelWriter pw = ret.getPixelWriter();
	for (int x = 0; x < width; ++x) {
	    for (int y = 0; y < height; ++y) {
		pw.setArgb(x, y, pr.getArgb(x, y));
	    } // for
	} // for
	return ret;
    } // copyImage
}
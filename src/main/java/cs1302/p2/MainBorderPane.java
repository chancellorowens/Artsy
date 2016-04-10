package cs1302.p2;

import javafx.scene.layout.BorderPane;
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

public class MainBorderPane extends BorderPane
{
    HBox buttons = new HBox(8); 
    Button checkers = new Button("Checkers");
    Button horizontal = new Button("Horizontal Stripes");
    Button vertical = new Button("Verticle Stripes");
    ImageBorderPane pictures = new ImageBorderPane();
    MainMenuBar menu = new MainMenuBar();
    
    public MainBorderPane()
    {
	super();

	buttons.setPadding(new Insets(10));
	buttons.getChildren().addAll(checkers,horizontal,vertical);

	setTop(menu);
	setCenter(buttons);
	setBottom(pictures);
    }
}
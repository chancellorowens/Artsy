package cs1302.p2;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MenuBar;
import javafx.application.Platform;
import javafx.scene.image.Image;
import java.io.File;
import java.awt.image.BufferedImage;
import javafx.embed.swing.SwingFXUtils;
import javax.imageio.ImageIO;
import java.io.IOException;

public class FileMenu extends Menu
{
    MenuItem exitItem = new MenuItem("Exit");
    MenuItem saveItem = new MenuItem("Save");
    OpenMenu openMenu = new OpenMenu("Open");

    public FileMenu()
    {
	super("File");
	exitItem.setOnAction(event -> Platform.exit());
	saveItem.setOnAction(event -> 
        {
	    try
		{
		    Image image = RightVBox.di3; // assume non-empty
		    File file = new File("image.png");
		    BufferedImage bImage = SwingFXUtils.fromFXImage(image, null);
		    ImageIO.write(bImage, "png", file);
		}
	    catch(IOException e)
		{
		    System.out.println("Something went wrong");
		}
	});
	getItems().addAll(openMenu, saveItem, exitItem);
    }
}
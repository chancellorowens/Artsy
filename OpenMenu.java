package cs1302.p2;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.stage.Window;
import javax.imageio.ImageIO;


public class OpenMenu extends Menu
{
    
    MenuItem oi1 = new MenuItem("Open Image 1");
    MenuItem oi2 = new MenuItem("Open Image 2");

    static Image img1;
    static Image img2;

    public OpenMenu(String text)
    {
	super("Open");
	getItems().addAll(oi1,oi2);
	oi1.setOnAction(event -> changeImage1());
	oi2.setOnAction(event -> changeImage2());
    }
    
    public void changeImage1()
        {
	    FileChooser fileChooser = new FileChooser();
	    ExtensionFilter pngFilter = new ExtensionFilter("PNG Files", "*.png");
	    fileChooser.setTitle("Open Resource File");
	    fileChooser.getExtensionFilters().add(pngFilter);
	    Window stage = null;
	    File selectedFile = fileChooser.showOpenDialog(stage);
	    if (selectedFile != null) 
		{
		    try 
			{
			    BufferedImage bufferedImage = ImageIO.read(selectedFile);
			    img1 = SwingFXUtils.toFXImage(bufferedImage, null);
			    LeftVBox.iv1.setImage(img1);
			    LeftVBox.l1.setText("Image 1: sample1");
			    System.out.println("Image 1 Changed");
			} 
		    catch (IOException ex) 
			{
			    Logger.getLogger(OpenMenu.class.getName()).log(Level.SEVERE, null, ex);
			}
		} // if
	}
    public void changeImage2()
    {
	    {
		FileChooser fileChooser = new FileChooser();
		ExtensionFilter pngFilter = new ExtensionFilter("PNG Files", "*.png");
		fileChooser.setTitle("Open Resource File");
		fileChooser.getExtensionFilters().add(pngFilter);
		Window stage = null;
		File selectedFile = fileChooser.showOpenDialog(stage);
		if (selectedFile != null) 
		    {
			try 
			    {
				BufferedImage bufferedImage = ImageIO.read(selectedFile);
				img2 = SwingFXUtils.toFXImage(bufferedImage, null);
				CenterVBox.iv2.setImage(img2);
				CenterVBox.l2.setText("Image 2: sample2");
				System.out.println("Image 2 Changed" + CenterVBox.l2);
			    } 
			catch (IOException ex) 
			    {
				Logger.getLogger(OpenMenu.class.getName()).log(Level.SEVERE, null, ex);
			    }
				    
		    } // if
	    }
    }
    public static Image getImage1()
    {
	return img1;
    }    
    public static Image getImage2()
    {
	return img2;
    }
}
//		    BufferedImage bufferedImage = ImageIO.read(file);
//Image image = SwingFXUtils.toFXImage(bufferedImage, null);
//			    myImageView.setImage(image);

//		ibp.leftPane.setImage1("https://github.com/mepcotterell-cs1302/cs1302-artsy/blob/master/samples/sample1.png?raw=true");
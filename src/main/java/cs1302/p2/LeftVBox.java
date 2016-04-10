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
import javafx.stage.Modality;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.stage.StageStyle;
import javafx.stage.Modality;


public class LeftVBox extends VBox
{
    static String DEFAULT1 = "https://github.com/mepcotterell-cs1302/cs1302-artsy/blob/master/resources/default.png?raw=true";
    static ImageView iv1;
    static Label l1;
    static Image di1;
    public LeftVBox()
    {
	super(8);
	setPadding(new Insets(10));
	try
	    {
		l1 = new Label("Image 1: default");
		di1 = new Image(DEFAULT1);
		iv1 = new ImageView();
		iv1.setImage(di1);
		Button rotate1 = new Button("Rotate");
		Button reset1 = new Button("Reset");
		getChildren().addAll(l1,iv1,rotate1,reset1);
		
		rotate1.setOnAction(event ->
				      {
					  Stage rotate = new Stage(StageStyle.UTILITY);
					  RotatePane rotatePane = new RotatePane();
					  Scene scene = new Scene(rotatePane);
					  rotate.setScene(scene);
					  rotate.initModality(Modality.APPLICATION_MODAL);
					  rotate.setTitle("Rotate Image 1");
					  rotate.show();
				      });

	    }
	catch(IllegalArgumentException e)
	    {
		System.out.println("ERROR!!!");
	    }
    }
    public static Image getImage1()
    {
	return di1;
    }
}
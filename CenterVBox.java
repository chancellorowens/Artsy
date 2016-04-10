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
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.stage.StageStyle;
import javafx.stage.Modality;


public class CenterVBox extends VBox
{
    static String DEFAULT2 = "https://github.com/mepcotterell-cs1302/cs1302-artsy/blob/master/resources/default.png?raw=true";
    static ImageView iv2;
    static Label l2;
    static Image di2;

    public CenterVBox()
    {
	super(8);
	setPadding(new Insets(10));	
	try
	    {
		l2 = new Label("Image 2: default");
		
		di2 = new Image(DEFAULT2);
		iv2 = new ImageView();
		iv2.setImage(di2);
		Button rotate2 = new Button("Rotate");
		Button reset2 = new Button("Reset");
		getChildren().addAll(l2,iv2,rotate2,reset2);
		
		rotate2.setOnAction(event ->
				      {
					  Stage rotate = new Stage(StageStyle.UTILITY);
					  RotatePane rotatePane = new RotatePane();
					  Scene scene = new Scene(rotatePane);
					  rotate.setScene(scene);
					  rotate.initModality(Modality.APPLICATION_MODAL);
					  rotate.setTitle("Rotate Image 2");
					  rotate.show();
				      });


	    }
	catch(IllegalArgumentException e)
	    {
		System.out.println("ERROR!!!");
	    }
	
    }
    public static Image getImage2()
    {
	return di2;
    }
}
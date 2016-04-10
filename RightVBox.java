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
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.stage.StageStyle;
import javafx.stage.Modality;

public class RightVBox extends VBox
{
    static String DEFAULT3 = "https://github.com/mepcotterell-cs1302/cs1302-artsy/blob/master/resources/default.png?raw=true";
    Image di3;    
    Image si3;
    static ImageView iv3 = new ImageView();
    static Label l3 = new Label("Result");
    Button rotate3 = new Button("Rotate");
    Button reset3 = new Button("Reset");

    public RightVBox()
    {
	super(8);
	setPadding(new Insets(10));

	di3 = new Image(DEFAULT3);
	iv3.setImage(di3);

	getChildren().addAll(l3,iv3,rotate3,reset3);
		rotate3.setOnAction(event ->
				      {
					  Stage rotate = new Stage(StageStyle.UTILITY);
					  RotatePane rotatePane = new RotatePane();
					  Scene scene = new Scene(rotatePane);
					  rotate.setScene(scene);
					  rotate.initModality(Modality.APPLICATION_MODAL);
					  rotate.setTitle("Rotate Result");
					  rotate.show();
				      });

    }
    
    public void setImage3(String img3)
    {
	//DEFAULT3 = img3;
	si3 = new Image(img3);
	iv3.setImage(si3);
    }
}

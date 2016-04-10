package cs1302.p2;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.application.Platform;

public class RotatePane extends BorderPane 
{
    Label label = new Label("Please enter degree of rotation:");
    TextField textField = new TextField();

    HBox buttons = new HBox(8);
    Button okay = new Button("Okay");
    Button cancel = new Button("Cancel");
    
    public RotatePane() 
    {
        super();

	setPadding(new Insets(10));
        buttons.setPadding(new Insets(10));
        buttons.getChildren().addAll(okay, cancel);
	setTop(label);
	setCenter(textField);
        setBottom(buttons);
	
	okay.setOnAction(event ->
	    {
		MyArtsy.doRotate(OpenMenu.getImage1(),Double.parseDouble(textField.getText()));
	    });
	//cancel.setOnAction(event -> );
    }

}

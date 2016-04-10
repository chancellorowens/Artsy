package cs1302.p2;

import cs1302.effects.Artsy;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
/**
 * This is the driver for this application.
 */
public class Driver extends Application 
{
    @Override
    public void start(Stage stage) 
    {       	
	BorderPane root = new BorderPane();
	HBox content = new HBox(8);
	//	
        Scene scene = new Scene(root);
	
	//	ImageBorderPane i = new ImageBorderPane();
    
	//root.getChildren().add(i);
		
        //MainBorderPane root = new MainBorderPane();
	MainMenuBar mb = new MainMenuBar();
	TopButtons tb = new TopButtons();
	LeftVBox leftPane = new LeftVBox(); 
	CenterVBox centerPane = new CenterVBox(); 
	RightVBox rightPane = new RightVBox();

	content.getChildren().addAll(leftPane,centerPane,rightPane);
	
	root.setTop(mb);
	root.setCenter(tb);
	root.setBottom(content);

        stage.setScene(scene);
        stage.setTitle("Artsy!");
        stage.sizeToScene();
        stage.show();

    } // createAndShowGUI

    public static void main(String[] args) 
    {
        launch(args);
    } // main
    
} // Driver

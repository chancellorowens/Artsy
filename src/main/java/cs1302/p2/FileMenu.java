package cs1302.p2;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MenuBar;
import javafx.application.Platform;

public class FileMenu extends Menu
{
    MenuItem exitItem = new MenuItem("Exit");
    MenuItem saveItem = new MenuItem("Save Result As");
    OpenMenu openMenu = new OpenMenu("Open");

    public FileMenu()
    {
	super("File");
	exitItem.setOnAction(event -> Platform.exit());
	getItems().addAll(openMenu, saveItem, exitItem);
    }
}
package cs1302.p2;

import javafx.scene.control.MenuBar;

public class MainMenuBar extends MenuBar
{
    
    FileMenu fileMenu = new FileMenu();
    

    public MainMenuBar()
    {
	super();
	getMenus().add(fileMenu);
    }
    
}
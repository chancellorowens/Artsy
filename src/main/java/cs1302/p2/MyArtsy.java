package cs1302.p2;

import cs1302.effects.Artsy;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;


public class MyArtsy //implements Artsy 
{

    ImageBorderPane ibp = new ImageBorderPane();
    
    //@Override
    public static Image doCheckers(Image src1, Image src2, int size) 
    {	
	int width = (int) src1.getWidth();
	int height = (int) src1.getHeight();
	
	WritableImage ret = new WritableImage(width, height);
	PixelReader pr1 = src1.getPixelReader();
	PixelReader pr2 = src2.getPixelReader();
	PixelWriter pw = ret.getPixelWriter();
	int count = 0;
	int start = 0;
	for (int y = 0; y < height; ++y) 
	    {
	    for (int x = 0; x < width; ++x) 
		{
		    if(count < 9)
			{
			    pw.setArgb(x, y, pr1.getArgb(x, y));
			    count++;
			}
		    if(count >= 9 && count < 18)
		       {
			   pw.setArgb(x, y, pr2.getArgb(x, y));
			   count++;
		       }
		    if(count == 18)
			count = 0;
		} // for
	    } // for

	return ret;
    } // doCheckers

    //@Override
	public static Image doVerticalStripes(Image src1, Image src2, int height) 
    {
	int width = (int) src1.getWidth();
	height = (int) src1.getHeight();
	
	WritableImage ret = new WritableImage(width, height);
	PixelReader pr1 = src1.getPixelReader();
	PixelReader pr2 = src2.getPixelReader();
	PixelWriter pw = ret.getPixelWriter();
	int count = 0;
	for (int x = 0; x < width; ++x) 
	    {
	    for (int y = 0; y < height; ++y) 
		{
		    if(count < 3000)
			{
			    pw.setArgb(x, y, pr1.getArgb(x, y));
			    count++;
			}
		    if(count >= 3000 && count !=6000)
		       {
			   pw.setArgb(x, y, pr2.getArgb(x, y));
			   count++;
		       }
		    if(count == 6000)
			count = 0;
		} // for
	    } // for
	
	return ret;
    } // doVerticalStripes
//@Override
    public static Image doHorizontalStripes(Image src1, Image src2, int width) 
    {
	width = (int) src1.getWidth();
	int height = (int) src1.getHeight();
	
	WritableImage ret = new WritableImage(width, height);
	PixelReader pr1 = src1.getPixelReader();
	PixelReader pr2 = src2.getPixelReader();
	PixelWriter pw = ret.getPixelWriter();
	int count = 0;
	for (int y = 0; y < height; ++y) 
	    {
	    for (int x = 0; x < width; ++x) 
		{
		    if(count < 3000)
			{
			    pw.setArgb(x, y, pr1.getArgb(x, y));
			    count++;
			}
		    if(count >= 3000 && count !=6000)
		       {
			   pw.setArgb(x, y, pr2.getArgb(x, y));
			   count++;
		       }
		    if(count == 6000)
			count = 0;
		} // for
	    } // for

	return ret;
    } // doHorizontalStripes
    //@Override
    public static Image doRotate(Image src, double degrees) 
    {
	int width = (int) src.getWidth();
	int height = (int) src.getHeight();
	WritableImage ret = new WritableImage(width, height);
	PixelReader pr = src.getPixelReader();
	PixelWriter pw = ret.getPixelWriter();
	
	degrees = Math.toRadians(degrees);
	
	for (int x = 0; x < width; ++x) 
	    {
	    for (int y = 0; y < height; ++y) 
		{
		    //pw.setArgb(x, y, pr.getArgb(((int)((x-(width/2)) * Math.cos(degrees) + (y-(height/2)) * Math.sin(degrees))),((int)((-x-(width/2)) * Math.cos(degrees) + (y-(height/2)) * Math.sin(degrees)))));
	    } // for
	} // for

	return ret;
    } // doRotate
} // MyArtsy



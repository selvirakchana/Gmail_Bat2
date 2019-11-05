package generic_libraries;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;

public class WebElements_Generic {

	public String Get_Text(WebElement ele)
	{
		String text = ele.getText();
		return	text;
	}
	public String Get_Att(WebElement ele, String att)
	{
		String att1 = ele.getAttribute(att);
		return	att1;
	}
	public String Get_Css(WebElement ele, String val)
	{
		String css = ele.getCssValue(val);
		return	css;
	}
	public Point Get_Location(WebElement ele)
	{
		Point loc = ele.getLocation();
		return	loc;
	}
	public int Get_LocationX(WebElement ele)
	{
		int x = ele.getLocation().getX();
		return	x;
	}
	public int Get_LocationY(WebElement ele)
	{
		int y = ele.getLocation().getY();
		return	y;
	}
	public Rectangle Get_Rect(WebElement ele)
	{
		Rectangle rec = ele.getRect();
		return	rec;
	}
	public String Get_TagName(WebElement ele)
	{
		String tagname = ele.getTagName();
		return	tagname;
	}
	public Dimension Get_Size(WebElement ele)
	{
		Dimension size = ele.getSize();
		return	size;
	}
	public int Get_Hight(WebElement ele)
	{
		int hight = ele.getSize().getHeight();
		return	hight;
	}
	public int Get_Width(WebElement ele)
	{
		int width = ele.getSize().getWidth();
		return	width;
	}
	public void Clear_Field(WebElement ele)
	{
		ele.clear();
	}
	public void Click_Field(WebElement ele)
	{
		ele.click();
	}
	public boolean Is_Displayed(WebElement ele)
	{
		boolean val = ele.isDisplayed();
		return val;
	}
	public boolean Is_Enabled(WebElement ele)
	{
		boolean val = ele.isEnabled();
		return val;
	}
	public boolean Is_Selected(WebElement ele)
	{
		boolean val = ele.isSelected();
		return val;
	}
	public void Send_Keys(WebElement ele, String val)
	{
		ele.sendKeys(val);
	}
}

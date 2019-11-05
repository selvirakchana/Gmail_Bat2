package generic_libraries;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Generic {
	
	Select s;
	
	public Dropdown_Generic(WebElement ele)
	{
		s= new Select(ele);
	}
	
	public void SelectIndex(int i)
	{
		s.selectByIndex(i);
	}
	public void SelectVlaue(String val)
	{
		s.selectByValue(val);
	}
	public void SelectText(String text)
	{
		s.selectByVisibleText(text);
	}
	public boolean IsMultiple()
	{
		boolean m = s.isMultiple();
		return m;
	}
	public void DeSelectAll()
	{
		s.deselectAll();
	}
	public void DeSelectIndex( int i)
	{
		s.deselectByIndex(i);
	}
	public void DeSelectValue( String val)
	{
		s.deselectByValue(val);
	}
	public void DeSelectText(String text)
	{
		s.deselectByVisibleText(text);
	}
	public int GetAllSelectedOptions_Size()
	{
		List<WebElement> options = s.getAllSelectedOptions();
		int count = options.size();
		return count;
	}
	public ArrayList<String> GetAllSelectedOptions_Text()
	{
		List<WebElement> options = s.getAllSelectedOptions();
		ArrayList<String> l = new ArrayList<String>();
		for (WebElement we:options)
		{
			String text = we.getText();
			l.add(text);
		}
		
		return l;
	}
	public WebElement GetFirstSelectOption()
	{
		WebElement firstoption = s.getFirstSelectedOption();
		return firstoption;
	}
	public int GetOptions_Size()
	{
		List<WebElement> options = s.getOptions();
		int count = options.size();
		return count;
	}
	public String GetOptions_Text(int i)
	{
		List<WebElement> options = s.getOptions();
		String text = options.get(i).getText();
		return text;
	}
	public ArrayList<String> GetOptions_values( )
	{
		List<WebElement> options = s.getOptions();
		ArrayList<String> l=new ArrayList<String>();
		for (WebElement we:options)
		{
			String text = we.getText();
			l.add(text);
		}
		return l;
	}
	public void Select_Allvalue()
	{
		List<WebElement> options = s.getOptions();
		int count = options.size();
		for(int i = 0;i<count;i++)
		{
			s.selectByIndex(i);			
		}
		
	}
	
}

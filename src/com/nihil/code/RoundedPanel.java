package com.nihil.code;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("all")
public class RoundedPanel extends JPanel
{
	private int radius = 15;
	private Color backcolor;
	
	public RoundedPanel(int radius)
	{
		this.radius  = radius;
	}
	
	public RoundedPanel(int radius, Color color)
	{
		this.radius  = radius;
		this.backcolor = color;
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		Dimension arc = new Dimension(radius, radius);
		int width = this.getWidth();
		int hight = this.getHeight();
		
		Graphics2D graphics = (Graphics2D) g;
		if(backcolor != null)
		{
			graphics.setColor(backcolor);
		}
		else
		{
			graphics.setColor(getBackground());
		}
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphics.fillRoundRect(0, 0, width-1, hight-1, arc.width, arc.height);
		graphics.setColor(getForeground());
	
	}
	
}

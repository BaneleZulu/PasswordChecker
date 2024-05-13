package com.nihil.code;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;


public class RoundedBorder implements Border
{
	private int radius;
	private Color color;
	public RoundedBorder(int radius) {
		this.radius = radius;
	}
	public RoundedBorder(int radius, Color color) {
		this.radius = radius;
		this.color = color;
	}
	public Insets getBorderInsets(Component c) {
		return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
	}
	public boolean isBorderOpaque() {
		return true;
	}
	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if(color == null)	{
			g2d.setColor(color);
		}
		else {
			g2d.setColor(color);
		}

		g2d.fillRoundRect(0, 0, width-1, height-1, radius, radius);
		g2d.setColor(color);
	}
}

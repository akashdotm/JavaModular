package com.jvb.self.modtwo;

import com.jvb.self.modone.Mention;
import com.jvb.self.modthree.SamePackageClass;
import com.jvb.self.modone.TechNotes;

public class ColorNotes implements Reference{
	private String color;
	SamePackageClass objectSamePackage;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ColorNotes(String col) {
		this.color = col;
	}

	@Override
	public String whyTheSpecialMention() {
		// TODO Auto-generated method stub
		return "Because of the color: "+this.getColor();
	}

	@Override
	public SamePackageClass printTheMention(Mention note) {
		// TODO Auto-generated method stub
		objectSamePackage = new SamePackageClass(3);
		Mention mentionRef = new TechNotes();
		//return note.whatIsThePurpose();
		return objectSamePackage;
	}

}

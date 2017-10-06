package com.jvb.self.modtwo;

import com.jvb.self.modone.Mention;
import com.jvb.self.modthree.SamePackageClass;

public interface Reference {
	String whyTheSpecialMention();
	SamePackageClass printTheMention(Mention note);
}

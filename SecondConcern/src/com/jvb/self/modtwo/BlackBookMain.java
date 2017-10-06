package com.jvb.self.modtwo;

import com.jvb.self.modthree.SamePackageClass;
import com.jvb.self.modone.Mention;
import com.jvb.self.modone.TechNotes;

public class BlackBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SpringConfigForBlackBook blackbookConfig = new SpringConfigForBlackBook();
		Mention mentionFromAllTimeRef = new TechNotes();
		Reference refFromSelfMod = new ColorNotes("rubber band");
		System.out.println(refFromSelfMod.whyTheSpecialMention());
		System.out.println(mentionFromAllTimeRef.whatIsThePurpose());
		SamePackageClass deriveObject = refFromSelfMod.printTheMention(mentionFromAllTimeRef);
		//SamePackageClass methodDerivedObject = refFromSelfMod.printTheMention(mentionFromAllTimeRef);
		deriveObject.samePackageMethod();
	}
	
	/*public static void main(String[] a) {
		System.out.println("Hello World!");
	}
*/
}

/**
 * 
 */
package com.jvb.self.modone;

import com.jvb.self.modthree.SamePackageClass;

/**
 * @author amishra6
 *
 */
public class TechNotes implements Mention {
	
	private SamePackageClass samePkgClsObj;
	/* (non-Javadoc)
	 * @see com.diary.pages.Mention#whatIsThePurpose()
	 */
	@Override
	public String whatIsThePurpose() {
		// TODO Auto-generated method stub
		samePkgClsObj = new SamePackageClass(20);
		samePkgClsObj.samePackageMethod();
		return "Info about technology trends.";
	}

}

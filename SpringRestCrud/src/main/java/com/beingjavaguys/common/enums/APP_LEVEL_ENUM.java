 

/********************************************************************

* ACG

* All Rights Reserved 

*

* File: APP_LEVEL_ENUM.java

********************************************************************

*

*  Ver   Date              Author             Description

*  ====  ========          ============       ==================

*  1.0  Feb 2, 2015            Vamsi                 Created

/ ********************************************************************/
package com.beingjavaguys.common.enums;

/**
 * @author Vamsi
 *
 */
public enum APP_LEVEL_ENUM {
	
	API(1),SERVICE(2),PROCESSOR(3),PROVIDER(4), TPCONNECTOR(4), DATA(5);
	
	private Integer level;

	/**
	 * @param level
	 */
	private APP_LEVEL_ENUM(int level) {
		this.level = level;
	}

	/**
	 * @return the level
	 */
	public Integer getLevel() {
		return level;
	}

}

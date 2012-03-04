/*
 * Copyright (c) 2010-2011 lichengwu
 * All rights reserved.
 * 
 */
package com.meituan.gaara.info;

import java.io.Serializable;

/**
 * 虚拟机信息
 * 
 * @author lichengwu
 * @created 2012-1-8
 * 
 * @version 1.0
 */
final public class VirtualMachineInfo implements TransientInfo, Serializable {

	private static final long serialVersionUID = 4145011994188568350L;

	private long lastUpdate = 0;

	public VirtualMachineInfo() {
		lastUpdate = System.currentTimeMillis();
	}

	public boolean refresh() {
		lastUpdate = System.currentTimeMillis();
		return false;
	}

	/**
	 * @see com.meituan.gaara.info.TransientInfo#lastUpdate()
	 */
	@Override
	public long lastUpdate() {
		return lastUpdate;
	}

}

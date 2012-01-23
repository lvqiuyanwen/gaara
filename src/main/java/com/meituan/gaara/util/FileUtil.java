/*
 * Copyright (c) 2010-2011 lichengwu
 * All rights reserved.
 * 
 */
package com.meituan.gaara.util;

import java.io.File;

/**
 * 文件工具类
 * 
 * @author lichengwu
 * @created 2012-1-22
 * 
 * @version 1.0
 */
final public class FileUtil {

	/**
	 * 临时文件目录
	 */
	public static File TEMP_DIR = new File(System.getProperty("java.io.tmpdir"));

	/**
	 * 判断路径是否是绝对路径
	 * 
	 * @author lichengwu
	 * @created 2012-1-22
	 * 
	 * @param path
	 *            文件路径
	 * @return
	 */
	public static boolean isAbsolute(String path) {
		if (path == null || path.length() < 1) {
			return false;
		}
		return new File(path).isAbsolute();
	}

	/**
	 * 确保文件路径存在，如果不存在就创建路径
	 * 
	 * @author lichengwu
	 * @created 2012-1-22
	 * 
	 * @param path 文件路径
	 * @return 如果path是一个路径，并且能够创建创建，返回true；否则返回false
	 */
	public static boolean ensureFilePath(File path) {
		return path.mkdirs() || path.exists();
	}

	/**
	 * 确保文件路径存在，如果不存在就创建路径
	 * 
	 * @author lichengwu
	 * @created 2012-1-22
	 * 
	 * @param path 文件路径
	 * @return 如果path是一个路径，并且能够创建创建，返回true；否则返回false
	 */
	public static boolean ensureFilePath(String path) {
		return ensureFilePath(new File(path));
	}

	public static void main(String[] args) {
		System.out.println(new File("E:/war2.rar").mkdirs());
	}
}
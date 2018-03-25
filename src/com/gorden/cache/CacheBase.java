package com.gorden.cache;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public interface CacheBase<T> {
	Logger adxcache = LogManager.getLogger("cachelog");

	/**
	 * 更新缓存池内容
	 */
	boolean updateCache();

	/**
	 * 获取缓存池所有内容
	 */
	List<T> getCache();

	/**
	 * 通过key获取缓存池内容
	 **/
	T getCache(String key);

	/**
	 * 获取总广告条数
	 */
	long size();
}

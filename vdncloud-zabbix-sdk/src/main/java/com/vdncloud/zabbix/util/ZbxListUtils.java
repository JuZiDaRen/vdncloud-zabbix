package com.vdncloud.zabbix.util;

import java.util.ArrayList;
import java.util.List;

public class ZbxListUtils {
	 private ZbxListUtils() {
	    }

	    public static <E> List<E> add(List<E> list, E e) {
	        if (list == null) {
	            list = new ArrayList<E>();
	        }

	        list.add(e);

	        return list;
	    }
}

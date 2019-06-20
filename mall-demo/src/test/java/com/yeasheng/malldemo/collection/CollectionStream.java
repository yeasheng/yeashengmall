package com.yeasheng.malldemo.collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * Desc:
 * @author: yansheng
 * @date: 2019/6/19
 */
public class CollectionStream {

	public static void main(String[] args) {
		Collection books = new HashSet();
		books.add("crazy");
		books.add("Java");
		books.add("learning");
		System.out.println(books.stream().filter(ele ->(((String)ele).contains("a"))).count());

	}
}

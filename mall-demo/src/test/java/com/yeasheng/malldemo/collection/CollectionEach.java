package com.yeasheng.malldemo.collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * Desc: 使用lambda表达式遍历集合
 * @author: yansheng
 * @date: 2019/6/19
 */
public class CollectionEach {

	public static void main(String[] args) {
		Collection books = new HashSet();
		books.add("crazy");
		books.add("Java");
		books.add("learning");
		//调用foreach遍历
		books.forEach(obj -> System.out.println("books' name: "+obj));

	}

}

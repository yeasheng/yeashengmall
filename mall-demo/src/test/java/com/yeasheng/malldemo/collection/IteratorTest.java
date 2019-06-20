package com.yeasheng.malldemo.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Desc:iterator测试
 * @author: yansheng
 * @date: 2019/6/19
 */
public class IteratorTest {
	public static void main(String[] args) {
		Collection books = new HashSet();
		books.add("crazy");
		books.add("Java");
		books.add("learning");
		//获取books迭代器
		Iterator it = books.iterator();
		it.forEachRemaining(obj -> System.out.println("books' name: "+obj));
		while (it.hasNext()) {
			String book = (String) it.next();
			System.out.println(book);
			if ("Java".equals(book)) {
				//books.remove(book);
				it.remove();
				System.out.println(book);
			}
			book = "中文书";
		}
		System.out.println(books);
	}
}

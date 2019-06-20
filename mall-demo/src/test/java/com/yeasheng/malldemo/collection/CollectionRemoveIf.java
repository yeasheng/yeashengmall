package com.yeasheng.malldemo.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * Desc:
 * @author: yansheng
 * @date: 2019/6/19
 */
public class CollectionRemoveIf {
	public static void main(String[] args) {
		Collection books = new HashSet();
		books.add("crazy");
		books.add("Java");
		books.add("learning");
		//books.removeIf(obj ->"Java".equals((String)obj));
		int total = callAll(books,ele ->((String)ele).contains("Java"));
		System.out.println(total);
	}
	public static int callAll(Collection books, Predicate predicate){
		int total = 0;
		for (Object obj : books){
			if (predicate.test(obj)){
				total++;
			}
		}
		return total;
	}
}

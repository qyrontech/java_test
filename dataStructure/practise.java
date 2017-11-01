package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class practise {
	public static void main(String[] args) {
		int [][] matrix = new int [2][3];
//		for (int i = 0; i < matrix.length; i++) {
//			System.out.println("列的长度:" + matrix[i].length);//列的长度
//			for (int j = 0; j < matrix[i].length; j++) {			
//			}
//		}
//		String str = "abc";
//		System.out.println("行的长度:" + matrix.length);//行的长度
		
		
//		  stringTest();
		  
//		  Character chara = new Character('b');
		  
//		  hashSet();//无序，不重复
		  
//		  linkedHashSet();//有序，不重复
		
//		treeHashSet();//有序，不重复
		
//		list();
		
		listTest();
		
		  
	}

	protected static void listTest() {
		List<Integer> list1 = Arrays.asList(2,4,6,7,8,9);
		System.out.println("(1)Index:" + Collections.binarySearch(list1, 6));
		System.out.println("(1)Index:" + Collections.binarySearch(list1, 5));
		
		List<String> list = Arrays.asList("red", "yellow", "green", "blue");
		List<String> list2 = Arrays.asList("white", "black");
		Collections.copy(list, list2);//list和list2拥有固定的元素长度
//		Collections.reverse(list);//倒序排序
//		Collections.shuffle(list);//随机排序
		System.out.println("list:" + list);//list:[white, black, green, blue]
	}

	protected static void list() {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(4);
		arrayList.add(1);
		arrayList.add(8);
		arrayList.set(3, 2);//把下标是3的元素改成2
		
		 System.out.println("arrayList：" + arrayList);
		 
		 LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
		 System.out.println("linkedList：" + linkedList);
	}

	protected static void treeHashSet() {
		Set<String> set = new HashSet<String>();
		  set.add("Java");
		  set.add("HTML");
		  set.add("Javascript");
		  set.add("CSS");
		  set.add("React Native");
		  set.add("CSS");
		  
		  TreeSet<String> treeSet = new TreeSet<String>(set);
		  
		  System.out.println("sort tree set：" + treeSet);
		  
		  System.out.println("first:" + treeSet.first());//返回treeSet的第一个元素
		  System.out.println("last:" + treeSet.last());//返回treeSet的最后一个元素
		  System.out.println("headset:" + treeSet.headSet("React Native"));//返回treeSet的React Native之前的元素，不包括React Native
		  System.out.println("tailset:" + treeSet.tailSet("React Native"));//返回treeSet的React Native之后的元素，包括React Native
		  System.out.println("lower:" + treeSet.lower("R"));//返回treeSet中小于‘R’的最大元素
		  System.out.println("high:" + treeSet.higher("R"));//返回treeSet中da于‘R’的最大元素（感觉包括等于？？?）
		  System.out.println("floor:" + treeSet.floor("R"));//返回treeSet中小于等于‘R’的最大元素
		  System.out.println("ceiling:" + treeSet.ceiling("R"));//返回treeSet中大于等于‘R’的最大元素
		  System.out.println("pollFirst:" + treeSet.pollFirst());//删除treeSet的第一个元素，并返回被删除的元素
		  System.out.println("pollLast:" + treeSet.pollLast());//删除treeSet的最后一个元素，并返回被删除的元素
	}

	protected static void stringTest() {
		String s1 = "abc";
		  String s2 = "ab" + "c";
		  String s3 = new String("abc");
		  String s4 = new String("abc");
		  String s5 = new String("cg");
		  String s6 = "cg";
		  String s7 = "ca";
		  String s8 = "ag";
		  String s9 = "ab";
		  System.out.println(s5.compareTo(s6));//compareTo 从左到右第一个不同的字符之间的距离
		  System.out.println(s5.compareTo(s7));
		  System.out.println(s5.compareTo(s8));
		  System.out.println(s5.compareTo(s9));

		  System.out.println(s1.intern());
		  System.out.println(s3.intern());
		  
		  Integer t1 = 128;
		  Integer t2 = 128;
		  Integer t3 = 129;
		  Integer t4 = 128 + 1;
		  Integer t5 = new Integer(123);
		  Integer t6 = new Integer(123);

		  t6.equals(t5);
		  System.out.println(s3 == s4);
		  System.out.println(s3.equals(s4));
	}

	protected static void linkedHashSet() {
		Set<String> set = new HashSet<String>();
		  set.add("Java");
		  set.add("HTML");
		  set.add("Javascript");
		  set.add("CSS");
		  set.add("React Native");
		  set.add("CSS");
		  
		  System.out.println("linkedHashSet:" + set);
		  
		  Iterator<String> iterator = set.iterator();//迭代器
		  
		  while (iterator.hasNext()) {
			  System.out.println(iterator.next());
		  }
	}

	protected static void hashSet() {
		Set<String> set = new HashSet<String>();
		  set.add("Java");
		  set.add("HTML");
		  set.add("Javascript");
		  set.add("CSS");
		  set.add("React Native");
		  set.add("CSS");
		  
		  System.out.println("hashSet:" + set);
		  
		  Iterator<String> iterator = set.iterator();//迭代器
		  
		  while (iterator.hasNext()) {
			  System.out.println(iterator.next());
		  }
		  
		  Set<String> set1 = new HashSet<String>();
		  set1.add("Java");
		  set1.add("C++");
		  set1.add("C#");
		  set1.add("CSS");
		  
		  System.out.println(set1);
		  
		  set.addAll(set1);
		  System.out.println(set);
		  
		  set.retainAll(set1);
		  System.out.println(set);//set中保留和set1中共有的元素
	}
}

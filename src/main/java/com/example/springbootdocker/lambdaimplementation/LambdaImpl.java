package com.example.springbootdocker.lambdaimplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaImpl {

	public static void main(String[] args) {
		
		List<Map<String,String>> collect = new ArrayList<>();
		
		Map<String, String> coll1 = new HashMap<String, String>();
		coll1.put("Amit", "course1");
		coll1.put("Ayush", "course2");
		coll1.put("New", "course1");
		coll1.put("Blus", "course2");
		coll1.put("Redis", "course2");
		
		Map<String, String> coll2 = new HashMap<String, String>();
		coll2.put("ghdhd", "course");
		coll2.put("dhhdk", "course1");
		coll2.put("qiudj", "course2");
		coll2.put("qoudi", "course1");
		coll2.put("oioqq", "course");
		
		collect.add(coll1);
		collect.add(coll2);	
		
		List<Map<String,String>> result = new ArrayList<>();
		
		
		result = collect.stream().map(
				i->{
					return i.entrySet().stream().filter(
							ent->ent.getValue().equals("course2")
						).collect(Collectors.toMap(ent->ent.getKey(), ent->ent.getValue()));
				}
		).collect(Collectors.toList());
		
		result.stream().forEach(
				(i)->{
					i.entrySet().stream().forEach(
							es->{
								System.out.println(es.getKey()+" : "+es.getValue());
							}
						);
				}
		);
		
	}
	
}

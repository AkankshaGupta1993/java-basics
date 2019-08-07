package com.concept.java_basics.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasicsImmutable {

	public static void main(String[] args) {

		Map<Key, String> map = new HashMap<>();
		Key key = new Key("BLR");
		
		System.out.println(key.hashCode());
		map.put(key, "Bangalore Airport");
	
		key.setKey("blr");
		System.out.println(key.hashCode());
		System.out.println(map.get(key));
		
		map.forEach((k, v) -> {
			System.out.println(k.getKey() + ":" + v);
		});
		
	}
}

class Key {
	
	Key (String key) {
		this.key = key;
	}
	
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}
	
	
}

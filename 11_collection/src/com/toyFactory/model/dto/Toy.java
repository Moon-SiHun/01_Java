package com.toyFactory.model.dto;

import java.util.Objects;
import java.util.Set;

public class Toy {
	
	// 필드
	
	private String name;
	private int age;
	private double price;
	private String color;
	private String since;
	private Set<String> material;
	
	public Toy() {}

	public Toy(String name, int age, int price, String color, String since, Set<String> material) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.since = since;
		this.material = material;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSince() {
		return since;
	}

	public void setSince(String since) {
		this.since = since;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Toy [name=" + name + ", age=" + age + ", price=" + price + ", color=" + color + ", since=" + since
				+ ", material=" + material + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, color, material, name, price, since);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(material, other.material)
				&& Objects.equals(name, other.name) && price == other.price && Objects.equals(since, other.since);
	}
	
	
	

}

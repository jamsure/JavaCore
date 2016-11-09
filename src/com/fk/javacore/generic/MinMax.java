package com.fk.javacore.generic;

interface MinMax<T extends Comparable<T>> {
	T min();

	T max();
}

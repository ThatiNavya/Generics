package com.typesafty;

public class Test6 {

	public static void main(String[] args) {

		Integer[] a = { 25, 30, 64, 32, 81, 60 };

		Character[] c = { 'n', 'p', 'c', 'm', 'g', 'h', 'l' };

		String[] s = { "Navya", "Jyothsna", "Srilatha", "Shiva", "Nanditha", "Karthika", "Anusha" };

		System.out.print("Sorted Integer array : ");
		sort_generics(a);

		System.out.print("Sorted Character array : ");
		sort_generics(c);

		System.out.print("Sorted String array : ");
		sort_generics(s);

	}

	public static <T extends Comparable<T>> void sort_generics(T[] a) {


		
		for (int i = 0; i < a.length - 1; i++) {

			for (int j = 0; j < a.length - i - 1; j++) {

				if (a[j].compareTo(a[j + 1]) > 0) {

					swap(j, j + 1, a);
				}
			}
		}

		for (T i : a) {
			System.out.print(i + ", ");
		}
		System.out.println();

	}

	public static <T> void swap(int i, int j, T[] a) {
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

}

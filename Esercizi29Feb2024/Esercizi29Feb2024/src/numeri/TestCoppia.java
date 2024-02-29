package numeri;

import java.util.*;

public class TestCoppia {

	public static void main(String[] args) {
		
		Coppia<Object> testCoppia = new Coppia<Object>();
		CoppiaMista<Object, Object> testCoppiaMista = new CoppiaMista<Object, Object>();
		
		System.out.println("TEST COPPIA1");
		
		testCoppia.setGenerics(1,"ciao");
		System.out.println(testCoppia.getUno());
		System.out.println(testCoppia.getDue());
		
		System.out.println("TEST COPPIA2");
		testCoppia.setGenerics("CIAO",1);
		System.out.println(testCoppia.getUno());
		System.out.println(testCoppia.getDue());
		
		
		
		System.out.println("TEST COPPIA3");
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add("ciao sono Un arrayList");
		arrayList.add(4);
		
		testCoppia.setGenerics(arrayList,3);
		System.out.println(testCoppia.getUno());
		System.out.println(testCoppia.getDue());
		
		System.out.println("TEST COPPIAMISTA1");
		testCoppiaMista.setGenericsMista(3,"ciao");
		System.out.println(testCoppiaMista.getUnoMista());
		System.out.println(testCoppiaMista.getDueMista());
		
		System.out.println("TEST COPPIAMISTA2");
		testCoppiaMista.setGenericsMista("Hello",3);
		System.out.println(testCoppiaMista.getUnoMista());
		System.out.println(testCoppiaMista.getDueMista());
		System.out.println("TEST COPPIAMISTA3");
		HashMap<Object, Object> hashMap = new HashMap<>();
		hashMap.put("1", 3);
		hashMap.put("Hello", "World");
		
		testCoppiaMista.setGenericsMista(hashMap,arrayList);
		System.out.println(testCoppiaMista.getUnoMista());
		System.out.println(testCoppiaMista.getDueMista());
		
	}
	
}

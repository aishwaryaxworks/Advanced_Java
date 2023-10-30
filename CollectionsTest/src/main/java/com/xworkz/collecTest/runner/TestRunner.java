package com.xworkz.collecTest.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.xworkz.collecTest.dto.AddressDTO;
import com.xworkz.collecTest.dto.BrandDTO;
import com.xworkz.collecTest.dto.ProductDTO;
import com.xworkz.collecTest.enums.Type;

public class TestRunner {

	public static void main(String[] args) {
		AddressDTO add1 = new AddressDTO(1, 24, "Kanakapura main road", "Bangalore", "Karnataka", 560078);
		AddressDTO add2 = new AddressDTO(2, 25, "Amrutnagar", "Bangalore", "Karnataka", 560058);
		AddressDTO add3 = new AddressDTO(3, 26, "Doddakallasandra", "Bangalore", "Karnataka", 560041);
		AddressDTO add4 = new AddressDTO(4, 27, "Vijayanagar", "Mysore", "Karnataka", 520078);
		AddressDTO add5 = new AddressDTO(5, 28, "Ernakulam", "Kochi", "Kerala", 615628);
		AddressDTO add6 = new AddressDTO(6, 29, "Via Acqasanta", "L'Aquila", "Abruzzo", 67100);
		AddressDTO add7 = new AddressDTO(7, 30, "Deepanjali nagar", "Delhi", "New Delhi", 845621);
		AddressDTO add8 = new AddressDTO(8, 31, "Gandhi nagar", "Mumbai", "Maharashtra", 000123);
		AddressDTO add9 = new AddressDTO(9, 32, "Nehru road", "Kolkata", "West Bengal", 616256);
		AddressDTO add10 = new AddressDTO(10, 33, "Rajkumar road", "Chennai", "Tamil Nadu", 871321);

		BrandDTO br1 = new BrandDTO(1, "Prestige", 98712304613L, add1, 1900);
		BrandDTO br2 = new BrandDTO(2, "Pigeon", 12342304613L, add2, 1900);
		BrandDTO br3 = new BrandDTO(3, "Lakme", 98715213613L, add3, 1900);
		BrandDTO br4 = new BrandDTO(4, "SRS", 9865168453L, add4, 1900);
		BrandDTO br5 = new BrandDTO(5, "Philips", 78965404613L, add5, 1900);
		BrandDTO br6 = new BrandDTO(6, "Prestige", 69874504613L, add6, 1900);
		BrandDTO br7 = new BrandDTO(7, "Pigeon", 9871256413L, add7, 1900);
		BrandDTO br8 = new BrandDTO(8, "Maybelline", 98745632113L, add8, 1900);
		BrandDTO br9 = new BrandDTO(9, "Mahindra", 978965154613L, add9, 1900);
		BrandDTO br10 = new BrandDTO(10, "Tata", 987159357613L, add10, 1900);

		ProductDTO prd1 = new ProductDTO(1, "Cooker", Type.KITCHEN_APPLIANTS, br1, 250.9, 2);
		ProductDTO prd2 = new ProductDTO(2, "Pan", Type.KITCHEN_APPLIANTS, br2, 300.9, 2);
		ProductDTO prd3 = new ProductDTO(3, "Sunscreen", Type.BEAUTY, br3, 255.9, 1);
		ProductDTO prd4 = new ProductDTO(4, "Bus", Type.TRAVEL, br4, 25000.0, 3);
		ProductDTO prd5 = new ProductDTO(5, "Hair dryer", Type.ELECTRONIC, br5, 2500.0, 3);
		ProductDTO prd6 = new ProductDTO(6, "Tawa", Type.KITCHEN_APPLIANTS, br6, 250.0, 5);
		ProductDTO prd7 = new ProductDTO(7, "Milk pan", Type.KITCHEN_APPLIANTS, br7, 400.0, 5);
		ProductDTO prd8 = new ProductDTO(8, "Mascara", Type.BEAUTY, br8, 350.0, 2);
		ProductDTO prd9 = new ProductDTO(9, "Tractor", Type.TRAVEL, br9, 30000.0, 7);
		ProductDTO prd10 = new ProductDTO(10, "SUV car", Type.TRAVEL, br10, 40000.0, 2);

		Collection<ProductDTO> prColl = new HashSet<ProductDTO>();
		prColl.add(prd1);
		prColl.add(prd2);
		prColl.add(prd3);
		prColl.add(prd4);
		prColl.add(prd5);
		prColl.add(prd6);
		prColl.add(prd7);
		prColl.add(prd8);
		prColl.add(prd9);
		prColl.add(prd10);

		// product dto by pincode
		List<ProductDTO> prByPin = prColl.stream().filter(p -> p.getBrand().getAddress().getPincode() == 000123)
				.collect(Collectors.toList());
		prByPin.forEach(p -> System.out.println(p));
		System.out.println("------------------------------------------------------");

		// address dto by product name
		Collection<AddressDTO> adByName = prColl.stream().sorted((p1, p2) -> p2.getId().compareTo(p1.getId()))
				.filter(p -> p.getName().equals("Cooker")).map(a -> a.getBrand().getAddress())
				.collect(Collectors.toList());
		adByName.forEach(a -> System.out.println(a));
		System.out.println("------------------------------------------------------");
//2,4,6,7,9,11,67,9,7---> filter:>7: 9,11,67,9: : map : L 
		//--> map
		// brandDTO by product dto
		Collection<BrandDTO> brByPr = prColl.stream().filter(p -> p == prd10).map(b -> b.getBrand())
				.collect(Collectors.toList());
		brByPr.forEach(b -> System.out.println(b));
		System.out.println("------------------------------------------------------");

		// address dto by brand dto
		Collection<AddressDTO> adByBr = prColl.stream().filter(f -> f.getBrand() == br4)
				.map(m -> m.getBrand().getAddress()).collect(Collectors.toList());
		adByBr.forEach(a -> System.out.println(a));
		System.out.println("------------------------------------------------------");

		// all products by max price
		Optional<ProductDTO> prdto = prColl.stream().max((m1, m2) -> m2.getPrice().compareTo(m1.getPrice()));
		prdto.ifPresent(p -> System.out.println(p));
		
		System.out.println("------------------------------------------------------");

		// all product dto by type, sort by price in desc
		List<ProductDTO> prByPrice = prColl.stream().filter(f -> f.getType().equals(Type.KITCHEN_APPLIANTS))
				.sorted((p1, p2) -> p2.getPrice().compareTo(p1.getPrice())).collect(Collectors.toList());
		prByPrice.forEach(p -> System.out.println(p));
		System.out.println("------------------------------------------------------");
		
		//all products in desc of quantity
		List<ProductDTO> prByQuant = prColl.stream()
				.sorted((q1,q2) -> q2.getQuantity().compareTo(q1.getQuantity()))
				.collect(Collectors.toList());
		prByQuant.forEach(p -> System.out.println(p));
		System.out.println("------------------------------------------------------");
		
//		//List Iterator and Iterator
//		List<ProductDTO> pdtoAll = prColl.stream().collect(Collectors.toList());
//		Iterator<ProductDTO> itr = pdtoAll.iterator();
//		while(itr.hasNext()) {
//			ProductDTO p = itr.next();
//			System.out.println("Product dto using Iterator:---->>>");
//			System.out.println(p);
//			if(itr.equals(prd4)) {
//				itr.remove();
//			}
//		}
//		
//		ListIterator<ProductDTO> listItr = pdtoAll.listIterator();
//		while(listItr.hasNext()) {
//			ProductDTO p1 = listItr.next();
//			System.out.println("List iterator next fuction:--->"+p1);
//			ProductDTO p2 = listItr.previous();
//			System.out.println("List iterator prev funct:---->"+p2);
//			if(listItr.equals(prd8)) {
//				listItr.add(prd9);
//				listItr.remove();
//			}
//		}
		
	}

}

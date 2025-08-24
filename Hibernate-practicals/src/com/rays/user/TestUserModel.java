package com.rays.user;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.rays.crud.UserDTO;

public class TestUserModel {

	public static void main(String[] args) {
//	 testAdd();
//	 testUpdate();
	 testDelete();
//		 testGet();
//	testAuth();
//		testSearch();

	}

	private static void testSearch() {
		
		UserDTO dto = new UserDTO();

		UserModel model = new UserModel();
		
		List list = model.search(dto, 1, 3);
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) {

			dto = (UserDTO) it.next();

			System.out.print(dto.getId());
			System.out.print("\t" + dto.getFirstName());
			System.out.print("\t" + dto.getLastName());
			System.out.print("\t" + dto.getLoginId());
			System.out.print("\t" + dto.getPassword());
			System.out.print("\t" + dto.getDob());
			System.out.println("\t" + dto.getAddress());
		}
		
	}

	private static void testAuth() {
		UserModel model = new UserModel();

		UserDTO dto = model.authenticate("amitkirar11@gmai.com", "amit1122");

		if (dto != null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLoginId());
			System.out.println(dto.getPassword());
			System.out.println(dto.getDob());
			System.out.println(dto.getAddress());
		} else {
			System.out.println("Authentication failed..!!");
		}

	}

	private static void testGet() {
		UserModel model = new UserModel();
		UserDTO dto = model.findByPk(1);

		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLoginId());
		System.out.println(dto.getPassword());
		System.out.println(dto.getDob());
		System.out.println(dto.getAddress());

	}

	private static void testDelete() {
		UserDTO dto = new UserDTO();
		dto.setId(2);
		UserModel model = new UserModel();
		model.delete(dto);

	}

	private static void testAdd() {
		UserDTO dto = new UserDTO();

		dto.setFirstName("akbar");
		dto.setLastName("khan");
		dto.setLoginId("akbar111@gmail.com");
		dto.setPassword("2222");
		dto.setDob(new Date());
		dto.setAddress("indore");

		UserModel model = new UserModel();
		model.add(dto);

	}

	private static void testUpdate() {

		UserDTO dto = new UserDTO();

		dto.setId(1);
		dto.setFirstName("shad");
		dto.setLastName("phatan");
		dto.setLoginId("shad111@gmail.com");
		dto.setPassword("2222");
		dto.setDob(new Date());
		dto.setAddress("shajapur");

		UserModel model = new UserModel();
		model.update(dto);

	}

}

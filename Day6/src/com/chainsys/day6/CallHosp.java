package com.chainsys.day6;

import java.util.*;

public class CallHosp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Hospital hp = new Hospital();

		String hospId1;
		String hospName1;
		String hospLocation1;
		String patientName;
		int patientID;

		String regex = "[a-zA-Z]{1,10}";
		String regex1 = "[0-9]{1,4}";

		System.out.println("Ener the Hospital ID:");
		hospId1 = input.next();
		while (!hospId1.matches(regex1)) {
			System.out.println("Enter the VALID  ID:");
			hospId1 = input.next();

		}

		System.out.println("Enter the Hospital Name:");
		hospName1 = input.next();
		while (!hospName1.matches(regex)) {
			System.out.println("Enter the VALID  NAME:");
			hospName1 = input.next();

		}

		System.out.println("Ener the Hospital Location:");
		hospLocation1 = input.next();
		while (!hospLocation1.matches(regex)) {
			System.out.println("Enter the VALID  NAME:");
			hospLocation1 = input.next();

		}

		System.out.println("Ener the Patient Name:");
		patientName = input.next();
		while (!patientName.matches(regex)) {
			System.out.println("Enter the VALID  NAME:");
			patientName = input.next();

		}

		System.out.println("Ener the Patient's ID:");
		patientID = input.nextInt();
		while(patientID<0) {
			System.out.println("Enter the VALID ID");
			patientID = input.nextInt();
		}

		hp.setHospId(hospId1);
		hp.setHospName(hospName1);
		hp.setHospLocation(hospLocation1);
		hp.setPatientName(patientName);
		hp.setPatientID(patientID);

		HospData hospdata = new HospData();
		hospdata.details(hospName1, hospLocation1);
		hospdata.details(patientName, patientID);

//		
//		System.out.println("Hospital ID: " + hp.getHospId());
//		System.out.println("Hospital Name: "+hp.getHospName());
//		System.out.println("Hospital Location: " + hp.getHospLocation());
		System.out.println(hp.toString());
		
		input.close();

	}

}

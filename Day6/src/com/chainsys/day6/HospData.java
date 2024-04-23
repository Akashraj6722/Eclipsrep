package com.chainsys.day6;

 class HospData implements HospMethod{

		@Override
		public void details(String hospName, String location) {
			System.out.println("Ward are available in ENTERED location\n ");
		}

		@Override
		public void details(String patientName, int patientID) {
			System.out.println("Cancer patient\n");
			
		}

 }



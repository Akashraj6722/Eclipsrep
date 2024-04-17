package com.chainsys.day6;

public class Hospital {


 
		String hospName;
		int hospId;
		String hospLocation;
		
		public String getHospName() {
			return hospName;
			
		}
		
		public void setHospName(String hospName) {
			this.hospName = hospName;
		}
		public int getHospId() {
			return hospId;
		}
		public void setHospId(int hospId) {
			this.hospId = hospId;
		}
		public String getHospLocation() {
			return hospLocation;
		}
		public void setHospLocation(String hospLocation) {
			this.hospLocation = hospLocation;
		}
		
		
		

	

		

		public Hospital(String hospName, int hospId, String hospLocation) {
		
			this.hospName = hospName;
			this.hospId = hospId;
			this.hospLocation = hospLocation;		}

		public Hospital() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Hospital [hospName=" + hospName + ", hospId=" + hospId + ", hospLocation=" + hospLocation + "]";
		}
		
		
		
		
		
		
	}



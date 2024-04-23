package com.chainsys.day6;

public class Hospital {


 
		String hospName;
		String hospId;
		String hospLocation;
		String patientName;
		int patientID;
		
		public String getHospName() {
			return hospName;
			
		}
		
		public void setHospName(String hospName) {
			this.hospName = hospName;
		}
		public String getHospId() {
			return hospId;
		}
		public void setHospId(String hospId) {
			this.hospId = hospId;
		}
		public String getHospLocation() {
			return hospLocation;
		}
		public void setHospLocation(String hospLocation) {
			this.hospLocation = hospLocation;
		}
		
		
		public String getPatientName() {
			return patientName;
		}

		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}

		public int getPatientID() {
			return patientID;
		}

		public void setPatientID(int patientID2) {
			this.patientID = patientID2;
		}

		public Hospital(String hospName, String hospId, String hospLocation, int patientID, String patientName) {
		
			this.hospName = hospName;
			this.hospId = hospId;
			this.hospLocation = hospLocation;	
			this.patientID=patientID;
			this.patientName=patientName;
			
			}

		public Hospital() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Hospital [hospName=" + hospName + ", hospId=" + hospId + ", hospLocation=" + hospLocation
					+ ", patientName=" + patientName + ", patientID=" + patientID + "]";
		}

		
		
		
		
		
		
		
		
	}



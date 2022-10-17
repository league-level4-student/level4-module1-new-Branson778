package _06_Hospital;

import java.util.List;

public abstract class Doctor {
	protected List<Patient> listp;
	public abstract List<Patient> getPatients();
    Doctor(){
    	
    }
	public abstract void assignPatient(Patient patient) throws DoctorFullException;
	public abstract Patient getPatient(int index);
	public abstract boolean performsSurgery();
	public abstract boolean makesHouseCalls();

	public abstract void doMedicine();

}

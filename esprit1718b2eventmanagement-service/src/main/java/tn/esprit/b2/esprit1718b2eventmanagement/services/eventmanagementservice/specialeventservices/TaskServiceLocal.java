package tn.esprit.b2.esprit1718b2eventmanagement.services.eventmanagementservice.specialeventservices;

import javax.ejb.Local;

import tn.esprit.b2.esprit1718b2eventmanagement.entities.Task;
import tn.esprit.b2.esprit1718b2eventmanagement.utilities.IGenericDAO;

@Local
public interface TaskServiceLocal extends IGenericDAO<Task> {

}

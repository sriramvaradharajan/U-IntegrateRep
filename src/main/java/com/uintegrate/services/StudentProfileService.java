/**
 * 
 */
package com.uintegrate.services;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.uintegrate.entities.StudentProfile;

/**
 * @author svaradharajan
 * This is the REST service that deals with Student Profile activities . 
 */
@Path("/StudentProfile")
public class StudentProfileService {

	@GET
	@Path("/GetProfile/{profileId}")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<StudentProfile> getStudentProfile(@PathParam("profileId") int profileId) {
		StudentProfile profile = new StudentProfile();
		profile.setStudentProfileId(profileId);
		profile.setFirstName("Test");
		profile.setLastName("Test1");
		StudentProfile profile1 = new StudentProfile();
		profile1.setStudentProfileId(profileId);
		profile1.setFirstName("Test111");
		profile1.setLastName("Test1111");
		ArrayList<StudentProfile> studentProfiles = new ArrayList<StudentProfile>();
		studentProfiles.add(profile);
		studentProfiles.add(profile1);
		return studentProfiles;
	}
	
	@GET
	@Path("/GetProfiles")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<StudentProfile> getStudentProfile() {
		StudentProfile profile = new StudentProfile();
		profile.setStudentProfileId(1);
		profile.setFirstName("Test1");
		profile.setLastName("Test1");
		StudentProfile profile1 = new StudentProfile();
		profile1.setStudentProfileId(2);
		profile1.setFirstName("Test2");
		profile1.setLastName("Test2");
		ArrayList<StudentProfile> studentProfiles = new ArrayList<StudentProfile>();
		studentProfiles.add(profile);
		studentProfiles.add(profile1);
		return studentProfiles;
	}
	
}

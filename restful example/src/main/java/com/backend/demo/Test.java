package com.backend.demo;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Course;
import model.CourseDAO;
import model.CourseDAOImpl;

@Path("course")
public class Test {
	
	CourseDAO cd= new CourseDAOImpl();
	@Path("all")
	@GET
    @Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public List<Course> all(){
		List<Course> cl=cd.availableCourses();
		return cl;
	}
	
	@Path("{search}")
	@GET
    @Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public List<Course> searchall(@FormParam("second") int id){
		List<Course> sl= cd.fetchCourse(id);
		return sl;
	}
}

package com.jpa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jpa.dao.UserRepository;
import com.jpa.entities.User;



@Controller
public class UserController {

	@Autowired
	public UserRepository userRepository;
	
	@GetMapping("/users")
	@ResponseBody
	public String getAllUsers() {
        StringBuilder htmlContent = new StringBuilder();
        htmlContent.append("<body>");
        htmlContent.append("<h1>User List</h1>");
        htmlContent.append("<table>");
        htmlContent.append("<tr>");
        htmlContent.append("<th>ID</th>");
        htmlContent.append("<th>Name</th>");
        htmlContent.append("<th>City</th>");
        htmlContent.append("<th>Status</th>");
        htmlContent.append("</tr>");

	
        Iterable<User> users = userRepository.findAll();
        for (User user : users) {
            htmlContent.append("<tr>");
            htmlContent.append("<td>").append(user.getId()).append("</td>");
            htmlContent.append("<td>").append(user.getName()).append("</td>");
            htmlContent.append("<td>").append(user.getCity()).append("</td>");
            htmlContent.append("<td>").append(user.getStatus()).append("</td>");
            htmlContent.append("</tr>");
        }

        htmlContent.append("</table>");
        htmlContent.append("</body>");
        htmlContent.append("</html>");

        return htmlContent.toString();
        
	}
	
	
}

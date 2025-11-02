package com.mangement.Student.Management.Controller;

import com.mangement.Student.Management.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

@Controller
public class RegisterController {

    // ✅ Temporary in-memory storage for registered students
    private static final Map<String, String> registeredUsers = new ConcurrentHashMap<>();

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("student", new Student());
        return "register";  // loads register.html
    }

    @PostMapping("/register")
    public String registerStudent(@ModelAttribute("student") Student student, Model model) {

        // Save username & password temporarily
        registeredUsers.put(student.getUsername(), student.getPassword());

        System.out.println("===== Student Registered =====");
        System.out.println("Name: " + student.getFullName());
        System.out.println("Gender: " + student.getGender());
        System.out.println("DOB: " + student.getDateOfBirth());
        System.out.println("Phone: " + student.getPhone());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("Year: " + student.getYear());
        System.out.println("Semester: " + student.getSemester());
        System.out.println("Username: " + student.getUsername());
        System.out.println("Password: " + student.getPassword());

        // Show message and redirect to login page
        model.addAttribute("message", "✅ Registration successful! Please log in.");
        return "redirect:/login";
    }

    // ✅ Public method for login controller to validate credentials
    public static boolean validateUser(String username, String password) {
        return registeredUsers.containsKey(username) &&
                registeredUsers.get(username).equals(password);
    }
}

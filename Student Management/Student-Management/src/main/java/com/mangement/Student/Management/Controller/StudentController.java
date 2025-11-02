package com.mangement.Student.Management.Controller;

import com.mangement.Student.Management.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    // ❌ Commented out old register methods to avoid conflict
    /*
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("student", new Student());
        return "register";
    }

    @PostMapping("/register")
    public String registerStudent(@ModelAttribute("student") Student student, Model model) {
        System.out.println("===== Student Registration Data =====");
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

        model.addAttribute("message", "✅ Student registered successfully!");
        return "register";
    }
    */

    // You can keep other Student-related mappings here (e.g., /students, /view, etc.)
}

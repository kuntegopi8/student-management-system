package com.mangement.Student.Management.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// This controller handles login page display and form submission
@Controller
public class LoginController {

    // 🟢 Display login page
    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // Opens login.html
    }

    // 🟢 Handle login form submission
    @PostMapping("/login")
    public String processLogin(@RequestParam("username") String username,
                               @RequestParam("password") String password,
                               Model model) {

        // ✅ Replace this logic with your database or service layer check later
        // For now, using demo static check
        if ("admin".equals(username) && "12345".equals(password)) {
            // Redirect to dashboard after successful login
            return "redirect:/dashboard";
        } else {
            // Add an error message if credentials are invalid
            model.addAttribute("error", "Invalid username or password. Please try again.");
            return "login"; // Stay on same page
        }
    }
}

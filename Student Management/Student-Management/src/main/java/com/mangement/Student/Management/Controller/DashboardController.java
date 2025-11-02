package com.mangement.Student.Management.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    // Opens dashboard page
    @GetMapping("/dashboard")
    public String showDashboard() {
        return "dashboard";  // dashboard.html
    }
}

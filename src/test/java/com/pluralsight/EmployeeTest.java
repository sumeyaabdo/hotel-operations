package com.pluralsight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchInAndOut_shouldCalculateEightHours() {
        // Arrange
        Employee employee = new Employee("101", "John", "Front Desk", 20.00, 0);

        // Act
        employee.punchIn(9);
        employee.punchOut(17);

        // Assert
        assertEquals(8.0, employee.getHoursWorked());
    }

    @Test
    void punchInAndOut_shouldCalculateFourHours() {
        // Arrange
        Employee employee = new Employee("102", "Sara", "Housekeeping", 18.00, 0);

        // Act
        employee.punchIn(8);
        employee.punchOut(12);

        // Assert
        assertEquals(4.0, employee.getHoursWorked());
    }

    @Test
    void punchInAndOut_shouldAddHoursWorked() {
        // Arrange
        Employee employee = new Employee("103", "Alex", "Security", 22.00, 5);

        // Act
        employee.punchIn(9);
        employee.punchOut(17);

        // Assert
        assertEquals(13.0, employee.getHoursWorked());
    }
}
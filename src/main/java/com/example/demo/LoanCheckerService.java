package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LoanCheckerService {
    public ResponseEntity loanChecker(RequestEntity request) {
        ResponseEntity response = new ResponseEntity();
        
        double wage = request.getWage();
        int age = request.getAge();
        String location = request.getLocation();
        List<Loan> typesAllowed = new ArrayList<>();

        
        if(wage <= 3000 || (wage > 3000 && wage < 5000 && age < 30 && location.equals("SP"))){
            Loan personal = new Loan();
            personal.setType("PERSONAL");
            personal.setInterest_rate(4);
            typesAllowed.add(personal);

            Loan guaranteed = new Loan();
            guaranteed.setType("GUARANTEED");
            guaranteed.setInterest_rate(3);
            typesAllowed.add(guaranteed);
        }

        if(wage >= 5000){
            Loan consignment = new Loan();
            consignment.setType("CONSIGNMENT");
            consignment.setInterest_rate(2);
            typesAllowed.add(consignment);
        }
        
        response.setName(request.getName());
        response.setTypesAllowed(typesAllowed);

        return response;
    }
}

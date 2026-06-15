package com.example.frontendbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CalcController {

    @GetMapping("/calc/add/{n1}/{n2}")
    public String SayAdd(@PathVariable int n1, @PathVariable int n2) {
        int res = n1 + n2;
        return "Addition is : " + res;
    }

    @GetMapping("/calc/sub/{n1}/{n2}")
    public String SaySub(@PathVariable int n1, @PathVariable int n2) {
        int res = n1 - n2;
        return "Difference is : " + res;
    }

    @GetMapping("/calc/mul/{n1}/{n2}")
    public String SayMul(@PathVariable int n1, @PathVariable int n2) {
        int res = n1 * n2;
        return "Product is : " + res;
    }

    @GetMapping("/calc/quo/{n1}/{n2}")
    public String SayQuo(@PathVariable int n1, @PathVariable int n2) {
        double res = (double) n1 / n2;
        return "Quotient is : " + res;
    }

    @GetMapping("/calc/rem/{n1}/{n2}")
    public String SayRem(@PathVariable int n1, @PathVariable int n2) {
        int res = n1 % n2;
        return "Remainder is : " + res;
    }

    @GetMapping("/calc/log/{n1}")
    public String SayLog(@PathVariable int n1) {
        double logans = Math.log(n1);
        return "Log is : " + logans;
    }

    @GetMapping("/calc/sin/{n1}")
    public String SaySin(@PathVariable int n1) {
        double angle = Math.toRadians(n1);
        double res = Math.sin(angle);
        return String.format("Sin is : %.2f", res);
    }

    @GetMapping("/calc/cos/{n1}")
    public String SayCos(@PathVariable int n1) {
        double angle = Math.toRadians(n1);
        double res = Math.cos(angle);
        return String.format("Cos is : %.2f", res);
    }

    @GetMapping("/calc/tan/{n1}")
    public String SayTan(@PathVariable int n1) {
        double angle = Math.toRadians(n1);
        double res = Math.tan(angle);
        return String.format("Tan is : %.2f", res);
    }

    @GetMapping("/calc/spiral")
    public ArrayList<Integer> spiralMatrix() {

        int[][] matrix = {
                {1, 2, 3},
                {4, 15, 6},
                {7, 8, 9}
        };

        ArrayList<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
package com.cck.Spring_Ecommerce_API.controller;

import com.cck.Spring_Ecommerce_API.entity.Coupon;
import com.cck.Spring_Ecommerce_API.exceptions.ValidationException;
import com.cck.Spring_Ecommerce_API.services.admin.coupon.AdminCouponService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/coupons")
@RequiredArgsConstructor
public class AdminCouponController {

    @Autowired
    private final AdminCouponService adminCouponService;


    @PostMapping
    public ResponseEntity<?> createCoupon(@RequestBody Coupon coupon){
        try{
            Coupon createdCoupon = adminCouponService.createCoupon(coupon);
            return ResponseEntity.ok(createdCoupon);
        }catch(ValidationException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());

        }
    }

    @GetMapping
    public ResponseEntity<List<Coupon>> getAllCoupons(){
       return ResponseEntity.ok(adminCouponService.getAllCoupons());
    }
}

package com.cck.Spring_Ecommerce_API.services.admin.coupon;

import com.cck.Spring_Ecommerce_API.entity.Coupon;

import java.util.List;

public interface AdminCouponService {

    Coupon createCoupon(Coupon coupon);
     List<Coupon> getAllCoupons();
}

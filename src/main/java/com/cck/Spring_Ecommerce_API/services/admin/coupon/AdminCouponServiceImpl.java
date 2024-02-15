package com.cck.Spring_Ecommerce_API.services.admin.coupon;

import com.cck.Spring_Ecommerce_API.entity.Coupon;
import com.cck.Spring_Ecommerce_API.exceptions.ValidationException;
import com.cck.Spring_Ecommerce_API.repository.CouponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminCouponServiceImpl implements AdminCouponService{


  private final CouponRepository couponRepository;

  public Coupon createCoupon(Coupon coupon){
    if(couponRepository.existsByCode(coupon.getCode())){
      throw new ValidationException("Coupon code already exists .");
    }
    return couponRepository.save(coupon);

  }

  public List<Coupon> getAllCoupons(){
    return couponRepository.findAll();
  }


}

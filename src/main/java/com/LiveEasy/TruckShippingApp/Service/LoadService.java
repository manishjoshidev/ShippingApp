package com.LiveEasy.TruckShippingApp.Service;

import java.util.List;

import com.LiveEasy.TruckShippingApp.Entity.PayLoadEntity;

public interface LoadService {
	List<PayLoadEntity> getLoads();
	PayLoadEntity getLoadByShipperId(long shipperId);
	PayLoadEntity addLoad(PayLoadEntity payloadEntity);
}

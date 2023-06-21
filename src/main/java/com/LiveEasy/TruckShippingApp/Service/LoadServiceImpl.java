package com.LiveEasy.TruckShippingApp.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.LiveEasy.TruckShippingApp.Entity.PayLoadEntity;

@Service
public class LoadServiceImpl implements LoadService {
	
	List<PayLoadEntity> list;
	
	public LoadServiceImpl() {
		list = new ArrayList<>();
		list.add(new PayLoadEntity(121, "Delhi", "Dehradun", "Drugs", "Dumper", 5, 5000));
	}

	@Override
	public List<PayLoadEntity> getLoads() {
		return list;
	}

	@Override
	public PayLoadEntity getLoadByShipperId(long shipperId) {
		for (PayLoadEntity payload : list) {
			if (payload.getId() == shipperId) {
				return payload;
			}
		}
		return null;
	}

	@Override
	public PayLoadEntity addLoad(PayLoadEntity payloadEntity) {
		list.add(payloadEntity);
		return payloadEntity;
	}

}

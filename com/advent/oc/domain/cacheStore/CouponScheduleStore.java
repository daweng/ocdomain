package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.security.CouponSchedule;
import com.advent.oc.domain.entry.CouponScheduleEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class CouponScheduleStore extends AbstractHibernateBlobStore<UUID, CouponSchedule, CouponScheduleEntry> {
}

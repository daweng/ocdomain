package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.security.CallPutSchedule;
import com.advent.oc.domain.entry.CallPutScheduleEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class CallPutScheduleStore extends AbstractHibernateBlobStore<UUID, CallPutSchedule, CallPutScheduleEntry> {
}

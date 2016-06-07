package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.security.VariableRateSchedule;
import com.advent.oc.domain.entry.VariableRateScheduleEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class VariableRateScheduleStore extends AbstractHibernateBlobStore<UUID, VariableRateSchedule, VariableRateScheduleEntry> {
}

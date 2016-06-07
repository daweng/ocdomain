package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.core.BusinessCalendar;
import com.advent.oc.domain.entry.BusinessCalendarEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class BusinessCalendarStore extends AbstractHibernateBlobStore<UUID, BusinessCalendar, BusinessCalendarEntry> {
}

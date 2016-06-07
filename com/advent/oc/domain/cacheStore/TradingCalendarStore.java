package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.marketdata.TradingCalendar;
import com.advent.oc.domain.entry.TradingCalendarEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class TradingCalendarStore extends AbstractHibernateBlobStore<UUID, TradingCalendar, TradingCalendarEntry> {
}

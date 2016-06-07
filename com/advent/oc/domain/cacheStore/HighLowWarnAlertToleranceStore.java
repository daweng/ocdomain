package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.model.HighLowWarnAlertTolerance;
import com.advent.oc.domain.entry.HighLowWarnAlertToleranceEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class HighLowWarnAlertToleranceStore extends AbstractHibernateBlobStore<UUID, HighLowWarnAlertTolerance, HighLowWarnAlertToleranceEntry> {
}

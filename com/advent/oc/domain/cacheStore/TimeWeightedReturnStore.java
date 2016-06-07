package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.transaction.calc.TimeWeightedReturn;
import com.advent.oc.domain.entry.TimeWeightedReturnEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class TimeWeightedReturnStore extends AbstractHibernateBlobStore<UUID, TimeWeightedReturn, TimeWeightedReturnEntry> {
}

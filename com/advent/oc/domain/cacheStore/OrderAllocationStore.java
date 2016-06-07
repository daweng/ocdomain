package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.order.OrderAllocation;
import com.advent.oc.domain.entry.OrderAllocationEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class OrderAllocationStore extends AbstractHibernateBlobStore<UUID, OrderAllocation, OrderAllocationEntry> {
}

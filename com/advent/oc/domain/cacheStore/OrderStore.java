package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.order.Order;
import com.advent.oc.domain.entry.OrderEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class OrderStore extends AbstractHibernateBlobStore<UUID, Order, OrderEntry> {
}

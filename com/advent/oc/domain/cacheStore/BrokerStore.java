package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.legalentity.Broker;
import com.advent.oc.domain.entry.BrokerEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class BrokerStore extends AbstractHibernateBlobStore<UUID, Broker, BrokerEntry> {
}

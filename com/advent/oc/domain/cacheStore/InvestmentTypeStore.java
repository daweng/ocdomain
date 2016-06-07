package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.security.InvestmentType;
import com.advent.oc.domain.entry.InvestmentTypeEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class InvestmentTypeStore extends AbstractHibernateBlobStore<UUID, InvestmentType, InvestmentTypeEntry> {
}

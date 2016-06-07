package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.account.Portfolio;
import com.advent.oc.domain.entry.PortfolioEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class PortfolioStore extends AbstractHibernateBlobStore<UUID, Portfolio, PortfolioEntry> {
}

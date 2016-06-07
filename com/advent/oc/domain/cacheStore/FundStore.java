package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.security.Fund;
import com.advent.oc.domain.entry.FundEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class FundStore extends AbstractHibernateBlobStore<UUID, Fund, FundEntry> {
}

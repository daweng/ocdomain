package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.core.Country;
import com.advent.oc.domain.entry.CountryEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class CountryStore extends AbstractHibernateBlobStore<UUID, Country, CountryEntry> {
}

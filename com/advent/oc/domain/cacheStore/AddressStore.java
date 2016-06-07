package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.core.Address;
import com.advent.oc.domain.entry.AddressEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class AddressStore extends AbstractHibernateBlobStore<UUID, Address, AddressEntry> {
}

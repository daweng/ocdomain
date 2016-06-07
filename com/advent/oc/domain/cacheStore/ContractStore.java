package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.security.Contract;
import com.advent.oc.domain.entry.ContractEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class ContractStore extends AbstractHibernateBlobStore<UUID, Contract, ContractEntry> {
}

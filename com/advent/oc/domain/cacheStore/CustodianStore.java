package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.legalentity.Custodian;
import com.advent.oc.domain.entry.CustodianEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class CustodianStore extends AbstractHibernateBlobStore<UUID, Custodian, CustodianEntry> {
}

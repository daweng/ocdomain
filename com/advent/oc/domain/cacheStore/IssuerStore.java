package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.legalentity.Issuer;
import com.advent.oc.domain.entry.IssuerEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class IssuerStore extends AbstractHibernateBlobStore<UUID, Issuer, IssuerEntry> {
}

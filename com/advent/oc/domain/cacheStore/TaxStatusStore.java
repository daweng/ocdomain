package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.account.TaxStatus;
import com.advent.oc.domain.entry.TaxStatusEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class TaxStatusStore extends AbstractHibernateBlobStore<UUID, TaxStatus, TaxStatusEntry> {
}

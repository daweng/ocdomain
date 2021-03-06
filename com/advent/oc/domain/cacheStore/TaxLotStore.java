package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.transaction.TaxLot;
import com.advent.oc.domain.entry.TaxLotEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class TaxLotStore extends AbstractHibernateBlobStore<UUID, TaxLot, TaxLotEntry> {
}

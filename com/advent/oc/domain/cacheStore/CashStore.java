package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.security.Cash;
import com.advent.oc.domain.entry.CashEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class CashStore extends AbstractHibernateBlobStore<UUID, Cash, CashEntry> {
}

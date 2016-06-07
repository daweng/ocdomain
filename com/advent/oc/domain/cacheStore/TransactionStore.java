package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.transaction.Transaction;
import com.advent.oc.domain.entry.TransactionEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class TransactionStore extends AbstractHibernateBlobStore<UUID, Transaction, TransactionEntry> {
}

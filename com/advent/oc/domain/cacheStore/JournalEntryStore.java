package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.transaction.JournalEntry;
import com.advent.oc.domain.entry.JournalEntryEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class JournalEntryStore extends AbstractHibernateBlobStore<UUID, JournalEntry, JournalEntryEntry> {
}

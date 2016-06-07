package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.auth.Subject;
import com.advent.oc.domain.entry.SubjectEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class SubjectStore extends AbstractHibernateBlobStore<UUID, Subject, SubjectEntry> {
}

package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.auth.User;
import com.advent.oc.domain.entry.UserEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class UserStore extends AbstractHibernateBlobStore<UUID, User, UserEntry> {
}

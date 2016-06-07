package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.core.FirmwideSettings;
import com.advent.oc.domain.entry.FirmwideSettingsEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class FirmwideSettingsStore extends AbstractHibernateBlobStore<UUID, FirmwideSettings, FirmwideSettingsEntry> {
}

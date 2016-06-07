package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.account.GainWithholdingMatrix;
import com.advent.oc.domain.entry.GainWithholdingMatrixEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class GainWithholdingMatrixStore extends AbstractHibernateBlobStore<UUID, GainWithholdingMatrix, GainWithholdingMatrixEntry> {
}

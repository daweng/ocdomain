package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.core.Expression;
import com.advent.oc.domain.entry.ExpressionEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class ExpressionStore extends AbstractHibernateBlobStore<UUID, Expression, ExpressionEntry> {
}

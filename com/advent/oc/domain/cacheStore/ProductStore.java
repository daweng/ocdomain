package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.model.Product;
import com.advent.oc.domain.entry.ProductEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class ProductStore extends AbstractHibernateBlobStore<UUID, Product, ProductEntry> {
}

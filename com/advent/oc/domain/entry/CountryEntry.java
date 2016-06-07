package com.advent.oc.domain.entry;

import com.advent.oc.base.BaseBlobEntry;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Country")
public class CountryEntry extends BaseBlobEntry {
}

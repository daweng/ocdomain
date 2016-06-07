package com.advent.oc.domain.entry;

import com.advent.oc.base.BaseBlobEntry;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TimeWeightedReturn")
public class TimeWeightedReturnEntry extends BaseBlobEntry {
}

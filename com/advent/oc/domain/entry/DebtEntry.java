package com.advent.oc.domain.entry;

import com.advent.oc.base.BaseBlobEntry;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Debt")
public class DebtEntry extends BaseBlobEntry {
}

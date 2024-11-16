package org.ericwubbo.knowledgeexplorer

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class KnowledgeItem(var description: String) {
    @Id @GeneratedValue val id: Long = 0
}
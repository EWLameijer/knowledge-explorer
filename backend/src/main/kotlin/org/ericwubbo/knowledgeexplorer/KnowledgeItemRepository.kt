package org.ericwubbo.knowledgeexplorer

import org.springframework.data.jpa.repository.JpaRepository

interface KnowledgeItemRepository : JpaRepository<KnowledgeItem, Long>
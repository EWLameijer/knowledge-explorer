package org.ericwubbo.knowledgeexplorer

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
class KnowledgeItemController(private val knowledgeItemRepository: KnowledgeItemRepository) {
    @GetMapping("{id}")
    fun getKnowledgeItemById(@PathVariable id: Long): KnowledgeItem? = knowledgeItemRepository.findById(id).orElse(null)
}
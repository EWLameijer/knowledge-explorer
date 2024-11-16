package org.ericwubbo.knowledgeexplorer

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Seeder(private val knowledgeItemRepository: KnowledgeItemRepository) : CommandLineRunner {
    override fun run(vararg args: String?) {
        if (knowledgeItemRepository.count() == 0L) {
            println("Seeding the database")
            knowledgeItemRepository.save(KnowledgeItem("starting an action"))
        }
    }
}
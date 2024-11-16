package org.ericwubbo.knowledgeexplorer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KnowledgeExplorerApplication

fun main(args: Array<String>) {
	runApplication<KnowledgeExplorerApplication>(*args)
}

package com.github.kotlin.everywhere.springs

class Classes(private val map: Map<String, Boolean>) {

    @JvmOverloads
    fun and(className: String, condition: Boolean = true): Classes {
        return Classes(mapOf(*map.entries.map { it.key to it.value }.toTypedArray(), className to condition))
    }

    override fun toString(): String {
        return map.entries.filter { it.value }.map { it.key }.joinToString(separator = " ")
    }
}

object JspUtils {
    val classes = Classes(mapOf())
}
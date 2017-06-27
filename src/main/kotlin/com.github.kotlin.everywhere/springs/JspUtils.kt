package com.github.kotlin.everywhere.springs

class Classes(private val map: Map<String, Boolean>) {

    @JvmOverloads
    fun add(className: String, condition: Boolean = true): Classes {
        return Classes(mapOf(*map.entries.map { it.key to it.value }.toTypedArray(), className to condition))
    }

    override fun toString(): String {
        return map.entries.filter { it.value }.map { it.key }.joinToString(separator = " ")
    }
}

class TupleList<T1, T2>(private var list: List<Pair<T1, T2>>) : List<Pair<T1, T2>> by list {
    fun plus(first: T1, second: T2): TupleList<T1, T2> {
        return TupleList(list + (first to second))
    }
}

object JspUtils {
    val classes = Classes(mapOf())
    fun <T1, T2> tuple(first: T1, second: T2): TupleList<T1, T2> {
        return TupleList(listOf(first to second))
    }
}
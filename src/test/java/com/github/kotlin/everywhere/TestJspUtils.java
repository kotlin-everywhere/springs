package com.github.kotlin.everywhere;

import com.github.kotlin.everywhere.springs.JspUtils;
import com.github.kotlin.everywhere.springs.TupleList;
import kotlin.Pair;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJspUtils {
    private final JspUtils j = JspUtils.INSTANCE;

    @Test
    public void testClasses() {
        assertEquals("", j.getClasses().toString());
        assertEquals(
                "btn btn-xs btn-danger",
                j.getClasses()
                        .add("btn btn-xs")
                        .add("btn-default", false)
                        .add("btn-danger", true)
                        .toString()
        );
    }

    @Test
    public void testTuple() {
        final TupleList<Integer, String> tupleList = j.tuple(1, "first").plus(2, "second").plus(3, "third");
        assertEquals(3, tupleList.getSize());
        assertEquals(new Pair<>(1, "first"), tupleList.get(0));
        assertEquals(new Pair<>(2, "second"), tupleList.get(1));
        assertEquals(new Pair<>(3, "third"), tupleList.get(2));
    }
}

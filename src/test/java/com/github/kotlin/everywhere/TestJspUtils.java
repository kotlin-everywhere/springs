package com.github.kotlin.everywhere;

import com.github.kotlin.everywhere.springs.JspUtils;
import kotlin.Pair;
import org.junit.Test;

import java.util.List;

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
        final List<Pair<Integer, String>> pairs = j.tuple(1, "first").add(2, "second").add(3, "third").build();
        assertEquals(3, pairs.size());
        assertEquals(new Pair<>(1, "first"), pairs.get(0));
        assertEquals(new Pair<>(2, "second"), pairs.get(1));
        assertEquals(new Pair<>(3, "third"), pairs.get(2));
    }
}

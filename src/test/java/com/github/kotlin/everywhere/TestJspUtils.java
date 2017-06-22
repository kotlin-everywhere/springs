package com.github.kotlin.everywhere;

import com.github.kotlin.everywhere.springs.JspUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJspUtils {
    @Test
    public void testClasses() {
        final JspUtils j = JspUtils.INSTANCE;
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
}

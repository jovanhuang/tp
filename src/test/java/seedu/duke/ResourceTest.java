package seedu.duke;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ResourceTest {

    @Test
    public void testStringConversion() {
        Project project = new Project("CZ2003", "www.google.com", "Search Engine");
        ArrayList<Resource> resources = project.getResources();
        assertEquals("[www.google.com (Description: Search Engine)]",
                resources.toString());
    }

}
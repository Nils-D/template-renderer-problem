package ut.com.auswertung.plugins.auswertungjira;

import org.junit.Test;
import com.auswertung.plugins.auswertungjira.api.MyPluginComponent;
import com.auswertung.plugins.auswertungjira.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}
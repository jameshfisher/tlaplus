package org.lamport.tla.toolbox.tool.tlc.ui.output;

import junit.framework.TestCase;

import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.TypedRegion;

/**
 * @author Simon Zambrovski
 * @version $Id$
 */
public class ParsingProcessOutputSinkTest extends TestCase
{

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception
    {
        super.setUp();
    }

    /**
     * Test method for {@link org.lamport.tla.toolbox.tool.tlc.ui.output.ParsingProcessOutputSink#mergePartitions(org.eclipse.jface.text.ITypedRegion[])}.
     */
    public void testMergePartitions()
    {
        assertEquals(new TypedRegion(0, 100, "type"), ParsingProcessOutputSink.mergePartitions(new ITypedRegion[] {
                new TypedRegion(0, 10, "type"), new TypedRegion(10, 80, "type"), new TypedRegion(90, 10, "type") }));
    }

    public void testMergePartitions2()
    {
        assertEquals(new TypedRegion(0, 100, "type"), ParsingProcessOutputSink
                .mergePartitions(new ITypedRegion[] { new TypedRegion(0, 100, "type") }));
    }

}
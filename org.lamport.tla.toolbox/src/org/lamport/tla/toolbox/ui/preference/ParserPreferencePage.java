package org.lamport.tla.toolbox.ui.preference;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.lamport.tla.toolbox.util.UIHelper;
import org.lamport.tla.toolbox.util.pref.IPreferenceConstants;
import org.lamport.tla.toolbox.util.pref.PreferenceStoreHelper;

/**
 * Preferences for TLA+ Parser
 * @author Simon Zambrovski
 * @version $Id$
 */
public class ParserPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage
{
    
    /**
     * Constructor
     */
    public ParserPreferencePage()
    {
        super(GRID);
        setPreferenceStore(PreferenceStoreHelper.getInstancePreferenceStore());
        setDescription("TLA+ Parser preferences");


    }

    protected Control createContents(Composite parent)
    {
        Control pageControl = super.createContents(parent);
        UIHelper.setHelp(pageControl, "ParserPreferencePage");
        return pageControl;
    }

    /**
     * Create field editors
     */
    protected void createFieldEditors()
    {
        addField(new BooleanFieldEditor(IPreferenceConstants.I_RESTORE_LAST_SPEC, "&Remember last loaded specification beyond restart",
                getFieldEditorParent()));

        addField(new BooleanFieldEditor(IPreferenceConstants.P_PARSER_POPUP_ERRORS, "&Popup problem window on parse errors",
                getFieldEditorParent()));
    }


    protected void initialize()
    {
        super.initialize();
        
        
    }

    public void init(IWorkbench workbench)
    {

    }

}

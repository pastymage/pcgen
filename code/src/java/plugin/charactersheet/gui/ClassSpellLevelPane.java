/*
 * ClassSpellLevelPane.java
 *
 * Created on February 26, 2004, 8:37 PM
 */

package plugin.charactersheet.gui;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import pcgen.cdom.enumeration.AssociationListKey;
import pcgen.cdom.enumeration.SourceFormat;
import pcgen.cdom.enumeration.StringKey;
import pcgen.core.Globals;
import pcgen.core.PCClass;
import pcgen.core.PlayerCharacter;
import pcgen.core.character.CharacterSpell;
import pcgen.core.character.SpellInfo;
import pcgen.core.spell.Spell;

/**
 *
 * @author  soulcatcher
 */
public class ClassSpellLevelPane extends javax.swing.JPanel
{
	private PlayerCharacter pc;
	private PCClass pcclass;
	private int level;
	private boolean racial = false;
	private List<Component> removeList = new ArrayList<Component>();
	private List<Component> lightList = new ArrayList<Component>();
	private List<Component> darkList = new ArrayList<Component>();
	private int serial = 0;

	//Seperated out for performance reasons
	private static final String DIALOG = "Dialog";
	private static final String NONE = "NONE";
	private static final String EFFECT = "Effect: ";
	private static final String TARGET = "Target: ";

	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel11;
	private javax.swing.JPanel jPanel12;
	private javax.swing.JPanel jPanel13;
	private javax.swing.JPanel jPanel14;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JLabel known;
	private javax.swing.JLabel perDay;
	private javax.swing.JLabel title;

	/** Creates new form ClassSpellLevelPane */
	public ClassSpellLevelPane()
	{
		initComponents();
		setColor();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	private void initComponents()
	{
		java.awt.GridBagConstraints gridBagConstraints;

		jPanel1 = new javax.swing.JPanel();
		title = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		known = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		perDay = new javax.swing.JLabel();
		jPanel4 = new javax.swing.JPanel();
		jPanel3 = new javax.swing.JPanel();
		jLabel12 = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jPanel6 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jPanel8 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		jPanel9 = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		jPanel10 = new javax.swing.JPanel();
		jLabel8 = new javax.swing.JLabel();
		jPanel11 = new javax.swing.JPanel();
		jLabel9 = new javax.swing.JLabel();
		jPanel12 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		jPanel13 = new javax.swing.JPanel();
		jLabel11 = new javax.swing.JLabel();
		jPanel14 = new javax.swing.JPanel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();

		setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

		setBackground(CharacterPanel.white);
		jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER,
			1, 0));

		title.setFont(new java.awt.Font("Dialog", 1, 16));
		jPanel1.add(title);

		add(jPanel1);

		jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 1,
			0));

		jLabel1.setFont(new java.awt.Font("Dialog", 1, 13));
		jLabel1.setText("  Known: ");
		jPanel2.add(jLabel1);

		known.setText(" ");
		jPanel2.add(known);

		jLabel3.setFont(new java.awt.Font("Dialog", 1, 13));
		jLabel3.setText("     Per Day: ");
		jPanel2.add(jLabel3);

		perDay.setFont(new java.awt.Font("Dialog", 1, 13));
		perDay.setText(" ");
		jPanel2.add(perDay);

		add(jPanel2);

		jPanel4.setLayout(new java.awt.GridBagLayout());

		jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 1,
			0));

		jLabel12.setFont(new java.awt.Font("Dialog", 0, 10));
		jLabel12.setText(" ");
		jPanel3.add(jLabel12);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(jPanel3, gridBagConstraints);

		jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 1,
			0));

		jLabel2.setFont(new java.awt.Font("Dialog", 1, 11));
		jLabel2.setText("Name");
		jPanel5.add(jLabel2);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(jPanel5, gridBagConstraints);

		jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 1,
			0));

		jLabel4.setFont(new java.awt.Font("Dialog", 1, 11));
		jLabel4.setText("DC   ");
		jPanel6.add(jLabel4);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(jPanel6, gridBagConstraints);

		jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 1,
			0));

		jLabel5.setFont(new java.awt.Font("Dialog", 1, 11));
		jLabel5.setText("Saving Throw");
		jPanel7.add(jLabel5);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(jPanel7, gridBagConstraints);

		jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 1,
			0));

		jLabel6.setFont(new java.awt.Font("Dialog", 1, 11));
		jLabel6.setText("Time");
		jPanel8.add(jLabel6);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(jPanel8, gridBagConstraints);

		jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 1,
			0));

		jLabel7.setFont(new java.awt.Font("Dialog", 1, 11));
		jLabel7.setText("Duration");
		jPanel9.add(jLabel7);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 5;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(jPanel9, gridBagConstraints);

		jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 1,
			0));

		jLabel8.setFont(new java.awt.Font("Dialog", 1, 11));
		jLabel8.setText("Range");
		jPanel10.add(jLabel8);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 6;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(jPanel10, gridBagConstraints);

		jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 1,
			0));

		jLabel9.setFont(new java.awt.Font("Dialog", 1, 11));
		jLabel9.setText("Comp.");
		jPanel11.add(jLabel9);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 7;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(jPanel11, gridBagConstraints);

		jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 1,
			0));

		jLabel10.setFont(new java.awt.Font("Dialog", 1, 11));
		jLabel10.setText("Spell Resistance ");
		jPanel12.add(jLabel10);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 8;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(jPanel12, gridBagConstraints);

		jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 1,
			0));

		jLabel11.setFont(new java.awt.Font("Dialog", 1, 11));
		jLabel11.setText("School");
		jPanel13.add(jLabel11);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 9;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(jPanel13, gridBagConstraints);

		jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 1,
			0));

		jLabel13.setFont(new java.awt.Font("Dialog", 1, 11));
		jLabel13.setText("Source");
		jPanel14.add(jLabel13);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 10;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(jPanel14, gridBagConstraints);

		jLabel14.setFont(new java.awt.Font("Dialog", 1, 11));
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 5;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 125, 0, 0);
		jPanel4.add(jLabel14, gridBagConstraints);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 45, 0, 0);
		jPanel4.add(jLabel15, gridBagConstraints);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 0);
		jPanel4.add(jLabel16, gridBagConstraints);

		add(jPanel4);

	}

	/**
	 * Set color
	 */
	public void setColor()
	{
		setBackground(CharacterPanel.white);
		jPanel1.setBackground(CharacterPanel.header);
		jPanel2.setBackground(CharacterPanel.header);
		jPanel4.setBackground(CharacterPanel.white);
		jPanel3.setBackground(CharacterPanel.header);
		jPanel5.setBackground(CharacterPanel.header);
		jPanel6.setBackground(CharacterPanel.header);
		jPanel7.setBackground(CharacterPanel.header);
		jPanel8.setBackground(CharacterPanel.header);
		jPanel9.setBackground(CharacterPanel.header);
		jPanel10.setBackground(CharacterPanel.header);
		jPanel11.setBackground(CharacterPanel.header);
		jPanel12.setBackground(CharacterPanel.header);
		jPanel13.setBackground(CharacterPanel.header);
		jPanel14.setBackground(CharacterPanel.header);
		for (Component c : lightList)
		{
			c.setBackground(CharacterPanel.bodyLight);
		}
		for (Component c : darkList)
		{
			c.setBackground(CharacterPanel.bodyMedLight);
		}
	}

	/**
	 * Set the PC
	 * @param pc
	 * @param pcclass
	 * @param level
	 */
	public void setPc(PlayerCharacter pc, PCClass pcclass, int level)
	{
		this.pc = pc;
		serial = 0;
		this.pcclass = pcclass;
		this.level = level;

		StringBuffer sb = new StringBuffer();
		sb.append(pcclass.getDisplayClassName(pc));
		sb.append(" Spells, Level ").append(level);

		title.setText(sb.toString());
	}

	/**
	 * Set the pc
	 * @param pc
	 */
	public void setPc(PlayerCharacter pc)
	{
		if (this.pc != pc)
		{
			this.pc = pc;
			this.racial = true;
			serial = 0;
		}
	}

	/**
	 * Refresh
	 */
	public void refresh()
	{
		if (serial < pc.getSerial())
		{
			Collection<CharacterSpell> spellList;
			String spellBook;
			if (!racial)
			{
				int knownVal = pc.getSpellSupport(pcclass).getKnownForLevel(level, "null", pc);
				if (knownVal == 0)
				{ // If knownVal is 0 then hide jLabel1 and Known label
					jLabel1.setVisible(false);
					known.setVisible(false);
				}
				else
				{
					known.setText(Integer.toString(knownVal));
				}
				perDay.setText(pc.getSpellSupport(pcclass).getCastForLevel(level, Globals
				.getDefaultSpellBook(), true, true, pc)
					+ pc.getSpellSupport(pcclass).getBonusCastForLevelString(level, Globals
					.getDefaultSpellBook(), pc));

				spellList =
						pc.getCharacterSpells(pcclass, null, Globals.getDefaultSpellBook(), level);
				spellBook = Globals.getDefaultSpellBook();
			}
			else
			{
				spellList =
						pc.getSafeAssocList(pc.getRace(),
							AssociationListKey.CHARACTER_SPELLS);
				spellBook = Globals.INNATE_SPELL_BOOK_NAME;
			}

			for (Component c : removeList)
			{
				remove(c);
				jPanel4.remove(c);
			}
			removeList.clear();

			int gridY = 1;
			boolean light = true;
			for (CharacterSpell cs : spellList)
			{
				Color color;
				List<Component> colorList;
				if (light)
				{
					color = CharacterPanel.bodyLight;
					colorList = lightList;
					light = false;
				}
				else
				{
					color = CharacterPanel.bodyMedLight;
					colorList = darkList;
					light = true;
				}
				gridY = addLine(cs, spellBook, color, gridY, colorList);
			}
			serial = pc.getSerial();
		}
	}

	private int addLine(CharacterSpell cs, String spellBook, Color color,
		int gridY, List<Component> colorList)
	{
		Spell spell = cs.getSpell();
		SpellInfo si = cs.getSpellInfoFor(pc, spellBook, level, -1);

		javax.swing.JPanel cbPanel = new javax.swing.JPanel();
		cbPanel.setBackground(color);
		java.awt.GridBagConstraints gridBagConstraints =
				new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = gridY;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(cbPanel, gridBagConstraints);
		removeList.add(cbPanel);
		colorList.add(cbPanel);

		javax.swing.JPanel namePanel = new javax.swing.JPanel();
		javax.swing.JLabel name = new javax.swing.JLabel();
		namePanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT,
			1, 0));
		namePanel.setBackground(color);
		name.setFont(new java.awt.Font(DIALOG, 1, 11));
		if (si != null)
		{
			name.setText(new StringBuffer(spell.getOutputName()).append(si)
				.toString());
		}
		else
		{
			name.setText(new StringBuffer(spell.getOutputName()).toString());
		}
		namePanel.add(name);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = gridY;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(namePanel, gridBagConstraints);
		removeList.add(namePanel);
		colorList.add(namePanel);

		javax.swing.JPanel dcPanel = new javax.swing.JPanel();
		javax.swing.JLabel dc = new javax.swing.JLabel();
		dcPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 1,
			0));
		dcPanel.setBackground(color);
		dc.setFont(new java.awt.Font(DIALOG, 1, 10));
		String SaveInfo = spell.getSaveInfo();
		if (!"".equals(SaveInfo) && !"None".equals(SaveInfo) && !"No".equals(SaveInfo))
		{
			dc.setText(Integer.toString(pc.getDC(spell, si)));
		}
		dcPanel.add(dc);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = gridY;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(dcPanel, gridBagConstraints);
		removeList.add(dcPanel);
		colorList.add(dcPanel);

		javax.swing.JTextArea save = new javax.swing.JTextArea();
		save.setLineWrap(true);
		save.setWrapStyleWord(true);
		save.setBackground(color);
		save.setFont(new java.awt.Font(DIALOG, 0, 10));
		save.setText(spell.getSaveInfo());
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = gridY;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(save, gridBagConstraints);
		removeList.add(save);
		colorList.add(save);

		javax.swing.JTextArea time = new javax.swing.JTextArea();
		time.setLineWrap(true);
		time.setWrapStyleWord(true);
		time.setBackground(color);
		time.setFont(new java.awt.Font(DIALOG, 0, 10));
		time.setText(spell.getCastingTime());
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = gridY;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(time, gridBagConstraints);
		removeList.add(time);
		colorList.add(time);

		javax.swing.JTextArea duration = new javax.swing.JTextArea();
		duration.setLineWrap(true);
		duration.setWrapStyleWord(true);
		duration.setBackground(color);
		duration.setFont(new java.awt.Font(DIALOG, 0, 10));
		duration.setText(pc.parseSpellString(cs, spell.getDuration(), cs
			.getOwner()));
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 5;
		gridBagConstraints.gridy = gridY;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(duration, gridBagConstraints);
		removeList.add(duration);
		colorList.add(duration);

		javax.swing.JPanel rangePanel = new javax.swing.JPanel();
		javax.swing.JLabel range = new javax.swing.JLabel();
		rangePanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT,
			1, 0));
		rangePanel.setBackground(color);
		range.setFont(new java.awt.Font(DIALOG, 1, 10));
		range.setText(pc.getSpellRange(cs, cs.getOwner(), si));
		rangePanel.add(range);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 6;
		gridBagConstraints.gridy = gridY;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(rangePanel, gridBagConstraints);
		removeList.add(rangePanel);
		colorList.add(rangePanel);

		javax.swing.JPanel compPanel = new javax.swing.JPanel();
		javax.swing.JLabel comp = new javax.swing.JLabel();
		compPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT,
			1, 0));
		compPanel.setBackground(color);
		comp.setFont(new java.awt.Font(DIALOG, 1, 10));
		comp.setText(spell.getComponentList());
		compPanel.add(comp);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 7;
		gridBagConstraints.gridy = gridY;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(compPanel, gridBagConstraints);
		removeList.add(compPanel);
		colorList.add(compPanel);

		javax.swing.JTextArea sr = new javax.swing.JTextArea();
		sr.setLineWrap(true);
		sr.setWrapStyleWord(true);
		sr.setBackground(color);
		sr.setFont(new java.awt.Font(DIALOG, 0, 10));
		sr.setText(spell.getSpellResistance());
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 8;
		gridBagConstraints.gridy = gridY;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(sr, gridBagConstraints);
		removeList.add(sr);
		colorList.add(sr);

		javax.swing.JTextArea school = new javax.swing.JTextArea();
		school.setLineWrap(true);
		school.setWrapStyleWord(true);
		school.setBackground(color);
		school.setFont(new java.awt.Font(DIALOG, 0, 10));
		StringBuffer sch = new StringBuffer(spell.getSchool());
		if ((spell.getSubschool().length() > 0)
			&& (!NONE.equalsIgnoreCase(spell.getSubschool().trim())))
		{
			sch.append(' ').append('(').append(spell.getSubschool())
				.append(')');
		}
		if (spell.descriptor().length() > 0)
		{
			sch.append(' ').append('[').append(spell.descriptor()).append(']');
		}
		school.setText(sch.toString());
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 9;
		gridBagConstraints.gridy = gridY;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(school, gridBagConstraints);
		removeList.add(school);
		colorList.add(school);

		javax.swing.JPanel sourcePanel = new javax.swing.JPanel();
		javax.swing.JLabel source = new javax.swing.JLabel();
		sourcePanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT,
			1, 0));
		sourcePanel.setBackground(color);
		source.setFont(new java.awt.Font(DIALOG, 1, 10));
		final StringBuffer buf = new StringBuffer();
		buf.append(SourceFormat.formatShort(spell, 8));
		buf.append(':').append(' ');
		buf.append(spell.get(StringKey.SOURCE_PAGE));
		source.setText(buf.toString());
		sourcePanel.add(source);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 10;
		gridBagConstraints.gridy = gridY;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(sourcePanel, gridBagConstraints);
		removeList.add(sourcePanel);
		colorList.add(sourcePanel);
		gridY++;

		javax.swing.JPanel cb1Panel = new javax.swing.JPanel();
		cb1Panel.setBackground(color);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = gridY;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(cb1Panel, gridBagConstraints);
		removeList.add(cb1Panel);
		colorList.add(cb1Panel);

		javax.swing.JTextArea effect = new javax.swing.JTextArea();
		effect.setLineWrap(true);
		effect.setWrapStyleWord(true);
		effect.setBackground(color);
		effect.setFont(new java.awt.Font(DIALOG, 0, 10));
		effect.setText(new StringBuffer(EFFECT)
			.append(
				pc.parseSpellString(cs, pc.getDescription(spell), cs
					.getOwner())).toString());
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = gridY;
		gridBagConstraints.gridwidth = 5;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(effect, gridBagConstraints);
		removeList.add(effect);
		colorList.add(effect);

		javax.swing.JTextArea target = new javax.swing.JTextArea();
		target.setLineWrap(true);
		target.setWrapStyleWord(true);
		target.setBackground(color);
		target.setFont(new java.awt.Font(DIALOG, 0, 10));
		target.setText(new StringBuffer(TARGET).append(
			pc.parseSpellString(cs, spell.getSafe(StringKey.TARGET_AREA), cs.getOwner()))
			.toString());
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 6;
		gridBagConstraints.gridy = gridY;
		gridBagConstraints.gridwidth = 5;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel4.add(target, gridBagConstraints);
		removeList.add(target);
		colorList.add(target);
		gridY++;
		return gridY;
	}

	/**
	 * Destroy panel
	 */
	public void destruct()
	{
		removeAll();
		removeList.clear();
		known = null;
		perDay = null;
		title = null;
		pc = null;
		pcclass = null;
		removeList = null;
		lightList.clear();
		lightList = null;
		darkList.clear();
		darkList = null;
	}
}

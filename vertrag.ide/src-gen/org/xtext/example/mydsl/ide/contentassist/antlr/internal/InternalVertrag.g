/*
 * generated by Xtext 2.12.0
 */
grammar InternalVertrag;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.VertragGrammarAccess;

}
@parser::members {
	private VertragGrammarAccess grammarAccess;

	public void setGrammarAccess(VertragGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getElementsAssignment()); }
		(rule__Model__ElementsAssignment)*
		{ after(grammarAccess.getModelAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleElement
entryRuleElement
:
{ before(grammarAccess.getElementRule()); }
	 ruleElement
{ after(grammarAccess.getElementRule()); } 
	 EOF 
;

// Rule Element
ruleElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getElementAccess().getAlternatives()); }
		(rule__Element__Alternatives)
		{ after(grammarAccess.getElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVertrag
entryRuleVertrag
:
{ before(grammarAccess.getVertragRule()); }
	 ruleVertrag
{ after(grammarAccess.getVertragRule()); } 
	 EOF 
;

// Rule Vertrag
ruleVertrag 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVertragAccess().getUnorderedGroup()); }
		(rule__Vertrag__UnorderedGroup)
		{ after(grammarAccess.getVertragAccess().getUnorderedGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleHandy
entryRuleHandy
:
{ before(grammarAccess.getHandyRule()); }
	 ruleHandy
{ after(grammarAccess.getHandyRule()); } 
	 EOF 
;

// Rule Handy
ruleHandy 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHandyAccess().getGroup()); }
		(rule__Handy__Group__0)
		{ after(grammarAccess.getHandyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementAccess().getVertragParserRuleCall_0()); }
		ruleVertrag
		{ after(grammarAccess.getElementAccess().getVertragParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getElementAccess().getHandyParserRuleCall_1()); }
		ruleHandy
		{ after(grammarAccess.getElementAccess().getHandyParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_0__0__Impl
	rule__Vertrag__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getVertragKeyword_0_0()); }
	'Vertrag'
	{ after(grammarAccess.getVertragAccess().getVertragKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_0__1__Impl
	rule__Vertrag__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getNameAssignment_0_1()); }
	(rule__Vertrag__NameAssignment_0_1)
	{ after(grammarAccess.getVertragAccess().getNameAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_0__2__Impl
	rule__Vertrag__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getLeftCurlyBracketKeyword_0_2()); }
	'{'
	{ after(grammarAccess.getVertragAccess().getLeftCurlyBracketKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getGroup_0_3()); }
	(rule__Vertrag__Group_0_3__0)*
	{ after(grammarAccess.getVertragAccess().getGroup_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Vertrag__Group_0_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_0_3__0__Impl
	rule__Vertrag__Group_0_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getDatenvolumenKeyword_0_3_0()); }
	'datenvolumen'
	{ after(grammarAccess.getVertragAccess().getDatenvolumenKeyword_0_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_0_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getDatenvolumenAssignment_0_3_1()); }
	(rule__Vertrag__DatenvolumenAssignment_0_3_1)
	{ after(grammarAccess.getVertragAccess().getDatenvolumenAssignment_0_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Vertrag__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_1__0__Impl
	rule__Vertrag__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getMindestvertragslaufzeitKeyword_1_0()); }
	'mindestvertragslaufzeit'
	{ after(grammarAccess.getVertragAccess().getMindestvertragslaufzeitKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getMindestvertragslaufzeitAssignment_1_1()); }
	(rule__Vertrag__MindestvertragslaufzeitAssignment_1_1)
	{ after(grammarAccess.getVertragAccess().getMindestvertragslaufzeitAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Vertrag__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_2__0__Impl
	rule__Vertrag__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getMonatl_kostenKeyword_2_0()); }
	'monatl_kosten'
	{ after(grammarAccess.getVertragAccess().getMonatl_kostenKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getMonatl_kostenAssignment_2_1()); }
	(rule__Vertrag__Monatl_kostenAssignment_2_1)
	{ after(grammarAccess.getVertragAccess().getMonatl_kostenAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Vertrag__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_3__0__Impl
	rule__Vertrag__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getNetzanbieterKeyword_3_0()); }
	'netzanbieter'
	{ after(grammarAccess.getVertragAccess().getNetzanbieterKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getNetzanbieterAssignment_3_1()); }
	(rule__Vertrag__NetzanbieterAssignment_3_1)
	{ after(grammarAccess.getVertragAccess().getNetzanbieterAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Handy__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Handy__Group__0__Impl
	rule__Handy__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Handy__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandyAccess().getHandyKeyword_0()); }
	'handy'
	{ after(grammarAccess.getHandyAccess().getHandyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Handy__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Handy__Group__1__Impl
	rule__Handy__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Handy__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandyAccess().getNameAssignment_1()); }
	(rule__Handy__NameAssignment_1)
	{ after(grammarAccess.getHandyAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Handy__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Handy__Group__2__Impl
	rule__Handy__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Handy__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandyAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getHandyAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Handy__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Handy__Group__3__Impl
	rule__Handy__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Handy__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandyAccess().getSystemAssignment_3()); }
	(rule__Handy__SystemAssignment_3)
	{ after(grammarAccess.getHandyAccess().getSystemAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Handy__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Handy__Group__4__Impl
	rule__Handy__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Handy__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandyAccess().getMarkeAssignment_4()); }
	(rule__Handy__MarkeAssignment_4)
	{ after(grammarAccess.getHandyAccess().getMarkeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Handy__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Handy__Group__5__Impl
	rule__Handy__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Handy__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandyAccess().getSpeicherAssignment_5()); }
	(rule__Handy__SpeicherAssignment_5)
	{ after(grammarAccess.getHandyAccess().getSpeicherAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Handy__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Handy__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Handy__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandyAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getHandyAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Vertrag__UnorderedGroup
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getVertragAccess().getUnorderedGroup());
	}
:
	rule__Vertrag__UnorderedGroup__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getVertragAccess().getUnorderedGroup());
	restoreStackSize(stackSize);
}

rule__Vertrag__UnorderedGroup__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getVertragAccess().getGroup_0()); }
					(rule__Vertrag__Group_0__0)
					{ after(grammarAccess.getVertragAccess().getGroup_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 1);
				}
				{
					selected = true;
				}
				(
					(
						{ before(grammarAccess.getVertragAccess().getGroup_1()); }
						(rule__Vertrag__Group_1__0)
						{ after(grammarAccess.getVertragAccess().getGroup_1()); }
					)
					(
						{ before(grammarAccess.getVertragAccess().getGroup_1()); }
						((rule__Vertrag__Group_1__0)=>rule__Vertrag__Group_1__0)*
						{ after(grammarAccess.getVertragAccess().getGroup_1()); }
					)
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 2);
				}
				{
					selected = true;
				}
				(
					(
						{ before(grammarAccess.getVertragAccess().getGroup_2()); }
						(rule__Vertrag__Group_2__0)
						{ after(grammarAccess.getVertragAccess().getGroup_2()); }
					)
					(
						{ before(grammarAccess.getVertragAccess().getGroup_2()); }
						((rule__Vertrag__Group_2__0)=>rule__Vertrag__Group_2__0)*
						{ after(grammarAccess.getVertragAccess().getGroup_2()); }
					)
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 3);
				}
				{
					selected = true;
				}
				(
					(
						{ before(grammarAccess.getVertragAccess().getGroup_3()); }
						(rule__Vertrag__Group_3__0)
						{ after(grammarAccess.getVertragAccess().getGroup_3()); }
					)
					(
						{ before(grammarAccess.getVertragAccess().getGroup_3()); }
						((rule__Vertrag__Group_3__0)=>rule__Vertrag__Group_3__0)*
						{ after(grammarAccess.getVertragAccess().getGroup_3()); }
					)
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 4)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 4);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getVertragAccess().getRightCurlyBracketKeyword_4()); }
					('}')
					{ after(grammarAccess.getVertragAccess().getRightCurlyBracketKeyword_4()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
	restoreStackSize(stackSize);
}

rule__Vertrag__UnorderedGroup__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__UnorderedGroup__Impl
	rule__Vertrag__UnorderedGroup__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__UnorderedGroup__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__UnorderedGroup__Impl
	rule__Vertrag__UnorderedGroup__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__UnorderedGroup__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__UnorderedGroup__Impl
	rule__Vertrag__UnorderedGroup__3?
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__UnorderedGroup__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__UnorderedGroup__Impl
	rule__Vertrag__UnorderedGroup__4?
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__UnorderedGroup__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__UnorderedGroup__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); }
		ruleElement
		{ after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__NameAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVertragAccess().getNameZEICHENFOLGETerminalRuleCall_0_1_0()); }
		RULE_ZEICHENFOLGE
		{ after(grammarAccess.getVertragAccess().getNameZEICHENFOLGETerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__DatenvolumenAssignment_0_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVertragAccess().getDatenvolumenZEICHENFOLGETerminalRuleCall_0_3_1_0()); }
		RULE_ZEICHENFOLGE
		{ after(grammarAccess.getVertragAccess().getDatenvolumenZEICHENFOLGETerminalRuleCall_0_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__MindestvertragslaufzeitAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVertragAccess().getMindestvertragslaufzeitZEICHENFOLGETerminalRuleCall_1_1_0()); }
		RULE_ZEICHENFOLGE
		{ after(grammarAccess.getVertragAccess().getMindestvertragslaufzeitZEICHENFOLGETerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Monatl_kostenAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVertragAccess().getMonatl_kostenZEICHENFOLGETerminalRuleCall_2_1_0()); }
		RULE_ZEICHENFOLGE
		{ after(grammarAccess.getVertragAccess().getMonatl_kostenZEICHENFOLGETerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__NetzanbieterAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVertragAccess().getNetzanbieterZEICHENFOLGETerminalRuleCall_3_1_0()); }
		RULE_ZEICHENFOLGE
		{ after(grammarAccess.getVertragAccess().getNetzanbieterZEICHENFOLGETerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Handy__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHandyAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getHandyAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Handy__SystemAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHandyAccess().getSystemIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getHandyAccess().getSystemIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Handy__MarkeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHandyAccess().getMarkeIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getHandyAccess().getMarkeIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Handy__SpeicherAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHandyAccess().getSpeicherIDTerminalRuleCall_5_0()); }
		RULE_ID
		{ after(grammarAccess.getHandyAccess().getSpeicherIDTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ZEICHENFOLGE : ('0'..'9'|'a'..'z')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

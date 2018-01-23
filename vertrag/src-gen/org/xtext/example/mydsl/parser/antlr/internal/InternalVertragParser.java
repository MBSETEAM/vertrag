package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.VertragGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVertragParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ZEICHENFOLGE", "RULE_INT", "RULE_PRICE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Vertrag'", "'{'", "'mindestvertragslaufzeit'", "'datenvolumen'", "'monatl_kosten'", "'internetseite'", "'netzanbieter'", "'telefon-flat'", "'sms-flat'", "'geraet'", "'}'", "'handy'", "'O2'", "'TELEKOM'", "'VODAFON'", "'ANDROID'", "'IOS'", "'SAMSUNG'", "'IPHONE'"
    };
    public static final int RULE_ZEICHENFOLGE=4;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int RULE_PRICE=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalVertragParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVertragParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVertragParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVertrag.g"; }



     	private VertragGrammarAccess grammarAccess;

        public InternalVertragParser(TokenStream input, VertragGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected VertragGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalVertrag.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalVertrag.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalVertrag.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalVertrag.g:72:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalVertrag.g:78:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalVertrag.g:79:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalVertrag.g:79:2: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||(LA1_0>=16 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVertrag.g:80:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalVertrag.g:80:3: (lv_elements_0_0= ruleElement )
            	    // InternalVertrag.g:81:4: lv_elements_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.mydsl.Vertrag.Element");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalVertrag.g:101:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalVertrag.g:101:48: (iv_ruleElement= ruleElement EOF )
            // InternalVertrag.g:102:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalVertrag.g:108:1: ruleElement returns [EObject current=null] : (this_Vertrag_0= ruleVertrag | this_Handy_1= ruleHandy ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Vertrag_0 = null;

        EObject this_Handy_1 = null;



        	enterRule();

        try {
            // InternalVertrag.g:114:2: ( (this_Vertrag_0= ruleVertrag | this_Handy_1= ruleHandy ) )
            // InternalVertrag.g:115:2: (this_Vertrag_0= ruleVertrag | this_Handy_1= ruleHandy )
            {
            // InternalVertrag.g:115:2: (this_Vertrag_0= ruleVertrag | this_Handy_1= ruleHandy )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13||(LA2_0>=16 && LA2_0<=23)) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalVertrag.g:116:3: this_Vertrag_0= ruleVertrag
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getVertragParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Vertrag_0=ruleVertrag();

                    state._fsp--;


                    			current = this_Vertrag_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVertrag.g:125:3: this_Handy_1= ruleHandy
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getHandyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Handy_1=ruleHandy();

                    state._fsp--;


                    			current = this_Handy_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleVertrag"
    // InternalVertrag.g:137:1: entryRuleVertrag returns [EObject current=null] : iv_ruleVertrag= ruleVertrag EOF ;
    public final EObject entryRuleVertrag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVertrag = null;


        try {
            // InternalVertrag.g:137:48: (iv_ruleVertrag= ruleVertrag EOF )
            // InternalVertrag.g:138:2: iv_ruleVertrag= ruleVertrag EOF
            {
             newCompositeNode(grammarAccess.getVertragRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVertrag=ruleVertrag();

            state._fsp--;

             current =iv_ruleVertrag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVertrag"


    // $ANTLR start "ruleVertrag"
    // InternalVertrag.g:144:1: ruleVertrag returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_20= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleVertrag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_mindestvertragslaufzeit_5_0=null;
        Token otherlv_6=null;
        Token lv_datenvolumen_7_0=null;
        Token otherlv_8=null;
        Token lv_monatl_kosten_9_0=null;
        Token otherlv_10=null;
        Token lv_internetseite_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_telefonflat_15_0=null;
        Token otherlv_16=null;
        Token lv_smsflat_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Enumerator lv_value_13_0 = null;



        	enterRule();

        try {
            // InternalVertrag.g:150:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_20= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalVertrag.g:151:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_20= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalVertrag.g:151:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_20= '}' ) ) ) ) )+ {...}?) ) )
            // InternalVertrag.g:152:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_20= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalVertrag.g:152:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_20= '}' ) ) ) ) )+ {...}?) )
            // InternalVertrag.g:153:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_20= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getVertragAccess().getUnorderedGroup());
            			
            // InternalVertrag.g:156:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_20= '}' ) ) ) ) )+ {...}?)
            // InternalVertrag.g:157:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_20= '}' ) ) ) ) )+ {...}?
            {
            // InternalVertrag.g:157:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_20= '}' ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=10;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalVertrag.g:158:3: ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) )
            	    {
            	    // InternalVertrag.g:158:3: ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) )
            	    // InternalVertrag.g:159:4: {...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalVertrag.g:159:101: ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) )
            	    // InternalVertrag.g:160:5: ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalVertrag.g:163:8: ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) )
            	    // InternalVertrag.g:163:9: {...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    }
            	    // InternalVertrag.g:163:18: (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* )
            	    // InternalVertrag.g:163:19: otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )*
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_4); 

            	    								newLeafNode(otherlv_1, grammarAccess.getVertragAccess().getVertragKeyword_0_0());
            	    							
            	    // InternalVertrag.g:167:8: ( (lv_name_2_0= RULE_ZEICHENFOLGE ) )
            	    // InternalVertrag.g:168:9: (lv_name_2_0= RULE_ZEICHENFOLGE )
            	    {
            	    // InternalVertrag.g:168:9: (lv_name_2_0= RULE_ZEICHENFOLGE )
            	    // InternalVertrag.g:169:10: lv_name_2_0= RULE_ZEICHENFOLGE
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ZEICHENFOLGE,FOLLOW_5); 

            	    										newLeafNode(lv_name_2_0, grammarAccess.getVertragAccess().getNameZEICHENFOLGETerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getVertragRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"name",
            	    											lv_name_2_0,
            	    											"org.xtext.example.mydsl.Vertrag.ZEICHENFOLGE");
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,14,FOLLOW_6); 

            	    								newLeafNode(otherlv_3, grammarAccess.getVertragAccess().getLeftCurlyBracketKeyword_0_2());
            	    							
            	    // InternalVertrag.g:189:8: (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==15) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalVertrag.g:190:9: otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,15,FOLLOW_7); 

            	    	    									newLeafNode(otherlv_4, grammarAccess.getVertragAccess().getMindestvertragslaufzeitKeyword_0_3_0());
            	    	    								
            	    	    // InternalVertrag.g:194:9: ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) )
            	    	    // InternalVertrag.g:195:10: (lv_mindestvertragslaufzeit_5_0= RULE_INT )
            	    	    {
            	    	    // InternalVertrag.g:195:10: (lv_mindestvertragslaufzeit_5_0= RULE_INT )
            	    	    // InternalVertrag.g:196:11: lv_mindestvertragslaufzeit_5_0= RULE_INT
            	    	    {
            	    	    lv_mindestvertragslaufzeit_5_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            	    	    											newLeafNode(lv_mindestvertragslaufzeit_5_0, grammarAccess.getVertragAccess().getMindestvertragslaufzeitINTTerminalRuleCall_0_3_1_0());
            	    	    										

            	    	    											if (current==null) {
            	    	    												current = createModelElement(grammarAccess.getVertragRule());
            	    	    											}
            	    	    											setWithLastConsumed(
            	    	    												current,
            	    	    												"mindestvertragslaufzeit",
            	    	    												lv_mindestvertragslaufzeit_5_0,
            	    	    												"org.xtext.example.mydsl.Vertrag.INT");
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertrag.g:219:3: ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) )
            	    {
            	    // InternalVertrag.g:219:3: ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) )
            	    // InternalVertrag.g:220:4: {...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalVertrag.g:220:101: ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ )
            	    // InternalVertrag.g:221:5: ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalVertrag.g:224:8: ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==16) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalVertrag.g:224:9: {...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalVertrag.g:224:18: (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) )
            	    	    // InternalVertrag.g:224:19: otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,16,FOLLOW_7); 

            	    	    								newLeafNode(otherlv_6, grammarAccess.getVertragAccess().getDatenvolumenKeyword_1_0());
            	    	    							
            	    	    // InternalVertrag.g:228:8: ( (lv_datenvolumen_7_0= RULE_INT ) )
            	    	    // InternalVertrag.g:229:9: (lv_datenvolumen_7_0= RULE_INT )
            	    	    {
            	    	    // InternalVertrag.g:229:9: (lv_datenvolumen_7_0= RULE_INT )
            	    	    // InternalVertrag.g:230:10: lv_datenvolumen_7_0= RULE_INT
            	    	    {
            	    	    lv_datenvolumen_7_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            	    	    										newLeafNode(lv_datenvolumen_7_0, grammarAccess.getVertragAccess().getDatenvolumenINTTerminalRuleCall_1_1_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getVertragRule());
            	    	    										}
            	    	    										setWithLastConsumed(
            	    	    											current,
            	    	    											"datenvolumen",
            	    	    											lv_datenvolumen_7_0,
            	    	    											"org.xtext.example.mydsl.Vertrag.INT");
            	    	    									

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertrag.g:252:3: ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) ) )+ ) )
            	    {
            	    // InternalVertrag.g:252:3: ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) ) )+ ) )
            	    // InternalVertrag.g:253:4: {...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalVertrag.g:253:101: ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) ) )+ )
            	    // InternalVertrag.g:254:5: ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalVertrag.g:257:8: ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==17) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalVertrag.g:257:9: {...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalVertrag.g:257:18: (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) )
            	    	    // InternalVertrag.g:257:19: otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,17,FOLLOW_9); 

            	    	    								newLeafNode(otherlv_8, grammarAccess.getVertragAccess().getMonatl_kostenKeyword_2_0());
            	    	    							
            	    	    // InternalVertrag.g:261:8: ( (lv_monatl_kosten_9_0= RULE_PRICE ) )
            	    	    // InternalVertrag.g:262:9: (lv_monatl_kosten_9_0= RULE_PRICE )
            	    	    {
            	    	    // InternalVertrag.g:262:9: (lv_monatl_kosten_9_0= RULE_PRICE )
            	    	    // InternalVertrag.g:263:10: lv_monatl_kosten_9_0= RULE_PRICE
            	    	    {
            	    	    lv_monatl_kosten_9_0=(Token)match(input,RULE_PRICE,FOLLOW_8); 

            	    	    										newLeafNode(lv_monatl_kosten_9_0, grammarAccess.getVertragAccess().getMonatl_kostenPRICETerminalRuleCall_2_1_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getVertragRule());
            	    	    										}
            	    	    										setWithLastConsumed(
            	    	    											current,
            	    	    											"monatl_kosten",
            	    	    											lv_monatl_kosten_9_0,
            	    	    											"org.xtext.example.mydsl.Vertrag.PRICE");
            	    	    									

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVertrag.g:285:3: ({...}? => ( ({...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) ) )+ ) )
            	    {
            	    // InternalVertrag.g:285:3: ({...}? => ( ({...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) ) )+ ) )
            	    // InternalVertrag.g:286:4: {...}? => ( ({...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalVertrag.g:286:101: ( ({...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) ) )+ )
            	    // InternalVertrag.g:287:5: ({...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalVertrag.g:290:8: ({...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==18) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalVertrag.g:290:9: {...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalVertrag.g:290:18: (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) )
            	    	    // InternalVertrag.g:290:19: otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,18,FOLLOW_10); 

            	    	    								newLeafNode(otherlv_10, grammarAccess.getVertragAccess().getInternetseiteKeyword_3_0());
            	    	    							
            	    	    // InternalVertrag.g:294:8: ( (lv_internetseite_11_0= RULE_ID ) )
            	    	    // InternalVertrag.g:295:9: (lv_internetseite_11_0= RULE_ID )
            	    	    {
            	    	    // InternalVertrag.g:295:9: (lv_internetseite_11_0= RULE_ID )
            	    	    // InternalVertrag.g:296:10: lv_internetseite_11_0= RULE_ID
            	    	    {
            	    	    lv_internetseite_11_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    	    										newLeafNode(lv_internetseite_11_0, grammarAccess.getVertragAccess().getInternetseiteIDTerminalRuleCall_3_1_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getVertragRule());
            	    	    										}
            	    	    										setWithLastConsumed(
            	    	    											current,
            	    	    											"internetseite",
            	    	    											lv_internetseite_11_0,
            	    	    											"org.xtext.example.mydsl.Vertrag.ID");
            	    	    									

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalVertrag.g:318:3: ({...}? => ( ({...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) ) )+ ) )
            	    {
            	    // InternalVertrag.g:318:3: ({...}? => ( ({...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) ) )+ ) )
            	    // InternalVertrag.g:319:4: {...}? => ( ({...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalVertrag.g:319:101: ( ({...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) ) )+ )
            	    // InternalVertrag.g:320:5: ({...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalVertrag.g:323:8: ({...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==19) ) {
            	            int LA7_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt7=1;
            	            }


            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalVertrag.g:323:9: {...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalVertrag.g:323:18: (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) )
            	    	    // InternalVertrag.g:323:19: otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,19,FOLLOW_11); 

            	    	    								newLeafNode(otherlv_12, grammarAccess.getVertragAccess().getNetzanbieterKeyword_4_0());
            	    	    							
            	    	    // InternalVertrag.g:327:8: ( (lv_value_13_0= ruleNetzanbieter ) )
            	    	    // InternalVertrag.g:328:9: (lv_value_13_0= ruleNetzanbieter )
            	    	    {
            	    	    // InternalVertrag.g:328:9: (lv_value_13_0= ruleNetzanbieter )
            	    	    // InternalVertrag.g:329:10: lv_value_13_0= ruleNetzanbieter
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getVertragAccess().getValueNetzanbieterEnumRuleCall_4_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_value_13_0=ruleNetzanbieter();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getVertragRule());
            	    	    										}
            	    	    										set(
            	    	    											current,
            	    	    											"value",
            	    	    											lv_value_13_0,
            	    	    											"org.xtext.example.mydsl.Vertrag.Netzanbieter");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt7 >= 1 ) break loop7;
            	                EarlyExitException eee =
            	                    new EarlyExitException(7, input);
            	                throw eee;
            	        }
            	        cnt7++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalVertrag.g:352:3: ({...}? => ( ({...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) ) )+ ) )
            	    {
            	    // InternalVertrag.g:352:3: ({...}? => ( ({...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) ) )+ ) )
            	    // InternalVertrag.g:353:4: {...}? => ( ({...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalVertrag.g:353:101: ( ({...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) ) )+ )
            	    // InternalVertrag.g:354:5: ({...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalVertrag.g:357:8: ({...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) ) )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==20) ) {
            	            int LA8_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt8=1;
            	            }


            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalVertrag.g:357:9: {...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalVertrag.g:357:18: (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) )
            	    	    // InternalVertrag.g:357:19: otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,20,FOLLOW_10); 

            	    	    								newLeafNode(otherlv_14, grammarAccess.getVertragAccess().getTelefonFlatKeyword_5_0());
            	    	    							
            	    	    // InternalVertrag.g:361:8: ( (lv_telefonflat_15_0= RULE_ID ) )
            	    	    // InternalVertrag.g:362:9: (lv_telefonflat_15_0= RULE_ID )
            	    	    {
            	    	    // InternalVertrag.g:362:9: (lv_telefonflat_15_0= RULE_ID )
            	    	    // InternalVertrag.g:363:10: lv_telefonflat_15_0= RULE_ID
            	    	    {
            	    	    lv_telefonflat_15_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    	    										newLeafNode(lv_telefonflat_15_0, grammarAccess.getVertragAccess().getTelefonflatIDTerminalRuleCall_5_1_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getVertragRule());
            	    	    										}
            	    	    										setWithLastConsumed(
            	    	    											current,
            	    	    											"telefonflat",
            	    	    											lv_telefonflat_15_0,
            	    	    											"org.xtext.example.mydsl.Vertrag.ID");
            	    	    									

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalVertrag.g:385:3: ({...}? => ( ({...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) ) )+ ) )
            	    {
            	    // InternalVertrag.g:385:3: ({...}? => ( ({...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) ) )+ ) )
            	    // InternalVertrag.g:386:4: {...}? => ( ({...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalVertrag.g:386:101: ( ({...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) ) )+ )
            	    // InternalVertrag.g:387:5: ({...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalVertrag.g:390:8: ({...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==21) ) {
            	            int LA9_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt9=1;
            	            }


            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalVertrag.g:390:9: {...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalVertrag.g:390:18: (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) )
            	    	    // InternalVertrag.g:390:19: otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_16=(Token)match(input,21,FOLLOW_10); 

            	    	    								newLeafNode(otherlv_16, grammarAccess.getVertragAccess().getSmsFlatKeyword_6_0());
            	    	    							
            	    	    // InternalVertrag.g:394:8: ( (lv_smsflat_17_0= RULE_ID ) )
            	    	    // InternalVertrag.g:395:9: (lv_smsflat_17_0= RULE_ID )
            	    	    {
            	    	    // InternalVertrag.g:395:9: (lv_smsflat_17_0= RULE_ID )
            	    	    // InternalVertrag.g:396:10: lv_smsflat_17_0= RULE_ID
            	    	    {
            	    	    lv_smsflat_17_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    	    										newLeafNode(lv_smsflat_17_0, grammarAccess.getVertragAccess().getSmsflatIDTerminalRuleCall_6_1_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getVertragRule());
            	    	    										}
            	    	    										setWithLastConsumed(
            	    	    											current,
            	    	    											"smsflat",
            	    	    											lv_smsflat_17_0,
            	    	    											"org.xtext.example.mydsl.Vertrag.ID");
            	    	    									

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalVertrag.g:418:3: ({...}? => ( ({...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) ) )+ ) )
            	    {
            	    // InternalVertrag.g:418:3: ({...}? => ( ({...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) ) )+ ) )
            	    // InternalVertrag.g:419:4: {...}? => ( ({...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalVertrag.g:419:101: ( ({...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) ) )+ )
            	    // InternalVertrag.g:420:5: ({...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalVertrag.g:423:8: ({...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) ) )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==22) ) {
            	            int LA10_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt10=1;
            	            }


            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalVertrag.g:423:9: {...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalVertrag.g:423:18: (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) )
            	    	    // InternalVertrag.g:423:19: otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,22,FOLLOW_10); 

            	    	    								newLeafNode(otherlv_18, grammarAccess.getVertragAccess().getGeraetKeyword_7_0());
            	    	    							
            	    	    // InternalVertrag.g:427:8: ( (otherlv_19= RULE_ID ) )
            	    	    // InternalVertrag.g:428:9: (otherlv_19= RULE_ID )
            	    	    {
            	    	    // InternalVertrag.g:428:9: (otherlv_19= RULE_ID )
            	    	    // InternalVertrag.g:429:10: otherlv_19= RULE_ID
            	    	    {

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getVertragRule());
            	    	    										}
            	    	    									
            	    	    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_19, grammarAccess.getVertragAccess().getGeraetHandyCrossReference_7_1_0());
            	    	    									

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt10 >= 1 ) break loop10;
            	                EarlyExitException eee =
            	                    new EarlyExitException(10, input);
            	                throw eee;
            	        }
            	        cnt10++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalVertrag.g:446:3: ({...}? => ( ({...}? => (otherlv_20= '}' ) ) ) )
            	    {
            	    // InternalVertrag.g:446:3: ({...}? => ( ({...}? => (otherlv_20= '}' ) ) ) )
            	    // InternalVertrag.g:447:4: {...}? => ( ({...}? => (otherlv_20= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalVertrag.g:447:101: ( ({...}? => (otherlv_20= '}' ) ) )
            	    // InternalVertrag.g:448:5: ({...}? => (otherlv_20= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalVertrag.g:451:8: ({...}? => (otherlv_20= '}' ) )
            	    // InternalVertrag.g:451:9: {...}? => (otherlv_20= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    }
            	    // InternalVertrag.g:451:18: (otherlv_20= '}' )
            	    // InternalVertrag.g:451:19: otherlv_20= '}'
            	    {
            	    otherlv_20=(Token)match(input,23,FOLLOW_8); 

            	    								newLeafNode(otherlv_20, grammarAccess.getVertragAccess().getRightCurlyBracketKeyword_8());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getVertragAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVertrag"


    // $ANTLR start "entryRuleHandy"
    // InternalVertrag.g:472:1: entryRuleHandy returns [EObject current=null] : iv_ruleHandy= ruleHandy EOF ;
    public final EObject entryRuleHandy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandy = null;


        try {
            // InternalVertrag.g:472:46: (iv_ruleHandy= ruleHandy EOF )
            // InternalVertrag.g:473:2: iv_ruleHandy= ruleHandy EOF
            {
             newCompositeNode(grammarAccess.getHandyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHandy=ruleHandy();

            state._fsp--;

             current =iv_ruleHandy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHandy"


    // $ANTLR start "ruleHandy"
    // InternalVertrag.g:479:1: ruleHandy returns [EObject current=null] : (otherlv_0= 'handy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_system_3_0= ruleBetriebssystem ) ) ( (lv_marke_4_0= ruleMarke ) ) ( (lv_speicher_5_0= RULE_ID ) ) otherlv_6= '}' ) ;
    public final EObject ruleHandy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_speicher_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_system_3_0 = null;

        Enumerator lv_marke_4_0 = null;



        	enterRule();

        try {
            // InternalVertrag.g:485:2: ( (otherlv_0= 'handy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_system_3_0= ruleBetriebssystem ) ) ( (lv_marke_4_0= ruleMarke ) ) ( (lv_speicher_5_0= RULE_ID ) ) otherlv_6= '}' ) )
            // InternalVertrag.g:486:2: (otherlv_0= 'handy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_system_3_0= ruleBetriebssystem ) ) ( (lv_marke_4_0= ruleMarke ) ) ( (lv_speicher_5_0= RULE_ID ) ) otherlv_6= '}' )
            {
            // InternalVertrag.g:486:2: (otherlv_0= 'handy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_system_3_0= ruleBetriebssystem ) ) ( (lv_marke_4_0= ruleMarke ) ) ( (lv_speicher_5_0= RULE_ID ) ) otherlv_6= '}' )
            // InternalVertrag.g:487:3: otherlv_0= 'handy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_system_3_0= ruleBetriebssystem ) ) ( (lv_marke_4_0= ruleMarke ) ) ( (lv_speicher_5_0= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getHandyAccess().getHandyKeyword_0());
            		
            // InternalVertrag.g:491:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertrag.g:492:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertrag.g:492:4: (lv_name_1_0= RULE_ID )
            // InternalVertrag.g:493:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getHandyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHandyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.Vertrag.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getHandyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVertrag.g:513:3: ( (lv_system_3_0= ruleBetriebssystem ) )
            // InternalVertrag.g:514:4: (lv_system_3_0= ruleBetriebssystem )
            {
            // InternalVertrag.g:514:4: (lv_system_3_0= ruleBetriebssystem )
            // InternalVertrag.g:515:5: lv_system_3_0= ruleBetriebssystem
            {

            					newCompositeNode(grammarAccess.getHandyAccess().getSystemBetriebssystemEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_system_3_0=ruleBetriebssystem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHandyRule());
            					}
            					set(
            						current,
            						"system",
            						true,
            						"org.xtext.example.mydsl.Vertrag.Betriebssystem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertrag.g:532:3: ( (lv_marke_4_0= ruleMarke ) )
            // InternalVertrag.g:533:4: (lv_marke_4_0= ruleMarke )
            {
            // InternalVertrag.g:533:4: (lv_marke_4_0= ruleMarke )
            // InternalVertrag.g:534:5: lv_marke_4_0= ruleMarke
            {

            					newCompositeNode(grammarAccess.getHandyAccess().getMarkeMarkeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_marke_4_0=ruleMarke();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHandyRule());
            					}
            					set(
            						current,
            						"marke",
            						true,
            						"org.xtext.example.mydsl.Vertrag.Marke");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertrag.g:551:3: ( (lv_speicher_5_0= RULE_ID ) )
            // InternalVertrag.g:552:4: (lv_speicher_5_0= RULE_ID )
            {
            // InternalVertrag.g:552:4: (lv_speicher_5_0= RULE_ID )
            // InternalVertrag.g:553:5: lv_speicher_5_0= RULE_ID
            {
            lv_speicher_5_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_speicher_5_0, grammarAccess.getHandyAccess().getSpeicherIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHandyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"speicher",
            						true,
            						"org.xtext.example.mydsl.Vertrag.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getHandyAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHandy"


    // $ANTLR start "ruleNetzanbieter"
    // InternalVertrag.g:577:1: ruleNetzanbieter returns [Enumerator current=null] : ( (enumLiteral_0= 'O2' ) | (enumLiteral_1= 'TELEKOM' ) | (enumLiteral_2= 'VODAFON' ) ) ;
    public final Enumerator ruleNetzanbieter() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalVertrag.g:583:2: ( ( (enumLiteral_0= 'O2' ) | (enumLiteral_1= 'TELEKOM' ) | (enumLiteral_2= 'VODAFON' ) ) )
            // InternalVertrag.g:584:2: ( (enumLiteral_0= 'O2' ) | (enumLiteral_1= 'TELEKOM' ) | (enumLiteral_2= 'VODAFON' ) )
            {
            // InternalVertrag.g:584:2: ( (enumLiteral_0= 'O2' ) | (enumLiteral_1= 'TELEKOM' ) | (enumLiteral_2= 'VODAFON' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalVertrag.g:585:3: (enumLiteral_0= 'O2' )
                    {
                    // InternalVertrag.g:585:3: (enumLiteral_0= 'O2' )
                    // InternalVertrag.g:586:4: enumLiteral_0= 'O2'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getNetzanbieterAccess().getO2EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNetzanbieterAccess().getO2EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertrag.g:593:3: (enumLiteral_1= 'TELEKOM' )
                    {
                    // InternalVertrag.g:593:3: (enumLiteral_1= 'TELEKOM' )
                    // InternalVertrag.g:594:4: enumLiteral_1= 'TELEKOM'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getNetzanbieterAccess().getTELEKOMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNetzanbieterAccess().getTELEKOMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertrag.g:601:3: (enumLiteral_2= 'VODAFON' )
                    {
                    // InternalVertrag.g:601:3: (enumLiteral_2= 'VODAFON' )
                    // InternalVertrag.g:602:4: enumLiteral_2= 'VODAFON'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getNetzanbieterAccess().getVODAFONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNetzanbieterAccess().getVODAFONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNetzanbieter"


    // $ANTLR start "ruleBetriebssystem"
    // InternalVertrag.g:612:1: ruleBetriebssystem returns [Enumerator current=null] : ( (enumLiteral_0= 'ANDROID' ) | (enumLiteral_1= 'IOS' ) ) ;
    public final Enumerator ruleBetriebssystem() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertrag.g:618:2: ( ( (enumLiteral_0= 'ANDROID' ) | (enumLiteral_1= 'IOS' ) ) )
            // InternalVertrag.g:619:2: ( (enumLiteral_0= 'ANDROID' ) | (enumLiteral_1= 'IOS' ) )
            {
            // InternalVertrag.g:619:2: ( (enumLiteral_0= 'ANDROID' ) | (enumLiteral_1= 'IOS' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            else if ( (LA13_0==29) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalVertrag.g:620:3: (enumLiteral_0= 'ANDROID' )
                    {
                    // InternalVertrag.g:620:3: (enumLiteral_0= 'ANDROID' )
                    // InternalVertrag.g:621:4: enumLiteral_0= 'ANDROID'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getBetriebssystemAccess().getANDROIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBetriebssystemAccess().getANDROIDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertrag.g:628:3: (enumLiteral_1= 'IOS' )
                    {
                    // InternalVertrag.g:628:3: (enumLiteral_1= 'IOS' )
                    // InternalVertrag.g:629:4: enumLiteral_1= 'IOS'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getBetriebssystemAccess().getIOSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBetriebssystemAccess().getIOSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBetriebssystem"


    // $ANTLR start "ruleMarke"
    // InternalVertrag.g:639:1: ruleMarke returns [Enumerator current=null] : ( (enumLiteral_0= 'SAMSUNG' ) | (enumLiteral_1= 'IPHONE' ) ) ;
    public final Enumerator ruleMarke() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertrag.g:645:2: ( ( (enumLiteral_0= 'SAMSUNG' ) | (enumLiteral_1= 'IPHONE' ) ) )
            // InternalVertrag.g:646:2: ( (enumLiteral_0= 'SAMSUNG' ) | (enumLiteral_1= 'IPHONE' ) )
            {
            // InternalVertrag.g:646:2: ( (enumLiteral_0= 'SAMSUNG' ) | (enumLiteral_1= 'IPHONE' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            else if ( (LA14_0==31) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalVertrag.g:647:3: (enumLiteral_0= 'SAMSUNG' )
                    {
                    // InternalVertrag.g:647:3: (enumLiteral_0= 'SAMSUNG' )
                    // InternalVertrag.g:648:4: enumLiteral_0= 'SAMSUNG'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getMarkeAccess().getSAMSUNGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMarkeAccess().getSAMSUNGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertrag.g:655:3: (enumLiteral_1= 'IPHONE' )
                    {
                    // InternalVertrag.g:655:3: (enumLiteral_1= 'IPHONE' )
                    // InternalVertrag.g:656:4: enumLiteral_1= 'IPHONE'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getMarkeAccess().getIPHONEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMarkeAccess().getIPHONEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarke"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\1\1\23\uffff";
    static final String dfa_3s = "\1\15\1\uffff\11\0\11\uffff";
    static final String dfa_4s = "\1\30\1\uffff\11\0\11\uffff";
    static final String dfa_5s = "\1\uffff\1\12\11\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_6s = "\2\uffff\1\7\1\2\1\6\1\0\1\4\1\5\1\10\1\1\1\3\11\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 157:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_PRICE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'internetseite' ( (lv_internetseite_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'netzanbieter' ( (lv_value_13_0= ruleNetzanbieter ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= 'telefon-flat' ( (lv_telefonflat_15_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_16= 'sms-flat' ( (lv_smsflat_17_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_18= 'geraet' ( (otherlv_19= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_20= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 3) ) {s = 14;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 7) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 1) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 8) ) {s = 19;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index11_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 4) ) {s = 15;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 5) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 2) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 0) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 6) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001FF2002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000FFA002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000FF2002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});

}

package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ZEICHENFOLGE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Vertrag'", "'{'", "'datenvolumen'", "'mindestvertragslaufzeit'", "'monatl_kosten'", "'netzanbieter'", "'}'", "'handy'"
    };
    public static final int RULE_ZEICHENFOLGE=4;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;

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
    // InternalVertrag.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalVertrag.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalVertrag.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalVertrag.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalVertrag.g:77:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalVertrag.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalVertrag.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=15 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVertrag.g:79:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalVertrag.g:79:3: (lv_elements_0_0= ruleElement )
            	    // InternalVertrag.g:80:4: lv_elements_0_0= ruleElement
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
    // InternalVertrag.g:100:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalVertrag.g:100:48: (iv_ruleElement= ruleElement EOF )
            // InternalVertrag.g:101:2: iv_ruleElement= ruleElement EOF
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
    // InternalVertrag.g:107:1: ruleElement returns [EObject current=null] : (this_Vertrag_0= ruleVertrag | this_Handy_1= ruleHandy ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Vertrag_0 = null;

        EObject this_Handy_1 = null;



        	enterRule();

        try {
            // InternalVertrag.g:113:2: ( (this_Vertrag_0= ruleVertrag | this_Handy_1= ruleHandy ) )
            // InternalVertrag.g:114:2: (this_Vertrag_0= ruleVertrag | this_Handy_1= ruleHandy )
            {
            // InternalVertrag.g:114:2: (this_Vertrag_0= ruleVertrag | this_Handy_1= ruleHandy )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12||(LA2_0>=15 && LA2_0<=18)) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalVertrag.g:115:3: this_Vertrag_0= ruleVertrag
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
                    // InternalVertrag.g:124:3: this_Handy_1= ruleHandy
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
    // InternalVertrag.g:136:1: entryRuleVertrag returns [EObject current=null] : iv_ruleVertrag= ruleVertrag EOF ;
    public final EObject entryRuleVertrag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVertrag = null;


        try {
            // InternalVertrag.g:136:48: (iv_ruleVertrag= ruleVertrag EOF )
            // InternalVertrag.g:137:2: iv_ruleVertrag= ruleVertrag EOF
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
    // InternalVertrag.g:143:1: ruleVertrag returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleVertrag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_datenvolumen_5_0=null;
        Token otherlv_6=null;
        Token lv_mindestvertragslaufzeit_7_0=null;
        Token otherlv_8=null;
        Token lv_monatl_kosten_9_0=null;
        Token otherlv_10=null;
        Token lv_netzanbieter_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalVertrag.g:149:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalVertrag.g:150:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalVertrag.g:150:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= '}' ) ) ) ) )+ {...}?) ) )
            // InternalVertrag.g:151:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalVertrag.g:151:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= '}' ) ) ) ) )+ {...}?) )
            // InternalVertrag.g:152:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getVertragAccess().getUnorderedGroup());
            			
            // InternalVertrag.g:155:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= '}' ) ) ) ) )+ {...}?)
            // InternalVertrag.g:156:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= '}' ) ) ) ) )+ {...}?
            {
            // InternalVertrag.g:156:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= '}' ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=6;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // InternalVertrag.g:157:3: ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* ) ) ) )
            	    {
            	    // InternalVertrag.g:157:3: ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* ) ) ) )
            	    // InternalVertrag.g:158:4: {...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalVertrag.g:158:101: ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* ) ) )
            	    // InternalVertrag.g:159:5: ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalVertrag.g:162:8: ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* ) )
            	    // InternalVertrag.g:162:9: {...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    }
            	    // InternalVertrag.g:162:18: (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* )
            	    // InternalVertrag.g:162:19: otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )*
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_4); 

            	    								newLeafNode(otherlv_1, grammarAccess.getVertragAccess().getVertragKeyword_0_0());
            	    							
            	    // InternalVertrag.g:166:8: ( (lv_name_2_0= RULE_ZEICHENFOLGE ) )
            	    // InternalVertrag.g:167:9: (lv_name_2_0= RULE_ZEICHENFOLGE )
            	    {
            	    // InternalVertrag.g:167:9: (lv_name_2_0= RULE_ZEICHENFOLGE )
            	    // InternalVertrag.g:168:10: lv_name_2_0= RULE_ZEICHENFOLGE
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

            	    otherlv_3=(Token)match(input,13,FOLLOW_6); 

            	    								newLeafNode(otherlv_3, grammarAccess.getVertragAccess().getLeftCurlyBracketKeyword_0_2());
            	    							
            	    // InternalVertrag.g:188:8: (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==14) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalVertrag.g:189:9: otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,14,FOLLOW_4); 

            	    	    									newLeafNode(otherlv_4, grammarAccess.getVertragAccess().getDatenvolumenKeyword_0_3_0());
            	    	    								
            	    	    // InternalVertrag.g:193:9: ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) )
            	    	    // InternalVertrag.g:194:10: (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE )
            	    	    {
            	    	    // InternalVertrag.g:194:10: (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE )
            	    	    // InternalVertrag.g:195:11: lv_datenvolumen_5_0= RULE_ZEICHENFOLGE
            	    	    {
            	    	    lv_datenvolumen_5_0=(Token)match(input,RULE_ZEICHENFOLGE,FOLLOW_6); 

            	    	    											newLeafNode(lv_datenvolumen_5_0, grammarAccess.getVertragAccess().getDatenvolumenZEICHENFOLGETerminalRuleCall_0_3_1_0());
            	    	    										

            	    	    											if (current==null) {
            	    	    												current = createModelElement(grammarAccess.getVertragRule());
            	    	    											}
            	    	    											setWithLastConsumed(
            	    	    												current,
            	    	    												"datenvolumen",
            	    	    												lv_datenvolumen_5_0,
            	    	    												"org.xtext.example.mydsl.Vertrag.ZEICHENFOLGE");
            	    	    										

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
            	    // InternalVertrag.g:218:3: ({...}? => ( ({...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) ) )+ ) )
            	    {
            	    // InternalVertrag.g:218:3: ({...}? => ( ({...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) ) )+ ) )
            	    // InternalVertrag.g:219:4: {...}? => ( ({...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalVertrag.g:219:101: ( ({...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) ) )+ )
            	    // InternalVertrag.g:220:5: ({...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalVertrag.g:223:8: ({...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==15) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalVertrag.g:223:9: {...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalVertrag.g:223:18: (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) )
            	    	    // InternalVertrag.g:223:19: otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,15,FOLLOW_4); 

            	    	    								newLeafNode(otherlv_6, grammarAccess.getVertragAccess().getMindestvertragslaufzeitKeyword_1_0());
            	    	    							
            	    	    // InternalVertrag.g:227:8: ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) )
            	    	    // InternalVertrag.g:228:9: (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE )
            	    	    {
            	    	    // InternalVertrag.g:228:9: (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE )
            	    	    // InternalVertrag.g:229:10: lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE
            	    	    {
            	    	    lv_mindestvertragslaufzeit_7_0=(Token)match(input,RULE_ZEICHENFOLGE,FOLLOW_7); 

            	    	    										newLeafNode(lv_mindestvertragslaufzeit_7_0, grammarAccess.getVertragAccess().getMindestvertragslaufzeitZEICHENFOLGETerminalRuleCall_1_1_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getVertragRule());
            	    	    										}
            	    	    										setWithLastConsumed(
            	    	    											current,
            	    	    											"mindestvertragslaufzeit",
            	    	    											lv_mindestvertragslaufzeit_7_0,
            	    	    											"org.xtext.example.mydsl.Vertrag.ZEICHENFOLGE");
            	    	    									

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
            	    // InternalVertrag.g:251:3: ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) ) )+ ) )
            	    {
            	    // InternalVertrag.g:251:3: ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) ) )+ ) )
            	    // InternalVertrag.g:252:4: {...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalVertrag.g:252:101: ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) ) )+ )
            	    // InternalVertrag.g:253:5: ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalVertrag.g:256:8: ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==16) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalVertrag.g:256:9: {...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalVertrag.g:256:18: (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) )
            	    	    // InternalVertrag.g:256:19: otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,16,FOLLOW_4); 

            	    	    								newLeafNode(otherlv_8, grammarAccess.getVertragAccess().getMonatl_kostenKeyword_2_0());
            	    	    							
            	    	    // InternalVertrag.g:260:8: ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) )
            	    	    // InternalVertrag.g:261:9: (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE )
            	    	    {
            	    	    // InternalVertrag.g:261:9: (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE )
            	    	    // InternalVertrag.g:262:10: lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE
            	    	    {
            	    	    lv_monatl_kosten_9_0=(Token)match(input,RULE_ZEICHENFOLGE,FOLLOW_7); 

            	    	    										newLeafNode(lv_monatl_kosten_9_0, grammarAccess.getVertragAccess().getMonatl_kostenZEICHENFOLGETerminalRuleCall_2_1_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getVertragRule());
            	    	    										}
            	    	    										setWithLastConsumed(
            	    	    											current,
            	    	    											"monatl_kosten",
            	    	    											lv_monatl_kosten_9_0,
            	    	    											"org.xtext.example.mydsl.Vertrag.ZEICHENFOLGE");
            	    	    									

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
            	    // InternalVertrag.g:284:3: ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) ) )+ ) )
            	    {
            	    // InternalVertrag.g:284:3: ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) ) )+ ) )
            	    // InternalVertrag.g:285:4: {...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalVertrag.g:285:101: ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) ) )+ )
            	    // InternalVertrag.g:286:5: ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalVertrag.g:289:8: ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==17) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalVertrag.g:289:9: {...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalVertrag.g:289:18: (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) )
            	    	    // InternalVertrag.g:289:19: otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,17,FOLLOW_4); 

            	    	    								newLeafNode(otherlv_10, grammarAccess.getVertragAccess().getNetzanbieterKeyword_3_0());
            	    	    							
            	    	    // InternalVertrag.g:293:8: ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) )
            	    	    // InternalVertrag.g:294:9: (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE )
            	    	    {
            	    	    // InternalVertrag.g:294:9: (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE )
            	    	    // InternalVertrag.g:295:10: lv_netzanbieter_11_0= RULE_ZEICHENFOLGE
            	    	    {
            	    	    lv_netzanbieter_11_0=(Token)match(input,RULE_ZEICHENFOLGE,FOLLOW_7); 

            	    	    										newLeafNode(lv_netzanbieter_11_0, grammarAccess.getVertragAccess().getNetzanbieterZEICHENFOLGETerminalRuleCall_3_1_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getVertragRule());
            	    	    										}
            	    	    										setWithLastConsumed(
            	    	    											current,
            	    	    											"netzanbieter",
            	    	    											lv_netzanbieter_11_0,
            	    	    											"org.xtext.example.mydsl.Vertrag.ZEICHENFOLGE");
            	    	    									

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
            	    // InternalVertrag.g:317:3: ({...}? => ( ({...}? => (otherlv_12= '}' ) ) ) )
            	    {
            	    // InternalVertrag.g:317:3: ({...}? => ( ({...}? => (otherlv_12= '}' ) ) ) )
            	    // InternalVertrag.g:318:4: {...}? => ( ({...}? => (otherlv_12= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalVertrag.g:318:101: ( ({...}? => (otherlv_12= '}' ) ) )
            	    // InternalVertrag.g:319:5: ({...}? => (otherlv_12= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalVertrag.g:322:8: ({...}? => (otherlv_12= '}' ) )
            	    // InternalVertrag.g:322:9: {...}? => (otherlv_12= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    }
            	    // InternalVertrag.g:322:18: (otherlv_12= '}' )
            	    // InternalVertrag.g:322:19: otherlv_12= '}'
            	    {
            	    otherlv_12=(Token)match(input,18,FOLLOW_7); 

            	    								newLeafNode(otherlv_12, grammarAccess.getVertragAccess().getRightCurlyBracketKeyword_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

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
    // InternalVertrag.g:343:1: entryRuleHandy returns [EObject current=null] : iv_ruleHandy= ruleHandy EOF ;
    public final EObject entryRuleHandy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandy = null;


        try {
            // InternalVertrag.g:343:46: (iv_ruleHandy= ruleHandy EOF )
            // InternalVertrag.g:344:2: iv_ruleHandy= ruleHandy EOF
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
    // InternalVertrag.g:350:1: ruleHandy returns [EObject current=null] : (otherlv_0= 'handy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_system_3_0= RULE_ID ) ) ( (lv_marke_4_0= RULE_ID ) ) ( (lv_speicher_5_0= RULE_ID ) ) otherlv_6= '}' ) ;
    public final EObject ruleHandy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_system_3_0=null;
        Token lv_marke_4_0=null;
        Token lv_speicher_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalVertrag.g:356:2: ( (otherlv_0= 'handy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_system_3_0= RULE_ID ) ) ( (lv_marke_4_0= RULE_ID ) ) ( (lv_speicher_5_0= RULE_ID ) ) otherlv_6= '}' ) )
            // InternalVertrag.g:357:2: (otherlv_0= 'handy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_system_3_0= RULE_ID ) ) ( (lv_marke_4_0= RULE_ID ) ) ( (lv_speicher_5_0= RULE_ID ) ) otherlv_6= '}' )
            {
            // InternalVertrag.g:357:2: (otherlv_0= 'handy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_system_3_0= RULE_ID ) ) ( (lv_marke_4_0= RULE_ID ) ) ( (lv_speicher_5_0= RULE_ID ) ) otherlv_6= '}' )
            // InternalVertrag.g:358:3: otherlv_0= 'handy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_system_3_0= RULE_ID ) ) ( (lv_marke_4_0= RULE_ID ) ) ( (lv_speicher_5_0= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getHandyAccess().getHandyKeyword_0());
            		
            // InternalVertrag.g:362:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertrag.g:363:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertrag.g:363:4: (lv_name_1_0= RULE_ID )
            // InternalVertrag.g:364:5: lv_name_1_0= RULE_ID
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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getHandyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVertrag.g:384:3: ( (lv_system_3_0= RULE_ID ) )
            // InternalVertrag.g:385:4: (lv_system_3_0= RULE_ID )
            {
            // InternalVertrag.g:385:4: (lv_system_3_0= RULE_ID )
            // InternalVertrag.g:386:5: lv_system_3_0= RULE_ID
            {
            lv_system_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_system_3_0, grammarAccess.getHandyAccess().getSystemIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHandyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"system",
            						true,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalVertrag.g:402:3: ( (lv_marke_4_0= RULE_ID ) )
            // InternalVertrag.g:403:4: (lv_marke_4_0= RULE_ID )
            {
            // InternalVertrag.g:403:4: (lv_marke_4_0= RULE_ID )
            // InternalVertrag.g:404:5: lv_marke_4_0= RULE_ID
            {
            lv_marke_4_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_marke_4_0, grammarAccess.getHandyAccess().getMarkeIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHandyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"marke",
            						true,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalVertrag.g:420:3: ( (lv_speicher_5_0= RULE_ID ) )
            // InternalVertrag.g:421:4: (lv_speicher_5_0= RULE_ID )
            {
            // InternalVertrag.g:421:4: (lv_speicher_5_0= RULE_ID )
            // InternalVertrag.g:422:5: lv_speicher_5_0= RULE_ID
            {
            lv_speicher_5_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_speicher_5_0, grammarAccess.getHandyAccess().getSpeicherIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHandyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"speicher",
            						true,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\14\1\uffff\5\0\5\uffff";
    static final String dfa_4s = "\1\23\1\uffff\5\0\5\uffff";
    static final String dfa_5s = "\1\uffff\1\6\5\uffff\1\1\1\2\1\3\1\4\1\5";
    static final String dfa_6s = "\2\uffff\1\3\1\4\1\2\1\0\1\1\5\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\2\uffff\1\3\1\4\1\5\1\6\1\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 156:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ZEICHENFOLGE ) ) otherlv_3= '{' (otherlv_4= 'datenvolumen' ( (lv_datenvolumen_5_0= RULE_ZEICHENFOLGE ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_7_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ZEICHENFOLGE ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 3) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_6 = input.LA(1);

                         
                        int index7_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 4) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index7_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_4 = input.LA(1);

                         
                        int index7_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index7_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 0) ) {s = 7;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 1) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index7_3);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000F9002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000007D002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000079002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});

}

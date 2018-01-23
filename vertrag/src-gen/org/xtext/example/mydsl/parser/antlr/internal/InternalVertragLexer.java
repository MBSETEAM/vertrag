package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVertragLexer extends Lexer {
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

    public InternalVertragLexer() {;} 
    public InternalVertragLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalVertragLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalVertrag.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:11:7: ( 'Vertrag' )
            // InternalVertrag.g:11:9: 'Vertrag'
            {
            match("Vertrag"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:12:7: ( '{' )
            // InternalVertrag.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:13:7: ( 'mindestvertragslaufzeit' )
            // InternalVertrag.g:13:9: 'mindestvertragslaufzeit'
            {
            match("mindestvertragslaufzeit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:14:7: ( 'datenvolumen' )
            // InternalVertrag.g:14:9: 'datenvolumen'
            {
            match("datenvolumen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:15:7: ( 'monatl_kosten' )
            // InternalVertrag.g:15:9: 'monatl_kosten'
            {
            match("monatl_kosten"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:16:7: ( 'internetseite' )
            // InternalVertrag.g:16:9: 'internetseite'
            {
            match("internetseite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:17:7: ( 'netzanbieter' )
            // InternalVertrag.g:17:9: 'netzanbieter'
            {
            match("netzanbieter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:18:7: ( 'telefon-flat' )
            // InternalVertrag.g:18:9: 'telefon-flat'
            {
            match("telefon-flat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:19:7: ( 'sms-flat' )
            // InternalVertrag.g:19:9: 'sms-flat'
            {
            match("sms-flat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:20:7: ( 'geraet' )
            // InternalVertrag.g:20:9: 'geraet'
            {
            match("geraet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:21:7: ( '}' )
            // InternalVertrag.g:21:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:22:7: ( 'handy' )
            // InternalVertrag.g:22:9: 'handy'
            {
            match("handy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:23:7: ( 'O2' )
            // InternalVertrag.g:23:9: 'O2'
            {
            match("O2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:24:7: ( 'TELEKOM' )
            // InternalVertrag.g:24:9: 'TELEKOM'
            {
            match("TELEKOM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:25:7: ( 'VODAFON' )
            // InternalVertrag.g:25:9: 'VODAFON'
            {
            match("VODAFON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:26:7: ( 'ANDROID' )
            // InternalVertrag.g:26:9: 'ANDROID'
            {
            match("ANDROID"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:27:7: ( 'IOS' )
            // InternalVertrag.g:27:9: 'IOS'
            {
            match("IOS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:28:7: ( 'SAMSUNG' )
            // InternalVertrag.g:28:9: 'SAMSUNG'
            {
            match("SAMSUNG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:29:7: ( 'IPHONE' )
            // InternalVertrag.g:29:9: 'IPHONE'
            {
            match("IPHONE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_ZEICHENFOLGE"
    public final void mRULE_ZEICHENFOLGE() throws RecognitionException {
        try {
            int _type = RULE_ZEICHENFOLGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:665:19: ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )
            // InternalVertrag.g:665:21: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // InternalVertrag.g:665:21: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVertrag.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ZEICHENFOLGE"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:667:10: ( ( '0' .. '9' )+ )
            // InternalVertrag.g:667:12: ( '0' .. '9' )+
            {
            // InternalVertrag.g:667:12: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalVertrag.g:667:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_PRICE"
    public final void mRULE_PRICE() throws RecognitionException {
        try {
            int _type = RULE_PRICE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:669:12: ( ( '0' .. '9' )+ ',' '0' .. '9' '0' .. '9' )
            // InternalVertrag.g:669:14: ( '0' .. '9' )+ ',' '0' .. '9' '0' .. '9'
            {
            // InternalVertrag.g:669:14: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalVertrag.g:669:15: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match(','); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PRICE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:671:9: ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )
            // InternalVertrag.g:671:11: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // InternalVertrag.g:671:11: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalVertrag.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:673:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalVertrag.g:673:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalVertrag.g:673:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalVertrag.g:673:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalVertrag.g:673:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalVertrag.g:673:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVertrag.g:673:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalVertrag.g:673:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalVertrag.g:673:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalVertrag.g:673:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVertrag.g:673:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:675:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalVertrag.g:675:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalVertrag.g:675:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVertrag.g:675:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:677:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalVertrag.g:677:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalVertrag.g:677:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVertrag.g:677:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalVertrag.g:677:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVertrag.g:677:41: ( '\\r' )? '\\n'
                    {
                    // InternalVertrag.g:677:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalVertrag.g:677:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:679:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalVertrag.g:679:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalVertrag.g:679:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalVertrag.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:681:16: ( . )
            // InternalVertrag.g:681:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalVertrag.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_ZEICHENFOLGE | RULE_INT | RULE_PRICE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=28;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalVertrag.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalVertrag.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalVertrag.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalVertrag.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalVertrag.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalVertrag.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalVertrag.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalVertrag.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalVertrag.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalVertrag.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalVertrag.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalVertrag.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalVertrag.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalVertrag.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalVertrag.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalVertrag.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalVertrag.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalVertrag.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalVertrag.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalVertrag.g:1:124: RULE_ZEICHENFOLGE
                {
                mRULE_ZEICHENFOLGE(); 

                }
                break;
            case 21 :
                // InternalVertrag.g:1:142: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // InternalVertrag.g:1:151: RULE_PRICE
                {
                mRULE_PRICE(); 

                }
                break;
            case 23 :
                // InternalVertrag.g:1:162: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 24 :
                // InternalVertrag.g:1:170: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // InternalVertrag.g:1:182: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // InternalVertrag.g:1:198: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // InternalVertrag.g:1:214: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // InternalVertrag.g:1:222: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\32\1\uffff\7\32\1\uffff\10\32\3\27\2\uffff\2\32\1\uffff\1\32\1\uffff\10\32\1\uffff\1\32\1\76\6\32\5\uffff\13\32\1\uffff\2\32\1\121\12\32\1\uffff\4\32\1\uffff\13\32\1\153\14\32\1\170\1\uffff\2\32\1\173\1\32\1\175\1\176\1\32\1\uffff\4\32\1\uffff\1\u0084\1\u0085\1\uffff\1\u0086\2\uffff\4\32\4\uffff\15\32\1\u0098\1\32\1\u009a\1\32\1\uffff\1\u009c\1\uffff\1\32\1\uffff\10\32\1\u00a6\1\uffff";
    static final String DFA13_eofS =
        "\u00a7\uffff";
    static final String DFA13_minS =
        "\1\0\1\60\1\uffff\7\60\1\uffff\6\60\1\54\1\60\2\0\1\52\2\uffff\2\60\1\uffff\1\60\1\uffff\10\60\1\uffff\7\60\1\54\5\uffff\10\60\1\55\2\60\1\uffff\15\60\1\uffff\4\60\1\uffff\31\60\1\uffff\7\60\1\uffff\3\60\1\55\1\uffff\2\60\1\uffff\1\60\2\uffff\4\60\4\uffff\21\60\1\uffff\1\60\1\uffff\1\60\1\uffff\11\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\172\1\uffff\7\172\1\uffff\10\172\2\uffff\1\57\2\uffff\2\172\1\uffff\1\172\1\uffff\10\172\1\uffff\10\172\5\uffff\13\172\1\uffff\15\172\1\uffff\4\172\1\uffff\31\172\1\uffff\7\172\1\uffff\4\172\1\uffff\2\172\1\uffff\1\172\2\uffff\4\172\4\uffff\21\172\1\uffff\1\172\1\uffff\1\172\1\uffff\11\172\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\7\uffff\1\13\13\uffff\1\33\1\34\2\uffff\1\24\1\uffff\1\2\10\uffff\1\13\10\uffff\1\26\1\30\1\31\1\32\1\33\13\uffff\1\15\15\uffff\1\11\4\uffff\1\21\31\uffff\1\14\7\uffff\1\5\4\uffff\1\12\2\uffff\1\23\1\uffff\1\1\1\17\4\uffff\1\10\1\16\1\20\1\22\21\uffff\1\4\1\uffff\1\7\1\uffff\1\6\11\uffff\1\3";
    static final String DFA13_specialS =
        "\1\1\22\uffff\1\2\1\0\u0092\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\23\4\27\1\24\7\27\1\25\12\21\7\27\1\16\7\22\1\17\5\22\1\14\3\22\1\20\1\15\1\22\1\1\4\22\6\27\3\22\1\4\2\22\1\11\1\13\1\5\3\22\1\3\1\6\4\22\1\10\1\7\6\22\1\2\1\27\1\12\uff82\27",
            "\12\33\7\uffff\16\33\1\31\13\33\6\uffff\4\33\1\30\25\33",
            "",
            "\12\33\7\uffff\32\33\6\uffff\10\33\1\35\5\33\1\36\13\33",
            "\12\33\7\uffff\32\33\6\uffff\1\37\31\33",
            "\12\33\7\uffff\32\33\6\uffff\15\33\1\40\14\33",
            "\12\33\7\uffff\32\33\6\uffff\4\33\1\41\25\33",
            "\12\33\7\uffff\32\33\6\uffff\4\33\1\42\25\33",
            "\12\33\7\uffff\32\33\6\uffff\14\33\1\43\15\33",
            "\12\33\7\uffff\32\33\6\uffff\4\33\1\44\25\33",
            "",
            "\12\33\7\uffff\32\33\6\uffff\1\46\31\33",
            "\2\33\1\47\7\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\4\33\1\50\25\33\6\uffff\32\33",
            "\12\33\7\uffff\15\33\1\51\14\33\6\uffff\32\33",
            "\12\33\7\uffff\16\33\1\52\1\53\12\33\6\uffff\32\33",
            "\12\33\7\uffff\1\54\31\33\6\uffff\32\33",
            "\1\56\3\uffff\12\55\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\0\57",
            "\0\57",
            "\1\60\4\uffff\1\61",
            "",
            "",
            "\12\33\7\uffff\32\33\6\uffff\21\33\1\63\10\33",
            "\12\33\7\uffff\3\33\1\64\26\33\6\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\6\uffff\15\33\1\65\14\33",
            "\12\33\7\uffff\32\33\6\uffff\15\33\1\66\14\33",
            "\12\33\7\uffff\32\33\6\uffff\23\33\1\67\6\33",
            "\12\33\7\uffff\32\33\6\uffff\23\33\1\70\6\33",
            "\12\33\7\uffff\32\33\6\uffff\23\33\1\71\6\33",
            "\12\33\7\uffff\32\33\6\uffff\13\33\1\72\16\33",
            "\12\33\7\uffff\32\33\6\uffff\22\33\1\73\7\33",
            "\12\33\7\uffff\32\33\6\uffff\21\33\1\74\10\33",
            "",
            "\12\33\7\uffff\32\33\6\uffff\15\33\1\75\14\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\13\33\1\77\16\33\6\uffff\32\33",
            "\12\33\7\uffff\3\33\1\100\26\33\6\uffff\32\33",
            "\12\33\7\uffff\22\33\1\101\7\33\6\uffff\32\33",
            "\12\33\7\uffff\7\33\1\102\22\33\6\uffff\32\33",
            "\12\33\7\uffff\14\33\1\103\15\33\6\uffff\32\33",
            "\1\56\3\uffff\12\55\7\uffff\32\33\6\uffff\32\33",
            "",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\6\uffff\23\33\1\104\6\33",
            "\12\33\7\uffff\1\105\31\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\3\33\1\106\26\33",
            "\12\33\7\uffff\32\33\6\uffff\1\107\31\33",
            "\12\33\7\uffff\32\33\6\uffff\4\33\1\110\25\33",
            "\12\33\7\uffff\32\33\6\uffff\4\33\1\111\25\33",
            "\12\33\7\uffff\32\33\6\uffff\31\33\1\112",
            "\12\33\7\uffff\32\33\6\uffff\4\33\1\113\25\33",
            "\1\114\2\uffff\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\1\115\31\33",
            "\12\33\7\uffff\32\33\6\uffff\3\33\1\116\26\33",
            "",
            "\12\33\7\uffff\4\33\1\117\25\33\6\uffff\32\33",
            "\12\33\7\uffff\21\33\1\120\10\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\16\33\1\122\13\33\6\uffff\32\33",
            "\12\33\7\uffff\22\33\1\123\7\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\21\33\1\124\10\33",
            "\12\33\7\uffff\5\33\1\125\24\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\4\33\1\126\25\33",
            "\12\33\7\uffff\32\33\6\uffff\23\33\1\127\6\33",
            "\12\33\7\uffff\32\33\6\uffff\15\33\1\130\14\33",
            "\12\33\7\uffff\32\33\6\uffff\21\33\1\131\10\33",
            "\12\33\7\uffff\32\33\6\uffff\1\132\31\33",
            "\12\33\7\uffff\32\33\6\uffff\5\33\1\133\24\33",
            "",
            "\12\33\7\uffff\32\33\6\uffff\4\33\1\134\25\33",
            "\12\33\7\uffff\32\33\6\uffff\30\33\1\135\1\33",
            "\12\33\7\uffff\12\33\1\136\17\33\6\uffff\32\33",
            "\12\33\7\uffff\16\33\1\137\13\33\6\uffff\32\33",
            "",
            "\12\33\7\uffff\15\33\1\140\14\33\6\uffff\32\33",
            "\12\33\7\uffff\24\33\1\141\5\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\1\142\31\33",
            "\12\33\7\uffff\16\33\1\143\13\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\22\33\1\144\7\33",
            "\12\33\7\uffff\32\33\6\uffff\13\33\1\145\16\33",
            "\12\33\7\uffff\32\33\6\uffff\25\33\1\146\4\33",
            "\12\33\7\uffff\32\33\6\uffff\15\33\1\147\14\33",
            "\12\33\7\uffff\32\33\6\uffff\15\33\1\150\14\33",
            "\12\33\7\uffff\32\33\6\uffff\16\33\1\151\13\33",
            "\12\33\7\uffff\32\33\6\uffff\23\33\1\152\6\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\16\33\1\154\13\33\6\uffff\32\33",
            "\12\33\7\uffff\10\33\1\155\21\33\6\uffff\32\33",
            "\12\33\7\uffff\4\33\1\156\25\33\6\uffff\32\33",
            "\12\33\7\uffff\15\33\1\157\14\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\6\33\1\160\23\33",
            "\12\33\7\uffff\15\33\1\161\14\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\23\33\1\162\6\33",
            "\12\33\7\uffff\32\33\4\uffff\1\163\1\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\16\33\1\164\13\33",
            "\12\33\7\uffff\32\33\6\uffff\4\33\1\165\25\33",
            "\12\33\7\uffff\32\33\6\uffff\1\33\1\166\30\33",
            "\12\33\7\uffff\32\33\6\uffff\15\33\1\167\14\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "\12\33\7\uffff\14\33\1\171\15\33\6\uffff\32\33",
            "\12\33\7\uffff\3\33\1\172\26\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\6\33\1\174\23\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\25\33\1\177\4\33",
            "",
            "\12\33\7\uffff\32\33\6\uffff\13\33\1\u0080\16\33",
            "\12\33\7\uffff\32\33\6\uffff\23\33\1\u0081\6\33",
            "\12\33\7\uffff\32\33\6\uffff\10\33\1\u0082\21\33",
            "\1\u0083\2\uffff\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "",
            "\12\33\7\uffff\32\33\6\uffff\4\33\1\u0087\25\33",
            "\12\33\7\uffff\32\33\6\uffff\24\33\1\u0088\5\33",
            "\12\33\7\uffff\32\33\6\uffff\22\33\1\u0089\7\33",
            "\12\33\7\uffff\32\33\6\uffff\4\33\1\u008a\25\33",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\6\uffff\21\33\1\u008b\10\33",
            "\12\33\7\uffff\32\33\6\uffff\14\33\1\u008c\15\33",
            "\12\33\7\uffff\32\33\6\uffff\4\33\1\u008d\25\33",
            "\12\33\7\uffff\32\33\6\uffff\23\33\1\u008e\6\33",
            "\12\33\7\uffff\32\33\6\uffff\23\33\1\u008f\6\33",
            "\12\33\7\uffff\32\33\6\uffff\4\33\1\u0090\25\33",
            "\12\33\7\uffff\32\33\6\uffff\10\33\1\u0091\21\33",
            "\12\33\7\uffff\32\33\6\uffff\4\33\1\u0092\25\33",
            "\12\33\7\uffff\32\33\6\uffff\21\33\1\u0093\10\33",
            "\12\33\7\uffff\32\33\6\uffff\15\33\1\u0094\14\33",
            "\12\33\7\uffff\32\33\6\uffff\23\33\1\u0095\6\33",
            "\12\33\7\uffff\32\33\6\uffff\21\33\1\u0096\10\33",
            "\12\33\7\uffff\32\33\6\uffff\1\u0097\31\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\4\33\1\u0099\25\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\6\33\1\u009b\23\33",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\6\uffff\22\33\1\u009d\7\33",
            "",
            "\12\33\7\uffff\32\33\6\uffff\13\33\1\u009e\16\33",
            "\12\33\7\uffff\32\33\6\uffff\1\u009f\31\33",
            "\12\33\7\uffff\32\33\6\uffff\24\33\1\u00a0\5\33",
            "\12\33\7\uffff\32\33\6\uffff\5\33\1\u00a1\24\33",
            "\12\33\7\uffff\32\33\6\uffff\31\33\1\u00a2",
            "\12\33\7\uffff\32\33\6\uffff\4\33\1\u00a3\25\33",
            "\12\33\7\uffff\32\33\6\uffff\10\33\1\u00a4\21\33",
            "\12\33\7\uffff\32\33\6\uffff\23\33\1\u00a5\6\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_ZEICHENFOLGE | RULE_INT | RULE_PRICE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_20 = input.LA(1);

                        s = -1;
                        if ( ((LA13_20>='\u0000' && LA13_20<='\uFFFF')) ) {s = 47;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='V') ) {s = 1;}

                        else if ( (LA13_0=='{') ) {s = 2;}

                        else if ( (LA13_0=='m') ) {s = 3;}

                        else if ( (LA13_0=='d') ) {s = 4;}

                        else if ( (LA13_0=='i') ) {s = 5;}

                        else if ( (LA13_0=='n') ) {s = 6;}

                        else if ( (LA13_0=='t') ) {s = 7;}

                        else if ( (LA13_0=='s') ) {s = 8;}

                        else if ( (LA13_0=='g') ) {s = 9;}

                        else if ( (LA13_0=='}') ) {s = 10;}

                        else if ( (LA13_0=='h') ) {s = 11;}

                        else if ( (LA13_0=='O') ) {s = 12;}

                        else if ( (LA13_0=='T') ) {s = 13;}

                        else if ( (LA13_0=='A') ) {s = 14;}

                        else if ( (LA13_0=='I') ) {s = 15;}

                        else if ( (LA13_0=='S') ) {s = 16;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 17;}

                        else if ( ((LA13_0>='B' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='N')||(LA13_0>='P' && LA13_0<='R')||LA13_0=='U'||(LA13_0>='W' && LA13_0<='Z')||(LA13_0>='a' && LA13_0<='c')||(LA13_0>='e' && LA13_0<='f')||(LA13_0>='j' && LA13_0<='l')||(LA13_0>='o' && LA13_0<='r')||(LA13_0>='u' && LA13_0<='z')) ) {s = 18;}

                        else if ( (LA13_0=='\"') ) {s = 19;}

                        else if ( (LA13_0=='\'') ) {s = 20;}

                        else if ( (LA13_0=='/') ) {s = 21;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 22;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='.')||(LA13_0>=':' && LA13_0<='@')||(LA13_0>='[' && LA13_0<='`')||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_19 = input.LA(1);

                        s = -1;
                        if ( ((LA13_19>='\u0000' && LA13_19<='\uFFFF')) ) {s = 47;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
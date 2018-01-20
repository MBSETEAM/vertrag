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

    public InternalVertragLexer() {;} 
    public InternalVertragLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalVertragLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalVertrag.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:13:7: ( 'datenvolumen' )
            // InternalVertrag.g:13:9: 'datenvolumen'
            {
            match("datenvolumen"); 


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
            // InternalVertrag.g:14:7: ( 'mindestvertragslaufzeit' )
            // InternalVertrag.g:14:9: 'mindestvertragslaufzeit'
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:16:7: ( 'netzanbieter' )
            // InternalVertrag.g:16:9: 'netzanbieter'
            {
            match("netzanbieter"); 


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
            // InternalVertrag.g:17:7: ( '}' )
            // InternalVertrag.g:17:9: '}'
            {
            match('}'); 

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
            // InternalVertrag.g:18:7: ( 'handy' )
            // InternalVertrag.g:18:9: 'handy'
            {
            match("handy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "RULE_ZEICHENFOLGE"
    public final void mRULE_ZEICHENFOLGE() throws RecognitionException {
        try {
            int _type = RULE_ZEICHENFOLGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:445:19: ( ( '0' .. '9' | 'a' .. 'z' )+ )
            // InternalVertrag.g:445:21: ( '0' .. '9' | 'a' .. 'z' )+
            {
            // InternalVertrag.g:445:21: ( '0' .. '9' | 'a' .. 'z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVertrag.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:447:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalVertrag.g:447:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalVertrag.g:447:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalVertrag.g:447:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalVertrag.g:447:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalVertrag.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:449:10: ( ( '0' .. '9' )+ )
            // InternalVertrag.g:449:12: ( '0' .. '9' )+
            {
            // InternalVertrag.g:449:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalVertrag.g:449:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVertrag.g:451:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalVertrag.g:451:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalVertrag.g:451:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalVertrag.g:451:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalVertrag.g:451:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalVertrag.g:451:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVertrag.g:451:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalVertrag.g:451:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalVertrag.g:451:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalVertrag.g:451:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVertrag.g:451:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalVertrag.g:453:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalVertrag.g:453:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalVertrag.g:453:24: ( options {greedy=false; } : . )*
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
            	    // InternalVertrag.g:453:52: .
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
            // InternalVertrag.g:455:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalVertrag.g:455:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalVertrag.g:455:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVertrag.g:455:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalVertrag.g:455:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVertrag.g:455:41: ( '\\r' )? '\\n'
                    {
                    // InternalVertrag.g:455:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalVertrag.g:455:41: '\\r'
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
            // InternalVertrag.g:457:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalVertrag.g:457:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalVertrag.g:457:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalVertrag.g:459:16: ( . )
            // InternalVertrag.g:459:18: .
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
        // InternalVertrag.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_ZEICHENFOLGE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=16;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalVertrag.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalVertrag.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalVertrag.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalVertrag.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalVertrag.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalVertrag.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalVertrag.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalVertrag.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalVertrag.g:1:58: RULE_ZEICHENFOLGE
                {
                mRULE_ZEICHENFOLGE(); 

                }
                break;
            case 10 :
                // InternalVertrag.g:1:76: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 11 :
                // InternalVertrag.g:1:84: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 12 :
                // InternalVertrag.g:1:93: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // InternalVertrag.g:1:105: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 14 :
                // InternalVertrag.g:1:121: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // InternalVertrag.g:1:137: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // InternalVertrag.g:1:145: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\22\1\uffff\3\26\1\uffff\2\26\1\20\1\26\1\uffff\3\20\2\uffff\1\22\2\uffff\2\26\1\uffff\3\26\1\uffff\2\26\4\uffff\1\22\5\26\1\22\5\26\1\22\4\26\1\70\1\22\4\26\1\uffff\1\76\2\26\1\22\1\26\1\uffff\2\26\1\22\3\26\1\22\3\26\1\22\3\26\1\22\1\26\1\123\1\26\1\22\1\126\1\uffff\1\26\1\130\1\uffff\1\26\1\uffff\10\26\1\142\1\uffff";
    static final String DFA13_eofS =
        "\143\uffff";
    static final String DFA13_minS =
        "\1\0\1\145\1\uffff\3\60\1\uffff\2\60\1\101\1\60\1\uffff\2\0\1\52\2\uffff\1\162\2\uffff\2\60\1\uffff\3\60\1\uffff\2\60\4\uffff\1\164\5\60\1\162\5\60\1\141\5\60\1\147\4\60\1\uffff\3\60\1\153\1\60\1\uffff\2\60\1\157\3\60\1\163\3\60\1\164\3\60\1\145\3\60\1\156\1\60\1\uffff\2\60\1\uffff\1\60\1\uffff\11\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\145\1\uffff\3\172\1\uffff\3\172\1\71\1\uffff\2\uffff\1\57\2\uffff\1\162\2\uffff\2\172\1\uffff\3\172\1\uffff\1\172\1\71\4\uffff\1\164\5\172\1\162\5\172\1\141\5\172\1\147\4\172\1\uffff\3\172\1\153\1\172\1\uffff\2\172\1\157\3\172\1\163\3\172\1\164\3\172\1\145\3\172\1\156\1\172\1\uffff\2\172\1\uffff\1\172\1\uffff\11\172\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\3\uffff\1\7\4\uffff\1\12\3\uffff\1\17\1\20\1\uffff\1\12\1\2\2\uffff\1\11\3\uffff\1\7\2\uffff\1\14\1\15\1\16\1\17\27\uffff\1\10\5\uffff\1\1\24\uffff\1\3\2\uffff\1\6\1\uffff\1\5\11\uffff\1\4";
    static final String DFA13_specialS =
        "\1\2\13\uffff\1\0\1\1\125\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\20\2\17\2\20\1\17\22\20\1\17\1\20\1\14\4\20\1\15\7\20\1\16\12\12\7\20\25\13\1\1\4\13\3\20\1\11\1\13\1\20\3\10\1\3\3\10\1\7\4\10\1\4\1\5\14\10\1\2\1\20\1\6\uff82\20",
            "\1\21",
            "",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\1\24\31\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\10\25\1\27\5\25\1\30\13\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\4\25\1\31\25\25",
            "",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\1\33\31\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\32\25",
            "\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\34",
            "",
            "\0\35",
            "\0\35",
            "\1\36\4\uffff\1\37",
            "",
            "",
            "\1\41",
            "",
            "",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\23\25\1\42\6\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\15\25\1\43\14\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\15\25\1\44\14\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\23\25\1\45\6\25",
            "",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\15\25\1\46\14\25",
            "\12\34",
            "",
            "",
            "",
            "",
            "\1\47",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\4\25\1\50\25\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\3\25\1\51\26\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\1\52\31\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\31\25\1\53",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\3\25\1\54\26\25",
            "\1\55",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\15\25\1\56\14\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\4\25\1\57\25\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\23\25\1\60\6\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\1\61\31\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\30\25\1\62\1\25",
            "\1\63",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\25\25\1\64\4\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\22\25\1\65\7\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\13\25\1\66\16\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\15\25\1\67\14\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\32\25",
            "\1\71",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\16\25\1\72\13\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\23\25\1\73\6\25",
            "\12\25\7\uffff\32\22\4\uffff\1\74\1\uffff\32\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\1\25\1\75\30\25",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\13\25\1\77\16\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\25\25\1\100\4\25",
            "\1\101",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\10\25\1\102\21\25",
            "",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\24\25\1\103\5\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\4\25\1\104\25\25",
            "\1\105",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\4\25\1\106\25\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\14\25\1\107\15\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\21\25\1\110\10\25",
            "\1\111",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\23\25\1\112\6\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\4\25\1\113\25\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\23\25\1\114\6\25",
            "\1\115",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\4\25\1\116\25\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\15\25\1\117\14\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\21\25\1\120\10\25",
            "\1\121",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\21\25\1\122\10\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\32\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\1\124\31\25",
            "\1\125",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\6\25\1\127\23\25",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\22\25\1\131\7\25",
            "",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\13\25\1\132\16\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\1\133\31\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\24\25\1\134\5\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\5\25\1\135\24\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\31\25\1\136",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\4\25\1\137\25\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\10\25\1\140\21\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\23\25\1\141\6\25",
            "\12\25\7\uffff\32\22\4\uffff\1\22\1\uffff\32\25",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_ZEICHENFOLGE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_12 = input.LA(1);

                        s = -1;
                        if ( ((LA13_12>='\u0000' && LA13_12<='\uFFFF')) ) {s = 29;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_13 = input.LA(1);

                        s = -1;
                        if ( ((LA13_13>='\u0000' && LA13_13<='\uFFFF')) ) {s = 29;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='V') ) {s = 1;}

                        else if ( (LA13_0=='{') ) {s = 2;}

                        else if ( (LA13_0=='d') ) {s = 3;}

                        else if ( (LA13_0=='m') ) {s = 4;}

                        else if ( (LA13_0=='n') ) {s = 5;}

                        else if ( (LA13_0=='}') ) {s = 6;}

                        else if ( (LA13_0=='h') ) {s = 7;}

                        else if ( ((LA13_0>='a' && LA13_0<='c')||(LA13_0>='e' && LA13_0<='g')||(LA13_0>='i' && LA13_0<='l')||(LA13_0>='o' && LA13_0<='z')) ) {s = 8;}

                        else if ( (LA13_0=='^') ) {s = 9;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 10;}

                        else if ( ((LA13_0>='A' && LA13_0<='U')||(LA13_0>='W' && LA13_0<='Z')||LA13_0=='_') ) {s = 11;}

                        else if ( (LA13_0=='\"') ) {s = 12;}

                        else if ( (LA13_0=='\'') ) {s = 13;}

                        else if ( (LA13_0=='/') ) {s = 14;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 15;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='.')||(LA13_0>=':' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 16;}

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
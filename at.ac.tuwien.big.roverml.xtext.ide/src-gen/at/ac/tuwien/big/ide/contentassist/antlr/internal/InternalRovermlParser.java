package at.ac.tuwien.big.ide.contentassist.antlr.internal;

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
import at.ac.tuwien.big.services.RovermlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRovermlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'roverSystem'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalRovermlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRovermlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRovermlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRoverml.g"; }


    	private RovermlGrammarAccess grammarAccess;

    	public void setGrammarAccess(RovermlGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRoverSystem"
    // InternalRoverml.g:54:1: entryRuleRoverSystem : ruleRoverSystem EOF ;
    public final void entryRuleRoverSystem() throws RecognitionException {
        try {
            // InternalRoverml.g:55:1: ( ruleRoverSystem EOF )
            // InternalRoverml.g:56:1: ruleRoverSystem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoverSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRoverSystem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoverSystemRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoverSystem"


    // $ANTLR start "ruleRoverSystem"
    // InternalRoverml.g:63:1: ruleRoverSystem : ( ( rule__RoverSystem__Group__0 ) ) ;
    public final void ruleRoverSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverml.g:67:2: ( ( ( rule__RoverSystem__Group__0 ) ) )
            // InternalRoverml.g:68:2: ( ( rule__RoverSystem__Group__0 ) )
            {
            // InternalRoverml.g:68:2: ( ( rule__RoverSystem__Group__0 ) )
            // InternalRoverml.g:69:3: ( rule__RoverSystem__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoverSystemAccess().getGroup()); 
            }
            // InternalRoverml.g:70:3: ( rule__RoverSystem__Group__0 )
            // InternalRoverml.g:70:4: rule__RoverSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoverSystem__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoverSystemAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoverSystem"


    // $ANTLR start "rule__RoverSystem__Group__0"
    // InternalRoverml.g:78:1: rule__RoverSystem__Group__0 : rule__RoverSystem__Group__0__Impl rule__RoverSystem__Group__1 ;
    public final void rule__RoverSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverml.g:82:1: ( rule__RoverSystem__Group__0__Impl rule__RoverSystem__Group__1 )
            // InternalRoverml.g:83:2: rule__RoverSystem__Group__0__Impl rule__RoverSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RoverSystem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RoverSystem__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoverSystem__Group__0"


    // $ANTLR start "rule__RoverSystem__Group__0__Impl"
    // InternalRoverml.g:90:1: rule__RoverSystem__Group__0__Impl : ( () ) ;
    public final void rule__RoverSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverml.g:94:1: ( ( () ) )
            // InternalRoverml.g:95:1: ( () )
            {
            // InternalRoverml.g:95:1: ( () )
            // InternalRoverml.g:96:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoverSystemAccess().getRoverSystemAction_0()); 
            }
            // InternalRoverml.g:97:2: ()
            // InternalRoverml.g:97:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoverSystemAccess().getRoverSystemAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoverSystem__Group__0__Impl"


    // $ANTLR start "rule__RoverSystem__Group__1"
    // InternalRoverml.g:105:1: rule__RoverSystem__Group__1 : rule__RoverSystem__Group__1__Impl ;
    public final void rule__RoverSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverml.g:109:1: ( rule__RoverSystem__Group__1__Impl )
            // InternalRoverml.g:110:2: rule__RoverSystem__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoverSystem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoverSystem__Group__1"


    // $ANTLR start "rule__RoverSystem__Group__1__Impl"
    // InternalRoverml.g:116:1: rule__RoverSystem__Group__1__Impl : ( 'roverSystem' ) ;
    public final void rule__RoverSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoverml.g:120:1: ( ( 'roverSystem' ) )
            // InternalRoverml.g:121:1: ( 'roverSystem' )
            {
            // InternalRoverml.g:121:1: ( 'roverSystem' )
            // InternalRoverml.g:122:2: 'roverSystem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoverSystemAccess().getRoverSystemKeyword_1()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoverSystemAccess().getRoverSystemKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoverSystem__Group__1__Impl"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});

}
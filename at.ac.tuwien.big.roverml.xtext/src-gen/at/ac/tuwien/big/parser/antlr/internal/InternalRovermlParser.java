package at.ac.tuwien.big.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.services.RovermlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRovermlParser extends AbstractInternalAntlrParser {
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

        public InternalRovermlParser(TokenStream input, RovermlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RoverSystem";
       	}

       	@Override
       	protected RovermlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoverSystem"
    // InternalRoverml.g:64:1: entryRuleRoverSystem returns [EObject current=null] : iv_ruleRoverSystem= ruleRoverSystem EOF ;
    public final EObject entryRuleRoverSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoverSystem = null;


        try {
            // InternalRoverml.g:64:52: (iv_ruleRoverSystem= ruleRoverSystem EOF )
            // InternalRoverml.g:65:2: iv_ruleRoverSystem= ruleRoverSystem EOF
            {
             newCompositeNode(grammarAccess.getRoverSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoverSystem=ruleRoverSystem();

            state._fsp--;

             current =iv_ruleRoverSystem; 
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
    // $ANTLR end "entryRuleRoverSystem"


    // $ANTLR start "ruleRoverSystem"
    // InternalRoverml.g:71:1: ruleRoverSystem returns [EObject current=null] : ( () otherlv_1= 'roverSystem' ) ;
    public final EObject ruleRoverSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:77:2: ( ( () otherlv_1= 'roverSystem' ) )
            // InternalRoverml.g:78:2: ( () otherlv_1= 'roverSystem' )
            {
            // InternalRoverml.g:78:2: ( () otherlv_1= 'roverSystem' )
            // InternalRoverml.g:79:3: () otherlv_1= 'roverSystem'
            {
            // InternalRoverml.g:79:3: ()
            // InternalRoverml.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoverSystemAccess().getRoverSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRoverSystemAccess().getRoverSystemKeyword_1());
            		

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
    // $ANTLR end "ruleRoverSystem"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}
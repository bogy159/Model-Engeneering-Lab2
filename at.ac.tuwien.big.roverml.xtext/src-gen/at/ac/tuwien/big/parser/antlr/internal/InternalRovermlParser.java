package at.ac.tuwien.big.parser.antlr.internal;

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
import at.ac.tuwien.big.services.RovermlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRovermlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'roverSystem'", "'{'", "'rovers'", "'}'", "'roverPrograms'", "'roverProgram'", "'rover'", "','", "'>'", "':'", "'move'", "'with'", "'set'", "'lights'", "'('", "')'", "'to'", "'color'", "'rotate'", "'wait'", "'repeat'", "'times'", "'components'", "'block'", "'commands'", "'transitions'", "'if'", "'gps'", "'distanceSensor'", "'kind'", "'compass'", "'light'", "'motor'", "'terminate'", "'position'", "'x'", "'y'", "'.'", "'-'", "'E'", "'e'", "'none'", "'red'", "'green'", "'blue'", "'yellow'", "'ns'", "'ms'", "'s'", "'min'", "'h'", "'radian'", "'degree'", "'mm_per_s'", "'cm_per_s'", "'mm'", "'cm'", "'m'", "'smaller'", "'equals'", "'greater'", "'unequal'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalRoverml.g:65:1: entryRuleRoverSystem returns [EObject current=null] : iv_ruleRoverSystem= ruleRoverSystem EOF ;
    public final EObject entryRuleRoverSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoverSystem = null;


        try {
            // InternalRoverml.g:65:52: (iv_ruleRoverSystem= ruleRoverSystem EOF )
            // InternalRoverml.g:66:2: iv_ruleRoverSystem= ruleRoverSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoverSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRoverSystem=ruleRoverSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoverSystem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRoverml.g:72:1: ruleRoverSystem returns [EObject current=null] : ( () otherlv_1= 'roverSystem' otherlv_2= '{' otherlv_3= 'rovers' otherlv_4= '{' ( (lv_rovers_5_0= ruleRover ) )* otherlv_6= '}' otherlv_7= 'roverPrograms' otherlv_8= '{' ( (lv_roverPrograms_9_0= ruleRoverProgram ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleRoverSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_rovers_5_0 = null;

        EObject lv_roverPrograms_9_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:78:2: ( ( () otherlv_1= 'roverSystem' otherlv_2= '{' otherlv_3= 'rovers' otherlv_4= '{' ( (lv_rovers_5_0= ruleRover ) )* otherlv_6= '}' otherlv_7= 'roverPrograms' otherlv_8= '{' ( (lv_roverPrograms_9_0= ruleRoverProgram ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalRoverml.g:79:2: ( () otherlv_1= 'roverSystem' otherlv_2= '{' otherlv_3= 'rovers' otherlv_4= '{' ( (lv_rovers_5_0= ruleRover ) )* otherlv_6= '}' otherlv_7= 'roverPrograms' otherlv_8= '{' ( (lv_roverPrograms_9_0= ruleRoverProgram ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalRoverml.g:79:2: ( () otherlv_1= 'roverSystem' otherlv_2= '{' otherlv_3= 'rovers' otherlv_4= '{' ( (lv_rovers_5_0= ruleRover ) )* otherlv_6= '}' otherlv_7= 'roverPrograms' otherlv_8= '{' ( (lv_roverPrograms_9_0= ruleRoverProgram ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalRoverml.g:80:3: () otherlv_1= 'roverSystem' otherlv_2= '{' otherlv_3= 'rovers' otherlv_4= '{' ( (lv_rovers_5_0= ruleRover ) )* otherlv_6= '}' otherlv_7= 'roverPrograms' otherlv_8= '{' ( (lv_roverPrograms_9_0= ruleRoverProgram ) )* otherlv_10= '}' otherlv_11= '}'
            {
            // InternalRoverml.g:80:3: ()
            // InternalRoverml.g:81:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRoverSystemAccess().getRoverSystemAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRoverSystemAccess().getRoverSystemKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRoverSystemAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRoverSystemAccess().getRoversKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRoverSystemAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalRoverml.g:103:3: ( (lv_rovers_5_0= ruleRover ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRoverml.g:104:4: (lv_rovers_5_0= ruleRover )
            	    {
            	    // InternalRoverml.g:104:4: (lv_rovers_5_0= ruleRover )
            	    // InternalRoverml.g:105:5: lv_rovers_5_0= ruleRover
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRoverSystemAccess().getRoversRoverParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_rovers_5_0=ruleRover();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRoverSystemRule());
            	      					}
            	      					add(
            	      						current,
            	      						"rovers",
            	      						lv_rovers_5_0,
            	      						"at.ac.tuwien.big.Roverml.Rover");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getRoverSystemAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getRoverSystemAccess().getRoverProgramsKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,12,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getRoverSystemAccess().getLeftCurlyBracketKeyword_8());
              		
            }
            // InternalRoverml.g:134:3: ( (lv_roverPrograms_9_0= ruleRoverProgram ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRoverml.g:135:4: (lv_roverPrograms_9_0= ruleRoverProgram )
            	    {
            	    // InternalRoverml.g:135:4: (lv_roverPrograms_9_0= ruleRoverProgram )
            	    // InternalRoverml.g:136:5: lv_roverPrograms_9_0= ruleRoverProgram
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRoverSystemAccess().getRoverProgramsRoverProgramParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_roverPrograms_9_0=ruleRoverProgram();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRoverSystemRule());
            	      					}
            	      					add(
            	      						current,
            	      						"roverPrograms",
            	      						lv_roverPrograms_9_0,
            	      						"at.ac.tuwien.big.Roverml.RoverProgram");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getRoverSystemAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getRoverSystemAccess().getRightCurlyBracketKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRoverSystem"


    // $ANTLR start "entryRuleRoverProgram"
    // InternalRoverml.g:165:1: entryRuleRoverProgram returns [EObject current=null] : iv_ruleRoverProgram= ruleRoverProgram EOF ;
    public final EObject entryRuleRoverProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoverProgram = null;


        try {
            // InternalRoverml.g:165:53: (iv_ruleRoverProgram= ruleRoverProgram EOF )
            // InternalRoverml.g:166:2: iv_ruleRoverProgram= ruleRoverProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoverProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRoverProgram=ruleRoverProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoverProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRoverProgram"


    // $ANTLR start "ruleRoverProgram"
    // InternalRoverml.g:172:1: ruleRoverProgram returns [EObject current=null] : ( () otherlv_1= 'roverProgram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'rover' ( ( ruleQualifiedName ) ) ( (lv_block_6_0= ruleBlock ) ) otherlv_7= '}' (otherlv_8= ',' )? ) ;
    public final EObject ruleRoverProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_block_6_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:178:2: ( ( () otherlv_1= 'roverProgram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'rover' ( ( ruleQualifiedName ) ) ( (lv_block_6_0= ruleBlock ) ) otherlv_7= '}' (otherlv_8= ',' )? ) )
            // InternalRoverml.g:179:2: ( () otherlv_1= 'roverProgram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'rover' ( ( ruleQualifiedName ) ) ( (lv_block_6_0= ruleBlock ) ) otherlv_7= '}' (otherlv_8= ',' )? )
            {
            // InternalRoverml.g:179:2: ( () otherlv_1= 'roverProgram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'rover' ( ( ruleQualifiedName ) ) ( (lv_block_6_0= ruleBlock ) ) otherlv_7= '}' (otherlv_8= ',' )? )
            // InternalRoverml.g:180:3: () otherlv_1= 'roverProgram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'rover' ( ( ruleQualifiedName ) ) ( (lv_block_6_0= ruleBlock ) ) otherlv_7= '}' (otherlv_8= ',' )?
            {
            // InternalRoverml.g:180:3: ()
            // InternalRoverml.g:181:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRoverProgramAccess().getRoverProgramAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRoverProgramAccess().getRoverProgramKeyword_1());
              		
            }
            // InternalRoverml.g:191:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRoverml.g:192:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRoverml.g:192:4: (lv_name_2_0= RULE_ID )
            // InternalRoverml.g:193:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getRoverProgramAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRoverProgramRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRoverProgramAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRoverProgramAccess().getRoverKeyword_4());
              		
            }
            // InternalRoverml.g:217:3: ( ( ruleQualifiedName ) )
            // InternalRoverml.g:218:4: ( ruleQualifiedName )
            {
            // InternalRoverml.g:218:4: ( ruleQualifiedName )
            // InternalRoverml.g:219:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRoverProgramRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRoverProgramAccess().getRoverRoverCrossReference_5_0());
              				
            }
            pushFollow(FOLLOW_11);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:233:3: ( (lv_block_6_0= ruleBlock ) )
            // InternalRoverml.g:234:4: (lv_block_6_0= ruleBlock )
            {
            // InternalRoverml.g:234:4: (lv_block_6_0= ruleBlock )
            // InternalRoverml.g:235:5: lv_block_6_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRoverProgramAccess().getBlockBlockParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_block_6_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRoverProgramRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_6_0,
              						"at.ac.tuwien.big.Roverml.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getRoverProgramAccess().getRightCurlyBracketKeyword_7());
              		
            }
            // InternalRoverml.g:256:3: (otherlv_8= ',' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRoverml.g:257:4: otherlv_8= ','
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getRoverProgramAccess().getCommaKeyword_8());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRoverProgram"


    // $ANTLR start "entryRuleCommand"
    // InternalRoverml.g:266:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalRoverml.g:266:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalRoverml.g:267:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalRoverml.g:273:1: ruleCommand returns [EObject current=null] : (this_Move_0= ruleMove | this_Rotate_1= ruleRotate | this_Wait_2= ruleWait | this_SetLightColor_3= ruleSetLightColor | this_Terminate_4= ruleTerminate | (this_Repeat_5= ruleRepeat ( ( ruleQualifiedName ) ) otherlv_7= '>' ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_7=null;
        EObject this_Move_0 = null;

        EObject this_Rotate_1 = null;

        EObject this_Wait_2 = null;

        EObject this_SetLightColor_3 = null;

        EObject this_Terminate_4 = null;

        EObject this_Repeat_5 = null;



        	enterRule();

        try {
            // InternalRoverml.g:279:2: ( (this_Move_0= ruleMove | this_Rotate_1= ruleRotate | this_Wait_2= ruleWait | this_SetLightColor_3= ruleSetLightColor | this_Terminate_4= ruleTerminate | (this_Repeat_5= ruleRepeat ( ( ruleQualifiedName ) ) otherlv_7= '>' ( ( ruleQualifiedName ) ) ) ) )
            // InternalRoverml.g:280:2: (this_Move_0= ruleMove | this_Rotate_1= ruleRotate | this_Wait_2= ruleWait | this_SetLightColor_3= ruleSetLightColor | this_Terminate_4= ruleTerminate | (this_Repeat_5= ruleRepeat ( ( ruleQualifiedName ) ) otherlv_7= '>' ( ( ruleQualifiedName ) ) ) )
            {
            // InternalRoverml.g:280:2: (this_Move_0= ruleMove | this_Rotate_1= ruleRotate | this_Wait_2= ruleWait | this_SetLightColor_3= ruleSetLightColor | this_Terminate_4= ruleTerminate | (this_Repeat_5= ruleRepeat ( ( ruleQualifiedName ) ) otherlv_7= '>' ( ( ruleQualifiedName ) ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==20) ) {
                    switch ( input.LA(3) ) {
                    case 21:
                        {
                        alt4=1;
                        }
                        break;
                    case 29:
                        {
                        alt4=2;
                        }
                        break;
                    case 30:
                        {
                        alt4=3;
                        }
                        break;
                    case 23:
                        {
                        alt4=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                alt4=5;
                }
                break;
            case 31:
                {
                alt4=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRoverml.g:281:3: this_Move_0= ruleMove
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getMoveParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Move_0=ruleMove();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Move_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRoverml.g:290:3: this_Rotate_1= ruleRotate
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getRotateParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Rotate_1=ruleRotate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Rotate_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalRoverml.g:299:3: this_Wait_2= ruleWait
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getWaitParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Wait_2=ruleWait();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Wait_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalRoverml.g:308:3: this_SetLightColor_3= ruleSetLightColor
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getSetLightColorParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SetLightColor_3=ruleSetLightColor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SetLightColor_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalRoverml.g:317:3: this_Terminate_4= ruleTerminate
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getTerminateParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Terminate_4=ruleTerminate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Terminate_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalRoverml.g:326:3: (this_Repeat_5= ruleRepeat ( ( ruleQualifiedName ) ) otherlv_7= '>' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalRoverml.g:326:3: (this_Repeat_5= ruleRepeat ( ( ruleQualifiedName ) ) otherlv_7= '>' ( ( ruleQualifiedName ) ) )
                    // InternalRoverml.g:327:4: this_Repeat_5= ruleRepeat ( ( ruleQualifiedName ) ) otherlv_7= '>' ( ( ruleQualifiedName ) )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCommandAccess().getRepeatParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_Repeat_5=ruleRepeat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Repeat_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalRoverml.g:335:4: ( ( ruleQualifiedName ) )
                    // InternalRoverml.g:336:5: ( ruleQualifiedName )
                    {
                    // InternalRoverml.g:336:5: ( ruleQualifiedName )
                    // InternalRoverml.g:337:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCommandRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getIncomingTransitionCrossReference_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getCommandAccess().getGreaterThanSignKeyword_5_2());
                      			
                    }
                    // InternalRoverml.g:355:4: ( ( ruleQualifiedName ) )
                    // InternalRoverml.g:356:5: ( ruleQualifiedName )
                    {
                    // InternalRoverml.g:356:5: ( ruleQualifiedName )
                    // InternalRoverml.g:357:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCommandRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getOutgoingTransitionCrossReference_5_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleMove"
    // InternalRoverml.g:376:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalRoverml.g:376:45: (iv_ruleMove= ruleMove EOF )
            // InternalRoverml.g:377:2: iv_ruleMove= ruleMove EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMoveRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMove; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalRoverml.g:383:1: ruleMove returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'move' ( (lv_distance_3_0= ruleLength ) ) otherlv_4= 'with' ( (lv_speed_5_0= ruleVelocity ) ) (otherlv_6= ',' )? ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_distance_3_0 = null;

        EObject lv_speed_5_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:389:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'move' ( (lv_distance_3_0= ruleLength ) ) otherlv_4= 'with' ( (lv_speed_5_0= ruleVelocity ) ) (otherlv_6= ',' )? ) )
            // InternalRoverml.g:390:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'move' ( (lv_distance_3_0= ruleLength ) ) otherlv_4= 'with' ( (lv_speed_5_0= ruleVelocity ) ) (otherlv_6= ',' )? )
            {
            // InternalRoverml.g:390:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'move' ( (lv_distance_3_0= ruleLength ) ) otherlv_4= 'with' ( (lv_speed_5_0= ruleVelocity ) ) (otherlv_6= ',' )? )
            // InternalRoverml.g:391:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'move' ( (lv_distance_3_0= ruleLength ) ) otherlv_4= 'with' ( (lv_speed_5_0= ruleVelocity ) ) (otherlv_6= ',' )?
            {
            // InternalRoverml.g:391:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRoverml.g:392:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRoverml.g:392:4: (lv_name_0_0= RULE_ID )
            // InternalRoverml.g:393:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getMoveAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMoveRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,21,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getMoveKeyword_2());
              		
            }
            // InternalRoverml.g:417:3: ( (lv_distance_3_0= ruleLength ) )
            // InternalRoverml.g:418:4: (lv_distance_3_0= ruleLength )
            {
            // InternalRoverml.g:418:4: (lv_distance_3_0= ruleLength )
            // InternalRoverml.g:419:5: lv_distance_3_0= ruleLength
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMoveAccess().getDistanceLengthParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_distance_3_0=ruleLength();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMoveRule());
              					}
              					set(
              						current,
              						"distance",
              						lv_distance_3_0,
              						"at.ac.tuwien.big.Roverml.Length");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMoveAccess().getWithKeyword_4());
              		
            }
            // InternalRoverml.g:440:3: ( (lv_speed_5_0= ruleVelocity ) )
            // InternalRoverml.g:441:4: (lv_speed_5_0= ruleVelocity )
            {
            // InternalRoverml.g:441:4: (lv_speed_5_0= ruleVelocity )
            // InternalRoverml.g:442:5: lv_speed_5_0= ruleVelocity
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMoveAccess().getSpeedVelocityParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_speed_5_0=ruleVelocity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMoveRule());
              					}
              					set(
              						current,
              						"speed",
              						lv_speed_5_0,
              						"at.ac.tuwien.big.Roverml.Velocity");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:459:3: (otherlv_6= ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoverml.g:460:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getMoveAccess().getCommaKeyword_6());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleSetLightColor"
    // InternalRoverml.g:469:1: entryRuleSetLightColor returns [EObject current=null] : iv_ruleSetLightColor= ruleSetLightColor EOF ;
    public final EObject entryRuleSetLightColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLightColor = null;


        try {
            // InternalRoverml.g:469:54: (iv_ruleSetLightColor= ruleSetLightColor EOF )
            // InternalRoverml.g:470:2: iv_ruleSetLightColor= ruleSetLightColor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetLightColorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSetLightColor=ruleSetLightColor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetLightColor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSetLightColor"


    // $ANTLR start "ruleSetLightColor"
    // InternalRoverml.g:476:1: ruleSetLightColor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'set' otherlv_3= 'lights' otherlv_4= '(' ( ( ruleQualifiedName ) ) otherlv_6= ')' otherlv_7= 'to' otherlv_8= 'color' ( (lv_color_9_0= ruleColor ) ) (otherlv_10= ',' )? ) ;
    public final EObject ruleSetLightColor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_color_9_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:482:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'set' otherlv_3= 'lights' otherlv_4= '(' ( ( ruleQualifiedName ) ) otherlv_6= ')' otherlv_7= 'to' otherlv_8= 'color' ( (lv_color_9_0= ruleColor ) ) (otherlv_10= ',' )? ) )
            // InternalRoverml.g:483:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'set' otherlv_3= 'lights' otherlv_4= '(' ( ( ruleQualifiedName ) ) otherlv_6= ')' otherlv_7= 'to' otherlv_8= 'color' ( (lv_color_9_0= ruleColor ) ) (otherlv_10= ',' )? )
            {
            // InternalRoverml.g:483:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'set' otherlv_3= 'lights' otherlv_4= '(' ( ( ruleQualifiedName ) ) otherlv_6= ')' otherlv_7= 'to' otherlv_8= 'color' ( (lv_color_9_0= ruleColor ) ) (otherlv_10= ',' )? )
            // InternalRoverml.g:484:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'set' otherlv_3= 'lights' otherlv_4= '(' ( ( ruleQualifiedName ) ) otherlv_6= ')' otherlv_7= 'to' otherlv_8= 'color' ( (lv_color_9_0= ruleColor ) ) (otherlv_10= ',' )?
            {
            // InternalRoverml.g:484:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRoverml.g:485:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRoverml.g:485:4: (lv_name_0_0= RULE_ID )
            // InternalRoverml.g:486:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getSetLightColorAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSetLightColorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSetLightColorAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSetLightColorAccess().getSetKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,24,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSetLightColorAccess().getLightsKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,25,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSetLightColorAccess().getLeftParenthesisKeyword_4());
              		
            }
            // InternalRoverml.g:518:3: ( ( ruleQualifiedName ) )
            // InternalRoverml.g:519:4: ( ruleQualifiedName )
            {
            // InternalRoverml.g:519:4: ( ruleQualifiedName )
            // InternalRoverml.g:520:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSetLightColorRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSetLightColorAccess().getLightsLightCrossReference_5_0());
              				
            }
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSetLightColorAccess().getRightParenthesisKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,27,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getSetLightColorAccess().getToKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,28,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getSetLightColorAccess().getColorKeyword_8());
              		
            }
            // InternalRoverml.g:546:3: ( (lv_color_9_0= ruleColor ) )
            // InternalRoverml.g:547:4: (lv_color_9_0= ruleColor )
            {
            // InternalRoverml.g:547:4: (lv_color_9_0= ruleColor )
            // InternalRoverml.g:548:5: lv_color_9_0= ruleColor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSetLightColorAccess().getColorColorEnumRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_color_9_0=ruleColor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSetLightColorRule());
              					}
              					set(
              						current,
              						"color",
              						lv_color_9_0,
              						"at.ac.tuwien.big.Roverml.Color");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:565:3: (otherlv_10= ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoverml.g:566:4: otherlv_10= ','
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getSetLightColorAccess().getCommaKeyword_10());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSetLightColor"


    // $ANTLR start "entryRuleRotate"
    // InternalRoverml.g:575:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalRoverml.g:575:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalRoverml.g:576:2: iv_ruleRotate= ruleRotate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRotateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRotate=ruleRotate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRotate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRotate"


    // $ANTLR start "ruleRotate"
    // InternalRoverml.g:582:1: ruleRotate returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'rotate' ( (lv_angle_3_0= ruleAngle ) ) (otherlv_4= ',' )? ) ;
    public final EObject ruleRotate() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_angle_3_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:588:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'rotate' ( (lv_angle_3_0= ruleAngle ) ) (otherlv_4= ',' )? ) )
            // InternalRoverml.g:589:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'rotate' ( (lv_angle_3_0= ruleAngle ) ) (otherlv_4= ',' )? )
            {
            // InternalRoverml.g:589:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'rotate' ( (lv_angle_3_0= ruleAngle ) ) (otherlv_4= ',' )? )
            // InternalRoverml.g:590:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'rotate' ( (lv_angle_3_0= ruleAngle ) ) (otherlv_4= ',' )?
            {
            // InternalRoverml.g:590:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRoverml.g:591:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRoverml.g:591:4: (lv_name_0_0= RULE_ID )
            // InternalRoverml.g:592:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getRotateAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRotateRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRotateAccess().getRotateKeyword_2());
              		
            }
            // InternalRoverml.g:616:3: ( (lv_angle_3_0= ruleAngle ) )
            // InternalRoverml.g:617:4: (lv_angle_3_0= ruleAngle )
            {
            // InternalRoverml.g:617:4: (lv_angle_3_0= ruleAngle )
            // InternalRoverml.g:618:5: lv_angle_3_0= ruleAngle
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRotateAccess().getAngleAngleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_angle_3_0=ruleAngle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRotateRule());
              					}
              					set(
              						current,
              						"angle",
              						lv_angle_3_0,
              						"at.ac.tuwien.big.Roverml.Angle");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:635:3: (otherlv_4= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRoverml.g:636:4: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getRotateAccess().getCommaKeyword_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRotate"


    // $ANTLR start "entryRuleWait"
    // InternalRoverml.g:645:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalRoverml.g:645:45: (iv_ruleWait= ruleWait EOF )
            // InternalRoverml.g:646:2: iv_ruleWait= ruleWait EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWaitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWait=ruleWait();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWait; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalRoverml.g:652:1: ruleWait returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'wait' ( (lv_duration_3_0= ruleTime ) ) (otherlv_4= ',' )? ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:658:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'wait' ( (lv_duration_3_0= ruleTime ) ) (otherlv_4= ',' )? ) )
            // InternalRoverml.g:659:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'wait' ( (lv_duration_3_0= ruleTime ) ) (otherlv_4= ',' )? )
            {
            // InternalRoverml.g:659:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'wait' ( (lv_duration_3_0= ruleTime ) ) (otherlv_4= ',' )? )
            // InternalRoverml.g:660:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'wait' ( (lv_duration_3_0= ruleTime ) ) (otherlv_4= ',' )?
            {
            // InternalRoverml.g:660:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRoverml.g:661:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRoverml.g:661:4: (lv_name_0_0= RULE_ID )
            // InternalRoverml.g:662:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getWaitAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWaitRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,30,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWaitAccess().getWaitKeyword_2());
              		
            }
            // InternalRoverml.g:686:3: ( (lv_duration_3_0= ruleTime ) )
            // InternalRoverml.g:687:4: (lv_duration_3_0= ruleTime )
            {
            // InternalRoverml.g:687:4: (lv_duration_3_0= ruleTime )
            // InternalRoverml.g:688:5: lv_duration_3_0= ruleTime
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWaitAccess().getDurationTimeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_duration_3_0=ruleTime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWaitRule());
              					}
              					set(
              						current,
              						"duration",
              						lv_duration_3_0,
              						"at.ac.tuwien.big.Roverml.Time");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:705:3: (otherlv_4= ',' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoverml.g:706:4: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getWaitAccess().getCommaKeyword_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleRepeat"
    // InternalRoverml.g:715:1: entryRuleRepeat returns [EObject current=null] : iv_ruleRepeat= ruleRepeat EOF ;
    public final EObject entryRuleRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeat = null;


        try {
            // InternalRoverml.g:715:47: (iv_ruleRepeat= ruleRepeat EOF )
            // InternalRoverml.g:716:2: iv_ruleRepeat= ruleRepeat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepeatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRepeat=ruleRepeat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepeat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRepeat"


    // $ANTLR start "ruleRepeat"
    // InternalRoverml.g:722:1: ruleRepeat returns [EObject current=null] : ( () otherlv_1= 'repeat' ( (lv_count_2_0= ruleEInt ) ) otherlv_3= 'times' ) ;
    public final EObject ruleRepeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_count_2_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:728:2: ( ( () otherlv_1= 'repeat' ( (lv_count_2_0= ruleEInt ) ) otherlv_3= 'times' ) )
            // InternalRoverml.g:729:2: ( () otherlv_1= 'repeat' ( (lv_count_2_0= ruleEInt ) ) otherlv_3= 'times' )
            {
            // InternalRoverml.g:729:2: ( () otherlv_1= 'repeat' ( (lv_count_2_0= ruleEInt ) ) otherlv_3= 'times' )
            // InternalRoverml.g:730:3: () otherlv_1= 'repeat' ( (lv_count_2_0= ruleEInt ) ) otherlv_3= 'times'
            {
            // InternalRoverml.g:730:3: ()
            // InternalRoverml.g:731:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRepeatAccess().getRepeatAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRepeatAccess().getRepeatKeyword_1());
              		
            }
            // InternalRoverml.g:741:3: ( (lv_count_2_0= ruleEInt ) )
            // InternalRoverml.g:742:4: (lv_count_2_0= ruleEInt )
            {
            // InternalRoverml.g:742:4: (lv_count_2_0= ruleEInt )
            // InternalRoverml.g:743:5: lv_count_2_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRepeatAccess().getCountEIntParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_count_2_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRepeatRule());
              					}
              					set(
              						current,
              						"count",
              						lv_count_2_0,
              						"at.ac.tuwien.big.Roverml.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRepeatAccess().getTimesKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRepeat"


    // $ANTLR start "entryRuleRover"
    // InternalRoverml.g:768:1: entryRuleRover returns [EObject current=null] : iv_ruleRover= ruleRover EOF ;
    public final EObject entryRuleRover() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRover = null;


        try {
            // InternalRoverml.g:768:46: (iv_ruleRover= ruleRover EOF )
            // InternalRoverml.g:769:2: iv_ruleRover= ruleRover EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoverRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRover=ruleRover();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRover; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRover"


    // $ANTLR start "ruleRover"
    // InternalRoverml.g:775:1: ruleRover returns [EObject current=null] : ( () otherlv_1= 'rover' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) )* otherlv_7= '}' otherlv_8= '}' (otherlv_9= ',' )? ) ;
    public final EObject ruleRover() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_components_6_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:781:2: ( ( () otherlv_1= 'rover' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) )* otherlv_7= '}' otherlv_8= '}' (otherlv_9= ',' )? ) )
            // InternalRoverml.g:782:2: ( () otherlv_1= 'rover' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) )* otherlv_7= '}' otherlv_8= '}' (otherlv_9= ',' )? )
            {
            // InternalRoverml.g:782:2: ( () otherlv_1= 'rover' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) )* otherlv_7= '}' otherlv_8= '}' (otherlv_9= ',' )? )
            // InternalRoverml.g:783:3: () otherlv_1= 'rover' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) )* otherlv_7= '}' otherlv_8= '}' (otherlv_9= ',' )?
            {
            // InternalRoverml.g:783:3: ()
            // InternalRoverml.g:784:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRoverAccess().getRoverAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRoverAccess().getRoverKeyword_1());
              		
            }
            // InternalRoverml.g:794:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRoverml.g:795:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRoverml.g:795:4: (lv_name_2_0= RULE_ID )
            // InternalRoverml.g:796:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getRoverAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRoverRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRoverAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRoverAccess().getComponentsKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,12,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRoverAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalRoverml.g:824:3: ( (lv_components_6_0= ruleComponent ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=38 && LA9_0<=39)||(LA9_0>=41 && LA9_0<=43)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRoverml.g:825:4: (lv_components_6_0= ruleComponent )
            	    {
            	    // InternalRoverml.g:825:4: (lv_components_6_0= ruleComponent )
            	    // InternalRoverml.g:826:5: lv_components_6_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRoverAccess().getComponentsComponentParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_components_6_0=ruleComponent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRoverRule());
            	      					}
            	      					add(
            	      						current,
            	      						"components",
            	      						lv_components_6_0,
            	      						"at.ac.tuwien.big.Roverml.Component");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getRoverAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,14,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getRoverAccess().getRightCurlyBracketKeyword_8());
              		
            }
            // InternalRoverml.g:851:3: (otherlv_9= ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRoverml.g:852:4: otherlv_9= ','
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getRoverAccess().getCommaKeyword_9());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRover"


    // $ANTLR start "entryRuleBlock"
    // InternalRoverml.g:861:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalRoverml.g:861:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalRoverml.g:862:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalRoverml.g:868:1: ruleBlock returns [EObject current=null] : (this_Repeat_0= ruleRepeat | ( () otherlv_2= 'block' ( (lv_commands_3_0= ruleRepeat ) )? otherlv_4= '{' (otherlv_5= 'commands' otherlv_6= '{' ( (lv_commands_7_0= ruleCommand ) )* otherlv_8= '}' )? (otherlv_9= 'transitions' otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) )* otherlv_12= '}' )? otherlv_13= '}' ) ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject this_Repeat_0 = null;

        EObject lv_commands_3_0 = null;

        EObject lv_commands_7_0 = null;

        EObject lv_transitions_11_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:874:2: ( (this_Repeat_0= ruleRepeat | ( () otherlv_2= 'block' ( (lv_commands_3_0= ruleRepeat ) )? otherlv_4= '{' (otherlv_5= 'commands' otherlv_6= '{' ( (lv_commands_7_0= ruleCommand ) )* otherlv_8= '}' )? (otherlv_9= 'transitions' otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) )* otherlv_12= '}' )? otherlv_13= '}' ) ) )
            // InternalRoverml.g:875:2: (this_Repeat_0= ruleRepeat | ( () otherlv_2= 'block' ( (lv_commands_3_0= ruleRepeat ) )? otherlv_4= '{' (otherlv_5= 'commands' otherlv_6= '{' ( (lv_commands_7_0= ruleCommand ) )* otherlv_8= '}' )? (otherlv_9= 'transitions' otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            {
            // InternalRoverml.g:875:2: (this_Repeat_0= ruleRepeat | ( () otherlv_2= 'block' ( (lv_commands_3_0= ruleRepeat ) )? otherlv_4= '{' (otherlv_5= 'commands' otherlv_6= '{' ( (lv_commands_7_0= ruleCommand ) )* otherlv_8= '}' )? (otherlv_9= 'transitions' otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            else if ( (LA16_0==34) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRoverml.g:876:3: this_Repeat_0= ruleRepeat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBlockAccess().getRepeatParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Repeat_0=ruleRepeat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Repeat_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRoverml.g:885:3: ( () otherlv_2= 'block' ( (lv_commands_3_0= ruleRepeat ) )? otherlv_4= '{' (otherlv_5= 'commands' otherlv_6= '{' ( (lv_commands_7_0= ruleCommand ) )* otherlv_8= '}' )? (otherlv_9= 'transitions' otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) )* otherlv_12= '}' )? otherlv_13= '}' )
                    {
                    // InternalRoverml.g:885:3: ( () otherlv_2= 'block' ( (lv_commands_3_0= ruleRepeat ) )? otherlv_4= '{' (otherlv_5= 'commands' otherlv_6= '{' ( (lv_commands_7_0= ruleCommand ) )* otherlv_8= '}' )? (otherlv_9= 'transitions' otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) )* otherlv_12= '}' )? otherlv_13= '}' )
                    // InternalRoverml.g:886:4: () otherlv_2= 'block' ( (lv_commands_3_0= ruleRepeat ) )? otherlv_4= '{' (otherlv_5= 'commands' otherlv_6= '{' ( (lv_commands_7_0= ruleCommand ) )* otherlv_8= '}' )? (otherlv_9= 'transitions' otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) )* otherlv_12= '}' )? otherlv_13= '}'
                    {
                    // InternalRoverml.g:886:4: ()
                    // InternalRoverml.g:887:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBlockAccess().getBlockAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,34,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getBlockKeyword_1_1());
                      			
                    }
                    // InternalRoverml.g:897:4: ( (lv_commands_3_0= ruleRepeat ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==31) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalRoverml.g:898:5: (lv_commands_3_0= ruleRepeat )
                            {
                            // InternalRoverml.g:898:5: (lv_commands_3_0= ruleRepeat )
                            // InternalRoverml.g:899:6: lv_commands_3_0= ruleRepeat
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getBlockAccess().getCommandsRepeatParserRuleCall_1_2_0());
                              					
                            }
                            pushFollow(FOLLOW_3);
                            lv_commands_3_0=ruleRepeat();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getBlockRule());
                              						}
                              						add(
                              							current,
                              							"commands",
                              							lv_commands_3_0,
                              							"at.ac.tuwien.big.Roverml.Repeat");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,12,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1_3());
                      			
                    }
                    // InternalRoverml.g:920:4: (otherlv_5= 'commands' otherlv_6= '{' ( (lv_commands_7_0= ruleCommand ) )* otherlv_8= '}' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==35) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalRoverml.g:921:5: otherlv_5= 'commands' otherlv_6= '{' ( (lv_commands_7_0= ruleCommand ) )* otherlv_8= '}'
                            {
                            otherlv_5=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getBlockAccess().getCommandsKeyword_1_4_0());
                              				
                            }
                            otherlv_6=(Token)match(input,12,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1_4_1());
                              				
                            }
                            // InternalRoverml.g:929:5: ( (lv_commands_7_0= ruleCommand ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==RULE_ID||LA12_0==31||LA12_0==44) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // InternalRoverml.g:930:6: (lv_commands_7_0= ruleCommand )
                            	    {
                            	    // InternalRoverml.g:930:6: (lv_commands_7_0= ruleCommand )
                            	    // InternalRoverml.g:931:7: lv_commands_7_0= ruleCommand
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							newCompositeNode(grammarAccess.getBlockAccess().getCommandsCommandParserRuleCall_1_4_2_0());
                            	      						
                            	    }
                            	    pushFollow(FOLLOW_33);
                            	    lv_commands_7_0=ruleCommand();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							if (current==null) {
                            	      								current = createModelElementForParent(grammarAccess.getBlockRule());
                            	      							}
                            	      							add(
                            	      								current,
                            	      								"commands",
                            	      								lv_commands_7_0,
                            	      								"at.ac.tuwien.big.Roverml.Command");
                            	      							afterParserOrEnumRuleCall();
                            	      						
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop12;
                                }
                            } while (true);

                            otherlv_8=(Token)match(input,14,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_1_4_3());
                              				
                            }

                            }
                            break;

                    }

                    // InternalRoverml.g:953:4: (otherlv_9= 'transitions' otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) )* otherlv_12= '}' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==36) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalRoverml.g:954:5: otherlv_9= 'transitions' otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) )* otherlv_12= '}'
                            {
                            otherlv_9=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getBlockAccess().getTransitionsKeyword_1_5_0());
                              				
                            }
                            otherlv_10=(Token)match(input,12,FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_10, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1_5_1());
                              				
                            }
                            // InternalRoverml.g:962:5: ( (lv_transitions_11_0= ruleTransition ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==RULE_ID||LA14_0==37) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalRoverml.g:963:6: (lv_transitions_11_0= ruleTransition )
                            	    {
                            	    // InternalRoverml.g:963:6: (lv_transitions_11_0= ruleTransition )
                            	    // InternalRoverml.g:964:7: lv_transitions_11_0= ruleTransition
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							newCompositeNode(grammarAccess.getBlockAccess().getTransitionsTransitionParserRuleCall_1_5_2_0());
                            	      						
                            	    }
                            	    pushFollow(FOLLOW_35);
                            	    lv_transitions_11_0=ruleTransition();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							if (current==null) {
                            	      								current = createModelElementForParent(grammarAccess.getBlockRule());
                            	      							}
                            	      							add(
                            	      								current,
                            	      								"transitions",
                            	      								lv_transitions_11_0,
                            	      								"at.ac.tuwien.big.Roverml.Transition");
                            	      							afterParserOrEnumRuleCall();
                            	      						
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);

                            otherlv_12=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_1_5_3());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_1_6());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleTransition"
    // InternalRoverml.g:995:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalRoverml.g:995:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalRoverml.g:996:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalRoverml.g:1002:1: ruleTransition returns [EObject current=null] : ( (this_TriggeredTransition_0= ruleTriggeredTransition )? ( ( ruleQualifiedName ) ) otherlv_2= '>' ( ( ruleQualifiedName ) ) (otherlv_4= ',' )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_TriggeredTransition_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1008:2: ( ( (this_TriggeredTransition_0= ruleTriggeredTransition )? ( ( ruleQualifiedName ) ) otherlv_2= '>' ( ( ruleQualifiedName ) ) (otherlv_4= ',' )? ) )
            // InternalRoverml.g:1009:2: ( (this_TriggeredTransition_0= ruleTriggeredTransition )? ( ( ruleQualifiedName ) ) otherlv_2= '>' ( ( ruleQualifiedName ) ) (otherlv_4= ',' )? )
            {
            // InternalRoverml.g:1009:2: ( (this_TriggeredTransition_0= ruleTriggeredTransition )? ( ( ruleQualifiedName ) ) otherlv_2= '>' ( ( ruleQualifiedName ) ) (otherlv_4= ',' )? )
            // InternalRoverml.g:1010:3: (this_TriggeredTransition_0= ruleTriggeredTransition )? ( ( ruleQualifiedName ) ) otherlv_2= '>' ( ( ruleQualifiedName ) ) (otherlv_4= ',' )?
            {
            // InternalRoverml.g:1010:3: (this_TriggeredTransition_0= ruleTriggeredTransition )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalRoverml.g:1011:4: this_TriggeredTransition_0= ruleTriggeredTransition
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTransitionAccess().getTriggeredTransitionParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_TriggeredTransition_0=ruleTriggeredTransition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TriggeredTransition_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalRoverml.g:1020:3: ( ( ruleQualifiedName ) )
            // InternalRoverml.g:1021:4: ( ruleQualifiedName )
            {
            // InternalRoverml.g:1021:4: ( ruleQualifiedName )
            // InternalRoverml.g:1022:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTransitionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTransitionAccess().getSourceCommandCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getGreaterThanSignKeyword_2());
              		
            }
            // InternalRoverml.g:1040:3: ( ( ruleQualifiedName ) )
            // InternalRoverml.g:1041:4: ( ruleQualifiedName )
            {
            // InternalRoverml.g:1041:4: ( ruleQualifiedName )
            // InternalRoverml.g:1042:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTransitionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTransitionAccess().getTargetCommandCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:1056:3: (otherlv_4= ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRoverml.g:1057:4: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getCommaKeyword_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleTriggeredTransition"
    // InternalRoverml.g:1066:1: entryRuleTriggeredTransition returns [EObject current=null] : iv_ruleTriggeredTransition= ruleTriggeredTransition EOF ;
    public final EObject entryRuleTriggeredTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggeredTransition = null;


        try {
            // InternalRoverml.g:1066:60: (iv_ruleTriggeredTransition= ruleTriggeredTransition EOF )
            // InternalRoverml.g:1067:2: iv_ruleTriggeredTransition= ruleTriggeredTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriggeredTransitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTriggeredTransition=ruleTriggeredTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTriggeredTransition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTriggeredTransition"


    // $ANTLR start "ruleTriggeredTransition"
    // InternalRoverml.g:1073:1: ruleTriggeredTransition returns [EObject current=null] : ( (otherlv_0= 'if' this_DistanceSensorTrigger_1= ruleDistanceSensorTrigger ) | this_GpsTrigger_2= ruleGpsTrigger | this_CompassTrigger_3= ruleCompassTrigger ) ;
    public final EObject ruleTriggeredTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_DistanceSensorTrigger_1 = null;

        EObject this_GpsTrigger_2 = null;

        EObject this_CompassTrigger_3 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1079:2: ( ( (otherlv_0= 'if' this_DistanceSensorTrigger_1= ruleDistanceSensorTrigger ) | this_GpsTrigger_2= ruleGpsTrigger | this_CompassTrigger_3= ruleCompassTrigger ) )
            // InternalRoverml.g:1080:2: ( (otherlv_0= 'if' this_DistanceSensorTrigger_1= ruleDistanceSensorTrigger ) | this_GpsTrigger_2= ruleGpsTrigger | this_CompassTrigger_3= ruleCompassTrigger )
            {
            // InternalRoverml.g:1080:2: ( (otherlv_0= 'if' this_DistanceSensorTrigger_1= ruleDistanceSensorTrigger ) | this_GpsTrigger_2= ruleGpsTrigger | this_CompassTrigger_3= ruleCompassTrigger )
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalRoverml.g:1081:3: (otherlv_0= 'if' this_DistanceSensorTrigger_1= ruleDistanceSensorTrigger )
                    {
                    // InternalRoverml.g:1081:3: (otherlv_0= 'if' this_DistanceSensorTrigger_1= ruleDistanceSensorTrigger )
                    // InternalRoverml.g:1082:4: otherlv_0= 'if' this_DistanceSensorTrigger_1= ruleDistanceSensorTrigger
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getTriggeredTransitionAccess().getIfKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTriggeredTransitionAccess().getDistanceSensorTriggerParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_DistanceSensorTrigger_1=ruleDistanceSensorTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_DistanceSensorTrigger_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:1096:3: this_GpsTrigger_2= ruleGpsTrigger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTriggeredTransitionAccess().getGpsTriggerParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GpsTrigger_2=ruleGpsTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GpsTrigger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalRoverml.g:1105:3: this_CompassTrigger_3= ruleCompassTrigger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTriggeredTransitionAccess().getCompassTriggerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CompassTrigger_3=ruleCompassTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CompassTrigger_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTriggeredTransition"


    // $ANTLR start "entryRuleGPS"
    // InternalRoverml.g:1117:1: entryRuleGPS returns [EObject current=null] : iv_ruleGPS= ruleGPS EOF ;
    public final EObject entryRuleGPS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGPS = null;


        try {
            // InternalRoverml.g:1117:44: (iv_ruleGPS= ruleGPS EOF )
            // InternalRoverml.g:1118:2: iv_ruleGPS= ruleGPS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGPSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGPS=ruleGPS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGPS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGPS"


    // $ANTLR start "ruleGPS"
    // InternalRoverml.g:1124:1: ruleGPS returns [EObject current=null] : ( () otherlv_1= 'gps' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleGPS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRoverml.g:1130:2: ( ( () otherlv_1= 'gps' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalRoverml.g:1131:2: ( () otherlv_1= 'gps' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalRoverml.g:1131:2: ( () otherlv_1= 'gps' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalRoverml.g:1132:3: () otherlv_1= 'gps' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )?
            {
            // InternalRoverml.g:1132:3: ()
            // InternalRoverml.g:1133:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGPSAccess().getGPSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGPSAccess().getGpsKeyword_1());
              		
            }
            // InternalRoverml.g:1143:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRoverml.g:1144:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRoverml.g:1144:4: (lv_name_2_0= RULE_ID )
            // InternalRoverml.g:1145:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getGPSAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGPSRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalRoverml.g:1161:3: (otherlv_3= ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRoverml.g:1162:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getGPSAccess().getCommaKeyword_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGPS"


    // $ANTLR start "entryRuleDistanceSensor"
    // InternalRoverml.g:1171:1: entryRuleDistanceSensor returns [EObject current=null] : iv_ruleDistanceSensor= ruleDistanceSensor EOF ;
    public final EObject entryRuleDistanceSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceSensor = null;


        try {
            // InternalRoverml.g:1171:55: (iv_ruleDistanceSensor= ruleDistanceSensor EOF )
            // InternalRoverml.g:1172:2: iv_ruleDistanceSensor= ruleDistanceSensor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDistanceSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDistanceSensor=ruleDistanceSensor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDistanceSensor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDistanceSensor"


    // $ANTLR start "ruleDistanceSensor"
    // InternalRoverml.g:1178:1: ruleDistanceSensor returns [EObject current=null] : ( () otherlv_1= 'distanceSensor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )? (otherlv_7= ',' )? ) ;
    public final EObject ruleDistanceSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_kind_5_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1184:2: ( ( () otherlv_1= 'distanceSensor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )? (otherlv_7= ',' )? ) )
            // InternalRoverml.g:1185:2: ( () otherlv_1= 'distanceSensor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )? (otherlv_7= ',' )? )
            {
            // InternalRoverml.g:1185:2: ( () otherlv_1= 'distanceSensor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )? (otherlv_7= ',' )? )
            // InternalRoverml.g:1186:3: () otherlv_1= 'distanceSensor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )? (otherlv_7= ',' )?
            {
            // InternalRoverml.g:1186:3: ()
            // InternalRoverml.g:1187:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDistanceSensorAccess().getDistanceSensorAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDistanceSensorAccess().getDistanceSensorKeyword_1());
              		
            }
            // InternalRoverml.g:1197:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRoverml.g:1198:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRoverml.g:1198:4: (lv_name_2_0= RULE_ID )
            // InternalRoverml.g:1199:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDistanceSensorAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDistanceSensorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalRoverml.g:1215:3: (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRoverml.g:1216:4: otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDistanceSensorAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalRoverml.g:1220:4: (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==40) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalRoverml.g:1221:5: otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,40,FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getDistanceSensorAccess().getKindKeyword_3_1_0());
                              				
                            }
                            // InternalRoverml.g:1225:5: ( (lv_kind_5_0= ruleEString ) )
                            // InternalRoverml.g:1226:6: (lv_kind_5_0= ruleEString )
                            {
                            // InternalRoverml.g:1226:6: (lv_kind_5_0= ruleEString )
                            // InternalRoverml.g:1227:7: lv_kind_5_0= ruleEString
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDistanceSensorAccess().getKindEStringParserRuleCall_3_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_21);
                            lv_kind_5_0=ruleEString();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDistanceSensorRule());
                              							}
                              							set(
                              								current,
                              								"kind",
                              								lv_kind_5_0,
                              								"at.ac.tuwien.big.Roverml.EString");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,26,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getDistanceSensorAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalRoverml.g:1250:3: (otherlv_7= ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRoverml.g:1251:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDistanceSensorAccess().getCommaKeyword_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDistanceSensor"


    // $ANTLR start "entryRuleCompass"
    // InternalRoverml.g:1260:1: entryRuleCompass returns [EObject current=null] : iv_ruleCompass= ruleCompass EOF ;
    public final EObject entryRuleCompass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompass = null;


        try {
            // InternalRoverml.g:1260:48: (iv_ruleCompass= ruleCompass EOF )
            // InternalRoverml.g:1261:2: iv_ruleCompass= ruleCompass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompass=ruleCompass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompass"


    // $ANTLR start "ruleCompass"
    // InternalRoverml.g:1267:1: ruleCompass returns [EObject current=null] : ( () otherlv_1= 'compass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )? (otherlv_7= ',' )? ) ;
    public final EObject ruleCompass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_kind_5_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1273:2: ( ( () otherlv_1= 'compass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )? (otherlv_7= ',' )? ) )
            // InternalRoverml.g:1274:2: ( () otherlv_1= 'compass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )? (otherlv_7= ',' )? )
            {
            // InternalRoverml.g:1274:2: ( () otherlv_1= 'compass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )? (otherlv_7= ',' )? )
            // InternalRoverml.g:1275:3: () otherlv_1= 'compass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )? (otherlv_7= ',' )?
            {
            // InternalRoverml.g:1275:3: ()
            // InternalRoverml.g:1276:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCompassAccess().getCompassAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCompassAccess().getCompassKeyword_1());
              		
            }
            // InternalRoverml.g:1286:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRoverml.g:1287:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRoverml.g:1287:4: (lv_name_2_0= RULE_ID )
            // InternalRoverml.g:1288:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getCompassAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCompassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalRoverml.g:1304:3: (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRoverml.g:1305:4: otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getCompassAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalRoverml.g:1309:4: (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==40) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalRoverml.g:1310:5: otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,40,FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getCompassAccess().getKindKeyword_3_1_0());
                              				
                            }
                            // InternalRoverml.g:1314:5: ( (lv_kind_5_0= ruleEString ) )
                            // InternalRoverml.g:1315:6: (lv_kind_5_0= ruleEString )
                            {
                            // InternalRoverml.g:1315:6: (lv_kind_5_0= ruleEString )
                            // InternalRoverml.g:1316:7: lv_kind_5_0= ruleEString
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getCompassAccess().getKindEStringParserRuleCall_3_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_21);
                            lv_kind_5_0=ruleEString();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getCompassRule());
                              							}
                              							set(
                              								current,
                              								"kind",
                              								lv_kind_5_0,
                              								"at.ac.tuwien.big.Roverml.EString");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,26,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCompassAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalRoverml.g:1339:3: (otherlv_7= ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRoverml.g:1340:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getCompassAccess().getCommaKeyword_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCompass"


    // $ANTLR start "entryRuleSingleQuantity"
    // InternalRoverml.g:1349:1: entryRuleSingleQuantity returns [EObject current=null] : iv_ruleSingleQuantity= ruleSingleQuantity EOF ;
    public final EObject entryRuleSingleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleQuantity = null;


        try {
            // InternalRoverml.g:1349:55: (iv_ruleSingleQuantity= ruleSingleQuantity EOF )
            // InternalRoverml.g:1350:2: iv_ruleSingleQuantity= ruleSingleQuantity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleQuantityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSingleQuantity=ruleSingleQuantity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleQuantity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleQuantity"


    // $ANTLR start "ruleSingleQuantity"
    // InternalRoverml.g:1356:1: ruleSingleQuantity returns [EObject current=null] : (this_Time_0= ruleTime | this_Velocity_1= ruleVelocity | this_Angle_2= ruleAngle | this_Length_3= ruleLength ) ;
    public final EObject ruleSingleQuantity() throws RecognitionException {
        EObject current = null;

        EObject this_Time_0 = null;

        EObject this_Velocity_1 = null;

        EObject this_Angle_2 = null;

        EObject this_Length_3 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1362:2: ( (this_Time_0= ruleTime | this_Velocity_1= ruleVelocity | this_Angle_2= ruleAngle | this_Length_3= ruleLength ) )
            // InternalRoverml.g:1363:2: (this_Time_0= ruleTime | this_Velocity_1= ruleVelocity | this_Angle_2= ruleAngle | this_Length_3= ruleLength )
            {
            // InternalRoverml.g:1363:2: (this_Time_0= ruleTime | this_Velocity_1= ruleVelocity | this_Angle_2= ruleAngle | this_Length_3= ruleLength )
            int alt27=4;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalRoverml.g:1364:3: this_Time_0= ruleTime
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSingleQuantityAccess().getTimeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Time_0=ruleTime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Time_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRoverml.g:1373:3: this_Velocity_1= ruleVelocity
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSingleQuantityAccess().getVelocityParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Velocity_1=ruleVelocity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Velocity_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalRoverml.g:1382:3: this_Angle_2= ruleAngle
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSingleQuantityAccess().getAngleParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Angle_2=ruleAngle();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Angle_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalRoverml.g:1391:3: this_Length_3= ruleLength
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSingleQuantityAccess().getLengthParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Length_3=ruleLength();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Length_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSingleQuantity"


    // $ANTLR start "entryRuleTime"
    // InternalRoverml.g:1403:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalRoverml.g:1403:45: (iv_ruleTime= ruleTime EOF )
            // InternalRoverml.g:1404:2: iv_ruleTime= ruleTime EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTime; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalRoverml.g:1410:1: ruleTime returns [EObject current=null] : ( ( (lv_value_0_0= ruleEFloat ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        Enumerator lv_timeUnit_1_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1416:2: ( ( ( (lv_value_0_0= ruleEFloat ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) ) ) )
            // InternalRoverml.g:1417:2: ( ( (lv_value_0_0= ruleEFloat ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) ) )
            {
            // InternalRoverml.g:1417:2: ( ( (lv_value_0_0= ruleEFloat ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) ) )
            // InternalRoverml.g:1418:3: ( (lv_value_0_0= ruleEFloat ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) )
            {
            // InternalRoverml.g:1418:3: ( (lv_value_0_0= ruleEFloat ) )
            // InternalRoverml.g:1419:4: (lv_value_0_0= ruleEFloat )
            {
            // InternalRoverml.g:1419:4: (lv_value_0_0= ruleEFloat )
            // InternalRoverml.g:1420:5: lv_value_0_0= ruleEFloat
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTimeAccess().getValueEFloatParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_39);
            lv_value_0_0=ruleEFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTimeRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_0_0,
              						"at.ac.tuwien.big.Roverml.EFloat");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:1437:3: ( (lv_timeUnit_1_0= ruleTimeUnit ) )
            // InternalRoverml.g:1438:4: (lv_timeUnit_1_0= ruleTimeUnit )
            {
            // InternalRoverml.g:1438:4: (lv_timeUnit_1_0= ruleTimeUnit )
            // InternalRoverml.g:1439:5: lv_timeUnit_1_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTimeAccess().getTimeUnitTimeUnitEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_timeUnit_1_0=ruleTimeUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTimeRule());
              					}
              					set(
              						current,
              						"timeUnit",
              						lv_timeUnit_1_0,
              						"at.ac.tuwien.big.Roverml.TimeUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleAngle"
    // InternalRoverml.g:1460:1: entryRuleAngle returns [EObject current=null] : iv_ruleAngle= ruleAngle EOF ;
    public final EObject entryRuleAngle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle = null;


        try {
            // InternalRoverml.g:1460:46: (iv_ruleAngle= ruleAngle EOF )
            // InternalRoverml.g:1461:2: iv_ruleAngle= ruleAngle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAngleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAngle=ruleAngle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAngle; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAngle"


    // $ANTLR start "ruleAngle"
    // InternalRoverml.g:1467:1: ruleAngle returns [EObject current=null] : ( ( (lv_value_0_0= ruleEFloat ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) ) ) ;
    public final EObject ruleAngle() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        Enumerator lv_angleUnit_1_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1473:2: ( ( ( (lv_value_0_0= ruleEFloat ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) ) ) )
            // InternalRoverml.g:1474:2: ( ( (lv_value_0_0= ruleEFloat ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) ) )
            {
            // InternalRoverml.g:1474:2: ( ( (lv_value_0_0= ruleEFloat ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) ) )
            // InternalRoverml.g:1475:3: ( (lv_value_0_0= ruleEFloat ) ) ( (lv_angleUnit_1_0= ruleAngleUnit ) )
            {
            // InternalRoverml.g:1475:3: ( (lv_value_0_0= ruleEFloat ) )
            // InternalRoverml.g:1476:4: (lv_value_0_0= ruleEFloat )
            {
            // InternalRoverml.g:1476:4: (lv_value_0_0= ruleEFloat )
            // InternalRoverml.g:1477:5: lv_value_0_0= ruleEFloat
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAngleAccess().getValueEFloatParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_40);
            lv_value_0_0=ruleEFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAngleRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_0_0,
              						"at.ac.tuwien.big.Roverml.EFloat");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:1494:3: ( (lv_angleUnit_1_0= ruleAngleUnit ) )
            // InternalRoverml.g:1495:4: (lv_angleUnit_1_0= ruleAngleUnit )
            {
            // InternalRoverml.g:1495:4: (lv_angleUnit_1_0= ruleAngleUnit )
            // InternalRoverml.g:1496:5: lv_angleUnit_1_0= ruleAngleUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAngleAccess().getAngleUnitAngleUnitEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_angleUnit_1_0=ruleAngleUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAngleRule());
              					}
              					set(
              						current,
              						"angleUnit",
              						lv_angleUnit_1_0,
              						"at.ac.tuwien.big.Roverml.AngleUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAngle"


    // $ANTLR start "entryRuleVelocity"
    // InternalRoverml.g:1517:1: entryRuleVelocity returns [EObject current=null] : iv_ruleVelocity= ruleVelocity EOF ;
    public final EObject entryRuleVelocity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVelocity = null;


        try {
            // InternalRoverml.g:1517:49: (iv_ruleVelocity= ruleVelocity EOF )
            // InternalRoverml.g:1518:2: iv_ruleVelocity= ruleVelocity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVelocityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVelocity=ruleVelocity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVelocity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVelocity"


    // $ANTLR start "ruleVelocity"
    // InternalRoverml.g:1524:1: ruleVelocity returns [EObject current=null] : ( ( (lv_value_0_0= ruleEFloat ) ) ( (lv_velocityUnit_1_0= ruleVelocityUnit ) ) ) ;
    public final EObject ruleVelocity() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        Enumerator lv_velocityUnit_1_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1530:2: ( ( ( (lv_value_0_0= ruleEFloat ) ) ( (lv_velocityUnit_1_0= ruleVelocityUnit ) ) ) )
            // InternalRoverml.g:1531:2: ( ( (lv_value_0_0= ruleEFloat ) ) ( (lv_velocityUnit_1_0= ruleVelocityUnit ) ) )
            {
            // InternalRoverml.g:1531:2: ( ( (lv_value_0_0= ruleEFloat ) ) ( (lv_velocityUnit_1_0= ruleVelocityUnit ) ) )
            // InternalRoverml.g:1532:3: ( (lv_value_0_0= ruleEFloat ) ) ( (lv_velocityUnit_1_0= ruleVelocityUnit ) )
            {
            // InternalRoverml.g:1532:3: ( (lv_value_0_0= ruleEFloat ) )
            // InternalRoverml.g:1533:4: (lv_value_0_0= ruleEFloat )
            {
            // InternalRoverml.g:1533:4: (lv_value_0_0= ruleEFloat )
            // InternalRoverml.g:1534:5: lv_value_0_0= ruleEFloat
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVelocityAccess().getValueEFloatParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_41);
            lv_value_0_0=ruleEFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVelocityRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_0_0,
              						"at.ac.tuwien.big.Roverml.EFloat");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:1551:3: ( (lv_velocityUnit_1_0= ruleVelocityUnit ) )
            // InternalRoverml.g:1552:4: (lv_velocityUnit_1_0= ruleVelocityUnit )
            {
            // InternalRoverml.g:1552:4: (lv_velocityUnit_1_0= ruleVelocityUnit )
            // InternalRoverml.g:1553:5: lv_velocityUnit_1_0= ruleVelocityUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVelocityAccess().getVelocityUnitVelocityUnitEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_velocityUnit_1_0=ruleVelocityUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVelocityRule());
              					}
              					set(
              						current,
              						"velocityUnit",
              						lv_velocityUnit_1_0,
              						"at.ac.tuwien.big.Roverml.VelocityUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVelocity"


    // $ANTLR start "entryRuleLight"
    // InternalRoverml.g:1574:1: entryRuleLight returns [EObject current=null] : iv_ruleLight= ruleLight EOF ;
    public final EObject entryRuleLight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLight = null;


        try {
            // InternalRoverml.g:1574:46: (iv_ruleLight= ruleLight EOF )
            // InternalRoverml.g:1575:2: iv_ruleLight= ruleLight EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLightRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLight=ruleLight();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLight; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLight"


    // $ANTLR start "ruleLight"
    // InternalRoverml.g:1581:1: ruleLight returns [EObject current=null] : ( () otherlv_1= 'light' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )? (otherlv_7= ',' )? ) ;
    public final EObject ruleLight() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_kind_5_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1587:2: ( ( () otherlv_1= 'light' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )? (otherlv_7= ',' )? ) )
            // InternalRoverml.g:1588:2: ( () otherlv_1= 'light' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )? (otherlv_7= ',' )? )
            {
            // InternalRoverml.g:1588:2: ( () otherlv_1= 'light' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )? (otherlv_7= ',' )? )
            // InternalRoverml.g:1589:3: () otherlv_1= 'light' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )? (otherlv_7= ',' )?
            {
            // InternalRoverml.g:1589:3: ()
            // InternalRoverml.g:1590:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLightAccess().getLightAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLightAccess().getLightKeyword_1());
              		
            }
            // InternalRoverml.g:1600:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRoverml.g:1601:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRoverml.g:1601:4: (lv_name_2_0= RULE_ID )
            // InternalRoverml.g:1602:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getLightAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLightRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalRoverml.g:1618:3: (otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRoverml.g:1619:4: otherlv_3= '(' (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )? otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLightAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalRoverml.g:1623:4: (otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==40) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalRoverml.g:1624:5: otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,40,FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getLightAccess().getKindKeyword_3_1_0());
                              				
                            }
                            // InternalRoverml.g:1628:5: ( (lv_kind_5_0= ruleEString ) )
                            // InternalRoverml.g:1629:6: (lv_kind_5_0= ruleEString )
                            {
                            // InternalRoverml.g:1629:6: (lv_kind_5_0= ruleEString )
                            // InternalRoverml.g:1630:7: lv_kind_5_0= ruleEString
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getLightAccess().getKindEStringParserRuleCall_3_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_21);
                            lv_kind_5_0=ruleEString();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getLightRule());
                              							}
                              							set(
                              								current,
                              								"kind",
                              								lv_kind_5_0,
                              								"at.ac.tuwien.big.Roverml.EString");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,26,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getLightAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalRoverml.g:1653:3: (otherlv_7= ',' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==18) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRoverml.g:1654:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getLightAccess().getCommaKeyword_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLight"


    // $ANTLR start "entryRuleLength"
    // InternalRoverml.g:1663:1: entryRuleLength returns [EObject current=null] : iv_ruleLength= ruleLength EOF ;
    public final EObject entryRuleLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLength = null;


        try {
            // InternalRoverml.g:1663:47: (iv_ruleLength= ruleLength EOF )
            // InternalRoverml.g:1664:2: iv_ruleLength= ruleLength EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLengthRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLength=ruleLength();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLength; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLength"


    // $ANTLR start "ruleLength"
    // InternalRoverml.g:1670:1: ruleLength returns [EObject current=null] : ( ( (lv_value_0_0= ruleEFloat ) ) ( (lv_lengthUnit_1_0= ruleLengthUnit ) ) ) ;
    public final EObject ruleLength() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        Enumerator lv_lengthUnit_1_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1676:2: ( ( ( (lv_value_0_0= ruleEFloat ) ) ( (lv_lengthUnit_1_0= ruleLengthUnit ) ) ) )
            // InternalRoverml.g:1677:2: ( ( (lv_value_0_0= ruleEFloat ) ) ( (lv_lengthUnit_1_0= ruleLengthUnit ) ) )
            {
            // InternalRoverml.g:1677:2: ( ( (lv_value_0_0= ruleEFloat ) ) ( (lv_lengthUnit_1_0= ruleLengthUnit ) ) )
            // InternalRoverml.g:1678:3: ( (lv_value_0_0= ruleEFloat ) ) ( (lv_lengthUnit_1_0= ruleLengthUnit ) )
            {
            // InternalRoverml.g:1678:3: ( (lv_value_0_0= ruleEFloat ) )
            // InternalRoverml.g:1679:4: (lv_value_0_0= ruleEFloat )
            {
            // InternalRoverml.g:1679:4: (lv_value_0_0= ruleEFloat )
            // InternalRoverml.g:1680:5: lv_value_0_0= ruleEFloat
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLengthAccess().getValueEFloatParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_value_0_0=ruleEFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLengthRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_0_0,
              						"at.ac.tuwien.big.Roverml.EFloat");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:1697:3: ( (lv_lengthUnit_1_0= ruleLengthUnit ) )
            // InternalRoverml.g:1698:4: (lv_lengthUnit_1_0= ruleLengthUnit )
            {
            // InternalRoverml.g:1698:4: (lv_lengthUnit_1_0= ruleLengthUnit )
            // InternalRoverml.g:1699:5: lv_lengthUnit_1_0= ruleLengthUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLengthAccess().getLengthUnitLengthUnitEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_lengthUnit_1_0=ruleLengthUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLengthRule());
              					}
              					set(
              						current,
              						"lengthUnit",
              						lv_lengthUnit_1_0,
              						"at.ac.tuwien.big.Roverml.LengthUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLength"


    // $ANTLR start "entryRuleSensor"
    // InternalRoverml.g:1720:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalRoverml.g:1720:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalRoverml.g:1721:2: iv_ruleSensor= ruleSensor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSensor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalRoverml.g:1727:1: ruleSensor returns [EObject current=null] : (this_GPS_0= ruleGPS | this_DistanceSensor_1= ruleDistanceSensor | (this_Compass_2= ruleCompass ( (lv_lastSensedValue_3_0= ruleQuantity ) )? ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        EObject this_GPS_0 = null;

        EObject this_DistanceSensor_1 = null;

        EObject this_Compass_2 = null;

        EObject lv_lastSensedValue_3_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1733:2: ( (this_GPS_0= ruleGPS | this_DistanceSensor_1= ruleDistanceSensor | (this_Compass_2= ruleCompass ( (lv_lastSensedValue_3_0= ruleQuantity ) )? ) ) )
            // InternalRoverml.g:1734:2: (this_GPS_0= ruleGPS | this_DistanceSensor_1= ruleDistanceSensor | (this_Compass_2= ruleCompass ( (lv_lastSensedValue_3_0= ruleQuantity ) )? ) )
            {
            // InternalRoverml.g:1734:2: (this_GPS_0= ruleGPS | this_DistanceSensor_1= ruleDistanceSensor | (this_Compass_2= ruleCompass ( (lv_lastSensedValue_3_0= ruleQuantity ) )? ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt32=1;
                }
                break;
            case 39:
                {
                alt32=2;
                }
                break;
            case 41:
                {
                alt32=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalRoverml.g:1735:3: this_GPS_0= ruleGPS
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorAccess().getGPSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GPS_0=ruleGPS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GPS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRoverml.g:1744:3: this_DistanceSensor_1= ruleDistanceSensor
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSensorAccess().getDistanceSensorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DistanceSensor_1=ruleDistanceSensor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DistanceSensor_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalRoverml.g:1753:3: (this_Compass_2= ruleCompass ( (lv_lastSensedValue_3_0= ruleQuantity ) )? )
                    {
                    // InternalRoverml.g:1753:3: (this_Compass_2= ruleCompass ( (lv_lastSensedValue_3_0= ruleQuantity ) )? )
                    // InternalRoverml.g:1754:4: this_Compass_2= ruleCompass ( (lv_lastSensedValue_3_0= ruleQuantity ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSensorAccess().getCompassParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_43);
                    this_Compass_2=ruleCompass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Compass_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalRoverml.g:1762:4: ( (lv_lastSensedValue_3_0= ruleQuantity ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_INT||LA31_0==45||(LA31_0>=48 && LA31_0<=49)) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalRoverml.g:1763:5: (lv_lastSensedValue_3_0= ruleQuantity )
                            {
                            // InternalRoverml.g:1763:5: (lv_lastSensedValue_3_0= ruleQuantity )
                            // InternalRoverml.g:1764:6: lv_lastSensedValue_3_0= ruleQuantity
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getSensorAccess().getLastSensedValueQuantityParserRuleCall_2_1_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_lastSensedValue_3_0=ruleQuantity();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getSensorRule());
                              						}
                              						set(
                              							current,
                              							"lastSensedValue",
                              							lv_lastSensedValue_3_0,
                              							"at.ac.tuwien.big.Roverml.Quantity");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleMotor"
    // InternalRoverml.g:1786:1: entryRuleMotor returns [EObject current=null] : iv_ruleMotor= ruleMotor EOF ;
    public final EObject entryRuleMotor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotor = null;


        try {
            // InternalRoverml.g:1786:46: (iv_ruleMotor= ruleMotor EOF )
            // InternalRoverml.g:1787:2: iv_ruleMotor= ruleMotor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMotorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMotor=ruleMotor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMotor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMotor"


    // $ANTLR start "ruleMotor"
    // InternalRoverml.g:1793:1: ruleMotor returns [EObject current=null] : ( () otherlv_1= 'motor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleMotor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRoverml.g:1799:2: ( ( () otherlv_1= 'motor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalRoverml.g:1800:2: ( () otherlv_1= 'motor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalRoverml.g:1800:2: ( () otherlv_1= 'motor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalRoverml.g:1801:3: () otherlv_1= 'motor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )?
            {
            // InternalRoverml.g:1801:3: ()
            // InternalRoverml.g:1802:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMotorAccess().getMotorAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMotorAccess().getMotorKeyword_1());
              		
            }
            // InternalRoverml.g:1812:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRoverml.g:1813:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRoverml.g:1813:4: (lv_name_2_0= RULE_ID )
            // InternalRoverml.g:1814:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getMotorAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMotorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalRoverml.g:1830:3: (otherlv_3= ',' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==18) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRoverml.g:1831:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMotorAccess().getCommaKeyword_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMotor"


    // $ANTLR start "entryRuleTerminate"
    // InternalRoverml.g:1840:1: entryRuleTerminate returns [EObject current=null] : iv_ruleTerminate= ruleTerminate EOF ;
    public final EObject entryRuleTerminate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminate = null;


        try {
            // InternalRoverml.g:1840:50: (iv_ruleTerminate= ruleTerminate EOF )
            // InternalRoverml.g:1841:2: iv_ruleTerminate= ruleTerminate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminate=ruleTerminate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerminate"


    // $ANTLR start "ruleTerminate"
    // InternalRoverml.g:1847:1: ruleTerminate returns [EObject current=null] : ( () otherlv_1= 'terminate' ) ;
    public final EObject ruleTerminate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:1853:2: ( ( () otherlv_1= 'terminate' ) )
            // InternalRoverml.g:1854:2: ( () otherlv_1= 'terminate' )
            {
            // InternalRoverml.g:1854:2: ( () otherlv_1= 'terminate' )
            // InternalRoverml.g:1855:3: () otherlv_1= 'terminate'
            {
            // InternalRoverml.g:1855:3: ()
            // InternalRoverml.g:1856:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTerminateAccess().getTerminateAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTerminateAccess().getTerminateKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTerminate"


    // $ANTLR start "entryRuleComponent"
    // InternalRoverml.g:1870:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalRoverml.g:1870:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalRoverml.g:1871:2: iv_ruleComponent= ruleComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalRoverml.g:1877:1: ruleComponent returns [EObject current=null] : (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Actuator_0 = null;

        EObject this_Sensor_1 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1883:2: ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) )
            // InternalRoverml.g:1884:2: (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor )
            {
            // InternalRoverml.g:1884:2: (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=42 && LA34_0<=43)) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=38 && LA34_0<=39)||LA34_0==41) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalRoverml.g:1885:3: this_Actuator_0= ruleActuator
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentAccess().getActuatorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Actuator_0=ruleActuator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Actuator_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRoverml.g:1894:3: this_Sensor_1= ruleSensor
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentAccess().getSensorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Sensor_1=ruleSensor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Sensor_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleActuator"
    // InternalRoverml.g:1906:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalRoverml.g:1906:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalRoverml.g:1907:2: iv_ruleActuator= ruleActuator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActuatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActuator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalRoverml.g:1913:1: ruleActuator returns [EObject current=null] : (this_Light_0= ruleLight | this_Motor_1= ruleMotor ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        EObject this_Light_0 = null;

        EObject this_Motor_1 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1919:2: ( (this_Light_0= ruleLight | this_Motor_1= ruleMotor ) )
            // InternalRoverml.g:1920:2: (this_Light_0= ruleLight | this_Motor_1= ruleMotor )
            {
            // InternalRoverml.g:1920:2: (this_Light_0= ruleLight | this_Motor_1= ruleMotor )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            else if ( (LA35_0==43) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalRoverml.g:1921:3: this_Light_0= ruleLight
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActuatorAccess().getLightParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Light_0=ruleLight();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Light_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRoverml.g:1930:3: this_Motor_1= ruleMotor
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActuatorAccess().getMotorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Motor_1=ruleMotor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Motor_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleDistanceSensorTrigger"
    // InternalRoverml.g:1942:1: entryRuleDistanceSensorTrigger returns [EObject current=null] : iv_ruleDistanceSensorTrigger= ruleDistanceSensorTrigger EOF ;
    public final EObject entryRuleDistanceSensorTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceSensorTrigger = null;


        try {
            // InternalRoverml.g:1942:62: (iv_ruleDistanceSensorTrigger= ruleDistanceSensorTrigger EOF )
            // InternalRoverml.g:1943:2: iv_ruleDistanceSensorTrigger= ruleDistanceSensorTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDistanceSensorTriggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDistanceSensorTrigger=ruleDistanceSensorTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDistanceSensorTrigger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDistanceSensorTrigger"


    // $ANTLR start "ruleDistanceSensorTrigger"
    // InternalRoverml.g:1949:1: ruleDistanceSensorTrigger returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparisonValue_3_0= ruleLength ) ) otherlv_4= ':' ) ;
    public final EObject ruleDistanceSensorTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_comparisonValue_3_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1955:2: ( ( () ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparisonValue_3_0= ruleLength ) ) otherlv_4= ':' ) )
            // InternalRoverml.g:1956:2: ( () ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparisonValue_3_0= ruleLength ) ) otherlv_4= ':' )
            {
            // InternalRoverml.g:1956:2: ( () ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparisonValue_3_0= ruleLength ) ) otherlv_4= ':' )
            // InternalRoverml.g:1957:3: () ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparisonValue_3_0= ruleLength ) ) otherlv_4= ':'
            {
            // InternalRoverml.g:1957:3: ()
            // InternalRoverml.g:1958:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDistanceSensorTriggerAccess().getDistanceSensorTriggerAction_0(),
              					current);
              			
            }

            }

            // InternalRoverml.g:1964:3: ( ( ruleQualifiedName ) )
            // InternalRoverml.g:1965:4: ( ruleQualifiedName )
            {
            // InternalRoverml.g:1965:4: ( ruleQualifiedName )
            // InternalRoverml.g:1966:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDistanceSensorTriggerRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDistanceSensorTriggerAccess().getSensorDistanceSensorCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:1980:3: ( (lv_operator_2_0= ruleComparisonOperator ) )
            // InternalRoverml.g:1981:4: (lv_operator_2_0= ruleComparisonOperator )
            {
            // InternalRoverml.g:1981:4: (lv_operator_2_0= ruleComparisonOperator )
            // InternalRoverml.g:1982:5: lv_operator_2_0= ruleComparisonOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDistanceSensorTriggerAccess().getOperatorComparisonOperatorEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_operator_2_0=ruleComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDistanceSensorTriggerRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_2_0,
              						"at.ac.tuwien.big.Roverml.ComparisonOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:1999:3: ( (lv_comparisonValue_3_0= ruleLength ) )
            // InternalRoverml.g:2000:4: (lv_comparisonValue_3_0= ruleLength )
            {
            // InternalRoverml.g:2000:4: (lv_comparisonValue_3_0= ruleLength )
            // InternalRoverml.g:2001:5: lv_comparisonValue_3_0= ruleLength
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDistanceSensorTriggerAccess().getComparisonValueLengthParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_comparisonValue_3_0=ruleLength();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDistanceSensorTriggerRule());
              					}
              					set(
              						current,
              						"comparisonValue",
              						lv_comparisonValue_3_0,
              						"at.ac.tuwien.big.Roverml.Length");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDistanceSensorTriggerAccess().getColonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDistanceSensorTrigger"


    // $ANTLR start "entryRuleGpsTrigger"
    // InternalRoverml.g:2026:1: entryRuleGpsTrigger returns [EObject current=null] : iv_ruleGpsTrigger= ruleGpsTrigger EOF ;
    public final EObject entryRuleGpsTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGpsTrigger = null;


        try {
            // InternalRoverml.g:2026:51: (iv_ruleGpsTrigger= ruleGpsTrigger EOF )
            // InternalRoverml.g:2027:2: iv_ruleGpsTrigger= ruleGpsTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGpsTriggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGpsTrigger=ruleGpsTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGpsTrigger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGpsTrigger"


    // $ANTLR start "ruleGpsTrigger"
    // InternalRoverml.g:2033:1: ruleGpsTrigger returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparisonValue_3_0= rulePosition ) ) otherlv_4= ':' ) ;
    public final EObject ruleGpsTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_comparisonValue_3_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:2039:2: ( ( () ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparisonValue_3_0= rulePosition ) ) otherlv_4= ':' ) )
            // InternalRoverml.g:2040:2: ( () ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparisonValue_3_0= rulePosition ) ) otherlv_4= ':' )
            {
            // InternalRoverml.g:2040:2: ( () ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparisonValue_3_0= rulePosition ) ) otherlv_4= ':' )
            // InternalRoverml.g:2041:3: () ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparisonValue_3_0= rulePosition ) ) otherlv_4= ':'
            {
            // InternalRoverml.g:2041:3: ()
            // InternalRoverml.g:2042:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGpsTriggerAccess().getGpsTriggerAction_0(),
              					current);
              			
            }

            }

            // InternalRoverml.g:2048:3: ( ( ruleQualifiedName ) )
            // InternalRoverml.g:2049:4: ( ruleQualifiedName )
            {
            // InternalRoverml.g:2049:4: ( ruleQualifiedName )
            // InternalRoverml.g:2050:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGpsTriggerRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGpsTriggerAccess().getSensorGPSCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:2064:3: ( (lv_operator_2_0= ruleComparisonOperator ) )
            // InternalRoverml.g:2065:4: (lv_operator_2_0= ruleComparisonOperator )
            {
            // InternalRoverml.g:2065:4: (lv_operator_2_0= ruleComparisonOperator )
            // InternalRoverml.g:2066:5: lv_operator_2_0= ruleComparisonOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGpsTriggerAccess().getOperatorComparisonOperatorEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_45);
            lv_operator_2_0=ruleComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGpsTriggerRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_2_0,
              						"at.ac.tuwien.big.Roverml.ComparisonOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:2083:3: ( (lv_comparisonValue_3_0= rulePosition ) )
            // InternalRoverml.g:2084:4: (lv_comparisonValue_3_0= rulePosition )
            {
            // InternalRoverml.g:2084:4: (lv_comparisonValue_3_0= rulePosition )
            // InternalRoverml.g:2085:5: lv_comparisonValue_3_0= rulePosition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGpsTriggerAccess().getComparisonValuePositionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_comparisonValue_3_0=rulePosition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGpsTriggerRule());
              					}
              					set(
              						current,
              						"comparisonValue",
              						lv_comparisonValue_3_0,
              						"at.ac.tuwien.big.Roverml.Position");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGpsTriggerAccess().getColonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGpsTrigger"


    // $ANTLR start "entryRuleCompassTrigger"
    // InternalRoverml.g:2110:1: entryRuleCompassTrigger returns [EObject current=null] : iv_ruleCompassTrigger= ruleCompassTrigger EOF ;
    public final EObject entryRuleCompassTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompassTrigger = null;


        try {
            // InternalRoverml.g:2110:55: (iv_ruleCompassTrigger= ruleCompassTrigger EOF )
            // InternalRoverml.g:2111:2: iv_ruleCompassTrigger= ruleCompassTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompassTriggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompassTrigger=ruleCompassTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompassTrigger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompassTrigger"


    // $ANTLR start "ruleCompassTrigger"
    // InternalRoverml.g:2117:1: ruleCompassTrigger returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparisonValue_3_0= ruleAngle ) ) otherlv_4= ':' ) ;
    public final EObject ruleCompassTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_comparisonValue_3_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:2123:2: ( ( () ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparisonValue_3_0= ruleAngle ) ) otherlv_4= ':' ) )
            // InternalRoverml.g:2124:2: ( () ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparisonValue_3_0= ruleAngle ) ) otherlv_4= ':' )
            {
            // InternalRoverml.g:2124:2: ( () ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparisonValue_3_0= ruleAngle ) ) otherlv_4= ':' )
            // InternalRoverml.g:2125:3: () ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparisonValue_3_0= ruleAngle ) ) otherlv_4= ':'
            {
            // InternalRoverml.g:2125:3: ()
            // InternalRoverml.g:2126:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCompassTriggerAccess().getCompassTriggerAction_0(),
              					current);
              			
            }

            }

            // InternalRoverml.g:2132:3: ( ( ruleQualifiedName ) )
            // InternalRoverml.g:2133:4: ( ruleQualifiedName )
            {
            // InternalRoverml.g:2133:4: ( ruleQualifiedName )
            // InternalRoverml.g:2134:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCompassTriggerRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCompassTriggerAccess().getSensorCompassCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:2148:3: ( (lv_operator_2_0= ruleComparisonOperator ) )
            // InternalRoverml.g:2149:4: (lv_operator_2_0= ruleComparisonOperator )
            {
            // InternalRoverml.g:2149:4: (lv_operator_2_0= ruleComparisonOperator )
            // InternalRoverml.g:2150:5: lv_operator_2_0= ruleComparisonOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCompassTriggerAccess().getOperatorComparisonOperatorEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_operator_2_0=ruleComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCompassTriggerRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_2_0,
              						"at.ac.tuwien.big.Roverml.ComparisonOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:2167:3: ( (lv_comparisonValue_3_0= ruleAngle ) )
            // InternalRoverml.g:2168:4: (lv_comparisonValue_3_0= ruleAngle )
            {
            // InternalRoverml.g:2168:4: (lv_comparisonValue_3_0= ruleAngle )
            // InternalRoverml.g:2169:5: lv_comparisonValue_3_0= ruleAngle
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCompassTriggerAccess().getComparisonValueAngleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_comparisonValue_3_0=ruleAngle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCompassTriggerRule());
              					}
              					set(
              						current,
              						"comparisonValue",
              						lv_comparisonValue_3_0,
              						"at.ac.tuwien.big.Roverml.Angle");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getCompassTriggerAccess().getColonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCompassTrigger"


    // $ANTLR start "entryRuleQuantity"
    // InternalRoverml.g:2194:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // InternalRoverml.g:2194:49: (iv_ruleQuantity= ruleQuantity EOF )
            // InternalRoverml.g:2195:2: iv_ruleQuantity= ruleQuantity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuantityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQuantity=ruleQuantity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuantity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQuantity"


    // $ANTLR start "ruleQuantity"
    // InternalRoverml.g:2201:1: ruleQuantity returns [EObject current=null] : (this_Position_0= rulePosition | this_SingleQuantity_1= ruleSingleQuantity ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        EObject this_Position_0 = null;

        EObject this_SingleQuantity_1 = null;



        	enterRule();

        try {
            // InternalRoverml.g:2207:2: ( (this_Position_0= rulePosition | this_SingleQuantity_1= ruleSingleQuantity ) )
            // InternalRoverml.g:2208:2: (this_Position_0= rulePosition | this_SingleQuantity_1= ruleSingleQuantity )
            {
            // InternalRoverml.g:2208:2: (this_Position_0= rulePosition | this_SingleQuantity_1= ruleSingleQuantity )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==45) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_INT||(LA36_0>=48 && LA36_0<=49)) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalRoverml.g:2209:3: this_Position_0= rulePosition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getQuantityAccess().getPositionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Position_0=rulePosition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Position_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2218:3: this_SingleQuantity_1= ruleSingleQuantity
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getQuantityAccess().getSingleQuantityParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SingleQuantity_1=ruleSingleQuantity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SingleQuantity_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQuantity"


    // $ANTLR start "entryRulePosition"
    // InternalRoverml.g:2230:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalRoverml.g:2230:49: (iv_rulePosition= rulePosition EOF )
            // InternalRoverml.g:2231:2: iv_rulePosition= rulePosition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPositionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePosition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalRoverml.g:2237:1: rulePosition returns [EObject current=null] : ( () otherlv_1= 'position' otherlv_2= '{' (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) ) (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) ) otherlv_7= '}' ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_x_4_0 = null;

        EObject lv_y_6_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:2243:2: ( ( () otherlv_1= 'position' otherlv_2= '{' (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) ) (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) ) otherlv_7= '}' ) )
            // InternalRoverml.g:2244:2: ( () otherlv_1= 'position' otherlv_2= '{' (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) ) (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) ) otherlv_7= '}' )
            {
            // InternalRoverml.g:2244:2: ( () otherlv_1= 'position' otherlv_2= '{' (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) ) (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) ) otherlv_7= '}' )
            // InternalRoverml.g:2245:3: () otherlv_1= 'position' otherlv_2= '{' (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) ) (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) ) otherlv_7= '}'
            {
            // InternalRoverml.g:2245:3: ()
            // InternalRoverml.g:2246:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPositionAccess().getPositionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getPositionKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,12,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalRoverml.g:2260:3: (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) )
            // InternalRoverml.g:2261:4: otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) )
            {
            otherlv_3=(Token)match(input,46,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getPositionAccess().getXKeyword_3_0());
              			
            }
            // InternalRoverml.g:2265:4: ( (lv_x_4_0= ruleLength ) )
            // InternalRoverml.g:2266:5: (lv_x_4_0= ruleLength )
            {
            // InternalRoverml.g:2266:5: (lv_x_4_0= ruleLength )
            // InternalRoverml.g:2267:6: lv_x_4_0= ruleLength
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getPositionAccess().getXLengthParserRuleCall_3_1_0());
              					
            }
            pushFollow(FOLLOW_47);
            lv_x_4_0=ruleLength();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getPositionRule());
              						}
              						set(
              							current,
              							"x",
              							lv_x_4_0,
              							"at.ac.tuwien.big.Roverml.Length");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }


            }

            // InternalRoverml.g:2285:3: (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) )
            // InternalRoverml.g:2286:4: otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) )
            {
            otherlv_5=(Token)match(input,47,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getPositionAccess().getYKeyword_4_0());
              			
            }
            // InternalRoverml.g:2290:4: ( (lv_y_6_0= ruleLength ) )
            // InternalRoverml.g:2291:5: (lv_y_6_0= ruleLength )
            {
            // InternalRoverml.g:2291:5: (lv_y_6_0= ruleLength )
            // InternalRoverml.g:2292:6: lv_y_6_0= ruleLength
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getPositionAccess().getYLengthParserRuleCall_4_1_0());
              					
            }
            pushFollow(FOLLOW_8);
            lv_y_6_0=ruleLength();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getPositionRule());
              						}
              						set(
              							current,
              							"y",
              							lv_y_6_0,
              							"at.ac.tuwien.big.Roverml.Length");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getPositionAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalRoverml.g:2318:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalRoverml.g:2318:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalRoverml.g:2319:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalRoverml.g:2325:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRoverml.g:2331:2: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalRoverml.g:2332:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalRoverml.g:2332:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalRoverml.g:2333:3: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalRoverml.g:2340:3: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==48) && (synpred1_InternalRoverml())) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalRoverml.g:2341:4: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalRoverml.g:2341:4: ( ( '.' )=>kw= '.' )
            	    // InternalRoverml.g:2342:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,48,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEString"
    // InternalRoverml.g:2361:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRoverml.g:2361:47: (iv_ruleEString= ruleEString EOF )
            // InternalRoverml.g:2362:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRoverml.g:2368:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:2374:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRoverml.g:2375:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRoverml.g:2375:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalRoverml.g:2376:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2384:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEFloat"
    // InternalRoverml.g:2395:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalRoverml.g:2395:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalRoverml.g:2396:2: iv_ruleEFloat= ruleEFloat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFloatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFloat.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalRoverml.g:2402:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalRoverml.g:2408:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalRoverml.g:2409:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalRoverml.g:2409:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalRoverml.g:2410:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalRoverml.g:2410:3: (kw= '-' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRoverml.g:2411:4: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalRoverml.g:2417:3: (this_INT_1= RULE_INT )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRoverml.g:2418:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,48,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
              		
            }
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
              		
            }
            // InternalRoverml.g:2438:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=50 && LA43_0<=51)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRoverml.g:2439:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalRoverml.g:2439:4: (kw= 'E' | kw= 'e' )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==50) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==51) ) {
                        alt41=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalRoverml.g:2440:5: kw= 'E'
                            {
                            kw=(Token)match(input,50,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalRoverml.g:2446:5: kw= 'e'
                            {
                            kw=(Token)match(input,51,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalRoverml.g:2452:4: (kw= '-' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==49) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalRoverml.g:2453:5: kw= '-'
                            {
                            kw=(Token)match(input,49,FOLLOW_51); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                              				
                            }

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEInt"
    // InternalRoverml.g:2471:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRoverml.g:2471:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRoverml.g:2472:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRoverml.g:2478:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:2484:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRoverml.g:2485:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRoverml.g:2485:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRoverml.g:2486:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRoverml.g:2486:3: (kw= '-' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==49) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRoverml.g:2487:4: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleColor"
    // InternalRoverml.g:2504:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'blue' ) | (enumLiteral_4= 'yellow' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRoverml.g:2510:2: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'blue' ) | (enumLiteral_4= 'yellow' ) ) )
            // InternalRoverml.g:2511:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'blue' ) | (enumLiteral_4= 'yellow' ) )
            {
            // InternalRoverml.g:2511:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'blue' ) | (enumLiteral_4= 'yellow' ) )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt45=1;
                }
                break;
            case 53:
                {
                alt45=2;
                }
                break;
            case 54:
                {
                alt45=3;
                }
                break;
            case 55:
                {
                alt45=4;
                }
                break;
            case 56:
                {
                alt45=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalRoverml.g:2512:3: (enumLiteral_0= 'none' )
                    {
                    // InternalRoverml.g:2512:3: (enumLiteral_0= 'none' )
                    // InternalRoverml.g:2513:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getNoneEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2520:3: (enumLiteral_1= 'red' )
                    {
                    // InternalRoverml.g:2520:3: (enumLiteral_1= 'red' )
                    // InternalRoverml.g:2521:4: enumLiteral_1= 'red'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverml.g:2528:3: (enumLiteral_2= 'green' )
                    {
                    // InternalRoverml.g:2528:3: (enumLiteral_2= 'green' )
                    // InternalRoverml.g:2529:4: enumLiteral_2= 'green'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverml.g:2536:3: (enumLiteral_3= 'blue' )
                    {
                    // InternalRoverml.g:2536:3: (enumLiteral_3= 'blue' )
                    // InternalRoverml.g:2537:4: enumLiteral_3= 'blue'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalRoverml.g:2544:3: (enumLiteral_4= 'yellow' )
                    {
                    // InternalRoverml.g:2544:3: (enumLiteral_4= 'yellow' )
                    // InternalRoverml.g:2545:4: enumLiteral_4= 'yellow'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "ruleTimeUnit"
    // InternalRoverml.g:2555:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'ns' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 's' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'h' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRoverml.g:2561:2: ( ( (enumLiteral_0= 'ns' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 's' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'h' ) ) )
            // InternalRoverml.g:2562:2: ( (enumLiteral_0= 'ns' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 's' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'h' ) )
            {
            // InternalRoverml.g:2562:2: ( (enumLiteral_0= 'ns' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 's' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'h' ) )
            int alt46=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt46=1;
                }
                break;
            case 58:
                {
                alt46=2;
                }
                break;
            case 59:
                {
                alt46=3;
                }
                break;
            case 60:
                {
                alt46=4;
                }
                break;
            case 61:
                {
                alt46=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalRoverml.g:2563:3: (enumLiteral_0= 'ns' )
                    {
                    // InternalRoverml.g:2563:3: (enumLiteral_0= 'ns' )
                    // InternalRoverml.g:2564:4: enumLiteral_0= 'ns'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getNsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getNsEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2571:3: (enumLiteral_1= 'ms' )
                    {
                    // InternalRoverml.g:2571:3: (enumLiteral_1= 'ms' )
                    // InternalRoverml.g:2572:4: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getMsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMsEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverml.g:2579:3: (enumLiteral_2= 's' )
                    {
                    // InternalRoverml.g:2579:3: (enumLiteral_2= 's' )
                    // InternalRoverml.g:2580:4: enumLiteral_2= 's'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getSEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverml.g:2587:3: (enumLiteral_3= 'min' )
                    {
                    // InternalRoverml.g:2587:3: (enumLiteral_3= 'min' )
                    // InternalRoverml.g:2588:4: enumLiteral_3= 'min'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalRoverml.g:2595:3: (enumLiteral_4= 'h' )
                    {
                    // InternalRoverml.g:2595:3: (enumLiteral_4= 'h' )
                    // InternalRoverml.g:2596:4: enumLiteral_4= 'h'
                    {
                    enumLiteral_4=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getHEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getHEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleAngleUnit"
    // InternalRoverml.g:2606:1: ruleAngleUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'radian' ) | (enumLiteral_1= 'degree' ) ) ;
    public final Enumerator ruleAngleUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:2612:2: ( ( (enumLiteral_0= 'radian' ) | (enumLiteral_1= 'degree' ) ) )
            // InternalRoverml.g:2613:2: ( (enumLiteral_0= 'radian' ) | (enumLiteral_1= 'degree' ) )
            {
            // InternalRoverml.g:2613:2: ( (enumLiteral_0= 'radian' ) | (enumLiteral_1= 'degree' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==62) ) {
                alt47=1;
            }
            else if ( (LA47_0==63) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalRoverml.g:2614:3: (enumLiteral_0= 'radian' )
                    {
                    // InternalRoverml.g:2614:3: (enumLiteral_0= 'radian' )
                    // InternalRoverml.g:2615:4: enumLiteral_0= 'radian'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAngleUnitAccess().getRadianEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAngleUnitAccess().getRadianEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2622:3: (enumLiteral_1= 'degree' )
                    {
                    // InternalRoverml.g:2622:3: (enumLiteral_1= 'degree' )
                    // InternalRoverml.g:2623:4: enumLiteral_1= 'degree'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAngleUnitAccess().getDegreeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAngleUnitAccess().getDegreeEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAngleUnit"


    // $ANTLR start "ruleVelocityUnit"
    // InternalRoverml.g:2633:1: ruleVelocityUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'mm_per_s' ) | (enumLiteral_1= 'cm_per_s' ) ) ;
    public final Enumerator ruleVelocityUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:2639:2: ( ( (enumLiteral_0= 'mm_per_s' ) | (enumLiteral_1= 'cm_per_s' ) ) )
            // InternalRoverml.g:2640:2: ( (enumLiteral_0= 'mm_per_s' ) | (enumLiteral_1= 'cm_per_s' ) )
            {
            // InternalRoverml.g:2640:2: ( (enumLiteral_0= 'mm_per_s' ) | (enumLiteral_1= 'cm_per_s' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==64) ) {
                alt48=1;
            }
            else if ( (LA48_0==65) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalRoverml.g:2641:3: (enumLiteral_0= 'mm_per_s' )
                    {
                    // InternalRoverml.g:2641:3: (enumLiteral_0= 'mm_per_s' )
                    // InternalRoverml.g:2642:4: enumLiteral_0= 'mm_per_s'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVelocityUnitAccess().getMm_per_sEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getVelocityUnitAccess().getMm_per_sEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2649:3: (enumLiteral_1= 'cm_per_s' )
                    {
                    // InternalRoverml.g:2649:3: (enumLiteral_1= 'cm_per_s' )
                    // InternalRoverml.g:2650:4: enumLiteral_1= 'cm_per_s'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVelocityUnitAccess().getCm_per_sEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getVelocityUnitAccess().getCm_per_sEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVelocityUnit"


    // $ANTLR start "ruleLengthUnit"
    // InternalRoverml.g:2660:1: ruleLengthUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'mm' ) | (enumLiteral_1= 'cm' ) | (enumLiteral_2= 'm' ) ) ;
    public final Enumerator ruleLengthUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRoverml.g:2666:2: ( ( (enumLiteral_0= 'mm' ) | (enumLiteral_1= 'cm' ) | (enumLiteral_2= 'm' ) ) )
            // InternalRoverml.g:2667:2: ( (enumLiteral_0= 'mm' ) | (enumLiteral_1= 'cm' ) | (enumLiteral_2= 'm' ) )
            {
            // InternalRoverml.g:2667:2: ( (enumLiteral_0= 'mm' ) | (enumLiteral_1= 'cm' ) | (enumLiteral_2= 'm' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt49=1;
                }
                break;
            case 67:
                {
                alt49=2;
                }
                break;
            case 68:
                {
                alt49=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalRoverml.g:2668:3: (enumLiteral_0= 'mm' )
                    {
                    // InternalRoverml.g:2668:3: (enumLiteral_0= 'mm' )
                    // InternalRoverml.g:2669:4: enumLiteral_0= 'mm'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLengthUnitAccess().getMmEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getLengthUnitAccess().getMmEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2676:3: (enumLiteral_1= 'cm' )
                    {
                    // InternalRoverml.g:2676:3: (enumLiteral_1= 'cm' )
                    // InternalRoverml.g:2677:4: enumLiteral_1= 'cm'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLengthUnitAccess().getCmEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getLengthUnitAccess().getCmEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverml.g:2684:3: (enumLiteral_2= 'm' )
                    {
                    // InternalRoverml.g:2684:3: (enumLiteral_2= 'm' )
                    // InternalRoverml.g:2685:4: enumLiteral_2= 'm'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLengthUnitAccess().getMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getLengthUnitAccess().getMEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLengthUnit"


    // $ANTLR start "ruleComparisonOperator"
    // InternalRoverml.g:2695:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'smaller' ) | (enumLiteral_1= 'equals' ) | (enumLiteral_2= 'greater' ) | (enumLiteral_3= 'unequal' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRoverml.g:2701:2: ( ( (enumLiteral_0= 'smaller' ) | (enumLiteral_1= 'equals' ) | (enumLiteral_2= 'greater' ) | (enumLiteral_3= 'unequal' ) ) )
            // InternalRoverml.g:2702:2: ( (enumLiteral_0= 'smaller' ) | (enumLiteral_1= 'equals' ) | (enumLiteral_2= 'greater' ) | (enumLiteral_3= 'unequal' ) )
            {
            // InternalRoverml.g:2702:2: ( (enumLiteral_0= 'smaller' ) | (enumLiteral_1= 'equals' ) | (enumLiteral_2= 'greater' ) | (enumLiteral_3= 'unequal' ) )
            int alt50=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt50=1;
                }
                break;
            case 70:
                {
                alt50=2;
                }
                break;
            case 71:
                {
                alt50=3;
                }
                break;
            case 72:
                {
                alt50=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalRoverml.g:2703:3: (enumLiteral_0= 'smaller' )
                    {
                    // InternalRoverml.g:2703:3: (enumLiteral_0= 'smaller' )
                    // InternalRoverml.g:2704:4: enumLiteral_0= 'smaller'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getSmallerEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2711:3: (enumLiteral_1= 'equals' )
                    {
                    // InternalRoverml.g:2711:3: (enumLiteral_1= 'equals' )
                    // InternalRoverml.g:2712:4: enumLiteral_1= 'equals'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getEqualsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getEqualsEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverml.g:2719:3: (enumLiteral_2= 'greater' )
                    {
                    // InternalRoverml.g:2719:3: (enumLiteral_2= 'greater' )
                    // InternalRoverml.g:2720:4: enumLiteral_2= 'greater'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getGreaterEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverml.g:2727:3: (enumLiteral_3= 'unequal' )
                    {
                    // InternalRoverml.g:2727:3: (enumLiteral_3= 'unequal' )
                    // InternalRoverml.g:2728:4: enumLiteral_3= 'unequal'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getUnequalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getUnequalEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComparisonOperator"

    // $ANTLR start synpred1_InternalRoverml
    public final void synpred1_InternalRoverml_fragment() throws RecognitionException {   
        // InternalRoverml.g:2342:5: ( '.' )
        // InternalRoverml.g:2342:6: '.'
        {
        match(input,48,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalRoverml

    // Delegated rules

    public final boolean synpred1_InternalRoverml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalRoverml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\23\1\4\1\uffff\1\23";
    static final String dfa_3s = "\1\45\1\uffff\1\110\1\4\1\uffff\1\110";
    static final String dfa_4s = "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String dfa_5s = "\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\40\uffff\1\1",
            "",
            "\1\4\34\uffff\1\3\24\uffff\4\1",
            "\1\5",
            "",
            "\1\4\34\uffff\1\3\24\uffff\4\1"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1010:3: (this_TriggeredTransition_0= ruleTriggeredTransition )?";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\4\1\uffff\1\60\1\4\4\6\1\60\2\uffff";
    static final String dfa_9s = "\1\45\1\uffff\1\110\1\4\4\61\1\110\2\uffff";
    static final String dfa_10s = "\1\uffff\1\1\7\uffff\1\2\1\3";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\40\uffff\1\1",
            "",
            "\1\3\24\uffff\1\4\1\5\1\6\1\7",
            "\1\10",
            "\1\12\46\uffff\1\11\2\uffff\2\12",
            "\1\12\46\uffff\1\11\2\uffff\2\12",
            "\1\12\46\uffff\1\11\2\uffff\2\12",
            "\1\12\46\uffff\1\11\2\uffff\2\12",
            "\1\3\24\uffff\1\4\1\5\1\6\1\7",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1080:2: ( (otherlv_0= 'if' this_DistanceSensorTrigger_1= ruleDistanceSensorTrigger ) | this_GpsTrigger_2= ruleGpsTrigger | this_CompassTrigger_3= ruleCompassTrigger )";
        }
    }
    static final String dfa_13s = "\15\uffff";
    static final String dfa_14s = "\2\6\1\60\1\6\1\62\2\6\4\uffff\1\6\1\71";
    static final String dfa_15s = "\1\61\2\60\1\6\1\104\2\61\4\uffff\1\6\1\104";
    static final String dfa_16s = "\7\uffff\1\4\1\3\1\1\1\2\2\uffff";
    static final String dfa_17s = "\15\uffff}>";
    static final String[] dfa_18s = {
            "\1\2\51\uffff\1\3\1\1",
            "\1\2\51\uffff\1\3",
            "\1\3",
            "\1\4",
            "\1\5\1\6\5\uffff\5\11\2\10\2\12\3\7",
            "\1\14\52\uffff\1\13",
            "\1\14\52\uffff\1\13",
            "",
            "",
            "",
            "",
            "\1\14",
            "\5\11\2\10\2\12\3\7"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1363:2: (this_Time_0= ruleTime | this_Velocity_1= ruleVelocity | this_Angle_2= ruleAngle | this_Length_3= ruleLength )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0003000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x01F0000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000EC000004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001800004000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100080004010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000004010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000002040002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x3E00000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0003200000000042L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000C000000000002L});

}
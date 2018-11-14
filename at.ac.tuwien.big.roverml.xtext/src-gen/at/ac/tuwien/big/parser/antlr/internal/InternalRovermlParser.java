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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'roverSystem'", "'{'", "'rovers'", "'}'", "'roverPrograms'", "'roverProgram'", "'command'", "'>'", "'move'", "'setLightColor'", "'color'", "'rotate'", "'wait'", "'repeat'", "'count'", "'rover'", "'components'", "','", "'block'", "'transition'", "'sensor'", "'operator'", "'comparisonValue'", "'gps'", "'distanceSensor'", "'compass'", "'value'", "'timeUnit'", "'angleUnit'", "'velocityUnit'", "'light'", "'length'", "'lengthUnit'", "'motor'", "'terminate'", "'('", "'kind'", "')'", "'DistanceSensorTrigger'", "'GpsTrigger'", "'CompassTrigger'", "'quantity'", "'position'", "'x'", "'y'", "'.'", "'-'", "'E'", "'e'", "'None'", "'0'", "'1'", "'Green'", "'2'", "'Blue'", "'3'", "'Yellow'", "'4'", "'Ns'", "'Ms'", "'S'", "'Min'", "'H'", "'Radian'", "'Degree'", "'Mm_per_s'", "'Cm_per_s'", "'Mm'", "'Cm'", "'M'", "'Smaller'", "'Equals'", "'Greater'", "'Unequal'"
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
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
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

                if ( (LA1_0==26) ) {
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
    // InternalRoverml.g:172:1: ruleRoverProgram returns [EObject current=null] : ( () otherlv_1= 'roverProgram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_block_4_0= ruleBlock ) ) otherlv_5= '}' ) ;
    public final EObject ruleRoverProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:178:2: ( ( () otherlv_1= 'roverProgram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_block_4_0= ruleBlock ) ) otherlv_5= '}' ) )
            // InternalRoverml.g:179:2: ( () otherlv_1= 'roverProgram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_block_4_0= ruleBlock ) ) otherlv_5= '}' )
            {
            // InternalRoverml.g:179:2: ( () otherlv_1= 'roverProgram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_block_4_0= ruleBlock ) ) otherlv_5= '}' )
            // InternalRoverml.g:180:3: () otherlv_1= 'roverProgram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_block_4_0= ruleBlock ) ) otherlv_5= '}'
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
            // InternalRoverml.g:213:3: ( (lv_block_4_0= ruleBlock ) )
            // InternalRoverml.g:214:4: (lv_block_4_0= ruleBlock )
            {
            // InternalRoverml.g:214:4: (lv_block_4_0= ruleBlock )
            // InternalRoverml.g:215:5: lv_block_4_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRoverProgramAccess().getBlockBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_block_4_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRoverProgramRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_4_0,
              						"at.ac.tuwien.big.Roverml.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRoverProgramAccess().getRightCurlyBracketKeyword_5());
              		
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
    // InternalRoverml.g:240:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalRoverml.g:240:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalRoverml.g:241:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalRoverml.g:247:1: ruleCommand returns [EObject current=null] : (this_Move_0= ruleMove | this_Rotate_1= ruleRotate | this_Wait_2= ruleWait | this_SetLightColor_3= ruleSetLightColor | this_Terminate_4= ruleTerminate | (this_Repeat_5= ruleRepeat otherlv_6= 'command' ( ( ruleQualifiedName ) ) otherlv_8= '>' ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_Move_0 = null;

        EObject this_Rotate_1 = null;

        EObject this_Wait_2 = null;

        EObject this_SetLightColor_3 = null;

        EObject this_Terminate_4 = null;

        EObject this_Repeat_5 = null;



        	enterRule();

        try {
            // InternalRoverml.g:253:2: ( (this_Move_0= ruleMove | this_Rotate_1= ruleRotate | this_Wait_2= ruleWait | this_SetLightColor_3= ruleSetLightColor | this_Terminate_4= ruleTerminate | (this_Repeat_5= ruleRepeat otherlv_6= 'command' ( ( ruleQualifiedName ) ) otherlv_8= '>' ( ( ruleQualifiedName ) ) ) ) )
            // InternalRoverml.g:254:2: (this_Move_0= ruleMove | this_Rotate_1= ruleRotate | this_Wait_2= ruleWait | this_SetLightColor_3= ruleSetLightColor | this_Terminate_4= ruleTerminate | (this_Repeat_5= ruleRepeat otherlv_6= 'command' ( ( ruleQualifiedName ) ) otherlv_8= '>' ( ( ruleQualifiedName ) ) ) )
            {
            // InternalRoverml.g:254:2: (this_Move_0= ruleMove | this_Rotate_1= ruleRotate | this_Wait_2= ruleWait | this_SetLightColor_3= ruleSetLightColor | this_Terminate_4= ruleTerminate | (this_Repeat_5= ruleRepeat otherlv_6= 'command' ( ( ruleQualifiedName ) ) otherlv_8= '>' ( ( ruleQualifiedName ) ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            case 45:
                {
                alt3=5;
                }
                break;
            case 24:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRoverml.g:255:3: this_Move_0= ruleMove
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
                    // InternalRoverml.g:264:3: this_Rotate_1= ruleRotate
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
                    // InternalRoverml.g:273:3: this_Wait_2= ruleWait
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
                    // InternalRoverml.g:282:3: this_SetLightColor_3= ruleSetLightColor
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
                    // InternalRoverml.g:291:3: this_Terminate_4= ruleTerminate
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
                    // InternalRoverml.g:300:3: (this_Repeat_5= ruleRepeat otherlv_6= 'command' ( ( ruleQualifiedName ) ) otherlv_8= '>' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalRoverml.g:300:3: (this_Repeat_5= ruleRepeat otherlv_6= 'command' ( ( ruleQualifiedName ) ) otherlv_8= '>' ( ( ruleQualifiedName ) ) )
                    // InternalRoverml.g:301:4: this_Repeat_5= ruleRepeat otherlv_6= 'command' ( ( ruleQualifiedName ) ) otherlv_8= '>' ( ( ruleQualifiedName ) )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCommandAccess().getRepeatParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FOLLOW_11);
                    this_Repeat_5=ruleRepeat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Repeat_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_6=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCommandAccess().getCommandKeyword_5_1());
                      			
                    }
                    // InternalRoverml.g:313:4: ( ( ruleQualifiedName ) )
                    // InternalRoverml.g:314:5: ( ruleQualifiedName )
                    {
                    // InternalRoverml.g:314:5: ( ruleQualifiedName )
                    // InternalRoverml.g:315:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCommandRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getIncomingTransitionCrossReference_5_2_0());
                      					
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

                    otherlv_8=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getCommandAccess().getGreaterThanSignKeyword_5_3());
                      			
                    }
                    // InternalRoverml.g:333:4: ( ( ruleQualifiedName ) )
                    // InternalRoverml.g:334:5: ( ruleQualifiedName )
                    {
                    // InternalRoverml.g:334:5: ( ruleQualifiedName )
                    // InternalRoverml.g:335:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCommandRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getOutgoingTransitionCrossReference_5_4_0());
                      					
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
    // InternalRoverml.g:354:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalRoverml.g:354:45: (iv_ruleMove= ruleMove EOF )
            // InternalRoverml.g:355:2: iv_ruleMove= ruleMove EOF
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
    // InternalRoverml.g:361:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' otherlv_1= '{' ( (lv_speed_2_0= ruleVelocity ) ) ( (lv_distance_3_0= ruleLength ) ) otherlv_4= '}' ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_speed_2_0 = null;

        EObject lv_distance_3_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:367:2: ( (otherlv_0= 'move' otherlv_1= '{' ( (lv_speed_2_0= ruleVelocity ) ) ( (lv_distance_3_0= ruleLength ) ) otherlv_4= '}' ) )
            // InternalRoverml.g:368:2: (otherlv_0= 'move' otherlv_1= '{' ( (lv_speed_2_0= ruleVelocity ) ) ( (lv_distance_3_0= ruleLength ) ) otherlv_4= '}' )
            {
            // InternalRoverml.g:368:2: (otherlv_0= 'move' otherlv_1= '{' ( (lv_speed_2_0= ruleVelocity ) ) ( (lv_distance_3_0= ruleLength ) ) otherlv_4= '}' )
            // InternalRoverml.g:369:3: otherlv_0= 'move' otherlv_1= '{' ( (lv_speed_2_0= ruleVelocity ) ) ( (lv_distance_3_0= ruleLength ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,12,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRoverml.g:377:3: ( (lv_speed_2_0= ruleVelocity ) )
            // InternalRoverml.g:378:4: (lv_speed_2_0= ruleVelocity )
            {
            // InternalRoverml.g:378:4: (lv_speed_2_0= ruleVelocity )
            // InternalRoverml.g:379:5: lv_speed_2_0= ruleVelocity
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMoveAccess().getSpeedVelocityParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_speed_2_0=ruleVelocity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMoveRule());
              					}
              					set(
              						current,
              						"speed",
              						lv_speed_2_0,
              						"at.ac.tuwien.big.Roverml.Velocity");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:396:3: ( (lv_distance_3_0= ruleLength ) )
            // InternalRoverml.g:397:4: (lv_distance_3_0= ruleLength )
            {
            // InternalRoverml.g:397:4: (lv_distance_3_0= ruleLength )
            // InternalRoverml.g:398:5: lv_distance_3_0= ruleLength
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMoveAccess().getDistanceLengthParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_8);
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

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMoveAccess().getRightCurlyBracketKeyword_4());
              		
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
    // InternalRoverml.g:423:1: entryRuleSetLightColor returns [EObject current=null] : iv_ruleSetLightColor= ruleSetLightColor EOF ;
    public final EObject entryRuleSetLightColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLightColor = null;


        try {
            // InternalRoverml.g:423:54: (iv_ruleSetLightColor= ruleSetLightColor EOF )
            // InternalRoverml.g:424:2: iv_ruleSetLightColor= ruleSetLightColor EOF
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
    // InternalRoverml.g:430:1: ruleSetLightColor returns [EObject current=null] : (otherlv_0= 'setLightColor' otherlv_1= '{' otherlv_2= 'color' ( (lv_color_3_0= ruleColor ) ) ( ( ruleQualifiedName ) ) otherlv_5= '}' ) ;
    public final EObject ruleSetLightColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Enumerator lv_color_3_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:436:2: ( (otherlv_0= 'setLightColor' otherlv_1= '{' otherlv_2= 'color' ( (lv_color_3_0= ruleColor ) ) ( ( ruleQualifiedName ) ) otherlv_5= '}' ) )
            // InternalRoverml.g:437:2: (otherlv_0= 'setLightColor' otherlv_1= '{' otherlv_2= 'color' ( (lv_color_3_0= ruleColor ) ) ( ( ruleQualifiedName ) ) otherlv_5= '}' )
            {
            // InternalRoverml.g:437:2: (otherlv_0= 'setLightColor' otherlv_1= '{' otherlv_2= 'color' ( (lv_color_3_0= ruleColor ) ) ( ( ruleQualifiedName ) ) otherlv_5= '}' )
            // InternalRoverml.g:438:3: otherlv_0= 'setLightColor' otherlv_1= '{' otherlv_2= 'color' ( (lv_color_3_0= ruleColor ) ) ( ( ruleQualifiedName ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSetLightColorAccess().getSetLightColorKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,12,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSetLightColorAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,21,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSetLightColorAccess().getColorKeyword_2());
              		
            }
            // InternalRoverml.g:450:3: ( (lv_color_3_0= ruleColor ) )
            // InternalRoverml.g:451:4: (lv_color_3_0= ruleColor )
            {
            // InternalRoverml.g:451:4: (lv_color_3_0= ruleColor )
            // InternalRoverml.g:452:5: lv_color_3_0= ruleColor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSetLightColorAccess().getColorColorEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_color_3_0=ruleColor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSetLightColorRule());
              					}
              					set(
              						current,
              						"color",
              						lv_color_3_0,
              						"at.ac.tuwien.big.Roverml.Color");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRoverml.g:469:3: ( ( ruleQualifiedName ) )
            // InternalRoverml.g:470:4: ( ruleQualifiedName )
            {
            // InternalRoverml.g:470:4: ( ruleQualifiedName )
            // InternalRoverml.g:471:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSetLightColorRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSetLightColorAccess().getLightsLightCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_8);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSetLightColorAccess().getRightCurlyBracketKeyword_5());
              		
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
    // InternalRoverml.g:493:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalRoverml.g:493:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalRoverml.g:494:2: iv_ruleRotate= ruleRotate EOF
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
    // InternalRoverml.g:500:1: ruleRotate returns [EObject current=null] : (otherlv_0= 'rotate' otherlv_1= '{' ( (lv_angle_2_0= ruleAngle ) ) otherlv_3= '}' ) ;
    public final EObject ruleRotate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_angle_2_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:506:2: ( (otherlv_0= 'rotate' otherlv_1= '{' ( (lv_angle_2_0= ruleAngle ) ) otherlv_3= '}' ) )
            // InternalRoverml.g:507:2: (otherlv_0= 'rotate' otherlv_1= '{' ( (lv_angle_2_0= ruleAngle ) ) otherlv_3= '}' )
            {
            // InternalRoverml.g:507:2: (otherlv_0= 'rotate' otherlv_1= '{' ( (lv_angle_2_0= ruleAngle ) ) otherlv_3= '}' )
            // InternalRoverml.g:508:3: otherlv_0= 'rotate' otherlv_1= '{' ( (lv_angle_2_0= ruleAngle ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRotateAccess().getRotateKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,12,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRoverml.g:516:3: ( (lv_angle_2_0= ruleAngle ) )
            // InternalRoverml.g:517:4: (lv_angle_2_0= ruleAngle )
            {
            // InternalRoverml.g:517:4: (lv_angle_2_0= ruleAngle )
            // InternalRoverml.g:518:5: lv_angle_2_0= ruleAngle
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRotateAccess().getAngleAngleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_angle_2_0=ruleAngle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRotateRule());
              					}
              					set(
              						current,
              						"angle",
              						lv_angle_2_0,
              						"at.ac.tuwien.big.Roverml.Angle");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRotateAccess().getRightCurlyBracketKeyword_3());
              		
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
    // InternalRoverml.g:543:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalRoverml.g:543:45: (iv_ruleWait= ruleWait EOF )
            // InternalRoverml.g:544:2: iv_ruleWait= ruleWait EOF
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
    // InternalRoverml.g:550:1: ruleWait returns [EObject current=null] : (otherlv_0= 'wait' otherlv_1= '{' ( (lv_duration_2_0= ruleTime ) ) otherlv_3= '}' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_duration_2_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:556:2: ( (otherlv_0= 'wait' otherlv_1= '{' ( (lv_duration_2_0= ruleTime ) ) otherlv_3= '}' ) )
            // InternalRoverml.g:557:2: (otherlv_0= 'wait' otherlv_1= '{' ( (lv_duration_2_0= ruleTime ) ) otherlv_3= '}' )
            {
            // InternalRoverml.g:557:2: (otherlv_0= 'wait' otherlv_1= '{' ( (lv_duration_2_0= ruleTime ) ) otherlv_3= '}' )
            // InternalRoverml.g:558:3: otherlv_0= 'wait' otherlv_1= '{' ( (lv_duration_2_0= ruleTime ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWaitAccess().getWaitKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,12,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRoverml.g:566:3: ( (lv_duration_2_0= ruleTime ) )
            // InternalRoverml.g:567:4: (lv_duration_2_0= ruleTime )
            {
            // InternalRoverml.g:567:4: (lv_duration_2_0= ruleTime )
            // InternalRoverml.g:568:5: lv_duration_2_0= ruleTime
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWaitAccess().getDurationTimeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_duration_2_0=ruleTime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWaitRule());
              					}
              					set(
              						current,
              						"duration",
              						lv_duration_2_0,
              						"at.ac.tuwien.big.Roverml.Time");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWaitAccess().getRightCurlyBracketKeyword_3());
              		
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
    // InternalRoverml.g:593:1: entryRuleRepeat returns [EObject current=null] : iv_ruleRepeat= ruleRepeat EOF ;
    public final EObject entryRuleRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeat = null;


        try {
            // InternalRoverml.g:593:47: (iv_ruleRepeat= ruleRepeat EOF )
            // InternalRoverml.g:594:2: iv_ruleRepeat= ruleRepeat EOF
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
    // InternalRoverml.g:600:1: ruleRepeat returns [EObject current=null] : ( () otherlv_1= 'repeat' otherlv_2= '{' otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) otherlv_5= '}' ) ;
    public final EObject ruleRepeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_count_4_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:606:2: ( ( () otherlv_1= 'repeat' otherlv_2= '{' otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) otherlv_5= '}' ) )
            // InternalRoverml.g:607:2: ( () otherlv_1= 'repeat' otherlv_2= '{' otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) otherlv_5= '}' )
            {
            // InternalRoverml.g:607:2: ( () otherlv_1= 'repeat' otherlv_2= '{' otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) otherlv_5= '}' )
            // InternalRoverml.g:608:3: () otherlv_1= 'repeat' otherlv_2= '{' otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) otherlv_5= '}'
            {
            // InternalRoverml.g:608:3: ()
            // InternalRoverml.g:609:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRepeatAccess().getRepeatAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRepeatAccess().getRepeatKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,12,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRepeatAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRepeatAccess().getCountKeyword_3());
              		
            }
            // InternalRoverml.g:627:3: ( (lv_count_4_0= ruleEInt ) )
            // InternalRoverml.g:628:4: (lv_count_4_0= ruleEInt )
            {
            // InternalRoverml.g:628:4: (lv_count_4_0= ruleEInt )
            // InternalRoverml.g:629:5: lv_count_4_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRepeatAccess().getCountEIntParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_count_4_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRepeatRule());
              					}
              					set(
              						current,
              						"count",
              						lv_count_4_0,
              						"at.ac.tuwien.big.Roverml.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRepeatAccess().getRightCurlyBracketKeyword_5());
              		
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
    // InternalRoverml.g:654:1: entryRuleRover returns [EObject current=null] : iv_ruleRover= ruleRover EOF ;
    public final EObject entryRuleRover() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRover = null;


        try {
            // InternalRoverml.g:654:46: (iv_ruleRover= ruleRover EOF )
            // InternalRoverml.g:655:2: iv_ruleRover= ruleRover EOF
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
    // InternalRoverml.g:661:1: ruleRover returns [EObject current=null] : ( () otherlv_1= 'rover' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) )* otherlv_7= '}' otherlv_8= '}' (otherlv_9= ',' )? ) ;
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
            // InternalRoverml.g:667:2: ( ( () otherlv_1= 'rover' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) )* otherlv_7= '}' otherlv_8= '}' (otherlv_9= ',' )? ) )
            // InternalRoverml.g:668:2: ( () otherlv_1= 'rover' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) )* otherlv_7= '}' otherlv_8= '}' (otherlv_9= ',' )? )
            {
            // InternalRoverml.g:668:2: ( () otherlv_1= 'rover' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) )* otherlv_7= '}' otherlv_8= '}' (otherlv_9= ',' )? )
            // InternalRoverml.g:669:3: () otherlv_1= 'rover' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) )* otherlv_7= '}' otherlv_8= '}' (otherlv_9= ',' )?
            {
            // InternalRoverml.g:669:3: ()
            // InternalRoverml.g:670:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRoverAccess().getRoverAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRoverAccess().getRoverKeyword_1());
              		
            }
            // InternalRoverml.g:680:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRoverml.g:681:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRoverml.g:681:4: (lv_name_2_0= RULE_ID )
            // InternalRoverml.g:682:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,12,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRoverAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRoverAccess().getComponentsKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,12,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRoverAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalRoverml.g:710:3: ( (lv_components_6_0= ruleComponent ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=34 && LA4_0<=36)||LA4_0==41||LA4_0==44) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRoverml.g:711:4: (lv_components_6_0= ruleComponent )
            	    {
            	    // InternalRoverml.g:711:4: (lv_components_6_0= ruleComponent )
            	    // InternalRoverml.g:712:5: lv_components_6_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRoverAccess().getComponentsComponentParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
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
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getRoverAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,14,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getRoverAccess().getRightCurlyBracketKeyword_8());
              		
            }
            // InternalRoverml.g:737:3: (otherlv_9= ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoverml.g:738:4: otherlv_9= ','
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:747:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalRoverml.g:747:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalRoverml.g:748:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalRoverml.g:754:1: ruleBlock returns [EObject current=null] : (this_Repeat_0= ruleRepeat | ( () otherlv_2= 'block' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' ) ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject this_Repeat_0 = null;

        EObject lv_commands_4_0 = null;

        EObject lv_transitions_5_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:760:2: ( (this_Repeat_0= ruleRepeat | ( () otherlv_2= 'block' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' ) ) )
            // InternalRoverml.g:761:2: (this_Repeat_0= ruleRepeat | ( () otherlv_2= 'block' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' ) )
            {
            // InternalRoverml.g:761:2: (this_Repeat_0= ruleRepeat | ( () otherlv_2= 'block' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==29) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoverml.g:762:3: this_Repeat_0= ruleRepeat
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
                    // InternalRoverml.g:771:3: ( () otherlv_2= 'block' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )
                    {
                    // InternalRoverml.g:771:3: ( () otherlv_2= 'block' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )
                    // InternalRoverml.g:772:4: () otherlv_2= 'block' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}'
                    {
                    // InternalRoverml.g:772:4: ()
                    // InternalRoverml.g:773:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBlockAccess().getBlockAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getBlockKeyword_1_1());
                      			
                    }
                    otherlv_3=(Token)match(input,12,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1_2());
                      			
                    }
                    // InternalRoverml.g:787:4: ( (lv_commands_4_0= ruleCommand ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=19 && LA6_0<=20)||(LA6_0>=22 && LA6_0<=24)||LA6_0==45) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRoverml.g:788:5: (lv_commands_4_0= ruleCommand )
                    	    {
                    	    // InternalRoverml.g:788:5: (lv_commands_4_0= ruleCommand )
                    	    // InternalRoverml.g:789:6: lv_commands_4_0= ruleCommand
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getBlockAccess().getCommandsCommandParserRuleCall_1_3_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    lv_commands_4_0=ruleCommand();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getBlockRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"commands",
                    	      							lv_commands_4_0,
                    	      							"at.ac.tuwien.big.Roverml.Command");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalRoverml.g:806:4: ( (lv_transitions_5_0= ruleTransition ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==30||(LA7_0>=49 && LA7_0<=51)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRoverml.g:807:5: (lv_transitions_5_0= ruleTransition )
                    	    {
                    	    // InternalRoverml.g:807:5: (lv_transitions_5_0= ruleTransition )
                    	    // InternalRoverml.g:808:6: lv_transitions_5_0= ruleTransition
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getBlockAccess().getTransitionsTransitionParserRuleCall_1_4_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    lv_transitions_5_0=ruleTransition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getBlockRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"transitions",
                    	      							lv_transitions_5_0,
                    	      							"at.ac.tuwien.big.Roverml.Transition");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_1_5());
                      			
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
    // InternalRoverml.g:834:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalRoverml.g:834:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalRoverml.g:835:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalRoverml.g:841:1: ruleTransition returns [EObject current=null] : (this_TriggeredTransition_0= ruleTriggeredTransition | ( () otherlv_2= 'transition' ( ( ruleQualifiedName ) ) otherlv_4= '>' ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_TriggeredTransition_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:847:2: ( (this_TriggeredTransition_0= ruleTriggeredTransition | ( () otherlv_2= 'transition' ( ( ruleQualifiedName ) ) otherlv_4= '>' ( ( ruleQualifiedName ) ) ) ) )
            // InternalRoverml.g:848:2: (this_TriggeredTransition_0= ruleTriggeredTransition | ( () otherlv_2= 'transition' ( ( ruleQualifiedName ) ) otherlv_4= '>' ( ( ruleQualifiedName ) ) ) )
            {
            // InternalRoverml.g:848:2: (this_TriggeredTransition_0= ruleTriggeredTransition | ( () otherlv_2= 'transition' ( ( ruleQualifiedName ) ) otherlv_4= '>' ( ( ruleQualifiedName ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=49 && LA9_0<=51)) ) {
                alt9=1;
            }
            else if ( (LA9_0==30) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRoverml.g:849:3: this_TriggeredTransition_0= ruleTriggeredTransition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTransitionAccess().getTriggeredTransitionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TriggeredTransition_0=ruleTriggeredTransition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TriggeredTransition_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRoverml.g:858:3: ( () otherlv_2= 'transition' ( ( ruleQualifiedName ) ) otherlv_4= '>' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalRoverml.g:858:3: ( () otherlv_2= 'transition' ( ( ruleQualifiedName ) ) otherlv_4= '>' ( ( ruleQualifiedName ) ) )
                    // InternalRoverml.g:859:4: () otherlv_2= 'transition' ( ( ruleQualifiedName ) ) otherlv_4= '>' ( ( ruleQualifiedName ) )
                    {
                    // InternalRoverml.g:859:4: ()
                    // InternalRoverml.g:860:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTransitionAccess().getTransitionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,30,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getTransitionKeyword_1_1());
                      			
                    }
                    // InternalRoverml.g:870:4: ( ( ruleQualifiedName ) )
                    // InternalRoverml.g:871:5: ( ruleQualifiedName )
                    {
                    // InternalRoverml.g:871:5: ( ruleQualifiedName )
                    // InternalRoverml.g:872:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTransitionRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTransitionAccess().getSourceCommandCrossReference_1_2_0());
                      					
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

                    otherlv_4=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getGreaterThanSignKeyword_1_3());
                      			
                    }
                    // InternalRoverml.g:890:4: ( ( ruleQualifiedName ) )
                    // InternalRoverml.g:891:5: ( ruleQualifiedName )
                    {
                    // InternalRoverml.g:891:5: ( ruleQualifiedName )
                    // InternalRoverml.g:892:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTransitionRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTransitionAccess().getTargetCommandCrossReference_1_4_0());
                      					
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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleTriggeredTransition"
    // InternalRoverml.g:911:1: entryRuleTriggeredTransition returns [EObject current=null] : iv_ruleTriggeredTransition= ruleTriggeredTransition EOF ;
    public final EObject entryRuleTriggeredTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggeredTransition = null;


        try {
            // InternalRoverml.g:911:60: (iv_ruleTriggeredTransition= ruleTriggeredTransition EOF )
            // InternalRoverml.g:912:2: iv_ruleTriggeredTransition= ruleTriggeredTransition EOF
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
    // InternalRoverml.g:918:1: ruleTriggeredTransition returns [EObject current=null] : (this_DistanceSensorTrigger_0= ruleDistanceSensorTrigger | this_GpsTrigger_1= ruleGpsTrigger | (this_CompassTrigger_2= ruleCompassTrigger (otherlv_3= 'sensor' ( ( ruleQualifiedName ) ) )? otherlv_5= 'operator' ( (lv_operator_6_0= ruleComparisonOperator ) ) (otherlv_7= 'comparisonValue' ( (lv_comparisonValue_8_0= ruleQuantity ) ) )? ) ) ;
    public final EObject ruleTriggeredTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_DistanceSensorTrigger_0 = null;

        EObject this_GpsTrigger_1 = null;

        EObject this_CompassTrigger_2 = null;

        Enumerator lv_operator_6_0 = null;

        EObject lv_comparisonValue_8_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:924:2: ( (this_DistanceSensorTrigger_0= ruleDistanceSensorTrigger | this_GpsTrigger_1= ruleGpsTrigger | (this_CompassTrigger_2= ruleCompassTrigger (otherlv_3= 'sensor' ( ( ruleQualifiedName ) ) )? otherlv_5= 'operator' ( (lv_operator_6_0= ruleComparisonOperator ) ) (otherlv_7= 'comparisonValue' ( (lv_comparisonValue_8_0= ruleQuantity ) ) )? ) ) )
            // InternalRoverml.g:925:2: (this_DistanceSensorTrigger_0= ruleDistanceSensorTrigger | this_GpsTrigger_1= ruleGpsTrigger | (this_CompassTrigger_2= ruleCompassTrigger (otherlv_3= 'sensor' ( ( ruleQualifiedName ) ) )? otherlv_5= 'operator' ( (lv_operator_6_0= ruleComparisonOperator ) ) (otherlv_7= 'comparisonValue' ( (lv_comparisonValue_8_0= ruleQuantity ) ) )? ) )
            {
            // InternalRoverml.g:925:2: (this_DistanceSensorTrigger_0= ruleDistanceSensorTrigger | this_GpsTrigger_1= ruleGpsTrigger | (this_CompassTrigger_2= ruleCompassTrigger (otherlv_3= 'sensor' ( ( ruleQualifiedName ) ) )? otherlv_5= 'operator' ( (lv_operator_6_0= ruleComparisonOperator ) ) (otherlv_7= 'comparisonValue' ( (lv_comparisonValue_8_0= ruleQuantity ) ) )? ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt12=1;
                }
                break;
            case 50:
                {
                alt12=2;
                }
                break;
            case 51:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalRoverml.g:926:3: this_DistanceSensorTrigger_0= ruleDistanceSensorTrigger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTriggeredTransitionAccess().getDistanceSensorTriggerParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DistanceSensorTrigger_0=ruleDistanceSensorTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DistanceSensorTrigger_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRoverml.g:935:3: this_GpsTrigger_1= ruleGpsTrigger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTriggeredTransitionAccess().getGpsTriggerParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GpsTrigger_1=ruleGpsTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GpsTrigger_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalRoverml.g:944:3: (this_CompassTrigger_2= ruleCompassTrigger (otherlv_3= 'sensor' ( ( ruleQualifiedName ) ) )? otherlv_5= 'operator' ( (lv_operator_6_0= ruleComparisonOperator ) ) (otherlv_7= 'comparisonValue' ( (lv_comparisonValue_8_0= ruleQuantity ) ) )? )
                    {
                    // InternalRoverml.g:944:3: (this_CompassTrigger_2= ruleCompassTrigger (otherlv_3= 'sensor' ( ( ruleQualifiedName ) ) )? otherlv_5= 'operator' ( (lv_operator_6_0= ruleComparisonOperator ) ) (otherlv_7= 'comparisonValue' ( (lv_comparisonValue_8_0= ruleQuantity ) ) )? )
                    // InternalRoverml.g:945:4: this_CompassTrigger_2= ruleCompassTrigger (otherlv_3= 'sensor' ( ( ruleQualifiedName ) ) )? otherlv_5= 'operator' ( (lv_operator_6_0= ruleComparisonOperator ) ) (otherlv_7= 'comparisonValue' ( (lv_comparisonValue_8_0= ruleQuantity ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTriggeredTransitionAccess().getCompassTriggerParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    this_CompassTrigger_2=ruleCompassTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_CompassTrigger_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalRoverml.g:953:4: (otherlv_3= 'sensor' ( ( ruleQualifiedName ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==31) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalRoverml.g:954:5: otherlv_3= 'sensor' ( ( ruleQualifiedName ) )
                            {
                            otherlv_3=(Token)match(input,31,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getTriggeredTransitionAccess().getSensorKeyword_2_1_0());
                              				
                            }
                            // InternalRoverml.g:958:5: ( ( ruleQualifiedName ) )
                            // InternalRoverml.g:959:6: ( ruleQualifiedName )
                            {
                            // InternalRoverml.g:959:6: ( ruleQualifiedName )
                            // InternalRoverml.g:960:7: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTriggeredTransitionRule());
                              							}
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTriggeredTransitionAccess().getSensorSensorCrossReference_2_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_27);
                            ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,32,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTriggeredTransitionAccess().getOperatorKeyword_2_2());
                      			
                    }
                    // InternalRoverml.g:979:4: ( (lv_operator_6_0= ruleComparisonOperator ) )
                    // InternalRoverml.g:980:5: (lv_operator_6_0= ruleComparisonOperator )
                    {
                    // InternalRoverml.g:980:5: (lv_operator_6_0= ruleComparisonOperator )
                    // InternalRoverml.g:981:6: lv_operator_6_0= ruleComparisonOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTriggeredTransitionAccess().getOperatorComparisonOperatorEnumRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_operator_6_0=ruleComparisonOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTriggeredTransitionRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_6_0,
                      							"at.ac.tuwien.big.Roverml.ComparisonOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalRoverml.g:998:4: (otherlv_7= 'comparisonValue' ( (lv_comparisonValue_8_0= ruleQuantity ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==33) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalRoverml.g:999:5: otherlv_7= 'comparisonValue' ( (lv_comparisonValue_8_0= ruleQuantity ) )
                            {
                            otherlv_7=(Token)match(input,33,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getTriggeredTransitionAccess().getComparisonValueKeyword_2_4_0());
                              				
                            }
                            // InternalRoverml.g:1003:5: ( (lv_comparisonValue_8_0= ruleQuantity ) )
                            // InternalRoverml.g:1004:6: (lv_comparisonValue_8_0= ruleQuantity )
                            {
                            // InternalRoverml.g:1004:6: (lv_comparisonValue_8_0= ruleQuantity )
                            // InternalRoverml.g:1005:7: lv_comparisonValue_8_0= ruleQuantity
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTriggeredTransitionAccess().getComparisonValueQuantityParserRuleCall_2_4_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_comparisonValue_8_0=ruleQuantity();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTriggeredTransitionRule());
                              							}
                              							set(
                              								current,
                              								"comparisonValue",
                              								lv_comparisonValue_8_0,
                              								"at.ac.tuwien.big.Roverml.Quantity");
                              							afterParserOrEnumRuleCall();
                              						
                            }

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
    // $ANTLR end "ruleTriggeredTransition"


    // $ANTLR start "entryRuleGPS"
    // InternalRoverml.g:1028:1: entryRuleGPS returns [EObject current=null] : iv_ruleGPS= ruleGPS EOF ;
    public final EObject entryRuleGPS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGPS = null;


        try {
            // InternalRoverml.g:1028:44: (iv_ruleGPS= ruleGPS EOF )
            // InternalRoverml.g:1029:2: iv_ruleGPS= ruleGPS EOF
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
    // InternalRoverml.g:1035:1: ruleGPS returns [EObject current=null] : ( () otherlv_1= 'gps' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleGPS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRoverml.g:1041:2: ( ( () otherlv_1= 'gps' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalRoverml.g:1042:2: ( () otherlv_1= 'gps' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalRoverml.g:1042:2: ( () otherlv_1= 'gps' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalRoverml.g:1043:3: () otherlv_1= 'gps' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )?
            {
            // InternalRoverml.g:1043:3: ()
            // InternalRoverml.g:1044:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGPSAccess().getGPSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGPSAccess().getGpsKeyword_1());
              		
            }
            // InternalRoverml.g:1054:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRoverml.g:1055:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRoverml.g:1055:4: (lv_name_2_0= RULE_ID )
            // InternalRoverml.g:1056:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
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

            // InternalRoverml.g:1072:3: (otherlv_3= ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRoverml.g:1073:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:1082:1: entryRuleDistanceSensor returns [EObject current=null] : iv_ruleDistanceSensor= ruleDistanceSensor EOF ;
    public final EObject entryRuleDistanceSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceSensor = null;


        try {
            // InternalRoverml.g:1082:55: (iv_ruleDistanceSensor= ruleDistanceSensor EOF )
            // InternalRoverml.g:1083:2: iv_ruleDistanceSensor= ruleDistanceSensor EOF
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
    // InternalRoverml.g:1089:1: ruleDistanceSensor returns [EObject current=null] : ( () otherlv_1= 'distanceSensor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDistanceSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRoverml.g:1095:2: ( ( () otherlv_1= 'distanceSensor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalRoverml.g:1096:2: ( () otherlv_1= 'distanceSensor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalRoverml.g:1096:2: ( () otherlv_1= 'distanceSensor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalRoverml.g:1097:3: () otherlv_1= 'distanceSensor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )?
            {
            // InternalRoverml.g:1097:3: ()
            // InternalRoverml.g:1098:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDistanceSensorAccess().getDistanceSensorAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDistanceSensorAccess().getDistanceSensorKeyword_1());
              		
            }
            // InternalRoverml.g:1108:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRoverml.g:1109:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRoverml.g:1109:4: (lv_name_2_0= RULE_ID )
            // InternalRoverml.g:1110:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
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

            // InternalRoverml.g:1126:3: (otherlv_3= ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRoverml.g:1127:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDistanceSensorAccess().getCommaKeyword_3());
                      			
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
    // InternalRoverml.g:1136:1: entryRuleCompass returns [EObject current=null] : iv_ruleCompass= ruleCompass EOF ;
    public final EObject entryRuleCompass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompass = null;


        try {
            // InternalRoverml.g:1136:48: (iv_ruleCompass= ruleCompass EOF )
            // InternalRoverml.g:1137:2: iv_ruleCompass= ruleCompass EOF
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
    // InternalRoverml.g:1143:1: ruleCompass returns [EObject current=null] : ( () otherlv_1= 'compass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleCompass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRoverml.g:1149:2: ( ( () otherlv_1= 'compass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalRoverml.g:1150:2: ( () otherlv_1= 'compass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalRoverml.g:1150:2: ( () otherlv_1= 'compass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalRoverml.g:1151:3: () otherlv_1= 'compass' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )?
            {
            // InternalRoverml.g:1151:3: ()
            // InternalRoverml.g:1152:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCompassAccess().getCompassAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCompassAccess().getCompassKeyword_1());
              		
            }
            // InternalRoverml.g:1162:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRoverml.g:1163:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRoverml.g:1163:4: (lv_name_2_0= RULE_ID )
            // InternalRoverml.g:1164:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
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

            // InternalRoverml.g:1180:3: (otherlv_3= ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRoverml.g:1181:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getCompassAccess().getCommaKeyword_3());
                      			
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
    // InternalRoverml.g:1190:1: entryRuleSingleQuantity returns [EObject current=null] : iv_ruleSingleQuantity= ruleSingleQuantity EOF ;
    public final EObject entryRuleSingleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleQuantity = null;


        try {
            // InternalRoverml.g:1190:55: (iv_ruleSingleQuantity= ruleSingleQuantity EOF )
            // InternalRoverml.g:1191:2: iv_ruleSingleQuantity= ruleSingleQuantity EOF
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
    // InternalRoverml.g:1197:1: ruleSingleQuantity returns [EObject current=null] : (this_Time_0= ruleTime | this_Velocity_1= ruleVelocity | this_Angle_2= ruleAngle | (this_Length_3= ruleLength otherlv_4= '{' otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) otherlv_7= '}' ) ) ;
    public final EObject ruleSingleQuantity() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_Time_0 = null;

        EObject this_Velocity_1 = null;

        EObject this_Angle_2 = null;

        EObject this_Length_3 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1203:2: ( (this_Time_0= ruleTime | this_Velocity_1= ruleVelocity | this_Angle_2= ruleAngle | (this_Length_3= ruleLength otherlv_4= '{' otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) otherlv_7= '}' ) ) )
            // InternalRoverml.g:1204:2: (this_Time_0= ruleTime | this_Velocity_1= ruleVelocity | this_Angle_2= ruleAngle | (this_Length_3= ruleLength otherlv_4= '{' otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) otherlv_7= '}' ) )
            {
            // InternalRoverml.g:1204:2: (this_Time_0= ruleTime | this_Velocity_1= ruleVelocity | this_Angle_2= ruleAngle | (this_Length_3= ruleLength otherlv_4= '{' otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) otherlv_7= '}' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt16=1;
                }
                break;
            case 40:
                {
                alt16=2;
                }
                break;
            case 39:
                {
                alt16=3;
                }
                break;
            case 42:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalRoverml.g:1205:3: this_Time_0= ruleTime
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
                    // InternalRoverml.g:1214:3: this_Velocity_1= ruleVelocity
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
                    // InternalRoverml.g:1223:3: this_Angle_2= ruleAngle
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
                    // InternalRoverml.g:1232:3: (this_Length_3= ruleLength otherlv_4= '{' otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) otherlv_7= '}' )
                    {
                    // InternalRoverml.g:1232:3: (this_Length_3= ruleLength otherlv_4= '{' otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) otherlv_7= '}' )
                    // InternalRoverml.g:1233:4: this_Length_3= ruleLength otherlv_4= '{' otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) otherlv_7= '}'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSingleQuantityAccess().getLengthParserRuleCall_3_0());
                      			
                    }
                    pushFollow(FOLLOW_3);
                    this_Length_3=ruleLength();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Length_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_4=(Token)match(input,12,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSingleQuantityAccess().getLeftCurlyBracketKeyword_3_1());
                      			
                    }
                    otherlv_5=(Token)match(input,37,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSingleQuantityAccess().getValueKeyword_3_2());
                      			
                    }
                    // InternalRoverml.g:1249:4: ( (lv_value_6_0= ruleEFloat ) )
                    // InternalRoverml.g:1250:5: (lv_value_6_0= ruleEFloat )
                    {
                    // InternalRoverml.g:1250:5: (lv_value_6_0= ruleEFloat )
                    // InternalRoverml.g:1251:6: lv_value_6_0= ruleEFloat
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSingleQuantityAccess().getValueEFloatParserRuleCall_3_3_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_value_6_0=ruleEFloat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSingleQuantityRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_6_0,
                      							"at.ac.tuwien.big.Roverml.EFloat");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSingleQuantityAccess().getRightCurlyBracketKeyword_3_4());
                      			
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
    // $ANTLR end "ruleSingleQuantity"


    // $ANTLR start "entryRuleTime"
    // InternalRoverml.g:1277:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalRoverml.g:1277:45: (iv_ruleTime= ruleTime EOF )
            // InternalRoverml.g:1278:2: iv_ruleTime= ruleTime EOF
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
    // InternalRoverml.g:1284:1: ruleTime returns [EObject current=null] : (otherlv_0= 'timeUnit' ( (lv_timeUnit_1_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_timeUnit_1_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1290:2: ( (otherlv_0= 'timeUnit' ( (lv_timeUnit_1_0= ruleTimeUnit ) ) ) )
            // InternalRoverml.g:1291:2: (otherlv_0= 'timeUnit' ( (lv_timeUnit_1_0= ruleTimeUnit ) ) )
            {
            // InternalRoverml.g:1291:2: (otherlv_0= 'timeUnit' ( (lv_timeUnit_1_0= ruleTimeUnit ) ) )
            // InternalRoverml.g:1292:3: otherlv_0= 'timeUnit' ( (lv_timeUnit_1_0= ruleTimeUnit ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTimeAccess().getTimeUnitKeyword_0());
              		
            }
            // InternalRoverml.g:1296:3: ( (lv_timeUnit_1_0= ruleTimeUnit ) )
            // InternalRoverml.g:1297:4: (lv_timeUnit_1_0= ruleTimeUnit )
            {
            // InternalRoverml.g:1297:4: (lv_timeUnit_1_0= ruleTimeUnit )
            // InternalRoverml.g:1298:5: lv_timeUnit_1_0= ruleTimeUnit
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
    // InternalRoverml.g:1319:1: entryRuleAngle returns [EObject current=null] : iv_ruleAngle= ruleAngle EOF ;
    public final EObject entryRuleAngle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle = null;


        try {
            // InternalRoverml.g:1319:46: (iv_ruleAngle= ruleAngle EOF )
            // InternalRoverml.g:1320:2: iv_ruleAngle= ruleAngle EOF
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
    // InternalRoverml.g:1326:1: ruleAngle returns [EObject current=null] : (otherlv_0= 'angleUnit' ( (lv_angleUnit_1_0= ruleAngleUnit ) ) ) ;
    public final EObject ruleAngle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_angleUnit_1_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1332:2: ( (otherlv_0= 'angleUnit' ( (lv_angleUnit_1_0= ruleAngleUnit ) ) ) )
            // InternalRoverml.g:1333:2: (otherlv_0= 'angleUnit' ( (lv_angleUnit_1_0= ruleAngleUnit ) ) )
            {
            // InternalRoverml.g:1333:2: (otherlv_0= 'angleUnit' ( (lv_angleUnit_1_0= ruleAngleUnit ) ) )
            // InternalRoverml.g:1334:3: otherlv_0= 'angleUnit' ( (lv_angleUnit_1_0= ruleAngleUnit ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAngleAccess().getAngleUnitKeyword_0());
              		
            }
            // InternalRoverml.g:1338:3: ( (lv_angleUnit_1_0= ruleAngleUnit ) )
            // InternalRoverml.g:1339:4: (lv_angleUnit_1_0= ruleAngleUnit )
            {
            // InternalRoverml.g:1339:4: (lv_angleUnit_1_0= ruleAngleUnit )
            // InternalRoverml.g:1340:5: lv_angleUnit_1_0= ruleAngleUnit
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
    // InternalRoverml.g:1361:1: entryRuleVelocity returns [EObject current=null] : iv_ruleVelocity= ruleVelocity EOF ;
    public final EObject entryRuleVelocity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVelocity = null;


        try {
            // InternalRoverml.g:1361:49: (iv_ruleVelocity= ruleVelocity EOF )
            // InternalRoverml.g:1362:2: iv_ruleVelocity= ruleVelocity EOF
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
    // InternalRoverml.g:1368:1: ruleVelocity returns [EObject current=null] : (otherlv_0= 'velocityUnit' ( (lv_velocityUnit_1_0= ruleVelocityUnit ) ) ) ;
    public final EObject ruleVelocity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_velocityUnit_1_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1374:2: ( (otherlv_0= 'velocityUnit' ( (lv_velocityUnit_1_0= ruleVelocityUnit ) ) ) )
            // InternalRoverml.g:1375:2: (otherlv_0= 'velocityUnit' ( (lv_velocityUnit_1_0= ruleVelocityUnit ) ) )
            {
            // InternalRoverml.g:1375:2: (otherlv_0= 'velocityUnit' ( (lv_velocityUnit_1_0= ruleVelocityUnit ) ) )
            // InternalRoverml.g:1376:3: otherlv_0= 'velocityUnit' ( (lv_velocityUnit_1_0= ruleVelocityUnit ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVelocityAccess().getVelocityUnitKeyword_0());
              		
            }
            // InternalRoverml.g:1380:3: ( (lv_velocityUnit_1_0= ruleVelocityUnit ) )
            // InternalRoverml.g:1381:4: (lv_velocityUnit_1_0= ruleVelocityUnit )
            {
            // InternalRoverml.g:1381:4: (lv_velocityUnit_1_0= ruleVelocityUnit )
            // InternalRoverml.g:1382:5: lv_velocityUnit_1_0= ruleVelocityUnit
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
    // InternalRoverml.g:1403:1: entryRuleLight returns [EObject current=null] : iv_ruleLight= ruleLight EOF ;
    public final EObject entryRuleLight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLight = null;


        try {
            // InternalRoverml.g:1403:46: (iv_ruleLight= ruleLight EOF )
            // InternalRoverml.g:1404:2: iv_ruleLight= ruleLight EOF
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
    // InternalRoverml.g:1410:1: ruleLight returns [EObject current=null] : ( () otherlv_1= 'light' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleLight() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRoverml.g:1416:2: ( ( () otherlv_1= 'light' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalRoverml.g:1417:2: ( () otherlv_1= 'light' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalRoverml.g:1417:2: ( () otherlv_1= 'light' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalRoverml.g:1418:3: () otherlv_1= 'light' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )?
            {
            // InternalRoverml.g:1418:3: ()
            // InternalRoverml.g:1419:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLightAccess().getLightAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLightAccess().getLightKeyword_1());
              		
            }
            // InternalRoverml.g:1429:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRoverml.g:1430:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRoverml.g:1430:4: (lv_name_2_0= RULE_ID )
            // InternalRoverml.g:1431:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
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

            // InternalRoverml.g:1447:3: (otherlv_3= ',' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRoverml.g:1448:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLightAccess().getCommaKeyword_3());
                      			
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
    // InternalRoverml.g:1457:1: entryRuleLength returns [EObject current=null] : iv_ruleLength= ruleLength EOF ;
    public final EObject entryRuleLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLength = null;


        try {
            // InternalRoverml.g:1457:47: (iv_ruleLength= ruleLength EOF )
            // InternalRoverml.g:1458:2: iv_ruleLength= ruleLength EOF
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
    // InternalRoverml.g:1464:1: ruleLength returns [EObject current=null] : (otherlv_0= 'length' otherlv_1= '{' otherlv_2= 'lengthUnit' ( (lv_lengthUnit_3_0= ruleLengthUnit ) ) otherlv_4= '}' ) ;
    public final EObject ruleLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_lengthUnit_3_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1470:2: ( (otherlv_0= 'length' otherlv_1= '{' otherlv_2= 'lengthUnit' ( (lv_lengthUnit_3_0= ruleLengthUnit ) ) otherlv_4= '}' ) )
            // InternalRoverml.g:1471:2: (otherlv_0= 'length' otherlv_1= '{' otherlv_2= 'lengthUnit' ( (lv_lengthUnit_3_0= ruleLengthUnit ) ) otherlv_4= '}' )
            {
            // InternalRoverml.g:1471:2: (otherlv_0= 'length' otherlv_1= '{' otherlv_2= 'lengthUnit' ( (lv_lengthUnit_3_0= ruleLengthUnit ) ) otherlv_4= '}' )
            // InternalRoverml.g:1472:3: otherlv_0= 'length' otherlv_1= '{' otherlv_2= 'lengthUnit' ( (lv_lengthUnit_3_0= ruleLengthUnit ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLengthAccess().getLengthKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,12,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLengthAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,43,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLengthAccess().getLengthUnitKeyword_2());
              		
            }
            // InternalRoverml.g:1484:3: ( (lv_lengthUnit_3_0= ruleLengthUnit ) )
            // InternalRoverml.g:1485:4: (lv_lengthUnit_3_0= ruleLengthUnit )
            {
            // InternalRoverml.g:1485:4: (lv_lengthUnit_3_0= ruleLengthUnit )
            // InternalRoverml.g:1486:5: lv_lengthUnit_3_0= ruleLengthUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLengthAccess().getLengthUnitLengthUnitEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_lengthUnit_3_0=ruleLengthUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLengthRule());
              					}
              					set(
              						current,
              						"lengthUnit",
              						lv_lengthUnit_3_0,
              						"at.ac.tuwien.big.Roverml.LengthUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLengthAccess().getRightCurlyBracketKeyword_4());
              		
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
    // InternalRoverml.g:1511:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalRoverml.g:1511:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalRoverml.g:1512:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalRoverml.g:1518:1: ruleSensor returns [EObject current=null] : (this_GPS_0= ruleGPS | this_DistanceSensor_1= ruleDistanceSensor | (this_Compass_2= ruleCompass otherlv_3= '{' ( (lv_lastSensedValue_4_0= ruleQuantity ) ) otherlv_5= '}' ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_GPS_0 = null;

        EObject this_DistanceSensor_1 = null;

        EObject this_Compass_2 = null;

        EObject lv_lastSensedValue_4_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1524:2: ( (this_GPS_0= ruleGPS | this_DistanceSensor_1= ruleDistanceSensor | (this_Compass_2= ruleCompass otherlv_3= '{' ( (lv_lastSensedValue_4_0= ruleQuantity ) ) otherlv_5= '}' ) ) )
            // InternalRoverml.g:1525:2: (this_GPS_0= ruleGPS | this_DistanceSensor_1= ruleDistanceSensor | (this_Compass_2= ruleCompass otherlv_3= '{' ( (lv_lastSensedValue_4_0= ruleQuantity ) ) otherlv_5= '}' ) )
            {
            // InternalRoverml.g:1525:2: (this_GPS_0= ruleGPS | this_DistanceSensor_1= ruleDistanceSensor | (this_Compass_2= ruleCompass otherlv_3= '{' ( (lv_lastSensedValue_4_0= ruleQuantity ) ) otherlv_5= '}' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt18=1;
                }
                break;
            case 35:
                {
                alt18=2;
                }
                break;
            case 36:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalRoverml.g:1526:3: this_GPS_0= ruleGPS
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
                    // InternalRoverml.g:1535:3: this_DistanceSensor_1= ruleDistanceSensor
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
                    // InternalRoverml.g:1544:3: (this_Compass_2= ruleCompass otherlv_3= '{' ( (lv_lastSensedValue_4_0= ruleQuantity ) ) otherlv_5= '}' )
                    {
                    // InternalRoverml.g:1544:3: (this_Compass_2= ruleCompass otherlv_3= '{' ( (lv_lastSensedValue_4_0= ruleQuantity ) ) otherlv_5= '}' )
                    // InternalRoverml.g:1545:4: this_Compass_2= ruleCompass otherlv_3= '{' ( (lv_lastSensedValue_4_0= ruleQuantity ) ) otherlv_5= '}'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSensorAccess().getCompassParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_3);
                    this_Compass_2=ruleCompass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Compass_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,12,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2_1());
                      			
                    }
                    // InternalRoverml.g:1557:4: ( (lv_lastSensedValue_4_0= ruleQuantity ) )
                    // InternalRoverml.g:1558:5: (lv_lastSensedValue_4_0= ruleQuantity )
                    {
                    // InternalRoverml.g:1558:5: (lv_lastSensedValue_4_0= ruleQuantity )
                    // InternalRoverml.g:1559:6: lv_lastSensedValue_4_0= ruleQuantity
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSensorAccess().getLastSensedValueQuantityParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_lastSensedValue_4_0=ruleQuantity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSensorRule());
                      						}
                      						set(
                      							current,
                      							"lastSensedValue",
                      							lv_lastSensedValue_4_0,
                      							"at.ac.tuwien.big.Roverml.Quantity");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_2_3());
                      			
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
    // InternalRoverml.g:1585:1: entryRuleMotor returns [EObject current=null] : iv_ruleMotor= ruleMotor EOF ;
    public final EObject entryRuleMotor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotor = null;


        try {
            // InternalRoverml.g:1585:46: (iv_ruleMotor= ruleMotor EOF )
            // InternalRoverml.g:1586:2: iv_ruleMotor= ruleMotor EOF
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
    // InternalRoverml.g:1592:1: ruleMotor returns [EObject current=null] : ( () otherlv_1= 'motor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleMotor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRoverml.g:1598:2: ( ( () otherlv_1= 'motor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalRoverml.g:1599:2: ( () otherlv_1= 'motor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalRoverml.g:1599:2: ( () otherlv_1= 'motor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalRoverml.g:1600:3: () otherlv_1= 'motor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ',' )?
            {
            // InternalRoverml.g:1600:3: ()
            // InternalRoverml.g:1601:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMotorAccess().getMotorAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMotorAccess().getMotorKeyword_1());
              		
            }
            // InternalRoverml.g:1611:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRoverml.g:1612:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRoverml.g:1612:4: (lv_name_2_0= RULE_ID )
            // InternalRoverml.g:1613:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
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

            // InternalRoverml.g:1629:3: (otherlv_3= ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRoverml.g:1630:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:1639:1: entryRuleTerminate returns [EObject current=null] : iv_ruleTerminate= ruleTerminate EOF ;
    public final EObject entryRuleTerminate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminate = null;


        try {
            // InternalRoverml.g:1639:50: (iv_ruleTerminate= ruleTerminate EOF )
            // InternalRoverml.g:1640:2: iv_ruleTerminate= ruleTerminate EOF
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
    // InternalRoverml.g:1646:1: ruleTerminate returns [EObject current=null] : ( () otherlv_1= 'terminate' ) ;
    public final EObject ruleTerminate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:1652:2: ( ( () otherlv_1= 'terminate' ) )
            // InternalRoverml.g:1653:2: ( () otherlv_1= 'terminate' )
            {
            // InternalRoverml.g:1653:2: ( () otherlv_1= 'terminate' )
            // InternalRoverml.g:1654:3: () otherlv_1= 'terminate'
            {
            // InternalRoverml.g:1654:3: ()
            // InternalRoverml.g:1655:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTerminateAccess().getTerminateAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:1669:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalRoverml.g:1669:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalRoverml.g:1670:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalRoverml.g:1676:1: ruleComponent returns [EObject current=null] : (this_Actuator_0= ruleActuator | (this_Sensor_1= ruleSensor (otherlv_2= '(' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleEString ) ) )? otherlv_5= ')' )? (otherlv_6= ',' )? ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject this_Actuator_0 = null;

        EObject this_Sensor_1 = null;

        AntlrDatatypeRuleToken lv_kind_4_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1682:2: ( (this_Actuator_0= ruleActuator | (this_Sensor_1= ruleSensor (otherlv_2= '(' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleEString ) ) )? otherlv_5= ')' )? (otherlv_6= ',' )? ) ) )
            // InternalRoverml.g:1683:2: (this_Actuator_0= ruleActuator | (this_Sensor_1= ruleSensor (otherlv_2= '(' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleEString ) ) )? otherlv_5= ')' )? (otherlv_6= ',' )? ) )
            {
            // InternalRoverml.g:1683:2: (this_Actuator_0= ruleActuator | (this_Sensor_1= ruleSensor (otherlv_2= '(' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleEString ) ) )? otherlv_5= ')' )? (otherlv_6= ',' )? ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41||LA23_0==44) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=34 && LA23_0<=36)) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalRoverml.g:1684:3: this_Actuator_0= ruleActuator
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
                    // InternalRoverml.g:1693:3: (this_Sensor_1= ruleSensor (otherlv_2= '(' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleEString ) ) )? otherlv_5= ')' )? (otherlv_6= ',' )? )
                    {
                    // InternalRoverml.g:1693:3: (this_Sensor_1= ruleSensor (otherlv_2= '(' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleEString ) ) )? otherlv_5= ')' )? (otherlv_6= ',' )? )
                    // InternalRoverml.g:1694:4: this_Sensor_1= ruleSensor (otherlv_2= '(' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleEString ) ) )? otherlv_5= ')' )? (otherlv_6= ',' )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getComponentAccess().getSensorParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_38);
                    this_Sensor_1=ruleSensor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Sensor_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalRoverml.g:1702:4: (otherlv_2= '(' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleEString ) ) )? otherlv_5= ')' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==46) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalRoverml.g:1703:5: otherlv_2= '(' (otherlv_3= 'kind' ( (lv_kind_4_0= ruleEString ) ) )? otherlv_5= ')'
                            {
                            otherlv_2=(Token)match(input,46,FOLLOW_39); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1_1_0());
                              				
                            }
                            // InternalRoverml.g:1707:5: (otherlv_3= 'kind' ( (lv_kind_4_0= ruleEString ) ) )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==47) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // InternalRoverml.g:1708:6: otherlv_3= 'kind' ( (lv_kind_4_0= ruleEString ) )
                                    {
                                    otherlv_3=(Token)match(input,47,FOLLOW_40); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getKindKeyword_1_1_1_0());
                                      					
                                    }
                                    // InternalRoverml.g:1712:6: ( (lv_kind_4_0= ruleEString ) )
                                    // InternalRoverml.g:1713:7: (lv_kind_4_0= ruleEString )
                                    {
                                    // InternalRoverml.g:1713:7: (lv_kind_4_0= ruleEString )
                                    // InternalRoverml.g:1714:8: lv_kind_4_0= ruleEString
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getComponentAccess().getKindEStringParserRuleCall_1_1_1_1_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_41);
                                    lv_kind_4_0=ruleEString();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getComponentRule());
                                      								}
                                      								set(
                                      									current,
                                      									"kind",
                                      									lv_kind_4_0,
                                      									"at.ac.tuwien.big.Roverml.EString");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_5=(Token)match(input,48,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getRightParenthesisKeyword_1_1_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalRoverml.g:1737:4: (otherlv_6= ',' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==28) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalRoverml.g:1738:5: otherlv_6= ','
                            {
                            otherlv_6=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getCommaKeyword_1_2());
                              				
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleActuator"
    // InternalRoverml.g:1748:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalRoverml.g:1748:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalRoverml.g:1749:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalRoverml.g:1755:1: ruleActuator returns [EObject current=null] : (this_Light_0= ruleLight | this_Motor_1= ruleMotor ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        EObject this_Light_0 = null;

        EObject this_Motor_1 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1761:2: ( (this_Light_0= ruleLight | this_Motor_1= ruleMotor ) )
            // InternalRoverml.g:1762:2: (this_Light_0= ruleLight | this_Motor_1= ruleMotor )
            {
            // InternalRoverml.g:1762:2: (this_Light_0= ruleLight | this_Motor_1= ruleMotor )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            else if ( (LA24_0==44) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalRoverml.g:1763:3: this_Light_0= ruleLight
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
                    // InternalRoverml.g:1772:3: this_Motor_1= ruleMotor
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
    // InternalRoverml.g:1784:1: entryRuleDistanceSensorTrigger returns [EObject current=null] : iv_ruleDistanceSensorTrigger= ruleDistanceSensorTrigger EOF ;
    public final EObject entryRuleDistanceSensorTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceSensorTrigger = null;


        try {
            // InternalRoverml.g:1784:62: (iv_ruleDistanceSensorTrigger= ruleDistanceSensorTrigger EOF )
            // InternalRoverml.g:1785:2: iv_ruleDistanceSensorTrigger= ruleDistanceSensorTrigger EOF
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
    // InternalRoverml.g:1791:1: ruleDistanceSensorTrigger returns [EObject current=null] : ( () otherlv_1= 'DistanceSensorTrigger' ) ;
    public final EObject ruleDistanceSensorTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:1797:2: ( ( () otherlv_1= 'DistanceSensorTrigger' ) )
            // InternalRoverml.g:1798:2: ( () otherlv_1= 'DistanceSensorTrigger' )
            {
            // InternalRoverml.g:1798:2: ( () otherlv_1= 'DistanceSensorTrigger' )
            // InternalRoverml.g:1799:3: () otherlv_1= 'DistanceSensorTrigger'
            {
            // InternalRoverml.g:1799:3: ()
            // InternalRoverml.g:1800:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDistanceSensorTriggerAccess().getDistanceSensorTriggerAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDistanceSensorTriggerAccess().getDistanceSensorTriggerKeyword_1());
              		
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
    // InternalRoverml.g:1814:1: entryRuleGpsTrigger returns [EObject current=null] : iv_ruleGpsTrigger= ruleGpsTrigger EOF ;
    public final EObject entryRuleGpsTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGpsTrigger = null;


        try {
            // InternalRoverml.g:1814:51: (iv_ruleGpsTrigger= ruleGpsTrigger EOF )
            // InternalRoverml.g:1815:2: iv_ruleGpsTrigger= ruleGpsTrigger EOF
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
    // InternalRoverml.g:1821:1: ruleGpsTrigger returns [EObject current=null] : ( () otherlv_1= 'GpsTrigger' ) ;
    public final EObject ruleGpsTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:1827:2: ( ( () otherlv_1= 'GpsTrigger' ) )
            // InternalRoverml.g:1828:2: ( () otherlv_1= 'GpsTrigger' )
            {
            // InternalRoverml.g:1828:2: ( () otherlv_1= 'GpsTrigger' )
            // InternalRoverml.g:1829:3: () otherlv_1= 'GpsTrigger'
            {
            // InternalRoverml.g:1829:3: ()
            // InternalRoverml.g:1830:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGpsTriggerAccess().getGpsTriggerAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGpsTriggerAccess().getGpsTriggerKeyword_1());
              		
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
    // InternalRoverml.g:1844:1: entryRuleCompassTrigger returns [EObject current=null] : iv_ruleCompassTrigger= ruleCompassTrigger EOF ;
    public final EObject entryRuleCompassTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompassTrigger = null;


        try {
            // InternalRoverml.g:1844:55: (iv_ruleCompassTrigger= ruleCompassTrigger EOF )
            // InternalRoverml.g:1845:2: iv_ruleCompassTrigger= ruleCompassTrigger EOF
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
    // InternalRoverml.g:1851:1: ruleCompassTrigger returns [EObject current=null] : ( () otherlv_1= 'CompassTrigger' ) ;
    public final EObject ruleCompassTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:1857:2: ( ( () otherlv_1= 'CompassTrigger' ) )
            // InternalRoverml.g:1858:2: ( () otherlv_1= 'CompassTrigger' )
            {
            // InternalRoverml.g:1858:2: ( () otherlv_1= 'CompassTrigger' )
            // InternalRoverml.g:1859:3: () otherlv_1= 'CompassTrigger'
            {
            // InternalRoverml.g:1859:3: ()
            // InternalRoverml.g:1860:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCompassTriggerAccess().getCompassTriggerAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCompassTriggerAccess().getCompassTriggerKeyword_1());
              		
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
    // InternalRoverml.g:1874:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // InternalRoverml.g:1874:49: (iv_ruleQuantity= ruleQuantity EOF )
            // InternalRoverml.g:1875:2: iv_ruleQuantity= ruleQuantity EOF
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
    // InternalRoverml.g:1881:1: ruleQuantity returns [EObject current=null] : (this_Position_0= rulePosition | (this_SingleQuantity_1= ruleSingleQuantity otherlv_2= 'quantity' ) ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Position_0 = null;

        EObject this_SingleQuantity_1 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1887:2: ( (this_Position_0= rulePosition | (this_SingleQuantity_1= ruleSingleQuantity otherlv_2= 'quantity' ) ) )
            // InternalRoverml.g:1888:2: (this_Position_0= rulePosition | (this_SingleQuantity_1= ruleSingleQuantity otherlv_2= 'quantity' ) )
            {
            // InternalRoverml.g:1888:2: (this_Position_0= rulePosition | (this_SingleQuantity_1= ruleSingleQuantity otherlv_2= 'quantity' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==53) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=38 && LA25_0<=40)||LA25_0==42) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalRoverml.g:1889:3: this_Position_0= rulePosition
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
                    // InternalRoverml.g:1898:3: (this_SingleQuantity_1= ruleSingleQuantity otherlv_2= 'quantity' )
                    {
                    // InternalRoverml.g:1898:3: (this_SingleQuantity_1= ruleSingleQuantity otherlv_2= 'quantity' )
                    // InternalRoverml.g:1899:4: this_SingleQuantity_1= ruleSingleQuantity otherlv_2= 'quantity'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getQuantityAccess().getSingleQuantityParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_42);
                    this_SingleQuantity_1=ruleSingleQuantity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SingleQuantity_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getQuantityAccess().getQuantityKeyword_1_1());
                      			
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
    // $ANTLR end "ruleQuantity"


    // $ANTLR start "entryRulePosition"
    // InternalRoverml.g:1916:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalRoverml.g:1916:49: (iv_rulePosition= rulePosition EOF )
            // InternalRoverml.g:1917:2: iv_rulePosition= rulePosition EOF
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
    // InternalRoverml.g:1923:1: rulePosition returns [EObject current=null] : ( () otherlv_1= 'position' otherlv_2= '{' (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) ) (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) ) otherlv_7= '}' ) ;
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
            // InternalRoverml.g:1929:2: ( ( () otherlv_1= 'position' otherlv_2= '{' (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) ) (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) ) otherlv_7= '}' ) )
            // InternalRoverml.g:1930:2: ( () otherlv_1= 'position' otherlv_2= '{' (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) ) (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) ) otherlv_7= '}' )
            {
            // InternalRoverml.g:1930:2: ( () otherlv_1= 'position' otherlv_2= '{' (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) ) (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) ) otherlv_7= '}' )
            // InternalRoverml.g:1931:3: () otherlv_1= 'position' otherlv_2= '{' (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) ) (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) ) otherlv_7= '}'
            {
            // InternalRoverml.g:1931:3: ()
            // InternalRoverml.g:1932:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPositionAccess().getPositionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getPositionKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,12,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalRoverml.g:1946:3: (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) )
            // InternalRoverml.g:1947:4: otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) )
            {
            otherlv_3=(Token)match(input,54,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getPositionAccess().getXKeyword_3_0());
              			
            }
            // InternalRoverml.g:1951:4: ( (lv_x_4_0= ruleLength ) )
            // InternalRoverml.g:1952:5: (lv_x_4_0= ruleLength )
            {
            // InternalRoverml.g:1952:5: (lv_x_4_0= ruleLength )
            // InternalRoverml.g:1953:6: lv_x_4_0= ruleLength
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getPositionAccess().getXLengthParserRuleCall_3_1_0());
              					
            }
            pushFollow(FOLLOW_44);
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

            // InternalRoverml.g:1971:3: (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) )
            // InternalRoverml.g:1972:4: otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) )
            {
            otherlv_5=(Token)match(input,55,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getPositionAccess().getYKeyword_4_0());
              			
            }
            // InternalRoverml.g:1976:4: ( (lv_y_6_0= ruleLength ) )
            // InternalRoverml.g:1977:5: (lv_y_6_0= ruleLength )
            {
            // InternalRoverml.g:1977:5: (lv_y_6_0= ruleLength )
            // InternalRoverml.g:1978:6: lv_y_6_0= ruleLength
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
    // InternalRoverml.g:2004:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalRoverml.g:2004:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalRoverml.g:2005:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalRoverml.g:2011:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRoverml.g:2017:2: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalRoverml.g:2018:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalRoverml.g:2018:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalRoverml.g:2019:3: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalRoverml.g:2026:3: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==56) && (synpred1_InternalRoverml())) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRoverml.g:2027:4: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalRoverml.g:2027:4: ( ( '.' )=>kw= '.' )
            	    // InternalRoverml.g:2028:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,56,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalRoverml.g:2047:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRoverml.g:2047:47: (iv_ruleEString= ruleEString EOF )
            // InternalRoverml.g:2048:2: iv_ruleEString= ruleEString EOF
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
    // InternalRoverml.g:2054:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:2060:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRoverml.g:2061:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRoverml.g:2061:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalRoverml.g:2062:3: this_STRING_0= RULE_STRING
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
                    // InternalRoverml.g:2070:3: this_ID_1= RULE_ID
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
    // InternalRoverml.g:2081:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalRoverml.g:2081:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalRoverml.g:2082:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalRoverml.g:2088:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalRoverml.g:2094:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalRoverml.g:2095:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalRoverml.g:2095:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalRoverml.g:2096:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalRoverml.g:2096:3: (kw= '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==57) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRoverml.g:2097:4: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalRoverml.g:2103:3: (this_INT_1= RULE_INT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRoverml.g:2104:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,56,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
              		
            }
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
              		
            }
            // InternalRoverml.g:2124:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=58 && LA32_0<=59)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRoverml.g:2125:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalRoverml.g:2125:4: (kw= 'E' | kw= 'e' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==58) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==59) ) {
                        alt30=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalRoverml.g:2126:5: kw= 'E'
                            {
                            kw=(Token)match(input,58,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalRoverml.g:2132:5: kw= 'e'
                            {
                            kw=(Token)match(input,59,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalRoverml.g:2138:4: (kw= '-' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==57) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalRoverml.g:2139:5: kw= '-'
                            {
                            kw=(Token)match(input,57,FOLLOW_48); if (state.failed) return current;
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
    // InternalRoverml.g:2157:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRoverml.g:2157:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRoverml.g:2158:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalRoverml.g:2164:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:2170:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRoverml.g:2171:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRoverml.g:2171:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRoverml.g:2172:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRoverml.g:2172:3: (kw= '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==57) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRoverml.g:2173:4: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_48); if (state.failed) return current;
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
    // InternalRoverml.g:2190:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'move' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'Green' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Blue' ) | (enumLiteral_7= '3' ) | (enumLiteral_8= 'Yellow' ) | (enumLiteral_9= '4' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalRoverml.g:2196:2: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'move' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'Green' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Blue' ) | (enumLiteral_7= '3' ) | (enumLiteral_8= 'Yellow' ) | (enumLiteral_9= '4' ) ) )
            // InternalRoverml.g:2197:2: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'move' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'Green' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Blue' ) | (enumLiteral_7= '3' ) | (enumLiteral_8= 'Yellow' ) | (enumLiteral_9= '4' ) )
            {
            // InternalRoverml.g:2197:2: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'move' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'Green' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Blue' ) | (enumLiteral_7= '3' ) | (enumLiteral_8= 'Yellow' ) | (enumLiteral_9= '4' ) )
            int alt34=10;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt34=1;
                }
                break;
            case 61:
                {
                alt34=2;
                }
                break;
            case 19:
                {
                alt34=3;
                }
                break;
            case 62:
                {
                alt34=4;
                }
                break;
            case 63:
                {
                alt34=5;
                }
                break;
            case 64:
                {
                alt34=6;
                }
                break;
            case 65:
                {
                alt34=7;
                }
                break;
            case 66:
                {
                alt34=8;
                }
                break;
            case 67:
                {
                alt34=9;
                }
                break;
            case 68:
                {
                alt34=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalRoverml.g:2198:3: (enumLiteral_0= 'None' )
                    {
                    // InternalRoverml.g:2198:3: (enumLiteral_0= 'None' )
                    // InternalRoverml.g:2199:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getNoneEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2206:3: (enumLiteral_1= '0' )
                    {
                    // InternalRoverml.g:2206:3: (enumLiteral_1= '0' )
                    // InternalRoverml.g:2207:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getNoneEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getNoneEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverml.g:2214:3: (enumLiteral_2= 'move' )
                    {
                    // InternalRoverml.g:2214:3: (enumLiteral_2= 'move' )
                    // InternalRoverml.g:2215:4: enumLiteral_2= 'move'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverml.g:2222:3: (enumLiteral_3= '1' )
                    {
                    // InternalRoverml.g:2222:3: (enumLiteral_3= '1' )
                    // InternalRoverml.g:2223:4: enumLiteral_3= '1'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalRoverml.g:2230:3: (enumLiteral_4= 'Green' )
                    {
                    // InternalRoverml.g:2230:3: (enumLiteral_4= 'Green' )
                    // InternalRoverml.g:2231:4: enumLiteral_4= 'Green'
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalRoverml.g:2238:3: (enumLiteral_5= '2' )
                    {
                    // InternalRoverml.g:2238:3: (enumLiteral_5= '2' )
                    // InternalRoverml.g:2239:4: enumLiteral_5= '2'
                    {
                    enumLiteral_5=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalRoverml.g:2246:3: (enumLiteral_6= 'Blue' )
                    {
                    // InternalRoverml.g:2246:3: (enumLiteral_6= 'Blue' )
                    // InternalRoverml.g:2247:4: enumLiteral_6= 'Blue'
                    {
                    enumLiteral_6=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalRoverml.g:2254:3: (enumLiteral_7= '3' )
                    {
                    // InternalRoverml.g:2254:3: (enumLiteral_7= '3' )
                    // InternalRoverml.g:2255:4: enumLiteral_7= '3'
                    {
                    enumLiteral_7=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalRoverml.g:2262:3: (enumLiteral_8= 'Yellow' )
                    {
                    // InternalRoverml.g:2262:3: (enumLiteral_8= 'Yellow' )
                    // InternalRoverml.g:2263:4: enumLiteral_8= 'Yellow'
                    {
                    enumLiteral_8=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalRoverml.g:2270:3: (enumLiteral_9= '4' )
                    {
                    // InternalRoverml.g:2270:3: (enumLiteral_9= '4' )
                    // InternalRoverml.g:2271:4: enumLiteral_9= '4'
                    {
                    enumLiteral_9=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_9());
                      			
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
    // InternalRoverml.g:2281:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Ns' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Ms' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'S' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Min' ) | (enumLiteral_7= '3' ) | (enumLiteral_8= 'H' ) | (enumLiteral_9= '4' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalRoverml.g:2287:2: ( ( (enumLiteral_0= 'Ns' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Ms' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'S' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Min' ) | (enumLiteral_7= '3' ) | (enumLiteral_8= 'H' ) | (enumLiteral_9= '4' ) ) )
            // InternalRoverml.g:2288:2: ( (enumLiteral_0= 'Ns' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Ms' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'S' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Min' ) | (enumLiteral_7= '3' ) | (enumLiteral_8= 'H' ) | (enumLiteral_9= '4' ) )
            {
            // InternalRoverml.g:2288:2: ( (enumLiteral_0= 'Ns' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Ms' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'S' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Min' ) | (enumLiteral_7= '3' ) | (enumLiteral_8= 'H' ) | (enumLiteral_9= '4' ) )
            int alt35=10;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt35=1;
                }
                break;
            case 61:
                {
                alt35=2;
                }
                break;
            case 70:
                {
                alt35=3;
                }
                break;
            case 62:
                {
                alt35=4;
                }
                break;
            case 71:
                {
                alt35=5;
                }
                break;
            case 64:
                {
                alt35=6;
                }
                break;
            case 72:
                {
                alt35=7;
                }
                break;
            case 66:
                {
                alt35=8;
                }
                break;
            case 73:
                {
                alt35=9;
                }
                break;
            case 68:
                {
                alt35=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalRoverml.g:2289:3: (enumLiteral_0= 'Ns' )
                    {
                    // InternalRoverml.g:2289:3: (enumLiteral_0= 'Ns' )
                    // InternalRoverml.g:2290:4: enumLiteral_0= 'Ns'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getNsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getNsEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2297:3: (enumLiteral_1= '0' )
                    {
                    // InternalRoverml.g:2297:3: (enumLiteral_1= '0' )
                    // InternalRoverml.g:2298:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getNsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getNsEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverml.g:2305:3: (enumLiteral_2= 'Ms' )
                    {
                    // InternalRoverml.g:2305:3: (enumLiteral_2= 'Ms' )
                    // InternalRoverml.g:2306:4: enumLiteral_2= 'Ms'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getMsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMsEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverml.g:2313:3: (enumLiteral_3= '1' )
                    {
                    // InternalRoverml.g:2313:3: (enumLiteral_3= '1' )
                    // InternalRoverml.g:2314:4: enumLiteral_3= '1'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getMsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getMsEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalRoverml.g:2321:3: (enumLiteral_4= 'S' )
                    {
                    // InternalRoverml.g:2321:3: (enumLiteral_4= 'S' )
                    // InternalRoverml.g:2322:4: enumLiteral_4= 'S'
                    {
                    enumLiteral_4=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getSEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalRoverml.g:2329:3: (enumLiteral_5= '2' )
                    {
                    // InternalRoverml.g:2329:3: (enumLiteral_5= '2' )
                    // InternalRoverml.g:2330:4: enumLiteral_5= '2'
                    {
                    enumLiteral_5=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getTimeUnitAccess().getSEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalRoverml.g:2337:3: (enumLiteral_6= 'Min' )
                    {
                    // InternalRoverml.g:2337:3: (enumLiteral_6= 'Min' )
                    // InternalRoverml.g:2338:4: enumLiteral_6= 'Min'
                    {
                    enumLiteral_6=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalRoverml.g:2345:3: (enumLiteral_7= '3' )
                    {
                    // InternalRoverml.g:2345:3: (enumLiteral_7= '3' )
                    // InternalRoverml.g:2346:4: enumLiteral_7= '3'
                    {
                    enumLiteral_7=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalRoverml.g:2353:3: (enumLiteral_8= 'H' )
                    {
                    // InternalRoverml.g:2353:3: (enumLiteral_8= 'H' )
                    // InternalRoverml.g:2354:4: enumLiteral_8= 'H'
                    {
                    enumLiteral_8=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getHEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getTimeUnitAccess().getHEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalRoverml.g:2361:3: (enumLiteral_9= '4' )
                    {
                    // InternalRoverml.g:2361:3: (enumLiteral_9= '4' )
                    // InternalRoverml.g:2362:4: enumLiteral_9= '4'
                    {
                    enumLiteral_9=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getHEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getTimeUnitAccess().getHEnumLiteralDeclaration_9());
                      			
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
    // InternalRoverml.g:2372:1: ruleAngleUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Radian' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Degree' ) | (enumLiteral_3= '1' ) ) ;
    public final Enumerator ruleAngleUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRoverml.g:2378:2: ( ( (enumLiteral_0= 'Radian' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Degree' ) | (enumLiteral_3= '1' ) ) )
            // InternalRoverml.g:2379:2: ( (enumLiteral_0= 'Radian' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Degree' ) | (enumLiteral_3= '1' ) )
            {
            // InternalRoverml.g:2379:2: ( (enumLiteral_0= 'Radian' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Degree' ) | (enumLiteral_3= '1' ) )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt36=1;
                }
                break;
            case 61:
                {
                alt36=2;
                }
                break;
            case 75:
                {
                alt36=3;
                }
                break;
            case 62:
                {
                alt36=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalRoverml.g:2380:3: (enumLiteral_0= 'Radian' )
                    {
                    // InternalRoverml.g:2380:3: (enumLiteral_0= 'Radian' )
                    // InternalRoverml.g:2381:4: enumLiteral_0= 'Radian'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAngleUnitAccess().getRadianEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAngleUnitAccess().getRadianEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2388:3: (enumLiteral_1= '0' )
                    {
                    // InternalRoverml.g:2388:3: (enumLiteral_1= '0' )
                    // InternalRoverml.g:2389:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAngleUnitAccess().getRadianEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAngleUnitAccess().getRadianEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverml.g:2396:3: (enumLiteral_2= 'Degree' )
                    {
                    // InternalRoverml.g:2396:3: (enumLiteral_2= 'Degree' )
                    // InternalRoverml.g:2397:4: enumLiteral_2= 'Degree'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAngleUnitAccess().getDegreeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAngleUnitAccess().getDegreeEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverml.g:2404:3: (enumLiteral_3= '1' )
                    {
                    // InternalRoverml.g:2404:3: (enumLiteral_3= '1' )
                    // InternalRoverml.g:2405:4: enumLiteral_3= '1'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAngleUnitAccess().getDegreeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getAngleUnitAccess().getDegreeEnumLiteralDeclaration_3());
                      			
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
    // InternalRoverml.g:2415:1: ruleVelocityUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Mm_per_s' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Cm_per_s' ) | (enumLiteral_3= '1' ) ) ;
    public final Enumerator ruleVelocityUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRoverml.g:2421:2: ( ( (enumLiteral_0= 'Mm_per_s' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Cm_per_s' ) | (enumLiteral_3= '1' ) ) )
            // InternalRoverml.g:2422:2: ( (enumLiteral_0= 'Mm_per_s' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Cm_per_s' ) | (enumLiteral_3= '1' ) )
            {
            // InternalRoverml.g:2422:2: ( (enumLiteral_0= 'Mm_per_s' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Cm_per_s' ) | (enumLiteral_3= '1' ) )
            int alt37=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt37=1;
                }
                break;
            case 61:
                {
                alt37=2;
                }
                break;
            case 77:
                {
                alt37=3;
                }
                break;
            case 62:
                {
                alt37=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalRoverml.g:2423:3: (enumLiteral_0= 'Mm_per_s' )
                    {
                    // InternalRoverml.g:2423:3: (enumLiteral_0= 'Mm_per_s' )
                    // InternalRoverml.g:2424:4: enumLiteral_0= 'Mm_per_s'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVelocityUnitAccess().getMm_per_sEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getVelocityUnitAccess().getMm_per_sEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2431:3: (enumLiteral_1= '0' )
                    {
                    // InternalRoverml.g:2431:3: (enumLiteral_1= '0' )
                    // InternalRoverml.g:2432:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVelocityUnitAccess().getMm_per_sEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getVelocityUnitAccess().getMm_per_sEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverml.g:2439:3: (enumLiteral_2= 'Cm_per_s' )
                    {
                    // InternalRoverml.g:2439:3: (enumLiteral_2= 'Cm_per_s' )
                    // InternalRoverml.g:2440:4: enumLiteral_2= 'Cm_per_s'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVelocityUnitAccess().getCm_per_sEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getVelocityUnitAccess().getCm_per_sEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverml.g:2447:3: (enumLiteral_3= '1' )
                    {
                    // InternalRoverml.g:2447:3: (enumLiteral_3= '1' )
                    // InternalRoverml.g:2448:4: enumLiteral_3= '1'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVelocityUnitAccess().getCm_per_sEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getVelocityUnitAccess().getCm_per_sEnumLiteralDeclaration_3());
                      			
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
    // InternalRoverml.g:2458:1: ruleLengthUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Mm' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Cm' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'M' ) | (enumLiteral_5= '2' ) ) ;
    public final Enumerator ruleLengthUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalRoverml.g:2464:2: ( ( (enumLiteral_0= 'Mm' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Cm' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'M' ) | (enumLiteral_5= '2' ) ) )
            // InternalRoverml.g:2465:2: ( (enumLiteral_0= 'Mm' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Cm' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'M' ) | (enumLiteral_5= '2' ) )
            {
            // InternalRoverml.g:2465:2: ( (enumLiteral_0= 'Mm' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Cm' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'M' ) | (enumLiteral_5= '2' ) )
            int alt38=6;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt38=1;
                }
                break;
            case 61:
                {
                alt38=2;
                }
                break;
            case 79:
                {
                alt38=3;
                }
                break;
            case 62:
                {
                alt38=4;
                }
                break;
            case 80:
                {
                alt38=5;
                }
                break;
            case 64:
                {
                alt38=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalRoverml.g:2466:3: (enumLiteral_0= 'Mm' )
                    {
                    // InternalRoverml.g:2466:3: (enumLiteral_0= 'Mm' )
                    // InternalRoverml.g:2467:4: enumLiteral_0= 'Mm'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLengthUnitAccess().getMmEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getLengthUnitAccess().getMmEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2474:3: (enumLiteral_1= '0' )
                    {
                    // InternalRoverml.g:2474:3: (enumLiteral_1= '0' )
                    // InternalRoverml.g:2475:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLengthUnitAccess().getMmEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getLengthUnitAccess().getMmEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverml.g:2482:3: (enumLiteral_2= 'Cm' )
                    {
                    // InternalRoverml.g:2482:3: (enumLiteral_2= 'Cm' )
                    // InternalRoverml.g:2483:4: enumLiteral_2= 'Cm'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLengthUnitAccess().getCmEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getLengthUnitAccess().getCmEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverml.g:2490:3: (enumLiteral_3= '1' )
                    {
                    // InternalRoverml.g:2490:3: (enumLiteral_3= '1' )
                    // InternalRoverml.g:2491:4: enumLiteral_3= '1'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLengthUnitAccess().getCmEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getLengthUnitAccess().getCmEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalRoverml.g:2498:3: (enumLiteral_4= 'M' )
                    {
                    // InternalRoverml.g:2498:3: (enumLiteral_4= 'M' )
                    // InternalRoverml.g:2499:4: enumLiteral_4= 'M'
                    {
                    enumLiteral_4=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLengthUnitAccess().getMEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getLengthUnitAccess().getMEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalRoverml.g:2506:3: (enumLiteral_5= '2' )
                    {
                    // InternalRoverml.g:2506:3: (enumLiteral_5= '2' )
                    // InternalRoverml.g:2507:4: enumLiteral_5= '2'
                    {
                    enumLiteral_5=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLengthUnitAccess().getMEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getLengthUnitAccess().getMEnumLiteralDeclaration_5());
                      			
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
    // InternalRoverml.g:2517:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Smaller' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Equals' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'Greater' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Unequal' ) | (enumLiteral_7= '3' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalRoverml.g:2523:2: ( ( (enumLiteral_0= 'Smaller' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Equals' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'Greater' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Unequal' ) | (enumLiteral_7= '3' ) ) )
            // InternalRoverml.g:2524:2: ( (enumLiteral_0= 'Smaller' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Equals' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'Greater' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Unequal' ) | (enumLiteral_7= '3' ) )
            {
            // InternalRoverml.g:2524:2: ( (enumLiteral_0= 'Smaller' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Equals' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'Greater' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Unequal' ) | (enumLiteral_7= '3' ) )
            int alt39=8;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt39=1;
                }
                break;
            case 61:
                {
                alt39=2;
                }
                break;
            case 82:
                {
                alt39=3;
                }
                break;
            case 62:
                {
                alt39=4;
                }
                break;
            case 83:
                {
                alt39=5;
                }
                break;
            case 64:
                {
                alt39=6;
                }
                break;
            case 84:
                {
                alt39=7;
                }
                break;
            case 66:
                {
                alt39=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalRoverml.g:2525:3: (enumLiteral_0= 'Smaller' )
                    {
                    // InternalRoverml.g:2525:3: (enumLiteral_0= 'Smaller' )
                    // InternalRoverml.g:2526:4: enumLiteral_0= 'Smaller'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getSmallerEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2533:3: (enumLiteral_1= '0' )
                    {
                    // InternalRoverml.g:2533:3: (enumLiteral_1= '0' )
                    // InternalRoverml.g:2534:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getSmallerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getSmallerEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverml.g:2541:3: (enumLiteral_2= 'Equals' )
                    {
                    // InternalRoverml.g:2541:3: (enumLiteral_2= 'Equals' )
                    // InternalRoverml.g:2542:4: enumLiteral_2= 'Equals'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getEqualsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getEqualsEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverml.g:2549:3: (enumLiteral_3= '1' )
                    {
                    // InternalRoverml.g:2549:3: (enumLiteral_3= '1' )
                    // InternalRoverml.g:2550:4: enumLiteral_3= '1'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getEqualsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getEqualsEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalRoverml.g:2557:3: (enumLiteral_4= 'Greater' )
                    {
                    // InternalRoverml.g:2557:3: (enumLiteral_4= 'Greater' )
                    // InternalRoverml.g:2558:4: enumLiteral_4= 'Greater'
                    {
                    enumLiteral_4=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getGreaterEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getGreaterEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalRoverml.g:2565:3: (enumLiteral_5= '2' )
                    {
                    // InternalRoverml.g:2565:3: (enumLiteral_5= '2' )
                    // InternalRoverml.g:2566:4: enumLiteral_5= '2'
                    {
                    enumLiteral_5=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getGreaterEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getGreaterEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalRoverml.g:2573:3: (enumLiteral_6= 'Unequal' )
                    {
                    // InternalRoverml.g:2573:3: (enumLiteral_6= 'Unequal' )
                    // InternalRoverml.g:2574:4: enumLiteral_6= 'Unequal'
                    {
                    enumLiteral_6=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getUnequalEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getComparisonOperatorAccess().getUnequalEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalRoverml.g:2581:3: (enumLiteral_7= '3' )
                    {
                    // InternalRoverml.g:2581:3: (enumLiteral_7= '3' )
                    // InternalRoverml.g:2582:4: enumLiteral_7= '3'
                    {
                    enumLiteral_7=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getUnequalEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getComparisonOperatorAccess().getUnequalEnumLiteralDeclaration_7());
                      			
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
        // InternalRoverml.g:2028:5: ( '.' )
        // InternalRoverml.g:2028:6: '.'
        {
        match(input,56,FOLLOW_2); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0xF000000000080000L,0x000000000000001FL});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0200000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000121C00004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000E200041D84000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000E000040004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x6000000000000000L,0x00000000001E0005L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x002005C000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0300000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x6000000000000000L,0x00000000000003F5L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x6000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x6000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x6000000000000000L,0x000000000001C001L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400010000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0100000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0C00000000000002L});

}
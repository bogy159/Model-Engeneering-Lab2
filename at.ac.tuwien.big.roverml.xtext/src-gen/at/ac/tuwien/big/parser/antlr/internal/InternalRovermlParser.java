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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'roverProgram'", "'command'", "'>'", "'move'", "'{'", "'}'", "'setLightColor'", "'color'", "'rotate'", "'wait'", "'repeat'", "'count'", "'rover'", "'block'", "'transition'", "'triggeredTransition'", "'sensor'", "'operator'", "'comparisonValue'", "'gps'", "'DistanceSensor'", "'Compass'", "'SingleQuantity'", "'value'", "'timeUnit'", "'angleUnit'", "'velocityUnit'", "'light'", "'length'", "'lengthUnit'", "'motor'", "'terminate'", "'component'", "'kind'", "'actuator'", "'DistanceSensorTrigger'", "'GpsTrigger'", "'CompassTrigger'", "'quantity'", "'position'", "'x'", "'y'", "'.'", "'-'", "'E'", "'e'", "'None'", "'0'", "'1'", "'Green'", "'2'", "'Blue'", "'3'", "'Yellow'", "'4'", "'Ns'", "'Ms'", "'S'", "'Min'", "'H'", "'Radian'", "'Degree'", "'Mm_per_s'", "'Cm_per_s'", "'Mm'", "'Cm'", "'M'", "'Smaller'", "'Equals'", "'Greater'", "'Unequal'"
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
        	return "NamedElement";
       	}

       	@Override
       	protected RovermlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNamedElement"
    // InternalRoverml.g:65:1: entryRuleNamedElement returns [EObject current=null] : iv_ruleNamedElement= ruleNamedElement EOF ;
    public final EObject entryRuleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedElement = null;


        try {
            // InternalRoverml.g:65:53: (iv_ruleNamedElement= ruleNamedElement EOF )
            // InternalRoverml.g:66:2: iv_ruleNamedElement= ruleNamedElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNamedElement=ruleNamedElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedElement; 
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
    // $ANTLR end "entryRuleNamedElement"


    // $ANTLR start "ruleNamedElement"
    // InternalRoverml.g:72:1: ruleNamedElement returns [EObject current=null] : (this_Rover_0= ruleRover | this_RoverProgram_1= ruleRoverProgram | this_Component_2= ruleComponent | this_Command_3= ruleCommand ) ;
    public final EObject ruleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject this_Rover_0 = null;

        EObject this_RoverProgram_1 = null;

        EObject this_Component_2 = null;

        EObject this_Command_3 = null;



        	enterRule();

        try {
            // InternalRoverml.g:78:2: ( (this_Rover_0= ruleRover | this_RoverProgram_1= ruleRoverProgram | this_Component_2= ruleComponent | this_Command_3= ruleCommand ) )
            // InternalRoverml.g:79:2: (this_Rover_0= ruleRover | this_RoverProgram_1= ruleRoverProgram | this_Component_2= ruleComponent | this_Command_3= ruleCommand )
            {
            // InternalRoverml.g:79:2: (this_Rover_0= ruleRover | this_RoverProgram_1= ruleRoverProgram | this_Component_2= ruleComponent | this_Command_3= ruleCommand )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt1=1;
                }
                break;
            case 11:
                {
                alt1=2;
                }
                break;
            case 30:
            case 31:
            case 32:
            case 38:
            case 41:
                {
                alt1=3;
                }
                break;
            case 14:
            case 17:
            case 19:
            case 20:
            case 21:
            case 42:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRoverml.g:80:3: this_Rover_0= ruleRover
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNamedElementAccess().getRoverParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Rover_0=ruleRover();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Rover_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRoverml.g:89:3: this_RoverProgram_1= ruleRoverProgram
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNamedElementAccess().getRoverProgramParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RoverProgram_1=ruleRoverProgram();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RoverProgram_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalRoverml.g:98:3: this_Component_2= ruleComponent
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNamedElementAccess().getComponentParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Component_2=ruleComponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Component_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalRoverml.g:107:3: this_Command_3= ruleCommand
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNamedElementAccess().getCommandParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Command_3=ruleCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Command_3;
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
    // $ANTLR end "ruleNamedElement"


    // $ANTLR start "entryRuleRoverProgram"
    // InternalRoverml.g:119:1: entryRuleRoverProgram returns [EObject current=null] : iv_ruleRoverProgram= ruleRoverProgram EOF ;
    public final EObject entryRuleRoverProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoverProgram = null;


        try {
            // InternalRoverml.g:119:53: (iv_ruleRoverProgram= ruleRoverProgram EOF )
            // InternalRoverml.g:120:2: iv_ruleRoverProgram= ruleRoverProgram EOF
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
    // InternalRoverml.g:126:1: ruleRoverProgram returns [EObject current=null] : ( () otherlv_1= 'roverProgram' ( (lv_block_2_0= ruleBlock ) ) ) ;
    public final EObject ruleRoverProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:132:2: ( ( () otherlv_1= 'roverProgram' ( (lv_block_2_0= ruleBlock ) ) ) )
            // InternalRoverml.g:133:2: ( () otherlv_1= 'roverProgram' ( (lv_block_2_0= ruleBlock ) ) )
            {
            // InternalRoverml.g:133:2: ( () otherlv_1= 'roverProgram' ( (lv_block_2_0= ruleBlock ) ) )
            // InternalRoverml.g:134:3: () otherlv_1= 'roverProgram' ( (lv_block_2_0= ruleBlock ) )
            {
            // InternalRoverml.g:134:3: ()
            // InternalRoverml.g:135:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRoverProgramAccess().getRoverProgramAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRoverProgramAccess().getRoverProgramKeyword_1());
              		
            }
            // InternalRoverml.g:145:3: ( (lv_block_2_0= ruleBlock ) )
            // InternalRoverml.g:146:4: (lv_block_2_0= ruleBlock )
            {
            // InternalRoverml.g:146:4: (lv_block_2_0= ruleBlock )
            // InternalRoverml.g:147:5: lv_block_2_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRoverProgramAccess().getBlockBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_2_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRoverProgramRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_2_0,
              						"at.ac.tuwien.big.Roverml.Block");
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
    // $ANTLR end "ruleRoverProgram"


    // $ANTLR start "entryRuleCommand"
    // InternalRoverml.g:168:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalRoverml.g:168:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalRoverml.g:169:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalRoverml.g:175:1: ruleCommand returns [EObject current=null] : (this_Move_0= ruleMove | this_Rotate_1= ruleRotate | this_Wait_2= ruleWait | this_SetLightColor_3= ruleSetLightColor | this_Terminate_4= ruleTerminate | (this_Repeat_5= ruleRepeat otherlv_6= 'command' ( ( ruleQualifiedName ) ) otherlv_8= '>' ( ( ruleQualifiedName ) ) ) ) ;
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
            // InternalRoverml.g:181:2: ( (this_Move_0= ruleMove | this_Rotate_1= ruleRotate | this_Wait_2= ruleWait | this_SetLightColor_3= ruleSetLightColor | this_Terminate_4= ruleTerminate | (this_Repeat_5= ruleRepeat otherlv_6= 'command' ( ( ruleQualifiedName ) ) otherlv_8= '>' ( ( ruleQualifiedName ) ) ) ) )
            // InternalRoverml.g:182:2: (this_Move_0= ruleMove | this_Rotate_1= ruleRotate | this_Wait_2= ruleWait | this_SetLightColor_3= ruleSetLightColor | this_Terminate_4= ruleTerminate | (this_Repeat_5= ruleRepeat otherlv_6= 'command' ( ( ruleQualifiedName ) ) otherlv_8= '>' ( ( ruleQualifiedName ) ) ) )
            {
            // InternalRoverml.g:182:2: (this_Move_0= ruleMove | this_Rotate_1= ruleRotate | this_Wait_2= ruleWait | this_SetLightColor_3= ruleSetLightColor | this_Terminate_4= ruleTerminate | (this_Repeat_5= ruleRepeat otherlv_6= 'command' ( ( ruleQualifiedName ) ) otherlv_8= '>' ( ( ruleQualifiedName ) ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 42:
                {
                alt2=5;
                }
                break;
            case 21:
                {
                alt2=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRoverml.g:183:3: this_Move_0= ruleMove
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
                    // InternalRoverml.g:192:3: this_Rotate_1= ruleRotate
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
                    // InternalRoverml.g:201:3: this_Wait_2= ruleWait
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
                    // InternalRoverml.g:210:3: this_SetLightColor_3= ruleSetLightColor
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
                    // InternalRoverml.g:219:3: this_Terminate_4= ruleTerminate
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
                    // InternalRoverml.g:228:3: (this_Repeat_5= ruleRepeat otherlv_6= 'command' ( ( ruleQualifiedName ) ) otherlv_8= '>' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalRoverml.g:228:3: (this_Repeat_5= ruleRepeat otherlv_6= 'command' ( ( ruleQualifiedName ) ) otherlv_8= '>' ( ( ruleQualifiedName ) ) )
                    // InternalRoverml.g:229:4: this_Repeat_5= ruleRepeat otherlv_6= 'command' ( ( ruleQualifiedName ) ) otherlv_8= '>' ( ( ruleQualifiedName ) )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCommandAccess().getRepeatParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_Repeat_5=ruleRepeat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Repeat_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_6=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCommandAccess().getCommandKeyword_5_1());
                      			
                    }
                    // InternalRoverml.g:241:4: ( ( ruleQualifiedName ) )
                    // InternalRoverml.g:242:5: ( ruleQualifiedName )
                    {
                    // InternalRoverml.g:242:5: ( ruleQualifiedName )
                    // InternalRoverml.g:243:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCommandRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCommandAccess().getIncomingTransitionCrossReference_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getCommandAccess().getGreaterThanSignKeyword_5_3());
                      			
                    }
                    // InternalRoverml.g:261:4: ( ( ruleQualifiedName ) )
                    // InternalRoverml.g:262:5: ( ruleQualifiedName )
                    {
                    // InternalRoverml.g:262:5: ( ruleQualifiedName )
                    // InternalRoverml.g:263:6: ruleQualifiedName
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
    // InternalRoverml.g:282:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalRoverml.g:282:45: (iv_ruleMove= ruleMove EOF )
            // InternalRoverml.g:283:2: iv_ruleMove= ruleMove EOF
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
    // InternalRoverml.g:289:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' otherlv_1= '{' ( (lv_speed_2_0= ruleVelocity ) ) ( (lv_distance_3_0= ruleLength ) ) otherlv_4= '}' ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_speed_2_0 = null;

        EObject lv_distance_3_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:295:2: ( (otherlv_0= 'move' otherlv_1= '{' ( (lv_speed_2_0= ruleVelocity ) ) ( (lv_distance_3_0= ruleLength ) ) otherlv_4= '}' ) )
            // InternalRoverml.g:296:2: (otherlv_0= 'move' otherlv_1= '{' ( (lv_speed_2_0= ruleVelocity ) ) ( (lv_distance_3_0= ruleLength ) ) otherlv_4= '}' )
            {
            // InternalRoverml.g:296:2: (otherlv_0= 'move' otherlv_1= '{' ( (lv_speed_2_0= ruleVelocity ) ) ( (lv_distance_3_0= ruleLength ) ) otherlv_4= '}' )
            // InternalRoverml.g:297:3: otherlv_0= 'move' otherlv_1= '{' ( (lv_speed_2_0= ruleVelocity ) ) ( (lv_distance_3_0= ruleLength ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRoverml.g:305:3: ( (lv_speed_2_0= ruleVelocity ) )
            // InternalRoverml.g:306:4: (lv_speed_2_0= ruleVelocity )
            {
            // InternalRoverml.g:306:4: (lv_speed_2_0= ruleVelocity )
            // InternalRoverml.g:307:5: lv_speed_2_0= ruleVelocity
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMoveAccess().getSpeedVelocityParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_9);
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

            // InternalRoverml.g:324:3: ( (lv_distance_3_0= ruleLength ) )
            // InternalRoverml.g:325:4: (lv_distance_3_0= ruleLength )
            {
            // InternalRoverml.g:325:4: (lv_distance_3_0= ruleLength )
            // InternalRoverml.g:326:5: lv_distance_3_0= ruleLength
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMoveAccess().getDistanceLengthParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:351:1: entryRuleSetLightColor returns [EObject current=null] : iv_ruleSetLightColor= ruleSetLightColor EOF ;
    public final EObject entryRuleSetLightColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLightColor = null;


        try {
            // InternalRoverml.g:351:54: (iv_ruleSetLightColor= ruleSetLightColor EOF )
            // InternalRoverml.g:352:2: iv_ruleSetLightColor= ruleSetLightColor EOF
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
    // InternalRoverml.g:358:1: ruleSetLightColor returns [EObject current=null] : (otherlv_0= 'setLightColor' otherlv_1= '{' otherlv_2= 'color' ( (lv_color_3_0= ruleColor ) ) ( ( ruleQualifiedName ) ) otherlv_5= '}' ) ;
    public final EObject ruleSetLightColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Enumerator lv_color_3_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:364:2: ( (otherlv_0= 'setLightColor' otherlv_1= '{' otherlv_2= 'color' ( (lv_color_3_0= ruleColor ) ) ( ( ruleQualifiedName ) ) otherlv_5= '}' ) )
            // InternalRoverml.g:365:2: (otherlv_0= 'setLightColor' otherlv_1= '{' otherlv_2= 'color' ( (lv_color_3_0= ruleColor ) ) ( ( ruleQualifiedName ) ) otherlv_5= '}' )
            {
            // InternalRoverml.g:365:2: (otherlv_0= 'setLightColor' otherlv_1= '{' otherlv_2= 'color' ( (lv_color_3_0= ruleColor ) ) ( ( ruleQualifiedName ) ) otherlv_5= '}' )
            // InternalRoverml.g:366:3: otherlv_0= 'setLightColor' otherlv_1= '{' otherlv_2= 'color' ( (lv_color_3_0= ruleColor ) ) ( ( ruleQualifiedName ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSetLightColorAccess().getSetLightColorKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSetLightColorAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSetLightColorAccess().getColorKeyword_2());
              		
            }
            // InternalRoverml.g:378:3: ( (lv_color_3_0= ruleColor ) )
            // InternalRoverml.g:379:4: (lv_color_3_0= ruleColor )
            {
            // InternalRoverml.g:379:4: (lv_color_3_0= ruleColor )
            // InternalRoverml.g:380:5: lv_color_3_0= ruleColor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSetLightColorAccess().getColorColorEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_5);
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

            // InternalRoverml.g:397:3: ( ( ruleQualifiedName ) )
            // InternalRoverml.g:398:4: ( ruleQualifiedName )
            {
            // InternalRoverml.g:398:4: ( ruleQualifiedName )
            // InternalRoverml.g:399:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSetLightColorRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSetLightColorAccess().getLightsLightCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:421:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalRoverml.g:421:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalRoverml.g:422:2: iv_ruleRotate= ruleRotate EOF
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
    // InternalRoverml.g:428:1: ruleRotate returns [EObject current=null] : (otherlv_0= 'rotate' otherlv_1= '{' ( (lv_angle_2_0= ruleAngle ) ) otherlv_3= '}' ) ;
    public final EObject ruleRotate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_angle_2_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:434:2: ( (otherlv_0= 'rotate' otherlv_1= '{' ( (lv_angle_2_0= ruleAngle ) ) otherlv_3= '}' ) )
            // InternalRoverml.g:435:2: (otherlv_0= 'rotate' otherlv_1= '{' ( (lv_angle_2_0= ruleAngle ) ) otherlv_3= '}' )
            {
            // InternalRoverml.g:435:2: (otherlv_0= 'rotate' otherlv_1= '{' ( (lv_angle_2_0= ruleAngle ) ) otherlv_3= '}' )
            // InternalRoverml.g:436:3: otherlv_0= 'rotate' otherlv_1= '{' ( (lv_angle_2_0= ruleAngle ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRotateAccess().getRotateKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRoverml.g:444:3: ( (lv_angle_2_0= ruleAngle ) )
            // InternalRoverml.g:445:4: (lv_angle_2_0= ruleAngle )
            {
            // InternalRoverml.g:445:4: (lv_angle_2_0= ruleAngle )
            // InternalRoverml.g:446:5: lv_angle_2_0= ruleAngle
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRotateAccess().getAngleAngleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            otherlv_3=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:471:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalRoverml.g:471:45: (iv_ruleWait= ruleWait EOF )
            // InternalRoverml.g:472:2: iv_ruleWait= ruleWait EOF
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
    // InternalRoverml.g:478:1: ruleWait returns [EObject current=null] : (otherlv_0= 'wait' otherlv_1= '{' ( (lv_duration_2_0= ruleTime ) ) otherlv_3= '}' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_duration_2_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:484:2: ( (otherlv_0= 'wait' otherlv_1= '{' ( (lv_duration_2_0= ruleTime ) ) otherlv_3= '}' ) )
            // InternalRoverml.g:485:2: (otherlv_0= 'wait' otherlv_1= '{' ( (lv_duration_2_0= ruleTime ) ) otherlv_3= '}' )
            {
            // InternalRoverml.g:485:2: (otherlv_0= 'wait' otherlv_1= '{' ( (lv_duration_2_0= ruleTime ) ) otherlv_3= '}' )
            // InternalRoverml.g:486:3: otherlv_0= 'wait' otherlv_1= '{' ( (lv_duration_2_0= ruleTime ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWaitAccess().getWaitKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRoverml.g:494:3: ( (lv_duration_2_0= ruleTime ) )
            // InternalRoverml.g:495:4: (lv_duration_2_0= ruleTime )
            {
            // InternalRoverml.g:495:4: (lv_duration_2_0= ruleTime )
            // InternalRoverml.g:496:5: lv_duration_2_0= ruleTime
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWaitAccess().getDurationTimeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            otherlv_3=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:521:1: entryRuleRepeat returns [EObject current=null] : iv_ruleRepeat= ruleRepeat EOF ;
    public final EObject entryRuleRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeat = null;


        try {
            // InternalRoverml.g:521:47: (iv_ruleRepeat= ruleRepeat EOF )
            // InternalRoverml.g:522:2: iv_ruleRepeat= ruleRepeat EOF
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
    // InternalRoverml.g:528:1: ruleRepeat returns [EObject current=null] : ( () otherlv_1= 'repeat' otherlv_2= '{' otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) otherlv_5= '}' ) ;
    public final EObject ruleRepeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_count_4_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:534:2: ( ( () otherlv_1= 'repeat' otherlv_2= '{' otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) otherlv_5= '}' ) )
            // InternalRoverml.g:535:2: ( () otherlv_1= 'repeat' otherlv_2= '{' otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) otherlv_5= '}' )
            {
            // InternalRoverml.g:535:2: ( () otherlv_1= 'repeat' otherlv_2= '{' otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) otherlv_5= '}' )
            // InternalRoverml.g:536:3: () otherlv_1= 'repeat' otherlv_2= '{' otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) otherlv_5= '}'
            {
            // InternalRoverml.g:536:3: ()
            // InternalRoverml.g:537:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRepeatAccess().getRepeatAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRepeatAccess().getRepeatKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRepeatAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,22,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRepeatAccess().getCountKeyword_3());
              		
            }
            // InternalRoverml.g:555:3: ( (lv_count_4_0= ruleEInt ) )
            // InternalRoverml.g:556:4: (lv_count_4_0= ruleEInt )
            {
            // InternalRoverml.g:556:4: (lv_count_4_0= ruleEInt )
            // InternalRoverml.g:557:5: lv_count_4_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRepeatAccess().getCountEIntParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:582:1: entryRuleRover returns [EObject current=null] : iv_ruleRover= ruleRover EOF ;
    public final EObject entryRuleRover() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRover = null;


        try {
            // InternalRoverml.g:582:46: (iv_ruleRover= ruleRover EOF )
            // InternalRoverml.g:583:2: iv_ruleRover= ruleRover EOF
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
    // InternalRoverml.g:589:1: ruleRover returns [EObject current=null] : ( () otherlv_1= 'rover' ( (lv_components_2_0= ruleComponent ) )* ) ;
    public final EObject ruleRover() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_components_2_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:595:2: ( ( () otherlv_1= 'rover' ( (lv_components_2_0= ruleComponent ) )* ) )
            // InternalRoverml.g:596:2: ( () otherlv_1= 'rover' ( (lv_components_2_0= ruleComponent ) )* )
            {
            // InternalRoverml.g:596:2: ( () otherlv_1= 'rover' ( (lv_components_2_0= ruleComponent ) )* )
            // InternalRoverml.g:597:3: () otherlv_1= 'rover' ( (lv_components_2_0= ruleComponent ) )*
            {
            // InternalRoverml.g:597:3: ()
            // InternalRoverml.g:598:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRoverAccess().getRoverAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRoverAccess().getRoverKeyword_1());
              		
            }
            // InternalRoverml.g:608:3: ( (lv_components_2_0= ruleComponent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=30 && LA3_0<=32)||LA3_0==38||LA3_0==41) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRoverml.g:609:4: (lv_components_2_0= ruleComponent )
            	    {
            	    // InternalRoverml.g:609:4: (lv_components_2_0= ruleComponent )
            	    // InternalRoverml.g:610:5: lv_components_2_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRoverAccess().getComponentsComponentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_components_2_0=ruleComponent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRoverRule());
            	      					}
            	      					add(
            	      						current,
            	      						"components",
            	      						lv_components_2_0,
            	      						"at.ac.tuwien.big.Roverml.Component");
            	      					afterParserOrEnumRuleCall();
            	      				
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
    // InternalRoverml.g:631:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalRoverml.g:631:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalRoverml.g:632:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalRoverml.g:638:1: ruleBlock returns [EObject current=null] : (this_Repeat_0= ruleRepeat | ( () otherlv_2= 'block' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' ) ) ;
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
            // InternalRoverml.g:644:2: ( (this_Repeat_0= ruleRepeat | ( () otherlv_2= 'block' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' ) ) )
            // InternalRoverml.g:645:2: (this_Repeat_0= ruleRepeat | ( () otherlv_2= 'block' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' ) )
            {
            // InternalRoverml.g:645:2: (this_Repeat_0= ruleRepeat | ( () otherlv_2= 'block' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoverml.g:646:3: this_Repeat_0= ruleRepeat
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
                    // InternalRoverml.g:655:3: ( () otherlv_2= 'block' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )
                    {
                    // InternalRoverml.g:655:3: ( () otherlv_2= 'block' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )
                    // InternalRoverml.g:656:4: () otherlv_2= 'block' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}'
                    {
                    // InternalRoverml.g:656:4: ()
                    // InternalRoverml.g:657:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBlockAccess().getBlockAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getBlockKeyword_1_1());
                      			
                    }
                    otherlv_3=(Token)match(input,15,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1_2());
                      			
                    }
                    // InternalRoverml.g:671:4: ( (lv_commands_4_0= ruleCommand ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14||LA4_0==17||(LA4_0>=19 && LA4_0<=21)||LA4_0==42) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRoverml.g:672:5: (lv_commands_4_0= ruleCommand )
                    	    {
                    	    // InternalRoverml.g:672:5: (lv_commands_4_0= ruleCommand )
                    	    // InternalRoverml.g:673:6: lv_commands_4_0= ruleCommand
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getBlockAccess().getCommandsCommandParserRuleCall_1_3_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_18);
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
                    	    break loop4;
                        }
                    } while (true);

                    // InternalRoverml.g:690:4: ( (lv_transitions_5_0= ruleTransition ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==25||(LA5_0>=46 && LA5_0<=48)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRoverml.g:691:5: (lv_transitions_5_0= ruleTransition )
                    	    {
                    	    // InternalRoverml.g:691:5: (lv_transitions_5_0= ruleTransition )
                    	    // InternalRoverml.g:692:6: lv_transitions_5_0= ruleTransition
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getBlockAccess().getTransitionsTransitionParserRuleCall_1_4_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_19);
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
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:718:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalRoverml.g:718:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalRoverml.g:719:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalRoverml.g:725:1: ruleTransition returns [EObject current=null] : (this_TriggeredTransition_0= ruleTriggeredTransition | ( () otherlv_2= 'transition' ( ( ruleQualifiedName ) ) otherlv_4= '>' ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_TriggeredTransition_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:731:2: ( (this_TriggeredTransition_0= ruleTriggeredTransition | ( () otherlv_2= 'transition' ( ( ruleQualifiedName ) ) otherlv_4= '>' ( ( ruleQualifiedName ) ) ) ) )
            // InternalRoverml.g:732:2: (this_TriggeredTransition_0= ruleTriggeredTransition | ( () otherlv_2= 'transition' ( ( ruleQualifiedName ) ) otherlv_4= '>' ( ( ruleQualifiedName ) ) ) )
            {
            // InternalRoverml.g:732:2: (this_TriggeredTransition_0= ruleTriggeredTransition | ( () otherlv_2= 'transition' ( ( ruleQualifiedName ) ) otherlv_4= '>' ( ( ruleQualifiedName ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=46 && LA7_0<=48)) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRoverml.g:733:3: this_TriggeredTransition_0= ruleTriggeredTransition
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
                    // InternalRoverml.g:742:3: ( () otherlv_2= 'transition' ( ( ruleQualifiedName ) ) otherlv_4= '>' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalRoverml.g:742:3: ( () otherlv_2= 'transition' ( ( ruleQualifiedName ) ) otherlv_4= '>' ( ( ruleQualifiedName ) ) )
                    // InternalRoverml.g:743:4: () otherlv_2= 'transition' ( ( ruleQualifiedName ) ) otherlv_4= '>' ( ( ruleQualifiedName ) )
                    {
                    // InternalRoverml.g:743:4: ()
                    // InternalRoverml.g:744:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTransitionAccess().getTransitionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getTransitionKeyword_1_1());
                      			
                    }
                    // InternalRoverml.g:754:4: ( ( ruleQualifiedName ) )
                    // InternalRoverml.g:755:5: ( ruleQualifiedName )
                    {
                    // InternalRoverml.g:755:5: ( ruleQualifiedName )
                    // InternalRoverml.g:756:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTransitionRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTransitionAccess().getSourceCommandCrossReference_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getGreaterThanSignKeyword_1_3());
                      			
                    }
                    // InternalRoverml.g:774:4: ( ( ruleQualifiedName ) )
                    // InternalRoverml.g:775:5: ( ruleQualifiedName )
                    {
                    // InternalRoverml.g:775:5: ( ruleQualifiedName )
                    // InternalRoverml.g:776:6: ruleQualifiedName
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
    // InternalRoverml.g:795:1: entryRuleTriggeredTransition returns [EObject current=null] : iv_ruleTriggeredTransition= ruleTriggeredTransition EOF ;
    public final EObject entryRuleTriggeredTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggeredTransition = null;


        try {
            // InternalRoverml.g:795:60: (iv_ruleTriggeredTransition= ruleTriggeredTransition EOF )
            // InternalRoverml.g:796:2: iv_ruleTriggeredTransition= ruleTriggeredTransition EOF
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
    // InternalRoverml.g:802:1: ruleTriggeredTransition returns [EObject current=null] : (this_DistanceSensorTrigger_0= ruleDistanceSensorTrigger | this_GpsTrigger_1= ruleGpsTrigger | (this_CompassTrigger_2= ruleCompassTrigger otherlv_3= 'triggeredTransition' (otherlv_4= 'sensor' ( ( ruleQualifiedName ) ) )? otherlv_6= 'operator' ( (lv_operator_7_0= ruleComparisonOperator ) ) (otherlv_8= 'comparisonValue' ( (lv_comparisonValue_9_0= ruleQuantity ) ) )? ) ) ;
    public final EObject ruleTriggeredTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_DistanceSensorTrigger_0 = null;

        EObject this_GpsTrigger_1 = null;

        EObject this_CompassTrigger_2 = null;

        Enumerator lv_operator_7_0 = null;

        EObject lv_comparisonValue_9_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:808:2: ( (this_DistanceSensorTrigger_0= ruleDistanceSensorTrigger | this_GpsTrigger_1= ruleGpsTrigger | (this_CompassTrigger_2= ruleCompassTrigger otherlv_3= 'triggeredTransition' (otherlv_4= 'sensor' ( ( ruleQualifiedName ) ) )? otherlv_6= 'operator' ( (lv_operator_7_0= ruleComparisonOperator ) ) (otherlv_8= 'comparisonValue' ( (lv_comparisonValue_9_0= ruleQuantity ) ) )? ) ) )
            // InternalRoverml.g:809:2: (this_DistanceSensorTrigger_0= ruleDistanceSensorTrigger | this_GpsTrigger_1= ruleGpsTrigger | (this_CompassTrigger_2= ruleCompassTrigger otherlv_3= 'triggeredTransition' (otherlv_4= 'sensor' ( ( ruleQualifiedName ) ) )? otherlv_6= 'operator' ( (lv_operator_7_0= ruleComparisonOperator ) ) (otherlv_8= 'comparisonValue' ( (lv_comparisonValue_9_0= ruleQuantity ) ) )? ) )
            {
            // InternalRoverml.g:809:2: (this_DistanceSensorTrigger_0= ruleDistanceSensorTrigger | this_GpsTrigger_1= ruleGpsTrigger | (this_CompassTrigger_2= ruleCompassTrigger otherlv_3= 'triggeredTransition' (otherlv_4= 'sensor' ( ( ruleQualifiedName ) ) )? otherlv_6= 'operator' ( (lv_operator_7_0= ruleComparisonOperator ) ) (otherlv_8= 'comparisonValue' ( (lv_comparisonValue_9_0= ruleQuantity ) ) )? ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt10=1;
                }
                break;
            case 47:
                {
                alt10=2;
                }
                break;
            case 48:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRoverml.g:810:3: this_DistanceSensorTrigger_0= ruleDistanceSensorTrigger
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
                    // InternalRoverml.g:819:3: this_GpsTrigger_1= ruleGpsTrigger
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
                    // InternalRoverml.g:828:3: (this_CompassTrigger_2= ruleCompassTrigger otherlv_3= 'triggeredTransition' (otherlv_4= 'sensor' ( ( ruleQualifiedName ) ) )? otherlv_6= 'operator' ( (lv_operator_7_0= ruleComparisonOperator ) ) (otherlv_8= 'comparisonValue' ( (lv_comparisonValue_9_0= ruleQuantity ) ) )? )
                    {
                    // InternalRoverml.g:828:3: (this_CompassTrigger_2= ruleCompassTrigger otherlv_3= 'triggeredTransition' (otherlv_4= 'sensor' ( ( ruleQualifiedName ) ) )? otherlv_6= 'operator' ( (lv_operator_7_0= ruleComparisonOperator ) ) (otherlv_8= 'comparisonValue' ( (lv_comparisonValue_9_0= ruleQuantity ) ) )? )
                    // InternalRoverml.g:829:4: this_CompassTrigger_2= ruleCompassTrigger otherlv_3= 'triggeredTransition' (otherlv_4= 'sensor' ( ( ruleQualifiedName ) ) )? otherlv_6= 'operator' ( (lv_operator_7_0= ruleComparisonOperator ) ) (otherlv_8= 'comparisonValue' ( (lv_comparisonValue_9_0= ruleQuantity ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTriggeredTransitionAccess().getCompassTriggerParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_20);
                    this_CompassTrigger_2=ruleCompassTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_CompassTrigger_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,26,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTriggeredTransitionAccess().getTriggeredTransitionKeyword_2_1());
                      			
                    }
                    // InternalRoverml.g:841:4: (otherlv_4= 'sensor' ( ( ruleQualifiedName ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==27) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRoverml.g:842:5: otherlv_4= 'sensor' ( ( ruleQualifiedName ) )
                            {
                            otherlv_4=(Token)match(input,27,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getTriggeredTransitionAccess().getSensorKeyword_2_2_0());
                              				
                            }
                            // InternalRoverml.g:846:5: ( ( ruleQualifiedName ) )
                            // InternalRoverml.g:847:6: ( ruleQualifiedName )
                            {
                            // InternalRoverml.g:847:6: ( ruleQualifiedName )
                            // InternalRoverml.g:848:7: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTriggeredTransitionRule());
                              							}
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTriggeredTransitionAccess().getSensorSensorCrossReference_2_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_22);
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

                    otherlv_6=(Token)match(input,28,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getTriggeredTransitionAccess().getOperatorKeyword_2_3());
                      			
                    }
                    // InternalRoverml.g:867:4: ( (lv_operator_7_0= ruleComparisonOperator ) )
                    // InternalRoverml.g:868:5: (lv_operator_7_0= ruleComparisonOperator )
                    {
                    // InternalRoverml.g:868:5: (lv_operator_7_0= ruleComparisonOperator )
                    // InternalRoverml.g:869:6: lv_operator_7_0= ruleComparisonOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTriggeredTransitionAccess().getOperatorComparisonOperatorEnumRuleCall_2_4_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_operator_7_0=ruleComparisonOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTriggeredTransitionRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_7_0,
                      							"at.ac.tuwien.big.Roverml.ComparisonOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalRoverml.g:886:4: (otherlv_8= 'comparisonValue' ( (lv_comparisonValue_9_0= ruleQuantity ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==29) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRoverml.g:887:5: otherlv_8= 'comparisonValue' ( (lv_comparisonValue_9_0= ruleQuantity ) )
                            {
                            otherlv_8=(Token)match(input,29,FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getTriggeredTransitionAccess().getComparisonValueKeyword_2_5_0());
                              				
                            }
                            // InternalRoverml.g:891:5: ( (lv_comparisonValue_9_0= ruleQuantity ) )
                            // InternalRoverml.g:892:6: (lv_comparisonValue_9_0= ruleQuantity )
                            {
                            // InternalRoverml.g:892:6: (lv_comparisonValue_9_0= ruleQuantity )
                            // InternalRoverml.g:893:7: lv_comparisonValue_9_0= ruleQuantity
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTriggeredTransitionAccess().getComparisonValueQuantityParserRuleCall_2_5_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_comparisonValue_9_0=ruleQuantity();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTriggeredTransitionRule());
                              							}
                              							set(
                              								current,
                              								"comparisonValue",
                              								lv_comparisonValue_9_0,
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
    // InternalRoverml.g:916:1: entryRuleGPS returns [EObject current=null] : iv_ruleGPS= ruleGPS EOF ;
    public final EObject entryRuleGPS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGPS = null;


        try {
            // InternalRoverml.g:916:44: (iv_ruleGPS= ruleGPS EOF )
            // InternalRoverml.g:917:2: iv_ruleGPS= ruleGPS EOF
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
    // InternalRoverml.g:923:1: ruleGPS returns [EObject current=null] : ( () otherlv_1= 'gps' ) ;
    public final EObject ruleGPS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:929:2: ( ( () otherlv_1= 'gps' ) )
            // InternalRoverml.g:930:2: ( () otherlv_1= 'gps' )
            {
            // InternalRoverml.g:930:2: ( () otherlv_1= 'gps' )
            // InternalRoverml.g:931:3: () otherlv_1= 'gps'
            {
            // InternalRoverml.g:931:3: ()
            // InternalRoverml.g:932:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGPSAccess().getGPSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGPSAccess().getGpsKeyword_1());
              		
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
    // InternalRoverml.g:946:1: entryRuleDistanceSensor returns [EObject current=null] : iv_ruleDistanceSensor= ruleDistanceSensor EOF ;
    public final EObject entryRuleDistanceSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceSensor = null;


        try {
            // InternalRoverml.g:946:55: (iv_ruleDistanceSensor= ruleDistanceSensor EOF )
            // InternalRoverml.g:947:2: iv_ruleDistanceSensor= ruleDistanceSensor EOF
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
    // InternalRoverml.g:953:1: ruleDistanceSensor returns [EObject current=null] : ( () otherlv_1= 'DistanceSensor' ) ;
    public final EObject ruleDistanceSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:959:2: ( ( () otherlv_1= 'DistanceSensor' ) )
            // InternalRoverml.g:960:2: ( () otherlv_1= 'DistanceSensor' )
            {
            // InternalRoverml.g:960:2: ( () otherlv_1= 'DistanceSensor' )
            // InternalRoverml.g:961:3: () otherlv_1= 'DistanceSensor'
            {
            // InternalRoverml.g:961:3: ()
            // InternalRoverml.g:962:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDistanceSensorAccess().getDistanceSensorAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDistanceSensorAccess().getDistanceSensorKeyword_1());
              		
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
    // InternalRoverml.g:976:1: entryRuleCompass returns [EObject current=null] : iv_ruleCompass= ruleCompass EOF ;
    public final EObject entryRuleCompass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompass = null;


        try {
            // InternalRoverml.g:976:48: (iv_ruleCompass= ruleCompass EOF )
            // InternalRoverml.g:977:2: iv_ruleCompass= ruleCompass EOF
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
    // InternalRoverml.g:983:1: ruleCompass returns [EObject current=null] : ( () otherlv_1= 'Compass' ) ;
    public final EObject ruleCompass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:989:2: ( ( () otherlv_1= 'Compass' ) )
            // InternalRoverml.g:990:2: ( () otherlv_1= 'Compass' )
            {
            // InternalRoverml.g:990:2: ( () otherlv_1= 'Compass' )
            // InternalRoverml.g:991:3: () otherlv_1= 'Compass'
            {
            // InternalRoverml.g:991:3: ()
            // InternalRoverml.g:992:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCompassAccess().getCompassAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCompassAccess().getCompassKeyword_1());
              		
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
    // InternalRoverml.g:1006:1: entryRuleSingleQuantity returns [EObject current=null] : iv_ruleSingleQuantity= ruleSingleQuantity EOF ;
    public final EObject entryRuleSingleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleQuantity = null;


        try {
            // InternalRoverml.g:1006:55: (iv_ruleSingleQuantity= ruleSingleQuantity EOF )
            // InternalRoverml.g:1007:2: iv_ruleSingleQuantity= ruleSingleQuantity EOF
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
    // InternalRoverml.g:1013:1: ruleSingleQuantity returns [EObject current=null] : (this_Time_0= ruleTime | this_Velocity_1= ruleVelocity | this_Angle_2= ruleAngle | (this_Length_3= ruleLength otherlv_4= 'SingleQuantity' otherlv_5= '{' otherlv_6= 'value' ( (lv_value_7_0= ruleEFloat ) ) otherlv_8= '}' ) ) ;
    public final EObject ruleSingleQuantity() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_Time_0 = null;

        EObject this_Velocity_1 = null;

        EObject this_Angle_2 = null;

        EObject this_Length_3 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1019:2: ( (this_Time_0= ruleTime | this_Velocity_1= ruleVelocity | this_Angle_2= ruleAngle | (this_Length_3= ruleLength otherlv_4= 'SingleQuantity' otherlv_5= '{' otherlv_6= 'value' ( (lv_value_7_0= ruleEFloat ) ) otherlv_8= '}' ) ) )
            // InternalRoverml.g:1020:2: (this_Time_0= ruleTime | this_Velocity_1= ruleVelocity | this_Angle_2= ruleAngle | (this_Length_3= ruleLength otherlv_4= 'SingleQuantity' otherlv_5= '{' otherlv_6= 'value' ( (lv_value_7_0= ruleEFloat ) ) otherlv_8= '}' ) )
            {
            // InternalRoverml.g:1020:2: (this_Time_0= ruleTime | this_Velocity_1= ruleVelocity | this_Angle_2= ruleAngle | (this_Length_3= ruleLength otherlv_4= 'SingleQuantity' otherlv_5= '{' otherlv_6= 'value' ( (lv_value_7_0= ruleEFloat ) ) otherlv_8= '}' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt11=1;
                }
                break;
            case 37:
                {
                alt11=2;
                }
                break;
            case 36:
                {
                alt11=3;
                }
                break;
            case 39:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRoverml.g:1021:3: this_Time_0= ruleTime
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
                    // InternalRoverml.g:1030:3: this_Velocity_1= ruleVelocity
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
                    // InternalRoverml.g:1039:3: this_Angle_2= ruleAngle
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
                    // InternalRoverml.g:1048:3: (this_Length_3= ruleLength otherlv_4= 'SingleQuantity' otherlv_5= '{' otherlv_6= 'value' ( (lv_value_7_0= ruleEFloat ) ) otherlv_8= '}' )
                    {
                    // InternalRoverml.g:1048:3: (this_Length_3= ruleLength otherlv_4= 'SingleQuantity' otherlv_5= '{' otherlv_6= 'value' ( (lv_value_7_0= ruleEFloat ) ) otherlv_8= '}' )
                    // InternalRoverml.g:1049:4: this_Length_3= ruleLength otherlv_4= 'SingleQuantity' otherlv_5= '{' otherlv_6= 'value' ( (lv_value_7_0= ruleEFloat ) ) otherlv_8= '}'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSingleQuantityAccess().getLengthParserRuleCall_3_0());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    this_Length_3=ruleLength();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Length_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_4=(Token)match(input,33,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSingleQuantityAccess().getSingleQuantityKeyword_3_1());
                      			
                    }
                    otherlv_5=(Token)match(input,15,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSingleQuantityAccess().getLeftCurlyBracketKeyword_3_2());
                      			
                    }
                    otherlv_6=(Token)match(input,34,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getSingleQuantityAccess().getValueKeyword_3_3());
                      			
                    }
                    // InternalRoverml.g:1069:4: ( (lv_value_7_0= ruleEFloat ) )
                    // InternalRoverml.g:1070:5: (lv_value_7_0= ruleEFloat )
                    {
                    // InternalRoverml.g:1070:5: (lv_value_7_0= ruleEFloat )
                    // InternalRoverml.g:1071:6: lv_value_7_0= ruleEFloat
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSingleQuantityAccess().getValueEFloatParserRuleCall_3_4_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_value_7_0=ruleEFloat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSingleQuantityRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_7_0,
                      							"at.ac.tuwien.big.Roverml.EFloat");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getSingleQuantityAccess().getRightCurlyBracketKeyword_3_5());
                      			
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
    // InternalRoverml.g:1097:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalRoverml.g:1097:45: (iv_ruleTime= ruleTime EOF )
            // InternalRoverml.g:1098:2: iv_ruleTime= ruleTime EOF
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
    // InternalRoverml.g:1104:1: ruleTime returns [EObject current=null] : (otherlv_0= 'timeUnit' ( (lv_timeUnit_1_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_timeUnit_1_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1110:2: ( (otherlv_0= 'timeUnit' ( (lv_timeUnit_1_0= ruleTimeUnit ) ) ) )
            // InternalRoverml.g:1111:2: (otherlv_0= 'timeUnit' ( (lv_timeUnit_1_0= ruleTimeUnit ) ) )
            {
            // InternalRoverml.g:1111:2: (otherlv_0= 'timeUnit' ( (lv_timeUnit_1_0= ruleTimeUnit ) ) )
            // InternalRoverml.g:1112:3: otherlv_0= 'timeUnit' ( (lv_timeUnit_1_0= ruleTimeUnit ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTimeAccess().getTimeUnitKeyword_0());
              		
            }
            // InternalRoverml.g:1116:3: ( (lv_timeUnit_1_0= ruleTimeUnit ) )
            // InternalRoverml.g:1117:4: (lv_timeUnit_1_0= ruleTimeUnit )
            {
            // InternalRoverml.g:1117:4: (lv_timeUnit_1_0= ruleTimeUnit )
            // InternalRoverml.g:1118:5: lv_timeUnit_1_0= ruleTimeUnit
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
    // InternalRoverml.g:1139:1: entryRuleAngle returns [EObject current=null] : iv_ruleAngle= ruleAngle EOF ;
    public final EObject entryRuleAngle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle = null;


        try {
            // InternalRoverml.g:1139:46: (iv_ruleAngle= ruleAngle EOF )
            // InternalRoverml.g:1140:2: iv_ruleAngle= ruleAngle EOF
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
    // InternalRoverml.g:1146:1: ruleAngle returns [EObject current=null] : (otherlv_0= 'angleUnit' ( (lv_angleUnit_1_0= ruleAngleUnit ) ) ) ;
    public final EObject ruleAngle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_angleUnit_1_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1152:2: ( (otherlv_0= 'angleUnit' ( (lv_angleUnit_1_0= ruleAngleUnit ) ) ) )
            // InternalRoverml.g:1153:2: (otherlv_0= 'angleUnit' ( (lv_angleUnit_1_0= ruleAngleUnit ) ) )
            {
            // InternalRoverml.g:1153:2: (otherlv_0= 'angleUnit' ( (lv_angleUnit_1_0= ruleAngleUnit ) ) )
            // InternalRoverml.g:1154:3: otherlv_0= 'angleUnit' ( (lv_angleUnit_1_0= ruleAngleUnit ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAngleAccess().getAngleUnitKeyword_0());
              		
            }
            // InternalRoverml.g:1158:3: ( (lv_angleUnit_1_0= ruleAngleUnit ) )
            // InternalRoverml.g:1159:4: (lv_angleUnit_1_0= ruleAngleUnit )
            {
            // InternalRoverml.g:1159:4: (lv_angleUnit_1_0= ruleAngleUnit )
            // InternalRoverml.g:1160:5: lv_angleUnit_1_0= ruleAngleUnit
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
    // InternalRoverml.g:1181:1: entryRuleVelocity returns [EObject current=null] : iv_ruleVelocity= ruleVelocity EOF ;
    public final EObject entryRuleVelocity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVelocity = null;


        try {
            // InternalRoverml.g:1181:49: (iv_ruleVelocity= ruleVelocity EOF )
            // InternalRoverml.g:1182:2: iv_ruleVelocity= ruleVelocity EOF
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
    // InternalRoverml.g:1188:1: ruleVelocity returns [EObject current=null] : (otherlv_0= 'velocityUnit' ( (lv_velocityUnit_1_0= ruleVelocityUnit ) ) ) ;
    public final EObject ruleVelocity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_velocityUnit_1_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1194:2: ( (otherlv_0= 'velocityUnit' ( (lv_velocityUnit_1_0= ruleVelocityUnit ) ) ) )
            // InternalRoverml.g:1195:2: (otherlv_0= 'velocityUnit' ( (lv_velocityUnit_1_0= ruleVelocityUnit ) ) )
            {
            // InternalRoverml.g:1195:2: (otherlv_0= 'velocityUnit' ( (lv_velocityUnit_1_0= ruleVelocityUnit ) ) )
            // InternalRoverml.g:1196:3: otherlv_0= 'velocityUnit' ( (lv_velocityUnit_1_0= ruleVelocityUnit ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVelocityAccess().getVelocityUnitKeyword_0());
              		
            }
            // InternalRoverml.g:1200:3: ( (lv_velocityUnit_1_0= ruleVelocityUnit ) )
            // InternalRoverml.g:1201:4: (lv_velocityUnit_1_0= ruleVelocityUnit )
            {
            // InternalRoverml.g:1201:4: (lv_velocityUnit_1_0= ruleVelocityUnit )
            // InternalRoverml.g:1202:5: lv_velocityUnit_1_0= ruleVelocityUnit
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
    // InternalRoverml.g:1223:1: entryRuleLight returns [EObject current=null] : iv_ruleLight= ruleLight EOF ;
    public final EObject entryRuleLight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLight = null;


        try {
            // InternalRoverml.g:1223:46: (iv_ruleLight= ruleLight EOF )
            // InternalRoverml.g:1224:2: iv_ruleLight= ruleLight EOF
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
    // InternalRoverml.g:1230:1: ruleLight returns [EObject current=null] : ( () otherlv_1= 'light' ) ;
    public final EObject ruleLight() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:1236:2: ( ( () otherlv_1= 'light' ) )
            // InternalRoverml.g:1237:2: ( () otherlv_1= 'light' )
            {
            // InternalRoverml.g:1237:2: ( () otherlv_1= 'light' )
            // InternalRoverml.g:1238:3: () otherlv_1= 'light'
            {
            // InternalRoverml.g:1238:3: ()
            // InternalRoverml.g:1239:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLightAccess().getLightAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLightAccess().getLightKeyword_1());
              		
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
    // InternalRoverml.g:1253:1: entryRuleLength returns [EObject current=null] : iv_ruleLength= ruleLength EOF ;
    public final EObject entryRuleLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLength = null;


        try {
            // InternalRoverml.g:1253:47: (iv_ruleLength= ruleLength EOF )
            // InternalRoverml.g:1254:2: iv_ruleLength= ruleLength EOF
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
    // InternalRoverml.g:1260:1: ruleLength returns [EObject current=null] : (otherlv_0= 'length' otherlv_1= '{' otherlv_2= 'lengthUnit' ( (lv_lengthUnit_3_0= ruleLengthUnit ) ) otherlv_4= '}' ) ;
    public final EObject ruleLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_lengthUnit_3_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1266:2: ( (otherlv_0= 'length' otherlv_1= '{' otherlv_2= 'lengthUnit' ( (lv_lengthUnit_3_0= ruleLengthUnit ) ) otherlv_4= '}' ) )
            // InternalRoverml.g:1267:2: (otherlv_0= 'length' otherlv_1= '{' otherlv_2= 'lengthUnit' ( (lv_lengthUnit_3_0= ruleLengthUnit ) ) otherlv_4= '}' )
            {
            // InternalRoverml.g:1267:2: (otherlv_0= 'length' otherlv_1= '{' otherlv_2= 'lengthUnit' ( (lv_lengthUnit_3_0= ruleLengthUnit ) ) otherlv_4= '}' )
            // InternalRoverml.g:1268:3: otherlv_0= 'length' otherlv_1= '{' otherlv_2= 'lengthUnit' ( (lv_lengthUnit_3_0= ruleLengthUnit ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLengthAccess().getLengthKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLengthAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,40,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLengthAccess().getLengthUnitKeyword_2());
              		
            }
            // InternalRoverml.g:1280:3: ( (lv_lengthUnit_3_0= ruleLengthUnit ) )
            // InternalRoverml.g:1281:4: (lv_lengthUnit_3_0= ruleLengthUnit )
            {
            // InternalRoverml.g:1281:4: (lv_lengthUnit_3_0= ruleLengthUnit )
            // InternalRoverml.g:1282:5: lv_lengthUnit_3_0= ruleLengthUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLengthAccess().getLengthUnitLengthUnitEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:1307:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalRoverml.g:1307:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalRoverml.g:1308:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalRoverml.g:1314:1: ruleSensor returns [EObject current=null] : (this_GPS_0= ruleGPS | this_DistanceSensor_1= ruleDistanceSensor | (this_Compass_2= ruleCompass otherlv_3= 'sensor' otherlv_4= '{' ( (lv_lastSensedValue_5_0= ruleQuantity ) ) otherlv_6= '}' ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_GPS_0 = null;

        EObject this_DistanceSensor_1 = null;

        EObject this_Compass_2 = null;

        EObject lv_lastSensedValue_5_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1320:2: ( (this_GPS_0= ruleGPS | this_DistanceSensor_1= ruleDistanceSensor | (this_Compass_2= ruleCompass otherlv_3= 'sensor' otherlv_4= '{' ( (lv_lastSensedValue_5_0= ruleQuantity ) ) otherlv_6= '}' ) ) )
            // InternalRoverml.g:1321:2: (this_GPS_0= ruleGPS | this_DistanceSensor_1= ruleDistanceSensor | (this_Compass_2= ruleCompass otherlv_3= 'sensor' otherlv_4= '{' ( (lv_lastSensedValue_5_0= ruleQuantity ) ) otherlv_6= '}' ) )
            {
            // InternalRoverml.g:1321:2: (this_GPS_0= ruleGPS | this_DistanceSensor_1= ruleDistanceSensor | (this_Compass_2= ruleCompass otherlv_3= 'sensor' otherlv_4= '{' ( (lv_lastSensedValue_5_0= ruleQuantity ) ) otherlv_6= '}' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case 32:
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
                    // InternalRoverml.g:1322:3: this_GPS_0= ruleGPS
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
                    // InternalRoverml.g:1331:3: this_DistanceSensor_1= ruleDistanceSensor
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
                    // InternalRoverml.g:1340:3: (this_Compass_2= ruleCompass otherlv_3= 'sensor' otherlv_4= '{' ( (lv_lastSensedValue_5_0= ruleQuantity ) ) otherlv_6= '}' )
                    {
                    // InternalRoverml.g:1340:3: (this_Compass_2= ruleCompass otherlv_3= 'sensor' otherlv_4= '{' ( (lv_lastSensedValue_5_0= ruleQuantity ) ) otherlv_6= '}' )
                    // InternalRoverml.g:1341:4: this_Compass_2= ruleCompass otherlv_3= 'sensor' otherlv_4= '{' ( (lv_lastSensedValue_5_0= ruleQuantity ) ) otherlv_6= '}'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSensorAccess().getCompassParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_34);
                    this_Compass_2=ruleCompass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Compass_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,27,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getSensorKeyword_2_1());
                      			
                    }
                    otherlv_4=(Token)match(input,15,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2_2());
                      			
                    }
                    // InternalRoverml.g:1357:4: ( (lv_lastSensedValue_5_0= ruleQuantity ) )
                    // InternalRoverml.g:1358:5: (lv_lastSensedValue_5_0= ruleQuantity )
                    {
                    // InternalRoverml.g:1358:5: (lv_lastSensedValue_5_0= ruleQuantity )
                    // InternalRoverml.g:1359:6: lv_lastSensedValue_5_0= ruleQuantity
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSensorAccess().getLastSensedValueQuantityParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_lastSensedValue_5_0=ruleQuantity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSensorRule());
                      						}
                      						set(
                      							current,
                      							"lastSensedValue",
                      							lv_lastSensedValue_5_0,
                      							"at.ac.tuwien.big.Roverml.Quantity");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_2_4());
                      			
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
    // InternalRoverml.g:1385:1: entryRuleMotor returns [EObject current=null] : iv_ruleMotor= ruleMotor EOF ;
    public final EObject entryRuleMotor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotor = null;


        try {
            // InternalRoverml.g:1385:46: (iv_ruleMotor= ruleMotor EOF )
            // InternalRoverml.g:1386:2: iv_ruleMotor= ruleMotor EOF
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
    // InternalRoverml.g:1392:1: ruleMotor returns [EObject current=null] : ( () otherlv_1= 'motor' ) ;
    public final EObject ruleMotor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:1398:2: ( ( () otherlv_1= 'motor' ) )
            // InternalRoverml.g:1399:2: ( () otherlv_1= 'motor' )
            {
            // InternalRoverml.g:1399:2: ( () otherlv_1= 'motor' )
            // InternalRoverml.g:1400:3: () otherlv_1= 'motor'
            {
            // InternalRoverml.g:1400:3: ()
            // InternalRoverml.g:1401:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMotorAccess().getMotorAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMotorAccess().getMotorKeyword_1());
              		
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
    // InternalRoverml.g:1415:1: entryRuleTerminate returns [EObject current=null] : iv_ruleTerminate= ruleTerminate EOF ;
    public final EObject entryRuleTerminate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminate = null;


        try {
            // InternalRoverml.g:1415:50: (iv_ruleTerminate= ruleTerminate EOF )
            // InternalRoverml.g:1416:2: iv_ruleTerminate= ruleTerminate EOF
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
    // InternalRoverml.g:1422:1: ruleTerminate returns [EObject current=null] : ( () otherlv_1= 'terminate' ) ;
    public final EObject ruleTerminate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:1428:2: ( ( () otherlv_1= 'terminate' ) )
            // InternalRoverml.g:1429:2: ( () otherlv_1= 'terminate' )
            {
            // InternalRoverml.g:1429:2: ( () otherlv_1= 'terminate' )
            // InternalRoverml.g:1430:3: () otherlv_1= 'terminate'
            {
            // InternalRoverml.g:1430:3: ()
            // InternalRoverml.g:1431:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTerminateAccess().getTerminateAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:1445:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalRoverml.g:1445:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalRoverml.g:1446:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalRoverml.g:1452:1: ruleComponent returns [EObject current=null] : (this_Actuator_0= ruleActuator | (this_Sensor_1= ruleSensor otherlv_2= 'component' otherlv_3= '{' otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) otherlv_6= '}' ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Actuator_0 = null;

        EObject this_Sensor_1 = null;

        AntlrDatatypeRuleToken lv_kind_5_0 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1458:2: ( (this_Actuator_0= ruleActuator | (this_Sensor_1= ruleSensor otherlv_2= 'component' otherlv_3= '{' otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) otherlv_6= '}' ) ) )
            // InternalRoverml.g:1459:2: (this_Actuator_0= ruleActuator | (this_Sensor_1= ruleSensor otherlv_2= 'component' otherlv_3= '{' otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) otherlv_6= '}' ) )
            {
            // InternalRoverml.g:1459:2: (this_Actuator_0= ruleActuator | (this_Sensor_1= ruleSensor otherlv_2= 'component' otherlv_3= '{' otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) otherlv_6= '}' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38||LA13_0==41) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=30 && LA13_0<=32)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRoverml.g:1460:3: this_Actuator_0= ruleActuator
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
                    // InternalRoverml.g:1469:3: (this_Sensor_1= ruleSensor otherlv_2= 'component' otherlv_3= '{' otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) otherlv_6= '}' )
                    {
                    // InternalRoverml.g:1469:3: (this_Sensor_1= ruleSensor otherlv_2= 'component' otherlv_3= '{' otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) otherlv_6= '}' )
                    // InternalRoverml.g:1470:4: this_Sensor_1= ruleSensor otherlv_2= 'component' otherlv_3= '{' otherlv_4= 'kind' ( (lv_kind_5_0= ruleEString ) ) otherlv_6= '}'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getComponentAccess().getSensorParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_35);
                    this_Sensor_1=ruleSensor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Sensor_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,43,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getComponentKeyword_1_1());
                      			
                    }
                    otherlv_3=(Token)match(input,15,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1_2());
                      			
                    }
                    otherlv_4=(Token)match(input,44,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getKindKeyword_1_3());
                      			
                    }
                    // InternalRoverml.g:1490:4: ( (lv_kind_5_0= ruleEString ) )
                    // InternalRoverml.g:1491:5: (lv_kind_5_0= ruleEString )
                    {
                    // InternalRoverml.g:1491:5: (lv_kind_5_0= ruleEString )
                    // InternalRoverml.g:1492:6: lv_kind_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComponentAccess().getKindEStringParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_kind_5_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComponentRule());
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

                    otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_1_5());
                      			
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
    // InternalRoverml.g:1518:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalRoverml.g:1518:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalRoverml.g:1519:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalRoverml.g:1525:1: ruleActuator returns [EObject current=null] : (this_Light_0= ruleLight | (this_Motor_1= ruleMotor otherlv_2= 'actuator' ) ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Light_0 = null;

        EObject this_Motor_1 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1531:2: ( (this_Light_0= ruleLight | (this_Motor_1= ruleMotor otherlv_2= 'actuator' ) ) )
            // InternalRoverml.g:1532:2: (this_Light_0= ruleLight | (this_Motor_1= ruleMotor otherlv_2= 'actuator' ) )
            {
            // InternalRoverml.g:1532:2: (this_Light_0= ruleLight | (this_Motor_1= ruleMotor otherlv_2= 'actuator' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            else if ( (LA14_0==41) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalRoverml.g:1533:3: this_Light_0= ruleLight
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
                    // InternalRoverml.g:1542:3: (this_Motor_1= ruleMotor otherlv_2= 'actuator' )
                    {
                    // InternalRoverml.g:1542:3: (this_Motor_1= ruleMotor otherlv_2= 'actuator' )
                    // InternalRoverml.g:1543:4: this_Motor_1= ruleMotor otherlv_2= 'actuator'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getActuatorAccess().getMotorParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_38);
                    this_Motor_1=ruleMotor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Motor_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getActuatorKeyword_1_1());
                      			
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
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleDistanceSensorTrigger"
    // InternalRoverml.g:1560:1: entryRuleDistanceSensorTrigger returns [EObject current=null] : iv_ruleDistanceSensorTrigger= ruleDistanceSensorTrigger EOF ;
    public final EObject entryRuleDistanceSensorTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceSensorTrigger = null;


        try {
            // InternalRoverml.g:1560:62: (iv_ruleDistanceSensorTrigger= ruleDistanceSensorTrigger EOF )
            // InternalRoverml.g:1561:2: iv_ruleDistanceSensorTrigger= ruleDistanceSensorTrigger EOF
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
    // InternalRoverml.g:1567:1: ruleDistanceSensorTrigger returns [EObject current=null] : ( () otherlv_1= 'DistanceSensorTrigger' ) ;
    public final EObject ruleDistanceSensorTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:1573:2: ( ( () otherlv_1= 'DistanceSensorTrigger' ) )
            // InternalRoverml.g:1574:2: ( () otherlv_1= 'DistanceSensorTrigger' )
            {
            // InternalRoverml.g:1574:2: ( () otherlv_1= 'DistanceSensorTrigger' )
            // InternalRoverml.g:1575:3: () otherlv_1= 'DistanceSensorTrigger'
            {
            // InternalRoverml.g:1575:3: ()
            // InternalRoverml.g:1576:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDistanceSensorTriggerAccess().getDistanceSensorTriggerAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:1590:1: entryRuleGpsTrigger returns [EObject current=null] : iv_ruleGpsTrigger= ruleGpsTrigger EOF ;
    public final EObject entryRuleGpsTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGpsTrigger = null;


        try {
            // InternalRoverml.g:1590:51: (iv_ruleGpsTrigger= ruleGpsTrigger EOF )
            // InternalRoverml.g:1591:2: iv_ruleGpsTrigger= ruleGpsTrigger EOF
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
    // InternalRoverml.g:1597:1: ruleGpsTrigger returns [EObject current=null] : ( () otherlv_1= 'GpsTrigger' ) ;
    public final EObject ruleGpsTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:1603:2: ( ( () otherlv_1= 'GpsTrigger' ) )
            // InternalRoverml.g:1604:2: ( () otherlv_1= 'GpsTrigger' )
            {
            // InternalRoverml.g:1604:2: ( () otherlv_1= 'GpsTrigger' )
            // InternalRoverml.g:1605:3: () otherlv_1= 'GpsTrigger'
            {
            // InternalRoverml.g:1605:3: ()
            // InternalRoverml.g:1606:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGpsTriggerAccess().getGpsTriggerAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:1620:1: entryRuleCompassTrigger returns [EObject current=null] : iv_ruleCompassTrigger= ruleCompassTrigger EOF ;
    public final EObject entryRuleCompassTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompassTrigger = null;


        try {
            // InternalRoverml.g:1620:55: (iv_ruleCompassTrigger= ruleCompassTrigger EOF )
            // InternalRoverml.g:1621:2: iv_ruleCompassTrigger= ruleCompassTrigger EOF
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
    // InternalRoverml.g:1627:1: ruleCompassTrigger returns [EObject current=null] : ( () otherlv_1= 'CompassTrigger' ) ;
    public final EObject ruleCompassTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:1633:2: ( ( () otherlv_1= 'CompassTrigger' ) )
            // InternalRoverml.g:1634:2: ( () otherlv_1= 'CompassTrigger' )
            {
            // InternalRoverml.g:1634:2: ( () otherlv_1= 'CompassTrigger' )
            // InternalRoverml.g:1635:3: () otherlv_1= 'CompassTrigger'
            {
            // InternalRoverml.g:1635:3: ()
            // InternalRoverml.g:1636:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCompassTriggerAccess().getCompassTriggerAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:1650:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // InternalRoverml.g:1650:49: (iv_ruleQuantity= ruleQuantity EOF )
            // InternalRoverml.g:1651:2: iv_ruleQuantity= ruleQuantity EOF
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
    // InternalRoverml.g:1657:1: ruleQuantity returns [EObject current=null] : (this_Position_0= rulePosition | (this_SingleQuantity_1= ruleSingleQuantity otherlv_2= 'quantity' ) ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Position_0 = null;

        EObject this_SingleQuantity_1 = null;



        	enterRule();

        try {
            // InternalRoverml.g:1663:2: ( (this_Position_0= rulePosition | (this_SingleQuantity_1= ruleSingleQuantity otherlv_2= 'quantity' ) ) )
            // InternalRoverml.g:1664:2: (this_Position_0= rulePosition | (this_SingleQuantity_1= ruleSingleQuantity otherlv_2= 'quantity' ) )
            {
            // InternalRoverml.g:1664:2: (this_Position_0= rulePosition | (this_SingleQuantity_1= ruleSingleQuantity otherlv_2= 'quantity' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==50) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=35 && LA15_0<=37)||LA15_0==39) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRoverml.g:1665:3: this_Position_0= rulePosition
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
                    // InternalRoverml.g:1674:3: (this_SingleQuantity_1= ruleSingleQuantity otherlv_2= 'quantity' )
                    {
                    // InternalRoverml.g:1674:3: (this_SingleQuantity_1= ruleSingleQuantity otherlv_2= 'quantity' )
                    // InternalRoverml.g:1675:4: this_SingleQuantity_1= ruleSingleQuantity otherlv_2= 'quantity'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getQuantityAccess().getSingleQuantityParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_39);
                    this_SingleQuantity_1=ruleSingleQuantity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SingleQuantity_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:1692:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalRoverml.g:1692:49: (iv_rulePosition= rulePosition EOF )
            // InternalRoverml.g:1693:2: iv_rulePosition= rulePosition EOF
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
    // InternalRoverml.g:1699:1: rulePosition returns [EObject current=null] : ( () otherlv_1= 'position' otherlv_2= '{' (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) ) (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) ) otherlv_7= '}' ) ;
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
            // InternalRoverml.g:1705:2: ( ( () otherlv_1= 'position' otherlv_2= '{' (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) ) (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) ) otherlv_7= '}' ) )
            // InternalRoverml.g:1706:2: ( () otherlv_1= 'position' otherlv_2= '{' (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) ) (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) ) otherlv_7= '}' )
            {
            // InternalRoverml.g:1706:2: ( () otherlv_1= 'position' otherlv_2= '{' (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) ) (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) ) otherlv_7= '}' )
            // InternalRoverml.g:1707:3: () otherlv_1= 'position' otherlv_2= '{' (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) ) (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) ) otherlv_7= '}'
            {
            // InternalRoverml.g:1707:3: ()
            // InternalRoverml.g:1708:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPositionAccess().getPositionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getPositionKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalRoverml.g:1722:3: (otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) ) )
            // InternalRoverml.g:1723:4: otherlv_3= 'x' ( (lv_x_4_0= ruleLength ) )
            {
            otherlv_3=(Token)match(input,51,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getPositionAccess().getXKeyword_3_0());
              			
            }
            // InternalRoverml.g:1727:4: ( (lv_x_4_0= ruleLength ) )
            // InternalRoverml.g:1728:5: (lv_x_4_0= ruleLength )
            {
            // InternalRoverml.g:1728:5: (lv_x_4_0= ruleLength )
            // InternalRoverml.g:1729:6: lv_x_4_0= ruleLength
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getPositionAccess().getXLengthParserRuleCall_3_1_0());
              					
            }
            pushFollow(FOLLOW_41);
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

            // InternalRoverml.g:1747:3: (otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) ) )
            // InternalRoverml.g:1748:4: otherlv_5= 'y' ( (lv_y_6_0= ruleLength ) )
            {
            otherlv_5=(Token)match(input,52,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getPositionAccess().getYKeyword_4_0());
              			
            }
            // InternalRoverml.g:1752:4: ( (lv_y_6_0= ruleLength ) )
            // InternalRoverml.g:1753:5: (lv_y_6_0= ruleLength )
            {
            // InternalRoverml.g:1753:5: (lv_y_6_0= ruleLength )
            // InternalRoverml.g:1754:6: lv_y_6_0= ruleLength
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getPositionAccess().getYLengthParserRuleCall_4_1_0());
              					
            }
            pushFollow(FOLLOW_10);
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

            otherlv_7=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:1780:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalRoverml.g:1780:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalRoverml.g:1781:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalRoverml.g:1787:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRoverml.g:1793:2: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalRoverml.g:1794:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalRoverml.g:1794:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalRoverml.g:1795:3: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalRoverml.g:1802:3: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==53) && (synpred1_InternalRoverml())) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRoverml.g:1803:4: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalRoverml.g:1803:4: ( ( '.' )=>kw= '.' )
            	    // InternalRoverml.g:1804:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,53,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalRoverml.g:1823:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRoverml.g:1823:47: (iv_ruleEString= ruleEString EOF )
            // InternalRoverml.g:1824:2: iv_ruleEString= ruleEString EOF
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
    // InternalRoverml.g:1830:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:1836:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRoverml.g:1837:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRoverml.g:1837:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRoverml.g:1838:3: this_STRING_0= RULE_STRING
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
                    // InternalRoverml.g:1846:3: this_ID_1= RULE_ID
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
    // InternalRoverml.g:1857:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalRoverml.g:1857:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalRoverml.g:1858:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalRoverml.g:1864:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalRoverml.g:1870:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalRoverml.g:1871:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalRoverml.g:1871:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalRoverml.g:1872:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalRoverml.g:1872:3: (kw= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==54) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRoverml.g:1873:4: kw= '-'
                    {
                    kw=(Token)match(input,54,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalRoverml.g:1879:3: (this_INT_1= RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRoverml.g:1880:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,53,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
              		
            }
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
              		
            }
            // InternalRoverml.g:1900:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=55 && LA22_0<=56)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRoverml.g:1901:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalRoverml.g:1901:4: (kw= 'E' | kw= 'e' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==55) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==56) ) {
                        alt20=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalRoverml.g:1902:5: kw= 'E'
                            {
                            kw=(Token)match(input,55,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalRoverml.g:1908:5: kw= 'e'
                            {
                            kw=(Token)match(input,56,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalRoverml.g:1914:4: (kw= '-' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==54) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalRoverml.g:1915:5: kw= '-'
                            {
                            kw=(Token)match(input,54,FOLLOW_45); if (state.failed) return current;
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
    // InternalRoverml.g:1933:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRoverml.g:1933:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRoverml.g:1934:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalRoverml.g:1940:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRoverml.g:1946:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRoverml.g:1947:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRoverml.g:1947:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRoverml.g:1948:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRoverml.g:1948:3: (kw= '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==54) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRoverml.g:1949:4: kw= '-'
                    {
                    kw=(Token)match(input,54,FOLLOW_45); if (state.failed) return current;
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
    // InternalRoverml.g:1966:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'move' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'Green' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Blue' ) | (enumLiteral_7= '3' ) | (enumLiteral_8= 'Yellow' ) | (enumLiteral_9= '4' ) ) ;
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
            // InternalRoverml.g:1972:2: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'move' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'Green' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Blue' ) | (enumLiteral_7= '3' ) | (enumLiteral_8= 'Yellow' ) | (enumLiteral_9= '4' ) ) )
            // InternalRoverml.g:1973:2: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'move' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'Green' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Blue' ) | (enumLiteral_7= '3' ) | (enumLiteral_8= 'Yellow' ) | (enumLiteral_9= '4' ) )
            {
            // InternalRoverml.g:1973:2: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'move' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'Green' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Blue' ) | (enumLiteral_7= '3' ) | (enumLiteral_8= 'Yellow' ) | (enumLiteral_9= '4' ) )
            int alt24=10;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt24=1;
                }
                break;
            case 58:
                {
                alt24=2;
                }
                break;
            case 14:
                {
                alt24=3;
                }
                break;
            case 59:
                {
                alt24=4;
                }
                break;
            case 60:
                {
                alt24=5;
                }
                break;
            case 61:
                {
                alt24=6;
                }
                break;
            case 62:
                {
                alt24=7;
                }
                break;
            case 63:
                {
                alt24=8;
                }
                break;
            case 64:
                {
                alt24=9;
                }
                break;
            case 65:
                {
                alt24=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalRoverml.g:1974:3: (enumLiteral_0= 'None' )
                    {
                    // InternalRoverml.g:1974:3: (enumLiteral_0= 'None' )
                    // InternalRoverml.g:1975:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getNoneEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:1982:3: (enumLiteral_1= '0' )
                    {
                    // InternalRoverml.g:1982:3: (enumLiteral_1= '0' )
                    // InternalRoverml.g:1983:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getNoneEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getNoneEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverml.g:1990:3: (enumLiteral_2= 'move' )
                    {
                    // InternalRoverml.g:1990:3: (enumLiteral_2= 'move' )
                    // InternalRoverml.g:1991:4: enumLiteral_2= 'move'
                    {
                    enumLiteral_2=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverml.g:1998:3: (enumLiteral_3= '1' )
                    {
                    // InternalRoverml.g:1998:3: (enumLiteral_3= '1' )
                    // InternalRoverml.g:1999:4: enumLiteral_3= '1'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalRoverml.g:2006:3: (enumLiteral_4= 'Green' )
                    {
                    // InternalRoverml.g:2006:3: (enumLiteral_4= 'Green' )
                    // InternalRoverml.g:2007:4: enumLiteral_4= 'Green'
                    {
                    enumLiteral_4=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalRoverml.g:2014:3: (enumLiteral_5= '2' )
                    {
                    // InternalRoverml.g:2014:3: (enumLiteral_5= '2' )
                    // InternalRoverml.g:2015:4: enumLiteral_5= '2'
                    {
                    enumLiteral_5=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalRoverml.g:2022:3: (enumLiteral_6= 'Blue' )
                    {
                    // InternalRoverml.g:2022:3: (enumLiteral_6= 'Blue' )
                    // InternalRoverml.g:2023:4: enumLiteral_6= 'Blue'
                    {
                    enumLiteral_6=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalRoverml.g:2030:3: (enumLiteral_7= '3' )
                    {
                    // InternalRoverml.g:2030:3: (enumLiteral_7= '3' )
                    // InternalRoverml.g:2031:4: enumLiteral_7= '3'
                    {
                    enumLiteral_7=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalRoverml.g:2038:3: (enumLiteral_8= 'Yellow' )
                    {
                    // InternalRoverml.g:2038:3: (enumLiteral_8= 'Yellow' )
                    // InternalRoverml.g:2039:4: enumLiteral_8= 'Yellow'
                    {
                    enumLiteral_8=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalRoverml.g:2046:3: (enumLiteral_9= '4' )
                    {
                    // InternalRoverml.g:2046:3: (enumLiteral_9= '4' )
                    // InternalRoverml.g:2047:4: enumLiteral_9= '4'
                    {
                    enumLiteral_9=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:2057:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Ns' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Ms' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'S' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Min' ) | (enumLiteral_7= '3' ) | (enumLiteral_8= 'H' ) | (enumLiteral_9= '4' ) ) ;
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
            // InternalRoverml.g:2063:2: ( ( (enumLiteral_0= 'Ns' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Ms' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'S' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Min' ) | (enumLiteral_7= '3' ) | (enumLiteral_8= 'H' ) | (enumLiteral_9= '4' ) ) )
            // InternalRoverml.g:2064:2: ( (enumLiteral_0= 'Ns' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Ms' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'S' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Min' ) | (enumLiteral_7= '3' ) | (enumLiteral_8= 'H' ) | (enumLiteral_9= '4' ) )
            {
            // InternalRoverml.g:2064:2: ( (enumLiteral_0= 'Ns' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Ms' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'S' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Min' ) | (enumLiteral_7= '3' ) | (enumLiteral_8= 'H' ) | (enumLiteral_9= '4' ) )
            int alt25=10;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt25=1;
                }
                break;
            case 58:
                {
                alt25=2;
                }
                break;
            case 67:
                {
                alt25=3;
                }
                break;
            case 59:
                {
                alt25=4;
                }
                break;
            case 68:
                {
                alt25=5;
                }
                break;
            case 61:
                {
                alt25=6;
                }
                break;
            case 69:
                {
                alt25=7;
                }
                break;
            case 63:
                {
                alt25=8;
                }
                break;
            case 70:
                {
                alt25=9;
                }
                break;
            case 65:
                {
                alt25=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalRoverml.g:2065:3: (enumLiteral_0= 'Ns' )
                    {
                    // InternalRoverml.g:2065:3: (enumLiteral_0= 'Ns' )
                    // InternalRoverml.g:2066:4: enumLiteral_0= 'Ns'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getNsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getNsEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2073:3: (enumLiteral_1= '0' )
                    {
                    // InternalRoverml.g:2073:3: (enumLiteral_1= '0' )
                    // InternalRoverml.g:2074:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getNsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getNsEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverml.g:2081:3: (enumLiteral_2= 'Ms' )
                    {
                    // InternalRoverml.g:2081:3: (enumLiteral_2= 'Ms' )
                    // InternalRoverml.g:2082:4: enumLiteral_2= 'Ms'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getMsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMsEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverml.g:2089:3: (enumLiteral_3= '1' )
                    {
                    // InternalRoverml.g:2089:3: (enumLiteral_3= '1' )
                    // InternalRoverml.g:2090:4: enumLiteral_3= '1'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getMsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getMsEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalRoverml.g:2097:3: (enumLiteral_4= 'S' )
                    {
                    // InternalRoverml.g:2097:3: (enumLiteral_4= 'S' )
                    // InternalRoverml.g:2098:4: enumLiteral_4= 'S'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getSEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalRoverml.g:2105:3: (enumLiteral_5= '2' )
                    {
                    // InternalRoverml.g:2105:3: (enumLiteral_5= '2' )
                    // InternalRoverml.g:2106:4: enumLiteral_5= '2'
                    {
                    enumLiteral_5=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getTimeUnitAccess().getSEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalRoverml.g:2113:3: (enumLiteral_6= 'Min' )
                    {
                    // InternalRoverml.g:2113:3: (enumLiteral_6= 'Min' )
                    // InternalRoverml.g:2114:4: enumLiteral_6= 'Min'
                    {
                    enumLiteral_6=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalRoverml.g:2121:3: (enumLiteral_7= '3' )
                    {
                    // InternalRoverml.g:2121:3: (enumLiteral_7= '3' )
                    // InternalRoverml.g:2122:4: enumLiteral_7= '3'
                    {
                    enumLiteral_7=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalRoverml.g:2129:3: (enumLiteral_8= 'H' )
                    {
                    // InternalRoverml.g:2129:3: (enumLiteral_8= 'H' )
                    // InternalRoverml.g:2130:4: enumLiteral_8= 'H'
                    {
                    enumLiteral_8=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getHEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getTimeUnitAccess().getHEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalRoverml.g:2137:3: (enumLiteral_9= '4' )
                    {
                    // InternalRoverml.g:2137:3: (enumLiteral_9= '4' )
                    // InternalRoverml.g:2138:4: enumLiteral_9= '4'
                    {
                    enumLiteral_9=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:2148:1: ruleAngleUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Radian' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Degree' ) | (enumLiteral_3= '1' ) ) ;
    public final Enumerator ruleAngleUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRoverml.g:2154:2: ( ( (enumLiteral_0= 'Radian' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Degree' ) | (enumLiteral_3= '1' ) ) )
            // InternalRoverml.g:2155:2: ( (enumLiteral_0= 'Radian' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Degree' ) | (enumLiteral_3= '1' ) )
            {
            // InternalRoverml.g:2155:2: ( (enumLiteral_0= 'Radian' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Degree' ) | (enumLiteral_3= '1' ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt26=1;
                }
                break;
            case 58:
                {
                alt26=2;
                }
                break;
            case 72:
                {
                alt26=3;
                }
                break;
            case 59:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalRoverml.g:2156:3: (enumLiteral_0= 'Radian' )
                    {
                    // InternalRoverml.g:2156:3: (enumLiteral_0= 'Radian' )
                    // InternalRoverml.g:2157:4: enumLiteral_0= 'Radian'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAngleUnitAccess().getRadianEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAngleUnitAccess().getRadianEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2164:3: (enumLiteral_1= '0' )
                    {
                    // InternalRoverml.g:2164:3: (enumLiteral_1= '0' )
                    // InternalRoverml.g:2165:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAngleUnitAccess().getRadianEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAngleUnitAccess().getRadianEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverml.g:2172:3: (enumLiteral_2= 'Degree' )
                    {
                    // InternalRoverml.g:2172:3: (enumLiteral_2= 'Degree' )
                    // InternalRoverml.g:2173:4: enumLiteral_2= 'Degree'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAngleUnitAccess().getDegreeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAngleUnitAccess().getDegreeEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverml.g:2180:3: (enumLiteral_3= '1' )
                    {
                    // InternalRoverml.g:2180:3: (enumLiteral_3= '1' )
                    // InternalRoverml.g:2181:4: enumLiteral_3= '1'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:2191:1: ruleVelocityUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Mm_per_s' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Cm_per_s' ) | (enumLiteral_3= '1' ) ) ;
    public final Enumerator ruleVelocityUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRoverml.g:2197:2: ( ( (enumLiteral_0= 'Mm_per_s' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Cm_per_s' ) | (enumLiteral_3= '1' ) ) )
            // InternalRoverml.g:2198:2: ( (enumLiteral_0= 'Mm_per_s' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Cm_per_s' ) | (enumLiteral_3= '1' ) )
            {
            // InternalRoverml.g:2198:2: ( (enumLiteral_0= 'Mm_per_s' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Cm_per_s' ) | (enumLiteral_3= '1' ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt27=1;
                }
                break;
            case 58:
                {
                alt27=2;
                }
                break;
            case 74:
                {
                alt27=3;
                }
                break;
            case 59:
                {
                alt27=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalRoverml.g:2199:3: (enumLiteral_0= 'Mm_per_s' )
                    {
                    // InternalRoverml.g:2199:3: (enumLiteral_0= 'Mm_per_s' )
                    // InternalRoverml.g:2200:4: enumLiteral_0= 'Mm_per_s'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVelocityUnitAccess().getMm_per_sEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getVelocityUnitAccess().getMm_per_sEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2207:3: (enumLiteral_1= '0' )
                    {
                    // InternalRoverml.g:2207:3: (enumLiteral_1= '0' )
                    // InternalRoverml.g:2208:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVelocityUnitAccess().getMm_per_sEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getVelocityUnitAccess().getMm_per_sEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverml.g:2215:3: (enumLiteral_2= 'Cm_per_s' )
                    {
                    // InternalRoverml.g:2215:3: (enumLiteral_2= 'Cm_per_s' )
                    // InternalRoverml.g:2216:4: enumLiteral_2= 'Cm_per_s'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVelocityUnitAccess().getCm_per_sEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getVelocityUnitAccess().getCm_per_sEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverml.g:2223:3: (enumLiteral_3= '1' )
                    {
                    // InternalRoverml.g:2223:3: (enumLiteral_3= '1' )
                    // InternalRoverml.g:2224:4: enumLiteral_3= '1'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:2234:1: ruleLengthUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Mm' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Cm' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'M' ) | (enumLiteral_5= '2' ) ) ;
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
            // InternalRoverml.g:2240:2: ( ( (enumLiteral_0= 'Mm' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Cm' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'M' ) | (enumLiteral_5= '2' ) ) )
            // InternalRoverml.g:2241:2: ( (enumLiteral_0= 'Mm' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Cm' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'M' ) | (enumLiteral_5= '2' ) )
            {
            // InternalRoverml.g:2241:2: ( (enumLiteral_0= 'Mm' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Cm' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'M' ) | (enumLiteral_5= '2' ) )
            int alt28=6;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt28=1;
                }
                break;
            case 58:
                {
                alt28=2;
                }
                break;
            case 76:
                {
                alt28=3;
                }
                break;
            case 59:
                {
                alt28=4;
                }
                break;
            case 77:
                {
                alt28=5;
                }
                break;
            case 61:
                {
                alt28=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalRoverml.g:2242:3: (enumLiteral_0= 'Mm' )
                    {
                    // InternalRoverml.g:2242:3: (enumLiteral_0= 'Mm' )
                    // InternalRoverml.g:2243:4: enumLiteral_0= 'Mm'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLengthUnitAccess().getMmEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getLengthUnitAccess().getMmEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2250:3: (enumLiteral_1= '0' )
                    {
                    // InternalRoverml.g:2250:3: (enumLiteral_1= '0' )
                    // InternalRoverml.g:2251:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLengthUnitAccess().getMmEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getLengthUnitAccess().getMmEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverml.g:2258:3: (enumLiteral_2= 'Cm' )
                    {
                    // InternalRoverml.g:2258:3: (enumLiteral_2= 'Cm' )
                    // InternalRoverml.g:2259:4: enumLiteral_2= 'Cm'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLengthUnitAccess().getCmEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getLengthUnitAccess().getCmEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverml.g:2266:3: (enumLiteral_3= '1' )
                    {
                    // InternalRoverml.g:2266:3: (enumLiteral_3= '1' )
                    // InternalRoverml.g:2267:4: enumLiteral_3= '1'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLengthUnitAccess().getCmEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getLengthUnitAccess().getCmEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalRoverml.g:2274:3: (enumLiteral_4= 'M' )
                    {
                    // InternalRoverml.g:2274:3: (enumLiteral_4= 'M' )
                    // InternalRoverml.g:2275:4: enumLiteral_4= 'M'
                    {
                    enumLiteral_4=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLengthUnitAccess().getMEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getLengthUnitAccess().getMEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalRoverml.g:2282:3: (enumLiteral_5= '2' )
                    {
                    // InternalRoverml.g:2282:3: (enumLiteral_5= '2' )
                    // InternalRoverml.g:2283:4: enumLiteral_5= '2'
                    {
                    enumLiteral_5=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalRoverml.g:2293:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Smaller' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Equals' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'Greater' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Unequal' ) | (enumLiteral_7= '3' ) ) ;
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
            // InternalRoverml.g:2299:2: ( ( (enumLiteral_0= 'Smaller' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Equals' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'Greater' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Unequal' ) | (enumLiteral_7= '3' ) ) )
            // InternalRoverml.g:2300:2: ( (enumLiteral_0= 'Smaller' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Equals' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'Greater' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Unequal' ) | (enumLiteral_7= '3' ) )
            {
            // InternalRoverml.g:2300:2: ( (enumLiteral_0= 'Smaller' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= 'Equals' ) | (enumLiteral_3= '1' ) | (enumLiteral_4= 'Greater' ) | (enumLiteral_5= '2' ) | (enumLiteral_6= 'Unequal' ) | (enumLiteral_7= '3' ) )
            int alt29=8;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt29=1;
                }
                break;
            case 58:
                {
                alt29=2;
                }
                break;
            case 79:
                {
                alt29=3;
                }
                break;
            case 59:
                {
                alt29=4;
                }
                break;
            case 80:
                {
                alt29=5;
                }
                break;
            case 61:
                {
                alt29=6;
                }
                break;
            case 81:
                {
                alt29=7;
                }
                break;
            case 63:
                {
                alt29=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalRoverml.g:2301:3: (enumLiteral_0= 'Smaller' )
                    {
                    // InternalRoverml.g:2301:3: (enumLiteral_0= 'Smaller' )
                    // InternalRoverml.g:2302:4: enumLiteral_0= 'Smaller'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getSmallerEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRoverml.g:2309:3: (enumLiteral_1= '0' )
                    {
                    // InternalRoverml.g:2309:3: (enumLiteral_1= '0' )
                    // InternalRoverml.g:2310:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getSmallerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getSmallerEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRoverml.g:2317:3: (enumLiteral_2= 'Equals' )
                    {
                    // InternalRoverml.g:2317:3: (enumLiteral_2= 'Equals' )
                    // InternalRoverml.g:2318:4: enumLiteral_2= 'Equals'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getEqualsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getEqualsEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRoverml.g:2325:3: (enumLiteral_3= '1' )
                    {
                    // InternalRoverml.g:2325:3: (enumLiteral_3= '1' )
                    // InternalRoverml.g:2326:4: enumLiteral_3= '1'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getEqualsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getEqualsEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalRoverml.g:2333:3: (enumLiteral_4= 'Greater' )
                    {
                    // InternalRoverml.g:2333:3: (enumLiteral_4= 'Greater' )
                    // InternalRoverml.g:2334:4: enumLiteral_4= 'Greater'
                    {
                    enumLiteral_4=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getGreaterEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getGreaterEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalRoverml.g:2341:3: (enumLiteral_5= '2' )
                    {
                    // InternalRoverml.g:2341:3: (enumLiteral_5= '2' )
                    // InternalRoverml.g:2342:4: enumLiteral_5= '2'
                    {
                    enumLiteral_5=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getGreaterEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getGreaterEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalRoverml.g:2349:3: (enumLiteral_6= 'Unequal' )
                    {
                    // InternalRoverml.g:2349:3: (enumLiteral_6= 'Unequal' )
                    // InternalRoverml.g:2350:4: enumLiteral_6= 'Unequal'
                    {
                    enumLiteral_6=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getUnequalEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getComparisonOperatorAccess().getUnequalEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalRoverml.g:2357:3: (enumLiteral_7= '3' )
                    {
                    // InternalRoverml.g:2357:3: (enumLiteral_7= '3' )
                    // InternalRoverml.g:2358:4: enumLiteral_7= '3'
                    {
                    enumLiteral_7=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
        // InternalRoverml.g:1804:5: ( '.' )
        // InternalRoverml.g:1804:6: '.'
        {
        match(input,53,FOLLOW_2); if (state.failed) return ;

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xFE00000000004000L,0x0000000000000003L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0040000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000241C0000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001C400023B4000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001C00002010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xAC00000000000000L,0x000000000003C000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000400B800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0060000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xAC00000000000000L,0x000000000000007EL});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0C00000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0C00000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x2C00000000000000L,0x0000000000003800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0180000000000002L});

}
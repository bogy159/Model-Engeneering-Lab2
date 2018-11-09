/**
 */
package at.ac.tuwien.big.roverml.util;

import at.ac.tuwien.big.roverml.*;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.roverml.RoverMLPackage
 * @generated
 */
public class RoverMLValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RoverMLValidator INSTANCE = new RoverMLValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "at.ac.tuwien.big.roverml";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Parallel Execution' of 'Command'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMAND__NO_PARALLEL_EXECUTION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Repeat At Least Once' of 'Repeat'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPEAT__REPEAT_AT_LEAST_ONCE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'At Least One Motor' of 'Rover'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROVER__AT_LEAST_ONE_MOTOR = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Name' of 'Rover'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROVER__UNIQUE_NAME = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only Terminate Once' of 'Block'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BLOCK__ONLY_TERMINATE_ONCE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'At Least One Incoming Transition' of 'Block'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BLOCK__AT_LEAST_ONE_INCOMING_TRANSITION = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source And Target In Same Block' of 'Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION__SOURCE_AND_TARGET_IN_SAME_BLOCK = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Triggered Transition After Infinite Command' of 'Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION__TRIGGERED_TRANSITION_AFTER_INFINITE_COMMAND = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Do Not Rotate Twice In ARow' of 'Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION__DO_NOT_ROTATE_TWICE_IN_AROW = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not Negative' of 'Time'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TIME__NOT_NEGATIVE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Positive Or Negative' of 'Velocity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VELOCITY__POSITIVE_OR_NEGATIVE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Outgoing Transition' of 'Terminate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TERMINATE__NO_OUTGOING_TRANSITION = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoverMLValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RoverMLPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RoverMLPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case RoverMLPackage.ROVER_PROGRAM:
				return validateRoverProgram((RoverProgram)value, diagnostics, context);
			case RoverMLPackage.COMMAND:
				return validateCommand((Command)value, diagnostics, context);
			case RoverMLPackage.MOVE:
				return validateMove((Move)value, diagnostics, context);
			case RoverMLPackage.SET_LIGHT_COLOR:
				return validateSetLightColor((SetLightColor)value, diagnostics, context);
			case RoverMLPackage.ROTATE:
				return validateRotate((Rotate)value, diagnostics, context);
			case RoverMLPackage.WAIT:
				return validateWait((Wait)value, diagnostics, context);
			case RoverMLPackage.REPEAT:
				return validateRepeat((Repeat)value, diagnostics, context);
			case RoverMLPackage.ROVER:
				return validateRover((Rover)value, diagnostics, context);
			case RoverMLPackage.BLOCK:
				return validateBlock((Block)value, diagnostics, context);
			case RoverMLPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case RoverMLPackage.TRIGGERED_TRANSITION:
				return validateTriggeredTransition((TriggeredTransition<?, ?>)value, diagnostics, context);
			case RoverMLPackage.GPS:
				return validateGPS((GPS)value, diagnostics, context);
			case RoverMLPackage.DISTANCE_SENSOR:
				return validateDistanceSensor((DistanceSensor)value, diagnostics, context);
			case RoverMLPackage.COMPASS:
				return validateCompass((Compass)value, diagnostics, context);
			case RoverMLPackage.SINGLE_QUANTITY:
				return validateSingleQuantity((SingleQuantity)value, diagnostics, context);
			case RoverMLPackage.TIME:
				return validateTime((Time)value, diagnostics, context);
			case RoverMLPackage.ANGLE:
				return validateAngle((Angle)value, diagnostics, context);
			case RoverMLPackage.VELOCITY:
				return validateVelocity((Velocity)value, diagnostics, context);
			case RoverMLPackage.LIGHT:
				return validateLight((Light)value, diagnostics, context);
			case RoverMLPackage.LENGTH:
				return validateLength((Length)value, diagnostics, context);
			case RoverMLPackage.SENSOR:
				return validateSensor((Sensor<?>)value, diagnostics, context);
			case RoverMLPackage.MOTOR:
				return validateMotor((Motor)value, diagnostics, context);
			case RoverMLPackage.TERMINATE:
				return validateTerminate((Terminate)value, diagnostics, context);
			case RoverMLPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case RoverMLPackage.ACTUATOR:
				return validateActuator((Actuator)value, diagnostics, context);
			case RoverMLPackage.ROVER_SYSTEM:
				return validateRoverSystem((RoverSystem)value, diagnostics, context);
			case RoverMLPackage.DISTANCE_SENSOR_TRIGGER:
				return validateDistanceSensorTrigger((DistanceSensorTrigger)value, diagnostics, context);
			case RoverMLPackage.GPS_TRIGGER:
				return validateGpsTrigger((GpsTrigger)value, diagnostics, context);
			case RoverMLPackage.COMPASS_TRIGGER:
				return validateCompassTrigger((CompassTrigger)value, diagnostics, context);
			case RoverMLPackage.QUANTITY:
				return validateQuantity((Quantity)value, diagnostics, context);
			case RoverMLPackage.POSITION:
				return validatePosition((Position)value, diagnostics, context);
			case RoverMLPackage.COLOR:
				return validateColor((Color)value, diagnostics, context);
			case RoverMLPackage.TIME_UNIT:
				return validateTimeUnit((TimeUnit)value, diagnostics, context);
			case RoverMLPackage.ANGLE_UNIT:
				return validateAngleUnit((AngleUnit)value, diagnostics, context);
			case RoverMLPackage.VELOCITY_UNIT:
				return validateVelocityUnit((VelocityUnit)value, diagnostics, context);
			case RoverMLPackage.LENGTH_UNIT:
				return validateLengthUnit((LengthUnit)value, diagnostics, context);
			case RoverMLPackage.COMPARISON_OPERATOR:
				return validateComparisonOperator((ComparisonOperator)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoverProgram(RoverProgram roverProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roverProgram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommand(Command command, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(command, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(command, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(command, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommand_noParallelExecution(command, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noParallelExecution constraint of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommand_noParallelExecution(Command command, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return command.noParallelExecution(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMove(Move move, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(move, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(move, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(move, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(move, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(move, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(move, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(move, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(move, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(move, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommand_noParallelExecution(move, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetLightColor(SetLightColor setLightColor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(setLightColor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(setLightColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(setLightColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(setLightColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(setLightColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(setLightColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(setLightColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(setLightColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(setLightColor, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommand_noParallelExecution(setLightColor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotate(Rotate rotate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rotate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rotate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rotate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rotate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rotate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rotate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rotate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rotate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rotate, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommand_noParallelExecution(rotate, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWait(Wait wait, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wait, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wait, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wait, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wait, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wait, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wait, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wait, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wait, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wait, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommand_noParallelExecution(wait, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeat(Repeat repeat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(repeat, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(repeat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(repeat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(repeat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(repeat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(repeat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(repeat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(repeat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(repeat, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommand_noParallelExecution(repeat, diagnostics, context);
		if (result || diagnostics != null) result &= validateBlock_atLeastOneIncomingTransition(repeat, diagnostics, context);
		if (result || diagnostics != null) result &= validateBlock_onlyTerminateOnce(repeat, diagnostics, context);
		if (result || diagnostics != null) result &= validateRepeat_repeatAtLeastOnce(repeat, diagnostics, context);
		return result;
	}

	/**
	 * Validates the repeatAtLeastOnce constraint of '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeat_repeatAtLeastOnce(Repeat repeat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return repeat.repeatAtLeastOnce(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRover(Rover rover, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rover, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rover, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rover, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rover, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rover, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rover, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rover, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rover, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rover, diagnostics, context);
		if (result || diagnostics != null) result &= validateRover_uniqueName(rover, diagnostics, context);
		if (result || diagnostics != null) result &= validateRover_atLeastOneMotor(rover, diagnostics, context);
		return result;
	}

	/**
	 * Validates the atLeastOneMotor constraint of '<em>Rover</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRover_atLeastOneMotor(Rover rover, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rover.atLeastOneMotor(diagnostics, context);
	}

	/**
	 * Validates the uniqueName constraint of '<em>Rover</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRover_uniqueName(Rover rover, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rover.uniqueName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock(Block block, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(block, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(block, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(block, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(block, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(block, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(block, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(block, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(block, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(block, diagnostics, context);
		if (result || diagnostics != null) result &= validateBlock_atLeastOneIncomingTransition(block, diagnostics, context);
		if (result || diagnostics != null) result &= validateBlock_onlyTerminateOnce(block, diagnostics, context);
		return result;
	}

	/**
	 * Validates the onlyTerminateOnce constraint of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock_onlyTerminateOnce(Block block, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return block.onlyTerminateOnce(diagnostics, context);
	}

	/**
	 * Validates the atLeastOneIncomingTransition constraint of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock_atLeastOneIncomingTransition(Block block, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return block.atLeastOneIncomingTransition(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_sourceAndTargetInSameBlock(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_triggeredTransitionAfterInfiniteCommand(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_doNotRotateTwiceInARow(transition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sourceAndTargetInSameBlock constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_sourceAndTargetInSameBlock(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transition.sourceAndTargetInSameBlock(diagnostics, context);
	}

	/**
	 * Validates the triggeredTransitionAfterInfiniteCommand constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_triggeredTransitionAfterInfiniteCommand(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transition.triggeredTransitionAfterInfiniteCommand(diagnostics, context);
	}

	/**
	 * Validates the doNotRotateTwiceInARow constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_doNotRotateTwiceInARow(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transition.doNotRotateTwiceInARow(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggeredTransition(TriggeredTransition<?, ?> triggeredTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(triggeredTransition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(triggeredTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(triggeredTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(triggeredTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(triggeredTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(triggeredTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(triggeredTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(triggeredTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(triggeredTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_sourceAndTargetInSameBlock(triggeredTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_triggeredTransitionAfterInfiniteCommand(triggeredTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_doNotRotateTwiceInARow(triggeredTransition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGPS(GPS gps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gps, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistanceSensor(DistanceSensor distanceSensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distanceSensor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompass(Compass compass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleQuantity(SingleQuantity singleQuantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleQuantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantity(Quantity quantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(Time time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(time, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(time, diagnostics, context);
		if (result || diagnostics != null) result &= validateTime_notNegative(time, diagnostics, context);
		return result;
	}

	/**
	 * Validates the notNegative constraint of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime_notNegative(Time time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return time.notNegative(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle(Angle angle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVelocity(Velocity velocity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(velocity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(velocity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(velocity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(velocity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(velocity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(velocity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(velocity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(velocity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(velocity, diagnostics, context);
		if (result || diagnostics != null) result &= validateVelocity_positiveOrNegative(velocity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the positiveOrNegative constraint of '<em>Velocity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVelocity_positiveOrNegative(Velocity velocity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return velocity.positiveOrNegative(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition(Position position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(position, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLight(Light light, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(light, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength(Length length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(length, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor<?> sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sensor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMotor(Motor motor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(motor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminate(Terminate terminate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(terminate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(terminate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(terminate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(terminate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(terminate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(terminate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(terminate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(terminate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(terminate, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommand_noParallelExecution(terminate, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminate_noOutgoingTransition(terminate, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noOutgoingTransition constraint of '<em>Terminate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminate_noOutgoingTransition(Terminate terminate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return terminate.noOutgoingTransition(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuator(Actuator actuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actuator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoverSystem(RoverSystem roverSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roverSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistanceSensorTrigger(DistanceSensorTrigger distanceSensorTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(distanceSensorTrigger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(distanceSensorTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(distanceSensorTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(distanceSensorTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(distanceSensorTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(distanceSensorTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(distanceSensorTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(distanceSensorTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(distanceSensorTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_sourceAndTargetInSameBlock(distanceSensorTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_triggeredTransitionAfterInfiniteCommand(distanceSensorTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_doNotRotateTwiceInARow(distanceSensorTrigger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsTrigger(GpsTrigger gpsTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gpsTrigger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gpsTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gpsTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gpsTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gpsTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gpsTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gpsTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gpsTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gpsTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_sourceAndTargetInSameBlock(gpsTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_triggeredTransitionAfterInfiniteCommand(gpsTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_doNotRotateTwiceInARow(gpsTrigger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompassTrigger(CompassTrigger compassTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compassTrigger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compassTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compassTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compassTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compassTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compassTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compassTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compassTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compassTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_sourceAndTargetInSameBlock(compassTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_triggeredTransitionAfterInfiniteCommand(compassTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_doNotRotateTwiceInARow(compassTrigger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor(Color color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnit(TimeUnit timeUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleUnit(AngleUnit angleUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVelocityUnit(VelocityUnit velocityUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthUnit(LengthUnit lengthUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonOperator(ComparisonOperator comparisonOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RoverMLValidator

/**
 */
package at.ac.tuwien.big.roverml.impl;

import at.ac.tuwien.big.roverml.Actuator;
import at.ac.tuwien.big.roverml.Angle;
import at.ac.tuwien.big.roverml.AngleUnit;
import at.ac.tuwien.big.roverml.Block;
import at.ac.tuwien.big.roverml.Color;
import at.ac.tuwien.big.roverml.Command;
import at.ac.tuwien.big.roverml.ComparisonOperator;
import at.ac.tuwien.big.roverml.Compass;
import at.ac.tuwien.big.roverml.CompassTrigger;
import at.ac.tuwien.big.roverml.Component;
import at.ac.tuwien.big.roverml.DistanceSensor;
import at.ac.tuwien.big.roverml.DistanceSensorTrigger;
import at.ac.tuwien.big.roverml.GpsTrigger;
import at.ac.tuwien.big.roverml.Length;
import at.ac.tuwien.big.roverml.LengthUnit;
import at.ac.tuwien.big.roverml.Light;
import at.ac.tuwien.big.roverml.Motor;
import at.ac.tuwien.big.roverml.Move;
import at.ac.tuwien.big.roverml.NamedElement;
import at.ac.tuwien.big.roverml.Position;
import at.ac.tuwien.big.roverml.Quantity;
import at.ac.tuwien.big.roverml.Repeat;
import at.ac.tuwien.big.roverml.Rotate;
import at.ac.tuwien.big.roverml.Rover;
import at.ac.tuwien.big.roverml.RoverMLFactory;
import at.ac.tuwien.big.roverml.RoverMLPackage;
import at.ac.tuwien.big.roverml.RoverProgram;
import at.ac.tuwien.big.roverml.RoverSystem;
import at.ac.tuwien.big.roverml.Sensor;
import at.ac.tuwien.big.roverml.SetLightColor;
import at.ac.tuwien.big.roverml.SingleQuantity;
import at.ac.tuwien.big.roverml.Terminate;
import at.ac.tuwien.big.roverml.Time;
import at.ac.tuwien.big.roverml.TimeUnit;
import at.ac.tuwien.big.roverml.Transition;
import at.ac.tuwien.big.roverml.TriggeredTransition;
import at.ac.tuwien.big.roverml.Velocity;
import at.ac.tuwien.big.roverml.VelocityUnit;
import at.ac.tuwien.big.roverml.Wait;

import at.ac.tuwien.big.roverml.util.RoverMLValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoverMLPackageImpl extends EPackageImpl implements RoverMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roverProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setLightColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggeredTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleQuantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass velocityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roverSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceSensorTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compassTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum angleUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum velocityUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lengthUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RoverMLPackageImpl() {
		super(eNS_URI, RoverMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RoverMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RoverMLPackage init() {
		if (isInited) return (RoverMLPackage)EPackage.Registry.INSTANCE.getEPackage(RoverMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRoverMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RoverMLPackageImpl theRoverMLPackage = registeredRoverMLPackage instanceof RoverMLPackageImpl ? (RoverMLPackageImpl)registeredRoverMLPackage : new RoverMLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRoverMLPackage.createPackageContents();

		// Initialize created meta-data
		theRoverMLPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRoverMLPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RoverMLValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRoverMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RoverMLPackage.eNS_URI, theRoverMLPackage);
		return theRoverMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoverProgram() {
		return roverProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoverProgram_Block() {
		return (EReference)roverProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoverProgram_Rover() {
		return (EReference)roverProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommand_Incoming() {
		return (EReference)commandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommand_Outgoing() {
		return (EReference)commandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommand__NoParallelExecution__DiagnosticChain_Map() {
		return commandEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMove() {
		return moveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMove_Speed() {
		return (EReference)moveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMove_Distance() {
		return (EReference)moveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetLightColor() {
		return setLightColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetLightColor_Color() {
		return (EAttribute)setLightColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetLightColor_Lights() {
		return (EReference)setLightColorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotate() {
		return rotateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRotate_Angle() {
		return (EReference)rotateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWait() {
		return waitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWait_Duration() {
		return (EReference)waitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeat() {
		return repeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepeat_Count() {
		return (EAttribute)repeatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRepeat__RepeatAtLeastOnce__DiagnosticChain_Map() {
		return repeatEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRover() {
		return roverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRover_Components() {
		return (EReference)roverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRover__AtLeastOneMotor__DiagnosticChain_Map() {
		return roverEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRover__UniqueName__DiagnosticChain_Map() {
		return roverEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Commands() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Transitions() {
		return (EReference)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlock__OnlyTerminateOnce__DiagnosticChain_Map() {
		return blockEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlock__AtLeastOneIncomingTransition__DiagnosticChain_Map() {
		return blockEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__TriggeredTransitionAfterInfiniteCommand__DiagnosticChain_Map() {
		return transitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__DoNotRotateTwiceInARow__DiagnosticChain_Map() {
		return transitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__SourceAndTargetInSameBlock__DiagnosticChain_Map() {
		return transitionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggeredTransition() {
		return triggeredTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggeredTransition_Sensor() {
		return (EReference)triggeredTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriggeredTransition_Operator() {
		return (EAttribute)triggeredTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggeredTransition_ComparisonValue() {
		return (EReference)triggeredTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPS() {
		return gpsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistanceSensor() {
		return distanceSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompass() {
		return compassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleQuantity() {
		return singleQuantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleQuantity_Value() {
		return (EAttribute)singleQuantityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantity() {
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_TimeUnit() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTime__NotNegative__DiagnosticChain_Map() {
		return timeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngle() {
		return angleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngle_AngleUnit() {
		return (EAttribute)angleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVelocity() {
		return velocityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVelocity_VelocityUnit() {
		return (EAttribute)velocityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVelocity__PositiveOrNegative__DiagnosticChain_Map() {
		return velocityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPosition_X() {
		return (EReference)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPosition_Y() {
		return (EReference)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLight() {
		return lightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLength() {
		return lengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLength_LengthUnit() {
		return (EAttribute)lengthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_LastSensedValue() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotor() {
		return motorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminate() {
		return terminateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminate__NoOutgoingTransition__DiagnosticChain_Map() {
		return terminateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Kind() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoverSystem() {
		return roverSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoverSystem_Rovers() {
		return (EReference)roverSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoverSystem_RoverPrograms() {
		return (EReference)roverSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistanceSensorTrigger() {
		return distanceSensorTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGpsTrigger() {
		return gpsTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompassTrigger() {
		return compassTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnit() {
		return timeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAngleUnit() {
		return angleUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVelocityUnit() {
		return velocityUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLengthUnit() {
		return lengthUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonOperator() {
		return comparisonOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoverMLFactory getRoverMLFactory() {
		return (RoverMLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		roverProgramEClass = createEClass(ROVER_PROGRAM);
		createEReference(roverProgramEClass, ROVER_PROGRAM__BLOCK);
		createEReference(roverProgramEClass, ROVER_PROGRAM__ROVER);

		commandEClass = createEClass(COMMAND);
		createEReference(commandEClass, COMMAND__INCOMING);
		createEReference(commandEClass, COMMAND__OUTGOING);
		createEOperation(commandEClass, COMMAND___NO_PARALLEL_EXECUTION__DIAGNOSTICCHAIN_MAP);

		moveEClass = createEClass(MOVE);
		createEReference(moveEClass, MOVE__SPEED);
		createEReference(moveEClass, MOVE__DISTANCE);

		setLightColorEClass = createEClass(SET_LIGHT_COLOR);
		createEAttribute(setLightColorEClass, SET_LIGHT_COLOR__COLOR);
		createEReference(setLightColorEClass, SET_LIGHT_COLOR__LIGHTS);

		rotateEClass = createEClass(ROTATE);
		createEReference(rotateEClass, ROTATE__ANGLE);

		waitEClass = createEClass(WAIT);
		createEReference(waitEClass, WAIT__DURATION);

		repeatEClass = createEClass(REPEAT);
		createEAttribute(repeatEClass, REPEAT__COUNT);
		createEOperation(repeatEClass, REPEAT___REPEAT_AT_LEAST_ONCE__DIAGNOSTICCHAIN_MAP);

		roverEClass = createEClass(ROVER);
		createEReference(roverEClass, ROVER__COMPONENTS);
		createEOperation(roverEClass, ROVER___AT_LEAST_ONE_MOTOR__DIAGNOSTICCHAIN_MAP);
		createEOperation(roverEClass, ROVER___UNIQUE_NAME__DIAGNOSTICCHAIN_MAP);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__COMMANDS);
		createEReference(blockEClass, BLOCK__TRANSITIONS);
		createEOperation(blockEClass, BLOCK___ONLY_TERMINATE_ONCE__DIAGNOSTICCHAIN_MAP);
		createEOperation(blockEClass, BLOCK___AT_LEAST_ONE_INCOMING_TRANSITION__DIAGNOSTICCHAIN_MAP);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEOperation(transitionEClass, TRANSITION___TRIGGERED_TRANSITION_AFTER_INFINITE_COMMAND__DIAGNOSTICCHAIN_MAP);
		createEOperation(transitionEClass, TRANSITION___DO_NOT_ROTATE_TWICE_IN_AROW__DIAGNOSTICCHAIN_MAP);
		createEOperation(transitionEClass, TRANSITION___SOURCE_AND_TARGET_IN_SAME_BLOCK__DIAGNOSTICCHAIN_MAP);

		triggeredTransitionEClass = createEClass(TRIGGERED_TRANSITION);
		createEReference(triggeredTransitionEClass, TRIGGERED_TRANSITION__SENSOR);
		createEAttribute(triggeredTransitionEClass, TRIGGERED_TRANSITION__OPERATOR);
		createEReference(triggeredTransitionEClass, TRIGGERED_TRANSITION__COMPARISON_VALUE);

		gpsEClass = createEClass(GPS);

		distanceSensorEClass = createEClass(DISTANCE_SENSOR);

		compassEClass = createEClass(COMPASS);

		singleQuantityEClass = createEClass(SINGLE_QUANTITY);
		createEAttribute(singleQuantityEClass, SINGLE_QUANTITY__VALUE);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__TIME_UNIT);
		createEOperation(timeEClass, TIME___NOT_NEGATIVE__DIAGNOSTICCHAIN_MAP);

		angleEClass = createEClass(ANGLE);
		createEAttribute(angleEClass, ANGLE__ANGLE_UNIT);

		velocityEClass = createEClass(VELOCITY);
		createEAttribute(velocityEClass, VELOCITY__VELOCITY_UNIT);
		createEOperation(velocityEClass, VELOCITY___POSITIVE_OR_NEGATIVE__DIAGNOSTICCHAIN_MAP);

		lightEClass = createEClass(LIGHT);

		lengthEClass = createEClass(LENGTH);
		createEAttribute(lengthEClass, LENGTH__LENGTH_UNIT);

		sensorEClass = createEClass(SENSOR);
		createEReference(sensorEClass, SENSOR__LAST_SENSED_VALUE);

		motorEClass = createEClass(MOTOR);

		terminateEClass = createEClass(TERMINATE);
		createEOperation(terminateEClass, TERMINATE___NO_OUTGOING_TRANSITION__DIAGNOSTICCHAIN_MAP);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__KIND);

		actuatorEClass = createEClass(ACTUATOR);

		roverSystemEClass = createEClass(ROVER_SYSTEM);
		createEReference(roverSystemEClass, ROVER_SYSTEM__ROVERS);
		createEReference(roverSystemEClass, ROVER_SYSTEM__ROVER_PROGRAMS);

		distanceSensorTriggerEClass = createEClass(DISTANCE_SENSOR_TRIGGER);

		gpsTriggerEClass = createEClass(GPS_TRIGGER);

		compassTriggerEClass = createEClass(COMPASS_TRIGGER);

		quantityEClass = createEClass(QUANTITY);

		positionEClass = createEClass(POSITION);
		createEReference(positionEClass, POSITION__X);
		createEReference(positionEClass, POSITION__Y);

		// Create enums
		colorEEnum = createEEnum(COLOR);
		timeUnitEEnum = createEEnum(TIME_UNIT);
		angleUnitEEnum = createEEnum(ANGLE_UNIT);
		velocityUnitEEnum = createEEnum(VELOCITY_UNIT);
		lengthUnitEEnum = createEEnum(LENGTH_UNIT);
		comparisonOperatorEEnum = createEEnum(COMPARISON_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter triggeredTransitionEClass_SensorType = addETypeParameter(triggeredTransitionEClass, "SensorType");
		ETypeParameter triggeredTransitionEClass_QuantityType = addETypeParameter(triggeredTransitionEClass, "QuantityType");
		ETypeParameter sensorEClass_QuantityType = addETypeParameter(sensorEClass, "QuantityType");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getSensor());
		EGenericType g2 = createEGenericType(triggeredTransitionEClass_QuantityType);
		g1.getETypeArguments().add(g2);
		triggeredTransitionEClass_SensorType.getEBounds().add(g1);
		g1 = createEGenericType(this.getQuantity());
		triggeredTransitionEClass_QuantityType.getEBounds().add(g1);

		// Add supertypes to classes
		roverProgramEClass.getESuperTypes().add(this.getNamedElement());
		commandEClass.getESuperTypes().add(this.getNamedElement());
		moveEClass.getESuperTypes().add(this.getCommand());
		setLightColorEClass.getESuperTypes().add(this.getCommand());
		rotateEClass.getESuperTypes().add(this.getCommand());
		waitEClass.getESuperTypes().add(this.getCommand());
		repeatEClass.getESuperTypes().add(this.getCommand());
		repeatEClass.getESuperTypes().add(this.getBlock());
		roverEClass.getESuperTypes().add(this.getNamedElement());
		transitionEClass.getESuperTypes().add(this.getNamedElement());
		triggeredTransitionEClass.getESuperTypes().add(this.getTransition());
		g1 = createEGenericType(this.getSensor());
		g2 = createEGenericType(this.getPosition());
		g1.getETypeArguments().add(g2);
		gpsEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSensor());
		g2 = createEGenericType(this.getLength());
		g1.getETypeArguments().add(g2);
		distanceSensorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSensor());
		g2 = createEGenericType(this.getAngle());
		g1.getETypeArguments().add(g2);
		compassEClass.getEGenericSuperTypes().add(g1);
		singleQuantityEClass.getESuperTypes().add(this.getQuantity());
		timeEClass.getESuperTypes().add(this.getSingleQuantity());
		angleEClass.getESuperTypes().add(this.getSingleQuantity());
		velocityEClass.getESuperTypes().add(this.getSingleQuantity());
		lightEClass.getESuperTypes().add(this.getActuator());
		lengthEClass.getESuperTypes().add(this.getSingleQuantity());
		sensorEClass.getESuperTypes().add(this.getComponent());
		motorEClass.getESuperTypes().add(this.getActuator());
		terminateEClass.getESuperTypes().add(this.getCommand());
		componentEClass.getESuperTypes().add(this.getNamedElement());
		actuatorEClass.getESuperTypes().add(this.getComponent());
		g1 = createEGenericType(this.getTriggeredTransition());
		g2 = createEGenericType(this.getDistanceSensor());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getLength());
		g1.getETypeArguments().add(g2);
		distanceSensorTriggerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTriggeredTransition());
		g2 = createEGenericType(this.getGPS());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getPosition());
		g1.getETypeArguments().add(g2);
		gpsTriggerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTriggeredTransition());
		g2 = createEGenericType(this.getCompass());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getAngle());
		g1.getETypeArguments().add(g2);
		compassTriggerEClass.getEGenericSuperTypes().add(g1);
		positionEClass.getESuperTypes().add(this.getQuantity());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roverProgramEClass, RoverProgram.class, "RoverProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoverProgram_Block(), this.getBlock(), null, "block", null, 1, 1, RoverProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoverProgram_Rover(), this.getRover(), null, "rover", null, 1, 1, RoverProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommand_Incoming(), this.getTransition(), null, "incoming", null, 0, -1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCommand_Outgoing(), this.getTransition(), null, "outgoing", null, 0, -1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCommand__NoParallelExecution__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noParallelExecution", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(moveEClass, Move.class, "Move", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMove_Speed(), this.getVelocity(), null, "speed", null, 1, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMove_Distance(), this.getLength(), null, "distance", null, 0, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setLightColorEClass, SetLightColor.class, "SetLightColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetLightColor_Color(), this.getColor(), "color", null, 0, 1, SetLightColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetLightColor_Lights(), this.getLight(), null, "lights", null, 1, -1, SetLightColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotateEClass, Rotate.class, "Rotate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRotate_Angle(), this.getAngle(), null, "angle", null, 1, 1, Rotate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitEClass, Wait.class, "Wait", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWait_Duration(), this.getTime(), null, "duration", null, 1, 1, Wait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatEClass, Repeat.class, "Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepeat_Count(), ecorePackage.getEInt(), "count", "0", 1, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRepeat__RepeatAtLeastOnce__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "repeatAtLeastOnce", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(roverEClass, Rover.class, "Rover", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRover_Components(), this.getComponent(), null, "components", null, 0, -1, Rover.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRover__AtLeastOneMotor__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "atLeastOneMotor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRover__UniqueName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "uniqueName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Commands(), this.getCommand(), null, "commands", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getBlock__OnlyTerminateOnce__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "onlyTerminateOnce", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBlock__AtLeastOneIncomingTransition__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "atLeastOneIncomingTransition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Source(), this.getCommand(), null, "source", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getCommand(), null, "target", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTransition__TriggeredTransitionAfterInfiniteCommand__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "triggeredTransitionAfterInfiniteCommand", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransition__DoNotRotateTwiceInARow__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "doNotRotateTwiceInARow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransition__SourceAndTargetInSameBlock__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sourceAndTargetInSameBlock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(triggeredTransitionEClass, TriggeredTransition.class, "TriggeredTransition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(triggeredTransitionEClass_SensorType);
		initEReference(getTriggeredTransition_Sensor(), g1, null, "sensor", null, 1, 1, TriggeredTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriggeredTransition_Operator(), this.getComparisonOperator(), "operator", null, 1, 1, TriggeredTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(triggeredTransitionEClass_QuantityType);
		initEReference(getTriggeredTransition_ComparisonValue(), g1, null, "comparisonValue", null, 1, 1, TriggeredTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gpsEClass, at.ac.tuwien.big.roverml.GPS.class, "GPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(distanceSensorEClass, DistanceSensor.class, "DistanceSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compassEClass, Compass.class, "Compass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleQuantityEClass, SingleQuantity.class, "SingleQuantity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleQuantity_Value(), ecorePackage.getEFloat(), "value", null, 1, 1, SingleQuantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_TimeUnit(), this.getTimeUnit(), "timeUnit", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTime__NotNegative__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "notNegative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(angleEClass, Angle.class, "Angle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAngle_AngleUnit(), this.getAngleUnit(), "angleUnit", null, 1, 1, Angle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(velocityEClass, Velocity.class, "Velocity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVelocity_VelocityUnit(), this.getVelocityUnit(), "velocityUnit", null, 1, 1, Velocity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVelocity__PositiveOrNegative__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "positiveOrNegative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lightEClass, Light.class, "Light", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lengthEClass, Length.class, "Length", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLength_LengthUnit(), this.getLengthUnit(), "lengthUnit", null, 1, 1, Length.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(sensorEClass_QuantityType);
		initEReference(getSensor_LastSensedValue(), g1, null, "lastSensedValue", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(motorEClass, Motor.class, "Motor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(terminateEClass, Terminate.class, "Terminate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getTerminate__NoOutgoingTransition__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noOutgoingTransition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Kind(), ecorePackage.getEString(), "kind", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorEClass, Actuator.class, "Actuator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roverSystemEClass, RoverSystem.class, "RoverSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoverSystem_Rovers(), this.getRover(), null, "rovers", null, 0, -1, RoverSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoverSystem_RoverPrograms(), this.getRoverProgram(), null, "roverPrograms", null, 0, -1, RoverSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distanceSensorTriggerEClass, DistanceSensorTrigger.class, "DistanceSensorTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gpsTriggerEClass, GpsTrigger.class, "GpsTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compassTriggerEClass, CompassTrigger.class, "CompassTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantityEClass, Quantity.class, "Quantity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPosition_X(), this.getLength(), null, "x", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPosition_Y(), this.getLength(), null, "y", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.NONE);
		addEEnumLiteral(colorEEnum, Color.RED);
		addEEnumLiteral(colorEEnum, Color.GREEN);
		addEEnumLiteral(colorEEnum, Color.BLUE);
		addEEnumLiteral(colorEEnum, Color.YELLOW);

		initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
		addEEnumLiteral(timeUnitEEnum, TimeUnit.NS);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MS);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.S);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MIN);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.H);

		initEEnum(angleUnitEEnum, AngleUnit.class, "AngleUnit");
		addEEnumLiteral(angleUnitEEnum, AngleUnit.RADIAN);
		addEEnumLiteral(angleUnitEEnum, AngleUnit.DEGREE);

		initEEnum(velocityUnitEEnum, VelocityUnit.class, "VelocityUnit");
		addEEnumLiteral(velocityUnitEEnum, VelocityUnit.MM_PER_S);
		addEEnumLiteral(velocityUnitEEnum, VelocityUnit.CM_PER_S);

		initEEnum(lengthUnitEEnum, LengthUnit.class, "LengthUnit");
		addEEnumLiteral(lengthUnitEEnum, LengthUnit.MM);
		addEEnumLiteral(lengthUnitEEnum, LengthUnit.CM);
		addEEnumLiteral(lengthUnitEEnum, LengthUnit.M);

		initEEnum(comparisonOperatorEEnum, ComparisonOperator.class, "ComparisonOperator");
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.SMALLER);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.EQUALS);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.UNEQUAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (commandEClass,
		   source,
		   new String[] {
			   "constraints", "noParallelExecution"
		   });
		addAnnotation
		  (repeatEClass,
		   source,
		   new String[] {
			   "constraints", "repeatAtLeastOnce"
		   });
		addAnnotation
		  (roverEClass,
		   source,
		   new String[] {
			   "constraints", "uniqueName"
		   });
		addAnnotation
		  (blockEClass,
		   source,
		   new String[] {
			   "constraints", "atLeastOneIncomingTransition"
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[] {
			   "constraints", "sourceAndTargetInSameBlock"
		   });
		addAnnotation
		  (timeEClass,
		   source,
		   new String[] {
			   "constraints", "notNegative"
		   });
		addAnnotation
		  (velocityEClass,
		   source,
		   new String[] {
			   "constraints", "positiveOrNegative"
		   });
		addAnnotation
		  (terminateEClass,
		   source,
		   new String[] {
			   "constraints", "noOutgoingTransition"
		   });
	}

} //RoverMLPackageImpl

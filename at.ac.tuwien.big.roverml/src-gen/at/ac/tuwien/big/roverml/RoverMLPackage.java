/**
 */
package at.ac.tuwien.big.roverml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.roverml.RoverMLFactory
 * @model kind="package"
 * @generated
 */
public interface RoverMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "roverml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.big.tuwien.ac.at/roverml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "at.ac.tuwien.big.roverml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoverMLPackage eINSTANCE = at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.NamedElementImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.RoverProgramImpl <em>Rover Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.RoverProgramImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getRoverProgram()
	 * @generated
	 */
	int ROVER_PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_PROGRAM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_PROGRAM__BLOCK = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rover</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_PROGRAM__ROVER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rover Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_PROGRAM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rover Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_PROGRAM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.CommandImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__INCOMING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>No Parallel Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND___NO_PARALLEL_EXECUTION__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.MoveImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__NAME = COMMAND__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__INCOMING = COMMAND__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__OUTGOING = COMMAND__OUTGOING;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__SPEED = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__DISTANCE = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>No Parallel Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE___NO_PARALLEL_EXECUTION__DIAGNOSTICCHAIN_MAP = COMMAND___NO_PARALLEL_EXECUTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.SetLightColorImpl <em>Set Light Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.SetLightColorImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getSetLightColor()
	 * @generated
	 */
	int SET_LIGHT_COLOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR__NAME = COMMAND__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR__INCOMING = COMMAND__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR__OUTGOING = COMMAND__OUTGOING;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR__COLOR = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lights</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR__LIGHTS = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Light Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>No Parallel Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR___NO_PARALLEL_EXECUTION__DIAGNOSTICCHAIN_MAP = COMMAND___NO_PARALLEL_EXECUTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Set Light Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIGHT_COLOR_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.RotateImpl <em>Rotate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.RotateImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getRotate()
	 * @generated
	 */
	int ROTATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__NAME = COMMAND__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__INCOMING = COMMAND__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__OUTGOING = COMMAND__OUTGOING;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__ANGLE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>No Parallel Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE___NO_PARALLEL_EXECUTION__DIAGNOSTICCHAIN_MAP = COMMAND___NO_PARALLEL_EXECUTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.WaitImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__NAME = COMMAND__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__INCOMING = COMMAND__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__OUTGOING = COMMAND__OUTGOING;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__DURATION = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>No Parallel Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT___NO_PARALLEL_EXECUTION__DIAGNOSTICCHAIN_MAP = COMMAND___NO_PARALLEL_EXECUTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.RepeatImpl <em>Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.RepeatImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getRepeat()
	 * @generated
	 */
	int REPEAT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__NAME = COMMAND__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__INCOMING = COMMAND__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OUTGOING = COMMAND__OUTGOING;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__COMMANDS = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__TRANSITIONS = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>No Parallel Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT___NO_PARALLEL_EXECUTION__DIAGNOSTICCHAIN_MAP = COMMAND___NO_PARALLEL_EXECUTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Only Terminate Once</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT___ONLY_TERMINATE_ONCE__DIAGNOSTICCHAIN_MAP = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>At Least One Incoming Transition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT___AT_LEAST_ONE_INCOMING_TRANSITION__DIAGNOSTICCHAIN_MAP = COMMAND_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Repeat At Least Once</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT___REPEAT_AT_LEAST_ONCE__DIAGNOSTICCHAIN_MAP = COMMAND_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.RoverImpl <em>Rover</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.RoverImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getRover()
	 * @generated
	 */
	int ROVER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER__COMPONENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>At Least One Motor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER___AT_LEAST_ONE_MOTOR__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER___UNIQUE_NAME__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.BlockImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 9;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__COMMANDS = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TRANSITIONS = 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Only Terminate Once</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK___ONLY_TERMINATE_ONCE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>At Least One Incoming Transition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK___AT_LEAST_ONE_INCOMING_TRANSITION__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.TransitionImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Triggered Transition After Infinite Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___TRIGGERED_TRANSITION_AFTER_INFINITE_COMMAND__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Do Not Rotate Twice In ARow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___DO_NOT_ROTATE_TWICE_IN_AROW__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Source And Target In Same Block</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___SOURCE_AND_TARGET_IN_SAME_BLOCK__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.TriggeredTransitionImpl <em>Triggered Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.TriggeredTransitionImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getTriggeredTransition()
	 * @generated
	 */
	int TRIGGERED_TRANSITION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_TRANSITION__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_TRANSITION__TARGET = TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_TRANSITION__SENSOR = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_TRANSITION__OPERATOR = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comparison Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_TRANSITION__COMPARISON_VALUE = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Triggered Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Triggered Transition After Infinite Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_TRANSITION___TRIGGERED_TRANSITION_AFTER_INFINITE_COMMAND__DIAGNOSTICCHAIN_MAP = TRANSITION___TRIGGERED_TRANSITION_AFTER_INFINITE_COMMAND__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Do Not Rotate Twice In ARow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_TRANSITION___DO_NOT_ROTATE_TWICE_IN_AROW__DIAGNOSTICCHAIN_MAP = TRANSITION___DO_NOT_ROTATE_TWICE_IN_AROW__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source And Target In Same Block</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_TRANSITION___SOURCE_AND_TARGET_IN_SAME_BLOCK__DIAGNOSTICCHAIN_MAP = TRANSITION___SOURCE_AND_TARGET_IN_SAME_BLOCK__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Triggered Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_TRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.ComponentImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__KIND = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.SensorImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__KIND = COMPONENT__KIND;

	/**
	 * The feature id for the '<em><b>Last Sensed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__LAST_SENSED_VALUE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.GPSImpl <em>GPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.GPSImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getGPS()
	 * @generated
	 */
	int GPS = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__KIND = SENSOR__KIND;

	/**
	 * The feature id for the '<em><b>Last Sensed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__LAST_SENSED_VALUE = SENSOR__LAST_SENSED_VALUE;

	/**
	 * The number of structural features of the '<em>GPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.DistanceSensorImpl <em>Distance Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.DistanceSensorImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getDistanceSensor()
	 * @generated
	 */
	int DISTANCE_SENSOR = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR__KIND = SENSOR__KIND;

	/**
	 * The feature id for the '<em><b>Last Sensed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR__LAST_SENSED_VALUE = SENSOR__LAST_SENSED_VALUE;

	/**
	 * The number of structural features of the '<em>Distance Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Distance Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.CompassImpl <em>Compass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.CompassImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getCompass()
	 * @generated
	 */
	int COMPASS = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS__KIND = SENSOR__KIND;

	/**
	 * The feature id for the '<em><b>Last Sensed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS__LAST_SENSED_VALUE = SENSOR__LAST_SENSED_VALUE;

	/**
	 * The number of structural features of the '<em>Compass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.QuantityImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 30;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.SingleQuantityImpl <em>Single Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.SingleQuantityImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getSingleQuantity()
	 * @generated
	 */
	int SINGLE_QUANTITY = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUANTITY__VALUE = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUANTITY_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUANTITY_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.TimeImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__VALUE = SINGLE_QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__TIME_UNIT = SINGLE_QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = SINGLE_QUANTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Not Negative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME___NOT_NEGATIVE__DIAGNOSTICCHAIN_MAP = SINGLE_QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = SINGLE_QUANTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.AngleImpl <em>Angle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.AngleImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getAngle()
	 * @generated
	 */
	int ANGLE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE__VALUE = SINGLE_QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Angle Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE__ANGLE_UNIT = SINGLE_QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_FEATURE_COUNT = SINGLE_QUANTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_OPERATION_COUNT = SINGLE_QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.VelocityImpl <em>Velocity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.VelocityImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getVelocity()
	 * @generated
	 */
	int VELOCITY = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY__VALUE = SINGLE_QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Velocity Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY__VELOCITY_UNIT = SINGLE_QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Velocity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY_FEATURE_COUNT = SINGLE_QUANTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Positive Or Negative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY___POSITIVE_OR_NEGATIVE__DIAGNOSTICCHAIN_MAP = SINGLE_QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Velocity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELOCITY_OPERATION_COUNT = SINGLE_QUANTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.PositionImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 31;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.ActuatorImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__KIND = COMPONENT__KIND;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.LightImpl <em>Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.LightImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getLight()
	 * @generated
	 */
	int LIGHT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__NAME = ACTUATOR__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__KIND = ACTUATOR__KIND;

	/**
	 * The number of structural features of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.LengthImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__VALUE = SINGLE_QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Length Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__LENGTH_UNIT = SINGLE_QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FEATURE_COUNT = SINGLE_QUANTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_OPERATION_COUNT = SINGLE_QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.MotorImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getMotor()
	 * @generated
	 */
	int MOTOR = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__NAME = ACTUATOR__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__KIND = ACTUATOR__KIND;

	/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.TerminateImpl <em>Terminate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.TerminateImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getTerminate()
	 * @generated
	 */
	int TERMINATE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE__NAME = COMMAND__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE__INCOMING = COMMAND__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE__OUTGOING = COMMAND__OUTGOING;

	/**
	 * The number of structural features of the '<em>Terminate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>No Parallel Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE___NO_PARALLEL_EXECUTION__DIAGNOSTICCHAIN_MAP = COMMAND___NO_PARALLEL_EXECUTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Outgoing Transition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE___NO_OUTGOING_TRANSITION__DIAGNOSTICCHAIN_MAP = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Terminate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.RoverSystemImpl <em>Rover System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.RoverSystemImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getRoverSystem()
	 * @generated
	 */
	int ROVER_SYSTEM = 26;

	/**
	 * The feature id for the '<em><b>Rovers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SYSTEM__ROVERS = 0;

	/**
	 * The feature id for the '<em><b>Rover Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SYSTEM__ROVER_PROGRAMS = 1;

	/**
	 * The number of structural features of the '<em>Rover System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rover System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.DistanceSensorTriggerImpl <em>Distance Sensor Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.DistanceSensorTriggerImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getDistanceSensorTrigger()
	 * @generated
	 */
	int DISTANCE_SENSOR_TRIGGER = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER__NAME = TRIGGERED_TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER__SOURCE = TRIGGERED_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER__TARGET = TRIGGERED_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER__SENSOR = TRIGGERED_TRANSITION__SENSOR;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER__OPERATOR = TRIGGERED_TRANSITION__OPERATOR;

	/**
	 * The feature id for the '<em><b>Comparison Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER__COMPARISON_VALUE = TRIGGERED_TRANSITION__COMPARISON_VALUE;

	/**
	 * The number of structural features of the '<em>Distance Sensor Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER_FEATURE_COUNT = TRIGGERED_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Triggered Transition After Infinite Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER___TRIGGERED_TRANSITION_AFTER_INFINITE_COMMAND__DIAGNOSTICCHAIN_MAP = TRIGGERED_TRANSITION___TRIGGERED_TRANSITION_AFTER_INFINITE_COMMAND__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Do Not Rotate Twice In ARow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER___DO_NOT_ROTATE_TWICE_IN_AROW__DIAGNOSTICCHAIN_MAP = TRIGGERED_TRANSITION___DO_NOT_ROTATE_TWICE_IN_AROW__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source And Target In Same Block</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER___SOURCE_AND_TARGET_IN_SAME_BLOCK__DIAGNOSTICCHAIN_MAP = TRIGGERED_TRANSITION___SOURCE_AND_TARGET_IN_SAME_BLOCK__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Distance Sensor Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_TRIGGER_OPERATION_COUNT = TRIGGERED_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.GpsTriggerImpl <em>Gps Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.GpsTriggerImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getGpsTrigger()
	 * @generated
	 */
	int GPS_TRIGGER = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__NAME = TRIGGERED_TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__SOURCE = TRIGGERED_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__TARGET = TRIGGERED_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__SENSOR = TRIGGERED_TRANSITION__SENSOR;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__OPERATOR = TRIGGERED_TRANSITION__OPERATOR;

	/**
	 * The feature id for the '<em><b>Comparison Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER__COMPARISON_VALUE = TRIGGERED_TRANSITION__COMPARISON_VALUE;

	/**
	 * The number of structural features of the '<em>Gps Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER_FEATURE_COUNT = TRIGGERED_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Triggered Transition After Infinite Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER___TRIGGERED_TRANSITION_AFTER_INFINITE_COMMAND__DIAGNOSTICCHAIN_MAP = TRIGGERED_TRANSITION___TRIGGERED_TRANSITION_AFTER_INFINITE_COMMAND__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Do Not Rotate Twice In ARow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER___DO_NOT_ROTATE_TWICE_IN_AROW__DIAGNOSTICCHAIN_MAP = TRIGGERED_TRANSITION___DO_NOT_ROTATE_TWICE_IN_AROW__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source And Target In Same Block</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER___SOURCE_AND_TARGET_IN_SAME_BLOCK__DIAGNOSTICCHAIN_MAP = TRIGGERED_TRANSITION___SOURCE_AND_TARGET_IN_SAME_BLOCK__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Gps Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_TRIGGER_OPERATION_COUNT = TRIGGERED_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.impl.CompassTriggerImpl <em>Compass Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.impl.CompassTriggerImpl
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getCompassTrigger()
	 * @generated
	 */
	int COMPASS_TRIGGER = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER__NAME = TRIGGERED_TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER__SOURCE = TRIGGERED_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER__TARGET = TRIGGERED_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER__SENSOR = TRIGGERED_TRANSITION__SENSOR;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER__OPERATOR = TRIGGERED_TRANSITION__OPERATOR;

	/**
	 * The feature id for the '<em><b>Comparison Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER__COMPARISON_VALUE = TRIGGERED_TRANSITION__COMPARISON_VALUE;

	/**
	 * The number of structural features of the '<em>Compass Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER_FEATURE_COUNT = TRIGGERED_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Triggered Transition After Infinite Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER___TRIGGERED_TRANSITION_AFTER_INFINITE_COMMAND__DIAGNOSTICCHAIN_MAP = TRIGGERED_TRANSITION___TRIGGERED_TRANSITION_AFTER_INFINITE_COMMAND__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Do Not Rotate Twice In ARow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER___DO_NOT_ROTATE_TWICE_IN_AROW__DIAGNOSTICCHAIN_MAP = TRIGGERED_TRANSITION___DO_NOT_ROTATE_TWICE_IN_AROW__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source And Target In Same Block</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER___SOURCE_AND_TARGET_IN_SAME_BLOCK__DIAGNOSTICCHAIN_MAP = TRIGGERED_TRANSITION___SOURCE_AND_TARGET_IN_SAME_BLOCK__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Compass Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPASS_TRIGGER_OPERATION_COUNT = TRIGGERED_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = QUANTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.Color
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 32;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.TimeUnit
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 33;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.AngleUnit <em>Angle Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.AngleUnit
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getAngleUnit()
	 * @generated
	 */
	int ANGLE_UNIT = 34;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.VelocityUnit <em>Velocity Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.VelocityUnit
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getVelocityUnit()
	 * @generated
	 */
	int VELOCITY_UNIT = 35;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.LengthUnit <em>Length Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.LengthUnit
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getLengthUnit()
	 * @generated
	 */
	int LENGTH_UNIT = 36;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.roverml.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.roverml.ComparisonOperator
	 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 37;


	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see at.ac.tuwien.big.roverml.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.roverml.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.ac.tuwien.big.roverml.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.RoverProgram <em>Rover Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rover Program</em>'.
	 * @see at.ac.tuwien.big.roverml.RoverProgram
	 * @generated
	 */
	EClass getRoverProgram();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.roverml.RoverProgram#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see at.ac.tuwien.big.roverml.RoverProgram#getBlock()
	 * @see #getRoverProgram()
	 * @generated
	 */
	EReference getRoverProgram_Block();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.roverml.RoverProgram#getRover <em>Rover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rover</em>'.
	 * @see at.ac.tuwien.big.roverml.RoverProgram#getRover()
	 * @see #getRoverProgram()
	 * @generated
	 */
	EReference getRoverProgram_Rover();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see at.ac.tuwien.big.roverml.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the reference list '{@link at.ac.tuwien.big.roverml.Command#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see at.ac.tuwien.big.roverml.Command#getIncoming()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link at.ac.tuwien.big.roverml.Command#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see at.ac.tuwien.big.roverml.Command#getOutgoing()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Outgoing();

	/**
	 * Returns the meta object for the '{@link at.ac.tuwien.big.roverml.Command#noParallelExecution(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Parallel Execution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Parallel Execution</em>' operation.
	 * @see at.ac.tuwien.big.roverml.Command#noParallelExecution(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCommand__NoParallelExecution__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see at.ac.tuwien.big.roverml.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.roverml.Move#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speed</em>'.
	 * @see at.ac.tuwien.big.roverml.Move#getSpeed()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Speed();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.roverml.Move#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance</em>'.
	 * @see at.ac.tuwien.big.roverml.Move#getDistance()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Distance();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.SetLightColor <em>Set Light Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Light Color</em>'.
	 * @see at.ac.tuwien.big.roverml.SetLightColor
	 * @generated
	 */
	EClass getSetLightColor();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.roverml.SetLightColor#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see at.ac.tuwien.big.roverml.SetLightColor#getColor()
	 * @see #getSetLightColor()
	 * @generated
	 */
	EAttribute getSetLightColor_Color();

	/**
	 * Returns the meta object for the reference list '{@link at.ac.tuwien.big.roverml.SetLightColor#getLights <em>Lights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lights</em>'.
	 * @see at.ac.tuwien.big.roverml.SetLightColor#getLights()
	 * @see #getSetLightColor()
	 * @generated
	 */
	EReference getSetLightColor_Lights();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate</em>'.
	 * @see at.ac.tuwien.big.roverml.Rotate
	 * @generated
	 */
	EClass getRotate();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.roverml.Rotate#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see at.ac.tuwien.big.roverml.Rotate#getAngle()
	 * @see #getRotate()
	 * @generated
	 */
	EReference getRotate_Angle();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see at.ac.tuwien.big.roverml.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.roverml.Wait#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see at.ac.tuwien.big.roverml.Wait#getDuration()
	 * @see #getWait()
	 * @generated
	 */
	EReference getWait_Duration();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat</em>'.
	 * @see at.ac.tuwien.big.roverml.Repeat
	 * @generated
	 */
	EClass getRepeat();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.roverml.Repeat#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see at.ac.tuwien.big.roverml.Repeat#getCount()
	 * @see #getRepeat()
	 * @generated
	 */
	EAttribute getRepeat_Count();

	/**
	 * Returns the meta object for the '{@link at.ac.tuwien.big.roverml.Repeat#repeatAtLeastOnce(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Repeat At Least Once</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repeat At Least Once</em>' operation.
	 * @see at.ac.tuwien.big.roverml.Repeat#repeatAtLeastOnce(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRepeat__RepeatAtLeastOnce__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Rover <em>Rover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rover</em>'.
	 * @see at.ac.tuwien.big.roverml.Rover
	 * @generated
	 */
	EClass getRover();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.roverml.Rover#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see at.ac.tuwien.big.roverml.Rover#getComponents()
	 * @see #getRover()
	 * @generated
	 */
	EReference getRover_Components();

	/**
	 * Returns the meta object for the '{@link at.ac.tuwien.big.roverml.Rover#atLeastOneMotor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>At Least One Motor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>At Least One Motor</em>' operation.
	 * @see at.ac.tuwien.big.roverml.Rover#atLeastOneMotor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRover__AtLeastOneMotor__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link at.ac.tuwien.big.roverml.Rover#uniqueName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Name</em>' operation.
	 * @see at.ac.tuwien.big.roverml.Rover#uniqueName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRover__UniqueName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see at.ac.tuwien.big.roverml.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.roverml.Block#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see at.ac.tuwien.big.roverml.Block#getCommands()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Commands();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.roverml.Block#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see at.ac.tuwien.big.roverml.Block#getTransitions()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Transitions();

	/**
	 * Returns the meta object for the '{@link at.ac.tuwien.big.roverml.Block#onlyTerminateOnce(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Only Terminate Once</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Only Terminate Once</em>' operation.
	 * @see at.ac.tuwien.big.roverml.Block#onlyTerminateOnce(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBlock__OnlyTerminateOnce__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link at.ac.tuwien.big.roverml.Block#atLeastOneIncomingTransition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>At Least One Incoming Transition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>At Least One Incoming Transition</em>' operation.
	 * @see at.ac.tuwien.big.roverml.Block#atLeastOneIncomingTransition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBlock__AtLeastOneIncomingTransition__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see at.ac.tuwien.big.roverml.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.roverml.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see at.ac.tuwien.big.roverml.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.roverml.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see at.ac.tuwien.big.roverml.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the '{@link at.ac.tuwien.big.roverml.Transition#triggeredTransitionAfterInfiniteCommand(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Triggered Transition After Infinite Command</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Triggered Transition After Infinite Command</em>' operation.
	 * @see at.ac.tuwien.big.roverml.Transition#triggeredTransitionAfterInfiniteCommand(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTransition__TriggeredTransitionAfterInfiniteCommand__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link at.ac.tuwien.big.roverml.Transition#doNotRotateTwiceInARow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Do Not Rotate Twice In ARow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Not Rotate Twice In ARow</em>' operation.
	 * @see at.ac.tuwien.big.roverml.Transition#doNotRotateTwiceInARow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTransition__DoNotRotateTwiceInARow__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link at.ac.tuwien.big.roverml.Transition#sourceAndTargetInSameBlock(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source And Target In Same Block</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source And Target In Same Block</em>' operation.
	 * @see at.ac.tuwien.big.roverml.Transition#sourceAndTargetInSameBlock(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTransition__SourceAndTargetInSameBlock__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.TriggeredTransition <em>Triggered Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triggered Transition</em>'.
	 * @see at.ac.tuwien.big.roverml.TriggeredTransition
	 * @generated
	 */
	EClass getTriggeredTransition();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.roverml.TriggeredTransition#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see at.ac.tuwien.big.roverml.TriggeredTransition#getSensor()
	 * @see #getTriggeredTransition()
	 * @generated
	 */
	EReference getTriggeredTransition_Sensor();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.roverml.TriggeredTransition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see at.ac.tuwien.big.roverml.TriggeredTransition#getOperator()
	 * @see #getTriggeredTransition()
	 * @generated
	 */
	EAttribute getTriggeredTransition_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.roverml.TriggeredTransition#getComparisonValue <em>Comparison Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparison Value</em>'.
	 * @see at.ac.tuwien.big.roverml.TriggeredTransition#getComparisonValue()
	 * @see #getTriggeredTransition()
	 * @generated
	 */
	EReference getTriggeredTransition_ComparisonValue();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.GPS <em>GPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS</em>'.
	 * @see at.ac.tuwien.big.roverml.GPS
	 * @generated
	 */
	EClass getGPS();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.DistanceSensor <em>Distance Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Sensor</em>'.
	 * @see at.ac.tuwien.big.roverml.DistanceSensor
	 * @generated
	 */
	EClass getDistanceSensor();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Compass <em>Compass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compass</em>'.
	 * @see at.ac.tuwien.big.roverml.Compass
	 * @generated
	 */
	EClass getCompass();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.SingleQuantity <em>Single Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Quantity</em>'.
	 * @see at.ac.tuwien.big.roverml.SingleQuantity
	 * @generated
	 */
	EClass getSingleQuantity();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.roverml.SingleQuantity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see at.ac.tuwien.big.roverml.SingleQuantity#getValue()
	 * @see #getSingleQuantity()
	 * @generated
	 */
	EAttribute getSingleQuantity_Value();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see at.ac.tuwien.big.roverml.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see at.ac.tuwien.big.roverml.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.roverml.Time#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see at.ac.tuwien.big.roverml.Time#getTimeUnit()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_TimeUnit();

	/**
	 * Returns the meta object for the '{@link at.ac.tuwien.big.roverml.Time#notNegative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Not Negative</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Not Negative</em>' operation.
	 * @see at.ac.tuwien.big.roverml.Time#notNegative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTime__NotNegative__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Angle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle</em>'.
	 * @see at.ac.tuwien.big.roverml.Angle
	 * @generated
	 */
	EClass getAngle();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.roverml.Angle#getAngleUnit <em>Angle Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle Unit</em>'.
	 * @see at.ac.tuwien.big.roverml.Angle#getAngleUnit()
	 * @see #getAngle()
	 * @generated
	 */
	EAttribute getAngle_AngleUnit();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Velocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Velocity</em>'.
	 * @see at.ac.tuwien.big.roverml.Velocity
	 * @generated
	 */
	EClass getVelocity();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.roverml.Velocity#getVelocityUnit <em>Velocity Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Velocity Unit</em>'.
	 * @see at.ac.tuwien.big.roverml.Velocity#getVelocityUnit()
	 * @see #getVelocity()
	 * @generated
	 */
	EAttribute getVelocity_VelocityUnit();

	/**
	 * Returns the meta object for the '{@link at.ac.tuwien.big.roverml.Velocity#positiveOrNegative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Or Negative</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positive Or Negative</em>' operation.
	 * @see at.ac.tuwien.big.roverml.Velocity#positiveOrNegative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVelocity__PositiveOrNegative__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see at.ac.tuwien.big.roverml.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.roverml.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X</em>'.
	 * @see at.ac.tuwien.big.roverml.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_X();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.roverml.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Y</em>'.
	 * @see at.ac.tuwien.big.roverml.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_Y();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light</em>'.
	 * @see at.ac.tuwien.big.roverml.Light
	 * @generated
	 */
	EClass getLight();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see at.ac.tuwien.big.roverml.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.roverml.Length#getLengthUnit <em>Length Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length Unit</em>'.
	 * @see at.ac.tuwien.big.roverml.Length#getLengthUnit()
	 * @see #getLength()
	 * @generated
	 */
	EAttribute getLength_LengthUnit();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see at.ac.tuwien.big.roverml.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.roverml.Sensor#getLastSensedValue <em>Last Sensed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Sensed Value</em>'.
	 * @see at.ac.tuwien.big.roverml.Sensor#getLastSensedValue()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_LastSensedValue();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor</em>'.
	 * @see at.ac.tuwien.big.roverml.Motor
	 * @generated
	 */
	EClass getMotor();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Terminate <em>Terminate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminate</em>'.
	 * @see at.ac.tuwien.big.roverml.Terminate
	 * @generated
	 */
	EClass getTerminate();

	/**
	 * Returns the meta object for the '{@link at.ac.tuwien.big.roverml.Terminate#noOutgoingTransition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Outgoing Transition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Outgoing Transition</em>' operation.
	 * @see at.ac.tuwien.big.roverml.Terminate#noOutgoingTransition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTerminate__NoOutgoingTransition__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see at.ac.tuwien.big.roverml.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.roverml.Component#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see at.ac.tuwien.big.roverml.Component#getKind()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Kind();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see at.ac.tuwien.big.roverml.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.RoverSystem <em>Rover System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rover System</em>'.
	 * @see at.ac.tuwien.big.roverml.RoverSystem
	 * @generated
	 */
	EClass getRoverSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.roverml.RoverSystem#getRovers <em>Rovers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rovers</em>'.
	 * @see at.ac.tuwien.big.roverml.RoverSystem#getRovers()
	 * @see #getRoverSystem()
	 * @generated
	 */
	EReference getRoverSystem_Rovers();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.roverml.RoverSystem#getRoverPrograms <em>Rover Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rover Programs</em>'.
	 * @see at.ac.tuwien.big.roverml.RoverSystem#getRoverPrograms()
	 * @see #getRoverSystem()
	 * @generated
	 */
	EReference getRoverSystem_RoverPrograms();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.DistanceSensorTrigger <em>Distance Sensor Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Sensor Trigger</em>'.
	 * @see at.ac.tuwien.big.roverml.DistanceSensorTrigger
	 * @generated
	 */
	EClass getDistanceSensorTrigger();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.GpsTrigger <em>Gps Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps Trigger</em>'.
	 * @see at.ac.tuwien.big.roverml.GpsTrigger
	 * @generated
	 */
	EClass getGpsTrigger();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.roverml.CompassTrigger <em>Compass Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compass Trigger</em>'.
	 * @see at.ac.tuwien.big.roverml.CompassTrigger
	 * @generated
	 */
	EClass getCompassTrigger();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.roverml.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see at.ac.tuwien.big.roverml.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.roverml.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see at.ac.tuwien.big.roverml.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.roverml.AngleUnit <em>Angle Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Angle Unit</em>'.
	 * @see at.ac.tuwien.big.roverml.AngleUnit
	 * @generated
	 */
	EEnum getAngleUnit();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.roverml.VelocityUnit <em>Velocity Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Velocity Unit</em>'.
	 * @see at.ac.tuwien.big.roverml.VelocityUnit
	 * @generated
	 */
	EEnum getVelocityUnit();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.roverml.LengthUnit <em>Length Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Length Unit</em>'.
	 * @see at.ac.tuwien.big.roverml.LengthUnit
	 * @generated
	 */
	EEnum getLengthUnit();

	/**
	 * Returns the meta object for enum '{@link at.ac.tuwien.big.roverml.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator</em>'.
	 * @see at.ac.tuwien.big.roverml.ComparisonOperator
	 * @generated
	 */
	EEnum getComparisonOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RoverMLFactory getRoverMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.NamedElementImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.RoverProgramImpl <em>Rover Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.RoverProgramImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getRoverProgram()
		 * @generated
		 */
		EClass ROVER_PROGRAM = eINSTANCE.getRoverProgram();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROVER_PROGRAM__BLOCK = eINSTANCE.getRoverProgram_Block();

		/**
		 * The meta object literal for the '<em><b>Rover</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROVER_PROGRAM__ROVER = eINSTANCE.getRoverProgram_Rover();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.CommandImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__INCOMING = eINSTANCE.getCommand_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__OUTGOING = eINSTANCE.getCommand_Outgoing();

		/**
		 * The meta object literal for the '<em><b>No Parallel Execution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND___NO_PARALLEL_EXECUTION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCommand__NoParallelExecution__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.MoveImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__SPEED = eINSTANCE.getMove_Speed();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__DISTANCE = eINSTANCE.getMove_Distance();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.SetLightColorImpl <em>Set Light Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.SetLightColorImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getSetLightColor()
		 * @generated
		 */
		EClass SET_LIGHT_COLOR = eINSTANCE.getSetLightColor();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_LIGHT_COLOR__COLOR = eINSTANCE.getSetLightColor_Color();

		/**
		 * The meta object literal for the '<em><b>Lights</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_LIGHT_COLOR__LIGHTS = eINSTANCE.getSetLightColor_Lights();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.RotateImpl <em>Rotate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.RotateImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getRotate()
		 * @generated
		 */
		EClass ROTATE = eINSTANCE.getRotate();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROTATE__ANGLE = eINSTANCE.getRotate_Angle();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.WaitImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAIT__DURATION = eINSTANCE.getWait_Duration();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.RepeatImpl <em>Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.RepeatImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getRepeat()
		 * @generated
		 */
		EClass REPEAT = eINSTANCE.getRepeat();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT__COUNT = eINSTANCE.getRepeat_Count();

		/**
		 * The meta object literal for the '<em><b>Repeat At Least Once</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPEAT___REPEAT_AT_LEAST_ONCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRepeat__RepeatAtLeastOnce__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.RoverImpl <em>Rover</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.RoverImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getRover()
		 * @generated
		 */
		EClass ROVER = eINSTANCE.getRover();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROVER__COMPONENTS = eINSTANCE.getRover_Components();

		/**
		 * The meta object literal for the '<em><b>At Least One Motor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROVER___AT_LEAST_ONE_MOTOR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRover__AtLeastOneMotor__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROVER___UNIQUE_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRover__UniqueName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.BlockImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__COMMANDS = eINSTANCE.getBlock_Commands();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__TRANSITIONS = eINSTANCE.getBlock_Transitions();

		/**
		 * The meta object literal for the '<em><b>Only Terminate Once</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOCK___ONLY_TERMINATE_ONCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBlock__OnlyTerminateOnce__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>At Least One Incoming Transition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOCK___AT_LEAST_ONE_INCOMING_TRANSITION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBlock__AtLeastOneIncomingTransition__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.TransitionImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Triggered Transition After Infinite Command</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___TRIGGERED_TRANSITION_AFTER_INFINITE_COMMAND__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTransition__TriggeredTransitionAfterInfiniteCommand__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Do Not Rotate Twice In ARow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___DO_NOT_ROTATE_TWICE_IN_AROW__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTransition__DoNotRotateTwiceInARow__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Source And Target In Same Block</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___SOURCE_AND_TARGET_IN_SAME_BLOCK__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTransition__SourceAndTargetInSameBlock__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.TriggeredTransitionImpl <em>Triggered Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.TriggeredTransitionImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getTriggeredTransition()
		 * @generated
		 */
		EClass TRIGGERED_TRANSITION = eINSTANCE.getTriggeredTransition();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGERED_TRANSITION__SENSOR = eINSTANCE.getTriggeredTransition_Sensor();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGERED_TRANSITION__OPERATOR = eINSTANCE.getTriggeredTransition_Operator();

		/**
		 * The meta object literal for the '<em><b>Comparison Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGERED_TRANSITION__COMPARISON_VALUE = eINSTANCE.getTriggeredTransition_ComparisonValue();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.GPSImpl <em>GPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.GPSImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getGPS()
		 * @generated
		 */
		EClass GPS = eINSTANCE.getGPS();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.DistanceSensorImpl <em>Distance Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.DistanceSensorImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getDistanceSensor()
		 * @generated
		 */
		EClass DISTANCE_SENSOR = eINSTANCE.getDistanceSensor();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.CompassImpl <em>Compass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.CompassImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getCompass()
		 * @generated
		 */
		EClass COMPASS = eINSTANCE.getCompass();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.SingleQuantityImpl <em>Single Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.SingleQuantityImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getSingleQuantity()
		 * @generated
		 */
		EClass SINGLE_QUANTITY = eINSTANCE.getSingleQuantity();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_QUANTITY__VALUE = eINSTANCE.getSingleQuantity_Value();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.QuantityImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.TimeImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__TIME_UNIT = eINSTANCE.getTime_TimeUnit();

		/**
		 * The meta object literal for the '<em><b>Not Negative</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME___NOT_NEGATIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTime__NotNegative__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.AngleImpl <em>Angle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.AngleImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getAngle()
		 * @generated
		 */
		EClass ANGLE = eINSTANCE.getAngle();

		/**
		 * The meta object literal for the '<em><b>Angle Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGLE__ANGLE_UNIT = eINSTANCE.getAngle_AngleUnit();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.VelocityImpl <em>Velocity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.VelocityImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getVelocity()
		 * @generated
		 */
		EClass VELOCITY = eINSTANCE.getVelocity();

		/**
		 * The meta object literal for the '<em><b>Velocity Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VELOCITY__VELOCITY_UNIT = eINSTANCE.getVelocity_VelocityUnit();

		/**
		 * The meta object literal for the '<em><b>Positive Or Negative</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VELOCITY___POSITIVE_OR_NEGATIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVelocity__PositiveOrNegative__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.PositionImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__X = eINSTANCE.getPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__Y = eINSTANCE.getPosition_Y();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.LightImpl <em>Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.LightImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getLight()
		 * @generated
		 */
		EClass LIGHT = eINSTANCE.getLight();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.LengthImpl <em>Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.LengthImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getLength()
		 * @generated
		 */
		EClass LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '<em><b>Length Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENGTH__LENGTH_UNIT = eINSTANCE.getLength_LengthUnit();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.SensorImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Last Sensed Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__LAST_SENSED_VALUE = eINSTANCE.getSensor_LastSensedValue();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.MotorImpl <em>Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.MotorImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getMotor()
		 * @generated
		 */
		EClass MOTOR = eINSTANCE.getMotor();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.TerminateImpl <em>Terminate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.TerminateImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getTerminate()
		 * @generated
		 */
		EClass TERMINATE = eINSTANCE.getTerminate();

		/**
		 * The meta object literal for the '<em><b>No Outgoing Transition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINATE___NO_OUTGOING_TRANSITION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTerminate__NoOutgoingTransition__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.ComponentImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__KIND = eINSTANCE.getComponent_Kind();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.ActuatorImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.RoverSystemImpl <em>Rover System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.RoverSystemImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getRoverSystem()
		 * @generated
		 */
		EClass ROVER_SYSTEM = eINSTANCE.getRoverSystem();

		/**
		 * The meta object literal for the '<em><b>Rovers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROVER_SYSTEM__ROVERS = eINSTANCE.getRoverSystem_Rovers();

		/**
		 * The meta object literal for the '<em><b>Rover Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROVER_SYSTEM__ROVER_PROGRAMS = eINSTANCE.getRoverSystem_RoverPrograms();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.DistanceSensorTriggerImpl <em>Distance Sensor Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.DistanceSensorTriggerImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getDistanceSensorTrigger()
		 * @generated
		 */
		EClass DISTANCE_SENSOR_TRIGGER = eINSTANCE.getDistanceSensorTrigger();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.GpsTriggerImpl <em>Gps Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.GpsTriggerImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getGpsTrigger()
		 * @generated
		 */
		EClass GPS_TRIGGER = eINSTANCE.getGpsTrigger();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.impl.CompassTriggerImpl <em>Compass Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.impl.CompassTriggerImpl
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getCompassTrigger()
		 * @generated
		 */
		EClass COMPASS_TRIGGER = eINSTANCE.getCompassTrigger();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.Color
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.TimeUnit
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.AngleUnit <em>Angle Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.AngleUnit
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getAngleUnit()
		 * @generated
		 */
		EEnum ANGLE_UNIT = eINSTANCE.getAngleUnit();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.VelocityUnit <em>Velocity Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.VelocityUnit
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getVelocityUnit()
		 * @generated
		 */
		EEnum VELOCITY_UNIT = eINSTANCE.getVelocityUnit();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.LengthUnit <em>Length Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.LengthUnit
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getLengthUnit()
		 * @generated
		 */
		EEnum LENGTH_UNIT = eINSTANCE.getLengthUnit();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.roverml.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.roverml.ComparisonOperator
		 * @see at.ac.tuwien.big.roverml.impl.RoverMLPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

	}

} //RoverMLPackage

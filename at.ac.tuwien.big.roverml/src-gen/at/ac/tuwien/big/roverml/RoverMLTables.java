/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /at.ac.tuwien.big.roverml/model/roverml.ecore
 * using:
 *   /at.ac.tuwien.big.roverml/model/roverml.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package at.ac.tuwien.big.roverml;

import at.ac.tuwien.big.roverml.RoverMLTables;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorTypeParameter;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

/**
 * RoverMLTables provides the dispatch tables for the roverml for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class RoverMLTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(RoverMLPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.big.tuwien.ac.at/roverml", null, at.ac.tuwien.big.roverml.RoverMLPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Angle = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("Angle", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Block = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("Block", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Command = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("Command", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Component = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("Component", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Length = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("Length", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Light = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("Light", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Motor = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("Motor", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Move = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("Move", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Position = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("Position", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Repeat = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("Repeat", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Rotate = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("Rotate", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Rover = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("Rover", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_RoverProgram = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("RoverProgram", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_RoverSystem = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("RoverSystem", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_SetLightColor = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("SetLightColor", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Terminate = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("Terminate", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Time = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("Time", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Transition = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("Transition", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_TriggeredTransition = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("TriggeredTransition", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Velocity = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("Velocity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Wait = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getClassId("Wait", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EFloat = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EInt = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_AngleUnit = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getEnumerationId("AngleUnit");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_Color = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getEnumerationId("Color");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_ComparisonOperator = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getEnumerationId("ComparisonOperator");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_LengthUnit = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getEnumerationId("LengthUnit");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_TimeUnit = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getEnumerationId("TimeUnit");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_VelocityUnit = at.ac.tuwien.big.roverml.RoverMLTables.PACKid_http_c_s_s_www_big_tuwien_ac_at_s_roverml.getEnumerationId("VelocityUnit");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_1 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ java.lang.String STR_Block_c_c_atLeastOneIncomingTransition = "Block::atLeastOneIncomingTransition";
	public static final /*@NonInvalid*/ java.lang.String STR_Block_c_c_onlyTerminateOnce = "Block::onlyTerminateOnce";
	public static final /*@NonInvalid*/ java.lang.String STR_Command_c_c_noParallelExecution = "Command::noParallelExecution";
	public static final /*@NonInvalid*/ java.lang.String STR_Repeat_c_c_repeatAtLeastOnce = "Repeat::repeatAtLeastOnce";
	public static final /*@NonInvalid*/ java.lang.String STR_Rover_c_c_atLeastOneMotor = "Rover::atLeastOneMotor";
	public static final /*@NonInvalid*/ java.lang.String STR_Rover_c_c_uniqueName = "Rover::uniqueName";
	public static final /*@NonInvalid*/ java.lang.String STR_Terminate_c_c_noOutgoingTransition = "Terminate::noOutgoingTransition";
	public static final /*@NonInvalid*/ java.lang.String STR_Time_c_c_notNegative = "Time::notNegative";
	public static final /*@NonInvalid*/ java.lang.String STR_Transition_c_c_doNotRotateTwiceInARow = "Transition::doNotRotateTwiceInARow";
	public static final /*@NonInvalid*/ java.lang.String STR_Transition_c_c_sourceAndTargetInSameBlock = "Transition::sourceAndTargetInSameBlock";
	public static final /*@NonInvalid*/ java.lang.String STR_Transition_c_c_triggeredTransitionAfterInfiniteCommand = "Transition::triggeredTransitionAfterInfiniteCommand";
	public static final /*@NonInvalid*/ java.lang.String STR_Velocity_c_c_positiveOrNegative = "Velocity::positiveOrNegative";
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Command = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(at.ac.tuwien.big.roverml.RoverMLTables.CLSSid_Command);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_RoverProgram = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(at.ac.tuwien.big.roverml.RoverMLTables.CLSSid_RoverProgram);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_SetLightColor = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(at.ac.tuwien.big.roverml.RoverMLTables.CLSSid_SetLightColor);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Transition = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(at.ac.tuwien.big.roverml.RoverMLTables.CLSSid_Transition);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Command = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(at.ac.tuwien.big.roverml.RoverMLTables.CLSSid_Command);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Component = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(at.ac.tuwien.big.roverml.RoverMLTables.CLSSid_Component);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Light = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(at.ac.tuwien.big.roverml.RoverMLTables.CLSSid_Light);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Rover = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(at.ac.tuwien.big.roverml.RoverMLTables.CLSSid_Rover);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_RoverProgram = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(at.ac.tuwien.big.roverml.RoverMLTables.CLSSid_RoverProgram);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Transition = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(at.ac.tuwien.big.roverml.RoverMLTables.CLSSid_Transition);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.PropertyId PROPid_commands = at.ac.tuwien.big.roverml.RoverMLTables.CLSSid_Block.getPropertyId("commands");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_Command = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(at.ac.tuwien.big.roverml.RoverMLTables.CLSSid_Command);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_Command = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(at.ac.tuwien.big.roverml.RoverMLTables.CLSSid_Command);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			RoverMLTables.init();
		}

		public static final /*@NonNull*/ ExecutorTypeParameter _Sensor_QuantityType = new ExecutorTypeParameter(TypeId.T_1, "QuantityType");

		public static final /*@NonNull*/ ExecutorTypeParameter _TriggeredTransition_SensorType = new ExecutorTypeParameter(TypeId.T_1, "SensorType");
		public static final /*@NonNull*/ ExecutorTypeParameter _TriggeredTransition_QuantityType = new ExecutorTypeParameter(TypeId.T_2, "QuantityType");

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RoverMLTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _Actuator = new EcoreExecutorType(RoverMLPackage.Literals.ACTUATOR, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _Angle = new EcoreExecutorType(RoverMLPackage.Literals.ANGLE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _AngleUnit = new EcoreExecutorEnumeration(RoverMLPackage.Literals.ANGLE_UNIT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Block = new EcoreExecutorType(RoverMLPackage.Literals.BLOCK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Color = new EcoreExecutorEnumeration(RoverMLPackage.Literals.COLOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Command = new EcoreExecutorType(RoverMLPackage.Literals.COMMAND, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _ComparisonOperator = new EcoreExecutorEnumeration(RoverMLPackage.Literals.COMPARISON_OPERATOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Compass = new EcoreExecutorType(RoverMLPackage.Literals.COMPASS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _CompassTrigger = new EcoreExecutorType(RoverMLPackage.Literals.COMPASS_TRIGGER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Component = new EcoreExecutorType(RoverMLPackage.Literals.COMPONENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _DistanceSensor = new EcoreExecutorType(RoverMLPackage.Literals.DISTANCE_SENSOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _DistanceSensorTrigger = new EcoreExecutorType(RoverMLPackage.Literals.DISTANCE_SENSOR_TRIGGER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _GPS = new EcoreExecutorType(RoverMLPackage.Literals.GPS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _GpsTrigger = new EcoreExecutorType(RoverMLPackage.Literals.GPS_TRIGGER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Length = new EcoreExecutorType(RoverMLPackage.Literals.LENGTH, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _LengthUnit = new EcoreExecutorEnumeration(RoverMLPackage.Literals.LENGTH_UNIT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Light = new EcoreExecutorType(RoverMLPackage.Literals.LIGHT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Motor = new EcoreExecutorType(RoverMLPackage.Literals.MOTOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Move = new EcoreExecutorType(RoverMLPackage.Literals.MOVE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _NamedElement = new EcoreExecutorType(RoverMLPackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _Position = new EcoreExecutorType(RoverMLPackage.Literals.POSITION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Quantity = new EcoreExecutorType(RoverMLPackage.Literals.QUANTITY, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _Repeat = new EcoreExecutorType(RoverMLPackage.Literals.REPEAT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Rotate = new EcoreExecutorType(RoverMLPackage.Literals.ROTATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Rover = new EcoreExecutorType(RoverMLPackage.Literals.ROVER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _RoverProgram = new EcoreExecutorType(RoverMLPackage.Literals.ROVER_PROGRAM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _RoverSystem = new EcoreExecutorType(RoverMLPackage.Literals.ROVER_SYSTEM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Sensor = new EcoreExecutorType(RoverMLPackage.Literals.SENSOR, PACKAGE, 0 | ExecutorType.ABSTRACT, TypeParameters._Sensor_QuantityType);
		public static final /*@NonNull*/ EcoreExecutorType _SetLightColor = new EcoreExecutorType(RoverMLPackage.Literals.SET_LIGHT_COLOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SingleQuantity = new EcoreExecutorType(RoverMLPackage.Literals.SINGLE_QUANTITY, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _Terminate = new EcoreExecutorType(RoverMLPackage.Literals.TERMINATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Time = new EcoreExecutorType(RoverMLPackage.Literals.TIME, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _TimeUnit = new EcoreExecutorEnumeration(RoverMLPackage.Literals.TIME_UNIT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Transition = new EcoreExecutorType(RoverMLPackage.Literals.TRANSITION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _TriggeredTransition = new EcoreExecutorType(RoverMLPackage.Literals.TRIGGERED_TRANSITION, PACKAGE, 0 | ExecutorType.ABSTRACT, TypeParameters._TriggeredTransition_SensorType, TypeParameters._TriggeredTransition_QuantityType);
		public static final /*@NonNull*/ EcoreExecutorType _Velocity = new EcoreExecutorType(RoverMLPackage.Literals.VELOCITY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _VelocityUnit = new EcoreExecutorEnumeration(RoverMLPackage.Literals.VELOCITY_UNIT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Wait = new EcoreExecutorType(RoverMLPackage.Literals.WAIT, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Actuator,
			_Angle,
			_AngleUnit,
			_Block,
			_Color,
			_Command,
			_ComparisonOperator,
			_Compass,
			_CompassTrigger,
			_Component,
			_DistanceSensor,
			_DistanceSensorTrigger,
			_GPS,
			_GpsTrigger,
			_Length,
			_LengthUnit,
			_Light,
			_Motor,
			_Move,
			_NamedElement,
			_Position,
			_Quantity,
			_Repeat,
			_Rotate,
			_Rover,
			_RoverProgram,
			_RoverSystem,
			_Sensor,
			_SetLightColor,
			_SingleQuantity,
			_Terminate,
			_Time,
			_TimeUnit,
			_Transition,
			_TriggeredTransition,
			_Velocity,
			_VelocityUnit,
			_Wait
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RoverMLTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Actuator__Actuator = new ExecutorFragment(Types._Actuator, RoverMLTables.Types._Actuator);
		private static final /*@NonNull*/ ExecutorFragment _Actuator__Component = new ExecutorFragment(Types._Actuator, RoverMLTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Actuator__NamedElement = new ExecutorFragment(Types._Actuator, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Actuator__OclAny = new ExecutorFragment(Types._Actuator, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Actuator__OclElement = new ExecutorFragment(Types._Actuator, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Angle__Angle = new ExecutorFragment(Types._Angle, RoverMLTables.Types._Angle);
		private static final /*@NonNull*/ ExecutorFragment _Angle__OclAny = new ExecutorFragment(Types._Angle, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Angle__OclElement = new ExecutorFragment(Types._Angle, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Angle__Quantity = new ExecutorFragment(Types._Angle, RoverMLTables.Types._Quantity);
		private static final /*@NonNull*/ ExecutorFragment _Angle__SingleQuantity = new ExecutorFragment(Types._Angle, RoverMLTables.Types._SingleQuantity);

		private static final /*@NonNull*/ ExecutorFragment _AngleUnit__AngleUnit = new ExecutorFragment(Types._AngleUnit, RoverMLTables.Types._AngleUnit);
		private static final /*@NonNull*/ ExecutorFragment _AngleUnit__OclAny = new ExecutorFragment(Types._AngleUnit, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AngleUnit__OclElement = new ExecutorFragment(Types._AngleUnit, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _AngleUnit__OclEnumeration = new ExecutorFragment(Types._AngleUnit, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _AngleUnit__OclType = new ExecutorFragment(Types._AngleUnit, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Block__Block = new ExecutorFragment(Types._Block, RoverMLTables.Types._Block);
		private static final /*@NonNull*/ ExecutorFragment _Block__OclAny = new ExecutorFragment(Types._Block, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Block__OclElement = new ExecutorFragment(Types._Block, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Color__Color = new ExecutorFragment(Types._Color, RoverMLTables.Types._Color);
		private static final /*@NonNull*/ ExecutorFragment _Color__OclAny = new ExecutorFragment(Types._Color, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Color__OclElement = new ExecutorFragment(Types._Color, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Color__OclEnumeration = new ExecutorFragment(Types._Color, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Color__OclType = new ExecutorFragment(Types._Color, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Command__Command = new ExecutorFragment(Types._Command, RoverMLTables.Types._Command);
		private static final /*@NonNull*/ ExecutorFragment _Command__NamedElement = new ExecutorFragment(Types._Command, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Command__OclAny = new ExecutorFragment(Types._Command, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Command__OclElement = new ExecutorFragment(Types._Command, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ComparisonOperator__ComparisonOperator = new ExecutorFragment(Types._ComparisonOperator, RoverMLTables.Types._ComparisonOperator);
		private static final /*@NonNull*/ ExecutorFragment _ComparisonOperator__OclAny = new ExecutorFragment(Types._ComparisonOperator, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ComparisonOperator__OclElement = new ExecutorFragment(Types._ComparisonOperator, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ComparisonOperator__OclEnumeration = new ExecutorFragment(Types._ComparisonOperator, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _ComparisonOperator__OclType = new ExecutorFragment(Types._ComparisonOperator, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Compass__Compass = new ExecutorFragment(Types._Compass, RoverMLTables.Types._Compass);
		private static final /*@NonNull*/ ExecutorFragment _Compass__Component = new ExecutorFragment(Types._Compass, RoverMLTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Compass__NamedElement = new ExecutorFragment(Types._Compass, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Compass__OclAny = new ExecutorFragment(Types._Compass, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Compass__OclElement = new ExecutorFragment(Types._Compass, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Compass__Sensor = new ExecutorFragment(Types._Compass, RoverMLTables.Types._Sensor);

		private static final /*@NonNull*/ ExecutorFragment _CompassTrigger__CompassTrigger = new ExecutorFragment(Types._CompassTrigger, RoverMLTables.Types._CompassTrigger);
		private static final /*@NonNull*/ ExecutorFragment _CompassTrigger__NamedElement = new ExecutorFragment(Types._CompassTrigger, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _CompassTrigger__OclAny = new ExecutorFragment(Types._CompassTrigger, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _CompassTrigger__OclElement = new ExecutorFragment(Types._CompassTrigger, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _CompassTrigger__Transition = new ExecutorFragment(Types._CompassTrigger, RoverMLTables.Types._Transition);
		private static final /*@NonNull*/ ExecutorFragment _CompassTrigger__TriggeredTransition = new ExecutorFragment(Types._CompassTrigger, RoverMLTables.Types._TriggeredTransition);

		private static final /*@NonNull*/ ExecutorFragment _Component__Component = new ExecutorFragment(Types._Component, RoverMLTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Component__NamedElement = new ExecutorFragment(Types._Component, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Component__OclAny = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Component__OclElement = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _DistanceSensor__Component = new ExecutorFragment(Types._DistanceSensor, RoverMLTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _DistanceSensor__DistanceSensor = new ExecutorFragment(Types._DistanceSensor, RoverMLTables.Types._DistanceSensor);
		private static final /*@NonNull*/ ExecutorFragment _DistanceSensor__NamedElement = new ExecutorFragment(Types._DistanceSensor, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _DistanceSensor__OclAny = new ExecutorFragment(Types._DistanceSensor, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _DistanceSensor__OclElement = new ExecutorFragment(Types._DistanceSensor, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _DistanceSensor__Sensor = new ExecutorFragment(Types._DistanceSensor, RoverMLTables.Types._Sensor);

		private static final /*@NonNull*/ ExecutorFragment _DistanceSensorTrigger__DistanceSensorTrigger = new ExecutorFragment(Types._DistanceSensorTrigger, RoverMLTables.Types._DistanceSensorTrigger);
		private static final /*@NonNull*/ ExecutorFragment _DistanceSensorTrigger__NamedElement = new ExecutorFragment(Types._DistanceSensorTrigger, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _DistanceSensorTrigger__OclAny = new ExecutorFragment(Types._DistanceSensorTrigger, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _DistanceSensorTrigger__OclElement = new ExecutorFragment(Types._DistanceSensorTrigger, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _DistanceSensorTrigger__Transition = new ExecutorFragment(Types._DistanceSensorTrigger, RoverMLTables.Types._Transition);
		private static final /*@NonNull*/ ExecutorFragment _DistanceSensorTrigger__TriggeredTransition = new ExecutorFragment(Types._DistanceSensorTrigger, RoverMLTables.Types._TriggeredTransition);

		private static final /*@NonNull*/ ExecutorFragment _GPS__Component = new ExecutorFragment(Types._GPS, RoverMLTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _GPS__GPS = new ExecutorFragment(Types._GPS, RoverMLTables.Types._GPS);
		private static final /*@NonNull*/ ExecutorFragment _GPS__NamedElement = new ExecutorFragment(Types._GPS, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _GPS__OclAny = new ExecutorFragment(Types._GPS, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _GPS__OclElement = new ExecutorFragment(Types._GPS, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _GPS__Sensor = new ExecutorFragment(Types._GPS, RoverMLTables.Types._Sensor);

		private static final /*@NonNull*/ ExecutorFragment _GpsTrigger__GpsTrigger = new ExecutorFragment(Types._GpsTrigger, RoverMLTables.Types._GpsTrigger);
		private static final /*@NonNull*/ ExecutorFragment _GpsTrigger__NamedElement = new ExecutorFragment(Types._GpsTrigger, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _GpsTrigger__OclAny = new ExecutorFragment(Types._GpsTrigger, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _GpsTrigger__OclElement = new ExecutorFragment(Types._GpsTrigger, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _GpsTrigger__Transition = new ExecutorFragment(Types._GpsTrigger, RoverMLTables.Types._Transition);
		private static final /*@NonNull*/ ExecutorFragment _GpsTrigger__TriggeredTransition = new ExecutorFragment(Types._GpsTrigger, RoverMLTables.Types._TriggeredTransition);

		private static final /*@NonNull*/ ExecutorFragment _Length__Length = new ExecutorFragment(Types._Length, RoverMLTables.Types._Length);
		private static final /*@NonNull*/ ExecutorFragment _Length__OclAny = new ExecutorFragment(Types._Length, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Length__OclElement = new ExecutorFragment(Types._Length, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Length__Quantity = new ExecutorFragment(Types._Length, RoverMLTables.Types._Quantity);
		private static final /*@NonNull*/ ExecutorFragment _Length__SingleQuantity = new ExecutorFragment(Types._Length, RoverMLTables.Types._SingleQuantity);

		private static final /*@NonNull*/ ExecutorFragment _LengthUnit__LengthUnit = new ExecutorFragment(Types._LengthUnit, RoverMLTables.Types._LengthUnit);
		private static final /*@NonNull*/ ExecutorFragment _LengthUnit__OclAny = new ExecutorFragment(Types._LengthUnit, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _LengthUnit__OclElement = new ExecutorFragment(Types._LengthUnit, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _LengthUnit__OclEnumeration = new ExecutorFragment(Types._LengthUnit, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _LengthUnit__OclType = new ExecutorFragment(Types._LengthUnit, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Light__Actuator = new ExecutorFragment(Types._Light, RoverMLTables.Types._Actuator);
		private static final /*@NonNull*/ ExecutorFragment _Light__Component = new ExecutorFragment(Types._Light, RoverMLTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Light__Light = new ExecutorFragment(Types._Light, RoverMLTables.Types._Light);
		private static final /*@NonNull*/ ExecutorFragment _Light__NamedElement = new ExecutorFragment(Types._Light, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Light__OclAny = new ExecutorFragment(Types._Light, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Light__OclElement = new ExecutorFragment(Types._Light, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Motor__Actuator = new ExecutorFragment(Types._Motor, RoverMLTables.Types._Actuator);
		private static final /*@NonNull*/ ExecutorFragment _Motor__Component = new ExecutorFragment(Types._Motor, RoverMLTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Motor__Motor = new ExecutorFragment(Types._Motor, RoverMLTables.Types._Motor);
		private static final /*@NonNull*/ ExecutorFragment _Motor__NamedElement = new ExecutorFragment(Types._Motor, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Motor__OclAny = new ExecutorFragment(Types._Motor, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Motor__OclElement = new ExecutorFragment(Types._Motor, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Move__Command = new ExecutorFragment(Types._Move, RoverMLTables.Types._Command);
		private static final /*@NonNull*/ ExecutorFragment _Move__Move = new ExecutorFragment(Types._Move, RoverMLTables.Types._Move);
		private static final /*@NonNull*/ ExecutorFragment _Move__NamedElement = new ExecutorFragment(Types._Move, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Move__OclAny = new ExecutorFragment(Types._Move, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Move__OclElement = new ExecutorFragment(Types._Move, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Position__OclAny = new ExecutorFragment(Types._Position, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Position__OclElement = new ExecutorFragment(Types._Position, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Position__Position = new ExecutorFragment(Types._Position, RoverMLTables.Types._Position);
		private static final /*@NonNull*/ ExecutorFragment _Position__Quantity = new ExecutorFragment(Types._Position, RoverMLTables.Types._Quantity);

		private static final /*@NonNull*/ ExecutorFragment _Quantity__OclAny = new ExecutorFragment(Types._Quantity, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Quantity__OclElement = new ExecutorFragment(Types._Quantity, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Quantity__Quantity = new ExecutorFragment(Types._Quantity, RoverMLTables.Types._Quantity);

		private static final /*@NonNull*/ ExecutorFragment _Repeat__Block = new ExecutorFragment(Types._Repeat, RoverMLTables.Types._Block);
		private static final /*@NonNull*/ ExecutorFragment _Repeat__Command = new ExecutorFragment(Types._Repeat, RoverMLTables.Types._Command);
		private static final /*@NonNull*/ ExecutorFragment _Repeat__NamedElement = new ExecutorFragment(Types._Repeat, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Repeat__OclAny = new ExecutorFragment(Types._Repeat, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Repeat__OclElement = new ExecutorFragment(Types._Repeat, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Repeat__Repeat = new ExecutorFragment(Types._Repeat, RoverMLTables.Types._Repeat);

		private static final /*@NonNull*/ ExecutorFragment _Rotate__Command = new ExecutorFragment(Types._Rotate, RoverMLTables.Types._Command);
		private static final /*@NonNull*/ ExecutorFragment _Rotate__NamedElement = new ExecutorFragment(Types._Rotate, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Rotate__OclAny = new ExecutorFragment(Types._Rotate, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Rotate__OclElement = new ExecutorFragment(Types._Rotate, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Rotate__Rotate = new ExecutorFragment(Types._Rotate, RoverMLTables.Types._Rotate);

		private static final /*@NonNull*/ ExecutorFragment _Rover__NamedElement = new ExecutorFragment(Types._Rover, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Rover__OclAny = new ExecutorFragment(Types._Rover, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Rover__OclElement = new ExecutorFragment(Types._Rover, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Rover__Rover = new ExecutorFragment(Types._Rover, RoverMLTables.Types._Rover);

		private static final /*@NonNull*/ ExecutorFragment _RoverProgram__NamedElement = new ExecutorFragment(Types._RoverProgram, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _RoverProgram__OclAny = new ExecutorFragment(Types._RoverProgram, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RoverProgram__OclElement = new ExecutorFragment(Types._RoverProgram, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RoverProgram__RoverProgram = new ExecutorFragment(Types._RoverProgram, RoverMLTables.Types._RoverProgram);

		private static final /*@NonNull*/ ExecutorFragment _RoverSystem__OclAny = new ExecutorFragment(Types._RoverSystem, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RoverSystem__OclElement = new ExecutorFragment(Types._RoverSystem, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RoverSystem__RoverSystem = new ExecutorFragment(Types._RoverSystem, RoverMLTables.Types._RoverSystem);

		private static final /*@NonNull*/ ExecutorFragment _Sensor__Component = new ExecutorFragment(Types._Sensor, RoverMLTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Sensor__NamedElement = new ExecutorFragment(Types._Sensor, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Sensor__OclAny = new ExecutorFragment(Types._Sensor, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Sensor__OclElement = new ExecutorFragment(Types._Sensor, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Sensor__Sensor = new ExecutorFragment(Types._Sensor, RoverMLTables.Types._Sensor);

		private static final /*@NonNull*/ ExecutorFragment _SetLightColor__Command = new ExecutorFragment(Types._SetLightColor, RoverMLTables.Types._Command);
		private static final /*@NonNull*/ ExecutorFragment _SetLightColor__NamedElement = new ExecutorFragment(Types._SetLightColor, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _SetLightColor__OclAny = new ExecutorFragment(Types._SetLightColor, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SetLightColor__OclElement = new ExecutorFragment(Types._SetLightColor, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SetLightColor__SetLightColor = new ExecutorFragment(Types._SetLightColor, RoverMLTables.Types._SetLightColor);

		private static final /*@NonNull*/ ExecutorFragment _SingleQuantity__OclAny = new ExecutorFragment(Types._SingleQuantity, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SingleQuantity__OclElement = new ExecutorFragment(Types._SingleQuantity, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SingleQuantity__Quantity = new ExecutorFragment(Types._SingleQuantity, RoverMLTables.Types._Quantity);
		private static final /*@NonNull*/ ExecutorFragment _SingleQuantity__SingleQuantity = new ExecutorFragment(Types._SingleQuantity, RoverMLTables.Types._SingleQuantity);

		private static final /*@NonNull*/ ExecutorFragment _Terminate__Command = new ExecutorFragment(Types._Terminate, RoverMLTables.Types._Command);
		private static final /*@NonNull*/ ExecutorFragment _Terminate__NamedElement = new ExecutorFragment(Types._Terminate, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Terminate__OclAny = new ExecutorFragment(Types._Terminate, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Terminate__OclElement = new ExecutorFragment(Types._Terminate, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Terminate__Terminate = new ExecutorFragment(Types._Terminate, RoverMLTables.Types._Terminate);

		private static final /*@NonNull*/ ExecutorFragment _Time__OclAny = new ExecutorFragment(Types._Time, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Time__OclElement = new ExecutorFragment(Types._Time, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Time__Quantity = new ExecutorFragment(Types._Time, RoverMLTables.Types._Quantity);
		private static final /*@NonNull*/ ExecutorFragment _Time__SingleQuantity = new ExecutorFragment(Types._Time, RoverMLTables.Types._SingleQuantity);
		private static final /*@NonNull*/ ExecutorFragment _Time__Time = new ExecutorFragment(Types._Time, RoverMLTables.Types._Time);

		private static final /*@NonNull*/ ExecutorFragment _TimeUnit__OclAny = new ExecutorFragment(Types._TimeUnit, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TimeUnit__OclElement = new ExecutorFragment(Types._TimeUnit, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TimeUnit__OclEnumeration = new ExecutorFragment(Types._TimeUnit, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _TimeUnit__OclType = new ExecutorFragment(Types._TimeUnit, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _TimeUnit__TimeUnit = new ExecutorFragment(Types._TimeUnit, RoverMLTables.Types._TimeUnit);

		private static final /*@NonNull*/ ExecutorFragment _Transition__NamedElement = new ExecutorFragment(Types._Transition, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Transition__OclAny = new ExecutorFragment(Types._Transition, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Transition__OclElement = new ExecutorFragment(Types._Transition, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Transition__Transition = new ExecutorFragment(Types._Transition, RoverMLTables.Types._Transition);

		private static final /*@NonNull*/ ExecutorFragment _TriggeredTransition__NamedElement = new ExecutorFragment(Types._TriggeredTransition, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _TriggeredTransition__OclAny = new ExecutorFragment(Types._TriggeredTransition, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _TriggeredTransition__OclElement = new ExecutorFragment(Types._TriggeredTransition, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _TriggeredTransition__Transition = new ExecutorFragment(Types._TriggeredTransition, RoverMLTables.Types._Transition);
		private static final /*@NonNull*/ ExecutorFragment _TriggeredTransition__TriggeredTransition = new ExecutorFragment(Types._TriggeredTransition, RoverMLTables.Types._TriggeredTransition);

		private static final /*@NonNull*/ ExecutorFragment _Velocity__OclAny = new ExecutorFragment(Types._Velocity, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Velocity__OclElement = new ExecutorFragment(Types._Velocity, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Velocity__Quantity = new ExecutorFragment(Types._Velocity, RoverMLTables.Types._Quantity);
		private static final /*@NonNull*/ ExecutorFragment _Velocity__SingleQuantity = new ExecutorFragment(Types._Velocity, RoverMLTables.Types._SingleQuantity);
		private static final /*@NonNull*/ ExecutorFragment _Velocity__Velocity = new ExecutorFragment(Types._Velocity, RoverMLTables.Types._Velocity);

		private static final /*@NonNull*/ ExecutorFragment _VelocityUnit__OclAny = new ExecutorFragment(Types._VelocityUnit, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _VelocityUnit__OclElement = new ExecutorFragment(Types._VelocityUnit, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _VelocityUnit__OclEnumeration = new ExecutorFragment(Types._VelocityUnit, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _VelocityUnit__OclType = new ExecutorFragment(Types._VelocityUnit, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _VelocityUnit__VelocityUnit = new ExecutorFragment(Types._VelocityUnit, RoverMLTables.Types._VelocityUnit);

		private static final /*@NonNull*/ ExecutorFragment _Wait__Command = new ExecutorFragment(Types._Wait, RoverMLTables.Types._Command);
		private static final /*@NonNull*/ ExecutorFragment _Wait__NamedElement = new ExecutorFragment(Types._Wait, RoverMLTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Wait__OclAny = new ExecutorFragment(Types._Wait, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Wait__OclElement = new ExecutorFragment(Types._Wait, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Wait__Wait = new ExecutorFragment(Types._Wait, RoverMLTables.Types._Wait);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RoverMLTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RoverMLTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RoverMLTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final /*@NonNull*/ ExecutorProperty _Angle__angleUnit = new EcoreExecutorProperty(RoverMLPackage.Literals.ANGLE__ANGLE_UNIT, Types._Angle, 0);
		public static final /*@NonNull*/ ExecutorProperty _Angle__Rotate__angle = new ExecutorPropertyWithImplementation("Rotate", Types._Angle, 1, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.ROTATE__ANGLE));

		public static final /*@NonNull*/ ExecutorProperty _Block__commands = new EcoreExecutorProperty(RoverMLPackage.Literals.BLOCK__COMMANDS, Types._Block, 0);
		public static final /*@NonNull*/ ExecutorProperty _Block__transitions = new EcoreExecutorProperty(RoverMLPackage.Literals.BLOCK__TRANSITIONS, Types._Block, 1);
		public static final /*@NonNull*/ ExecutorProperty _Block__RoverProgram__block = new ExecutorPropertyWithImplementation("RoverProgram", Types._Block, 2, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.ROVER_PROGRAM__BLOCK));

		public static final /*@NonNull*/ ExecutorProperty _Command__incoming = new EcoreExecutorProperty(RoverMLPackage.Literals.COMMAND__INCOMING, Types._Command, 0);
		public static final /*@NonNull*/ ExecutorProperty _Command__outgoing = new EcoreExecutorProperty(RoverMLPackage.Literals.COMMAND__OUTGOING, Types._Command, 1);
		public static final /*@NonNull*/ ExecutorProperty _Command__Block__commands = new ExecutorPropertyWithImplementation("Block", Types._Command, 2, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.BLOCK__COMMANDS));
		public static final /*@NonNull*/ ExecutorProperty _Command__Transition__source = new ExecutorPropertyWithImplementation("Transition", Types._Command, 3, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.TRANSITION__SOURCE));
		public static final /*@NonNull*/ ExecutorProperty _Command__Transition__target = new ExecutorPropertyWithImplementation("Transition", Types._Command, 4, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.TRANSITION__TARGET));

		public static final /*@NonNull*/ ExecutorProperty _Component__kind = new EcoreExecutorProperty(RoverMLPackage.Literals.COMPONENT__KIND, Types._Component, 0);
		public static final /*@NonNull*/ ExecutorProperty _Component__Rover__components = new ExecutorPropertyWithImplementation("Rover", Types._Component, 1, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.ROVER__COMPONENTS));

		public static final /*@NonNull*/ ExecutorProperty _Length__lengthUnit = new EcoreExecutorProperty(RoverMLPackage.Literals.LENGTH__LENGTH_UNIT, Types._Length, 0);
		public static final /*@NonNull*/ ExecutorProperty _Length__Move__distance = new ExecutorPropertyWithImplementation("Move", Types._Length, 1, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.MOVE__DISTANCE));
		public static final /*@NonNull*/ ExecutorProperty _Length__Position__x = new ExecutorPropertyWithImplementation("Position", Types._Length, 2, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.POSITION__X));
		public static final /*@NonNull*/ ExecutorProperty _Length__Position__y = new ExecutorPropertyWithImplementation("Position", Types._Length, 3, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.POSITION__Y));

		public static final /*@NonNull*/ ExecutorProperty _Light__SetLightColor__lights = new ExecutorPropertyWithImplementation("SetLightColor", Types._Light, 0, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.SET_LIGHT_COLOR__LIGHTS));

		public static final /*@NonNull*/ ExecutorProperty _Move__distance = new EcoreExecutorProperty(RoverMLPackage.Literals.MOVE__DISTANCE, Types._Move, 0);
		public static final /*@NonNull*/ ExecutorProperty _Move__speed = new EcoreExecutorProperty(RoverMLPackage.Literals.MOVE__SPEED, Types._Move, 1);

		public static final /*@NonNull*/ ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(RoverMLPackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final /*@NonNull*/ ExecutorProperty _Position__x = new EcoreExecutorProperty(RoverMLPackage.Literals.POSITION__X, Types._Position, 0);
		public static final /*@NonNull*/ ExecutorProperty _Position__y = new EcoreExecutorProperty(RoverMLPackage.Literals.POSITION__Y, Types._Position, 1);

		public static final /*@NonNull*/ ExecutorProperty _Repeat__count = new EcoreExecutorProperty(RoverMLPackage.Literals.REPEAT__COUNT, Types._Repeat, 0);

		public static final /*@NonNull*/ ExecutorProperty _Rotate__angle = new EcoreExecutorProperty(RoverMLPackage.Literals.ROTATE__ANGLE, Types._Rotate, 0);

		public static final /*@NonNull*/ ExecutorProperty _Rover__components = new EcoreExecutorProperty(RoverMLPackage.Literals.ROVER__COMPONENTS, Types._Rover, 0);
		public static final /*@NonNull*/ ExecutorProperty _Rover__RoverProgram__rover = new ExecutorPropertyWithImplementation("RoverProgram", Types._Rover, 1, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.ROVER_PROGRAM__ROVER));
		public static final /*@NonNull*/ ExecutorProperty _Rover__RoverSystem__rovers = new ExecutorPropertyWithImplementation("RoverSystem", Types._Rover, 2, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.ROVER_SYSTEM__ROVERS));

		public static final /*@NonNull*/ ExecutorProperty _RoverProgram__block = new EcoreExecutorProperty(RoverMLPackage.Literals.ROVER_PROGRAM__BLOCK, Types._RoverProgram, 0);
		public static final /*@NonNull*/ ExecutorProperty _RoverProgram__rover = new EcoreExecutorProperty(RoverMLPackage.Literals.ROVER_PROGRAM__ROVER, Types._RoverProgram, 1);
		public static final /*@NonNull*/ ExecutorProperty _RoverProgram__RoverSystem__roverPrograms = new ExecutorPropertyWithImplementation("RoverSystem", Types._RoverProgram, 2, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.ROVER_SYSTEM__ROVER_PROGRAMS));

		public static final /*@NonNull*/ ExecutorProperty _RoverSystem__roverPrograms = new EcoreExecutorProperty(RoverMLPackage.Literals.ROVER_SYSTEM__ROVER_PROGRAMS, Types._RoverSystem, 0);
		public static final /*@NonNull*/ ExecutorProperty _RoverSystem__rovers = new EcoreExecutorProperty(RoverMLPackage.Literals.ROVER_SYSTEM__ROVERS, Types._RoverSystem, 1);

		public static final /*@NonNull*/ ExecutorProperty _Sensor__lastSensedValue = new EcoreExecutorProperty(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE, Types._Sensor, 0);

		public static final /*@NonNull*/ ExecutorProperty _SetLightColor__color = new EcoreExecutorProperty(RoverMLPackage.Literals.SET_LIGHT_COLOR__COLOR, Types._SetLightColor, 0);
		public static final /*@NonNull*/ ExecutorProperty _SetLightColor__lights = new EcoreExecutorProperty(RoverMLPackage.Literals.SET_LIGHT_COLOR__LIGHTS, Types._SetLightColor, 1);

		public static final /*@NonNull*/ ExecutorProperty _SingleQuantity__value = new EcoreExecutorProperty(RoverMLPackage.Literals.SINGLE_QUANTITY__VALUE, Types._SingleQuantity, 0);

		public static final /*@NonNull*/ ExecutorProperty _Time__timeUnit = new EcoreExecutorProperty(RoverMLPackage.Literals.TIME__TIME_UNIT, Types._Time, 0);
		public static final /*@NonNull*/ ExecutorProperty _Time__Wait__duration = new ExecutorPropertyWithImplementation("Wait", Types._Time, 1, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.WAIT__DURATION));

		public static final /*@NonNull*/ ExecutorProperty _Transition__source = new EcoreExecutorProperty(RoverMLPackage.Literals.TRANSITION__SOURCE, Types._Transition, 0);
		public static final /*@NonNull*/ ExecutorProperty _Transition__target = new EcoreExecutorProperty(RoverMLPackage.Literals.TRANSITION__TARGET, Types._Transition, 1);
		public static final /*@NonNull*/ ExecutorProperty _Transition__Block__transitions = new ExecutorPropertyWithImplementation("Block", Types._Transition, 2, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.BLOCK__TRANSITIONS));
		public static final /*@NonNull*/ ExecutorProperty _Transition__Command__incoming = new ExecutorPropertyWithImplementation("Command", Types._Transition, 3, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.COMMAND__INCOMING));
		public static final /*@NonNull*/ ExecutorProperty _Transition__Command__outgoing = new ExecutorPropertyWithImplementation("Command", Types._Transition, 4, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.COMMAND__OUTGOING));

		public static final /*@NonNull*/ ExecutorProperty _TriggeredTransition__comparisonValue = new EcoreExecutorProperty(RoverMLPackage.Literals.TRIGGERED_TRANSITION__COMPARISON_VALUE, Types._TriggeredTransition, 0);
		public static final /*@NonNull*/ ExecutorProperty _TriggeredTransition__operator = new EcoreExecutorProperty(RoverMLPackage.Literals.TRIGGERED_TRANSITION__OPERATOR, Types._TriggeredTransition, 1);
		public static final /*@NonNull*/ ExecutorProperty _TriggeredTransition__sensor = new EcoreExecutorProperty(RoverMLPackage.Literals.TRIGGERED_TRANSITION__SENSOR, Types._TriggeredTransition, 2);

		public static final /*@NonNull*/ ExecutorProperty _Velocity__velocityUnit = new EcoreExecutorProperty(RoverMLPackage.Literals.VELOCITY__VELOCITY_UNIT, Types._Velocity, 0);
		public static final /*@NonNull*/ ExecutorProperty _Velocity__Move__speed = new ExecutorPropertyWithImplementation("Move", Types._Velocity, 1, new EcoreLibraryOppositeProperty(RoverMLPackage.Literals.MOVE__SPEED));

		public static final /*@NonNull*/ ExecutorProperty _Wait__duration = new EcoreExecutorProperty(RoverMLPackage.Literals.WAIT__DURATION, Types._Wait, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RoverMLTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Actuator =
			{
				Fragments._Actuator__OclAny /* 0 */,
				Fragments._Actuator__OclElement /* 1 */,
				Fragments._Actuator__NamedElement /* 2 */,
				Fragments._Actuator__Component /* 3 */,
				Fragments._Actuator__Actuator /* 4 */
			};
		private static final int /*@NonNull*/ [] __Actuator = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Angle =
			{
				Fragments._Angle__OclAny /* 0 */,
				Fragments._Angle__OclElement /* 1 */,
				Fragments._Angle__Quantity /* 2 */,
				Fragments._Angle__SingleQuantity /* 3 */,
				Fragments._Angle__Angle /* 4 */
			};
		private static final int /*@NonNull*/ [] __Angle = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AngleUnit =
			{
				Fragments._AngleUnit__OclAny /* 0 */,
				Fragments._AngleUnit__OclElement /* 1 */,
				Fragments._AngleUnit__OclType /* 2 */,
				Fragments._AngleUnit__OclEnumeration /* 3 */,
				Fragments._AngleUnit__AngleUnit /* 4 */
			};
		private static final int /*@NonNull*/ [] __AngleUnit = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Block =
			{
				Fragments._Block__OclAny /* 0 */,
				Fragments._Block__OclElement /* 1 */,
				Fragments._Block__Block /* 2 */
			};
		private static final int /*@NonNull*/ [] __Block = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Color =
			{
				Fragments._Color__OclAny /* 0 */,
				Fragments._Color__OclElement /* 1 */,
				Fragments._Color__OclType /* 2 */,
				Fragments._Color__OclEnumeration /* 3 */,
				Fragments._Color__Color /* 4 */
			};
		private static final int /*@NonNull*/ [] __Color = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Command =
			{
				Fragments._Command__OclAny /* 0 */,
				Fragments._Command__OclElement /* 1 */,
				Fragments._Command__NamedElement /* 2 */,
				Fragments._Command__Command /* 3 */
			};
		private static final int /*@NonNull*/ [] __Command = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ComparisonOperator =
			{
				Fragments._ComparisonOperator__OclAny /* 0 */,
				Fragments._ComparisonOperator__OclElement /* 1 */,
				Fragments._ComparisonOperator__OclType /* 2 */,
				Fragments._ComparisonOperator__OclEnumeration /* 3 */,
				Fragments._ComparisonOperator__ComparisonOperator /* 4 */
			};
		private static final int /*@NonNull*/ [] __ComparisonOperator = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Compass =
			{
				Fragments._Compass__OclAny /* 0 */,
				Fragments._Compass__OclElement /* 1 */,
				Fragments._Compass__NamedElement /* 2 */,
				Fragments._Compass__Component /* 3 */,
				Fragments._Compass__Sensor /* 4 */,
				Fragments._Compass__Compass /* 5 */
			};
		private static final int /*@NonNull*/ [] __Compass = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _CompassTrigger =
			{
				Fragments._CompassTrigger__OclAny /* 0 */,
				Fragments._CompassTrigger__OclElement /* 1 */,
				Fragments._CompassTrigger__NamedElement /* 2 */,
				Fragments._CompassTrigger__Transition /* 3 */,
				Fragments._CompassTrigger__TriggeredTransition /* 4 */,
				Fragments._CompassTrigger__CompassTrigger /* 5 */
			};
		private static final int /*@NonNull*/ [] __CompassTrigger = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Component =
			{
				Fragments._Component__OclAny /* 0 */,
				Fragments._Component__OclElement /* 1 */,
				Fragments._Component__NamedElement /* 2 */,
				Fragments._Component__Component /* 3 */
			};
		private static final int /*@NonNull*/ [] __Component = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _DistanceSensor =
			{
				Fragments._DistanceSensor__OclAny /* 0 */,
				Fragments._DistanceSensor__OclElement /* 1 */,
				Fragments._DistanceSensor__NamedElement /* 2 */,
				Fragments._DistanceSensor__Component /* 3 */,
				Fragments._DistanceSensor__Sensor /* 4 */,
				Fragments._DistanceSensor__DistanceSensor /* 5 */
			};
		private static final int /*@NonNull*/ [] __DistanceSensor = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _DistanceSensorTrigger =
			{
				Fragments._DistanceSensorTrigger__OclAny /* 0 */,
				Fragments._DistanceSensorTrigger__OclElement /* 1 */,
				Fragments._DistanceSensorTrigger__NamedElement /* 2 */,
				Fragments._DistanceSensorTrigger__Transition /* 3 */,
				Fragments._DistanceSensorTrigger__TriggeredTransition /* 4 */,
				Fragments._DistanceSensorTrigger__DistanceSensorTrigger /* 5 */
			};
		private static final int /*@NonNull*/ [] __DistanceSensorTrigger = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _GPS =
			{
				Fragments._GPS__OclAny /* 0 */,
				Fragments._GPS__OclElement /* 1 */,
				Fragments._GPS__NamedElement /* 2 */,
				Fragments._GPS__Component /* 3 */,
				Fragments._GPS__Sensor /* 4 */,
				Fragments._GPS__GPS /* 5 */
			};
		private static final int /*@NonNull*/ [] __GPS = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _GpsTrigger =
			{
				Fragments._GpsTrigger__OclAny /* 0 */,
				Fragments._GpsTrigger__OclElement /* 1 */,
				Fragments._GpsTrigger__NamedElement /* 2 */,
				Fragments._GpsTrigger__Transition /* 3 */,
				Fragments._GpsTrigger__TriggeredTransition /* 4 */,
				Fragments._GpsTrigger__GpsTrigger /* 5 */
			};
		private static final int /*@NonNull*/ [] __GpsTrigger = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Length =
			{
				Fragments._Length__OclAny /* 0 */,
				Fragments._Length__OclElement /* 1 */,
				Fragments._Length__Quantity /* 2 */,
				Fragments._Length__SingleQuantity /* 3 */,
				Fragments._Length__Length /* 4 */
			};
		private static final int /*@NonNull*/ [] __Length = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _LengthUnit =
			{
				Fragments._LengthUnit__OclAny /* 0 */,
				Fragments._LengthUnit__OclElement /* 1 */,
				Fragments._LengthUnit__OclType /* 2 */,
				Fragments._LengthUnit__OclEnumeration /* 3 */,
				Fragments._LengthUnit__LengthUnit /* 4 */
			};
		private static final int /*@NonNull*/ [] __LengthUnit = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Light =
			{
				Fragments._Light__OclAny /* 0 */,
				Fragments._Light__OclElement /* 1 */,
				Fragments._Light__NamedElement /* 2 */,
				Fragments._Light__Component /* 3 */,
				Fragments._Light__Actuator /* 4 */,
				Fragments._Light__Light /* 5 */
			};
		private static final int /*@NonNull*/ [] __Light = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Motor =
			{
				Fragments._Motor__OclAny /* 0 */,
				Fragments._Motor__OclElement /* 1 */,
				Fragments._Motor__NamedElement /* 2 */,
				Fragments._Motor__Component /* 3 */,
				Fragments._Motor__Actuator /* 4 */,
				Fragments._Motor__Motor /* 5 */
			};
		private static final int /*@NonNull*/ [] __Motor = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Move =
			{
				Fragments._Move__OclAny /* 0 */,
				Fragments._Move__OclElement /* 1 */,
				Fragments._Move__NamedElement /* 2 */,
				Fragments._Move__Command /* 3 */,
				Fragments._Move__Move /* 4 */
			};
		private static final int /*@NonNull*/ [] __Move = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Position =
			{
				Fragments._Position__OclAny /* 0 */,
				Fragments._Position__OclElement /* 1 */,
				Fragments._Position__Quantity /* 2 */,
				Fragments._Position__Position /* 3 */
			};
		private static final int /*@NonNull*/ [] __Position = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Quantity =
			{
				Fragments._Quantity__OclAny /* 0 */,
				Fragments._Quantity__OclElement /* 1 */,
				Fragments._Quantity__Quantity /* 2 */
			};
		private static final int /*@NonNull*/ [] __Quantity = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Repeat =
			{
				Fragments._Repeat__OclAny /* 0 */,
				Fragments._Repeat__OclElement /* 1 */,
				Fragments._Repeat__Block /* 2 */,
				Fragments._Repeat__NamedElement /* 2 */,
				Fragments._Repeat__Command /* 3 */,
				Fragments._Repeat__Repeat /* 4 */
			};
		private static final int /*@NonNull*/ [] __Repeat = { 1,1,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Rotate =
			{
				Fragments._Rotate__OclAny /* 0 */,
				Fragments._Rotate__OclElement /* 1 */,
				Fragments._Rotate__NamedElement /* 2 */,
				Fragments._Rotate__Command /* 3 */,
				Fragments._Rotate__Rotate /* 4 */
			};
		private static final int /*@NonNull*/ [] __Rotate = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Rover =
			{
				Fragments._Rover__OclAny /* 0 */,
				Fragments._Rover__OclElement /* 1 */,
				Fragments._Rover__NamedElement /* 2 */,
				Fragments._Rover__Rover /* 3 */
			};
		private static final int /*@NonNull*/ [] __Rover = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RoverProgram =
			{
				Fragments._RoverProgram__OclAny /* 0 */,
				Fragments._RoverProgram__OclElement /* 1 */,
				Fragments._RoverProgram__NamedElement /* 2 */,
				Fragments._RoverProgram__RoverProgram /* 3 */
			};
		private static final int /*@NonNull*/ [] __RoverProgram = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RoverSystem =
			{
				Fragments._RoverSystem__OclAny /* 0 */,
				Fragments._RoverSystem__OclElement /* 1 */,
				Fragments._RoverSystem__RoverSystem /* 2 */
			};
		private static final int /*@NonNull*/ [] __RoverSystem = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Sensor =
			{
				Fragments._Sensor__OclAny /* 0 */,
				Fragments._Sensor__OclElement /* 1 */,
				Fragments._Sensor__NamedElement /* 2 */,
				Fragments._Sensor__Component /* 3 */,
				Fragments._Sensor__Sensor /* 4 */
			};
		private static final int /*@NonNull*/ [] __Sensor = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SetLightColor =
			{
				Fragments._SetLightColor__OclAny /* 0 */,
				Fragments._SetLightColor__OclElement /* 1 */,
				Fragments._SetLightColor__NamedElement /* 2 */,
				Fragments._SetLightColor__Command /* 3 */,
				Fragments._SetLightColor__SetLightColor /* 4 */
			};
		private static final int /*@NonNull*/ [] __SetLightColor = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SingleQuantity =
			{
				Fragments._SingleQuantity__OclAny /* 0 */,
				Fragments._SingleQuantity__OclElement /* 1 */,
				Fragments._SingleQuantity__Quantity /* 2 */,
				Fragments._SingleQuantity__SingleQuantity /* 3 */
			};
		private static final int /*@NonNull*/ [] __SingleQuantity = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Terminate =
			{
				Fragments._Terminate__OclAny /* 0 */,
				Fragments._Terminate__OclElement /* 1 */,
				Fragments._Terminate__NamedElement /* 2 */,
				Fragments._Terminate__Command /* 3 */,
				Fragments._Terminate__Terminate /* 4 */
			};
		private static final int /*@NonNull*/ [] __Terminate = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Time =
			{
				Fragments._Time__OclAny /* 0 */,
				Fragments._Time__OclElement /* 1 */,
				Fragments._Time__Quantity /* 2 */,
				Fragments._Time__SingleQuantity /* 3 */,
				Fragments._Time__Time /* 4 */
			};
		private static final int /*@NonNull*/ [] __Time = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TimeUnit =
			{
				Fragments._TimeUnit__OclAny /* 0 */,
				Fragments._TimeUnit__OclElement /* 1 */,
				Fragments._TimeUnit__OclType /* 2 */,
				Fragments._TimeUnit__OclEnumeration /* 3 */,
				Fragments._TimeUnit__TimeUnit /* 4 */
			};
		private static final int /*@NonNull*/ [] __TimeUnit = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Transition =
			{
				Fragments._Transition__OclAny /* 0 */,
				Fragments._Transition__OclElement /* 1 */,
				Fragments._Transition__NamedElement /* 2 */,
				Fragments._Transition__Transition /* 3 */
			};
		private static final int /*@NonNull*/ [] __Transition = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _TriggeredTransition =
			{
				Fragments._TriggeredTransition__OclAny /* 0 */,
				Fragments._TriggeredTransition__OclElement /* 1 */,
				Fragments._TriggeredTransition__NamedElement /* 2 */,
				Fragments._TriggeredTransition__Transition /* 3 */,
				Fragments._TriggeredTransition__TriggeredTransition /* 4 */
			};
		private static final int /*@NonNull*/ [] __TriggeredTransition = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Velocity =
			{
				Fragments._Velocity__OclAny /* 0 */,
				Fragments._Velocity__OclElement /* 1 */,
				Fragments._Velocity__Quantity /* 2 */,
				Fragments._Velocity__SingleQuantity /* 3 */,
				Fragments._Velocity__Velocity /* 4 */
			};
		private static final int /*@NonNull*/ [] __Velocity = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _VelocityUnit =
			{
				Fragments._VelocityUnit__OclAny /* 0 */,
				Fragments._VelocityUnit__OclElement /* 1 */,
				Fragments._VelocityUnit__OclType /* 2 */,
				Fragments._VelocityUnit__OclEnumeration /* 3 */,
				Fragments._VelocityUnit__VelocityUnit /* 4 */
			};
		private static final int /*@NonNull*/ [] __VelocityUnit = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Wait =
			{
				Fragments._Wait__OclAny /* 0 */,
				Fragments._Wait__OclElement /* 1 */,
				Fragments._Wait__NamedElement /* 2 */,
				Fragments._Wait__Command /* 3 */,
				Fragments._Wait__Wait /* 4 */
			};
		private static final int /*@NonNull*/ [] __Wait = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Actuator.initFragments(_Actuator, __Actuator);
			Types._Angle.initFragments(_Angle, __Angle);
			Types._AngleUnit.initFragments(_AngleUnit, __AngleUnit);
			Types._Block.initFragments(_Block, __Block);
			Types._Color.initFragments(_Color, __Color);
			Types._Command.initFragments(_Command, __Command);
			Types._ComparisonOperator.initFragments(_ComparisonOperator, __ComparisonOperator);
			Types._Compass.initFragments(_Compass, __Compass);
			Types._CompassTrigger.initFragments(_CompassTrigger, __CompassTrigger);
			Types._Component.initFragments(_Component, __Component);
			Types._DistanceSensor.initFragments(_DistanceSensor, __DistanceSensor);
			Types._DistanceSensorTrigger.initFragments(_DistanceSensorTrigger, __DistanceSensorTrigger);
			Types._GPS.initFragments(_GPS, __GPS);
			Types._GpsTrigger.initFragments(_GpsTrigger, __GpsTrigger);
			Types._Length.initFragments(_Length, __Length);
			Types._LengthUnit.initFragments(_LengthUnit, __LengthUnit);
			Types._Light.initFragments(_Light, __Light);
			Types._Motor.initFragments(_Motor, __Motor);
			Types._Move.initFragments(_Move, __Move);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Position.initFragments(_Position, __Position);
			Types._Quantity.initFragments(_Quantity, __Quantity);
			Types._Repeat.initFragments(_Repeat, __Repeat);
			Types._Rotate.initFragments(_Rotate, __Rotate);
			Types._Rover.initFragments(_Rover, __Rover);
			Types._RoverProgram.initFragments(_RoverProgram, __RoverProgram);
			Types._RoverSystem.initFragments(_RoverSystem, __RoverSystem);
			Types._Sensor.initFragments(_Sensor, __Sensor);
			Types._SetLightColor.initFragments(_SetLightColor, __SetLightColor);
			Types._SingleQuantity.initFragments(_SingleQuantity, __SingleQuantity);
			Types._Terminate.initFragments(_Terminate, __Terminate);
			Types._Time.initFragments(_Time, __Time);
			Types._TimeUnit.initFragments(_TimeUnit, __TimeUnit);
			Types._Transition.initFragments(_Transition, __Transition);
			Types._TriggeredTransition.initFragments(_TriggeredTransition, __TriggeredTransition);
			Types._Velocity.initFragments(_Velocity, __Velocity);
			Types._VelocityUnit.initFragments(_VelocityUnit, __VelocityUnit);
			Types._Wait.initFragments(_Wait, __Wait);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RoverMLTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actuator__Actuator = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actuator__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actuator__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actuator__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Actuator__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Angle__Angle = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Angle__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Angle__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Angle__Quantity = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Angle__SingleQuantity = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AngleUnit__AngleUnit = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AngleUnit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AngleUnit__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AngleUnit__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AngleUnit__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Block__Block = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Block__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Block__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Color__Color = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Color__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Color__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Color__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Color__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Command__Command = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Command__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Command__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Command__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ComparisonOperator__ComparisonOperator = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ComparisonOperator__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ComparisonOperator__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ComparisonOperator__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ComparisonOperator__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Compass__Compass = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Compass__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Compass__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Compass__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Compass__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Compass__Sensor = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CompassTrigger__CompassTrigger = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CompassTrigger__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CompassTrigger__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CompassTrigger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CompassTrigger__Transition = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CompassTrigger__TriggeredTransition = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Component__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Component__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Component__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Component__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DistanceSensor__DistanceSensor = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DistanceSensor__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DistanceSensor__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DistanceSensor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DistanceSensor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DistanceSensor__Sensor = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DistanceSensorTrigger__DistanceSensorTrigger = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DistanceSensorTrigger__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DistanceSensorTrigger__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DistanceSensorTrigger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DistanceSensorTrigger__Transition = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DistanceSensorTrigger__TriggeredTransition = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GPS__GPS = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GPS__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GPS__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GPS__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GPS__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GPS__Sensor = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GpsTrigger__GpsTrigger = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GpsTrigger__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GpsTrigger__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GpsTrigger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GpsTrigger__Transition = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GpsTrigger__TriggeredTransition = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Length__Length = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Length__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Length__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Length__Quantity = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Length__SingleQuantity = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LengthUnit__LengthUnit = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LengthUnit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LengthUnit__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LengthUnit__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _LengthUnit__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Light__Light = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Light__Actuator = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Light__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Light__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Light__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Light__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Motor__Motor = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Motor__Actuator = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Motor__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Motor__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Motor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Motor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Move__Move = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Move__Command = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Move__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Move__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Move__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Position__Position = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Position__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Position__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Position__Quantity = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Quantity__Quantity = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Quantity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Quantity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Repeat__Repeat = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Repeat__Block = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Repeat__Command = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Repeat__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Repeat__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Repeat__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rotate__Rotate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rotate__Command = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rotate__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rotate__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rotate__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rover__Rover = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rover__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rover__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Rover__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RoverProgram__RoverProgram = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RoverProgram__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RoverProgram__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RoverProgram__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RoverSystem__RoverSystem = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RoverSystem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RoverSystem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensor__Sensor = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensor__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensor__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SetLightColor__SetLightColor = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SetLightColor__Command = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SetLightColor__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SetLightColor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SetLightColor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SingleQuantity__SingleQuantity = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SingleQuantity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SingleQuantity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SingleQuantity__Quantity = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Terminate__Terminate = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Terminate__Command = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Terminate__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Terminate__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Terminate__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Time__Time = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Time__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Time__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Time__Quantity = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Time__SingleQuantity = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TimeUnit__TimeUnit = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TimeUnit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TimeUnit__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TimeUnit__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TimeUnit__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Transition__Transition = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Transition__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Transition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Transition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TriggeredTransition__TriggeredTransition = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TriggeredTransition__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TriggeredTransition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TriggeredTransition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _TriggeredTransition__Transition = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Velocity__Velocity = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Velocity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Velocity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Velocity__Quantity = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Velocity__SingleQuantity = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VelocityUnit__VelocityUnit = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VelocityUnit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VelocityUnit__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VelocityUnit__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VelocityUnit__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Wait__Wait = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Wait__Command = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Wait__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Wait__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Wait__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Actuator__Actuator.initOperations(_Actuator__Actuator);
			Fragments._Actuator__Component.initOperations(_Actuator__Component);
			Fragments._Actuator__NamedElement.initOperations(_Actuator__NamedElement);
			Fragments._Actuator__OclAny.initOperations(_Actuator__OclAny);
			Fragments._Actuator__OclElement.initOperations(_Actuator__OclElement);

			Fragments._Angle__Angle.initOperations(_Angle__Angle);
			Fragments._Angle__OclAny.initOperations(_Angle__OclAny);
			Fragments._Angle__OclElement.initOperations(_Angle__OclElement);
			Fragments._Angle__Quantity.initOperations(_Angle__Quantity);
			Fragments._Angle__SingleQuantity.initOperations(_Angle__SingleQuantity);

			Fragments._AngleUnit__AngleUnit.initOperations(_AngleUnit__AngleUnit);
			Fragments._AngleUnit__OclAny.initOperations(_AngleUnit__OclAny);
			Fragments._AngleUnit__OclElement.initOperations(_AngleUnit__OclElement);
			Fragments._AngleUnit__OclEnumeration.initOperations(_AngleUnit__OclEnumeration);
			Fragments._AngleUnit__OclType.initOperations(_AngleUnit__OclType);

			Fragments._Block__Block.initOperations(_Block__Block);
			Fragments._Block__OclAny.initOperations(_Block__OclAny);
			Fragments._Block__OclElement.initOperations(_Block__OclElement);

			Fragments._Color__Color.initOperations(_Color__Color);
			Fragments._Color__OclAny.initOperations(_Color__OclAny);
			Fragments._Color__OclElement.initOperations(_Color__OclElement);
			Fragments._Color__OclEnumeration.initOperations(_Color__OclEnumeration);
			Fragments._Color__OclType.initOperations(_Color__OclType);

			Fragments._Command__Command.initOperations(_Command__Command);
			Fragments._Command__NamedElement.initOperations(_Command__NamedElement);
			Fragments._Command__OclAny.initOperations(_Command__OclAny);
			Fragments._Command__OclElement.initOperations(_Command__OclElement);

			Fragments._ComparisonOperator__ComparisonOperator.initOperations(_ComparisonOperator__ComparisonOperator);
			Fragments._ComparisonOperator__OclAny.initOperations(_ComparisonOperator__OclAny);
			Fragments._ComparisonOperator__OclElement.initOperations(_ComparisonOperator__OclElement);
			Fragments._ComparisonOperator__OclEnumeration.initOperations(_ComparisonOperator__OclEnumeration);
			Fragments._ComparisonOperator__OclType.initOperations(_ComparisonOperator__OclType);

			Fragments._Compass__Compass.initOperations(_Compass__Compass);
			Fragments._Compass__Component.initOperations(_Compass__Component);
			Fragments._Compass__NamedElement.initOperations(_Compass__NamedElement);
			Fragments._Compass__OclAny.initOperations(_Compass__OclAny);
			Fragments._Compass__OclElement.initOperations(_Compass__OclElement);
			Fragments._Compass__Sensor.initOperations(_Compass__Sensor);

			Fragments._CompassTrigger__CompassTrigger.initOperations(_CompassTrigger__CompassTrigger);
			Fragments._CompassTrigger__NamedElement.initOperations(_CompassTrigger__NamedElement);
			Fragments._CompassTrigger__OclAny.initOperations(_CompassTrigger__OclAny);
			Fragments._CompassTrigger__OclElement.initOperations(_CompassTrigger__OclElement);
			Fragments._CompassTrigger__Transition.initOperations(_CompassTrigger__Transition);
			Fragments._CompassTrigger__TriggeredTransition.initOperations(_CompassTrigger__TriggeredTransition);

			Fragments._Component__Component.initOperations(_Component__Component);
			Fragments._Component__NamedElement.initOperations(_Component__NamedElement);
			Fragments._Component__OclAny.initOperations(_Component__OclAny);
			Fragments._Component__OclElement.initOperations(_Component__OclElement);

			Fragments._DistanceSensor__Component.initOperations(_DistanceSensor__Component);
			Fragments._DistanceSensor__DistanceSensor.initOperations(_DistanceSensor__DistanceSensor);
			Fragments._DistanceSensor__NamedElement.initOperations(_DistanceSensor__NamedElement);
			Fragments._DistanceSensor__OclAny.initOperations(_DistanceSensor__OclAny);
			Fragments._DistanceSensor__OclElement.initOperations(_DistanceSensor__OclElement);
			Fragments._DistanceSensor__Sensor.initOperations(_DistanceSensor__Sensor);

			Fragments._DistanceSensorTrigger__DistanceSensorTrigger.initOperations(_DistanceSensorTrigger__DistanceSensorTrigger);
			Fragments._DistanceSensorTrigger__NamedElement.initOperations(_DistanceSensorTrigger__NamedElement);
			Fragments._DistanceSensorTrigger__OclAny.initOperations(_DistanceSensorTrigger__OclAny);
			Fragments._DistanceSensorTrigger__OclElement.initOperations(_DistanceSensorTrigger__OclElement);
			Fragments._DistanceSensorTrigger__Transition.initOperations(_DistanceSensorTrigger__Transition);
			Fragments._DistanceSensorTrigger__TriggeredTransition.initOperations(_DistanceSensorTrigger__TriggeredTransition);

			Fragments._GPS__Component.initOperations(_GPS__Component);
			Fragments._GPS__GPS.initOperations(_GPS__GPS);
			Fragments._GPS__NamedElement.initOperations(_GPS__NamedElement);
			Fragments._GPS__OclAny.initOperations(_GPS__OclAny);
			Fragments._GPS__OclElement.initOperations(_GPS__OclElement);
			Fragments._GPS__Sensor.initOperations(_GPS__Sensor);

			Fragments._GpsTrigger__GpsTrigger.initOperations(_GpsTrigger__GpsTrigger);
			Fragments._GpsTrigger__NamedElement.initOperations(_GpsTrigger__NamedElement);
			Fragments._GpsTrigger__OclAny.initOperations(_GpsTrigger__OclAny);
			Fragments._GpsTrigger__OclElement.initOperations(_GpsTrigger__OclElement);
			Fragments._GpsTrigger__Transition.initOperations(_GpsTrigger__Transition);
			Fragments._GpsTrigger__TriggeredTransition.initOperations(_GpsTrigger__TriggeredTransition);

			Fragments._Length__Length.initOperations(_Length__Length);
			Fragments._Length__OclAny.initOperations(_Length__OclAny);
			Fragments._Length__OclElement.initOperations(_Length__OclElement);
			Fragments._Length__Quantity.initOperations(_Length__Quantity);
			Fragments._Length__SingleQuantity.initOperations(_Length__SingleQuantity);

			Fragments._LengthUnit__LengthUnit.initOperations(_LengthUnit__LengthUnit);
			Fragments._LengthUnit__OclAny.initOperations(_LengthUnit__OclAny);
			Fragments._LengthUnit__OclElement.initOperations(_LengthUnit__OclElement);
			Fragments._LengthUnit__OclEnumeration.initOperations(_LengthUnit__OclEnumeration);
			Fragments._LengthUnit__OclType.initOperations(_LengthUnit__OclType);

			Fragments._Light__Actuator.initOperations(_Light__Actuator);
			Fragments._Light__Component.initOperations(_Light__Component);
			Fragments._Light__Light.initOperations(_Light__Light);
			Fragments._Light__NamedElement.initOperations(_Light__NamedElement);
			Fragments._Light__OclAny.initOperations(_Light__OclAny);
			Fragments._Light__OclElement.initOperations(_Light__OclElement);

			Fragments._Motor__Actuator.initOperations(_Motor__Actuator);
			Fragments._Motor__Component.initOperations(_Motor__Component);
			Fragments._Motor__Motor.initOperations(_Motor__Motor);
			Fragments._Motor__NamedElement.initOperations(_Motor__NamedElement);
			Fragments._Motor__OclAny.initOperations(_Motor__OclAny);
			Fragments._Motor__OclElement.initOperations(_Motor__OclElement);

			Fragments._Move__Command.initOperations(_Move__Command);
			Fragments._Move__Move.initOperations(_Move__Move);
			Fragments._Move__NamedElement.initOperations(_Move__NamedElement);
			Fragments._Move__OclAny.initOperations(_Move__OclAny);
			Fragments._Move__OclElement.initOperations(_Move__OclElement);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._Position__OclAny.initOperations(_Position__OclAny);
			Fragments._Position__OclElement.initOperations(_Position__OclElement);
			Fragments._Position__Position.initOperations(_Position__Position);
			Fragments._Position__Quantity.initOperations(_Position__Quantity);

			Fragments._Quantity__OclAny.initOperations(_Quantity__OclAny);
			Fragments._Quantity__OclElement.initOperations(_Quantity__OclElement);
			Fragments._Quantity__Quantity.initOperations(_Quantity__Quantity);

			Fragments._Repeat__Block.initOperations(_Repeat__Block);
			Fragments._Repeat__Command.initOperations(_Repeat__Command);
			Fragments._Repeat__NamedElement.initOperations(_Repeat__NamedElement);
			Fragments._Repeat__OclAny.initOperations(_Repeat__OclAny);
			Fragments._Repeat__OclElement.initOperations(_Repeat__OclElement);
			Fragments._Repeat__Repeat.initOperations(_Repeat__Repeat);

			Fragments._Rotate__Command.initOperations(_Rotate__Command);
			Fragments._Rotate__NamedElement.initOperations(_Rotate__NamedElement);
			Fragments._Rotate__OclAny.initOperations(_Rotate__OclAny);
			Fragments._Rotate__OclElement.initOperations(_Rotate__OclElement);
			Fragments._Rotate__Rotate.initOperations(_Rotate__Rotate);

			Fragments._Rover__NamedElement.initOperations(_Rover__NamedElement);
			Fragments._Rover__OclAny.initOperations(_Rover__OclAny);
			Fragments._Rover__OclElement.initOperations(_Rover__OclElement);
			Fragments._Rover__Rover.initOperations(_Rover__Rover);

			Fragments._RoverProgram__NamedElement.initOperations(_RoverProgram__NamedElement);
			Fragments._RoverProgram__OclAny.initOperations(_RoverProgram__OclAny);
			Fragments._RoverProgram__OclElement.initOperations(_RoverProgram__OclElement);
			Fragments._RoverProgram__RoverProgram.initOperations(_RoverProgram__RoverProgram);

			Fragments._RoverSystem__OclAny.initOperations(_RoverSystem__OclAny);
			Fragments._RoverSystem__OclElement.initOperations(_RoverSystem__OclElement);
			Fragments._RoverSystem__RoverSystem.initOperations(_RoverSystem__RoverSystem);

			Fragments._Sensor__Component.initOperations(_Sensor__Component);
			Fragments._Sensor__NamedElement.initOperations(_Sensor__NamedElement);
			Fragments._Sensor__OclAny.initOperations(_Sensor__OclAny);
			Fragments._Sensor__OclElement.initOperations(_Sensor__OclElement);
			Fragments._Sensor__Sensor.initOperations(_Sensor__Sensor);

			Fragments._SetLightColor__Command.initOperations(_SetLightColor__Command);
			Fragments._SetLightColor__NamedElement.initOperations(_SetLightColor__NamedElement);
			Fragments._SetLightColor__OclAny.initOperations(_SetLightColor__OclAny);
			Fragments._SetLightColor__OclElement.initOperations(_SetLightColor__OclElement);
			Fragments._SetLightColor__SetLightColor.initOperations(_SetLightColor__SetLightColor);

			Fragments._SingleQuantity__OclAny.initOperations(_SingleQuantity__OclAny);
			Fragments._SingleQuantity__OclElement.initOperations(_SingleQuantity__OclElement);
			Fragments._SingleQuantity__Quantity.initOperations(_SingleQuantity__Quantity);
			Fragments._SingleQuantity__SingleQuantity.initOperations(_SingleQuantity__SingleQuantity);

			Fragments._Terminate__Command.initOperations(_Terminate__Command);
			Fragments._Terminate__NamedElement.initOperations(_Terminate__NamedElement);
			Fragments._Terminate__OclAny.initOperations(_Terminate__OclAny);
			Fragments._Terminate__OclElement.initOperations(_Terminate__OclElement);
			Fragments._Terminate__Terminate.initOperations(_Terminate__Terminate);

			Fragments._Time__OclAny.initOperations(_Time__OclAny);
			Fragments._Time__OclElement.initOperations(_Time__OclElement);
			Fragments._Time__Quantity.initOperations(_Time__Quantity);
			Fragments._Time__SingleQuantity.initOperations(_Time__SingleQuantity);
			Fragments._Time__Time.initOperations(_Time__Time);

			Fragments._TimeUnit__OclAny.initOperations(_TimeUnit__OclAny);
			Fragments._TimeUnit__OclElement.initOperations(_TimeUnit__OclElement);
			Fragments._TimeUnit__OclEnumeration.initOperations(_TimeUnit__OclEnumeration);
			Fragments._TimeUnit__OclType.initOperations(_TimeUnit__OclType);
			Fragments._TimeUnit__TimeUnit.initOperations(_TimeUnit__TimeUnit);

			Fragments._Transition__NamedElement.initOperations(_Transition__NamedElement);
			Fragments._Transition__OclAny.initOperations(_Transition__OclAny);
			Fragments._Transition__OclElement.initOperations(_Transition__OclElement);
			Fragments._Transition__Transition.initOperations(_Transition__Transition);

			Fragments._TriggeredTransition__NamedElement.initOperations(_TriggeredTransition__NamedElement);
			Fragments._TriggeredTransition__OclAny.initOperations(_TriggeredTransition__OclAny);
			Fragments._TriggeredTransition__OclElement.initOperations(_TriggeredTransition__OclElement);
			Fragments._TriggeredTransition__Transition.initOperations(_TriggeredTransition__Transition);
			Fragments._TriggeredTransition__TriggeredTransition.initOperations(_TriggeredTransition__TriggeredTransition);

			Fragments._Velocity__OclAny.initOperations(_Velocity__OclAny);
			Fragments._Velocity__OclElement.initOperations(_Velocity__OclElement);
			Fragments._Velocity__Quantity.initOperations(_Velocity__Quantity);
			Fragments._Velocity__SingleQuantity.initOperations(_Velocity__SingleQuantity);
			Fragments._Velocity__Velocity.initOperations(_Velocity__Velocity);

			Fragments._VelocityUnit__OclAny.initOperations(_VelocityUnit__OclAny);
			Fragments._VelocityUnit__OclElement.initOperations(_VelocityUnit__OclElement);
			Fragments._VelocityUnit__OclEnumeration.initOperations(_VelocityUnit__OclEnumeration);
			Fragments._VelocityUnit__OclType.initOperations(_VelocityUnit__OclType);
			Fragments._VelocityUnit__VelocityUnit.initOperations(_VelocityUnit__VelocityUnit);

			Fragments._Wait__Command.initOperations(_Wait__Command);
			Fragments._Wait__NamedElement.initOperations(_Wait__NamedElement);
			Fragments._Wait__OclAny.initOperations(_Wait__OclAny);
			Fragments._Wait__OclElement.initOperations(_Wait__OclElement);
			Fragments._Wait__Wait.initOperations(_Wait__Wait);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RoverMLTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Actuator = {
			RoverMLTables.Properties._Component__kind,
			RoverMLTables.Properties._NamedElement__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Angle = {
			RoverMLTables.Properties._Angle__angleUnit,
			RoverMLTables.Properties._SingleQuantity__value
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AngleUnit = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Block = {
			RoverMLTables.Properties._Block__commands,
			RoverMLTables.Properties._Block__transitions
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Color = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Command = {
			RoverMLTables.Properties._Command__incoming,
			RoverMLTables.Properties._NamedElement__name,
			RoverMLTables.Properties._Command__outgoing
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ComparisonOperator = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Compass = {
			RoverMLTables.Properties._Component__kind,
			RoverMLTables.Properties._Sensor__lastSensedValue,
			RoverMLTables.Properties._NamedElement__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _CompassTrigger = {
			RoverMLTables.Properties._TriggeredTransition__comparisonValue,
			RoverMLTables.Properties._NamedElement__name,
			RoverMLTables.Properties._TriggeredTransition__operator,
			RoverMLTables.Properties._TriggeredTransition__sensor,
			RoverMLTables.Properties._Transition__source,
			RoverMLTables.Properties._Transition__target
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Component = {
			RoverMLTables.Properties._Component__kind,
			RoverMLTables.Properties._NamedElement__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _DistanceSensor = {
			RoverMLTables.Properties._Component__kind,
			RoverMLTables.Properties._Sensor__lastSensedValue,
			RoverMLTables.Properties._NamedElement__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _DistanceSensorTrigger = {
			RoverMLTables.Properties._TriggeredTransition__comparisonValue,
			RoverMLTables.Properties._NamedElement__name,
			RoverMLTables.Properties._TriggeredTransition__operator,
			RoverMLTables.Properties._TriggeredTransition__sensor,
			RoverMLTables.Properties._Transition__source,
			RoverMLTables.Properties._Transition__target
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _GPS = {
			RoverMLTables.Properties._Component__kind,
			RoverMLTables.Properties._Sensor__lastSensedValue,
			RoverMLTables.Properties._NamedElement__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _GpsTrigger = {
			RoverMLTables.Properties._TriggeredTransition__comparisonValue,
			RoverMLTables.Properties._NamedElement__name,
			RoverMLTables.Properties._TriggeredTransition__operator,
			RoverMLTables.Properties._TriggeredTransition__sensor,
			RoverMLTables.Properties._Transition__source,
			RoverMLTables.Properties._Transition__target
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Length = {
			RoverMLTables.Properties._Length__lengthUnit,
			RoverMLTables.Properties._SingleQuantity__value
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _LengthUnit = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Light = {
			RoverMLTables.Properties._Component__kind,
			RoverMLTables.Properties._NamedElement__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Motor = {
			RoverMLTables.Properties._Component__kind,
			RoverMLTables.Properties._NamedElement__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Move = {
			RoverMLTables.Properties._Move__distance,
			RoverMLTables.Properties._Command__incoming,
			RoverMLTables.Properties._NamedElement__name,
			RoverMLTables.Properties._Command__outgoing,
			RoverMLTables.Properties._Move__speed
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			RoverMLTables.Properties._NamedElement__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Position = {
			RoverMLTables.Properties._Position__x,
			RoverMLTables.Properties._Position__y
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Quantity = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Repeat = {
			RoverMLTables.Properties._Block__commands,
			RoverMLTables.Properties._Repeat__count,
			RoverMLTables.Properties._Command__incoming,
			RoverMLTables.Properties._NamedElement__name,
			RoverMLTables.Properties._Command__outgoing,
			RoverMLTables.Properties._Block__transitions
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Rotate = {
			RoverMLTables.Properties._Rotate__angle,
			RoverMLTables.Properties._Command__incoming,
			RoverMLTables.Properties._NamedElement__name,
			RoverMLTables.Properties._Command__outgoing
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Rover = {
			RoverMLTables.Properties._Rover__components,
			RoverMLTables.Properties._NamedElement__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RoverProgram = {
			RoverMLTables.Properties._RoverProgram__block,
			RoverMLTables.Properties._NamedElement__name,
			RoverMLTables.Properties._RoverProgram__rover
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RoverSystem = {
			RoverMLTables.Properties._RoverSystem__roverPrograms,
			RoverMLTables.Properties._RoverSystem__rovers
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Sensor = {
			RoverMLTables.Properties._Component__kind,
			RoverMLTables.Properties._Sensor__lastSensedValue,
			RoverMLTables.Properties._NamedElement__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SetLightColor = {
			RoverMLTables.Properties._SetLightColor__color,
			RoverMLTables.Properties._Command__incoming,
			RoverMLTables.Properties._SetLightColor__lights,
			RoverMLTables.Properties._NamedElement__name,
			RoverMLTables.Properties._Command__outgoing
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SingleQuantity = {
			RoverMLTables.Properties._SingleQuantity__value
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Terminate = {
			RoverMLTables.Properties._Command__incoming,
			RoverMLTables.Properties._NamedElement__name,
			RoverMLTables.Properties._Command__outgoing
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Time = {
			RoverMLTables.Properties._Time__timeUnit,
			RoverMLTables.Properties._SingleQuantity__value
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TimeUnit = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Transition = {
			RoverMLTables.Properties._NamedElement__name,
			RoverMLTables.Properties._Transition__source,
			RoverMLTables.Properties._Transition__target
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _TriggeredTransition = {
			RoverMLTables.Properties._TriggeredTransition__comparisonValue,
			RoverMLTables.Properties._NamedElement__name,
			RoverMLTables.Properties._TriggeredTransition__operator,
			RoverMLTables.Properties._TriggeredTransition__sensor,
			RoverMLTables.Properties._Transition__source,
			RoverMLTables.Properties._Transition__target
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Velocity = {
			RoverMLTables.Properties._SingleQuantity__value,
			RoverMLTables.Properties._Velocity__velocityUnit
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _VelocityUnit = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Wait = {
			RoverMLTables.Properties._Wait__duration,
			RoverMLTables.Properties._Command__incoming,
			RoverMLTables.Properties._NamedElement__name,
			RoverMLTables.Properties._Command__outgoing
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Actuator__Actuator.initProperties(_Actuator);
			Fragments._Angle__Angle.initProperties(_Angle);
			Fragments._AngleUnit__AngleUnit.initProperties(_AngleUnit);
			Fragments._Block__Block.initProperties(_Block);
			Fragments._Color__Color.initProperties(_Color);
			Fragments._Command__Command.initProperties(_Command);
			Fragments._ComparisonOperator__ComparisonOperator.initProperties(_ComparisonOperator);
			Fragments._Compass__Compass.initProperties(_Compass);
			Fragments._CompassTrigger__CompassTrigger.initProperties(_CompassTrigger);
			Fragments._Component__Component.initProperties(_Component);
			Fragments._DistanceSensor__DistanceSensor.initProperties(_DistanceSensor);
			Fragments._DistanceSensorTrigger__DistanceSensorTrigger.initProperties(_DistanceSensorTrigger);
			Fragments._GPS__GPS.initProperties(_GPS);
			Fragments._GpsTrigger__GpsTrigger.initProperties(_GpsTrigger);
			Fragments._Length__Length.initProperties(_Length);
			Fragments._LengthUnit__LengthUnit.initProperties(_LengthUnit);
			Fragments._Light__Light.initProperties(_Light);
			Fragments._Motor__Motor.initProperties(_Motor);
			Fragments._Move__Move.initProperties(_Move);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._Position__Position.initProperties(_Position);
			Fragments._Quantity__Quantity.initProperties(_Quantity);
			Fragments._Repeat__Repeat.initProperties(_Repeat);
			Fragments._Rotate__Rotate.initProperties(_Rotate);
			Fragments._Rover__Rover.initProperties(_Rover);
			Fragments._RoverProgram__RoverProgram.initProperties(_RoverProgram);
			Fragments._RoverSystem__RoverSystem.initProperties(_RoverSystem);
			Fragments._Sensor__Sensor.initProperties(_Sensor);
			Fragments._SetLightColor__SetLightColor.initProperties(_SetLightColor);
			Fragments._SingleQuantity__SingleQuantity.initProperties(_SingleQuantity);
			Fragments._Terminate__Terminate.initProperties(_Terminate);
			Fragments._Time__Time.initProperties(_Time);
			Fragments._TimeUnit__TimeUnit.initProperties(_TimeUnit);
			Fragments._Transition__Transition.initProperties(_Transition);
			Fragments._TriggeredTransition__TriggeredTransition.initProperties(_TriggeredTransition);
			Fragments._Velocity__Velocity.initProperties(_Velocity);
			Fragments._VelocityUnit__VelocityUnit.initProperties(_VelocityUnit);
			Fragments._Wait__Wait.initProperties(_Wait);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RoverMLTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AngleUnit__radian = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.ANGLE_UNIT.getEEnumLiteral("radian"), Types._AngleUnit, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AngleUnit__degree = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.ANGLE_UNIT.getEEnumLiteral("degree"), Types._AngleUnit, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _AngleUnit = {
			_AngleUnit__radian,
			_AngleUnit__degree
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Color__none = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.COLOR.getEEnumLiteral("none"), Types._Color, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Color__red = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.COLOR.getEEnumLiteral("red"), Types._Color, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Color__green = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.COLOR.getEEnumLiteral("green"), Types._Color, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Color__blue = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.COLOR.getEEnumLiteral("blue"), Types._Color, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Color__yellow = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.COLOR.getEEnumLiteral("yellow"), Types._Color, 4);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Color = {
			_Color__none,
			_Color__red,
			_Color__green,
			_Color__blue,
			_Color__yellow
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ComparisonOperator__smaller = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.COMPARISON_OPERATOR.getEEnumLiteral("smaller"), Types._ComparisonOperator, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ComparisonOperator__equals = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.COMPARISON_OPERATOR.getEEnumLiteral("equals"), Types._ComparisonOperator, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ComparisonOperator__greater = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.COMPARISON_OPERATOR.getEEnumLiteral("greater"), Types._ComparisonOperator, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ComparisonOperator__unequal = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.COMPARISON_OPERATOR.getEEnumLiteral("unequal"), Types._ComparisonOperator, 3);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ComparisonOperator = {
			_ComparisonOperator__smaller,
			_ComparisonOperator__equals,
			_ComparisonOperator__greater,
			_ComparisonOperator__unequal
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _LengthUnit__mm = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.LENGTH_UNIT.getEEnumLiteral("mm"), Types._LengthUnit, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _LengthUnit__cm = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.LENGTH_UNIT.getEEnumLiteral("cm"), Types._LengthUnit, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _LengthUnit__m = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.LENGTH_UNIT.getEEnumLiteral("m"), Types._LengthUnit, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _LengthUnit = {
			_LengthUnit__mm,
			_LengthUnit__cm,
			_LengthUnit__m
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _TimeUnit__ns = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.TIME_UNIT.getEEnumLiteral("ns"), Types._TimeUnit, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _TimeUnit__ms = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.TIME_UNIT.getEEnumLiteral("ms"), Types._TimeUnit, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _TimeUnit__s = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.TIME_UNIT.getEEnumLiteral("s"), Types._TimeUnit, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _TimeUnit__min = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.TIME_UNIT.getEEnumLiteral("min"), Types._TimeUnit, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _TimeUnit__h = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.TIME_UNIT.getEEnumLiteral("h"), Types._TimeUnit, 4);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TimeUnit = {
			_TimeUnit__ns,
			_TimeUnit__ms,
			_TimeUnit__s,
			_TimeUnit__min,
			_TimeUnit__h
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _VelocityUnit__mm_per_s = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.VELOCITY_UNIT.getEEnumLiteral("mm_per_s"), Types._VelocityUnit, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _VelocityUnit__cm_per_s = new EcoreExecutorEnumerationLiteral(RoverMLPackage.Literals.VELOCITY_UNIT.getEEnumLiteral("cm_per_s"), Types._VelocityUnit, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _VelocityUnit = {
			_VelocityUnit__mm_per_s,
			_VelocityUnit__cm_per_s
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._AngleUnit.initLiterals(_AngleUnit);
			Types._Color.initLiterals(_Color);
			Types._ComparisonOperator.initLiterals(_ComparisonOperator);
			Types._LengthUnit.initLiterals(_LengthUnit);
			Types._TimeUnit.initLiterals(_TimeUnit);
			Types._VelocityUnit.initLiterals(_VelocityUnit);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RoverMLTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}

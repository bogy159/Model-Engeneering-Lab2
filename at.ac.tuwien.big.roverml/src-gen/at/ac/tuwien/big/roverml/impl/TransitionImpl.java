/**
 */
package at.ac.tuwien.big.roverml.impl;

import at.ac.tuwien.big.roverml.Block;
import at.ac.tuwien.big.roverml.Command;
import at.ac.tuwien.big.roverml.Length;
import at.ac.tuwien.big.roverml.Move;
import at.ac.tuwien.big.roverml.Repeat;
import at.ac.tuwien.big.roverml.RoverMLPackage;
import at.ac.tuwien.big.roverml.RoverMLTables;
import at.ac.tuwien.big.roverml.Transition;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.UnboxedCompositionProperty;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.logical.BooleanNotOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanXorOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends NamedElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Command source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Command target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverMLPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Command)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverMLPackage.TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Command newSource) {
		Command oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverMLPackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Command)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverMLPackage.TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Command newTarget) {
		Command oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverMLPackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean sourceAndTargetInSameBlock(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv sourceAndTargetInSameBlock:
		 *   let
		 *     severity : Integer[1] = 'Transition::sourceAndTargetInSameBlock'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let result : Boolean[1] = self.source.Block = self.target.Block
		 *       in
		 *         'Transition::sourceAndTargetInSameBlock'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RoverMLTables.STR_Transition_c_c_sourceAndTargetInSameBlock);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RoverMLTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ UnboxedCompositionProperty IMPPROPid_commands_0 = new UnboxedCompositionProperty(RoverMLTables.PROPid_commands);
			final /*@NonInvalid*/ Command source = this.getSource();
			final /*@NonInvalid*/ Block Block = (Block)IMPPROPid_commands_0.evaluate(executor, RoverMLTables.CLSSid_Block, source);
			final /*@NonInvalid*/ Command target = this.getTarget();
			final /*@NonInvalid*/ Block Block_0 = (Block)IMPPROPid_commands_0.evaluate(executor, RoverMLTables.CLSSid_Block, target);
			final /*@NonInvalid*/ boolean result = (Block != null) ? Block.equals(Block_0) : (Block_0 == null);
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, RoverMLTables.STR_Transition_c_c_sourceAndTargetInSameBlock, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, RoverMLTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean triggeredTransitionAfterInfiniteCommand(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv triggeredTransitionAfterInfiniteCommand:
		 *   let
		 *     severity : Integer[1] = 'Transition::triggeredTransitionAfterInfiniteCommand'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[1] = if
		 *           self.source.oclIsKindOf(Move) and
		 *           self.source.oclAsType(Move)
		 *           .distance.oclIsUndefined() xor
		 *           self.source.oclIsKindOf(Repeat) and
		 *           self.source.oclAsType(Repeat).count = -1
		 *         then
		 *           self.oclIsKindOf(TriggeredTransition(SensorType, QuantityType))
		 *         else true
		 *         endif
		 *       in
		 *         'Transition::triggeredTransitionAfterInfiniteCommand'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RoverMLTables.STR_Transition_c_c_triggeredTransitionAfterInfiniteCommand);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RoverMLTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_roverml_c_c_Move = idResolver.getClass(RoverMLTables.CLSSid_Move, null);
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_roverml_c_c_Repeat = idResolver.getClass(RoverMLTables.CLSSid_Repeat, null);
			final /*@NonInvalid*/ Command source_1 = this.getSource();
			final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, source_1, TYP_roverml_c_c_Move).booleanValue();
			/*@NonInvalid*/ boolean and;
			if (oclIsKindOf) {
				/*@Caught*/ /*@Nullable*/ Object CAUGHT_distance;
				try {
					final /*@Thrown*/ Move oclAsType = ClassUtil.nonNullState((Move)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, source_1, TYP_roverml_c_c_Move));
					final /*@Thrown*/ Length distance = oclAsType.getDistance();
					CAUGHT_distance = distance;
				}
				catch (Exception e) {
					CAUGHT_distance = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean oclIsUndefined = (CAUGHT_distance == null) || (CAUGHT_distance instanceof InvalidValueException);
				and = oclIsUndefined;
			}
			else {
				and = ValueUtil.FALSE_VALUE;
			}
			final /*@NonInvalid*/ boolean oclIsKindOf_0 = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, source_1, TYP_roverml_c_c_Repeat).booleanValue();
			/*@Thrown*/ boolean and_0;
			if (oclIsKindOf_0) {
				final /*@Thrown*/ Repeat oclAsType_0 = ClassUtil.nonNullState((Repeat)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, source_1, TYP_roverml_c_c_Repeat));
				final /*@Thrown*/ int count = oclAsType_0.getCount();
				final /*@Thrown*/ IntegerValue BOXED_count = ValueUtil.integerValueOf(count);
				final /*@NonInvalid*/ IntegerValue diff = (IntegerValue)NumericNegateOperation.INSTANCE.evaluate(RoverMLTables.INT_1);
				final /*@Thrown*/ boolean eq = BOXED_count.equals(diff);
				and_0 = eq;
			}
			else {
				and_0 = ValueUtil.FALSE_VALUE;
			}
			final /*@Thrown*/ Boolean xor = BooleanXorOperation.INSTANCE.evaluate(and, and_0);
			if (xor == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@NonInvalid*/ boolean result;
			if (xor) {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_roverml_c_c_TriggeredTransition_o_SensorType_44_QuantityType_e = idResolver.getClass(RoverMLTables.CLSSid_TriggeredTransition, null);
				final /*@NonInvalid*/ boolean oclIsKindOf_1 = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, this, TYP_roverml_c_c_TriggeredTransition_o_SensorType_44_QuantityType_e).booleanValue();
				result = oclIsKindOf_1;
			}
			else {
				result = ValueUtil.TRUE_VALUE;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, RoverMLTables.STR_Transition_c_c_triggeredTransitionAfterInfiniteCommand, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, RoverMLTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean doNotRotateTwiceInARow(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv doNotRotateTwiceInARow:
		 *   let
		 *     severity : Integer[1] = 'Transition::doNotRotateTwiceInARow'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[?] = if self.source.oclIsTypeOf(Rotate)
		 *         then not self.target.oclIsTypeOf(Rotate)
		 *         else true
		 *         endif
		 *       in
		 *         'Transition::doNotRotateTwiceInARow'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RoverMLTables.STR_Transition_c_c_doNotRotateTwiceInARow);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RoverMLTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_roverml_c_c_Rotate = idResolver.getClass(RoverMLTables.CLSSid_Rotate, null);
			final /*@NonInvalid*/ Command source = this.getSource();
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, source, TYP_roverml_c_c_Rotate).booleanValue();
			/*@NonInvalid*/ Boolean result;
			if (oclIsTypeOf) {
				final /*@NonInvalid*/ Command target = this.getTarget();
				final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, target, TYP_roverml_c_c_Rotate).booleanValue();
				final /*@NonInvalid*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsTypeOf_0);
				result = not;
			}
			else {
				result = ValueUtil.TRUE_VALUE;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, RoverMLTables.STR_Transition_c_c_doNotRotateTwiceInARow, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, RoverMLTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoverMLPackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case RoverMLPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RoverMLPackage.TRANSITION__SOURCE:
				setSource((Command)newValue);
				return;
			case RoverMLPackage.TRANSITION__TARGET:
				setTarget((Command)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RoverMLPackage.TRANSITION__SOURCE:
				setSource((Command)null);
				return;
			case RoverMLPackage.TRANSITION__TARGET:
				setTarget((Command)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RoverMLPackage.TRANSITION__SOURCE:
				return source != null;
			case RoverMLPackage.TRANSITION__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RoverMLPackage.TRANSITION___TRIGGERED_TRANSITION_AFTER_INFINITE_COMMAND__DIAGNOSTICCHAIN_MAP:
				return triggeredTransitionAfterInfiniteCommand((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RoverMLPackage.TRANSITION___DO_NOT_ROTATE_TWICE_IN_AROW__DIAGNOSTICCHAIN_MAP:
				return doNotRotateTwiceInARow((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RoverMLPackage.TRANSITION___SOURCE_AND_TARGET_IN_SAME_BLOCK__DIAGNOSTICCHAIN_MAP:
				return sourceAndTargetInSameBlock((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TransitionImpl

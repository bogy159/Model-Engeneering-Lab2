/**
 */
package at.ac.tuwien.big.roverml.impl;

import at.ac.tuwien.big.roverml.Command;
import at.ac.tuwien.big.roverml.RoverMLPackage;

import at.ac.tuwien.big.roverml.RoverMLTables;
import at.ac.tuwien.big.roverml.Transition;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanAndOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanNotOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.impl.CommandImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.impl.CommandImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommandImpl extends NamedElementImpl implements Command {
	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incoming;
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoing;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverMLPackage.Literals.COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Transition> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectResolvingEList<Transition>(Transition.class, this, RoverMLPackage.COMMAND__INCOMING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Transition> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectResolvingEList<Transition>(Transition.class, this, RoverMLPackage.COMMAND__OUTGOING);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean noParallelExecution(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv noParallelExecution:
		 *   let severity : Integer[1] = 'Command::noParallelExecution'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[1] = if
		 *           not self.oclIsKindOf(Block) and
		 *           self.outgoing->size() > 1
		 *         then
		 *           self.outgoing->select(t | t.oclIsTypeOf(Transition))
		 *           ->size() <= 1
		 *         else true
		 *         endif
		 *       in
		 *         'Command::noParallelExecution'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RoverMLTables.STR_Command_c_c_noParallelExecution);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RoverMLTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_roverml_c_c_Block = idResolver.getClass(RoverMLTables.CLSSid_Block, null);
			final /*@NonInvalid*/ List<Transition> outgoing_0 = this.getOutgoing();
			final /*@NonInvalid*/ OrderedSetValue BOXED_outgoing_0 = idResolver.createOrderedSetOfAll(RoverMLTables.ORD_CLSSid_Transition, outgoing_0);
			final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, this, TYP_roverml_c_c_Block).booleanValue();
			final /*@NonInvalid*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsKindOf);
			final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_outgoing_0);
			final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, RoverMLTables.INT_1).booleanValue();
			final /*@Thrown*/ Boolean and = BooleanAndOperation.INSTANCE.evaluate(not, gt);
			if (and == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@NonInvalid*/ boolean result;
			if (and) {
				/*@Thrown*/ OrderedSetValue.Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(RoverMLTables.ORD_CLSSid_Transition);
				/*@NonNull*/ Iterator<Object> ITERATOR_t = BOXED_outgoing_0.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_t.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Transition t = (Transition)ITERATOR_t.next();
					/**
					 * t.oclIsTypeOf(Transition)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_roverml_c_c_Transition = idResolver.getClass(RoverMLTables.CLSSid_Transition, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, t, TYP_roverml_c_c_Transition).booleanValue();
					//
					if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
						accumulator.add(t);
					}
				}
				final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size_0, RoverMLTables.INT_1).booleanValue();
				result = le_0;
			}
			else {
				result = ValueUtil.TRUE_VALUE;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, RoverMLTables.STR_Command_c_c_noParallelExecution, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, RoverMLTables.INT_0).booleanValue();
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
			case RoverMLPackage.COMMAND__INCOMING:
				return getIncoming();
			case RoverMLPackage.COMMAND__OUTGOING:
				return getOutgoing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RoverMLPackage.COMMAND__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Transition>)newValue);
				return;
			case RoverMLPackage.COMMAND__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Transition>)newValue);
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
			case RoverMLPackage.COMMAND__INCOMING:
				getIncoming().clear();
				return;
			case RoverMLPackage.COMMAND__OUTGOING:
				getOutgoing().clear();
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
			case RoverMLPackage.COMMAND__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case RoverMLPackage.COMMAND__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
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
			case RoverMLPackage.COMMAND___NO_PARALLEL_EXECUTION__DIAGNOSTICCHAIN_MAP:
				return noParallelExecution((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CommandImpl

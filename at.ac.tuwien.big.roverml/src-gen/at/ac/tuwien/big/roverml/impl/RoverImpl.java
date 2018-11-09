/**
 */
package at.ac.tuwien.big.roverml.impl;

import at.ac.tuwien.big.roverml.Component;
import at.ac.tuwien.big.roverml.Rover;
import at.ac.tuwien.big.roverml.RoverMLPackage;

import at.ac.tuwien.big.roverml.RoverMLTables;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorDoubleIterationManager;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.AbstractTernaryOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rover</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.impl.RoverImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoverImpl extends NamedElementImpl implements Rover {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverMLPackage.Literals.ROVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, RoverMLPackage.ROVER__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean atLeastOneMotor(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv atLeastOneMotor:
		 *   let severity : Integer[1] = 'Rover::atLeastOneMotor'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[1] = self.components->select(component |
		 *           component.oclIsTypeOf(Motor))
		 *         ->size() > 0
		 *       in
		 *         'Rover::atLeastOneMotor'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RoverMLTables.STR_Rover_c_c_atLeastOneMotor);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RoverMLTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<Component> components = this.getComponents();
			final /*@NonInvalid*/ OrderedSetValue BOXED_components = idResolver.createOrderedSetOfAll(RoverMLTables.ORD_CLSSid_Component, components);
			/*@Thrown*/ OrderedSetValue.Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(RoverMLTables.ORD_CLSSid_Component);
			/*@NonNull*/ Iterator<Object> ITERATOR_component = BOXED_components.iterator();
			/*@NonInvalid*/ OrderedSetValue select;
			while (true) {
				if (!ITERATOR_component.hasNext()) {
					select = accumulator;
					break;
				}
				/*@NonInvalid*/ Component component = (Component)ITERATOR_component.next();
				/**
				 * component.oclIsTypeOf(Motor)
				 */
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_roverml_c_c_Motor = idResolver.getClass(RoverMLTables.CLSSid_Motor, null);
				final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, component, TYP_roverml_c_c_Motor).booleanValue();
				//
				if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
					accumulator.add(component);
				}
			}
			final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
			final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, RoverMLTables.INT_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, RoverMLTables.STR_Rover_c_c_atLeastOneMotor, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, RoverMLTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean uniqueName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv uniqueName:
		 *   let severity : Integer[1] = 'Rover::uniqueName'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[?] = self.components->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)
		 *       in
		 *         'Rover::uniqueName'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RoverMLTables.STR_Rover_c_c_uniqueName);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RoverMLTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_4;
		if (le) {
			symbol_4 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@Nullable*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ List<Component> components = this.getComponents();
				final /*@NonInvalid*/ OrderedSetValue BOXED_components = idResolver.createOrderedSetOfAll(RoverMLTables.ORD_CLSSid_Component, components);
				final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOf(BOXED_components);
				final LibraryIteration.LibraryIterationExtension IMPL_result_0 = (LibraryIteration.LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__0_forAll);
				final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
				/**
				 * Implementation of the iterator body.
				 */
				final /*@NonNull*/ AbstractTernaryOperation BODY_result_0 = new AbstractTernaryOperation() {
					/**
					 * c1 <> c2 implies c1.name <> c2.name
					 */
					@Override
					public /*@Nullable*/ Object evaluate(final /*@NonNull*/ Executor executor, final /*@NonNull*/ TypeId typeId, final /*@Nullable*/ Object BOXED_components, final /*@NonInvalid*/ Object c1, final /*@NonInvalid*/ Object c2) {
						/*@Caught*/ /*@NonNull*/ Object CAUGHT_implies;
						try {
							final /*@NonInvalid*/ Component symbol_0 = (Component)c1;
							final /*@NonInvalid*/ Component symbol_1 = (Component)c2;
							final /*@NonInvalid*/ boolean ne = (symbol_0 != null) ? !symbol_0.equals(symbol_1) : (symbol_1 != null);
							/*@Thrown*/ boolean implies;
							if (ne) {
								if (symbol_0 == null) {
									throw new InvalidValueException("Null source for \'\'http://www.big.tuwien.ac.at/roverml\'::NamedElement::name\'");
								}
								final /*@Thrown*/ String name = symbol_0.getName();
								if (symbol_1 == null) {
									throw new InvalidValueException("Null source for \'\'http://www.big.tuwien.ac.at/roverml\'::NamedElement::name\'");
								}
								final /*@Thrown*/ String name_0 = symbol_1.getName();
								final /*@Thrown*/ boolean ne_0 = (name != null) ? !name.equals(name_0) : (name_0 != null);
								implies = ne_0;
							}
							else {
								implies = ValueUtil.TRUE_VALUE;
							}
							CAUGHT_implies = implies;
						}
						catch (Exception e) {
							CAUGHT_implies = ValueUtil.createInvalidValue(e);
						}
						return CAUGHT_implies;
					}
				};
				final /*@NonNull*/  ExecutorDoubleIterationManager MGR_result_0 = new ExecutorDoubleIterationManager(executor, TypeId.BOOLEAN, BODY_result_0, BOXED_components, ACC_result_0);
				final /*@Thrown*/ Boolean result = (Boolean)IMPL_result_0.evaluateIteration(MGR_result_0);
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, RoverMLTables.STR_Rover_c_c_uniqueName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, RoverMLTables.INT_0).booleanValue();
			symbol_4 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RoverMLPackage.ROVER__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoverMLPackage.ROVER__COMPONENTS:
				return getComponents();
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
			case RoverMLPackage.ROVER__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
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
			case RoverMLPackage.ROVER__COMPONENTS:
				getComponents().clear();
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
			case RoverMLPackage.ROVER__COMPONENTS:
				return components != null && !components.isEmpty();
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
			case RoverMLPackage.ROVER___AT_LEAST_ONE_MOTOR__DIAGNOSTICCHAIN_MAP:
				return atLeastOneMotor((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case RoverMLPackage.ROVER___UNIQUE_NAME__DIAGNOSTICCHAIN_MAP:
				return uniqueName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoverImpl

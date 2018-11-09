/**
 */
package at.ac.tuwien.big.roverml.impl;

import at.ac.tuwien.big.roverml.ComparisonOperator;
import at.ac.tuwien.big.roverml.Quantity;
import at.ac.tuwien.big.roverml.RoverMLPackage;
import at.ac.tuwien.big.roverml.Sensor;
import at.ac.tuwien.big.roverml.TriggeredTransition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triggered Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.impl.TriggeredTransitionImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.impl.TriggeredTransitionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.impl.TriggeredTransitionImpl#getComparisonValue <em>Comparison Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TriggeredTransitionImpl<SensorType extends Sensor<QuantityType>, QuantityType extends Quantity> extends TransitionImpl implements TriggeredTransition<SensorType, QuantityType> {
	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected SensorType sensor;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperator OPERATOR_EDEFAULT = ComparisonOperator.SMALLER;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComparisonValue() <em>Comparison Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonValue()
	 * @generated
	 * @ordered
	 */
	protected QuantityType comparisonValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggeredTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverMLPackage.Literals.TRIGGERED_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SensorType getSensor() {
		if (sensor != null && sensor.eIsProxy()) {
			InternalEObject oldSensor = (InternalEObject)sensor;
			sensor = (SensorType)eResolveProxy(oldSensor);
			if (sensor != oldSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverMLPackage.TRIGGERED_TRANSITION__SENSOR, oldSensor, sensor));
			}
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorType basicGetSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensor(SensorType newSensor) {
		SensorType oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverMLPackage.TRIGGERED_TRANSITION__SENSOR, oldSensor, sensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(ComparisonOperator newOperator) {
		ComparisonOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverMLPackage.TRIGGERED_TRANSITION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityType getComparisonValue() {
		return comparisonValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparisonValue(QuantityType newComparisonValue, NotificationChain msgs) {
		QuantityType oldComparisonValue = comparisonValue;
		comparisonValue = newComparisonValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoverMLPackage.TRIGGERED_TRANSITION__COMPARISON_VALUE, oldComparisonValue, newComparisonValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonValue(QuantityType newComparisonValue) {
		if (newComparisonValue != comparisonValue) {
			NotificationChain msgs = null;
			if (comparisonValue != null)
				msgs = ((InternalEObject)comparisonValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoverMLPackage.TRIGGERED_TRANSITION__COMPARISON_VALUE, null, msgs);
			if (newComparisonValue != null)
				msgs = ((InternalEObject)newComparisonValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoverMLPackage.TRIGGERED_TRANSITION__COMPARISON_VALUE, null, msgs);
			msgs = basicSetComparisonValue(newComparisonValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverMLPackage.TRIGGERED_TRANSITION__COMPARISON_VALUE, newComparisonValue, newComparisonValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RoverMLPackage.TRIGGERED_TRANSITION__COMPARISON_VALUE:
				return basicSetComparisonValue(null, msgs);
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
			case RoverMLPackage.TRIGGERED_TRANSITION__SENSOR:
				if (resolve) return getSensor();
				return basicGetSensor();
			case RoverMLPackage.TRIGGERED_TRANSITION__OPERATOR:
				return getOperator();
			case RoverMLPackage.TRIGGERED_TRANSITION__COMPARISON_VALUE:
				return getComparisonValue();
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
			case RoverMLPackage.TRIGGERED_TRANSITION__SENSOR:
				setSensor((SensorType)newValue);
				return;
			case RoverMLPackage.TRIGGERED_TRANSITION__OPERATOR:
				setOperator((ComparisonOperator)newValue);
				return;
			case RoverMLPackage.TRIGGERED_TRANSITION__COMPARISON_VALUE:
				setComparisonValue((QuantityType)newValue);
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
			case RoverMLPackage.TRIGGERED_TRANSITION__SENSOR:
				setSensor((SensorType)null);
				return;
			case RoverMLPackage.TRIGGERED_TRANSITION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case RoverMLPackage.TRIGGERED_TRANSITION__COMPARISON_VALUE:
				setComparisonValue((QuantityType)null);
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
			case RoverMLPackage.TRIGGERED_TRANSITION__SENSOR:
				return sensor != null;
			case RoverMLPackage.TRIGGERED_TRANSITION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case RoverMLPackage.TRIGGERED_TRANSITION__COMPARISON_VALUE:
				return comparisonValue != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //TriggeredTransitionImpl

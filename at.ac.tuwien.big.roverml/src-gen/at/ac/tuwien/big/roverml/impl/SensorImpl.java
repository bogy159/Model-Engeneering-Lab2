/**
 */
package at.ac.tuwien.big.roverml.impl;

import at.ac.tuwien.big.roverml.RoverMLPackage;
import at.ac.tuwien.big.roverml.Sensor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.impl.SensorImpl#getLastSensedValue <em>Last Sensed Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SensorImpl<QuantityType> extends ComponentImpl implements Sensor<QuantityType> {
	/**
	 * The cached value of the '{@link #getLastSensedValue() <em>Last Sensed Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSensedValue()
	 * @generated
	 * @ordered
	 */
	protected QuantityType lastSensedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverMLPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityType getLastSensedValue() {
		return lastSensedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastSensedValue(QuantityType newLastSensedValue, NotificationChain msgs) {
		QuantityType oldLastSensedValue = lastSensedValue;
		lastSensedValue = newLastSensedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoverMLPackage.SENSOR__LAST_SENSED_VALUE, oldLastSensedValue, newLastSensedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSensedValue(QuantityType newLastSensedValue) {
		if (newLastSensedValue != lastSensedValue) {
			NotificationChain msgs = null;
			if (lastSensedValue != null)
				msgs = ((InternalEObject)lastSensedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoverMLPackage.SENSOR__LAST_SENSED_VALUE, null, msgs);
			if (newLastSensedValue != null)
				msgs = ((InternalEObject)newLastSensedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoverMLPackage.SENSOR__LAST_SENSED_VALUE, null, msgs);
			msgs = basicSetLastSensedValue(newLastSensedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverMLPackage.SENSOR__LAST_SENSED_VALUE, newLastSensedValue, newLastSensedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RoverMLPackage.SENSOR__LAST_SENSED_VALUE:
				return basicSetLastSensedValue(null, msgs);
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
			case RoverMLPackage.SENSOR__LAST_SENSED_VALUE:
				return getLastSensedValue();
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
			case RoverMLPackage.SENSOR__LAST_SENSED_VALUE:
				setLastSensedValue((QuantityType)newValue);
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
			case RoverMLPackage.SENSOR__LAST_SENSED_VALUE:
				setLastSensedValue((QuantityType)null);
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
			case RoverMLPackage.SENSOR__LAST_SENSED_VALUE:
				return lastSensedValue != null;
		}
		return super.eIsSet(featureID);
	}

} //SensorImpl

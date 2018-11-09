/**
 */
package at.ac.tuwien.big.roverml.impl;

import at.ac.tuwien.big.roverml.Length;
import at.ac.tuwien.big.roverml.LengthUnit;
import at.ac.tuwien.big.roverml.RoverMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Length</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.impl.LengthImpl#getLengthUnit <em>Length Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LengthImpl extends SingleQuantityImpl implements Length {
	/**
	 * The default value of the '{@link #getLengthUnit() <em>Length Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthUnit()
	 * @generated
	 * @ordered
	 */
	protected static final LengthUnit LENGTH_UNIT_EDEFAULT = LengthUnit.MM;

	/**
	 * The cached value of the '{@link #getLengthUnit() <em>Length Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthUnit()
	 * @generated
	 * @ordered
	 */
	protected LengthUnit lengthUnit = LENGTH_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LengthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverMLPackage.Literals.LENGTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthUnit getLengthUnit() {
		return lengthUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengthUnit(LengthUnit newLengthUnit) {
		LengthUnit oldLengthUnit = lengthUnit;
		lengthUnit = newLengthUnit == null ? LENGTH_UNIT_EDEFAULT : newLengthUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverMLPackage.LENGTH__LENGTH_UNIT, oldLengthUnit, lengthUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoverMLPackage.LENGTH__LENGTH_UNIT:
				return getLengthUnit();
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
			case RoverMLPackage.LENGTH__LENGTH_UNIT:
				setLengthUnit((LengthUnit)newValue);
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
			case RoverMLPackage.LENGTH__LENGTH_UNIT:
				setLengthUnit(LENGTH_UNIT_EDEFAULT);
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
			case RoverMLPackage.LENGTH__LENGTH_UNIT:
				return lengthUnit != LENGTH_UNIT_EDEFAULT;
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
		result.append(" (lengthUnit: ");
		result.append(lengthUnit);
		result.append(')');
		return result.toString();
	}

} //LengthImpl

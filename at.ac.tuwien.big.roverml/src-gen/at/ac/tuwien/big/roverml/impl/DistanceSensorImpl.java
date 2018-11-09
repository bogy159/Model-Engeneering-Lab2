/**
 */
package at.ac.tuwien.big.roverml.impl;

import at.ac.tuwien.big.roverml.DistanceSensor;
import at.ac.tuwien.big.roverml.Length;
import at.ac.tuwien.big.roverml.RoverMLPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DistanceSensorImpl extends SensorImpl<Length> implements DistanceSensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverMLPackage.Literals.DISTANCE_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetLastSensedValue(Length newLastSensedValue, NotificationChain msgs) {
		return super.basicSetLastSensedValue(newLastSensedValue, msgs);
	}

} //DistanceSensorImpl

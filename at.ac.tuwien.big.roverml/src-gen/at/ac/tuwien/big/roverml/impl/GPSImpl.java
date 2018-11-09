/**
 */
package at.ac.tuwien.big.roverml.impl;

import at.ac.tuwien.big.roverml.GPS;
import at.ac.tuwien.big.roverml.Position;
import at.ac.tuwien.big.roverml.RoverMLPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GPSImpl extends SensorImpl<Position> implements GPS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverMLPackage.Literals.GPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetLastSensedValue(Position newLastSensedValue, NotificationChain msgs) {
		return super.basicSetLastSensedValue(newLastSensedValue, msgs);
	}

} //GPSImpl

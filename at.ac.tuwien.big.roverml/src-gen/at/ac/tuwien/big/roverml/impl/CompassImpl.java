/**
 */
package at.ac.tuwien.big.roverml.impl;

import at.ac.tuwien.big.roverml.Angle;
import at.ac.tuwien.big.roverml.Compass;
import at.ac.tuwien.big.roverml.RoverMLPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compass</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CompassImpl extends SensorImpl<Angle> implements Compass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverMLPackage.Literals.COMPASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetLastSensedValue(Angle newLastSensedValue, NotificationChain msgs) {
		return super.basicSetLastSensedValue(newLastSensedValue, msgs);
	}

} //CompassImpl

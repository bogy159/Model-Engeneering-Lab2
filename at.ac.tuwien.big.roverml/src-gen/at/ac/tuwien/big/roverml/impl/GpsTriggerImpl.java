/**
 */
package at.ac.tuwien.big.roverml.impl;

import at.ac.tuwien.big.roverml.GPS;
import at.ac.tuwien.big.roverml.GpsTrigger;
import at.ac.tuwien.big.roverml.Position;
import at.ac.tuwien.big.roverml.RoverMLPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gps Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GpsTriggerImpl extends TriggeredTransitionImpl<GPS, Position> implements GpsTrigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GpsTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverMLPackage.Literals.GPS_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setSensor(GPS newSensor) {
		super.setSensor(newSensor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetComparisonValue(Position newComparisonValue, NotificationChain msgs) {
		return super.basicSetComparisonValue(newComparisonValue, msgs);
	}

} //GpsTriggerImpl

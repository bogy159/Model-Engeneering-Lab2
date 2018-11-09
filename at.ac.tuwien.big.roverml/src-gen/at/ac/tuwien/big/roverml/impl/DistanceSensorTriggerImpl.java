/**
 */
package at.ac.tuwien.big.roverml.impl;

import at.ac.tuwien.big.roverml.DistanceSensor;
import at.ac.tuwien.big.roverml.DistanceSensorTrigger;
import at.ac.tuwien.big.roverml.Length;
import at.ac.tuwien.big.roverml.RoverMLPackage;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Sensor Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DistanceSensorTriggerImpl extends TriggeredTransitionImpl<DistanceSensor, Length> implements DistanceSensorTrigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceSensorTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverMLPackage.Literals.DISTANCE_SENSOR_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setSensor(DistanceSensor newSensor) {
		super.setSensor(newSensor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetComparisonValue(Length newComparisonValue, NotificationChain msgs) {
		return super.basicSetComparisonValue(newComparisonValue, msgs);
	}

} //DistanceSensorTriggerImpl

/**
 */
package at.ac.tuwien.big.roverml.impl;

import at.ac.tuwien.big.roverml.Angle;
import at.ac.tuwien.big.roverml.Compass;
import at.ac.tuwien.big.roverml.CompassTrigger;
import at.ac.tuwien.big.roverml.RoverMLPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compass Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CompassTriggerImpl extends TriggeredTransitionImpl<Compass, Angle> implements CompassTrigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompassTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverMLPackage.Literals.COMPASS_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setSensor(Compass newSensor) {
		super.setSensor(newSensor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetComparisonValue(Angle newComparisonValue, NotificationChain msgs) {
		return super.basicSetComparisonValue(newComparisonValue, msgs);
	}

} //CompassTriggerImpl

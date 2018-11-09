/**
 */
package at.ac.tuwien.big.roverml.impl;

import at.ac.tuwien.big.roverml.Rover;
import at.ac.tuwien.big.roverml.RoverMLPackage;
import at.ac.tuwien.big.roverml.RoverProgram;
import at.ac.tuwien.big.roverml.RoverSystem;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rover System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.impl.RoverSystemImpl#getRovers <em>Rovers</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.impl.RoverSystemImpl#getRoverPrograms <em>Rover Programs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoverSystemImpl extends MinimalEObjectImpl.Container implements RoverSystem {
	/**
	 * The cached value of the '{@link #getRovers() <em>Rovers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRovers()
	 * @generated
	 * @ordered
	 */
	protected EList<Rover> rovers;

	/**
	 * The cached value of the '{@link #getRoverPrograms() <em>Rover Programs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoverPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<RoverProgram> roverPrograms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoverSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverMLPackage.Literals.ROVER_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rover> getRovers() {
		if (rovers == null) {
			rovers = new EObjectContainmentEList<Rover>(Rover.class, this, RoverMLPackage.ROVER_SYSTEM__ROVERS);
		}
		return rovers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoverProgram> getRoverPrograms() {
		if (roverPrograms == null) {
			roverPrograms = new EObjectContainmentEList<RoverProgram>(RoverProgram.class, this, RoverMLPackage.ROVER_SYSTEM__ROVER_PROGRAMS);
		}
		return roverPrograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RoverMLPackage.ROVER_SYSTEM__ROVERS:
				return ((InternalEList<?>)getRovers()).basicRemove(otherEnd, msgs);
			case RoverMLPackage.ROVER_SYSTEM__ROVER_PROGRAMS:
				return ((InternalEList<?>)getRoverPrograms()).basicRemove(otherEnd, msgs);
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
			case RoverMLPackage.ROVER_SYSTEM__ROVERS:
				return getRovers();
			case RoverMLPackage.ROVER_SYSTEM__ROVER_PROGRAMS:
				return getRoverPrograms();
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
			case RoverMLPackage.ROVER_SYSTEM__ROVERS:
				getRovers().clear();
				getRovers().addAll((Collection<? extends Rover>)newValue);
				return;
			case RoverMLPackage.ROVER_SYSTEM__ROVER_PROGRAMS:
				getRoverPrograms().clear();
				getRoverPrograms().addAll((Collection<? extends RoverProgram>)newValue);
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
			case RoverMLPackage.ROVER_SYSTEM__ROVERS:
				getRovers().clear();
				return;
			case RoverMLPackage.ROVER_SYSTEM__ROVER_PROGRAMS:
				getRoverPrograms().clear();
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
			case RoverMLPackage.ROVER_SYSTEM__ROVERS:
				return rovers != null && !rovers.isEmpty();
			case RoverMLPackage.ROVER_SYSTEM__ROVER_PROGRAMS:
				return roverPrograms != null && !roverPrograms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoverSystemImpl

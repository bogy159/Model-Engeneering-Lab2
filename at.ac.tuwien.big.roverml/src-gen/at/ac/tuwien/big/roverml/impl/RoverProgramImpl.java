/**
 */
package at.ac.tuwien.big.roverml.impl;

import at.ac.tuwien.big.roverml.Block;
import at.ac.tuwien.big.roverml.Rover;
import at.ac.tuwien.big.roverml.RoverMLPackage;
import at.ac.tuwien.big.roverml.RoverProgram;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rover Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.impl.RoverProgramImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.impl.RoverProgramImpl#getRover <em>Rover</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoverProgramImpl extends NamedElementImpl implements RoverProgram {
	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected Block block;

	/**
	 * The cached value of the '{@link #getRover() <em>Rover</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRover()
	 * @generated
	 * @ordered
	 */
	protected Rover rover;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoverProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverMLPackage.Literals.ROVER_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs) {
		Block oldBlock = block;
		block = newBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoverMLPackage.ROVER_PROGRAM__BLOCK, oldBlock, newBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(Block newBlock) {
		if (newBlock != block) {
			NotificationChain msgs = null;
			if (block != null)
				msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoverMLPackage.ROVER_PROGRAM__BLOCK, null, msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoverMLPackage.ROVER_PROGRAM__BLOCK, null, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverMLPackage.ROVER_PROGRAM__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rover getRover() {
		if (rover != null && rover.eIsProxy()) {
			InternalEObject oldRover = (InternalEObject)rover;
			rover = (Rover)eResolveProxy(oldRover);
			if (rover != oldRover) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoverMLPackage.ROVER_PROGRAM__ROVER, oldRover, rover));
			}
		}
		return rover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rover basicGetRover() {
		return rover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRover(Rover newRover) {
		Rover oldRover = rover;
		rover = newRover;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverMLPackage.ROVER_PROGRAM__ROVER, oldRover, rover));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RoverMLPackage.ROVER_PROGRAM__BLOCK:
				return basicSetBlock(null, msgs);
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
			case RoverMLPackage.ROVER_PROGRAM__BLOCK:
				return getBlock();
			case RoverMLPackage.ROVER_PROGRAM__ROVER:
				if (resolve) return getRover();
				return basicGetRover();
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
			case RoverMLPackage.ROVER_PROGRAM__BLOCK:
				setBlock((Block)newValue);
				return;
			case RoverMLPackage.ROVER_PROGRAM__ROVER:
				setRover((Rover)newValue);
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
			case RoverMLPackage.ROVER_PROGRAM__BLOCK:
				setBlock((Block)null);
				return;
			case RoverMLPackage.ROVER_PROGRAM__ROVER:
				setRover((Rover)null);
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
			case RoverMLPackage.ROVER_PROGRAM__BLOCK:
				return block != null;
			case RoverMLPackage.ROVER_PROGRAM__ROVER:
				return rover != null;
		}
		return super.eIsSet(featureID);
	}

} //RoverProgramImpl

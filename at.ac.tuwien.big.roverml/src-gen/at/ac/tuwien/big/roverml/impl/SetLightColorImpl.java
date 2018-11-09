/**
 */
package at.ac.tuwien.big.roverml.impl;

import at.ac.tuwien.big.roverml.Color;
import at.ac.tuwien.big.roverml.Light;
import at.ac.tuwien.big.roverml.RoverMLPackage;
import at.ac.tuwien.big.roverml.SetLightColor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Light Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.impl.SetLightColorImpl#getColor <em>Color</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.impl.SetLightColorImpl#getLights <em>Lights</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetLightColorImpl extends CommandImpl implements SetLightColor {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = Color.NONE;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLights() <em>Lights</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights()
	 * @generated
	 * @ordered
	 */
	protected EList<Light> lights;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetLightColorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoverMLPackage.Literals.SET_LIGHT_COLOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoverMLPackage.SET_LIGHT_COLOR__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Light> getLights() {
		if (lights == null) {
			lights = new EObjectResolvingEList<Light>(Light.class, this, RoverMLPackage.SET_LIGHT_COLOR__LIGHTS);
		}
		return lights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoverMLPackage.SET_LIGHT_COLOR__COLOR:
				return getColor();
			case RoverMLPackage.SET_LIGHT_COLOR__LIGHTS:
				return getLights();
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
			case RoverMLPackage.SET_LIGHT_COLOR__COLOR:
				setColor((Color)newValue);
				return;
			case RoverMLPackage.SET_LIGHT_COLOR__LIGHTS:
				getLights().clear();
				getLights().addAll((Collection<? extends Light>)newValue);
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
			case RoverMLPackage.SET_LIGHT_COLOR__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case RoverMLPackage.SET_LIGHT_COLOR__LIGHTS:
				getLights().clear();
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
			case RoverMLPackage.SET_LIGHT_COLOR__COLOR:
				return color != COLOR_EDEFAULT;
			case RoverMLPackage.SET_LIGHT_COLOR__LIGHTS:
				return lights != null && !lights.isEmpty();
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
		result.append(" (color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //SetLightColorImpl

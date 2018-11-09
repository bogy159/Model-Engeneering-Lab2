/**
 */
package at.ac.tuwien.big.roverml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Light Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.SetLightColor#getColor <em>Color</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.SetLightColor#getLights <em>Lights</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getSetLightColor()
 * @model
 * @generated
 */
public interface SetLightColor extends Command {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link at.ac.tuwien.big.roverml.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see at.ac.tuwien.big.roverml.Color
	 * @see #setColor(Color)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getSetLightColor_Color()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!SetLightColor!color'"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.SetLightColor#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see at.ac.tuwien.big.roverml.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Lights</b></em>' reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.roverml.Light}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lights</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lights</em>' reference list.
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getSetLightColor_Lights()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!SetLightColor!lights'"
	 * @generated
	 */
	EList<Light> getLights();

} // SetLightColor

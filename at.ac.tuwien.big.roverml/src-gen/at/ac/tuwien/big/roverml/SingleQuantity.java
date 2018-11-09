/**
 */
package at.ac.tuwien.big.roverml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.SingleQuantity#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getSingleQuantity()
 * @model abstract="true"
 * @generated
 */
public interface SingleQuantity extends Quantity {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getSingleQuantity_Value()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!SingleQuantity!value'"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.SingleQuantity#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // SingleQuantity

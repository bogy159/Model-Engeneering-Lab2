/**
 */
package at.ac.tuwien.big.roverml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.Position#getX <em>X</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.Position#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends Quantity {

	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(Length)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getPosition_X()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!Position!x'"
	 * @generated
	 */
	Length getX();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.Position#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(Length value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' containment reference.
	 * @see #setY(Length)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getPosition_Y()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!Position!y'"
	 * @generated
	 */
	Length getY();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.Position#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(Length value);
} // Position

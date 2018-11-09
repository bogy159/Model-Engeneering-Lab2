/**
 */
package at.ac.tuwien.big.roverml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rover Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.RoverProgram#getBlock <em>Block</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.RoverProgram#getRover <em>Rover</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getRoverProgram()
 * @model
 * @generated
 */
public interface RoverProgram extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(Block)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getRoverProgram_Block()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!RoverProgram!block'"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.RoverProgram#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Rover</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rover</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rover</em>' reference.
	 * @see #setRover(Rover)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getRoverProgram_Rover()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!RoverProgram!rover'"
	 * @generated
	 */
	Rover getRover();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.RoverProgram#getRover <em>Rover</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rover</em>' reference.
	 * @see #getRover()
	 * @generated
	 */
	void setRover(Rover value);

} // RoverProgram

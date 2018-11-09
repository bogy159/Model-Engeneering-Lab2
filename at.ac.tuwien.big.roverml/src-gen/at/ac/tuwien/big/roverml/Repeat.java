/**
 */
package at.ac.tuwien.big.roverml;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.Repeat#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getRepeat()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='repeatAtLeastOnce'"
 * @generated
 */
public interface Repeat extends Command, Block {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getRepeat_Count()
	 * @model default="0" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!Repeat!count'"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.Repeat#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv repeatAtLeastOnce:\n *   let severity : Integer[1] = \'Repeat::repeatAtLeastOnce\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let result : Boolean[?] = self.count &gt; 0 or self.count = -1\n *       in\n *         \'Repeat::repeatAtLeastOnce\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Repeat_c_c_repeatAtLeastOnce);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ int count_0 = this.getCount();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_count_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(count_0);\n\tfinal /*@NonInvalid\052/ boolean gt = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation%&gt;.INSTANCE.evaluate(executor, BOXED_count_0, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean result;\n\tif (gt) {\n\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; diff = (&lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt;)&lt;%org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation%&gt;.INSTANCE.evaluate(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_1);\n\t\tfinal /*@NonInvalid\052/ boolean eq = BOXED_count_0.equals(diff);\n\t\tresult = eq;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Repeat_c_c_repeatAtLeastOnce, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean repeatAtLeastOnce(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Repeat

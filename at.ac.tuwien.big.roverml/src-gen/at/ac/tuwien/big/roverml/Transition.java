/**
 */
package at.ac.tuwien.big.roverml;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.Transition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getTransition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sourceAndTargetInSameBlock'"
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Command)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getTransition_Source()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!Transition!source'"
	 * @generated
	 */
	Command getSource();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Command value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Command)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getTransition_Target()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!Transition!target'"
	 * @generated
	 */
	Command getTarget();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Command value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv sourceAndTargetInSameBlock:\n *   let\n *     severity : Integer[1] = \'Transition::sourceAndTargetInSameBlock\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let result : Boolean[1] = self.source.Block = self.target.Block\n *       in\n *         \'Transition::sourceAndTargetInSameBlock\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Transition_c_c_sourceAndTargetInSameBlock);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.internal.library.UnboxedCompositionProperty%&gt; IMPPROPid_commands_0 = new &lt;%org.eclipse.ocl.pivot.internal.library.UnboxedCompositionProperty%&gt;(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.PROPid_commands);\n\tfinal /*@NonInvalid\052/ &lt;%at.ac.tuwien.big.roverml.Command%&gt; source = this.getSource();\n\tfinal /*@NonInvalid\052/ &lt;%at.ac.tuwien.big.roverml.Block%&gt; Block = (&lt;%at.ac.tuwien.big.roverml.Block%&gt;)IMPPROPid_commands_0.evaluate(executor, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.CLSSid_Block, source);\n\tfinal /*@NonInvalid\052/ &lt;%at.ac.tuwien.big.roverml.Command%&gt; target = this.getTarget();\n\tfinal /*@NonInvalid\052/ &lt;%at.ac.tuwien.big.roverml.Block%&gt; Block_0 = (&lt;%at.ac.tuwien.big.roverml.Block%&gt;)IMPPROPid_commands_0.evaluate(executor, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.CLSSid_Block, target);\n\tfinal /*@NonInvalid\052/ boolean result = (Block != null) ? Block.equals(Block_0) : (Block_0 == null);\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Transition_c_c_sourceAndTargetInSameBlock, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean sourceAndTargetInSameBlock(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv triggeredTransitionAfterInfiniteCommand:\n *   let\n *     severity : Integer[1] = \'Transition::triggeredTransitionAfterInfiniteCommand\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[1] = if\n *           self.source.oclIsKindOf(Move) and\n *           self.source.oclAsType(Move)\n *           .distance.oclIsUndefined() xor\n *           self.source.oclIsKindOf(Repeat) and\n *           self.source.oclAsType(Repeat).count = -1\n *         then\n *           self.oclIsKindOf(TriggeredTransition(SensorType, QuantityType))\n *         else true\n *         endif\n *       in\n *         \'Transition::triggeredTransitionAfterInfiniteCommand\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Transition_c_c_triggeredTransitionAfterInfiniteCommand);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_roverml_c_c_Move = idResolver.getClass(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.CLSSid_Move, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_roverml_c_c_Repeat = idResolver.getClass(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.CLSSid_Repeat, null);\n\tfinal /*@NonInvalid\052/ &lt;%at.ac.tuwien.big.roverml.Command%&gt; source_1 = this.getSource();\n\tfinal /*@NonInvalid\052/ boolean oclIsKindOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, source_1, TYP_roverml_c_c_Move).booleanValue();\n\t/*@NonInvalid\052/ boolean and;\n\tif (oclIsKindOf) {\n\t\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_distance;\n\t\ttry {\n\t\t\tfinal /*@Thrown\052/ &lt;%at.ac.tuwien.big.roverml.Move%&gt; oclAsType = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%at.ac.tuwien.big.roverml.Move%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, source_1, TYP_roverml_c_c_Move));\n\t\t\tfinal /*@Thrown\052/ &lt;%at.ac.tuwien.big.roverml.Length%&gt; distance = oclAsType.getDistance();\n\t\t\tCAUGHT_distance = distance;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_distance = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean oclIsUndefined = (CAUGHT_distance == null) || (CAUGHT_distance instanceof &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;);\n\t\tand = oclIsUndefined;\n\t}\n\telse {\n\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t}\n\tfinal /*@NonInvalid\052/ boolean oclIsKindOf_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, source_1, TYP_roverml_c_c_Repeat).booleanValue();\n\t/*@Thrown\052/ boolean and_0;\n\tif (oclIsKindOf_0) {\n\t\tfinal /*@Thrown\052/ &lt;%at.ac.tuwien.big.roverml.Repeat%&gt; oclAsType_0 = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%at.ac.tuwien.big.roverml.Repeat%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, source_1, TYP_roverml_c_c_Repeat));\n\t\tfinal /*@Thrown\052/ int count = oclAsType_0.getCount();\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_count = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(count);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; diff = (&lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt;)&lt;%org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation%&gt;.INSTANCE.evaluate(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_1);\n\t\tfinal /*@Thrown\052/ boolean eq = BOXED_count.equals(diff);\n\t\tand_0 = eq;\n\t}\n\telse {\n\t\tand_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t}\n\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; xor = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanXorOperation%&gt;.INSTANCE.evaluate(and, and_0);\n\tif (xor == null) {\n\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null if condition\");\n\t}\n\t/*@NonInvalid\052/ boolean result;\n\tif (xor) {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_roverml_c_c_TriggeredTransition_o_SensorType_44_QuantityType_e = idResolver.getClass(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.CLSSid_TriggeredTransition, null);\n\t\tfinal /*@NonInvalid\052/ boolean oclIsKindOf_1 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, this, TYP_roverml_c_c_TriggeredTransition_o_SensorType_44_QuantityType_e).booleanValue();\n\t\tresult = oclIsKindOf_1;\n\t}\n\telse {\n\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Transition_c_c_triggeredTransitionAfterInfiniteCommand, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean triggeredTransitionAfterInfiniteCommand(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv doNotRotateTwiceInARow:\n *   let\n *     severity : Integer[1] = \'Transition::doNotRotateTwiceInARow\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[?] = if self.source.oclIsTypeOf(Rotate)\n *         then not self.target.oclIsTypeOf(Rotate)\n *         else true\n *         endif\n *       in\n *         \'Transition::doNotRotateTwiceInARow\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Transition_c_c_doNotRotateTwiceInARow);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_roverml_c_c_Rotate = idResolver.getClass(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.CLSSid_Rotate, null);\n\tfinal /*@NonInvalid\052/ &lt;%at.ac.tuwien.big.roverml.Command%&gt; source = this.getSource();\n\tfinal /*@NonInvalid\052/ boolean oclIsTypeOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%&gt;.INSTANCE.evaluate(executor, source, TYP_roverml_c_c_Rotate).booleanValue();\n\t/*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; result;\n\tif (oclIsTypeOf) {\n\t\tfinal /*@NonInvalid\052/ &lt;%at.ac.tuwien.big.roverml.Command%&gt; target = this.getTarget();\n\t\tfinal /*@NonInvalid\052/ boolean oclIsTypeOf_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%&gt;.INSTANCE.evaluate(executor, target, TYP_roverml_c_c_Rotate).booleanValue();\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; not = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanNotOperation%&gt;.INSTANCE.evaluate(oclIsTypeOf_0);\n\t\tresult = not;\n\t}\n\telse {\n\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Transition_c_c_doNotRotateTwiceInARow, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean doNotRotateTwiceInARow(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Transition

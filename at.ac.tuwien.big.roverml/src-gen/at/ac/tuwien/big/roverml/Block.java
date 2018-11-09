/**
 */
package at.ac.tuwien.big.roverml;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.Block#getCommands <em>Commands</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.Block#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getBlock()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='atLeastOneIncomingTransition'"
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.roverml.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getBlock_Commands()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!Block!commands'"
	 * @generated
	 */
	EList<Command> getCommands();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.roverml.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getBlock_Transitions()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!Block!transitions'"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv onlyTerminateOnce:\n *   let severity : Integer[1] = \'Block::onlyTerminateOnce\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[1] = self.commands-&gt;select(command |\n *           command.oclIsTypeOf(Terminate))\n *         -&gt;size() &lt;= 1\n *       in\n *         \'Block::onlyTerminateOnce\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Block_c_c_onlyTerminateOnce);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%at.ac.tuwien.big.roverml.Command%&gt;&gt; commands = this.getCommands();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_commands = idResolver.createOrderedSetOfAll(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.ORD_CLSSid_Command, commands);\n\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createOrderedSetAccumulatorValue(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.ORD_CLSSid_Command);\n\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR_command = BOXED_commands.iterator();\n\t/*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; select;\n\twhile (true) {\n\t\tif (!ITERATOR_command.hasNext()) {\n\t\t\tselect = accumulator;\n\t\t\tbreak;\n\t\t}\n\t\t/*@NonInvalid\052/ &lt;%at.ac.tuwien.big.roverml.Command%&gt; command = (&lt;%at.ac.tuwien.big.roverml.Command%&gt;)ITERATOR_command.next();\n\t\t/**\n\t\t * command.oclIsTypeOf(Terminate)\n\t\t \052/\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_roverml_c_c_Terminate = idResolver.getClass(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.CLSSid_Terminate, null);\n\t\tfinal /*@NonInvalid\052/ boolean oclIsTypeOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%&gt;.INSTANCE.evaluate(executor, command, TYP_roverml_c_c_Terminate).booleanValue();\n\t\t//\n\t\tif (oclIsTypeOf == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\taccumulator.add(command);\n\t\t}\n\t}\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation%&gt;.INSTANCE.evaluate(select);\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_1).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Block_c_c_onlyTerminateOnce, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean onlyTerminateOnce(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv atLeastOneIncomingTransition:\n *   let\n *     severity : Integer[1] = \'Block::atLeastOneIncomingTransition\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[1] = self.commands-&gt;size() -\n *         self.transitions.target-&gt;asSet()\n *         -&gt;size() &lt;= 1\n *       in\n *         \'Block::atLeastOneIncomingTransition\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Block_c_c_atLeastOneIncomingTransition);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%at.ac.tuwien.big.roverml.Command%&gt;&gt; commands = this.getCommands();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_commands = idResolver.createOrderedSetOfAll(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.ORD_CLSSid_Command, commands);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation%&gt;.INSTANCE.evaluate(BOXED_commands);\n\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%at.ac.tuwien.big.roverml.Transition%&gt;&gt; transitions = this.getTransitions();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_transitions = idResolver.createOrderedSetOfAll(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.ORD_CLSSid_Transition, transitions);\n\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSequenceAccumulatorValue(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.SEQ_CLSSid_Command);\n\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR__1 = BOXED_transitions.iterator();\n\t/*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt; collect;\n\twhile (true) {\n\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\tcollect = accumulator;\n\t\t\tbreak;\n\t\t}\n\t\t/*@NonInvalid\052/ &lt;%at.ac.tuwien.big.roverml.Transition%&gt; _1 = (&lt;%at.ac.tuwien.big.roverml.Transition%&gt;)ITERATOR__1.next();\n\t\t/**\n\t\t * target\n\t\t \052/\n\t\tfinal /*@NonInvalid\052/ &lt;%at.ac.tuwien.big.roverml.Command%&gt; target = _1.getTarget();\n\t\t//\n\t\taccumulator.add(target);\n\t}\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; asSet = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionAsSetOperation%&gt;.INSTANCE.evaluate(collect);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size_0 = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation%&gt;.INSTANCE.evaluate(asSet);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; diff = (&lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt;)&lt;%org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation%&gt;.INSTANCE.evaluate(size, size_0);\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, diff, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_1).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Block_c_c_atLeastOneIncomingTransition, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean atLeastOneIncomingTransition(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Block

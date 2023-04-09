/**
 */
package ejemploDC4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagrama Clases</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ejemploDC4.DiagramaClases#getPaquetes_contenidos <em>Paquetes contenidos</em>}</li>
 * </ul>
 *
 * @see ejemploDC4.EjemploDC4Package#getDiagramaClases()
 * @model
 * @generated
 */
public interface DiagramaClases extends EObject {
	/**
	 * Returns the value of the '<em><b>Paquetes contenidos</b></em>' containment reference list.
	 * The list contents are of type {@link ejemploDC4.Paquete}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paquetes contenidos</em>' containment reference list.
	 * @see ejemploDC4.EjemploDC4Package#getDiagramaClases_Paquetes_contenidos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Paquete> getPaquetes_contenidos();

} // DiagramaClases

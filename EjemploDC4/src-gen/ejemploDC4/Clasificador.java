/**
 */
package ejemploDC4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clasificador</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ejemploDC4.Clasificador#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ejemploDC4.Clasificador#getHerencias_contenidas <em>Herencias contenidas</em>}</li>
 * </ul>
 *
 * @see ejemploDC4.EjemploDC4Package#getClasificador()
 * @model abstract="true"
 * @generated
 */
public interface Clasificador extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see ejemploDC4.EjemploDC4Package#getClasificador_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link ejemploDC4.Clasificador#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Herencias contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link ejemploDC4.Herencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herencias contenidas</em>' containment reference list.
	 * @see ejemploDC4.EjemploDC4Package#getClasificador_Herencias_contenidas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Herencia> getHerencias_contenidas();

} // Clasificador

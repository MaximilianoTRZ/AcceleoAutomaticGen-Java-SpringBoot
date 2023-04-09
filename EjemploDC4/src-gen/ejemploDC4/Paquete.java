/**
 */
package ejemploDC4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paquete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ejemploDC4.Paquete#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ejemploDC4.Paquete#getClasificadores_contenidos <em>Clasificadores contenidos</em>}</li>
 * </ul>
 *
 * @see ejemploDC4.EjemploDC4Package#getPaquete()
 * @model
 * @generated
 */
public interface Paquete extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see ejemploDC4.EjemploDC4Package#getPaquete_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link ejemploDC4.Paquete#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Clasificadores contenidos</b></em>' containment reference list.
	 * The list contents are of type {@link ejemploDC4.Clasificador}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clasificadores contenidos</em>' containment reference list.
	 * @see ejemploDC4.EjemploDC4Package#getPaquete_Clasificadores_contenidos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clasificador> getClasificadores_contenidos();

} // Paquete

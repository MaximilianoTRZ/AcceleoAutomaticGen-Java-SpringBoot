/**
 */
package ejemploDC4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ejemploDC4.Implementacion#getOrigen <em>Origen</em>}</li>
 *   <li>{@link ejemploDC4.Implementacion#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @see ejemploDC4.EjemploDC4Package#getImplementacion()
 * @model
 * @generated
 */
public interface Implementacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(Clase)
	 * @see ejemploDC4.EjemploDC4Package#getImplementacion_Origen()
	 * @model
	 * @generated
	 */
	Clase getOrigen();

	/**
	 * Sets the value of the '{@link ejemploDC4.Implementacion#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Clase value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Interface)
	 * @see ejemploDC4.EjemploDC4Package#getImplementacion_Destino()
	 * @model
	 * @generated
	 */
	Interface getDestino();

	/**
	 * Sets the value of the '{@link ejemploDC4.Implementacion#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Interface value);

} // Implementacion

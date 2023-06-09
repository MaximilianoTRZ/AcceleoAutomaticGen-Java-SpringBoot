/**
 */
package ejemploDC4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Herencia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ejemploDC4.Herencia#getOrigen <em>Origen</em>}</li>
 *   <li>{@link ejemploDC4.Herencia#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @see ejemploDC4.EjemploDC4Package#getHerencia()
 * @model
 * @generated
 */
public interface Herencia extends EObject {
	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(Clasificador)
	 * @see ejemploDC4.EjemploDC4Package#getHerencia_Origen()
	 * @model
	 * @generated
	 */
	Clasificador getOrigen();

	/**
	 * Sets the value of the '{@link ejemploDC4.Herencia#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Clasificador value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Clasificador)
	 * @see ejemploDC4.EjemploDC4Package#getHerencia_Destino()
	 * @model
	 * @generated
	 */
	Clasificador getDestino();

	/**
	 * Sets the value of the '{@link ejemploDC4.Herencia#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Clasificador value);

} // Herencia

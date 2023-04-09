/**
 */
package ejemploDC4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ejemploDC4.Relacion#getRol <em>Rol</em>}</li>
 *   <li>{@link ejemploDC4.Relacion#getOrigen <em>Origen</em>}</li>
 *   <li>{@link ejemploDC4.Relacion#getDestino <em>Destino</em>}</li>
 *   <li>{@link ejemploDC4.Relacion#getTipo <em>Tipo</em>}</li>
 *   <li>{@link ejemploDC4.Relacion#getMultiplicidad <em>Multiplicidad</em>}</li>
 * </ul>
 *
 * @see ejemploDC4.EjemploDC4Package#getRelacion()
 * @model
 * @generated
 */
public interface Relacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol</em>' attribute.
	 * @see #setRol(String)
	 * @see ejemploDC4.EjemploDC4Package#getRelacion_Rol()
	 * @model
	 * @generated
	 */
	String getRol();

	/**
	 * Sets the value of the '{@link ejemploDC4.Relacion#getRol <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol</em>' attribute.
	 * @see #getRol()
	 * @generated
	 */
	void setRol(String value);

	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(Clase)
	 * @see ejemploDC4.EjemploDC4Package#getRelacion_Origen()
	 * @model
	 * @generated
	 */
	Clase getOrigen();

	/**
	 * Sets the value of the '{@link ejemploDC4.Relacion#getOrigen <em>Origen</em>}' reference.
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
	 * @see #setDestino(Clasificador)
	 * @see ejemploDC4.EjemploDC4Package#getRelacion_Destino()
	 * @model
	 * @generated
	 */
	Clasificador getDestino();

	/**
	 * Sets the value of the '{@link ejemploDC4.Relacion#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Clasificador value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link ejemploDC4.TipoRelacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see ejemploDC4.TipoRelacion
	 * @see #setTipo(TipoRelacion)
	 * @see ejemploDC4.EjemploDC4Package#getRelacion_Tipo()
	 * @model
	 * @generated
	 */
	TipoRelacion getTipo();

	/**
	 * Sets the value of the '{@link ejemploDC4.Relacion#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see ejemploDC4.TipoRelacion
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoRelacion value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad</b></em>' attribute.
	 * The literals are from the enumeration {@link ejemploDC4.Multiplicidad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad</em>' attribute.
	 * @see ejemploDC4.Multiplicidad
	 * @see #setMultiplicidad(Multiplicidad)
	 * @see ejemploDC4.EjemploDC4Package#getRelacion_Multiplicidad()
	 * @model
	 * @generated
	 */
	Multiplicidad getMultiplicidad();

	/**
	 * Sets the value of the '{@link ejemploDC4.Relacion#getMultiplicidad <em>Multiplicidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad</em>' attribute.
	 * @see ejemploDC4.Multiplicidad
	 * @see #getMultiplicidad()
	 * @generated
	 */
	void setMultiplicidad(Multiplicidad value);

} // Relacion

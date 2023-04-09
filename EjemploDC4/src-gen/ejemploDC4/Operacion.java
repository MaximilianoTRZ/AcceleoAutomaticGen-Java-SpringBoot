/**
 */
package ejemploDC4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ejemploDC4.Operacion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ejemploDC4.Operacion#getVisibilidad <em>Visibilidad</em>}</li>
 *   <li>{@link ejemploDC4.Operacion#getRetorno <em>Retorno</em>}</li>
 * </ul>
 *
 * @see ejemploDC4.EjemploDC4Package#getOperacion()
 * @model
 * @generated
 */
public interface Operacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see ejemploDC4.EjemploDC4Package#getOperacion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link ejemploDC4.Operacion#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Visibilidad</b></em>' attribute.
	 * The literals are from the enumeration {@link ejemploDC4.TipoVisibilidad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibilidad</em>' attribute.
	 * @see ejemploDC4.TipoVisibilidad
	 * @see #setVisibilidad(TipoVisibilidad)
	 * @see ejemploDC4.EjemploDC4Package#getOperacion_Visibilidad()
	 * @model
	 * @generated
	 */
	TipoVisibilidad getVisibilidad();

	/**
	 * Sets the value of the '{@link ejemploDC4.Operacion#getVisibilidad <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibilidad</em>' attribute.
	 * @see ejemploDC4.TipoVisibilidad
	 * @see #getVisibilidad()
	 * @generated
	 */
	void setVisibilidad(TipoVisibilidad value);

	/**
	 * Returns the value of the '<em><b>Retorno</b></em>' attribute.
	 * The literals are from the enumeration {@link ejemploDC4.TipoRetorino}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retorno</em>' attribute.
	 * @see ejemploDC4.TipoRetorino
	 * @see #setRetorno(TipoRetorino)
	 * @see ejemploDC4.EjemploDC4Package#getOperacion_Retorno()
	 * @model
	 * @generated
	 */
	TipoRetorino getRetorno();

	/**
	 * Sets the value of the '{@link ejemploDC4.Operacion#getRetorno <em>Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retorno</em>' attribute.
	 * @see ejemploDC4.TipoRetorino
	 * @see #getRetorno()
	 * @generated
	 */
	void setRetorno(TipoRetorino value);

} // Operacion

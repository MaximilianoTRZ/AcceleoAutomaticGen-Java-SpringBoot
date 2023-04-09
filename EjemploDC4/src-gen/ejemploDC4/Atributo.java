/**
 */
package ejemploDC4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ejemploDC4.Atributo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ejemploDC4.Atributo#getVisibilidad <em>Visibilidad</em>}</li>
 *   <li>{@link ejemploDC4.Atributo#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see ejemploDC4.EjemploDC4Package#getAtributo()
 * @model
 * @generated
 */
public interface Atributo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see ejemploDC4.EjemploDC4Package#getAtributo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link ejemploDC4.Atributo#getNombre <em>Nombre</em>}' attribute.
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
	 * @see ejemploDC4.EjemploDC4Package#getAtributo_Visibilidad()
	 * @model
	 * @generated
	 */
	TipoVisibilidad getVisibilidad();

	/**
	 * Sets the value of the '{@link ejemploDC4.Atributo#getVisibilidad <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibilidad</em>' attribute.
	 * @see ejemploDC4.TipoVisibilidad
	 * @see #getVisibilidad()
	 * @generated
	 */
	void setVisibilidad(TipoVisibilidad value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link ejemploDC4.TipoDato}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see ejemploDC4.TipoDato
	 * @see #setTipo(TipoDato)
	 * @see ejemploDC4.EjemploDC4Package#getAtributo_Tipo()
	 * @model
	 * @generated
	 */
	TipoDato getTipo();

	/**
	 * Sets the value of the '{@link ejemploDC4.Atributo#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see ejemploDC4.TipoDato
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoDato value);

} // Atributo

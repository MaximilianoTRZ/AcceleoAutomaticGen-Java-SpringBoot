/**
 */
package ejemploDC4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ejemploDC4.Clase#getAtributos_contenidos <em>Atributos contenidos</em>}</li>
 *   <li>{@link ejemploDC4.Clase#getOperaciones_contenidas <em>Operaciones contenidas</em>}</li>
 *   <li>{@link ejemploDC4.Clase#getImplementaciones_contenidas <em>Implementaciones contenidas</em>}</li>
 *   <li>{@link ejemploDC4.Clase#getRelaciones_contenidas <em>Relaciones contenidas</em>}</li>
 * </ul>
 *
 * @see ejemploDC4.EjemploDC4Package#getClase()
 * @model
 * @generated
 */
public interface Clase extends Clasificador {
	/**
	 * Returns the value of the '<em><b>Atributos contenidos</b></em>' containment reference list.
	 * The list contents are of type {@link ejemploDC4.Atributo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos contenidos</em>' containment reference list.
	 * @see ejemploDC4.EjemploDC4Package#getClase_Atributos_contenidos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributo> getAtributos_contenidos();

	/**
	 * Returns the value of the '<em><b>Operaciones contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link ejemploDC4.Operacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones contenidas</em>' containment reference list.
	 * @see ejemploDC4.EjemploDC4Package#getClase_Operaciones_contenidas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operacion> getOperaciones_contenidas();

	/**
	 * Returns the value of the '<em><b>Implementaciones contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link ejemploDC4.Implementacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementaciones contenidas</em>' containment reference list.
	 * @see ejemploDC4.EjemploDC4Package#getClase_Implementaciones_contenidas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Implementacion> getImplementaciones_contenidas();

	/**
	 * Returns the value of the '<em><b>Relaciones contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link ejemploDC4.Relacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaciones contenidas</em>' containment reference list.
	 * @see ejemploDC4.EjemploDC4Package#getClase_Relaciones_contenidas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relacion> getRelaciones_contenidas();

} // Clase

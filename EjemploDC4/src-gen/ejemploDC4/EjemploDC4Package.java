/**
 */
package ejemploDC4;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ejemploDC4.EjemploDC4Factory
 * @model kind="package"
 * @generated
 */
public interface EjemploDC4Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ejemploDC4";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ejemploDC4";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ejemploDC4";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EjemploDC4Package eINSTANCE = ejemploDC4.impl.EjemploDC4PackageImpl.init();

	/**
	 * The meta object id for the '{@link ejemploDC4.impl.DiagramaClasesImpl <em>Diagrama Clases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ejemploDC4.impl.DiagramaClasesImpl
	 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getDiagramaClases()
	 * @generated
	 */
	int DIAGRAMA_CLASES = 0;

	/**
	 * The feature id for the '<em><b>Paquetes contenidos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES__PAQUETES_CONTENIDOS = 0;

	/**
	 * The number of structural features of the '<em>Diagrama Clases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Diagrama Clases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ejemploDC4.impl.ClasificadorImpl <em>Clasificador</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ejemploDC4.impl.ClasificadorImpl
	 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getClasificador()
	 * @generated
	 */
	int CLASIFICADOR = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASIFICADOR__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Herencias contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASIFICADOR__HERENCIAS_CONTENIDAS = 1;

	/**
	 * The number of structural features of the '<em>Clasificador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASIFICADOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Clasificador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASIFICADOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ejemploDC4.impl.ClaseImpl <em>Clase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ejemploDC4.impl.ClaseImpl
	 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getClase()
	 * @generated
	 */
	int CLASE = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__NOMBRE = CLASIFICADOR__NOMBRE;

	/**
	 * The feature id for the '<em><b>Herencias contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__HERENCIAS_CONTENIDAS = CLASIFICADOR__HERENCIAS_CONTENIDAS;

	/**
	 * The feature id for the '<em><b>Atributos contenidos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__ATRIBUTOS_CONTENIDOS = CLASIFICADOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operaciones contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__OPERACIONES_CONTENIDAS = CLASIFICADOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implementaciones contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__IMPLEMENTACIONES_CONTENIDAS = CLASIFICADOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relaciones contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__RELACIONES_CONTENIDAS = CLASIFICADOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_FEATURE_COUNT = CLASIFICADOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_OPERATION_COUNT = CLASIFICADOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ejemploDC4.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ejemploDC4.impl.InterfaceImpl
	 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NOMBRE = CLASIFICADOR__NOMBRE;

	/**
	 * The feature id for the '<em><b>Herencias contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__HERENCIAS_CONTENIDAS = CLASIFICADOR__HERENCIAS_CONTENIDAS;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = CLASIFICADOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = CLASIFICADOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ejemploDC4.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ejemploDC4.impl.AtributoImpl
	 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Visibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__VISIBILIDAD = 1;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPO = 2;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ejemploDC4.impl.OperacionImpl <em>Operacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ejemploDC4.impl.OperacionImpl
	 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getOperacion()
	 * @generated
	 */
	int OPERACION = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Visibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__VISIBILIDAD = 1;

	/**
	 * The feature id for the '<em><b>Retorno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__RETORNO = 2;

	/**
	 * The number of structural features of the '<em>Operacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ejemploDC4.impl.HerenciaImpl <em>Herencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ejemploDC4.impl.HerenciaImpl
	 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getHerencia()
	 * @generated
	 */
	int HERENCIA = 6;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__ORIGEN = 0;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__DESTINO = 1;

	/**
	 * The number of structural features of the '<em>Herencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Herencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ejemploDC4.impl.ImplementacionImpl <em>Implementacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ejemploDC4.impl.ImplementacionImpl
	 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getImplementacion()
	 * @generated
	 */
	int IMPLEMENTACION = 7;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION__ORIGEN = 0;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION__DESTINO = 1;

	/**
	 * The number of structural features of the '<em>Implementacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Implementacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ejemploDC4.impl.RelacionImpl <em>Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ejemploDC4.impl.RelacionImpl
	 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getRelacion()
	 * @generated
	 */
	int RELACION = 8;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__ROL = 0;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__ORIGEN = 1;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__DESTINO = 2;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__TIPO = 3;

	/**
	 * The feature id for the '<em><b>Multiplicidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__MULTIPLICIDAD = 4;

	/**
	 * The number of structural features of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ejemploDC4.impl.PaqueteImpl <em>Paquete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ejemploDC4.impl.PaqueteImpl
	 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getPaquete()
	 * @generated
	 */
	int PAQUETE = 9;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Clasificadores contenidos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__CLASIFICADORES_CONTENIDOS = 1;

	/**
	 * The number of structural features of the '<em>Paquete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Paquete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ejemploDC4.TipoVisibilidad <em>Tipo Visibilidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ejemploDC4.TipoVisibilidad
	 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getTipoVisibilidad()
	 * @generated
	 */
	int TIPO_VISIBILIDAD = 10;

	/**
	 * The meta object id for the '{@link ejemploDC4.TipoDato <em>Tipo Dato</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ejemploDC4.TipoDato
	 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getTipoDato()
	 * @generated
	 */
	int TIPO_DATO = 11;

	/**
	 * The meta object id for the '{@link ejemploDC4.TipoRetorino <em>Tipo Retorino</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ejemploDC4.TipoRetorino
	 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getTipoRetorino()
	 * @generated
	 */
	int TIPO_RETORINO = 12;

	/**
	 * The meta object id for the '{@link ejemploDC4.TipoRelacion <em>Tipo Relacion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ejemploDC4.TipoRelacion
	 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getTipoRelacion()
	 * @generated
	 */
	int TIPO_RELACION = 13;

	/**
	 * The meta object id for the '{@link ejemploDC4.Multiplicidad <em>Multiplicidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ejemploDC4.Multiplicidad
	 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getMultiplicidad()
	 * @generated
	 */
	int MULTIPLICIDAD = 14;

	/**
	 * Returns the meta object for class '{@link ejemploDC4.DiagramaClases <em>Diagrama Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagrama Clases</em>'.
	 * @see ejemploDC4.DiagramaClases
	 * @generated
	 */
	EClass getDiagramaClases();

	/**
	 * Returns the meta object for the containment reference list '{@link ejemploDC4.DiagramaClases#getPaquetes_contenidos <em>Paquetes contenidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paquetes contenidos</em>'.
	 * @see ejemploDC4.DiagramaClases#getPaquetes_contenidos()
	 * @see #getDiagramaClases()
	 * @generated
	 */
	EReference getDiagramaClases_Paquetes_contenidos();

	/**
	 * Returns the meta object for class '{@link ejemploDC4.Clase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clase</em>'.
	 * @see ejemploDC4.Clase
	 * @generated
	 */
	EClass getClase();

	/**
	 * Returns the meta object for the containment reference list '{@link ejemploDC4.Clase#getAtributos_contenidos <em>Atributos contenidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos contenidos</em>'.
	 * @see ejemploDC4.Clase#getAtributos_contenidos()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Atributos_contenidos();

	/**
	 * Returns the meta object for the containment reference list '{@link ejemploDC4.Clase#getOperaciones_contenidas <em>Operaciones contenidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operaciones contenidas</em>'.
	 * @see ejemploDC4.Clase#getOperaciones_contenidas()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Operaciones_contenidas();

	/**
	 * Returns the meta object for the containment reference list '{@link ejemploDC4.Clase#getImplementaciones_contenidas <em>Implementaciones contenidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementaciones contenidas</em>'.
	 * @see ejemploDC4.Clase#getImplementaciones_contenidas()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Implementaciones_contenidas();

	/**
	 * Returns the meta object for the containment reference list '{@link ejemploDC4.Clase#getRelaciones_contenidas <em>Relaciones contenidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relaciones contenidas</em>'.
	 * @see ejemploDC4.Clase#getRelaciones_contenidas()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Relaciones_contenidas();

	/**
	 * Returns the meta object for class '{@link ejemploDC4.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see ejemploDC4.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link ejemploDC4.Clasificador <em>Clasificador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clasificador</em>'.
	 * @see ejemploDC4.Clasificador
	 * @generated
	 */
	EClass getClasificador();

	/**
	 * Returns the meta object for the attribute '{@link ejemploDC4.Clasificador#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ejemploDC4.Clasificador#getNombre()
	 * @see #getClasificador()
	 * @generated
	 */
	EAttribute getClasificador_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link ejemploDC4.Clasificador#getHerencias_contenidas <em>Herencias contenidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Herencias contenidas</em>'.
	 * @see ejemploDC4.Clasificador#getHerencias_contenidas()
	 * @see #getClasificador()
	 * @generated
	 */
	EReference getClasificador_Herencias_contenidas();

	/**
	 * Returns the meta object for class '{@link ejemploDC4.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see ejemploDC4.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link ejemploDC4.Atributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ejemploDC4.Atributo#getNombre()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link ejemploDC4.Atributo#getVisibilidad <em>Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibilidad</em>'.
	 * @see ejemploDC4.Atributo#getVisibilidad()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Visibilidad();

	/**
	 * Returns the meta object for the attribute '{@link ejemploDC4.Atributo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see ejemploDC4.Atributo#getTipo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Tipo();

	/**
	 * Returns the meta object for class '{@link ejemploDC4.Operacion <em>Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operacion</em>'.
	 * @see ejemploDC4.Operacion
	 * @generated
	 */
	EClass getOperacion();

	/**
	 * Returns the meta object for the attribute '{@link ejemploDC4.Operacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ejemploDC4.Operacion#getNombre()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link ejemploDC4.Operacion#getVisibilidad <em>Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibilidad</em>'.
	 * @see ejemploDC4.Operacion#getVisibilidad()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_Visibilidad();

	/**
	 * Returns the meta object for the attribute '{@link ejemploDC4.Operacion#getRetorno <em>Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retorno</em>'.
	 * @see ejemploDC4.Operacion#getRetorno()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_Retorno();

	/**
	 * Returns the meta object for class '{@link ejemploDC4.Herencia <em>Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Herencia</em>'.
	 * @see ejemploDC4.Herencia
	 * @generated
	 */
	EClass getHerencia();

	/**
	 * Returns the meta object for the reference '{@link ejemploDC4.Herencia#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see ejemploDC4.Herencia#getOrigen()
	 * @see #getHerencia()
	 * @generated
	 */
	EReference getHerencia_Origen();

	/**
	 * Returns the meta object for the reference '{@link ejemploDC4.Herencia#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see ejemploDC4.Herencia#getDestino()
	 * @see #getHerencia()
	 * @generated
	 */
	EReference getHerencia_Destino();

	/**
	 * Returns the meta object for class '{@link ejemploDC4.Implementacion <em>Implementacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementacion</em>'.
	 * @see ejemploDC4.Implementacion
	 * @generated
	 */
	EClass getImplementacion();

	/**
	 * Returns the meta object for the reference '{@link ejemploDC4.Implementacion#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see ejemploDC4.Implementacion#getOrigen()
	 * @see #getImplementacion()
	 * @generated
	 */
	EReference getImplementacion_Origen();

	/**
	 * Returns the meta object for the reference '{@link ejemploDC4.Implementacion#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see ejemploDC4.Implementacion#getDestino()
	 * @see #getImplementacion()
	 * @generated
	 */
	EReference getImplementacion_Destino();

	/**
	 * Returns the meta object for class '{@link ejemploDC4.Relacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relacion</em>'.
	 * @see ejemploDC4.Relacion
	 * @generated
	 */
	EClass getRelacion();

	/**
	 * Returns the meta object for the attribute '{@link ejemploDC4.Relacion#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol</em>'.
	 * @see ejemploDC4.Relacion#getRol()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_Rol();

	/**
	 * Returns the meta object for the reference '{@link ejemploDC4.Relacion#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see ejemploDC4.Relacion#getOrigen()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_Origen();

	/**
	 * Returns the meta object for the reference '{@link ejemploDC4.Relacion#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see ejemploDC4.Relacion#getDestino()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_Destino();

	/**
	 * Returns the meta object for the attribute '{@link ejemploDC4.Relacion#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see ejemploDC4.Relacion#getTipo()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link ejemploDC4.Relacion#getMultiplicidad <em>Multiplicidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad</em>'.
	 * @see ejemploDC4.Relacion#getMultiplicidad()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_Multiplicidad();

	/**
	 * Returns the meta object for class '{@link ejemploDC4.Paquete <em>Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paquete</em>'.
	 * @see ejemploDC4.Paquete
	 * @generated
	 */
	EClass getPaquete();

	/**
	 * Returns the meta object for the attribute '{@link ejemploDC4.Paquete#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ejemploDC4.Paquete#getNombre()
	 * @see #getPaquete()
	 * @generated
	 */
	EAttribute getPaquete_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link ejemploDC4.Paquete#getClasificadores_contenidos <em>Clasificadores contenidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clasificadores contenidos</em>'.
	 * @see ejemploDC4.Paquete#getClasificadores_contenidos()
	 * @see #getPaquete()
	 * @generated
	 */
	EReference getPaquete_Clasificadores_contenidos();

	/**
	 * Returns the meta object for enum '{@link ejemploDC4.TipoVisibilidad <em>Tipo Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Visibilidad</em>'.
	 * @see ejemploDC4.TipoVisibilidad
	 * @generated
	 */
	EEnum getTipoVisibilidad();

	/**
	 * Returns the meta object for enum '{@link ejemploDC4.TipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Dato</em>'.
	 * @see ejemploDC4.TipoDato
	 * @generated
	 */
	EEnum getTipoDato();

	/**
	 * Returns the meta object for enum '{@link ejemploDC4.TipoRetorino <em>Tipo Retorino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Retorino</em>'.
	 * @see ejemploDC4.TipoRetorino
	 * @generated
	 */
	EEnum getTipoRetorino();

	/**
	 * Returns the meta object for enum '{@link ejemploDC4.TipoRelacion <em>Tipo Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Relacion</em>'.
	 * @see ejemploDC4.TipoRelacion
	 * @generated
	 */
	EEnum getTipoRelacion();

	/**
	 * Returns the meta object for enum '{@link ejemploDC4.Multiplicidad <em>Multiplicidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicidad</em>'.
	 * @see ejemploDC4.Multiplicidad
	 * @generated
	 */
	EEnum getMultiplicidad();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EjemploDC4Factory getEjemploDC4Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ejemploDC4.impl.DiagramaClasesImpl <em>Diagrama Clases</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ejemploDC4.impl.DiagramaClasesImpl
		 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getDiagramaClases()
		 * @generated
		 */
		EClass DIAGRAMA_CLASES = eINSTANCE.getDiagramaClases();

		/**
		 * The meta object literal for the '<em><b>Paquetes contenidos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA_CLASES__PAQUETES_CONTENIDOS = eINSTANCE.getDiagramaClases_Paquetes_contenidos();

		/**
		 * The meta object literal for the '{@link ejemploDC4.impl.ClaseImpl <em>Clase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ejemploDC4.impl.ClaseImpl
		 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getClase()
		 * @generated
		 */
		EClass CLASE = eINSTANCE.getClase();

		/**
		 * The meta object literal for the '<em><b>Atributos contenidos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__ATRIBUTOS_CONTENIDOS = eINSTANCE.getClase_Atributos_contenidos();

		/**
		 * The meta object literal for the '<em><b>Operaciones contenidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__OPERACIONES_CONTENIDAS = eINSTANCE.getClase_Operaciones_contenidas();

		/**
		 * The meta object literal for the '<em><b>Implementaciones contenidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__IMPLEMENTACIONES_CONTENIDAS = eINSTANCE.getClase_Implementaciones_contenidas();

		/**
		 * The meta object literal for the '<em><b>Relaciones contenidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__RELACIONES_CONTENIDAS = eINSTANCE.getClase_Relaciones_contenidas();

		/**
		 * The meta object literal for the '{@link ejemploDC4.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ejemploDC4.impl.InterfaceImpl
		 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link ejemploDC4.impl.ClasificadorImpl <em>Clasificador</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ejemploDC4.impl.ClasificadorImpl
		 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getClasificador()
		 * @generated
		 */
		EClass CLASIFICADOR = eINSTANCE.getClasificador();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASIFICADOR__NOMBRE = eINSTANCE.getClasificador_Nombre();

		/**
		 * The meta object literal for the '<em><b>Herencias contenidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASIFICADOR__HERENCIAS_CONTENIDAS = eINSTANCE.getClasificador_Herencias_contenidas();

		/**
		 * The meta object literal for the '{@link ejemploDC4.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ejemploDC4.impl.AtributoImpl
		 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NOMBRE = eINSTANCE.getAtributo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Visibilidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__VISIBILIDAD = eINSTANCE.getAtributo_Visibilidad();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TIPO = eINSTANCE.getAtributo_Tipo();

		/**
		 * The meta object literal for the '{@link ejemploDC4.impl.OperacionImpl <em>Operacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ejemploDC4.impl.OperacionImpl
		 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getOperacion()
		 * @generated
		 */
		EClass OPERACION = eINSTANCE.getOperacion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__NOMBRE = eINSTANCE.getOperacion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Visibilidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__VISIBILIDAD = eINSTANCE.getOperacion_Visibilidad();

		/**
		 * The meta object literal for the '<em><b>Retorno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__RETORNO = eINSTANCE.getOperacion_Retorno();

		/**
		 * The meta object literal for the '{@link ejemploDC4.impl.HerenciaImpl <em>Herencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ejemploDC4.impl.HerenciaImpl
		 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getHerencia()
		 * @generated
		 */
		EClass HERENCIA = eINSTANCE.getHerencia();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HERENCIA__ORIGEN = eINSTANCE.getHerencia_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HERENCIA__DESTINO = eINSTANCE.getHerencia_Destino();

		/**
		 * The meta object literal for the '{@link ejemploDC4.impl.ImplementacionImpl <em>Implementacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ejemploDC4.impl.ImplementacionImpl
		 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getImplementacion()
		 * @generated
		 */
		EClass IMPLEMENTACION = eINSTANCE.getImplementacion();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTACION__ORIGEN = eINSTANCE.getImplementacion_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTACION__DESTINO = eINSTANCE.getImplementacion_Destino();

		/**
		 * The meta object literal for the '{@link ejemploDC4.impl.RelacionImpl <em>Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ejemploDC4.impl.RelacionImpl
		 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getRelacion()
		 * @generated
		 */
		EClass RELACION = eINSTANCE.getRelacion();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__ROL = eINSTANCE.getRelacion_Rol();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__ORIGEN = eINSTANCE.getRelacion_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__DESTINO = eINSTANCE.getRelacion_Destino();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__TIPO = eINSTANCE.getRelacion_Tipo();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__MULTIPLICIDAD = eINSTANCE.getRelacion_Multiplicidad();

		/**
		 * The meta object literal for the '{@link ejemploDC4.impl.PaqueteImpl <em>Paquete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ejemploDC4.impl.PaqueteImpl
		 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getPaquete()
		 * @generated
		 */
		EClass PAQUETE = eINSTANCE.getPaquete();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAQUETE__NOMBRE = eINSTANCE.getPaquete_Nombre();

		/**
		 * The meta object literal for the '<em><b>Clasificadores contenidos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAQUETE__CLASIFICADORES_CONTENIDOS = eINSTANCE.getPaquete_Clasificadores_contenidos();

		/**
		 * The meta object literal for the '{@link ejemploDC4.TipoVisibilidad <em>Tipo Visibilidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ejemploDC4.TipoVisibilidad
		 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getTipoVisibilidad()
		 * @generated
		 */
		EEnum TIPO_VISIBILIDAD = eINSTANCE.getTipoVisibilidad();

		/**
		 * The meta object literal for the '{@link ejemploDC4.TipoDato <em>Tipo Dato</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ejemploDC4.TipoDato
		 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getTipoDato()
		 * @generated
		 */
		EEnum TIPO_DATO = eINSTANCE.getTipoDato();

		/**
		 * The meta object literal for the '{@link ejemploDC4.TipoRetorino <em>Tipo Retorino</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ejemploDC4.TipoRetorino
		 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getTipoRetorino()
		 * @generated
		 */
		EEnum TIPO_RETORINO = eINSTANCE.getTipoRetorino();

		/**
		 * The meta object literal for the '{@link ejemploDC4.TipoRelacion <em>Tipo Relacion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ejemploDC4.TipoRelacion
		 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getTipoRelacion()
		 * @generated
		 */
		EEnum TIPO_RELACION = eINSTANCE.getTipoRelacion();

		/**
		 * The meta object literal for the '{@link ejemploDC4.Multiplicidad <em>Multiplicidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ejemploDC4.Multiplicidad
		 * @see ejemploDC4.impl.EjemploDC4PackageImpl#getMultiplicidad()
		 * @generated
		 */
		EEnum MULTIPLICIDAD = eINSTANCE.getMultiplicidad();

	}

} //EjemploDC4Package

/**
 */
package ejemploDC4.impl;

import ejemploDC4.Atributo;
import ejemploDC4.Clase;
import ejemploDC4.Clasificador;
import ejemploDC4.DiagramaClases;
import ejemploDC4.EjemploDC4Factory;
import ejemploDC4.EjemploDC4Package;
import ejemploDC4.Herencia;
import ejemploDC4.Implementacion;
import ejemploDC4.Interface;
import ejemploDC4.Multiplicidad;
import ejemploDC4.Operacion;
import ejemploDC4.Paquete;
import ejemploDC4.Relacion;
import ejemploDC4.TipoDato;
import ejemploDC4.TipoRelacion;
import ejemploDC4.TipoRetorino;
import ejemploDC4.TipoVisibilidad;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EjemploDC4PackageImpl extends EPackageImpl implements EjemploDC4Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramaClasesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clasificadorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass herenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paqueteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoVisibilidadEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoDatoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoRetorinoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoRelacionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicidadEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ejemploDC4.EjemploDC4Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EjemploDC4PackageImpl() {
		super(eNS_URI, EjemploDC4Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EjemploDC4Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EjemploDC4Package init() {
		if (isInited)
			return (EjemploDC4Package) EPackage.Registry.INSTANCE.getEPackage(EjemploDC4Package.eNS_URI);

		// Obtain or create and register package
		Object registeredEjemploDC4Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		EjemploDC4PackageImpl theEjemploDC4Package = registeredEjemploDC4Package instanceof EjemploDC4PackageImpl
				? (EjemploDC4PackageImpl) registeredEjemploDC4Package
				: new EjemploDC4PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEjemploDC4Package.createPackageContents();

		// Initialize created meta-data
		theEjemploDC4Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEjemploDC4Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EjemploDC4Package.eNS_URI, theEjemploDC4Package);
		return theEjemploDC4Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramaClases() {
		return diagramaClasesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramaClases_Paquetes_contenidos() {
		return (EReference) diagramaClasesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClase() {
		return claseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClase_Atributos_contenidos() {
		return (EReference) claseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClase_Operaciones_contenidas() {
		return (EReference) claseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClase_Implementaciones_contenidas() {
		return (EReference) claseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClase_Relaciones_contenidas() {
		return (EReference) claseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClasificador() {
		return clasificadorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClasificador_Nombre() {
		return (EAttribute) clasificadorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClasificador_Herencias_contenidas() {
		return (EReference) clasificadorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributo() {
		return atributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Nombre() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Visibilidad() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Tipo() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperacion() {
		return operacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_Nombre() {
		return (EAttribute) operacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_Visibilidad() {
		return (EAttribute) operacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_Retorno() {
		return (EAttribute) operacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHerencia() {
		return herenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHerencia_Origen() {
		return (EReference) herenciaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHerencia_Destino() {
		return (EReference) herenciaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementacion() {
		return implementacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementacion_Origen() {
		return (EReference) implementacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementacion_Destino() {
		return (EReference) implementacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelacion() {
		return relacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_Rol() {
		return (EAttribute) relacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_Origen() {
		return (EReference) relacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_Destino() {
		return (EReference) relacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_Tipo() {
		return (EAttribute) relacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_Multiplicidad() {
		return (EAttribute) relacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaquete() {
		return paqueteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaquete_Nombre() {
		return (EAttribute) paqueteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaquete_Clasificadores_contenidos() {
		return (EReference) paqueteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoVisibilidad() {
		return tipoVisibilidadEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoDato() {
		return tipoDatoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoRetorino() {
		return tipoRetorinoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoRelacion() {
		return tipoRelacionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplicidad() {
		return multiplicidadEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjemploDC4Factory getEjemploDC4Factory() {
		return (EjemploDC4Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		diagramaClasesEClass = createEClass(DIAGRAMA_CLASES);
		createEReference(diagramaClasesEClass, DIAGRAMA_CLASES__PAQUETES_CONTENIDOS);

		claseEClass = createEClass(CLASE);
		createEReference(claseEClass, CLASE__ATRIBUTOS_CONTENIDOS);
		createEReference(claseEClass, CLASE__OPERACIONES_CONTENIDAS);
		createEReference(claseEClass, CLASE__IMPLEMENTACIONES_CONTENIDAS);
		createEReference(claseEClass, CLASE__RELACIONES_CONTENIDAS);

		interfaceEClass = createEClass(INTERFACE);

		clasificadorEClass = createEClass(CLASIFICADOR);
		createEAttribute(clasificadorEClass, CLASIFICADOR__NOMBRE);
		createEReference(clasificadorEClass, CLASIFICADOR__HERENCIAS_CONTENIDAS);

		atributoEClass = createEClass(ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__NOMBRE);
		createEAttribute(atributoEClass, ATRIBUTO__VISIBILIDAD);
		createEAttribute(atributoEClass, ATRIBUTO__TIPO);

		operacionEClass = createEClass(OPERACION);
		createEAttribute(operacionEClass, OPERACION__NOMBRE);
		createEAttribute(operacionEClass, OPERACION__VISIBILIDAD);
		createEAttribute(operacionEClass, OPERACION__RETORNO);

		herenciaEClass = createEClass(HERENCIA);
		createEReference(herenciaEClass, HERENCIA__ORIGEN);
		createEReference(herenciaEClass, HERENCIA__DESTINO);

		implementacionEClass = createEClass(IMPLEMENTACION);
		createEReference(implementacionEClass, IMPLEMENTACION__ORIGEN);
		createEReference(implementacionEClass, IMPLEMENTACION__DESTINO);

		relacionEClass = createEClass(RELACION);
		createEAttribute(relacionEClass, RELACION__ROL);
		createEReference(relacionEClass, RELACION__ORIGEN);
		createEReference(relacionEClass, RELACION__DESTINO);
		createEAttribute(relacionEClass, RELACION__TIPO);
		createEAttribute(relacionEClass, RELACION__MULTIPLICIDAD);

		paqueteEClass = createEClass(PAQUETE);
		createEAttribute(paqueteEClass, PAQUETE__NOMBRE);
		createEReference(paqueteEClass, PAQUETE__CLASIFICADORES_CONTENIDOS);

		// Create enums
		tipoVisibilidadEEnum = createEEnum(TIPO_VISIBILIDAD);
		tipoDatoEEnum = createEEnum(TIPO_DATO);
		tipoRetorinoEEnum = createEEnum(TIPO_RETORINO);
		tipoRelacionEEnum = createEEnum(TIPO_RELACION);
		multiplicidadEEnum = createEEnum(MULTIPLICIDAD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		claseEClass.getESuperTypes().add(this.getClasificador());
		interfaceEClass.getESuperTypes().add(this.getClasificador());

		// Initialize classes, features, and operations; add parameters
		initEClass(diagramaClasesEClass, DiagramaClases.class, "DiagramaClases", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramaClases_Paquetes_contenidos(), this.getPaquete(), null, "paquetes_contenidos", null, 0,
				-1, DiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(claseEClass, Clase.class, "Clase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClase_Atributos_contenidos(), this.getAtributo(), null, "atributos_contenidos", null, 0, -1,
				Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClase_Operaciones_contenidas(), this.getOperacion(), null, "operaciones_contenidas", null, 0,
				-1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClase_Implementaciones_contenidas(), this.getImplementacion(), null,
				"implementaciones_contenidas", null, 0, -1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClase_Relaciones_contenidas(), this.getRelacion(), null, "relaciones_contenidas", null, 0, -1,
				Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(clasificadorEClass, Clasificador.class, "Clasificador", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClasificador_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Clasificador.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClasificador_Herencias_contenidas(), this.getHerencia(), null, "herencias_contenidas", null,
				0, -1, Clasificador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Atributo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_Visibilidad(), this.getTipoVisibilidad(), "visibilidad", null, 0, 1, Atributo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_Tipo(), this.getTipoDato(), "tipo", null, 0, 1, Atributo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operacionEClass, Operacion.class, "Operacion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperacion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Operacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperacion_Visibilidad(), this.getTipoVisibilidad(), "visibilidad", null, 0, 1,
				Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperacion_Retorno(), this.getTipoRetorino(), "retorno", null, 0, 1, Operacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(herenciaEClass, Herencia.class, "Herencia", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHerencia_Origen(), this.getClasificador(), null, "origen", null, 0, 1, Herencia.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHerencia_Destino(), this.getClasificador(), null, "destino", null, 0, 1, Herencia.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementacionEClass, Implementacion.class, "Implementacion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementacion_Origen(), this.getClase(), null, "origen", null, 0, 1, Implementacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementacion_Destino(), this.getInterface(), null, "destino", null, 0, 1,
				Implementacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relacionEClass, Relacion.class, "Relacion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelacion_Rol(), ecorePackage.getEString(), "rol", null, 0, 1, Relacion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacion_Origen(), this.getClase(), null, "origen", null, 0, 1, Relacion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRelacion_Destino(), this.getClasificador(), null, "destino", null, 0, 1, Relacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_Tipo(), this.getTipoRelacion(), "tipo", null, 0, 1, Relacion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_Multiplicidad(), this.getMultiplicidad(), "multiplicidad", null, 0, 1,
				Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(paqueteEClass, Paquete.class, "Paquete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaquete_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Paquete.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaquete_Clasificadores_contenidos(), this.getClasificador(), null,
				"clasificadores_contenidos", null, 0, -1, Paquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoVisibilidadEEnum, TipoVisibilidad.class, "TipoVisibilidad");
		addEEnumLiteral(tipoVisibilidadEEnum, TipoVisibilidad.PRIVATE);
		addEEnumLiteral(tipoVisibilidadEEnum, TipoVisibilidad.PUBLIC);
		addEEnumLiteral(tipoVisibilidadEEnum, TipoVisibilidad.PROTECTED);
		addEEnumLiteral(tipoVisibilidadEEnum, TipoVisibilidad.PACKAGE);

		initEEnum(tipoDatoEEnum, TipoDato.class, "TipoDato");
		addEEnumLiteral(tipoDatoEEnum, TipoDato.STRING);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.INT);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.DOUBLE);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.BOOLEAN);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.LONG);

		initEEnum(tipoRetorinoEEnum, TipoRetorino.class, "TipoRetorino");
		addEEnumLiteral(tipoRetorinoEEnum, TipoRetorino.VOID);
		addEEnumLiteral(tipoRetorinoEEnum, TipoRetorino.OBJECT);
		addEEnumLiteral(tipoRetorinoEEnum, TipoRetorino.INT);
		addEEnumLiteral(tipoRetorinoEEnum, TipoRetorino.STRING);
		addEEnumLiteral(tipoRetorinoEEnum, TipoRetorino.BOOLEAN);

		initEEnum(tipoRelacionEEnum, TipoRelacion.class, "TipoRelacion");
		addEEnumLiteral(tipoRelacionEEnum, TipoRelacion.UNIDIRECCIONAL);
		addEEnumLiteral(tipoRelacionEEnum, TipoRelacion.BIDIRECCIONAL);
		addEEnumLiteral(tipoRelacionEEnum, TipoRelacion.AGREGACION);
		addEEnumLiteral(tipoRelacionEEnum, TipoRelacion.COMPOSICION);

		initEEnum(multiplicidadEEnum, Multiplicidad.class, "Multiplicidad");
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad.ONE_TO_ONE);
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad.ONE_TO_MANY);
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad.MANY_TO_ONE);
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad.MANY_TO_MANY);

		// Create resource
		createResource(eNS_URI);
	}

} //EjemploDC4PackageImpl

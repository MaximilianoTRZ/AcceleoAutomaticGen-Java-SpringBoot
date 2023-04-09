/**
 */
package ejemploDC4.impl;

import ejemploDC4.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EjemploDC4FactoryImpl extends EFactoryImpl implements EjemploDC4Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EjemploDC4Factory init() {
		try {
			EjemploDC4Factory theEjemploDC4Factory = (EjemploDC4Factory) EPackage.Registry.INSTANCE
					.getEFactory(EjemploDC4Package.eNS_URI);
			if (theEjemploDC4Factory != null) {
				return theEjemploDC4Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EjemploDC4FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjemploDC4FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EjemploDC4Package.DIAGRAMA_CLASES:
			return createDiagramaClases();
		case EjemploDC4Package.CLASE:
			return createClase();
		case EjemploDC4Package.INTERFACE:
			return createInterface();
		case EjemploDC4Package.ATRIBUTO:
			return createAtributo();
		case EjemploDC4Package.OPERACION:
			return createOperacion();
		case EjemploDC4Package.HERENCIA:
			return createHerencia();
		case EjemploDC4Package.IMPLEMENTACION:
			return createImplementacion();
		case EjemploDC4Package.RELACION:
			return createRelacion();
		case EjemploDC4Package.PAQUETE:
			return createPaquete();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case EjemploDC4Package.TIPO_VISIBILIDAD:
			return createTipoVisibilidadFromString(eDataType, initialValue);
		case EjemploDC4Package.TIPO_DATO:
			return createTipoDatoFromString(eDataType, initialValue);
		case EjemploDC4Package.TIPO_RETORINO:
			return createTipoRetorinoFromString(eDataType, initialValue);
		case EjemploDC4Package.TIPO_RELACION:
			return createTipoRelacionFromString(eDataType, initialValue);
		case EjemploDC4Package.MULTIPLICIDAD:
			return createMultiplicidadFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case EjemploDC4Package.TIPO_VISIBILIDAD:
			return convertTipoVisibilidadToString(eDataType, instanceValue);
		case EjemploDC4Package.TIPO_DATO:
			return convertTipoDatoToString(eDataType, instanceValue);
		case EjemploDC4Package.TIPO_RETORINO:
			return convertTipoRetorinoToString(eDataType, instanceValue);
		case EjemploDC4Package.TIPO_RELACION:
			return convertTipoRelacionToString(eDataType, instanceValue);
		case EjemploDC4Package.MULTIPLICIDAD:
			return convertMultiplicidadToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramaClases createDiagramaClases() {
		DiagramaClasesImpl diagramaClases = new DiagramaClasesImpl();
		return diagramaClases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase createClase() {
		ClaseImpl clase = new ClaseImpl();
		return clase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo createAtributo() {
		AtributoImpl atributo = new AtributoImpl();
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operacion createOperacion() {
		OperacionImpl operacion = new OperacionImpl();
		return operacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herencia createHerencia() {
		HerenciaImpl herencia = new HerenciaImpl();
		return herencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementacion createImplementacion() {
		ImplementacionImpl implementacion = new ImplementacionImpl();
		return implementacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relacion createRelacion() {
		RelacionImpl relacion = new RelacionImpl();
		return relacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paquete createPaquete() {
		PaqueteImpl paquete = new PaqueteImpl();
		return paquete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoVisibilidad createTipoVisibilidadFromString(EDataType eDataType, String initialValue) {
		TipoVisibilidad result = TipoVisibilidad.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoVisibilidadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato createTipoDatoFromString(EDataType eDataType, String initialValue) {
		TipoDato result = TipoDato.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoDatoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoRetorino createTipoRetorinoFromString(EDataType eDataType, String initialValue) {
		TipoRetorino result = TipoRetorino.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoRetorinoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoRelacion createTipoRelacionFromString(EDataType eDataType, String initialValue) {
		TipoRelacion result = TipoRelacion.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoRelacionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicidad createMultiplicidadFromString(EDataType eDataType, String initialValue) {
		Multiplicidad result = Multiplicidad.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicidadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjemploDC4Package getEjemploDC4Package() {
		return (EjemploDC4Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EjemploDC4Package getPackage() {
		return EjemploDC4Package.eINSTANCE;
	}

} //EjemploDC4FactoryImpl

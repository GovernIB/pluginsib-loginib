package es.caib.loginib.frontend.model;

/**
 * Codigos error.
 *
 * @author Indra
 *
 */
public enum ErrorCodes {

	/** Error general. */
	ERROR_GENERAL("errorGeneral"),
	/** Clave autenticacion deshabilitado. */
	CLAVE_DESHABILITADO("clave.deshabilitado"),
	/** Clave autenticacion deshabilitado. */
	CLIENTCERT_DESHABILITADO("clientcert.deshabilitado");

	/**
	 * Valor como string.
	 */
	private final String stringValue;

	/**
	 * Constructor.
	 *
	 * @param value
	 *                  Valor como string.
	 */
	ErrorCodes(final String value) {
		stringValue = value;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return stringValue;
	}

	/**
	 * Método para From string de la clase ErrorCodes.
	 *
	 * @param text
	 *                 Parámetro text
	 * @return el type autenticacion
	 */
	public static ErrorCodes fromString(final String text) {
		ErrorCodes respuesta = null;
		if (text != null) {
			for (final ErrorCodes b : ErrorCodes.values()) {
				if (text.equalsIgnoreCase(b.toString())) {
					respuesta = b;
					break;
				}
			}

		}
		return respuesta;
	}

}

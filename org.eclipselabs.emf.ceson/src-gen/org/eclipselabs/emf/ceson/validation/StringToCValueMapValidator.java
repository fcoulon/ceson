/**
 *
 * $Id$
 */
package org.eclipselabs.emf.ceson.validation;

import org.eclipselabs.emf.ceson.CValue;

/**
 * A sample validator interface for {@link java.util.Map.Entry}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StringToCValueMapValidator {
	boolean validate();

	boolean validateTypedKey(String value);
	boolean validateTypedValue(CValue value);
}

/**
 *
 * $Id$
 */
package org.eclipselabs.emf.ceson.validation;

import org.eclipselabs.emf.ceson.CValue;

/**
 * A sample validator interface for {@link org.eclipselabs.emf.ceson.CFeature}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CFeatureValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateContainment(boolean value);
	boolean validateValue(CValue value);
}

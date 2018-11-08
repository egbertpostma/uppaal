/**
 * generated by Xtext 2.15.0
 */
package org.muml.uppaal;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.muml.uppaal.scoping.UppaalLazyLinker;
import org.muml.uppaal.scoping.UppaalQualifiedNameProvider;
import org.muml.uppaal.serializer.UppaalTransientValueService;
import org.muml.uppaal.valueconversion.UppaalValueConverter;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class UppaalXMLRuntimeModule extends AbstractUppaalXMLRuntimeModule {
  @Override
  public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
    return UppaalQualifiedNameProvider.class;
  }
  
  @Override
  public Class<? extends ILinker> bindILinker() {
    return UppaalLazyLinker.class;
  }
  
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return UppaalValueConverter.class;
  }
  
  @Override
  public Class<? extends ITransientValueService> bindITransientValueService() {
    return UppaalTransientValueService.class;
  }
}

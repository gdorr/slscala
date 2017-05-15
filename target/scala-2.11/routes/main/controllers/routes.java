
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/gdo/workspace/soclordsscala/conf/routes
// @DATE:Sun May 14 16:03:41 BST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLocalAuthorityController LocalAuthorityController = new controllers.ReverseLocalAuthorityController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLandlordsController LandlordsController = new controllers.ReverseLandlordsController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLocalAuthorityController LocalAuthorityController = new controllers.javascript.ReverseLocalAuthorityController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLandlordsController LandlordsController = new controllers.javascript.ReverseLandlordsController(RoutesPrefix.byNamePrefix());
  }

}

package io.vertx.ext.asyncsql

import io.vertx.core.json.JsonObject

/**
 * @author <a href="http://www.campudus.com">Joern Bernhardt</a>.
 */
trait ConfigProvider {
  def config: JsonObject = new JsonObject()
}

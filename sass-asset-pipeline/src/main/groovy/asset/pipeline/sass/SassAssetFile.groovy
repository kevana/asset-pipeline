/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package asset.pipeline.sass

import asset.pipeline.CacheManager
import asset.pipeline.AssetHelper
import asset.pipeline.AbstractAssetFile
import asset.pipeline.processors.CssProcessor
import java.util.regex.Pattern

class SassAssetFile extends AbstractAssetFile {
    static final String contentType = 'text/css'
    static extensions = ['sass','css.sass','css.scss', 'scss']
    static final String compiledExtension = 'css'
    static processors = [SassProcessor,CssProcessor]
    Pattern directivePattern = ~/(?m)\*=(.*)/
}

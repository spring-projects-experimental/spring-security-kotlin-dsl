/*
 * Copyright 2002-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.security.dsl.config.builders.server.headers

import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.header.ReferrerPolicyServerHttpHeadersWriter
import org.springframework.security.web.server.header.XFrameOptionsServerHttpHeadersWriter

/**
 * A Kotlin DSL to configure the [ServerHttpSecurity] referrer policy header using
 * idiomatic Kotlin code.
 *
 * @author Eleftheria Stein
 * @property policy the policy to be used in the response header.
 */
@Deprecated("Use Spring Security 5.4 or greater for a native Kotlin DSL.")
class ServerReferrerPolicyDsl {
    var policy: ReferrerPolicyServerHttpHeadersWriter.ReferrerPolicy? = null

    internal fun get(): (ServerHttpSecurity.HeaderSpec.ReferrerPolicySpec) -> Unit {
        return { referrerPolicy ->
            policy?.also {
                referrerPolicy.policy(policy)
            }
        }
    }
}

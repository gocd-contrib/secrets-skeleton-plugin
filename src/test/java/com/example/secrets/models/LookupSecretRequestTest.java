/*
 * Copyright 2019 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.secrets.models;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LookupSecretRequestTest {
    @Test
    void shouldDeserializeFromJson() {
        LookupSecretRequest lookupSecretRequest = LookupSecretRequest.fromJSON("{" +
                "\"configuration\": {" +
                "\"property\": \"some_property\" " +
                "   }," +
                "\"keys\": [\"key1\",\"key2\"]" +
                "}"
        );

        assertThat(lookupSecretRequest.getConfig().getProperty()).isEqualTo("some_property");
        assertThat(lookupSecretRequest.getKeys().size()).isEqualTo(2);
    }
}
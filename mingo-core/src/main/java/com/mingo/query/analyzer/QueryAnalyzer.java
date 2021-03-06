package com.mingo.query.analyzer;

import com.mingo.query.Query;
import com.mingo.query.QueryCase;

import java.util.Map;

/**
 * Copyright 2012-2013 The Mingo Team
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public interface QueryAnalyzer {

    /**
     * Gets a case whose condition is true for the given parameters. see {@link #evaluate}.
     *
     * @param query      the query {@link com.mingo.query.Query}
     * @param parameters the query parameters
     * @return the query case. null if not found any case which satisfied
     *         specified condition for current parameters.
     */
    QueryCase analyzeAndGet(Query query, Map<String, Object> parameters);

    /**
     * Evaluates the <code>expression</code> with the specified <code>parameters</code>.
     *
     * @param expression expression
     * @param parameters parameters
     * @return the result of this evaluation
     */
    boolean evaluate(String expression, Map<String, Object> parameters);

}

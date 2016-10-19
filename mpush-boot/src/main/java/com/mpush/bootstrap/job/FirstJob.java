/*
 * (C) Copyright 2015-2016 the original author or authors.
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
 *
 * Contributors:
 *     ohun@live.cn (夜色)
 */

package com.mpush.bootstrap.job;

import com.mpush.api.spi.core.ServerEventListenerFactory;
import com.mpush.tools.log.Logs;

/**
 * Created by ohun on 16/10/19.
 *
 * @author ohun@live.cn (夜色)
 */
/*package*/ final class FirstJob extends BootJob {

    public FirstJob() {
        ServerEventListenerFactory.create();
    }

    @Override
    public void start() {
        Logs.Console.info("begin start bootstrap chain...");
        startNext();
    }

    @Override
    protected void stop() {
        Logs.Console.info("begin stop bootstrap chain...");
        stopNext();
    }
}
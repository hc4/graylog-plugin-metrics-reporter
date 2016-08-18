/**
 * This file is part of Graylog Metrics Reporter Plugin.
 *
 * Graylog Metrics Reporter Plugin is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Graylog Metrics Reporter Plugin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Graylog Metrics Reporter Plugin.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.graylog.plugins.metrics.shared;

import com.codahale.metrics.Metric;
import com.codahale.metrics.MetricFilter;

public class UserMetricFilter implements MetricFilter {

    @Override
    public boolean matches(String name, Metric metric) {
        // TEST ONLY. TODO actually implement
        return name.equals("org.graylog2.rest.resources.tools.RegexTesterResource.regexTester");
    }

}
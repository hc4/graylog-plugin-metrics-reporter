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
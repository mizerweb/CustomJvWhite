package org.apache.http.conn.params;

import defpackage.ore;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.conn.routing.HttpRoute;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class ConnPerRouteBean implements ConnPerRoute {
    public static final int DEFAULT_MAX_CONNECTIONS_PER_ROUTE = 2;
    private int defaultMax;
    private final Map<HttpRoute, Integer> maxPerHostMap;

    public ConnPerRouteBean(int i) {
        this.maxPerHostMap = new HashMap();
        setDefaultMaxPerRoute(i);
    }

    public int getDefaultMax() {
        return this.defaultMax;
    }

    @Override // org.apache.http.conn.params.ConnPerRoute
    public int getMaxForRoute(HttpRoute httpRoute) {
        if (httpRoute != null) {
            Integer num = this.maxPerHostMap.get(httpRoute);
            return num != null ? num.intValue() : this.defaultMax;
        }
        ore.p("HTTP route may not be null.");
        return 0;
    }

    public void setDefaultMaxPerRoute(int i) {
        if (i >= 1) {
            this.defaultMax = i;
        } else {
            ore.p("The maximum must be greater than 0.");
        }
    }

    public void setMaxForRoute(HttpRoute httpRoute, int i) {
        if (httpRoute == null) {
            ore.p("HTTP route may not be null.");
        } else if (i >= 1) {
            this.maxPerHostMap.put(httpRoute, Integer.valueOf(i));
        } else {
            ore.p("The maximum must be greater than 0.");
        }
    }

    public void setMaxForRoutes(Map<HttpRoute, Integer> map) {
        if (map == null) {
            return;
        }
        this.maxPerHostMap.clear();
        this.maxPerHostMap.putAll(map);
    }

    public ConnPerRouteBean() {
        this(2);
    }
}

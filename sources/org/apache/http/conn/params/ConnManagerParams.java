package org.apache.http.conn.params;

import defpackage.ore;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class ConnManagerParams implements ConnManagerPNames {
    private static final ConnPerRoute DEFAULT_CONN_PER_ROUTE = new ConnPerRoute() { // from class: org.apache.http.conn.params.ConnManagerParams.1
        @Override // org.apache.http.conn.params.ConnPerRoute
        public int getMaxForRoute(HttpRoute httpRoute) {
            return 2;
        }
    };
    public static final int DEFAULT_MAX_TOTAL_CONNECTIONS = 20;

    public static ConnPerRoute getMaxConnectionsPerRoute(HttpParams httpParams) {
        if (httpParams != null) {
            ConnPerRoute connPerRoute = (ConnPerRoute) httpParams.getParameter(ConnManagerPNames.MAX_CONNECTIONS_PER_ROUTE);
            return connPerRoute == null ? DEFAULT_CONN_PER_ROUTE : connPerRoute;
        }
        ore.p("HTTP parameters must not be null.");
        return null;
    }

    public static int getMaxTotalConnections(HttpParams httpParams) {
        if (httpParams != null) {
            return httpParams.getIntParameter(ConnManagerPNames.MAX_TOTAL_CONNECTIONS, 20);
        }
        ore.p("HTTP parameters must not be null.");
        return 0;
    }

    public static long getTimeout(HttpParams httpParams) {
        if (httpParams != null) {
            return httpParams.getLongParameter(ConnManagerPNames.TIMEOUT, 0L);
        }
        ore.p("HTTP parameters may not be null");
        return 0L;
    }

    public static void setMaxConnectionsPerRoute(HttpParams httpParams, ConnPerRoute connPerRoute) {
        if (httpParams != null) {
            httpParams.setParameter(ConnManagerPNames.MAX_CONNECTIONS_PER_ROUTE, connPerRoute);
        } else {
            ore.p("HTTP parameters must not be null.");
        }
    }

    public static void setMaxTotalConnections(HttpParams httpParams, int i) {
        if (httpParams != null) {
            httpParams.setIntParameter(ConnManagerPNames.MAX_TOTAL_CONNECTIONS, i);
        } else {
            ore.p("HTTP parameters must not be null.");
        }
    }

    public static void setTimeout(HttpParams httpParams, long j) {
        if (httpParams != null) {
            httpParams.setLongParameter(ConnManagerPNames.TIMEOUT, j);
        } else {
            ore.p("HTTP parameters may not be null");
        }
    }
}

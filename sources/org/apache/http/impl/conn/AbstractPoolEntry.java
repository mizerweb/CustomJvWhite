package org.apache.http.impl.conn;

import defpackage.ore;
import defpackage.qr7;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class AbstractPoolEntry {
    protected final ClientConnectionOperator connOperator;
    protected final OperatedClientConnection connection;
    protected volatile HttpRoute route;
    protected volatile Object state;
    protected volatile RouteTracker tracker;

    public AbstractPoolEntry(ClientConnectionOperator clientConnectionOperator, HttpRoute httpRoute) {
        if (clientConnectionOperator == null) {
            ore.p("Connection operator may not be null");
            throw null;
        }
        this.connOperator = clientConnectionOperator;
        this.connection = clientConnectionOperator.createConnection();
        this.route = httpRoute;
        this.tracker = null;
    }

    public Object getState() {
        return this.state;
    }

    public void layerProtocol(HttpContext httpContext, HttpParams httpParams) throws IOException {
        if (httpParams == null) {
            ore.p("Parameters must not be null.");
            return;
        }
        if (this.tracker == null || !this.tracker.isConnected()) {
            ore.k("Connection not open.");
            return;
        }
        if (!this.tracker.isTunnelled()) {
            ore.k("Protocol layering without a tunnel not supported.");
        } else {
            if (this.tracker.isLayered()) {
                ore.k("Multiple protocol layering not supported.");
                return;
            }
            this.connOperator.updateSecureConnection(this.connection, this.tracker.getTargetHost(), httpContext, httpParams);
            this.tracker.layerProtocol(this.connection.isSecure());
        }
    }

    public void open(HttpRoute httpRoute, HttpContext httpContext, HttpParams httpParams) throws IOException {
        if (httpRoute == null) {
            ore.p("Route must not be null.");
            return;
        }
        if (httpParams == null) {
            ore.p("Parameters must not be null.");
            return;
        }
        if (this.tracker != null && this.tracker.isConnected()) {
            ore.k("Connection already open.");
            return;
        }
        this.tracker = new RouteTracker(httpRoute);
        HttpHost proxyHost = httpRoute.getProxyHost();
        this.connOperator.openConnection(this.connection, proxyHost != null ? proxyHost : httpRoute.getTargetHost(), httpRoute.getLocalAddress(), httpContext, httpParams);
        RouteTracker routeTracker = this.tracker;
        if (routeTracker == null) {
            qr7.k("Request aborted");
            return;
        }
        OperatedClientConnection operatedClientConnection = this.connection;
        if (proxyHost == null) {
            routeTracker.connectTarget(operatedClientConnection.isSecure());
        } else {
            routeTracker.connectProxy(proxyHost, operatedClientConnection.isSecure());
        }
    }

    public void setState(Object obj) {
        this.state = obj;
    }

    public void shutdownEntry() {
        this.tracker = null;
    }

    public void tunnelProxy(HttpHost httpHost, boolean z, HttpParams httpParams) throws IOException {
        if (httpHost == null) {
            ore.p("Next proxy must not be null.");
            return;
        }
        if (httpParams == null) {
            ore.p("Parameters must not be null.");
        } else if (this.tracker == null || !this.tracker.isConnected()) {
            ore.k("Connection not open.");
        } else {
            this.connection.update(null, httpHost, z, httpParams);
            this.tracker.tunnelProxy(httpHost, z);
        }
    }

    public void tunnelTarget(boolean z, HttpParams httpParams) throws IOException {
        if (httpParams == null) {
            ore.p("Parameters must not be null.");
            return;
        }
        if (this.tracker == null || !this.tracker.isConnected()) {
            ore.k("Connection not open.");
        } else if (this.tracker.isTunnelled()) {
            ore.k("Connection is already tunnelled.");
        } else {
            this.connection.update(null, this.tracker.getTargetHost(), z, httpParams);
            this.tracker.tunnelTarget(z);
        }
    }
}

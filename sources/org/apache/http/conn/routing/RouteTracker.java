package org.apache.http.conn.routing;

import defpackage.nbh;
import defpackage.ore;
import defpackage.zo5;
import java.net.InetAddress;
import org.apache.http.HttpHost;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class RouteTracker implements RouteInfo, Cloneable {
    private boolean connected;
    private RouteInfo.LayerType layered;
    private final InetAddress localAddress;
    private HttpHost[] proxyChain;
    private boolean secure;
    private final HttpHost targetHost;
    private RouteInfo.TunnelType tunnelled;

    public RouteTracker(HttpHost httpHost, InetAddress inetAddress) {
        if (httpHost == null) {
            ore.p("Target host may not be null.");
            throw null;
        }
        this.targetHost = httpHost;
        this.localAddress = inetAddress;
        this.tunnelled = RouteInfo.TunnelType.PLAIN;
        this.layered = RouteInfo.LayerType.PLAIN;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final void connectProxy(HttpHost httpHost, boolean z) {
        if (httpHost == null) {
            ore.p("Proxy host may not be null.");
        } else {
            if (this.connected) {
                ore.k("Already connected.");
                return;
            }
            this.connected = true;
            this.proxyChain = new HttpHost[]{httpHost};
            this.secure = z;
        }
    }

    public final void connectTarget(boolean z) {
        if (this.connected) {
            ore.k("Already connected.");
        } else {
            this.connected = true;
            this.secure = z;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        int i = 0;
        if (!(obj instanceof RouteTracker)) {
            return false;
        }
        RouteTracker routeTracker = (RouteTracker) obj;
        boolean zEquals = this.targetHost.equals(routeTracker.targetHost);
        InetAddress inetAddress = this.localAddress;
        InetAddress inetAddress2 = routeTracker.localAddress;
        boolean z = zEquals & (inetAddress == inetAddress2 || (inetAddress != null && inetAddress.equals(inetAddress2)));
        HttpHost[] httpHostArr = this.proxyChain;
        HttpHost[] httpHostArr2 = routeTracker.proxyChain;
        boolean zEquals2 = (this.connected == routeTracker.connected && this.secure == routeTracker.secure && this.tunnelled == routeTracker.tunnelled && this.layered == routeTracker.layered) & z & (httpHostArr == httpHostArr2 || !(httpHostArr == null || httpHostArr2 == null || httpHostArr.length != httpHostArr2.length));
        if (zEquals2 && httpHostArr != null) {
            while (zEquals2) {
                HttpHost[] httpHostArr3 = this.proxyChain;
                if (i >= httpHostArr3.length) {
                    break;
                }
                zEquals2 = httpHostArr3[i].equals(routeTracker.proxyChain[i]);
                i++;
            }
        }
        return zEquals2;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final int getHopCount() {
        if (!this.connected) {
            return 0;
        }
        HttpHost[] httpHostArr = this.proxyChain;
        if (httpHostArr == null) {
            return 1;
        }
        return httpHostArr.length + 1;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final HttpHost getHopTarget(int i) {
        if (i < 0) {
            ore.p(zo5.h(i, "Hop index must not be negative: "));
            return null;
        }
        int hopCount = getHopCount();
        if (i < hopCount) {
            return i < hopCount + (-1) ? this.proxyChain[i] : this.targetHost;
        }
        ore.p(nbh.u("Hop index ", i, " exceeds tracked route length ", hopCount, "."));
        return null;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final RouteInfo.LayerType getLayerType() {
        return this.layered;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final InetAddress getLocalAddress() {
        return this.localAddress;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final HttpHost getProxyHost() {
        HttpHost[] httpHostArr = this.proxyChain;
        if (httpHostArr == null) {
            return null;
        }
        return httpHostArr[0];
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final HttpHost getTargetHost() {
        return this.targetHost;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final RouteInfo.TunnelType getTunnelType() {
        return this.tunnelled;
    }

    public final int hashCode() {
        int iHashCode = this.targetHost.hashCode();
        InetAddress inetAddress = this.localAddress;
        if (inetAddress != null) {
            iHashCode ^= inetAddress.hashCode();
        }
        HttpHost[] httpHostArr = this.proxyChain;
        if (httpHostArr != null) {
            iHashCode ^= httpHostArr.length;
            int i = 0;
            while (true) {
                HttpHost[] httpHostArr2 = this.proxyChain;
                if (i >= httpHostArr2.length) {
                    break;
                }
                iHashCode ^= httpHostArr2[i].hashCode();
                i++;
            }
        }
        if (this.connected) {
            iHashCode ^= 286331153;
        }
        if (this.secure) {
            iHashCode ^= 572662306;
        }
        return this.layered.hashCode() ^ (iHashCode ^ this.tunnelled.hashCode());
    }

    public final boolean isConnected() {
        return this.connected;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final boolean isLayered() {
        return this.layered == RouteInfo.LayerType.LAYERED;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final boolean isSecure() {
        return this.secure;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final boolean isTunnelled() {
        return this.tunnelled == RouteInfo.TunnelType.TUNNELLED;
    }

    public final void layerProtocol(boolean z) {
        if (!this.connected) {
            ore.k("No layered protocol unless connected.");
        } else {
            this.layered = RouteInfo.LayerType.LAYERED;
            this.secure = z;
        }
    }

    public final HttpRoute toRoute() {
        if (this.connected) {
            return new HttpRoute(this.targetHost, this.localAddress, this.proxyChain, this.secure, this.tunnelled, this.layered);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getHopCount() * 30) + 50);
        sb.append("RouteTracker[");
        InetAddress inetAddress = this.localAddress;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.connected) {
            sb.append('c');
        }
        if (this.tunnelled == RouteInfo.TunnelType.TUNNELLED) {
            sb.append('t');
        }
        if (this.layered == RouteInfo.LayerType.LAYERED) {
            sb.append('l');
        }
        if (this.secure) {
            sb.append('s');
        }
        sb.append("}->");
        if (this.proxyChain != null) {
            int i = 0;
            while (true) {
                HttpHost[] httpHostArr = this.proxyChain;
                if (i >= httpHostArr.length) {
                    break;
                }
                sb.append(httpHostArr[i]);
                sb.append("->");
                i++;
            }
        }
        sb.append(this.targetHost);
        sb.append(']');
        return sb.toString();
    }

    public final void tunnelProxy(HttpHost httpHost, boolean z) {
        if (httpHost == null) {
            ore.p("Proxy host may not be null.");
            return;
        }
        if (!this.connected) {
            ore.k("No tunnel unless connected.");
            return;
        }
        HttpHost[] httpHostArr = this.proxyChain;
        if (httpHostArr == null) {
            ore.k("No proxy tunnel without proxy.");
            return;
        }
        int length = httpHostArr.length;
        HttpHost[] httpHostArr2 = new HttpHost[length + 1];
        System.arraycopy(httpHostArr, 0, httpHostArr2, 0, httpHostArr.length);
        httpHostArr2[length] = httpHost;
        this.proxyChain = httpHostArr2;
        this.secure = z;
    }

    public final void tunnelTarget(boolean z) {
        if (!this.connected) {
            ore.k("No tunnel unless connected.");
        } else if (this.proxyChain == null) {
            ore.k("No tunnel without proxy.");
        } else {
            this.tunnelled = RouteInfo.TunnelType.TUNNELLED;
            this.secure = z;
        }
    }

    public RouteTracker(HttpRoute httpRoute) {
        this(httpRoute.getTargetHost(), httpRoute.getLocalAddress());
    }
}

package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class fve {
    public final ec a;
    public final Proxy b;
    public final InetSocketAddress c;

    public fve(ec ecVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.a = ecVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fve)) {
            return false;
        }
        fve fveVar = (fve) obj;
        return fveVar.a.equals(this.a) && fveVar.b.equals(this.b) && cqk.d(fveVar.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}

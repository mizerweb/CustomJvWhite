package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpHost;

/* JADX INFO: loaded from: classes.dex */
public final class ec {
    public final j85 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final uo2 e;
    public final gp0 f;
    public final ProxySelector g;
    public final k28 h;
    public final List i;
    public final List j;

    public ec(String str, int i, j85 j85Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, uo2 uo2Var, gp0 gp0Var, List list, List list2, ProxySelector proxySelector) {
        this.a = j85Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = uo2Var;
        this.f = gp0Var;
        this.g = proxySelector;
        t84 t84Var = new t84();
        String str2 = sSLSocketFactory != null ? "https" : HttpHost.DEFAULT_SCHEME_NAME;
        if (str2.equalsIgnoreCase(HttpHost.DEFAULT_SCHEME_NAME)) {
            t84Var.e = HttpHost.DEFAULT_SCHEME_NAME;
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                ore.p("unexpected scheme: ".concat(str2));
                throw null;
            }
            t84Var.e = "https";
        }
        t84Var.l(str);
        if (1 > i || i >= 65536) {
            c.o(zo5.h(i, "unexpected port: "));
            throw null;
        }
        t84Var.b = i;
        this.h = t84Var.c();
        this.i = uqi.x(list);
        this.j = uqi.x(list2);
    }

    public final boolean a(ec ecVar) {
        return cqk.d(this.a, ecVar.a) && cqk.d(this.f, ecVar.f) && cqk.d(this.i, ecVar.i) && cqk.d(this.j, ecVar.j) && cqk.d(this.g, ecVar.g) && cqk.d(this.c, ecVar.c) && cqk.d(this.d, ecVar.d) && cqk.d(this.e, ecVar.e) && this.h.e == ecVar.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ec)) {
            return false;
        }
        ec ecVar = (ec) obj;
        return cqk.d(this.h, ecVar.h) && a(ecVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + qv1.c(qv1.c((this.f.hashCode() + ((this.a.hashCode() + zo5.d(527, 31, this.h.h)) * 31)) * 31, 31, this.i), 31, this.j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        k28 k28Var = this.h;
        sb.append(k28Var.d);
        sb.append(':');
        sb.append(k28Var.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}

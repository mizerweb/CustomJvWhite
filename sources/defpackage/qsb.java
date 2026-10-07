package defpackage;

import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class qsb implements Cloneable {
    public static final List A = uqi.l(twd.HTTP_2, twd.HTTP_1_1);
    public static final List B = uqi.l(ne4.e, ne4.f);
    public final gvb a;
    public final t3a b;
    public final List c;
    public final List d;
    public final gve e;
    public final boolean f;
    public final gp0 g;
    public final boolean h;
    public final boolean i;
    public final lhb j;
    public final j85 k;
    public final ProxySelector l;
    public final gp0 m;
    public final SocketFactory n;
    public final SSLSocketFactory o;
    public final X509TrustManager p;
    public final List q;
    public final List r;
    public final HostnameVerifier s;
    public final uo2 t;
    public final rx8 u;
    public final int v;
    public final int w;
    public final int x;
    public final long y;
    public final w4 z;

    public qsb(psb psbVar) throws NoSuchAlgorithmException, KeyStoreException {
        this.a = psbVar.a;
        this.b = psbVar.b;
        this.c = uqi.x(psbVar.c);
        this.d = uqi.x(psbVar.d);
        this.e = psbVar.e;
        this.f = psbVar.f;
        this.g = psbVar.g;
        this.h = psbVar.h;
        this.i = psbVar.i;
        this.j = psbVar.j;
        this.k = psbVar.k;
        ProxySelector proxySelector = psbVar.l;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.l = proxySelector == null ? hpb.a : proxySelector;
        this.m = psbVar.m;
        this.n = psbVar.n;
        List list = psbVar.q;
        this.q = list;
        this.r = psbVar.r;
        this.s = psbVar.s;
        this.v = psbVar.v;
        this.w = psbVar.w;
        this.x = psbVar.x;
        this.y = psbVar.y;
        w4 w4Var = psbVar.z;
        this.z = w4Var == null ? new w4(19, false) : w4Var;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.o = null;
                    this.u = null;
                    this.p = null;
                    this.t = uo2.c;
                    break;
                }
                if (((ne4) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = psbVar.o;
                    if (sSLSocketFactory == null) {
                        i2d i2dVar = i2d.a;
                        X509TrustManager x509TrustManagerM = i2d.a.m();
                        this.p = x509TrustManagerM;
                        this.o = i2d.a.l(x509TrustManagerM);
                        rx8 rx8VarB = i2d.a.b(x509TrustManagerM);
                        this.u = rx8VarB;
                        uo2 uo2Var = psbVar.t;
                        this.t = cqk.d(uo2Var.b, rx8VarB) ? uo2Var : new uo2(uo2Var.a, rx8VarB);
                        break;
                    }
                    this.o = sSLSocketFactory;
                    rx8 rx8Var = psbVar.u;
                    this.u = rx8Var;
                    this.p = psbVar.p;
                    uo2 uo2Var2 = psbVar.t;
                    this.t = cqk.d(uo2Var2.b, rx8Var) ? uo2Var2 : new uo2(uo2Var2.a, rx8Var);
                    break;
                }
            }
        } else {
            this.o = null;
            this.u = null;
            this.p = null;
            this.t = uo2.c;
            break;
        }
        X509TrustManager x509TrustManager = this.p;
        rx8 rx8Var2 = this.u;
        SSLSocketFactory sSLSocketFactory2 = this.o;
        List list3 = this.d;
        List list4 = this.c;
        if (list4.contains(null)) {
            qr7.r(list4, "Null interceptor: ");
            throw null;
        }
        if (list3.contains(null)) {
            qr7.r(list3, "Null network interceptor: ");
            throw null;
        }
        List list5 = this.q;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((ne4) it2.next()).a) {
                    if (sSLSocketFactory2 == null) {
                        ore.k("sslSocketFactory == null");
                        throw null;
                    }
                    if (rx8Var2 == null) {
                        ore.k("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager != null) {
                        return;
                    }
                    ore.k("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            ore.k("Check failed.");
            throw null;
        }
        if (rx8Var2 != null) {
            ore.k("Check failed.");
            throw null;
        }
        if (x509TrustManager != null) {
            ore.k("Check failed.");
            throw null;
        }
        if (cqk.d(this.t, uo2.c)) {
            return;
        }
        ore.k("Check failed.");
        throw null;
    }

    public final psb a() {
        psb psbVar = new psb();
        psbVar.a = this.a;
        psbVar.b = this.b;
        cx3.Z0(this.c, psbVar.c);
        cx3.Z0(this.d, psbVar.d);
        psbVar.e = this.e;
        psbVar.f = this.f;
        psbVar.g = this.g;
        psbVar.h = this.h;
        psbVar.i = this.i;
        psbVar.j = this.j;
        psbVar.k = this.k;
        psbVar.l = this.l;
        psbVar.m = this.m;
        psbVar.n = this.n;
        psbVar.o = this.o;
        psbVar.p = this.p;
        psbVar.q = this.q;
        psbVar.r = this.r;
        psbVar.s = this.s;
        psbVar.t = this.t;
        psbVar.u = this.u;
        psbVar.v = this.v;
        psbVar.w = this.w;
        psbVar.x = this.x;
        psbVar.y = this.y;
        psbVar.z = this.z;
        return psbVar;
    }

    public final y8e b(dle dleVar) {
        return new y8e(this, dleVar, false);
    }

    public final Object clone() {
        return super.clone();
    }
}

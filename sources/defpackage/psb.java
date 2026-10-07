package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class psb {
    public gvb a = new gvb(7);
    public t3a b = new t3a(5);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public gve e = new gve(lc6.a);
    public boolean f = true;
    public gp0 g;
    public boolean h;
    public boolean i;
    public lhb j;
    public j85 k;
    public ProxySelector l;
    public gp0 m;
    public SocketFactory n;
    public SSLSocketFactory o;
    public X509TrustManager p;
    public List q;
    public List r;
    public HostnameVerifier s;
    public uo2 t;
    public rx8 u;
    public int v;
    public int w;
    public int x;
    public long y;
    public w4 z;

    public psb() {
        gp0 gp0Var = gp0.d;
        this.g = gp0Var;
        this.h = true;
        this.i = true;
        this.j = lhb.f;
        this.k = j85.g;
        this.m = gp0Var;
        this.n = SocketFactory.getDefault();
        this.q = qsb.B;
        this.r = qsb.A;
        this.s = osb.a;
        this.t = uo2.c;
        this.v = 10000;
        this.w = 10000;
        this.x = 10000;
        this.y = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public final void a(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        if (!sSLSocketFactory.equals(this.o) || !x509TrustManager.equals(this.p)) {
            this.z = null;
        }
        this.o = sSLSocketFactory;
        i2d i2dVar = i2d.a;
        this.u = i2d.a.b(x509TrustManager);
        this.p = x509TrustManager;
    }
}

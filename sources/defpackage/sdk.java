package defpackage;

import java.io.IOException;
import java.io.PushbackInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import one.video.calls.sdk_private.dF;
import one.video.calls.sdk_private.dj;

/* JADX INFO: loaded from: classes3.dex */
public final class sdk {
    public volatile int d;
    public final String f;
    public final int g;
    public final x70 h;
    public final long i;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ReentrantLock b = new ReentrantLock();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public volatile long e = -1;

    public sdk(URI uri, String str, dek dekVar) throws IOException {
        String host = uri.getHost();
        this.f = host;
        int port = uri.getPort();
        this.g = port;
        try {
            URI uri2 = new URI("https://" + host + ":" + port);
            new HashMap();
            Optional.empty();
            phf phfVar = dekVar.g;
            phfVar.getClass();
            int port2 = uri2.getPort();
            port2 = port2 <= 0 ? 443 : port2;
            String host2 = uri2.getHost();
            lek lekVar = new lek();
            lekVar.a = host2;
            lekVar.b = str;
            lekVar.c = port2;
            try {
                x70 x70VarD = phfVar.d(lekVar);
                ((ConcurrentHashMap) phfVar.c).put(lekVar, x70VarD);
                this.h = x70VarD;
                if (((List) x70VarD.h).contains(350866729L)) {
                    throw new IllegalArgumentException("Cannot overwrite internal settings parameter");
                }
                ((HashMap) x70VarD.e).put(350866729L, 1L);
                synchronized (x70VarD) {
                    try {
                        if (((z7k) x70VarD.b).p != 3) {
                            ((z7k) x70VarD.b).o();
                        }
                        if (!x70VarD.a) {
                            x70VarD.g();
                            x70VarD.a = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.i = ((Long) x70VarD.d(350866729L).orElse(1L)).longValue();
                ((HashMap) x70VarD.c).put(84L, new rdk(this, 0));
                x70VarD.j = new rdk(this, 1);
            } catch (RuntimeException e) {
                if (!(e.getCause() instanceof IOException)) {
                    throw e;
                }
                throw ((IOException) e.getCause());
            }
        } catch (URISyntaxException unused) {
            qr7.k(qv1.k("Invalid server URI: ", this.f));
            throw null;
        }
    }

    public final xdk a(URI uri) throws dj {
        t81 t81Var = new t81(10);
        t81 t81Var2 = new t81(10);
        if (!this.f.equals(uri.getHost()) || this.g != uri.getPort()) {
            ore.p("WebTransport URI must have the same host and port as the server URI used with the constructor");
            return null;
        }
        long size = this.a.size();
        long j = this.i;
        if (size >= j) {
            ore.k(nbh.s(j, "Maximum number of sessions (", ") reached"));
            return null;
        }
        try {
            new HashMap();
            Optional.empty();
            eth ethVar = new eth();
            ethVar.a = uri;
            oek oekVarB = this.h.b(ethVar, Duration.ofSeconds(5L));
            kr6 kr6Var = new kr6();
            kr6Var.a = oekVarB;
            kr6Var.b = new HashMap();
            kr6Var.c = new PushbackInputStream(oekVarB.c, 8);
            yr8.e(Collections.EMPTY_MAP, new ydk(0));
            uri.getAuthority();
            uri.getPath();
            if (uri.getQuery() != null) {
                uri.getQuery();
            }
            xdk xdkVar = new xdk(this.h, kr6Var, t81Var, t81Var2, this);
            this.b.lock();
            try {
                this.e = xdkVar.c;
                this.a.put(Long.valueOf(xdkVar.c), xdkVar);
                return xdkVar;
            } finally {
                this.b.unlock();
            }
        } catch (InterruptedException unused) {
            throw new dj("HTTP CONNECT request was interrupted");
        }
    }

    public final void b(long j, hek hekVar) {
        this.b.lock();
        try {
            xdk xdkVar = (xdk) this.a.get(Long.valueOf(j));
            if (xdkVar != null && xdkVar.e == wdk.b) {
                xdkVar.b(hekVar);
            } else if (xdkVar == null && j <= this.e) {
                hekVar.a(386759528L);
                if (hekVar.e()) {
                    hekVar.b(386759528L);
                }
            } else {
                if (this.d >= 3) {
                    throw new dF();
                }
                ((List) this.c.computeIfAbsent(Long.valueOf(j), new lbk(11))).add(hekVar);
                this.d++;
            }
            this.b.unlock();
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    public final void c(xdk xdkVar) {
        long j = xdkVar.c;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.a.remove(Long.valueOf(j));
            this.c.remove(Long.valueOf(j));
        } finally {
            reentrantLock.unlock();
        }
    }
}

package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import org.apache.http.protocol.HTTP;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class x08 implements jd6 {
    public static final List g = uqi.l("connection", CandidateTypeHintConfig.TYPE_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = uqi.l("connection", CandidateTypeHintConfig.TYPE_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final c9e a;
    public final f9e b;
    public final w08 c;
    public volatile d18 d;
    public final twd e;
    public volatile boolean f;

    public x08(qsb qsbVar, c9e c9eVar, f9e f9eVar, w08 w08Var) {
        this.a = c9eVar;
        this.b = f9eVar;
        this.c = w08Var;
        List list = qsbVar.r;
        twd twdVar = twd.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(twdVar) ? twdVar : twd.HTTP_2;
    }

    @Override // defpackage.jd6
    public final void a(dle dleVar) throws IOException {
        int i;
        d18 d18Var;
        boolean z;
        if (this.d != null) {
            return;
        }
        boolean z2 = dleVar.d != null;
        hu7 hu7Var = dleVar.c;
        ArrayList arrayList = new ArrayList(hu7Var.size() + 4);
        arrayList.add(new bu7(bu7.f, dleVar.b));
        d71 d71Var = bu7.g;
        k28 k28Var = dleVar.a;
        String strB = k28Var.b();
        String strD = k28Var.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new bu7(d71Var, strB));
        String strA = hu7Var.a(HTTP.TARGET_HOST);
        if (strA != null) {
            arrayList.add(new bu7(bu7.i, strA));
        }
        arrayList.add(new bu7(bu7.h, k28Var.a));
        int size = hu7Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String lowerCase = hu7Var.b(i2).toLowerCase(Locale.US);
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && cqk.d(hu7Var.f(i2), "trailers"))) {
                arrayList.add(new bu7(lowerCase, hu7Var.f(i2)));
            }
        }
        w08 w08Var = this.c;
        boolean z3 = !z2;
        synchronized (w08Var.w) {
            synchronized (w08Var) {
                try {
                    if (w08Var.e > 1073741823) {
                        w08Var.A(8);
                    }
                    if (w08Var.f) {
                        throw new ConnectionShutdownException();
                    }
                    i = w08Var.e;
                    w08Var.e = i + 2;
                    d18Var = new d18(i, w08Var, z3, false, null);
                    z = !z2 || w08Var.t >= w08Var.u || d18Var.e >= d18Var.f;
                    if (d18Var.h()) {
                        w08Var.b.put(Integer.valueOf(i), d18Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            w08Var.w.A(i, arrayList, z3);
        }
        if (z) {
            w08Var.w.flush();
        }
        this.d = d18Var;
        boolean z4 = this.f;
        d18 d18Var2 = this.d;
        if (z4) {
            d18Var2.e(9);
            qr7.k("Canceled");
            return;
        }
        c18 c18Var = d18Var2.k;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c18Var.g(j, timeUnit);
        this.d.l.g(this.b.h, timeUnit);
    }

    @Override // defpackage.jd6
    public final void b() throws SocketTimeoutException {
        this.d.f().close();
    }

    @Override // defpackage.jd6
    public final kag c(dle dleVar, long j) {
        return this.d.f();
    }

    @Override // defpackage.jd6
    public final void cancel() {
        this.f = true;
        d18 d18Var = this.d;
        if (d18Var != null) {
            d18Var.e(9);
        }
    }

    @Override // defpackage.jd6
    public final c9e d() {
        return this.a;
    }

    @Override // defpackage.jd6
    public final mdg e(pne pneVar) {
        return this.d.i;
    }

    @Override // defpackage.jd6
    public final long f(pne pneVar) {
        if (t18.a(pneVar)) {
            return uqi.k(pneVar);
        }
        return 0L;
    }

    @Override // defpackage.jd6
    public final one g(boolean z) throws IOException {
        hu7 hu7Var;
        d18 d18Var = this.d;
        if (d18Var == null) {
            qr7.k("stream wasn't created");
            return null;
        }
        synchronized (d18Var) {
            d18Var.k.i();
            while (d18Var.g.isEmpty() && d18Var.m == 0) {
                try {
                    try {
                        d18Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    d18Var.k.l();
                    throw th;
                }
            }
            d18Var.k.l();
            if (d18Var.g.isEmpty()) {
                IOException iOException = d18Var.n;
                if (iOException != null) {
                    throw iOException;
                }
                throw new StreamResetException(d18Var.m);
            }
            hu7Var = (hu7) d18Var.g.removeFirst();
        }
        twd twdVar = this.e;
        ArrayList arrayList = new ArrayList(20);
        int size = hu7Var.size();
        hle hleVarO = null;
        for (int i = 0; i < size; i++) {
            String strB = hu7Var.b(i);
            String strF = hu7Var.f(i);
            if (cqk.d(strB, ":status")) {
                hleVarO = n1g.O("HTTP/1.1 " + strF);
            } else if (!h.contains(strB)) {
                arrayList.add(strB);
                arrayList.add(r5h.y1(strF).toString());
            }
        }
        if (hleVarO == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        one oneVar = new one();
        oneVar.b = twdVar;
        oneVar.c = hleVarO.b;
        oneVar.d = (String) hleVarO.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        p3c p3cVar = new p3c(10);
        cx3.a1((ArrayList) p3cVar.b, strArr);
        oneVar.f = p3cVar;
        if (z && oneVar.c == 100) {
            return null;
        }
        return oneVar;
    }

    @Override // defpackage.jd6
    public final void h() {
        this.c.flush();
    }
}

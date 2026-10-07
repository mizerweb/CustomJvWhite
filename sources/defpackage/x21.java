package defpackage;

import android.net.TrafficStats;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.apache.http.HttpStatus;
import org.apache.http.auth.AUTH;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.protocol.HTTP;
import ru.ok.messages.http.UnknownOkhttpException;

/* JADX INFO: loaded from: classes.dex */
public final class x21 implements tj8 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ x21(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static int d(pne pneVar, int i) {
        String strA = pne.A(pneVar, "Retry-After");
        if (strA == null) {
            return i;
        }
        if (Pattern.compile("\\d+").matcher(strA).matches()) {
            return Integer.valueOf(strA).intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.tj8
    public final pne a(f9e f9eVar) throws IOException {
        boolean z;
        rne rneVar;
        pne pneVarB;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        uo2 uo2Var;
        switch (this.a) {
            case 0:
                lhb lhbVar = (lhb) this.b;
                dle dleVar = f9eVar.e;
                ag5 ag5VarA = dleVar.a();
                k28 k28Var = dleVar.a;
                hu7 hu7Var = dleVar.c;
                hle hleVar = dleVar.d;
                if (hleVar != null) {
                    y6a y6aVar = (y6a) hleVar.c;
                    if (y6aVar != null) {
                        ag5VarA.d(HTTP.CONTENT_TYPE, y6aVar.a);
                    }
                    long j = hleVar.b;
                    if (j != -1) {
                        ag5VarA.d(HTTP.CONTENT_LEN, String.valueOf(j));
                        ag5VarA.f(HTTP.TRANSFER_ENCODING);
                    } else {
                        ag5VarA.d(HTTP.TRANSFER_ENCODING, HTTP.CHUNK_CODING);
                        ag5VarA.f(HTTP.CONTENT_LEN);
                    }
                }
                if (hu7Var.a(HTTP.TARGET_HOST) == null) {
                    ag5VarA.d(HTTP.TARGET_HOST, uqi.w(k28Var, false));
                }
                if (hu7Var.a(HTTP.CONN_DIRECTIVE) == null) {
                    ag5VarA.d(HTTP.CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
                }
                if (hu7Var.a("Accept-Encoding") == null && hu7Var.a("Range") == null) {
                    ag5VarA.d("Accept-Encoding", "gzip");
                    z = true;
                } else {
                    z = false;
                }
                lhbVar.getClass();
                if (hu7Var.a(HTTP.USER_AGENT) == null) {
                    ag5VarA.d(HTTP.USER_AGENT, "okhttp/4.12.0");
                }
                pne pneVarB2 = f9eVar.b(ag5VarA.a());
                hu7 hu7Var2 = pneVarB2.f;
                int i = t18.a;
                if (lhbVar != lhb.f) {
                    Pattern pattern = ws4.j;
                    ppl.c(k28Var, hu7Var2).isEmpty();
                }
                one oneVarI = pneVarB2.I();
                oneVarI.a = dleVar;
                if (z) {
                    String strA = hu7Var2.a(HTTP.CONTENT_ENCODING);
                    if (strA == null) {
                        strA = null;
                    }
                    if ("gzip".equalsIgnoreCase(strA) && t18.a(pneVarB2) && (rneVar = pneVarB2.g) != null) {
                        rr7 rr7Var = new rr7(rneVar.E());
                        p3c p3cVarC = hu7Var2.c();
                        p3cVarC.n(HTTP.CONTENT_ENCODING);
                        p3cVarC.n(HTTP.CONTENT_LEN);
                        oneVarI.f = p3cVarC.h().c();
                        String strA2 = hu7Var2.a(HTTP.CONTENT_TYPE);
                        oneVarI.g = new g9e(strA2 == null ? null : strA2, -1L, new u8e(rr7Var));
                    }
                }
                return oneVarI.a();
            case 1:
                dle dleVar2 = f9eVar.e;
                y8e y8eVar = f9eVar.a;
                List listH1 = r66.a;
                pne pneVar = null;
                int i2 = 0;
                dle dleVarB = dleVar2;
                while (true) {
                    boolean z2 = true;
                    while (true) {
                        if (y8eVar.l != null) {
                            ore.k("Check failed.");
                            return null;
                        }
                        synchronized (y8eVar) {
                            try {
                                if (y8eVar.n) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (y8eVar.m) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z2) {
                            e9e e9eVar = y8eVar.d;
                            k28 k28Var2 = dleVarB.a;
                            qsb qsbVar = y8eVar.a;
                            if (k28Var2.i) {
                                SSLSocketFactory sSLSocketFactory2 = qsbVar.o;
                                if (sSLSocketFactory2 == null) {
                                    ore.k("CLEARTEXT-only client");
                                    return null;
                                }
                                HostnameVerifier hostnameVerifier2 = qsbVar.s;
                                uo2Var = qsbVar.t;
                                sSLSocketFactory = sSLSocketFactory2;
                                hostnameVerifier = hostnameVerifier2;
                            } else {
                                sSLSocketFactory = null;
                                hostnameVerifier = null;
                                uo2Var = null;
                            }
                            y8eVar.i = new kd6(e9eVar, new ec(k28Var2.d, k28Var2.e, qsbVar.k, qsbVar.n, sSLSocketFactory, hostnameVerifier, uo2Var, qsbVar.m, qsbVar.r, qsbVar.q, qsbVar.l), y8eVar, y8eVar.e);
                        }
                        try {
                            if (y8eVar.p) {
                                throw new IOException("Canceled");
                            }
                            try {
                                try {
                                    pneVarB = f9eVar.b(dleVarB);
                                } catch (IOException e) {
                                    if (!c(e, y8eVar, dleVarB, !(e instanceof ConnectionShutdownException))) {
                                        Iterator it = listH1.iterator();
                                        while (it.hasNext()) {
                                            gm0.b(e, (Exception) it.next());
                                        }
                                        throw e;
                                    }
                                    listH1 = ww3.H1(e, listH1);
                                    y8eVar.g(true);
                                    z2 = false;
                                }
                            } catch (RouteException e2) {
                                if (!c(e2.b, y8eVar, dleVarB, false)) {
                                    IOException iOException = e2.a;
                                    Iterator it2 = listH1.iterator();
                                    while (it2.hasNext()) {
                                        gm0.b(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                listH1 = ww3.H1(e2.a, listH1);
                                y8eVar.g(true);
                                z2 = false;
                            }
                        } catch (Throwable th2) {
                            y8eVar.g(true);
                            throw th2;
                        }
                        break;
                        z2 = false;
                    }
                    if (pneVar != null) {
                        one oneVarI2 = pneVarB.I();
                        one oneVarI3 = pneVar.I();
                        oneVarI3.g = null;
                        pne pneVarA = oneVarI3.a();
                        if (pneVarA.g != null) {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                        oneVarI2.j = pneVarA;
                        pneVarB = oneVarI2.a();
                    }
                    pneVar = pneVarB;
                    dleVarB = b(pneVar, y8eVar.l);
                    if (dleVarB == null) {
                        y8eVar.g(false);
                        return pneVar;
                    }
                    rne rneVar2 = pneVar.g;
                    if (rneVar2 != null) {
                        uqi.d(rneVar2);
                    }
                    i2++;
                    if (i2 > 20) {
                        throw new ProtocolException("Too many follow-up requests: " + i2);
                    }
                    y8eVar.g(true);
                }
                break;
            default:
                TrafficStats.setThreadStatsTag(61453);
                ag5 ag5VarA2 = f9eVar.e.a();
                ((p3c) ag5VarA2.c).s(HTTP.USER_AGENT, ((gih) this.b).c);
                try {
                    return f9eVar.b(ag5VarA2.a());
                } catch (ClassCastException unused) {
                    qr7.k("ClassCastException");
                    return null;
                } catch (RuntimeException e3) {
                    throw new UnknownOkhttpException(e3, "Http request failed");
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x012d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:108:0x014b  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    public dle b(pne pneVar, yf2 yf2Var) throws ProtocolException {
        qsb qsbVar;
        String strA;
        dle dleVar;
        t84 t84Var;
        k28 k28VarC;
        ag5 ag5VarA;
        boolean z;
        pne pneVar2;
        c9e c9eVar;
        fve fveVar = (yf2Var == null || (c9eVar = (c9e) yf2Var.f) == null) ? null : c9eVar.b;
        int i = pneVar.d;
        String str = pneVar.a.b;
        if (i == 307 || i == 308) {
            qsbVar = (qsb) this.b;
            if (qsbVar.h) {
                strA = pneVar.f.a("Location");
                if (strA == null) {
                    strA = null;
                }
                dleVar = pneVar.a;
                if (strA != null) {
                    k28 k28Var = dleVar.a;
                    k28Var.getClass();
                    try {
                        t84Var = new t84();
                        t84Var.n(k28Var, strA);
                    } catch (IllegalArgumentException unused) {
                        t84Var = null;
                    }
                    if (t84Var != null) {
                        k28VarC = t84Var.c();
                    } else {
                        k28VarC = null;
                    }
                    if (k28VarC != null && (cqk.d(k28VarC.a, dleVar.a.a) || qsbVar.i)) {
                        ag5VarA = dleVar.a();
                        if (f55.v(str)) {
                            int i2 = pneVar.d;
                            z = !str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (!str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                ag5VarA.e(str, z ? dleVar.d : null);
                            } else {
                                ag5VarA.e(HttpGet.METHOD_NAME, null);
                            }
                            if (!z) {
                                ag5VarA.f(HTTP.TRANSFER_ENCODING);
                                ag5VarA.f(HTTP.CONTENT_LEN);
                                ag5VarA.f(HTTP.CONTENT_TYPE);
                            }
                        }
                        if (!uqi.a(dleVar.a, k28VarC)) {
                            ag5VarA.f(AUTH.WWW_AUTH_RESP);
                        }
                        ag5VarA.a = k28VarC;
                        return ag5VarA.a();
                    }
                }
            }
        } else {
            if (i == 401) {
                ((qsb) this.b).g.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    pne pneVar3 = pneVar.j;
                    if ((pneVar3 == null || pneVar3.d != 503) && d(pneVar, Integer.MAX_VALUE) == 0) {
                        return pneVar.a;
                    }
                } else {
                    if (i == 407) {
                        if (fveVar.b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((qsb) this.b).m.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                            case 300:
                            case 301:
                            case HttpStatus.SC_MOVED_TEMPORARILY /* 302 */:
                            case HttpStatus.SC_SEE_OTHER /* 303 */:
                                qsbVar = (qsb) this.b;
                                if (qsbVar.h) {
                                    strA = pneVar.f.a("Location");
                                    if (strA == null) {
                                        strA = null;
                                    }
                                    dleVar = pneVar.a;
                                    if (strA != null) {
                                        k28 k28Var2 = dleVar.a;
                                        k28Var2.getClass();
                                        t84Var = new t84();
                                        t84Var.n(k28Var2, strA);
                                        if (t84Var != null) {
                                            k28VarC = t84Var.c();
                                        } else {
                                            k28VarC = null;
                                        }
                                        if (k28VarC != null) {
                                            ag5VarA = dleVar.a();
                                            if (f55.v(str)) {
                                                int i3 = pneVar.d;
                                                if (str.equals("PROPFIND")) {
                                                }
                                                if (str.equals("PROPFIND")) {
                                                    ag5VarA.e(str, z ? dleVar.d : null);
                                                } else {
                                                    ag5VarA.e(str, z ? dleVar.d : null);
                                                }
                                                if (!z) {
                                                    ag5VarA.f(HTTP.TRANSFER_ENCODING);
                                                    ag5VarA.f(HTTP.CONTENT_LEN);
                                                    ag5VarA.f(HTTP.CONTENT_TYPE);
                                                }
                                            }
                                            if (!uqi.a(dleVar.a, k28VarC)) {
                                                ag5VarA.f(AUTH.WWW_AUTH_RESP);
                                            }
                                            ag5VarA.a = k28VarC;
                                            return ag5VarA.a();
                                        }
                                    }
                                }
                            default:
                                return null;
                        }
                    } else if (((qsb) this.b).f && (((pneVar2 = pneVar.j) == null || pneVar2.d != 408) && d(pneVar, 0) <= 0)) {
                        return pneVar.a;
                    }
                }
            } else if (yf2Var != null && !cqk.d(((kd6) yf2Var.d).b.h.d, ((c9e) yf2Var.f).b.a.h.d)) {
                c9e c9eVar2 = (c9e) yf2Var.f;
                synchronized (c9eVar2) {
                    c9eVar2.k = true;
                }
                return pneVar.a;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0046  */
    /* JADX WARN: Code duplicated, block: B:36:0x004b  */
    /* JADX WARN: Code duplicated, block: B:38:0x004e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0063 A[ADDED_TO_REGION, DONT_GENERATE, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:51:0x0065 A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:47:0x005f, B:51:0x0065, B:55:0x0077), top: B:76:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0080  */
    /* JADX WARN: Code duplicated, block: B:63:0x0082  */
    /* JADX WARN: Code duplicated, block: B:64:0x0084  */
    /* JADX WARN: Code duplicated, block: B:66:0x0088  */
    /* JADX WARN: Code duplicated, block: B:69:0x008f  */
    /* JADX WARN: Code duplicated, block: B:75:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public boolean c(IOException iOException, y8e y8eVar, dle dleVar, boolean z) {
        kd6 kd6Var;
        int i;
        boolean zR;
        fve fveVar;
        qf4 qf4Var;
        ma maVar;
        c9e c9eVar;
        if (!((qsb) this.b).f || ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (!(iOException instanceof InterruptedIOException)) {
            if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                return false;
            }
            kd6Var = y8eVar.i;
            i = kd6Var.g;
            if (i != 0) {
                if (kd6Var.j != null) {
                    zR = true;
                } else {
                    fveVar = null;
                    if (i <= 1) {
                        synchronized (c9eVar) {
                            if (c9eVar.l != 0) {
                                fveVar = c9eVar.b;
                            }
                        }
                    }
                    if (fveVar != null) {
                        kd6Var.j = fveVar;
                    } else {
                        qf4Var = kd6Var.e;
                        zR = qf4Var != null ? maVar.r() : maVar.r();
                    }
                    zR = true;
                }
            } else if (kd6Var.j != null) {
                zR = true;
            } else {
                fveVar = null;
                if (i <= 1) {
                    synchronized (c9eVar) {
                        if (c9eVar.l != 0) {
                            fveVar = c9eVar.b;
                        }
                    }
                }
                if (fveVar != null) {
                    kd6Var.j = fveVar;
                } else {
                    qf4Var = kd6Var.e;
                    if (qf4Var != null) {
                    }
                }
                zR = true;
            }
            if (!zR) {
                return true;
            }
        } else if ((iOException instanceof SocketTimeoutException) && !z) {
            kd6Var = y8eVar.i;
            i = kd6Var.g;
            if (i != 0 && kd6Var.h == 0 && kd6Var.i == 0) {
                zR = false;
            } else if (kd6Var.j != null) {
                zR = true;
            } else {
                fveVar = null;
                if (i <= 1 && kd6Var.h <= 1 && kd6Var.i <= 0 && (c9eVar = kd6Var.c.j) != null) {
                    synchronized (c9eVar) {
                        if (c9eVar.l != 0 && uqi.a(c9eVar.b.a.h, kd6Var.b.h)) {
                            fveVar = c9eVar.b;
                        }
                    }
                }
                if (fveVar != null) {
                    kd6Var.j = fveVar;
                } else {
                    qf4Var = kd6Var.e;
                    if ((qf4Var != null || !qf4Var.l()) && (maVar = kd6Var.f) != null) {
                    }
                }
                zR = true;
            }
            if (!zR) {
                return true;
            }
        }
        return false;
    }
}

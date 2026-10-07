package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.a;
import okhttp3.internal.connection.RouteException;
import org.apache.http.auth.AUTH;
import org.apache.http.protocol.HTTP;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class c9e extends p08 {
    public final fve b;
    public Socket c;
    public Socket d;
    public zs7 e;
    public twd f;
    public w08 g;
    public u8e h;
    public s8e i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o = 1;
    public final ArrayList p = new ArrayList();
    public long q = BuildConfig.MAX_TIME_TO_UPLOAD;

    public c9e(fve fveVar) {
        this.b = fveVar;
    }

    public static void d(qsb qsbVar, fve fveVar, IOException iOException) {
        if (fveVar.b.type() != Proxy.Type.DIRECT) {
            ec ecVar = fveVar.a;
            ecVar.g.connectFailed(ecVar.h.i(), fveVar.b.address(), iOException);
        }
        w4 w4Var = qsbVar.z;
        synchronized (w4Var) {
            ((LinkedHashSet) w4Var.a).add(fveVar);
        }
    }

    @Override // defpackage.p08
    public final synchronized void a(dqf dqfVar) {
        this.o = dqfVar.b();
    }

    @Override // defpackage.p08
    public final void b(d18 d18Var) {
        d18Var.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z, y8e y8eVar, lc6 lc6Var) throws Throwable {
        if (this.f != null) {
            ore.k("already connected");
            return;
        }
        ec ecVar = this.b.a;
        List list = ecVar.j;
        oe4 oe4Var = new oe4(list);
        if (ecVar.c == null) {
            if (!list.contains(ne4.f)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.h.d;
            i2d i2dVar = i2d.a;
            if (!i2d.a.h(str)) {
                throw new RouteException(new UnknownServiceException(c0a.o("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (ecVar.i.contains(twd.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                fve fveVar = this.b;
                if (fveVar.a.c != null && fveVar.b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, lc6Var);
                    if (this.c != null) {
                        break;
                    } else {
                        break;
                    }
                }
                e(i, i2, lc6Var);
                g(oe4Var, lc6Var);
                InetSocketAddress inetSocketAddress = this.b.c;
                break;
            } catch (IOException e) {
                Socket socket = this.d;
                if (socket != null) {
                    uqi.e(socket);
                }
                Socket socket2 = this.c;
                if (socket2 != null) {
                    uqi.e(socket2);
                }
                this.d = null;
                this.c = null;
                this.h = null;
                this.i = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.o = 1;
                InetSocketAddress inetSocketAddress2 = this.b.c;
                lc6Var.d(y8eVar, e);
                if (routeException == null) {
                    routeException = new RouteException(e);
                } else {
                    gm0.b(routeException.a, e);
                    routeException.b = e;
                }
                if (!z) {
                    throw routeException;
                }
                oe4Var.d = true;
                if (!oe4Var.c) {
                    throw routeException;
                }
                if (e instanceof ProtocolException) {
                    throw routeException;
                }
                if (e instanceof InterruptedIOException) {
                    throw routeException;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw routeException;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw routeException;
                }
                if (!(e instanceof SSLException)) {
                    throw routeException;
                }
            }
        }
        fve fveVar2 = this.b;
        if (fveVar2.a.c != null && fveVar2.b.type() == Proxy.Type.HTTP && this.c == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.q = System.nanoTime();
    }

    public final void e(int i, int i2, lc6 lc6Var) throws IOException {
        fve fveVar = this.b;
        Proxy proxy = fveVar.b;
        ec ecVar = fveVar.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : z8e.$EnumSwitchMapping$0[type.ordinal()];
        Socket socketCreateSocket = (i3 == 1 || i3 == 2) ? ecVar.b.createSocket() : new Socket(proxy);
        this.c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.b.c;
        socketCreateSocket.setSoTimeout(i2);
        try {
            i2d i2dVar = i2d.a;
            i2d.a.e(socketCreateSocket, this.b.c, i);
            try {
                Logger logger = xsb.a;
                tcg tcgVar = new tcg(socketCreateSocket);
                this.h = new u8e(new r30(tcgVar, 0, new r30(socketCreateSocket.getInputStream(), 1, tcgVar)));
                tcg tcgVar2 = new tcg(socketCreateSocket);
                this.i = new s8e(new q30(tcgVar2, new q30(socketCreateSocket.getOutputStream(), tcgVar2)));
            } catch (NullPointerException e) {
                if (cqk.d(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, lc6 lc6Var) throws IOException {
        ag5 ag5Var = new ag5(3);
        fve fveVar = this.b;
        ag5Var.a = fveVar.a.h;
        ag5Var.e("CONNECT", null);
        ec ecVar = fveVar.a;
        ((p3c) ag5Var.c).s(HTTP.TARGET_HOST, uqi.w(ecVar.h, true));
        ((p3c) ag5Var.c).s("Proxy-Connection", HTTP.CONN_KEEP_ALIVE);
        ((p3c) ag5Var.c).s(HTTP.USER_AGENT, "okhttp/4.12.0");
        dle dleVarA = ag5Var.a();
        p3c p3cVar = new p3c(10);
        p3cVar.s(AUTH.PROXY_AUTH, "OkHttp-Preemptive");
        p3cVar.h();
        ecVar.f.getClass();
        k28 k28Var = dleVarA.a;
        e(i, i2, lc6Var);
        String str = "CONNECT " + uqi.w(k28Var, true) + " HTTP/1.1";
        u8e u8eVar = this.h;
        s8e s8eVar = this.i;
        ma maVar = new ma((qsb) null, this, u8eVar, s8eVar);
        xsh xshVarM = u8eVar.a.m();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xshVarM.g(j, timeUnit);
        s8eVar.a.m().g(i3, timeUnit);
        maVar.H(dleVarA.c, str);
        maVar.b();
        one oneVarG = maVar.g(false);
        oneVarG.a = dleVarA;
        pne pneVarA = oneVarG.a();
        int i4 = pneVarA.d;
        long jK = uqi.k(pneVarA);
        if (jK != -1) {
            k08 k08VarU = maVar.u(jK);
            uqi.u(k08VarU, Integer.MAX_VALUE);
            k08VarU.close();
        }
        if (i4 == 200) {
            if (u8eVar.b.l() && s8eVar.b.l()) {
                return;
            }
            qr7.k("TLS tunnel buffered too many bytes!");
            return;
        }
        if (i4 != 407) {
            qr7.k(zo5.h(i4, "Unexpected response code for CONNECT: "));
        } else {
            ecVar.f.getClass();
            qr7.k("Failed to authenticate with proxy");
        }
    }

    public final void g(oe4 oe4Var, lc6 lc6Var) throws Throwable {
        SSLSocket sSLSocket;
        String strF;
        twd twdVar = twd.HTTP_2;
        twd twdVar2 = twd.HTTP_1_1;
        twd twdVar3 = twd.H2_PRIOR_KNOWLEDGE;
        ec ecVar = this.b.a;
        SSLSocketFactory sSLSocketFactory = ecVar.c;
        if (sSLSocketFactory == null) {
            boolean zContains = ecVar.i.contains(twdVar3);
            Socket socket = this.c;
            if (!zContains) {
                this.d = socket;
                this.f = twdVar2;
                return;
            } else {
                this.d = socket;
                this.f = twdVar3;
                l();
                return;
            }
        }
        try {
            Socket socket2 = this.c;
            k28 k28Var = ecVar.h;
            SSLSocket sSLSocket2 = (SSLSocket) sSLSocketFactory.createSocket(socket2, k28Var.d, k28Var.e, true);
            try {
                ne4 ne4VarA = oe4Var.a(sSLSocket2);
                if (ne4VarA.b) {
                    i2d i2dVar = i2d.a;
                    i2d.a.d(sSLSocket2, ecVar.h.d, ecVar.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                zs7 zs7VarB0 = tre.b0(session);
                if (!ecVar.d.verify(ecVar.h.d, session)) {
                    List listA = zs7VarB0.a();
                    if (listA.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + ecVar.h.d + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) listA.get(0);
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(ecVar.h.d);
                    sb.append(" not verified:\n              |    certificate: ");
                    uo2 uo2Var = uo2.c;
                    byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                    int length = encoded.length;
                    gm0.g(encoded.length, 0L, length);
                    byte[] bArrT0 = a.T0(0, encoded, length);
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(bArrT0, 0, bArrT0.length);
                    sb.append("sha256/".concat(a.a(messageDigest.digest())));
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    sb.append(ww3.G1(osb.a(x509Certificate, 2), osb.a(x509Certificate, 7)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(s5h.y0(sb.toString()));
                }
                uo2 uo2Var2 = ecVar.e;
                this.e = new zs7(zs7VarB0.a, zs7VarB0.b, zs7VarB0.c, new a9e(uo2Var2, zs7VarB0, ecVar));
                String str = ecVar.h.d;
                Iterator it = uo2Var2.a.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                if (ne4VarA.b) {
                    i2d i2dVar2 = i2d.a;
                    strF = i2d.a.f(sSLSocket2);
                } else {
                    strF = null;
                }
                this.d = sSLSocket2;
                Logger logger = xsb.a;
                tcg tcgVar = new tcg(sSLSocket2);
                this.h = new u8e(new r30(tcgVar, 0, new r30(sSLSocket2.getInputStream(), 1, tcgVar)));
                tcg tcgVar2 = new tcg(sSLSocket2);
                this.i = new s8e(new q30(tcgVar2, new q30(sSLSocket2.getOutputStream(), tcgVar2)));
                if (strF != null) {
                    twd twdVar4 = twd.HTTP_1_0;
                    if (strF.equals("http/1.0")) {
                        twdVar2 = twdVar4;
                    } else if (!strF.equals("http/1.1")) {
                        if (strF.equals("h2_prior_knowledge")) {
                            twdVar2 = twdVar3;
                        } else if (strF.equals("h2")) {
                            twdVar2 = twdVar;
                        } else {
                            twdVar2 = twd.SPDY_3;
                            if (!strF.equals("spdy/3.1")) {
                                twdVar2 = twd.QUIC;
                                if (!strF.equals("quic")) {
                                    throw new IOException("Unexpected protocol: ".concat(strF));
                                }
                            }
                        }
                    }
                }
                this.f = twdVar2;
                i2d i2dVar3 = i2d.a;
                i2d.a.a(sSLSocket2);
                if (this.f == twdVar) {
                    l();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    i2d i2dVar4 = i2d.a;
                    i2d.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    uqi.e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket = null;
        }
    }

    public final boolean h(ec ecVar, List list) {
        zs7 zs7Var;
        k28 k28Var = ecVar.h;
        byte[] bArr = uqi.a;
        if (this.p.size() < this.o && !this.j) {
            fve fveVar = this.b;
            ec ecVar2 = fveVar.a;
            ec ecVar3 = fveVar.a;
            if (ecVar2.a(ecVar)) {
                if (cqk.d(k28Var.d, ecVar3.h.d)) {
                    return true;
                }
                if (this.g != null && list != null) {
                    List<fve> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (fve fveVar2 : list2) {
                            Proxy.Type type = fveVar2.b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && fveVar.b.type() == type2 && cqk.d(fveVar.c, fveVar2.c)) {
                                if (ecVar.d != osb.a) {
                                    break;
                                }
                                byte[] bArr2 = uqi.a;
                                k28 k28Var2 = ecVar3.h;
                                int i = k28Var.e;
                                String str = k28Var.d;
                                if (i != k28Var2.e) {
                                    break;
                                }
                                if (!cqk.d(str, k28Var2.d)) {
                                    if (!this.k && (zs7Var = this.e) != null) {
                                        List listA = zs7Var.a();
                                        if (listA.isEmpty() || !osb.c(str, (X509Certificate) listA.get(0))) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    uo2 uo2Var = ecVar.e;
                                    this.e.a();
                                    uo2Var.getClass();
                                    Iterator it = uo2Var.a.iterator();
                                    if (!it.hasNext()) {
                                        return true;
                                    }
                                    it.next().getClass();
                                    throw new ClassCastException();
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z) {
        long j;
        byte[] bArr = uqi.a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.c;
        Socket socket2 = this.d;
        u8e u8eVar = this.h;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        w08 w08Var = this.g;
        if (w08Var != null) {
            return w08Var.l(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !u8eVar.l();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final jd6 j(qsb qsbVar, f9e f9eVar) throws SocketException {
        int i = f9eVar.g;
        Socket socket = this.d;
        u8e u8eVar = this.h;
        s8e s8eVar = this.i;
        w08 w08Var = this.g;
        if (w08Var != null) {
            return new x08(qsbVar, this, f9eVar, w08Var);
        }
        socket.setSoTimeout(i);
        xsh xshVarM = u8eVar.a.m();
        long j = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xshVarM.g(j, timeUnit);
        s8eVar.a.m().g(f9eVar.h, timeUnit);
        return new ma(qsbVar, this, u8eVar, s8eVar);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() throws SocketException {
        Socket socket = this.d;
        u8e u8eVar = this.h;
        s8e s8eVar = this.i;
        socket.setSoTimeout(0);
        js8 js8Var = new js8(pkh.h);
        js8Var.u(socket, this.b.a.h.d, u8eVar, s8eVar);
        js8Var.n(this);
        w08 w08VarK = js8Var.k();
        this.g = w08VarK;
        dqf dqfVar = w08.z;
        this.o = u1m.a().b();
        w08.E(w08VarK);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        fve fveVar = this.b;
        sb.append(fveVar.a.h.d);
        sb.append(':');
        sb.append(fveVar.a.h.e);
        sb.append(", proxy=");
        sb.append(fveVar.b);
        sb.append(" hostAddress=");
        sb.append(fveVar.c);
        sb.append(" cipherSuite=");
        zs7 zs7Var = this.e;
        sb.append(zs7Var != null ? zs7Var.b : "none");
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}

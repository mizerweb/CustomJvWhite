package defpackage;

import android.content.Context;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import one.me.net.ssl.common.internal.MaxApiTrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class xd5 {
    public final wfg a;
    public final ksh b;
    public final String c;
    public final Context d;
    public final xvc e;
    public final fbc f;
    public final ifh g;
    public final ifh h;

    public xd5(Context context, wfg wfgVar) {
        pfh pfhVar = new pfh(3);
        this.a = wfgVar;
        this.b = pfhVar;
        this.c = xd5.class.getName().concat("(DEF_SSL)");
        this.d = context.getApplicationContext();
        xvc xvcVar = new xvc(24);
        this.e = xvcVar;
        this.f = new fbc(xvcVar, 14, pfhVar);
        final int i = 0;
        this.g = new ifh(new af7(this) { // from class: wd5
            public final /* synthetic */ xd5 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() throws NoSuchAlgorithmException, KeyManagementException {
                int i2 = i;
                xd5 xd5Var = this.b;
                switch (i2) {
                    case 0:
                        return ((Boolean) xd5Var.a.a.invoke()).booleanValue() ? new MaxApiTrustManager() : new cp9();
                    default:
                        SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                        sSLContext.init(null, new cp9[]{xd5Var.c()}, null);
                        return sSLContext;
                }
            }
        });
        final int i2 = 1;
        this.h = new ifh(new af7(this) { // from class: wd5
            public final /* synthetic */ xd5 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() throws NoSuchAlgorithmException, KeyManagementException {
                int i3 = i2;
                xd5 xd5Var = this.b;
                switch (i3) {
                    case 0:
                        return ((Boolean) xd5Var.a.a.invoke()).booleanValue() ? new MaxApiTrustManager() : new cp9();
                    default:
                        SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                        sSLContext.init(null, new cp9[]{xd5Var.c()}, null);
                        return sSLContext;
                }
            }
        });
    }

    public final SSLSocketFactory a(String str) throws SSLException {
        je9 je9Var = je9.d;
        String str2 = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str2, qv1.k("createSocketFactory -> host=", str), null);
        }
        v44 v44VarA = this.b.a();
        try {
            wcg wcgVar = new wcg(this.d, c());
            long j = v44VarA.j();
            xvc xvcVar = this.e;
            if (ew5.g(j) >= 0) {
                xvcVar.getClass();
            } else {
                xvcVar.getClass();
            }
            String str3 = this.c;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str3, "<- createSocketFactory, took=".concat(ew5.t(j)), null);
            }
            return wcgVar;
        } catch (SSLException e) {
            throw e;
        } catch (Throwable th) {
            throw new SSLException("Failed to create socket factory", th);
        }
    }

    public final cp9 b() throws SSLException {
        try {
            return c();
        } catch (SSLException e) {
            throw e;
        } catch (Throwable th) {
            throw new SSLException("Failed to create trust manager", th);
        }
    }

    public final cp9 c() {
        return (cp9) this.g.getValue();
    }

    public final void d(SSLSocket sSLSocket, String str, boolean z) throws SSLPeerUnverifiedException {
        je9 je9Var = je9.g;
        je9 je9Var2 = je9.d;
        String str2 = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var2)) {
            a4cVar.c(je9Var2, str2, qt4.n("verifySocket -> host=", str, ", isValidationRequired=", z), null);
        }
        v44 v44VarA = this.b.a();
        c().d.set(str);
        try {
            this.f.f(sSLSocket, z);
            c().c(str);
            long j = v44VarA.j();
            v44 v44VarA2 = this.b.a();
            fbc fbcVar = this.f;
            Object obj = fbcVar.b;
            v44 v44VarA3 = ((ksh) fbcVar.c).a();
            try {
                if (!HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSocket.getSession())) {
                    throw new SSLPeerUnverifiedException("Failed to verify host=".concat(str));
                }
                ew5.g(v44VarA3.j());
                long j2 = v44VarA2.j();
                String str3 = this.c;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str3, "<- verifySocket, took=".concat(ew5.t(ew5.p(j, j2))), null);
                }
            } catch (SSLPeerUnverifiedException e) {
                ew5.g(v44VarA3.j());
                String strV = rx8.v(sSLSocket, str);
                String str4 = this.c;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 == null) {
                    throw e;
                }
                a4c.f(a4cVar3, je9Var, str4, strV, null, null, 8);
                throw e;
            } catch (Throwable th) {
                ew5.g(v44VarA3.j());
                String strV2 = rx8.v(sSLSocket, str);
                String str5 = this.c;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null) {
                    a4c.f(a4cVar4, je9Var, str5, strV2, null, null, 8);
                }
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException("Failed to verify host=".concat(str));
                sSLPeerUnverifiedException.initCause(th);
                throw sSLPeerUnverifiedException;
            }
        } catch (Throwable th2) {
            c().c(str);
            throw th2;
        }
    }
}

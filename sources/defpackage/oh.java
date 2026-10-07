package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class oh extends i2d {
    public static final boolean e;
    public final ArrayList c;
    public final xtj d;

    static {
        boolean z = false;
        if (xvc.n() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public oh() throws NoSuchMethodException {
        ugg uggVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            uggVar = new ugg(cls);
        } catch (Exception e2) {
            i2d.a.getClass();
            i2d.i(5, "unable to load android socket classes", e2);
            uggVar = null;
        }
        List listY0 = a.Y0(new scg[]{uggVar, new dg5(uh.f), new dg5(hf4.a), new dg5(k21.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listY0) {
            if (((scg) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new xtj(method3, method2, method, 5);
    }

    @Override // defpackage.i2d
    public final rx8 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        og ogVar = x509TrustManagerExtensions != null ? new og(x509TrustManager, x509TrustManagerExtensions) : null;
        return ogVar != null ? ogVar : super.b(x509TrustManager);
    }

    @Override // defpackage.i2d
    public final h5i c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new nh(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // defpackage.i2d
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((scg) next).a(sSLSocket));
        scg scgVar = (scg) next;
        if (scgVar != null) {
            scgVar.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.i2d
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // defpackage.i2d
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((scg) next).a(sSLSocket));
        scg scgVar = (scg) next;
        if (scgVar != null) {
            return scgVar.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.i2d
    public final Object g() {
        xtj xtjVar = this.d;
        Method method = (Method) xtjVar.b;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                ((Method) xtjVar.c).invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // defpackage.i2d
    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.i2d
    public final void j(Object obj, String str) {
        xtj xtjVar = this.d;
        xtjVar.getClass();
        if (obj != null) {
            try {
                ((Method) xtjVar.d).invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        i2d.i(5, str, null);
    }
}

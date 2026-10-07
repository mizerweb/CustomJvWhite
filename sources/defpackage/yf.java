package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class yf extends i2d {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = xvc.n() && Build.VERSION.SDK_INT >= 29;
    }

    public yf() {
        List listY0 = a.Y0(new scg[]{(!xvc.n() || Build.VERSION.SDK_INT < 29) ? null : new zf(), new dg5(uh.f), new dg5(hf4.a), new dg5(k21.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listY0) {
            if (((scg) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
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
    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}

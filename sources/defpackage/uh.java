package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public class uh implements scg {
    public static final ku6 f = new ku6(14);
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;

    public uh(Class cls) {
        this.a = cls;
        this.b = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        this.c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.scg
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // defpackage.scg
    public final boolean b() {
        boolean z = oh.e;
        return csk.b();
    }

    @Override // defpackage.scg
    public final String c(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, pt2.a);
                }
            } catch (IllegalAccessException e) {
                c.e(e);
                return null;
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !cqk.d(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    c.e(e2);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // defpackage.scg
    public final void d(SSLSocket sSLSocket, String str, List list) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.c.invoke(sSLSocket, str);
                }
                Method method = this.e;
                i2d i2dVar = i2d.a;
                method.invoke(sSLSocket, xvc.k(list));
            } catch (IllegalAccessException e) {
                c.e(e);
            } catch (InvocationTargetException e2) {
                c.e(e2);
            }
        }
    }
}

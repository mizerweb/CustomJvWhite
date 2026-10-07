package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class to8 extends i2d {
    public final Method c;
    public final Method d;
    public final Method e;
    public final Class f;
    public final Class g;

    public to8(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = cls;
        this.g = cls2;
    }

    @Override // defpackage.i2d
    public final void a(SSLSocket sSLSocket) {
        try {
            this.e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // defpackage.i2d
    public final void d(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((twd) obj) != twd.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((twd) it.next()).a);
        }
        try {
            this.c.invoke(null, sSLSocket, Proxy.newProxyInstance(i2d.class.getClassLoader(), new Class[]{this.f, this.g}, new so8(arrayList2)));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // defpackage.i2d
    public final String f(SSLSocket sSLSocket) {
        try {
            so8 so8Var = (so8) Proxy.getInvocationHandler(this.d.invoke(null, sSLSocket));
            boolean z = so8Var.b;
            if (!z && so8Var.c == null) {
                i2d.i(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z) {
                return null;
            }
            return so8Var.c;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}

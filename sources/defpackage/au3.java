package defpackage;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class au3 implements Cloneable, Closeable {
    public static final cy5 e = new cy5(15);
    public static final ghb f = new ghb(15);
    public boolean a = false;
    public final f0g b;
    public final zt3 c;
    public final Throwable d;

    public au3(f0g f0gVar, zt3 zt3Var, Throwable th) {
        f0gVar.getClass();
        this.b = f0gVar;
        f0gVar.a();
        this.c = zt3Var;
        this.d = th;
    }

    public static au3 A(au3 au3Var) {
        if (au3Var != null) {
            return au3Var.y();
        }
        return null;
    }

    public static void E(au3 au3Var) {
        if (au3Var != null) {
            au3Var.close();
        }
    }

    public static void I(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                E((au3) it.next());
            }
        }
    }

    public static boolean W(au3 au3Var) {
        return au3Var != null && au3Var.P();
    }

    public static g95 Y(Closeable closeable) {
        return k0(closeable, e, f);
    }

    public static g95 k0(Object obj, ine ineVar, zt3 zt3Var) {
        if (obj == null) {
            return null;
        }
        zt3Var.v();
        if (!(obj instanceof Bitmap)) {
            boolean z = obj instanceof xt3;
        }
        return new g95(obj, ineVar, zt3Var, null, true);
    }

    public synchronized Object K() {
        Object objC;
        oc9.r(!this.a);
        objC = this.b.c();
        objC.getClass();
        return objC;
    }

    public synchronized boolean P() {
        return !this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.b.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract au3 clone();

    public synchronized au3 y() {
        if (!P()) {
            return null;
        }
        return clone();
    }

    public au3(Object obj, ine ineVar, zt3 zt3Var, Throwable th, boolean z) {
        this.b = new f0g(obj, ineVar, z);
        this.c = zt3Var;
        this.d = th;
    }
}

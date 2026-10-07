package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ls9 implements o78 {
    public final Object a;
    public int b;
    public boolean c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;

    public ls9(o78 o78Var) {
        this.a = new Object();
        this.b = 0;
        this.c = false;
        this.g = new z48(1, this);
        this.d = o78Var;
        this.e = o78Var.getSurface();
    }

    @Override // defpackage.o78
    public void D(n78 n78Var, Executor executor) {
        synchronized (this.a) {
            ((o78) this.d).D(new fv9(this, 29, n78Var), executor);
        }
    }

    @Override // defpackage.o78
    public l78 H() {
        a58 a58Var;
        synchronized (this.a) {
            l78 l78VarH = ((o78) this.d).H();
            if (l78VarH != null) {
                this.b++;
                a58Var = new a58(l78VarH);
                a58Var.b((z48) this.g);
            } else {
                a58Var = null;
            }
        }
        return a58Var;
    }

    public void a() {
        synchronized (this.a) {
            try {
                this.c = true;
                ((o78) this.d).f();
                if (this.b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        if (this.c) {
            qr7.x(this.a, "sendResult() called when either sendResult() or sendError() had already been called for: ");
            return;
        }
        this.c = true;
        Bundle bundle = (Bundle) this.f;
        String str = (String) this.e;
        mw mwVar = ((y3a) this.g).e;
        ms9 ms9Var = (ms9) this.d;
        rs9 rs9Var = ms9Var.e;
        String str2 = ms9Var.a;
        rs9Var.getClass();
        if (mwVar.get(((ss9) rs9Var).a.getBinder()) != ms9Var) {
            lvb.g0("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + str2 + " id=" + str);
            return;
        }
        if ((this.b & 1) != 0) {
            int i = y3a.l;
        }
        try {
            ((ss9) rs9Var).a(str, null, bundle);
        } catch (RemoteException unused) {
            lvb.G0("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str + " package=" + str2);
        }
    }

    @Override // defpackage.o78
    public void close() {
        synchronized (this.a) {
            try {
                Surface surface = (Surface) this.e;
                if (surface != null) {
                    surface.release();
                }
                ((o78) this.d).close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.o78
    public l78 d() {
        a58 a58Var;
        synchronized (this.a) {
            l78 l78VarD = ((o78) this.d).d();
            if (l78VarD != null) {
                this.b++;
                a58Var = new a58(l78VarD);
                a58Var.b((z48) this.g);
            } else {
                a58Var = null;
            }
        }
        return a58Var;
    }

    @Override // defpackage.o78
    public int e() {
        int iE;
        synchronized (this.a) {
            iE = ((o78) this.d).e();
        }
        return iE;
    }

    @Override // defpackage.o78
    public void f() {
        synchronized (this.a) {
            ((o78) this.d).f();
        }
    }

    @Override // defpackage.o78
    public int getHeight() {
        int height;
        synchronized (this.a) {
            height = ((o78) this.d).getHeight();
        }
        return height;
    }

    @Override // defpackage.o78
    public Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = ((o78) this.d).getSurface();
        }
        return surface;
    }

    @Override // defpackage.o78
    public int getWidth() {
        int width;
        synchronized (this.a) {
            width = ((o78) this.d).getWidth();
        }
        return width;
    }

    @Override // defpackage.o78
    public int n() {
        int iN;
        synchronized (this.a) {
            iN = ((o78) this.d).n();
        }
        return iN;
    }

    public ls9(y3a y3aVar, Object obj, ms9 ms9Var, String str, Bundle bundle) {
        this.g = y3aVar;
        this.d = ms9Var;
        this.e = str;
        this.f = bundle;
        this.a = obj;
    }
}

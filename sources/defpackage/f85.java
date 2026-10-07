package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class f85 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final int c;
    public final Object d;
    public final Object e;
    public final /* synthetic */ Object f;

    public f85(g85 g85Var, px0 px0Var, ux0 ux0Var, int i, int i2) {
        this.f = g85Var;
        this.d = px0Var;
        this.e = ux0Var;
        this.b = i;
        this.c = i2;
    }

    public boolean a(int i, int i2) {
        au3 au3VarI;
        g85 g85Var = (g85) this.f;
        px0 px0Var = (px0) this.d;
        int i3 = 2;
        try {
            if (i2 == 1) {
                au3VarI = ((ux0) this.e).i();
            } else {
                if (i2 != 2) {
                    return false;
                }
                try {
                    au3VarI = ((k2d) g85Var.a).c(px0Var.k, px0Var.l, (Bitmap.Config) g85Var.c);
                    i3 = -1;
                } catch (RuntimeException e) {
                    g85Var.getClass();
                    pj6.i(g85.class, "Failed to create frame bitmap", e);
                    return false;
                }
            }
            au3 au3Var = au3VarI;
            boolean zB = b(i, au3Var, i2);
            au3.E(au3Var);
            return (zB || i3 == -1) ? zB : a(i, i3);
        } catch (Throwable th) {
            au3.E(null);
            throw th;
        }
    }

    public boolean b(int i, au3 au3Var, int i2) {
        if (!au3.W(au3Var) || au3Var == null || !((ri) ((g85) this.f).b).a((Bitmap) au3Var.K(), i)) {
            return false;
        }
        ((g85) this.f).getClass();
        pj6.d(g85.class, Integer.valueOf(i), "Frame %d ready.");
        synchronized (((SparseArray) ((g85) this.f).e)) {
            ((ux0) this.e).g(i, au3Var);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        ms9 ms9Var;
        switch (this.a) {
            case 0:
                try {
                    if (!((ux0) this.e).o(this.b)) {
                        boolean zA = a(this.b, 1);
                        g85 g85Var = (g85) this.f;
                        if (zA) {
                            g85Var.getClass();
                            pj6.d(g85.class, Integer.valueOf(this.b), "Prepared frame %d.");
                        } else {
                            g85Var.getClass();
                            pj6.a(g85.class, "Could not prepare frame %d.", Integer.valueOf(this.b));
                        }
                        g85 g85Var2 = (g85) this.f;
                        sparseArray = (SparseArray) g85Var2.e;
                        synchronized (sparseArray) {
                            ((SparseArray) g85Var2.e).remove(this.c);
                            break;
                        }
                    } else {
                        ((g85) this.f).getClass();
                        pj6.d(g85.class, Integer.valueOf(this.b), "Frame %d is cached already.");
                        g85 g85Var3 = (g85) this.f;
                        sparseArray = (SparseArray) g85Var3.e;
                        synchronized (sparseArray) {
                            ((SparseArray) g85Var3.e).remove(this.c);
                            break;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    g85 g85Var4 = (g85) this.f;
                    synchronized (((SparseArray) g85Var4.e)) {
                        ((SparseArray) g85Var4.e).remove(this.c);
                        throw th;
                    }
                }
            default:
                ss9 ss9Var = (ss9) this.d;
                IBinder binder = ss9Var.a.getBinder();
                i1m i1mVar = (i1m) this.f;
                ((y3a) i1mVar.a).e.remove(binder);
                y3a y3aVar = (y3a) i1mVar.a;
                Iterator it = y3aVar.d.iterator();
                while (true) {
                    ms9Var = null;
                    if (it.hasNext()) {
                        ms9 ms9Var2 = (ms9) it.next();
                        if (ms9Var2.c == this.b) {
                            ms9Var = (TextUtils.isEmpty((String) this.e) || this.c <= 0) ? new ms9(y3aVar, ms9Var2.a, ms9Var2.b, ms9Var2.c, ss9Var) : null;
                            it.remove();
                        }
                    }
                }
                if (ms9Var == null) {
                    ms9Var = new ms9(y3aVar, (String) this.e, this.c, this.b, ss9Var);
                }
                y3aVar.e.put(binder, ms9Var);
                try {
                    binder.linkToDeath(ms9Var, 0);
                    return;
                } catch (RemoteException unused) {
                    lvb.G0("MBServiceCompat", "IBinder is already dead.");
                    return;
                }
        }
    }

    public f85(i1m i1mVar, ss9 ss9Var, int i, String str, int i2, Bundle bundle) {
        this.f = i1mVar;
        this.d = ss9Var;
        this.b = i;
        this.e = str;
        this.c = i2;
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class lj9 implements fy0 {
    public final fik a = new fik(5);
    public final int b;
    public final dbd c;
    public int d;

    public lj9(int i, nhb nhbVar) {
        this.b = i;
        this.c = nhbVar;
    }

    @Override // defpackage.xad, defpackage.ine
    public final void d(Object obj) {
        boolean zAdd;
        Bitmap bitmap = (Bitmap) obj;
        this.a.getClass();
        int iD = oy0.d(bitmap);
        if (iD <= this.b) {
            this.c.getClass();
            fik fikVar = this.a;
            fikVar.getClass();
            if (fik.t(bitmap)) {
                synchronized (fikVar) {
                    zAdd = ((HashSet) fikVar.b).add(bitmap);
                }
                if (zAdd) {
                    euc eucVar = (euc) fikVar.c;
                    int iD2 = oy0.d(bitmap);
                    synchronized (eucVar) {
                        try {
                            c31 c31Var = (c31) ((SparseArray) eucVar.b).get(iD2);
                            if (c31Var == null) {
                                LinkedList linkedList = new LinkedList();
                                c31Var = new c31();
                                c31Var.a = null;
                                c31Var.b = iD2;
                                c31Var.c = linkedList;
                                c31Var.d = null;
                                ((SparseArray) eucVar.b).put(iD2, c31Var);
                            }
                            c31Var.c.addLast(bitmap);
                            if (((c31) eucVar.c) != c31Var) {
                                eucVar.C(c31Var);
                                c31 c31Var2 = (c31) eucVar.c;
                                if (c31Var2 == null) {
                                    eucVar.c = c31Var;
                                    eucVar.d = c31Var;
                                } else {
                                    c31Var.d = c31Var2;
                                    c31Var2.a = c31Var;
                                    eucVar.c = c31Var;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            synchronized (this) {
                this.d += iD;
            }
        }
    }

    @Override // defpackage.sba
    public final void e(qba qbaVar) {
        f((int) ((1.0d - qbaVar.a) * 0.0d));
    }

    public final synchronized void f(int i) {
        Bitmap bitmap;
        while (this.d > i && (bitmap = (Bitmap) this.a.z()) != null) {
            this.a.getClass();
            this.d -= oy0.d(bitmap);
            this.c.getClass();
        }
    }

    @Override // defpackage.xad
    public final Object get(int i) {
        synchronized (this) {
            try {
                if (this.d > 0) {
                    f(0);
                }
                Bitmap bitmapK = this.a.k(i);
                if (bitmapK == null) {
                    this.c.getClass();
                    return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
                }
                this.a.getClass();
                this.d -= oy0.d(bitmapK);
                this.c.getClass();
                return bitmapK;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

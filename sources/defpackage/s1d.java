package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class s1d extends u0 {
    public oah A;
    public boolean B;
    public v78 C;
    public v78 D;
    public final z95 w;
    public final b50 x;
    public final taa y;
    public ay0 z;

    public s1d(Resources resources, ag5 ag5Var, ot5 ot5Var, Executor executor, taa taaVar, b50 b50Var) {
        super(ag5Var, executor);
        this.w = new z95(resources, ot5Var);
        this.x = b50Var;
        this.y = taaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h1f t(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof h1f) {
            return (h1f) drawable;
        }
        if (drawable instanceof pt5) {
            return t(((pt5) drawable).k());
        }
        if (!(drawable instanceof wj6)) {
            return null;
        }
        wj6 wj6Var = (wj6) drawable;
        int length = wj6Var.c.length;
        for (int i = 0; i < length; i++) {
            h1f h1fVarT = t(wj6Var.d(i));
            if (h1fVarT != null) {
                return h1fVarT;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x003e A[Catch: all -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:3:0x0002, B:18:0x003e, B:22:0x004a, B:23:0x005b, B:6:0x001a, B:7:0x001e, B:9:0x0024, B:11:0x0030), top: B:27:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #0 {all -> 0x005c, blocks: (B:3:0x0002, B:18:0x003e, B:22:0x004a, B:23:0x005b, B:6:0x001a, B:7:0x001e, B:9:0x0024, B:11:0x0030), top: B:27:0x0002 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x004a, please report this as an issue */
    @Override // defpackage.u0
    /* JADX INFO: renamed from: s */
    public Drawable b(au3 au3Var) {
        Drawable drawableA;
        Drawable drawableA2;
        try {
            qe7.v();
            oc9.r(au3.W(au3Var));
            xt3 xt3Var = (xt3) au3Var.K();
            v(xt3Var);
            b50 b50Var = this.x;
            if (b50Var != null) {
                Iterator<E> it = b50Var.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ot5 ot5Var = (ot5) it.next();
                        if (ot5Var.b(xt3Var) && (drawableA = ot5Var.a(xt3Var)) != null) {
                            break;
                        }
                    }
                }
                if (drawableA != null) {
                    qe7.v();
                    return drawableA;
                }
                drawableA2 = this.w.a(xt3Var);
                if (drawableA2 != null) {
                    qe7.v();
                    return drawableA2;
                }
                throw new UnsupportedOperationException("Unrecognized image class: " + xt3Var);
            }
            drawableA = null;
            if (drawableA != null) {
                qe7.v();
                return drawableA;
            }
            drawableA2 = this.w.a(xt3Var);
            if (drawableA2 != null) {
                qe7.v();
                return drawableA2;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + xt3Var);
        } catch (Throwable th) {
            qe7.v();
            throw th;
        }
    }

    @Override // defpackage.u0
    public final String toString() {
        dc9 dc9VarC = qdl.c(this);
        dc9VarC.v(super.toString(), "super");
        dc9VarC.v(this.A, "dataSourceSupplier");
        return dc9VarC.toString();
    }

    @Override // defpackage.u0
    /* JADX INFO: renamed from: u */
    public l68 d(au3 au3Var) {
        oc9.r(au3.W(au3Var));
        return ((xt3) au3Var.K()).getImageInfo();
    }

    public final void v(xt3 xt3Var) {
        h1f h1fVarT;
        if (this.B) {
            if (this.i == null) {
                y45 y45Var = new y45();
                a(new q68(y45Var));
                this.i = y45Var;
                wj7 wj7Var = this.h;
                if (wj7Var != null) {
                    ote oteVar = wj7Var.d;
                    oteVar.e = y45Var;
                    oteVar.invalidateSelf();
                }
            }
            y45 y45Var2 = this.i;
            if (y45Var2 != null) {
                y45Var2.d(this.j);
                wj7 wj7Var2 = this.h;
                y45Var2.g((wj7Var2 == null || (h1fVarT = t(wj7Var2.d)) == null) ? null : h1fVarT.e);
                Object obj = this.k;
                String string = obj != null ? obj.toString() : null;
                if (string != null) {
                    y45Var2.a(string);
                }
                if (xt3Var == null) {
                    y45Var2.c();
                } else {
                    y45Var2.e(xt3Var.getWidth(), xt3Var.getHeight());
                    y45Var2.f(xt3Var.getSizeInBytes());
                }
            }
        }
    }

    public final void w(du5 du5Var) {
        if (pj6.a.h(2)) {
            pj6.f(u0.v, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.j, du5Var);
        }
        this.a.a(du5Var != null ? bu5.a : bu5.b);
        if (this.m) {
            this.b.b(this);
            m();
        }
        wj7 wj7Var = this.h;
        if (wj7Var != null) {
            ote oteVar = wj7Var.d;
            oteVar.e = null;
            oteVar.invalidateSelf();
            this.h = null;
        }
        if (du5Var != null) {
            oc9.i(Boolean.valueOf(du5Var instanceof wj7));
            wj7 wj7Var2 = (wj7) du5Var;
            this.h = wj7Var2;
            y45 y45Var = this.i;
            ote oteVar2 = wj7Var2.d;
            oteVar2.e = y45Var;
            oteVar2.invalidateSelf();
        }
        v(null);
    }
}

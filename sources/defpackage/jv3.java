package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class jv3 {
    public final yu3 a;
    public hv3 b;
    public final kr6 c;
    public t25 d;
    public final Rect e = new Rect();

    public jv3(yu3 yu3Var, gv3 gv3Var, kr6 kr6Var) {
        this.a = yu3Var;
        this.b = gv3Var;
        this.c = kr6Var;
    }

    public final void a() {
        t25 t25Var = this.d;
        if (t25Var != null) {
            t25Var.close();
        }
        this.d = null;
    }

    public final Drawable b() {
        hv3 hv3Var = this.b;
        boolean zD = cqk.d(hv3Var, bv3.a);
        kr6 kr6Var = this.c;
        if (zD) {
            return (v50) ((ny8) kr6Var.b).getValue();
        }
        boolean zD2 = cqk.d(hv3Var, av3.a);
        yu3 yu3Var = this.a;
        if (zD2) {
            if (yu3Var instanceof fti) {
                return (o2d) ((ny8) kr6Var.c).getValue();
            }
            return null;
        }
        if (cqk.d(hv3Var, ev3.a)) {
            return (v50) ((ny8) kr6Var.b).getValue();
        }
        if (cqk.d(hv3Var, fv3.a)) {
            return (o2d) ((ny8) kr6Var.a).getValue();
        }
        if (cqk.d(hv3Var, dv3.a) && (yu3Var instanceof fti)) {
            return (o2d) ((ny8) kr6Var.c).getValue();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (jv3.class.equals(obj != null ? obj.getClass() : null)) {
            return cqk.d(this.a, ((jv3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

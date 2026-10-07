package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class rx3 implements vt4, Serializable {
    public final vt4 a;
    public final tt4 b;

    public rx3(vt4 vt4Var, tt4 tt4Var) {
        this.a = vt4Var;
        this.b = tt4Var;
    }

    @Override // defpackage.vt4
    public final Object E(Object obj, qf7 qf7Var) {
        return qf7Var.invoke(this.a.E(obj, qf7Var), this.b);
    }

    @Override // defpackage.vt4
    public final vt4 I(ut4 ut4Var) {
        tt4 tt4Var = this.b;
        tt4 tt4VarX0 = tt4Var.x0(ut4Var);
        vt4 vt4Var = this.a;
        if (tt4VarX0 != null) {
            return vt4Var;
        }
        vt4 vt4VarI = vt4Var.I(ut4Var);
        if (vt4VarI == vt4Var) {
            return this;
        }
        return vt4VarI == k66.a ? tt4Var : new rx3(vt4VarI, tt4Var);
    }

    public final boolean equals(Object obj) {
        boolean zD;
        if (this == obj) {
            return true;
        }
        if (obj instanceof rx3) {
            rx3 rx3Var = (rx3) obj;
            int i = 2;
            rx3 rx3Var2 = rx3Var;
            int i2 = 2;
            while (true) {
                vt4 vt4Var = rx3Var2.a;
                rx3Var2 = vt4Var instanceof rx3 ? (rx3) vt4Var : null;
                if (rx3Var2 == null) {
                    break;
                }
                i2++;
            }
            rx3 rx3Var3 = this;
            while (true) {
                vt4 vt4Var2 = rx3Var3.a;
                rx3Var3 = vt4Var2 instanceof rx3 ? (rx3) vt4Var2 : null;
                if (rx3Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    tt4 tt4Var = this.b;
                    if (!cqk.d(rx3Var.x0(tt4Var.getKey()), tt4Var)) {
                        zD = false;
                        break;
                    }
                    vt4 vt4Var3 = this.a;
                    if (!(vt4Var3 instanceof rx3)) {
                        tt4 tt4Var2 = (tt4) vt4Var3;
                        zD = cqk.d(rx3Var.x0(tt4Var2.getKey()), tt4Var2);
                        break;
                    }
                    this = (rx3) vt4Var3;
                }
                if (zD) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    public final String toString() {
        return x05.i(new StringBuilder("["), (String) E("", new wf0(6)), ']');
    }

    @Override // defpackage.vt4
    public final /* bridge */ vt4 u0(vt4 vt4Var) {
        return lvb.x0(this, vt4Var);
    }

    @Override // defpackage.vt4
    public final tt4 x0(ut4 ut4Var) {
        while (true) {
            tt4 tt4VarX0 = this.b.x0(ut4Var);
            if (tt4VarX0 != null) {
                return tt4VarX0;
            }
            vt4 vt4Var = this.a;
            if (!(vt4Var instanceof rx3)) {
                return vt4Var.x0(ut4Var);
            }
            this = (rx3) vt4Var;
        }
    }
}

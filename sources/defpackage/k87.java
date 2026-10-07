package defpackage;

import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class k87 {
    public final ny8 a;

    public k87(h5 h5Var) {
        this.a = h5Var.d(1011);
    }

    public static lla c(l97 l97Var, boolean z, boolean z2) {
        ynh ynhVar = l97Var.a;
        boolean z3 = l97Var.b;
        n40 n40Var = l97Var.c;
        Integer numValueOf = null;
        if (!z) {
            if (z2) {
                numValueOf = Integer.valueOf(R.drawable.icon_user_crossed);
            } else if (!z2) {
                numValueOf = Integer.valueOf(R.drawable.icon_user);
            }
        }
        return new lla(3, ynhVar, z3, n40Var, z2, numValueOf, l97Var.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(sfa sfaVar, Long l, boolean z, boolean z2, nq4 nq4Var) {
        i87 i87Var;
        if (nq4Var instanceof i87) {
            i87Var = (i87) nq4Var;
            int i = i87Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                i87Var.i = i - Integer.MIN_VALUE;
            } else {
                i87Var = new i87(this, nq4Var);
            }
        } else {
            i87Var = new i87(this, nq4Var);
        }
        Object objA = i87Var.g;
        int i2 = i87Var.i;
        if (i2 == 0) {
            ch3.d0(objA);
            o97 o97Var = (o97) this.a.getValue();
            i87Var.d = this;
            i87Var.e = z;
            i87Var.f = z2;
            i87Var.i = 1;
            objA = o97Var.a(sfaVar, l, i87Var);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = i87Var.f;
            z = i87Var.e;
            this = i87Var.d;
            ch3.d0(objA);
        }
        this.getClass();
        return c((l97) objA, z, z2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, nq4 nq4Var, List list, boolean z) {
        j87 j87Var;
        if (nq4Var instanceof j87) {
            j87Var = (j87) nq4Var;
            int i = j87Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                j87Var.h = i - Integer.MIN_VALUE;
            } else {
                j87Var = new j87(this, nq4Var);
            }
        } else {
            j87Var = new j87(this, nq4Var);
        }
        Object objB = j87Var.f;
        int i2 = j87Var.h;
        if (i2 == 0) {
            ch3.d0(objB);
            o97 o97Var = (o97) this.a.getValue();
            j87Var.d = this;
            j87Var.e = z;
            j87Var.h = 1;
            objB = o97Var.b(j, j87Var, list);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = j87Var.e;
            this = j87Var.d;
            ch3.d0(objB);
        }
        this.getClass();
        return c((l97) objB, false, z);
    }
}

package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class wt0 {
    public final wzj a;
    public final et3 b;

    public wt0(wzj wzjVar, et3 et3Var) {
        this.a = wzjVar;
        this.b = et3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Set set, nq4 nq4Var) {
        vt0 vt0Var;
        Iterator it;
        int i;
        int i2;
        if (nq4Var instanceof vt0) {
            vt0Var = (vt0) nq4Var;
            int i3 = vt0Var.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vt0Var.i = i3 - Integer.MIN_VALUE;
            } else {
                vt0Var = new vt0(this, nq4Var);
            }
        } else {
            vt0Var = new vt0(this, nq4Var);
        }
        Object obj = vt0Var.g;
        int i4 = vt0Var.i;
        sbi sbiVar = sbi.a;
        if (i4 == 0) {
            ch3.d0(obj);
            if (set.isEmpty()) {
                gm0.Y(wt0.class.getName(), "empty chatIds");
                return sbiVar;
            }
            it = ww3.Y1(ww3.T1(set), 100, 100).iterator();
            i = 0;
            i2 = 100;
        } else {
            if (i4 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = vt0Var.f;
            i2 = vt0Var.e;
            it = vt0Var.d;
            ch3.d0(obj);
        }
        while (it.hasNext()) {
            List list = (List) it.next();
            int i5 = dkf.h;
            this.a.d(new dkf(((s7f) this.b).g(), 0L, rx8.j0(list)));
            vt0Var.d = it;
            vt0Var.e = i2;
            vt0Var.f = i;
            vt0Var.i = 1;
            Object objJ0 = tre.J0(vt0Var);
            hu4 hu4Var = hu4.a;
            if (objJ0 == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }
}

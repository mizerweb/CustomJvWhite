package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class l73 extends a8j {
    public final long c;
    public final boolean d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public sgg l;
    public final int o;
    public final ic6 p;
    public final xx6 q;
    public final v63 k = new v63(0);
    public final ArrayList m = new ArrayList();
    public final AtomicBoolean n = new AtomicBoolean(false);

    /* JADX WARN: Code duplicated, block: B:7:0x0037  */
    public l73(long j, boolean z, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        int i;
        this.c = j;
        this.d = z;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var4;
        this.h = ny8Var5;
        this.i = ny8Var3;
        this.j = ny8Var6;
        rt2 rt2VarB = B();
        if (rt2VarB != null) {
            i = !rt2VarB.d0() ? 2 : 1;
        }
        this.o = i;
        this.p = new ic6(null);
        this.q = e9i.I(new ie(e9i.T(new jz(((xn3) ny8Var.getValue()).k(j), 13), ((n0c) ((xhh) ny8Var3.getValue())).b()), this, 20));
    }

    public static boolean E(rt2 rt2Var) {
        if (!rt2Var.f0()) {
            boolean zC = rt2Var.b.c();
            boolean z = rt2Var.I() || rt2Var.S();
            if (rt2Var.B0() || (zC && z)) {
                return true;
            }
        }
        return false;
    }

    public final rt2 B() {
        return (rt2) ((xn3) this.e.getValue()).k(this.c).a.getValue();
    }

    public final List C(long j) {
        sw2 sw2Var;
        rt2 rt2VarB = B();
        long jT = ((s7f) ((et3) this.g.getValue())).t();
        v63 v63Var = this.k;
        v63Var.getClass();
        ny8 ny8Var = v63Var.a;
        if (rt2VarB != null && rt2VarB.X() && (rt2VarB.B0() || (rt2VarB.z0() && srk.a(rt2VarB.n(rt2VarB.f), 2)))) {
            boolean zD0 = rt2VarB.d0();
            boolean z = this.d;
            if (!zD0) {
                c79 c79VarW = yab.w();
                if (!z) {
                    c79VarW.add((rp4) ny8Var.getValue());
                }
                c79VarW.add((rp4) v63Var.b.getValue());
                return yab.j(c79VarW);
            }
            if (rt2VarB.v0(jT) || (((sw2Var = (sw2) rt2VarB.b.T.get(Long.valueOf(j))) != null && sw2Var.c == jT) || !rt2VarB.Y(j))) {
                c79 c79VarW2 = yab.w();
                if (!z) {
                    c79VarW2.add((rp4) ny8Var.getValue());
                }
                c79VarW2.add((rp4) v63Var.c.getValue());
                return yab.j(c79VarW2);
            }
        }
        return r66.a;
    }

    public final xx6 D() {
        return e9i.I(e9i.T(new ie(new jz(((xn3) this.e.getValue()).k(this.c), 13), this, 19), ((n0c) ((xhh) this.i.getValue())).b()));
    }

    public final void F(List list, boolean z) {
        pnh pnhVar;
        this.n.set(z);
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.addAll(list);
        int iD = qt4.D(this.o);
        if (iD == 0) {
            pnhVar = new pnh(R.plurals.profile_members_list_delete_from_channel_snackbar, list.size());
        } else {
            if (iD != 1) {
                ore.o();
                return;
            }
            pnhVar = new pnh(R.plurals.profile_members_list_delete_from_chat_snackbar, list.size());
        }
        a8j.x(this.p, new ird(pnhVar));
    }

    public final void G() {
        pnh pnhVar;
        this.n.set(false);
        ArrayList arrayList = this.m;
        arrayList.clear();
        int iD = qt4.D(this.o);
        if (iD == 0) {
            pnhVar = new pnh(R.plurals.profile_members_list_restore_in_channel_snackbar, arrayList.size());
        } else {
            if (iD != 1) {
                ore.o();
                return;
            }
            pnhVar = new pnh(R.plurals.profile_members_list_restore_in_chat_snackbar, arrayList.size());
        }
        a8j.x(this.p, new jrd(pnhVar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H(lq4 lq4Var) {
        j73 j73Var;
        if (lq4Var instanceof j73) {
            j73Var = (j73) lq4Var;
            int i = j73Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                j73Var.f = i - Integer.MIN_VALUE;
            } else {
                j73Var = new j73(this, (nq4) lq4Var);
            }
        } else {
            j73Var = new j73(this, (nq4) lq4Var);
        }
        Object objV = j73Var.d;
        int i2 = j73Var.f;
        if (i2 == 0) {
            ch3.d0(objV);
            xn3 xn3Var = (xn3) this.e.getValue();
            j73Var.f = 1;
            objV = xn3Var.v(this.c, j73Var);
            hu4 hu4Var = hu4.a;
            if (objV == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objV);
        }
        return Boolean.valueOf(((rt2) objV).k0((e5d) this.h.getValue()));
    }

    public final void I() {
        ArrayList arrayList = this.m;
        List listT1 = ww3.T1(arrayList);
        arrayList.clear();
        sgg sggVar = this.l;
        if ((sggVar == null || !sggVar.isActive()) && !listT1.isEmpty()) {
            xt4 xt4VarB = ((n0c) ((xhh) this.i.getValue())).b();
            zhb zhbVar = zhb.b;
            xt4VarB.getClass();
            this.l = a8j.t(this, lvb.x0(xt4VarB, zhbVar), new k23(this, listT1, null, 5), 2);
        }
    }
}

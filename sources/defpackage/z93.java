package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class z93 extends a8j {
    public final gjg c;
    public final String d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final mjg p;
    public final r8e r;
    public final ic6 m = new ic6(null);
    public final ic6 n = new ic6(null);
    public final ic6 o = new ic6(null);
    public final ifh q = new ifh(new k82(24));

    public z93(gjg gjgVar, boolean z, String str, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9) {
        this.c = gjgVar;
        this.d = str;
        this.e = ny8Var3;
        this.f = ny8Var2;
        this.g = ny8Var4;
        this.h = ny8Var5;
        this.i = ny8Var9;
        this.j = ny8Var6;
        this.k = ny8Var7;
        this.l = ny8Var8;
        this.p = p90.a(Boolean.valueOf(z));
        this.r = e9i.G0(e9i.T(new l7(new jz(gjgVar, 13), ny8Var, this), ((n0c) ((xhh) ny8Var2.getValue())).a()), this.b, j0g.a, r66.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(z93 z93Var, nq4 nq4Var) {
        v93 v93Var;
        if (nq4Var instanceof v93) {
            v93Var = (v93) nq4Var;
            int i = v93Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                v93Var.f = i - Integer.MIN_VALUE;
            } else {
                v93Var = new v93(z93Var, nq4Var);
            }
        } else {
            v93Var = new v93(z93Var, nq4Var);
        }
        Object objH = v93Var.d;
        int i2 = v93Var.f;
        sbi sbiVar = sbi.a;
        try {
            if (i2 == 0) {
                ch3.d0(objH);
                rt2 rt2Var = (rt2) z93Var.c.getValue();
                if (rt2Var == null) {
                    gm0.Y(z93.class.getName(), "Early return addFavourite chatFlow.value?.serverId = null");
                    return sbiVar;
                }
                long jA = rt2Var.A();
                eb ebVar = (eb) z93Var.k.getValue();
                String str = z93Var.d;
                v93Var.f = 1;
                objH = ebVar.h(jA, v93Var, str);
                hu4 hu4Var = hu4.a;
                if (objH == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objH);
            }
            if (((Boolean) objH).booleanValue()) {
                a8j.x(z93Var.m, sbiVar);
                return sbiVar;
            }
            E(z93Var);
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            a8j.x(z93Var.n, new r93(new tnh(R.string.snack_network_error_title)));
            return sbiVar;
        }
    }

    public static final void C(z93 z93Var, long j) {
        rt2 rt2Var = (rt2) z93Var.c.getValue();
        if (rt2Var == null) {
            gm0.Y(z93.class.getName(), "Early return muteChat chatFlow.value?.id = null");
            return;
        }
        long j2 = rt2Var.a;
        ((qw2) z93Var.g.getValue()).W(j2, ew5.g(j) + ((s7f) ((et3) z93Var.h.getValue())).f());
        a8j.x(z93Var.m, sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object D(z93 z93Var, nq4 nq4Var) {
        x93 x93Var;
        if (nq4Var instanceof x93) {
            x93Var = (x93) nq4Var;
            int i = x93Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                x93Var.f = i - Integer.MIN_VALUE;
            } else {
                x93Var = new x93(z93Var, nq4Var);
            }
        } else {
            x93Var = new x93(z93Var, nq4Var);
        }
        Object obj = x93Var.d;
        int i2 = x93Var.f;
        sbi sbiVar = sbi.a;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                rt2 rt2Var = (rt2) z93Var.c.getValue();
                if (rt2Var == null) {
                    gm0.Y(z93.class.getName(), "Early return removeFavourite chatFlow.value?.serverId = null");
                    return sbiVar;
                }
                long jA = rt2Var.A();
                yie yieVar = (yie) z93Var.l.getValue();
                String str = z93Var.d;
                x93Var.f = 1;
                Object objH = yieVar.h(jA, x93Var, str);
                hu4 hu4Var = hu4.a;
                if (objH == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
            a8j.x(z93Var.m, sbiVar);
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            a8j.x(z93Var.n, new r93(new tnh(R.string.snack_network_error_title)));
            return sbiVar;
        }
    }

    public static final void E(z93 z93Var) {
        a8j.x(z93Var.n, new r93(new vnh(R.string.favorite_chats_limit_exceeded, a.n1(new Object[]{((e5d) z93Var.i.getValue()).K.a(e5d.S6[29])}))));
    }

    public final void F(int i) {
        xt4 xt4VarA = ((n0c) ((xhh) this.f.getValue())).a();
        yt4 yt4Var = (yt4) this.j.getValue();
        xt4VarA.getClass();
        a8j.t(this, lvb.x0(xt4VarA, yt4Var), new w93(i, this, (lq4) null), 2);
    }
}

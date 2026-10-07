package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class a27 {
    public final String a;
    public final uy2 b;
    public final sy4 c;
    public final mjg d;
    public final jz e;
    public final dq4 f;
    public final AtomicInteger g;
    public final mjg h;
    public final String i;

    public a27(String str, uy2 uy2Var, sy4 sy4Var, t51 t51Var, xt4 xt4Var) {
        this.a = str;
        this.b = uy2Var;
        this.c = sy4Var;
        mjg mjgVarA = p90.a(null);
        this.d = mjgVarA;
        this.e = new jz(new r8e(mjgVarA), 13);
        dq4 dq4VarA = cqk.a(xt4Var);
        this.f = dq4VarA;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.g = atomicInteger;
        mjg mjgVarA2 = p90.a(Integer.valueOf(atomicInteger.get()));
        this.h = mjgVarA2;
        this.i = "FolderCountersDataSource-".concat(str);
        t51Var.d(this);
        gy4 gy4Var = new gy4(new xx6[]{sy4Var.n, mjgVarA2}, 1);
        ghb ghbVar = ew5.b;
        e9i.j0(new fz6(tre.G0(gy4Var, qe7.O(1000, lw5.MILLISECONDS)), new qn6(this, (lq4) null, 18), 3), dq4VarA);
    }

    public static final void a(a27 a27Var) {
        mjg mjgVar = a27Var.h;
        Integer numValueOf = Integer.valueOf(a27Var.g.incrementAndGet());
        mjgVar.getClass();
        mjgVar.j(null, numValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object b(a27 a27Var, nq4 nq4Var) {
        z17 z17Var;
        ni3 ni3Var;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof z17) {
            z17Var = (z17) nq4Var;
            int i = z17Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                z17Var.g = i - Integer.MIN_VALUE;
            } else {
                z17Var = new z17(a27Var, nq4Var);
            }
        } else {
            z17Var = new z17(a27Var, nq4Var);
        }
        Object obj = z17Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = z17Var.g;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.n(a27Var.i, "updateCounter");
            r17 r17Var = (r17) a27Var.c.j(a27Var.a).getValue();
            if (r17Var == null) {
                return sbiVar;
            }
            LinkedHashSet linkedHashSet = r17Var.j;
            ni3 li3Var = r17Var.a() ? new li3(linkedHashSet) : new mi3(r17Var.a, r17Var.e, r17Var.d, r17Var.p, r17Var.q, r17Var.g, new zc6(linkedHashSet));
            uy2 uy2Var = a27Var.b;
            z17Var.d = li3Var;
            z17Var.g = 1;
            Object objE = uy2Var.e(li3Var, z17Var);
            if (objE == hu4Var) {
                return hu4Var;
            }
            ni3Var = li3Var;
            obj = objE;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ni3Var = z17Var.d;
            ch3.d0(obj);
        }
        ArrayList arrayListG1 = ww3.G1(a27Var.b.f(ni3Var, BuildConfig.MAX_TIME_TO_UPLOAD, Integer.MAX_VALUE), (List) obj);
        int i3 = 0;
        if (!arrayListG1.isEmpty()) {
            Iterator it = arrayListG1.iterator();
            while (it.hasNext()) {
                if (((rt2) it.next()).b.m > 0 && (i3 = i3 + 1) < 0) {
                    xw3.U0();
                    throw null;
                }
            }
        }
        String str = a27Var.i;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "updateCounter: unreadChatsCount = " + i3 + ", old = " + a27Var.d.getValue(), null);
            }
        }
        mjg mjgVar = a27Var.d;
        ou4 ou4Var = i3 <= 0 ? ou4.b : new ou4(i3);
        mjgVar.getClass();
        mjgVar.j(null, ou4Var);
        return sbiVar;
    }

    @l7h
    public final void onEvent(lc8 lc8Var) {
        yab.i0(this.f, null, 0, new qc5(this, lc8Var, (lq4) null, 17), 3);
    }

    @l7h
    public final void onEvent(wo3 wo3Var) {
        yab.i0(this.f, null, 0, new x17(this, wo3Var, null), 3);
    }

    @l7h
    public final void onEvent(bg9 bg9Var) {
        yab.i0(this.f, null, 0, new y17(bg9Var, this, null), 3);
    }
}

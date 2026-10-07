package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class gm7 {
    public static final long[] g = new long[0];
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public gm7(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
    }

    public static /* synthetic */ Object b(gm7 gm7Var, long j, long j2, mdh mdhVar, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        return gm7Var.a(j, p63.MEMBER, j2, null, -1, mdhVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v7 */
    public final Object a(long j, p63 p63Var, long j2, String str, int i, nq4 nq4Var) {
        fm7 fm7Var;
        Object poeVar;
        ?? r13;
        if (nq4Var instanceof fm7) {
            fm7Var = (fm7) nq4Var;
            int i2 = fm7Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fm7Var.g = i2 - Integer.MIN_VALUE;
            } else {
                fm7Var = new fm7(this, nq4Var);
            }
        } else {
            fm7Var = new fm7(this, nq4Var);
        }
        Object objD = fm7Var.e;
        hu4 hu4Var = hu4.a;
        int i3 = fm7Var.g;
        try {
            if (i3 == 0) {
                ch3.d0(objD);
                wy2 wy2Var = new wy2(j, p63Var.a, j2, i > 0 ? i : ((g5d) ((gjf) this.b.getValue())).j(), str);
                pvb pvbVar = (pvb) this.a.getValue();
                fm7Var.d = this;
                fm7Var.g = 1;
                objD = pvbVar.D(wy2Var, fm7Var);
                this = this;
                if (objD == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i3 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gm7 gm7Var = fm7Var.d;
                ch3.d0(objD);
                r13 = gm7Var;
            }
            q63 q63Var = (q63) objD;
            r13.c(q63Var);
            poeVar = q63Var;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            String name = gm7.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "fail to get chat members", thA);
                }
            }
        }
        return poeVar;
    }

    public final void c(q63 q63Var) {
        List list = q63Var.c;
        if (list.isEmpty()) {
            gm0.Y(gm7.class.getName(), "Early return in handleResponse cuz of response.members.isEmpty()");
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        pw pwVar = new pw(list.size());
        List<o63> list2 = list;
        for (o63 o63Var : list2) {
            arrayList.add(o63Var.a);
            pwVar.add(Long.valueOf(o63Var.a.a));
        }
        if (!arrayList.isEmpty()) {
            ((bi4) this.c.getValue()).m(arrayList, g);
        }
        for (o63 o63Var2 : list2) {
            rfd rfdVar = o63Var2.b;
            if (rfdVar != null) {
                yfd yfdVar = (yfd) this.d.getValue();
                long j = o63Var2.a.a;
                yfdVar.getClass();
                qfd qfdVar = new qfd(rfdVar.a, rfdVar.b);
                l8b l8bVar = ki9.a;
                l8b l8bVar2 = new l8b();
                l8bVar2.l(j, qfdVar);
                yfdVar.I(l8bVar2, ((Boolean) yfdVar.v.i()).booleanValue());
            }
        }
        if (!pwVar.isEmpty()) {
            ((bl8) this.e.getValue()).a(pwVar);
        }
        ((t51) this.f.getValue()).c(new so4(0L, pwVar));
    }
}

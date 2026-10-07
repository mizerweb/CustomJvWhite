package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class wl7 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public wl7(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(long j, long j2, Integer num, nq4 nq4Var) throws Throwable {
        vl7 vl7Var;
        Object poeVar;
        mja mjaVar;
        Object objX;
        wl7 wl7Var;
        if (nq4Var instanceof vl7) {
            vl7Var = (vl7) nq4Var;
            int i = vl7Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                vl7Var.i = i - Integer.MIN_VALUE;
            } else {
                vl7Var = new vl7(this, nq4Var);
            }
        } else {
            vl7Var = new vl7(this, nq4Var);
        }
        vl7 vl7Var2 = vl7Var;
        Object objD = vl7Var2.g;
        int i2 = vl7Var2.i;
        hu4 hu4Var = hu4.a;
        byte b = 0;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    j2 = vl7Var2.e;
                    j = vl7Var2.d;
                    wl7Var = (wl7) vl7Var2.f;
                    ch3.d0(objD);
                } else {
                    if (i2 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mjaVar = (mja) vl7Var2.f;
                    ch3.d0(objD);
                }
                return mjaVar;
            }
            ch3.d0(objD);
            h3b h3bVar = new h3b((kfc) (b == true ? 1 : 0), 6);
            if (j2 == 0) {
                ore.p("param messageIds can't be empty");
                return null;
            }
            h3bVar.f(j, ApiProtocol.PARAM_CHAT_ID);
            h3bVar.f(j2, "messageId");
            if (num != null) {
                h3bVar.a.put("count", num);
            }
            pvb pvbVar = (pvb) this.a.getValue();
            vl7Var2.f = this;
            vl7Var2.d = j;
            vl7Var2.e = j2;
            vl7Var2.i = 1;
            objD = pvbVar.D(h3bVar, vl7Var2);
            if (objD != hu4Var) {
                wl7Var = this;
            }
            return hu4Var;
            poeVar = wl7Var.b((r3b) objD);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            gm0.V(wl7.class.getName(), "Can't load detailed reactions", thA);
        }
        mja mjaVar2 = (mja) (poeVar instanceof poe ? null : poeVar);
        if (mjaVar2 == null) {
            return mjaVar2;
        }
        qja qjaVar = (qja) this.c.getValue();
        long j3 = j;
        long j4 = j2;
        kja kjaVar = mjaVar2.b;
        vl7Var2.f = mjaVar2;
        vl7Var2.d = j3;
        vl7Var2.e = j4;
        vl7Var2.i = 2;
        rt2 rt2Var = (rt2) ((xn3) qjaVar.e.getValue()).l(j3).a.getValue();
        Object obj = sbi.a;
        if (rt2Var != null && (objX = qjaVar.x(rt2Var, j4, kjaVar, vl7Var2)) == hu4Var) {
            obj = objX;
        }
        if (obj != hu4Var) {
            mjaVar = mjaVar2;
            return mjaVar;
        }
        return hu4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [r66] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    public final mja b(r3b r3bVar) {
        ?? arrayList;
        kja kjaVar;
        z5e z5eVar;
        Object next;
        ArrayList<fja> arrayList2 = r3bVar.c;
        ny8 ny8Var = this.b;
        if (arrayList2 != null) {
            arrayList = new ArrayList(yw3.W0(arrayList2, 10));
            for (fja fjaVar : arrayList2) {
                arrayList.add(new gja(fjaVar.a, ((lja) ny8Var.getValue()).b(fjaVar.b.b)));
            }
        } else {
            arrayList = r66.a;
        }
        ?? r4 = arrayList;
        hja hjaVar = r3bVar.d;
        if (hjaVar != null) {
            ArrayList<eja> arrayList3 = hjaVar.a;
            ArrayList arrayList4 = new ArrayList(yw3.W0(arrayList3, 10));
            for (eja ejaVar : arrayList3) {
                arrayList4.add(new jja(((lja) ny8Var.getValue()).e(ejaVar.a), ejaVar.b));
            }
            int i = hjaVar.b;
            dja djaVar = hjaVar.c;
            if (djaVar != null) {
                int i2 = djaVar.a.a;
                y1 y1Var = new y1(0, a6e.d);
                do {
                    if (!y1Var.hasNext()) {
                        next = null;
                        break;
                    }
                    next = y1Var.next();
                } while (((a6e) next).a != i2);
                a6e a6eVar = (a6e) next;
                if (a6eVar == null) {
                    ore.p(zo5.h(i2, "Unknown reactionType = "));
                    return null;
                }
                z5eVar = new z5e(a6eVar, ((lja) ny8Var.getValue()).b(djaVar.b));
            } else {
                z5eVar = null;
            }
            kjaVar = new kja(arrayList4, i, z5eVar);
        } else {
            kjaVar = null;
        }
        fja fjaVar2 = r3bVar.e;
        gja gjaVar = fjaVar2 != null ? new gja(fjaVar2.a, ((lja) ny8Var.getValue()).b(fjaVar2.b.b)) : null;
        Long l = r3bVar.f;
        return new mja(r4, kjaVar, gjaVar, l != null ? l.longValue() : 0L);
    }
}

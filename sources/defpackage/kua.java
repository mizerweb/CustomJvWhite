package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes2.dex */
public final class kua extends a8e {
    public final long r;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public final ny8 v;
    public final String w;
    public long x;
    public final ifh y;

    public kua(long j, ifh ifhVar, ny8 ny8Var, ny8 ny8Var2, gjf gjfVar, i6e i6eVar, Context context, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12) {
        nx2 nx2Var;
        ax2 ax2Var;
        super(i6eVar, context, ny8Var12, ny8Var3, ny8Var2, ny8Var9, ny8Var10);
        this.r = j;
        this.s = ny8Var8;
        this.t = ny8Var7;
        this.u = ny8Var6;
        this.v = ny8Var;
        this.w = kua.class.getName();
        rt2 rt2VarU = U();
        this.x = (rt2VarU == null || (nx2Var = rt2VarU.b) == null || (ax2Var = nx2Var.p) == null) ? 0L : ax2Var.d;
        lq4 lq4Var = null;
        yab.i0(this.b, ((w95) this.e.getValue()).a, 0, new c37(this, lq4Var, 25), 2);
        E();
        rt2 rt2VarU2 = U();
        if (rt2VarU2 != null) {
            long j2 = rt2VarU2.b.j0;
        }
        ((t51) ny8Var.getValue()).d(this);
        e9i.j0(e9i.T(new fz6(new o24(((xn3) this.f.getValue()).k(j), 21, this), new qz9(this, lq4Var, 8), 3), ((w95) ny8Var3.getValue()).a), this.b);
        this.y = new ifh(new s24(this, ifhVar, ny8Var2, ny8Var11, ny8Var4, ny8Var5, gjfVar));
    }

    @Override // defpackage.a8e
    public final Object D(x7e x7eVar, z5e z5eVar, z7e z7eVar) {
        sbi sbiVar = sbi.a;
        Long lV = V();
        if (lV == null) {
            String str = this.w;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.j(this.r, "serverChatId is null for chatId="), null);
                    return sbiVar;
                }
            }
        } else {
            Object objB = ((uj2) this.u.getValue()).b(lV.longValue(), x7eVar.c, z5eVar, z7eVar);
            if (objB == hu4.a) {
                return objB;
            }
        }
        return sbiVar;
    }

    @Override // defpackage.a8e
    public final boolean H() {
        ax2 ax2Var;
        rt2 rt2VarU = U();
        if (rt2VarU != null && !rt2VarU.h0()) {
            nx2 nx2Var = rt2VarU.b;
            if ((nx2Var != null ? nx2Var.p : null) == null) {
                return true;
            }
            if (nx2Var != null && (ax2Var = nx2Var.p) != null && !ax2Var.b) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.a8e
    public final ax2 I() {
        nx2 nx2Var;
        rt2 rt2VarU = U();
        if (rt2VarU == null || (nx2Var = rt2VarU.b) == null) {
            return null;
        }
        return nx2Var.p;
    }

    @Override // defpackage.a8e
    public final int J() {
        ax2 ax2VarI = I();
        rt2 rt2VarU = U();
        if (rt2VarU != null && rt2VarU.h0()) {
            return n6e.a;
        }
        if (ax2VarI == null || !ax2VarI.b) {
            return 0;
        }
        return ax2VarI.c;
    }

    @Override // defpackage.a8e
    public final String M() {
        return this.w;
    }

    @Override // defpackage.a8e
    public final boolean N() {
        rt2 rt2VarU;
        if (this.k && (rt2VarU = U()) != null) {
            return ((!rt2VarU.W() && !rt2VarU.o0()) || rt2VarU.Z() || rt2VarU.n0()) ? false : true;
        }
        return false;
    }

    @Override // defpackage.a8e
    public final Object P(Set set, voc vocVar) {
        pja pjaVar = (pja) this.s.getValue();
        rt2 rt2VarU = U();
        if (rt2VarU != null) {
            Object objX = pjaVar.x(rt2VarU, set, vocVar);
            return objX == hu4.a ? objX : sbi.a;
        }
        ore.p("Required value was null.");
        return null;
    }

    @Override // defpackage.a8e
    public final sbi Q(x7e x7eVar, s5e s5eVar) {
        sbi sbiVar = sbi.a;
        Long lV = V();
        if (lV != null) {
            ygf ygfVar = (ygf) this.t.getValue();
            yab.i0(ygfVar.a, null, 0, new h01(ygfVar, lV.longValue(), x7eVar.c, s5eVar, null, 9), 3);
            return sbiVar;
        }
        String str = this.w;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(this.r, "serverChatId is null for chatId="), null);
            }
        }
        return sbiVar;
    }

    @Override // defpackage.a8e
    public final Object R(ur8 ur8Var) {
        se3 se3Var = (se3) this.y.getValue();
        Object objK0 = yab.K0(se3Var.l, new ke3(se3Var, (lq4) null, 1), ur8Var);
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objK0 != hu4Var) {
            objK0 = sbiVar;
        }
        return objK0 == hu4Var ? objK0 : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0010  */
    @Override // defpackage.a8e
    public final Object S(l0d l0dVar) throws TamErrorException {
        Object objD;
        hu4 hu4Var = hu4.a;
        se3 se3Var = (se3) this.y.getValue();
        sbi sbiVar = sbi.a;
        if (se3Var.j) {
            objD = sbiVar;
        } else {
            se3Var.j = true;
            try {
                sgg sggVar = se3Var.f;
                if (sggVar != null) {
                    sggVar.b(null);
                }
            } catch (Throwable th) {
                gm0.V("se3", "cancel fail!", th);
            }
            objD = se3Var.d(l0dVar);
            if (objD != hu4Var) {
                objD = sbiVar;
            }
        }
        return objD == hu4Var ? objD : sbiVar;
    }

    public final rt2 U() {
        return (rt2) ((xn3) this.f.getValue()).k(this.r).a.getValue();
    }

    public final Long V() {
        rt2 rt2Var = (rt2) ((xn3) this.f.getValue()).k(this.r).a.getValue();
        if (rt2Var != null) {
            return Long.valueOf(rt2Var.A());
        }
        return null;
    }

    @l7h
    public final void onEvent(i03 i03Var) {
        String str = this.w;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, nbh.s(this.r, "onEvent: ChatLastReactionUpdatedEvent: chat.id = ", ", event.lastReactedMessageId = 0"), null);
        }
    }

    @l7h
    public final void onMessageDeleteEvent(j3b j3bVar) {
        if (j3bVar.b != this.r) {
            return;
        }
        Iterator it = j3bVar.e.iterator();
        while (it.hasNext()) {
            this.m.a(((Long) it.next()).longValue());
        }
    }

    @Override // defpackage.a8e, defpackage.a8j
    public final void y() {
        Object poeVar;
        try {
            ((t51) this.v.getValue()).f(this);
            poeVar = sbi.a;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(this.w, "clear error", thA);
        }
        super.y();
    }
}

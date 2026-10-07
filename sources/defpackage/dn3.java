package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dn3 extends wed implements hh9 {
    public final wmi j;
    public final ny8 k;
    public final ny8 l;
    public final int m;

    public dn3(ny8 ny8Var, ny8 ny8Var2, wmi wmiVar) {
        super(wmiVar, "ChatsReactionsSettings", 12);
        this.j = wmiVar;
        this.k = ny8Var;
        this.l = ny8Var2;
        this.m = 50;
    }

    @Override // defpackage.hh9
    public final void c() {
        d(Long.valueOf(((l7f) this.l.getValue()).a()));
    }

    @Override // defpackage.wed
    public final int j() {
        return this.m;
    }

    @Override // defpackage.wed
    public final void m(Object obj, List list, Throwable th) {
        ((Number) obj).longValue();
        String str = this.g;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, c0a.k(list.size(), "Failed to fetch reactions settings for ", " chats"), th);
        }
    }

    @Override // defpackage.wed
    public final Object n(Object obj, List list, Object obj2, qed qedVar) {
        ((Number) obj).longValue();
        String str = this.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, c0a.k(list.size(), "Successfully fetched reactions settings for ", " chats"), null);
            }
        }
        return sbi.a;
    }

    @Override // defpackage.wed
    public final /* bridge */ /* synthetic */ Object o(Object obj, List list, gz gzVar) {
        return v(((Number) obj).longValue(), list, gzVar);
    }

    public final void u(m8b m8bVar) {
        if (m8bVar.i()) {
            gm0.Y(dn3.class.getName(), "Early return because chatIds is empty");
        } else {
            yab.i0(this.j, null, 0, new bn3(m8bVar, this, null, 0), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(long j, List list, lq4 lq4Var) {
        cn3 cn3Var;
        if (lq4Var instanceof cn3) {
            cn3Var = (cn3) lq4Var;
            int i = cn3Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cn3Var.f = i - Integer.MIN_VALUE;
            } else {
                cn3Var = new cn3(this, (nq4) lq4Var);
            }
        } else {
            cn3Var = new cn3(this, (nq4) lq4Var);
        }
        Object obj = cn3Var.d;
        int i2 = cn3Var.f;
        if (i2 == 0) {
            ch3.d0(obj);
            yy2 yy2Var = (yy2) this.k.getValue();
            m8b m8bVarJ0 = rx8.j0(list);
            cn3Var.f = 1;
            Object objA = yy2Var.a(m8bVarJ0, cn3Var);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }
}

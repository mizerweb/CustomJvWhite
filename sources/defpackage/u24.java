package defpackage;

import android.content.Context;
import java.util.Set;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes4.dex */
public final class u24 extends a8e {
    public final q24 r;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public final ny8 v;
    public final String w;
    public final int x;
    public final ifh y;

    public u24(q24 q24Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, i6e i6eVar, Context context, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13) {
        super(i6eVar, context, ny8Var10, ny8Var4, ny8Var3, ny8Var7, ny8Var8);
        this.r = q24Var;
        this.s = ny8Var5;
        this.t = ny8Var6;
        this.u = ny8Var;
        this.v = ny8Var9;
        this.w = u24.class.getName();
        this.x = n6e.a;
        this.y = new ifh(new s24(this, ny8Var4, ny8Var11, ny8Var12, ny8Var9, ny8Var3, ny8Var13, 0));
        lq4 lq4Var = null;
        yab.i0(this.b, ((w95) this.e.getValue()).a, 0, new c37(this, lq4Var, 25), 2);
        E();
        e9i.j0(new fz6(new ra1(6, new o24(((p24) ny8Var2.getValue()).c, 0, q24Var)), new ke3(this, lq4Var, 7), 3), this.b);
    }

    @Override // defpackage.a8e
    public final Object D(x7e x7eVar, z5e z5eVar, z7e z7eVar) {
        Object objB = ((mj2) this.t.getValue()).b(this.r, x7eVar.b, z5eVar, z7eVar);
        return objB == hu4.a ? objB : sbi.a;
    }

    @Override // defpackage.a8e
    public final boolean G() {
        return ((Boolean) ((e5d) this.v.getValue()).q5.a(e5d.S6[330]).i()).booleanValue();
    }

    @Override // defpackage.a8e
    public final boolean H() {
        return !G();
    }

    @Override // defpackage.a8e
    public final ax2 I() {
        return null;
    }

    @Override // defpackage.a8e
    public final int J() {
        return this.x;
    }

    @Override // defpackage.a8e
    public final String M() {
        return this.w;
    }

    @Override // defpackage.a8e
    public final boolean N() {
        return G();
    }

    @Override // defpackage.a8e
    public final Object P(Set set, voc vocVar) {
        Object objW = ((gz3) this.u.getValue()).w(this.r, set, vocVar);
        return objW == hu4.a ? objW : sbi.a;
    }

    @Override // defpackage.a8e
    public final sbi Q(x7e x7eVar, s5e s5eVar) {
        ngf ngfVar = (ngf) this.s.getValue();
        yab.i0((wmi) ngfVar.g.getValue(), null, 0, new me1(ngfVar, this.r, x7eVar.b, s5eVar, ija.EMOJI, (lq4) null), 3);
        return sbi.a;
    }

    @Override // defpackage.a8e
    public final Object R(ur8 ur8Var) {
        a14 a14Var = (a14) this.y.getValue();
        lq4 lq4Var = null;
        if (!a14Var.b()) {
            String str = a14Var.d;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "start - all notifs disabled", null);
                }
            }
        } else if (a14Var.k.compareAndSet(true, false)) {
            a14Var.i.B(a14Var, a14.m[0], yab.h0(a14Var.b, (xt4) a14Var.c.a, 2, new k23(a14Var, lq4Var, 23)));
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x004d A[RETURN] */
    @Override // defpackage.a8e
    public final Object S(l0d l0dVar) throws TamErrorException {
        Object objC;
        hu4 hu4Var = hu4.a;
        a14 a14Var = (a14) this.y.getValue();
        sbi sbiVar = sbi.a;
        if (a14Var.b() || !a14Var.k.get()) {
            if (a14Var.k.compareAndSet(false, true)) {
                a14Var.i.B(a14Var, a14.m[0], null);
                objC = a14Var.c(l0dVar);
                if (objC != hu4Var) {
                }
            }
            if (objC == hu4Var) {
                return objC;
            }
            return sbiVar;
        }
        String str = a14Var.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "stop - all notifs disabled", null);
            }
        }
        objC = sbiVar;
        if (objC == hu4Var) {
            return objC;
        }
        return sbiVar;
    }
}

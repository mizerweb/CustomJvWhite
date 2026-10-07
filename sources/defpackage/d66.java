package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d66 extends a8j {
    public static final /* synthetic */ zv8[] n;
    public final dm c;
    public final f66 d;
    public final xva e;
    public final xhh f;
    public final List g;
    public final ny8 h;
    public final mjg i;
    public final r8e j;
    public final p3c k;
    public final mjg l;
    public final r8e m;

    static {
        z8b z8bVar = new z8b(d66.class, "selectedFindJob", "getSelectedFindJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        n = new zv8[]{z8bVar};
    }

    public d66(ny8 ny8Var, dm dmVar, f66 f66Var, xva xvaVar, xhh xhhVar, wae waeVar, boolean z, ArrayList arrayList) {
        this.c = dmVar;
        this.d = f66Var;
        this.e = xvaVar;
        this.f = xhhVar;
        this.g = arrayList;
        this.h = ny8Var;
        mjg mjgVarA = p90.a(new c66(0, 0, 0, 7));
        this.i = mjgVarA;
        this.j = new r8e(mjgVarA);
        this.k = qyj.S();
        r66 r66Var = r66.a;
        mjg mjgVarA2 = p90.a(new b66(r66Var, r66Var));
        this.l = mjgVarA2;
        this.m = new r8e(mjgVarA2);
        gm0.n(d66.class.getName(), "Load emoji. Start");
        lq4 lq4Var = null;
        if (z) {
            a8j.t(this, ((n0c) xhhVar).b(), new ke3(this, ny8Var, lq4Var, 26), 2);
            return;
        }
        int i = 27;
        bye byeVar = new bye(new jd3(this, lq4Var, i));
        gfb gfbVar = new gfb(waeVar.g().a(xw3.P0(mae.EMOJI, mae.ANIMOJI)), 4);
        xm xmVar = (xm) ny8Var.getValue();
        xmVar.getClass();
        e9i.j0(e9i.T(new fz6(e9i.C(byeVar, gfbVar, new bye(new tm(xmVar, null)), a66.h), new ke3(this, lq4Var, i), 3), ((n0c) xhhVar).b()), this.b);
    }

    public final z46 B(List list, jl jlVar, int i, int i2) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cqk.d(((z46) next).c, jlVar.b));
        z46 z46Var = (z46) next;
        return new z46(i, z46Var != null ? z46Var.b : i2, jlVar.b, null, this.c.a(jlVar.a, jlVar.c, jlVar.e, z46Var != null ? z46Var.e : null, gm0.K(28.0f * yl5.d().getDisplayMetrics().density), 1), jlVar.a, false, 72);
    }

    public final void C(CharSequence charSequence, Boolean bool) {
        boolean zBooleanValue;
        mjg mjgVar = this.l;
        b66 b66Var = (b66) mjgVar.getValue();
        List list = b66Var.a;
        List list2 = b66Var.b;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            z46 z46Var = null;
            if (!it.hasNext()) {
                b66 b66Var2 = new b66(list, arrayList);
                mjgVar.getClass();
                mjgVar.j(null, b66Var2);
                return;
            }
            k79 k79Var = (k79) it.next();
            z46 z46VarI = k79Var instanceof z46 ? (z46) k79Var : null;
            if (z46VarI != null) {
                if (z5h.E0(z46VarI.c, charSequence)) {
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = !z46VarI.g;
                    }
                    z46VarI = z46.i(z46VarI, 0, zBooleanValue, 63);
                }
                z46Var = z46VarI;
            }
            arrayList.add(z46Var);
        }
    }

    public final void D(int i, z56 z56Var) {
        sgg sggVarH0 = yab.h0(this.b, ((n0c) this.f).b(), 2, new qc5(z56Var, i, this, null, 9));
        this.k.B(this, n[0], sggVarH0);
    }
}

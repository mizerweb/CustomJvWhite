package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class jdf extends a8j {
    public final rb8 c;
    public final adf d;
    public final ic6 e = new ic6(null);
    public final ic6 f = new ic6(null);
    public final mjg g;
    public final r8e h;
    public final r8e i;

    public jdf(rb8 rb8Var, adf adfVar) {
        this.c = rb8Var;
        this.d = adfVar;
        q0d q0dVar = new q0d(rb8Var.m, this, 13);
        dq4 dq4Var = this.b;
        a8g a8gVar = j0g.a;
        r66 r66Var = r66.a;
        r8e r8eVarG0 = e9i.G0(q0dVar, dq4Var, a8gVar, r66Var);
        mjg mjgVarA = p90.a(null);
        this.g = mjgVarA;
        r8e r8eVarG1 = e9i.G0(new r07(r8eVarG0, mjgVarA, new vzc(this, (lq4) null, 10), 0), this.b, a8gVar, null);
        this.h = r8eVarG1;
        this.i = e9i.G0(new q0d(new r07(r8eVarG0, r8eVarG1, new vqa(3, (lq4) null, 24), 0), this, 14), this.b, a8gVar, r66Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(nq4 nq4Var) {
        fdf fdfVar;
        if (nq4Var instanceof fdf) {
            fdfVar = (fdf) nq4Var;
            int i = fdfVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fdfVar.f = i - Integer.MIN_VALUE;
            } else {
                fdfVar = new fdf(this, nq4Var);
            }
        } else {
            fdfVar = new fdf(this, nq4Var);
        }
        Object objN = fdfVar.d;
        int i2 = fdfVar.f;
        boolean z = true;
        if (i2 == 0) {
            ch3.d0(objN);
            fdfVar.f = 1;
            rb8 rb8Var = this.c;
            rb8Var.getClass();
            objN = e9i.N(rb8Var.m, fdfVar);
            hu4 hu4Var = hu4.a;
            if (objN == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objN);
        }
        Iterable iterable = (Iterable) objN;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            z = false;
        } else {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((nh7) it.next()).b > 0) {
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

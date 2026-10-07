package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class v9a extends a8j {
    public final long c;
    public final p63 d;
    public final Integer e;
    public final x9a f;
    public final z8a g;
    public final ny8 h;
    public final ifh i;
    public final ny8 j;
    public sgg l;
    public final r8e n;
    public final r8e o;
    public Set k = c76.a;
    public final ifh m = new ifh(new ww8(19, this));

    public v9a(long j, p63 p63Var, ifh ifhVar, Integer num, x9a x9aVar, af7 af7Var, z8a z8aVar, ny8 ny8Var, ny8 ny8Var2) {
        this.c = j;
        this.d = p63Var;
        this.e = num;
        this.f = x9aVar;
        this.g = z8aVar;
        this.h = ny8Var;
        this.i = ifhVar;
        this.j = ny8Var2;
        lq4 lq4Var = null;
        xx6 xx6VarT = e9i.T(e9i.M0(new o24(((baa) ifhVar.getValue()).b(), 17, this), new rgi(lq4Var, this, 8)), ((n0c) ((xhh) ny8Var.getValue())).a());
        dq4 dq4Var = this.b;
        a8g a8gVar = j0g.a;
        r66 r66Var = r66.a;
        r8e r8eVarG0 = e9i.G0(xx6VarT, dq4Var, a8gVar, r66Var);
        this.n = r8eVarG0;
        this.o = e9i.G0(e9i.C(r8eVarG0, ((baa) ifhVar.getValue()).c(), (xx6) af7Var.invoke(), new jn1(this, lq4Var, 2)), this.b, a8gVar, new p9a(r66Var, r66Var, r66Var, false, false));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:70:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0145, code lost:
    
        if (r0 == r7) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object B(defpackage.v9a r11, java.util.List r12, defpackage.x8a r13, defpackage.nq4 r14) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9a.B(v9a, java.util.List, x8a, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(Collection collection, nq4 nq4Var) {
        q9a q9aVar;
        if (nq4Var instanceof q9a) {
            q9aVar = (q9a) nq4Var;
            int i = q9aVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                q9aVar.f = i - Integer.MIN_VALUE;
            } else {
                q9aVar = new q9a(this, nq4Var);
            }
        } else {
            q9aVar = new q9a(this, nq4Var);
        }
        Object objC = q9aVar.d;
        int i2 = q9aVar.f;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objC);
            Collection collection2 = collection;
            vt4 vt4VarB = ((n0c) ((xhh) this.h.getValue())).b();
            if (vt4VarB == null) {
                vt4VarB = q9aVar.getContext();
            }
            dq4 dq4VarA = cqk.a(vt4VarB);
            ArrayList arrayList = new ArrayList(yw3.W0(collection2, 10));
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(yab.h(dq4VarA, null, 0, new af8(it.next(), lq4Var, this, 15), 3));
            }
            q9aVar.f = 1;
            objC = ch3.c(arrayList, q9aVar);
            hu4 hu4Var = hu4.a;
            if (objC == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objC);
        }
        return ww3.o1((Iterable) objC);
    }

    @Override // defpackage.a8j
    public final void y() {
        ((baa) this.i.getValue()).cancel();
    }
}

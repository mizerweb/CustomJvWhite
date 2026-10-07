package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h87 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public h87(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(q87 q87Var, List list, g4b g4bVar, nq4 nq4Var) {
        g87 g87Var;
        if (nq4Var instanceof g87) {
            g87Var = (g87) nq4Var;
            int i = g87Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                g87Var.i = i - Integer.MIN_VALUE;
            } else {
                g87Var = new g87(this, nq4Var);
            }
        } else {
            g87Var = new g87(this, nq4Var);
        }
        Object objB = g87Var.g;
        int i2 = g87Var.i;
        int i3 = 1;
        if (i2 == 0) {
            ch3.d0(objB);
            fl7 fl7Var = (fl7) this.b.getValue();
            g87Var.d = q87Var;
            g87Var.e = list;
            g87Var.f = g4bVar;
            g87Var.i = 1;
            objB = fl7Var.b(q87Var, g4bVar, g87Var);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g4bVar = g87Var.f;
            list = g87Var.e;
            q87Var = g87Var.d;
            ch3.d0(objB);
        }
        List listG1 = (List) objB;
        boolean zIsEmpty = listG1.isEmpty();
        sbi sbiVar = sbi.a;
        if (zIsEmpty) {
            ((h4b) this.d.getValue()).B(f4b.EMPTY_FORWARDS, g4bVar);
            return sbiVar;
        }
        CharSequence charSequence = q87Var.d;
        if (charSequence != null && !r5h.X0(charSequence)) {
            mlf mlfVar = new mlf(0L, charSequence.toString(), true, ((xl7) this.c.getValue()).a(null, charSequence));
            mlfVar.g = g4bVar;
            listG1 = ww3.G1(listG1, Collections.singletonList(new slf(mlfVar)));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            clf clfVar = new clf(((Number) it.next()).longValue(), new LinkedList(listG1), i3);
            clfVar.d = true;
            ((wzj) this.a.getValue()).c(new jlf(clfVar));
        }
        return sbiVar;
    }
}

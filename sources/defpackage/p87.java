package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p87 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public p87(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(q87 q87Var, List list, g4b g4bVar, nq4 nq4Var) {
        o87 o87Var;
        Object obj;
        g4b g4bVar2;
        List list2;
        q87 q87Var2 = q87Var;
        if (nq4Var instanceof o87) {
            o87Var = (o87) nq4Var;
            int i = o87Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                o87Var.i = i - Integer.MIN_VALUE;
            } else {
                o87Var = new o87(this, nq4Var);
            }
        } else {
            o87Var = new o87(this, nq4Var);
        }
        Object obj2 = o87Var.g;
        int i2 = o87Var.i;
        int i3 = 1;
        if (i2 == 0) {
            ch3.d0(obj2);
            fl7 fl7Var = (fl7) this.a.getValue();
            o87Var.d = q87Var2;
            o87Var.e = list;
            o87Var.f = g4bVar;
            o87Var.i = 1;
            Object objB = fl7Var.b(q87Var2, g4bVar, o87Var);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            obj = objB;
            g4bVar2 = g4bVar;
            list2 = list;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g4b g4bVar3 = o87Var.f;
            list2 = o87Var.e;
            q87 q87Var3 = o87Var.d;
            ch3.d0(obj2);
            g4bVar2 = g4bVar3;
            q87Var2 = q87Var3;
            obj = obj2;
        }
        List list3 = (List) obj;
        boolean zIsEmpty = list3.isEmpty();
        sbi sbiVar = sbi.a;
        if (zIsEmpty) {
            ((h4b) this.d.getValue()).B(f4b.EMPTY_FORWARDS, g4bVar2);
            return sbiVar;
        }
        CharSequence charSequence = q87Var2.d;
        ng5 ng5Var = q87Var2.f;
        c79 c79VarW = yab.w();
        if (charSequence != null && !r5h.X0(charSequence)) {
            mlf mlfVar = new mlf(0L, charSequence.toString(), true, ((xl7) this.c.getValue()).a(null, charSequence));
            mlfVar.g = g4bVar2;
            mlfVar.f = ng5Var;
            c79VarW.add(new slf(mlfVar));
        }
        c79VarW.addAll(list3);
        c79 c79VarJ = yab.j(c79VarW);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            clf clfVar = new clf(((Number) it.next()).longValue(), new LinkedList(c79VarJ), i3);
            clfVar.d = true;
            clfVar.f = ng5Var;
            ((wzj) this.b.getValue()).c(new jlf(clfVar));
        }
        return sbiVar;
    }
}

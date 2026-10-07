package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a83 {
    public final wmi a;
    public final String b = a83.class.getName();
    public final ifh c;
    public final ifh d;
    public final ny8 e;
    public final ny8 f;

    public a83(ifh ifhVar, ifh ifhVar2, ny8 ny8Var, ny8 ny8Var2, wmi wmiVar) {
        this.a = wmiVar;
        this.c = ifhVar;
        this.d = ifhVar2;
        this.e = ny8Var;
        this.f = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    public static final w73 a(a83 a83Var, rt2 rt2Var) {
        dnh dnhVarA;
        dnh dnhVarA2;
        ifh ifhVar = a83Var.d;
        w73 w73VarB = ((pi3) a83Var.c.getValue()).b(rt2Var);
        boolean z = ((f5d) ((wo6) a83Var.f.getValue())).b() == 0;
        ru2 ru2Var = new ru2(w73VarB.p, w73VarB.y, w73VarB.w() || w73VarB.x());
        CharSequence charSequence = w73VarB.f;
        qu2 qu2Var = (qu2) ifhVar.getValue();
        dnh dnhVarA3 = null;
        if (z) {
            dnhVarA = null;
        } else {
            if (charSequence == null || charSequence.length() == 0) {
                charSequence = null;
            }
            if (charSequence != null) {
                dnhVarA = cnh.a(qu2Var, charSequence, ru2Var);
            } else {
                dnhVarA = null;
            }
        }
        CharSequence charSequence2 = w73VarB.i;
        o9i o9iVar = (o9i) a83Var.e.getValue();
        if (z) {
            dnhVarA2 = null;
        } else {
            if (charSequence2 == null || charSequence2.length() == 0) {
                charSequence2 = null;
            }
            if (charSequence2 != null) {
                dnhVarA2 = cnh.a(o9iVar, charSequence2, ru2Var);
            } else {
                dnhVarA2 = null;
            }
        }
        CharSequence charSequence3 = w73VarB.g;
        qu2 qu2Var2 = (qu2) ifhVar.getValue();
        if (!z) {
            if (charSequence3 == null || charSequence3.length() == 0) {
                charSequence3 = null;
            }
            if (charSequence3 != null) {
                dnhVarA3 = cnh.a(qu2Var2, charSequence3, ru2Var);
            }
        }
        return w73.o(w73VarB, dnhVarA, dnhVarA3, null, 0, dnhVarA2, z, null, 33551215);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(List list, boolean z, nq4 nq4Var) {
        z73 z73Var;
        if (nq4Var instanceof z73) {
            z73Var = (z73) nq4Var;
            int i = z73Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                z73Var.f = i - Integer.MIN_VALUE;
            } else {
                z73Var = new z73(this, nq4Var);
            }
        } else {
            z73Var = new z73(this, nq4Var);
        }
        Object objC = z73Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = z73Var.f;
        if (i2 == 0) {
            ch3.d0(objC);
            String str = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "ChatModelConverter.toModelsAsync() START: chatsCount=" + list.size() + ", fav=" + z, null);
                }
            }
            List list2 = list;
            wmi wmiVar = this.a;
            ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(yab.h(wmiVar, null, 0, new y73(it.next(), (lq4) null, this), 3));
            }
            z73Var.f = 1;
            objC = ch3.c(arrayList, z73Var);
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
}

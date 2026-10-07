package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class yhf extends zhf {
    public static int k0(ohf ohfVar) {
        Iterator it = ohfVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                xw3.U0();
                throw null;
            }
        }
        return i;
    }

    public static ohf l0(ohf ohfVar, int i) {
        if (i < 0) {
            c.o(c0a.k(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return ohfVar;
        }
        return ohfVar instanceof uv5 ? ((uv5) ohfVar).a(i) : new tv5(ohfVar, i, 0);
    }

    public static qu6 m0(ohf ohfVar, cf7 cf7Var) {
        return new qu6(ohfVar, true, cf7Var);
    }

    public static qu6 n0(ohf ohfVar, cf7 cf7Var) {
        return new qu6(ohfVar, false, cf7Var);
    }

    public static qu6 o0(ohf ohfVar) {
        return n0(ohfVar, new nre(5));
    }

    public static Object p0(ohf ohfVar) {
        Iterator it = ohfVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static kx6 q0(ohf ohfVar, cf7 cf7Var) {
        return new kx6(ohfVar, cf7Var, bif.a);
    }

    public static String r0(ohf ohfVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : ohfVar) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            sb8.d(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static qu6 s0(ohf ohfVar, cf7 cf7Var) {
        return o0(new m2i(ohfVar, cf7Var));
    }

    public static m2i t0(ohf ohfVar, cf7 cf7Var) {
        return new m2i(ohfVar, new yre(4, cf7Var));
    }

    public static ohf u0(ohf ohfVar, int i) {
        if (i < 0) {
            c.o(c0a.k(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return b76.a;
        }
        return ohfVar instanceof uv5 ? ((uv5) ohfVar).b(i) : new tv5(ohfVar, i, 1);
    }

    public static final void v0(ohf ohfVar, AbstractCollection abstractCollection) {
        Iterator it = ohfVar.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List w0(ohf ohfVar) {
        Iterator it = ohfVar.iterator();
        if (!it.hasNext()) {
            return r66.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}

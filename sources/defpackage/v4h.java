package defpackage;

import android.os.Build;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v4h {
    public static final bh0 a = new bh0("camera2.streamSpec.streamUseCase", Long.TYPE, null);
    public static final ul9 b;
    public static final ul9 c;

    static {
        ul9 ul9Var = new ul9();
        int i = Build.VERSION.SDK_INT;
        emi emiVar = emi.d;
        emi emiVar2 = emi.a;
        emi emiVar3 = emi.b;
        if (i >= 33) {
            emi emiVar4 = emi.f;
            emi emiVar5 = emi.c;
            ul9Var.put(4L, a.p1(new emi[]{emiVar3, emiVar4, emiVar5}));
            ul9Var.put(1L, a.p1(new emi[]{emiVar3, emiVar4, emiVar5}));
            ul9Var.put(2L, Collections.singleton(emiVar2));
            ul9Var.put(3L, Collections.singleton(emiVar));
        }
        b = ul9Var.b();
        ul9 ul9Var2 = new ul9();
        if (i >= 33) {
            ul9Var2.put(4L, a.p1(new emi[]{emiVar3, emiVar2, emiVar}));
            ul9Var2.put(3L, a.p1(new emi[]{emiVar3, emiVar}));
        }
        c = ul9Var2.b();
    }

    public static jc2 a(t94 t94Var, Long l) {
        bh0 bh0Var = a;
        if (t94Var.f(bh0Var) && cqk.d(t94Var.i(bh0Var), l)) {
            return null;
        }
        w8b w8bVarH = w8b.h(t94Var);
        w8bVarH.m(bh0Var, l);
        return new jc2(w8bVarH);
    }

    public static boolean b(emi emiVar, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (emiVar != emi.e) {
            Long lValueOf = Long.valueOf(j);
            ul9 ul9Var = b;
            return ul9Var.containsKey(lValueOf) && ((Set) ul9Var.get(Long.valueOf(j))).contains(emiVar);
        }
        Long lValueOf2 = Long.valueOf(j);
        ul9 ul9Var2 = c;
        if (!ul9Var2.containsKey(lValueOf2)) {
            return false;
        }
        Set set = (Set) ul9Var2.get(Long.valueOf(j));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((emi) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(t94 t94Var, emi emiVar) {
        if (((Boolean) t94Var.b(cmi.e1, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        bh0 bh0Var = a68.b;
        if (t94Var.f(bh0Var)) {
            return u4h.$EnumSwitchMapping$0[emiVar.ordinal()] == 1 && ((Number) t94Var.i(bh0Var)).intValue() == 2;
        }
        return false;
    }
}

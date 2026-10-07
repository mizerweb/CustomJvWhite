package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class rm4 {
    public static final Pattern a = Pattern.compile("\\s+");

    public static String a(String str) {
        return str == null ? "" : a.matcher(str.trim()).replaceAll(" ");
    }

    public static void b(di4 di4Var, String str, String str2) {
        if (str == null) {
            di4Var.f.remove(0);
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        boolean zIsEmpty = di4Var.f.isEmpty();
        List list = di4Var.f;
        if (zIsEmpty) {
            list.add(0, new fi4(str, ei4.d, str2));
        } else {
            di4Var.f.set(0, new fi4(str, ((fi4) list.get(0)).c, str2));
        }
    }

    public static ki4 c(pj4 pj4Var, ji4 ji4Var, long j, long j2, long j3) {
        ix2 ix2Var = pj4Var.s;
        ji4 ji4Var2 = ji4.a;
        if (ix2Var != null) {
            ji4Var = (ix2Var.b & np0.o) != 0 ? ji4Var2 : ji4.b;
        }
        long j4 = pj4Var.a;
        if (j4 != j3) {
            ji4Var2 = ji4Var;
        }
        ArrayList arrayListI = pm9.i(pj4Var.e);
        String str = pj4Var.k;
        String str2 = pj4Var.l;
        long j5 = pj4Var.f;
        zba zbaVar = pj4Var.n;
        gi4 gi4Var = zbaVar == null ? null : new gi4(zbaVar.a());
        di4 di4Var = new di4();
        di4Var.a = j4;
        di4Var.f = arrayListI;
        di4Var.n = str;
        di4Var.o = str2;
        di4Var.k = ji4Var2;
        di4Var.b = null;
        di4Var.c = null;
        di4Var.e = j5;
        di4Var.r = j;
        di4Var.s = j2;
        di4Var.t = gi4Var;
        di4Var.u = pj4Var.o;
        di4Var.x = pj4Var.q;
        di4Var.z = ix2Var;
        return di4Var.a();
    }

    public static boolean d(String str, String str2, String str3, String str4) {
        return (a(str).equals(a(str3)) && a(str2).equals(a(str4))) ? false : true;
    }
}

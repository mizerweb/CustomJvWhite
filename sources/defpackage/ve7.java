package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class ve7 {
    public static final lge a = new lge("[^\\p{L}\\p{N}\\p{P}\\p{Z}]");

    public static te7 a(String str) {
        if (r5h.X0(str)) {
            return null;
        }
        String strJ = daf.j(str);
        String upperCase = str.toUpperCase(Locale.getDefault());
        lge lgeVar = a;
        String strD = lgeVar.d("", strJ);
        te7 te7Var = strD.length() > 0 ? new te7(strD, lgeVar.d("", upperCase), null) : null;
        return new te7(strJ, upperCase, (cqk.d(te7Var != null ? te7Var.b : null, upperCase) && cqk.d(te7Var.a, strJ)) ? null : te7Var);
    }

    public static te7 b(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (true) {
            str = null;
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            fi4 fi4Var = (fi4) it.next();
            if (!fi4Var.equals(fi4.e)) {
                String strA = fi4Var.a();
                if (strA.length() != 0) {
                    str = strA;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList<te7> arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                te7 te7VarA = a((String) it2.next());
                if (te7VarA != null) {
                    arrayList2.add(te7VarA);
                }
            }
            if (!arrayList2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                StringBuilder sb4 = new StringBuilder();
                int i = 0;
                for (te7 te7Var : arrayList2) {
                    int i2 = i + 1;
                    String str2 = te7Var.a;
                    te7 te7Var2 = te7Var.c;
                    sb.append(str2);
                    sb2.append(te7Var.b);
                    String str3 = te7Var2 != null ? te7Var2.b : null;
                    if (str3 != null && str3.length() != 0) {
                        sb4.append(te7Var2 != null ? te7Var2.b : null);
                    }
                    String str4 = te7Var2 != null ? te7Var2.a : null;
                    if (str4 != null && str4.length() != 0) {
                        sb3.append(te7Var2 != null ? te7Var2.a : null);
                    }
                    if (i != xw3.O0(arrayList2)) {
                        sb.append(',');
                        sb2.append(',');
                        if (sb4.length() > 0) {
                            sb4.append(',');
                        }
                        if (sb3.length() > 0) {
                            sb3.append(',');
                        }
                    }
                    i = i2;
                }
                return new te7(sb.toString(), sb2.toString(), (sb3.length() > 0 || sb4.length() > 0) ? new te7(sb3.toString(), sb4.toString(), null) : null);
            }
        }
        return null;
    }

    public static String c(String str) {
        return c0a.o("*", str, "*");
    }

    public static String d(String str) {
        return c0a.o("%", str, "%");
    }

    public static ue7 e(String str) {
        te7 te7VarA = a(str);
        if (te7VarA == null) {
            gm0.Y(ve7.class.getName(), "Early return in query cuz of build(query) is null");
            return null;
        }
        te7 te7Var = te7VarA.c;
        String str2 = te7VarA.a;
        String str3 = te7VarA.b;
        return new ue7(new te7(c(str2), c(str3), te7Var != null ? te7.a(te7Var, c(te7Var.b)) : null), new te7(d(str2), d(str3), te7Var != null ? te7.a(te7Var, d(te7Var.b)) : null));
    }
}

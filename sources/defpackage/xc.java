package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class xc {
    public static ArrayList a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(b((fu1) entry.getKey(), (q42) entry.getValue()));
        }
        return arrayList;
    }

    public static eni b(fu1 fu1Var, q42 q42Var) {
        xnh xnhVar = new xnh(q42Var.getName());
        tj0 tj0VarA = gm0.a(q42Var.getName(), Long.valueOf(fu1Var.a));
        String strA = q42Var.a();
        if (strA == null) {
            strA = "";
        }
        return new eni(xnhVar, tj0VarA, strA, fu1Var, q42Var.b());
    }
}

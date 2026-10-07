package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tr3 {
    public final String a;
    public List b = r66.a;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public tr3(String str) {
        this.a = str;
    }

    public static void a(tr3 tr3Var, String str, fif fifVar) {
        if (!tr3Var.d.add(str)) {
            StringBuilder sbV = qt4.v("Element with name '", str, "' is already registered in ");
            sbV.append(tr3Var.a);
            throw new IllegalArgumentException(sbV.toString().toString());
        }
        tr3Var.c.add(str);
        tr3Var.e.add(fifVar);
        tr3Var.f.add(r66.a);
        tr3Var.g.add(false);
    }
}

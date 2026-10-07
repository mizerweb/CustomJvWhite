package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f68 {
    public HashMap a;
    public ArrayList b;

    public f68(HashMap map, ArrayList arrayList) {
        this.a = map;
        this.b = arrayList;
    }

    public void a(i68 i68Var, h68 h68Var, e68 e68Var) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(h68Var);
        b(i68Var, e68Var);
    }

    public void b(i68 i68Var, e68 e68Var) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(i68Var, e68Var);
    }
}

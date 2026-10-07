package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class u64 {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public int d;
    public int e;
    public k74 f;
    public final HashSet g;

    public u64(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(x0e.a(cls));
        for (Class cls2 : clsArr) {
            tre.L(cls2, "Null interface");
            this.b.add(x0e.a(cls2));
        }
    }

    public final void a(ph5 ph5Var) {
        if (this.b.contains(ph5Var.a)) {
            ore.p("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.c.add(ph5Var);
        }
    }

    public final v64 b() {
        if (this.f != null) {
            return new v64(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }
        ore.k("Missing required property: factory.");
        return null;
    }

    public u64(x0e x0eVar, x0e[] x0eVarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(x0eVar);
        for (x0e x0eVar2 : x0eVarArr) {
            tre.L(x0eVar2, "Null interface");
        }
        Collections.addAll(this.b, x0eVarArr);
    }
}

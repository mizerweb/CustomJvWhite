package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v64 {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final k74 f;
    public final Set g;

    public v64(String str, Set set, Set set2, int i, int i2, k74 k74Var, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = k74Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static u64 a(x0e x0eVar) {
        return new u64(x0eVar, new x0e[0]);
    }

    public static u64 b(Class cls) {
        return new u64(cls, new Class[0]);
    }

    public static v64 c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(x0e.a(cls));
        for (Class cls2 : clsArr) {
            tre.L(cls2, "Null interface");
            hashSet.add(x0e.a(cls2));
        }
        return new v64(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new gve(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}

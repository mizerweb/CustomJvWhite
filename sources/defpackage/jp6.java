package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class jp6 {
    public final String a;
    public final Map b;

    public jp6(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static xp9 a(String str) {
        return new xp9(str);
    }

    public static jp6 c(String str) {
        return new jp6(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp6)) {
            return false;
        }
        jp6 jp6Var = (jp6) obj;
        return this.a.equals(jp6Var.a) && this.b.equals(jp6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}

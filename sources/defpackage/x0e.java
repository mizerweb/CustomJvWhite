package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x0e {
    public final Class a;
    public final Class b;

    public x0e(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static x0e a(Class cls) {
        return new x0e(w0e.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x0e.class != obj.getClass()) {
            return false;
        }
        x0e x0eVar = (x0e) obj;
        if (this.b.equals(x0eVar.b)) {
            return this.a.equals(x0eVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == w0e.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}

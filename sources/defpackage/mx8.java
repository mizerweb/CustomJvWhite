package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mx8 implements Comparable {
    public static final mx8 b = new mx8();
    public final int a = 131850;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((mx8) obj).a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        mx8 mx8Var = obj instanceof mx8 ? (mx8) obj : null;
        return mx8Var != null && this.a == mx8Var.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.3.10";
    }
}

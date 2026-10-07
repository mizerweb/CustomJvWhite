package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eh1 implements lh1 {
    public final o29 a;

    public eh1(o29 o29Var) {
        this.a = o29Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eh1) && this.a == ((eh1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LinkInfo(info=" + this.a + ")";
    }
}

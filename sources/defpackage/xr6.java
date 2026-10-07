package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xr6 {
    public final nh0 a;
    public final nh0 b;

    public xr6(nh0 nh0Var) {
        this.a = nh0Var;
        this.b = nh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr6)) {
            return false;
        }
        return this.b.equals(((xr6) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}

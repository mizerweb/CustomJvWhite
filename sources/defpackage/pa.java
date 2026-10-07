package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pa {
    public static final pa d;
    public final xc7 a;
    public final xc7 b;
    public final xc7 c;

    static {
        xc7 xc7Var = xc7.c;
        d = new pa(xc7Var, xc7.k, xc7Var);
    }

    public pa(xc7 xc7Var, xc7 xc7Var2, xc7 xc7Var3) {
        this.a = xc7Var;
        this.b = xc7Var2;
        this.c = xc7Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa)) {
            return false;
        }
        pa paVar = (pa) obj;
        return this.a == paVar.a && this.b == paVar.b && this.c == paVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + nbh.n((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }

    public final String toString() {
        return "AdaptiveTrackSelectionConfig(minFrameSize=" + this.a + ", maxFrameSize=" + this.b + ", adaptiveToViewport=false, adaptiveToViewportMinFrameSize=" + this.c + ")";
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hm0 {
    public static final /* synthetic */ int b = 0;
    public final String a;

    static {
        xw3.P0("space_light", "gradient_light");
        xw3.P0("space_dark", "gradient_dark");
    }

    public hm0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hm0) && cqk.d(this.a, ((hm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("BackgroundNameId(name=", this.a, ")");
    }
}

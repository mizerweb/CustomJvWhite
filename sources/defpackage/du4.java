package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class du4 extends n0 {
    public static final nhb c = new nhb(15);
    public final String b;

    public du4(String str) {
        super(c);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof du4) && this.b.equals(((du4) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return x05.i(new StringBuilder("CoroutineName("), this.b, ')');
    }
}

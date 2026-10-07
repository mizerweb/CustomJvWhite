package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wxg {
    public final long a;

    public /* synthetic */ wxg(long j) {
        this.a = j;
    }

    public static final /* synthetic */ wxg a(long j) {
        return new wxg(j);
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static String c(long j) {
        return nbh.s(j, "StoryId(value=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wxg) {
            return this.a == ((wxg) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}

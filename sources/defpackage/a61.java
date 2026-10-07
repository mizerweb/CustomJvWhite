package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum a61 {
    DEFAULT("DEFAULT"),
    POSITIVE("POSITIVE"),
    NEGATIVE("NEGATIVE"),
    UNKNOWN("UNKNOWN");

    public static final a61[] f = values();
    public final String a;

    a61(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return c0a.o("{value='", this.a, "'}");
    }
}

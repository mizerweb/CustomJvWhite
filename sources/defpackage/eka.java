package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum eka {
    UNKNOWN("UNKNOWN"),
    USER("USER"),
    GROUP("GROUP"),
    CHANNEL("CHANNEL"),
    CHANNEL_ADMIN("CHANNEL_ADMIN");

    public final String a;

    eka(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return c0a.o("{value='", this.a, "'}");
    }
}

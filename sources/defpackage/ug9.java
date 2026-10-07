package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ug9 {
    LOGIN("LOGIN"),
    RECOVERY("RECOVERY"),
    PHONE_BINDING("PHONE_BINDING"),
    PHONE_CONFIRM("PHONE_CONFIRM");

    public final String a;

    ug9(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return c0a.o("{value='", this.a, "'}");
    }
}

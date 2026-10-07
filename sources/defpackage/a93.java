package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum a93 {
    SOUND("SOUND"),
    VIBRATION("VIBR"),
    LED("LED");

    public static final int e = values().length;
    public final String a;

    a93(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return c0a.o("{value='", this.a, "'}");
    }
}

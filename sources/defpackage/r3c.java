package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r3c {
    public static final r3c a;
    public static final /* synthetic */ r3c[] b;

    static {
        r3c r3cVar = new r3c("ALL", 0);
        a = r3cVar;
        b = new r3c[]{r3cVar};
    }

    public static r3c valueOf(String str) {
        return (r3c) Enum.valueOf(r3c.class, str);
    }

    public static r3c[] values() {
        return (r3c[]) b.clone();
    }
}

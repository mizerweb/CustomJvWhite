package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k5c {
    public static final k5c a;
    public static final /* synthetic */ k5c[] b;

    /* JADX INFO: Fake field, exist only in values array */
    k5c EF0;

    static {
        k5c k5cVar = new k5c("SMALL", 0);
        k5c k5cVar2 = new k5c("MEDIUM", 1);
        a = k5cVar2;
        b = new k5c[]{k5cVar, k5cVar2};
    }

    public static k5c valueOf(String str) {
        return (k5c) Enum.valueOf(k5c.class, str);
    }

    public static k5c[] values() {
        return (k5c[]) b.clone();
    }
}

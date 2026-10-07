package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class o9c {
    public static final o9c a;
    public static final o9c b;
    public static final /* synthetic */ o9c[] c;

    static {
        o9c o9cVar = new o9c("NEXT_ON_TOP", 0);
        a = o9cVar;
        o9c o9cVar2 = new o9c("NEXT_UNDER", 1);
        b = o9cVar2;
        c = new o9c[]{o9cVar, o9cVar2};
    }

    public static o9c valueOf(String str) {
        return (o9c) Enum.valueOf(o9c.class, str);
    }

    public static o9c[] values() {
        return (o9c[]) c.clone();
    }
}

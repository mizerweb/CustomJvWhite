package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o7c {
    public static final o7c a;
    public static final o7c b;
    public static final /* synthetic */ o7c[] c;

    static {
        o7c o7cVar = new o7c("BUTTON", 0);
        a = o7cVar;
        o7c o7cVar2 = new o7c("ICON", 1);
        b = o7cVar2;
        c = new o7c[]{o7cVar, o7cVar2};
    }

    public static o7c valueOf(String str) {
        return (o7c) Enum.valueOf(o7c.class, str);
    }

    public static o7c[] values() {
        return (o7c[]) c.clone();
    }
}

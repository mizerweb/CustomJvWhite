package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g9c {
    public static final g9c a;
    public static final g9c b;
    public static final /* synthetic */ g9c[] c;

    static {
        g9c g9cVar = new g9c("DEFAULT", 0);
        a = g9cVar;
        g9c g9cVar2 = new g9c("ANIMATED", 1);
        b = g9cVar2;
        c = new g9c[]{g9cVar, g9cVar2};
    }

    public static g9c valueOf(String str) {
        return (g9c) Enum.valueOf(g9c.class, str);
    }

    public static g9c[] values() {
        return (g9c[]) c.clone();
    }
}

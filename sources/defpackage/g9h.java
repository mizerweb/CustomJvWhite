package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g9h {
    public static final g9h a;
    public static final g9h b;
    public static final g9h c;
    public static final /* synthetic */ g9h[] d;

    static {
        g9h g9hVar = new g9h("SUBSCRIBE", 0);
        a = g9hVar;
        g9h g9hVar2 = new g9h("PROCESSING", 1);
        b = g9hVar2;
        g9h g9hVar3 = new g9h("DONE", 2);
        c = g9hVar3;
        d = new g9h[]{g9hVar, g9hVar2, g9hVar3};
    }

    public static g9h valueOf(String str) {
        return (g9h) Enum.valueOf(g9h.class, str);
    }

    public static g9h[] values() {
        return (g9h[]) d.clone();
    }
}

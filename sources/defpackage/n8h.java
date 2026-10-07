package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@mif
public final class n8h {
    public static final m8h Companion;
    public static final ny8 a;
    public static final n8h b;
    public static final n8h c;
    public static final n8h d;
    public static final n8h e;
    public static final n8h f;
    public static final /* synthetic */ n8h[] g;

    static {
        n8h n8hVar = new n8h("UPDATED", 0);
        b = n8hVar;
        n8h n8hVar2 = new n8h("REMOVED", 1);
        c = n8hVar2;
        n8h n8hVar3 = new n8h("CLEARED", 2);
        d = n8hVar3;
        n8h n8hVar4 = new n8h("OPENED", 3);
        e = n8hVar4;
        n8h n8hVar5 = new n8h("AUTHORIZED", 4);
        f = n8hVar5;
        g = new n8h[]{n8hVar, n8hVar2, n8hVar3, n8hVar4, n8hVar5};
        Companion = new m8h();
        a = rx8.P(2, new yvg(9));
    }

    public static n8h valueOf(String str) {
        return (n8h) Enum.valueOf(n8h.class, str);
    }

    public static n8h[] values() {
        return (n8h[]) g.clone();
    }
}

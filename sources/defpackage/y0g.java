package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y0g {
    public static final y0g a;
    public static final y0g b;
    public static final /* synthetic */ y0g[] c;

    static {
        y0g y0gVar = new y0g("CLOCKWISE", 0);
        a = y0gVar;
        y0g y0gVar2 = new y0g("COUNTERCLOCKWISE", 1);
        b = y0gVar2;
        c = new y0g[]{y0gVar, y0gVar2};
    }

    public static y0g valueOf(String str) {
        return (y0g) Enum.valueOf(y0g.class, str);
    }

    public static y0g[] values() {
        return (y0g[]) c.clone();
    }
}

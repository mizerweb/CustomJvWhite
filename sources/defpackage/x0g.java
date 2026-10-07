package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x0g {
    public static final x0g a;
    public static final x0g b;
    public static final /* synthetic */ x0g[] c;

    static {
        x0g x0gVar = new x0g("DEFAULT", 0);
        a = x0gVar;
        x0g x0gVar2 = new x0g("INCOMING", 1);
        b = x0gVar2;
        c = new x0g[]{x0gVar, x0gVar2, new x0g("ACTIVE", 2), new x0g("NO_CONNECTION", 3)};
    }

    public static x0g valueOf(String str) {
        return (x0g) Enum.valueOf(x0g.class, str);
    }

    public static x0g[] values() {
        return (x0g[]) c.clone();
    }
}

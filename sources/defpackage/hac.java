package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class hac {
    public static final hac a;
    public static final hac b;
    public static final /* synthetic */ hac[] c;

    static {
        hac hacVar = new hac("DEFAULT", 0);
        a = hacVar;
        hac hacVar2 = new hac("PASSWORD", 1);
        b = hacVar2;
        c = new hac[]{hacVar, hacVar2};
    }

    public static hac valueOf(String str) {
        return (hac) Enum.valueOf(hac.class, str);
    }

    public static hac[] values() {
        return (hac[]) c.clone();
    }
}

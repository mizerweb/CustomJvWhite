package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class czb {
    public static final czb a;
    public static final czb b;
    public static final /* synthetic */ czb[] c;

    static {
        czb czbVar = new czb("PRIMARY", 0);
        a = czbVar;
        czb czbVar2 = new czb("SECONDARY", 1);
        b = czbVar2;
        c = new czb[]{czbVar, czbVar2};
    }

    public static czb valueOf(String str) {
        return (czb) Enum.valueOf(czb.class, str);
    }

    public static czb[] values() {
        return (czb[]) c.clone();
    }
}

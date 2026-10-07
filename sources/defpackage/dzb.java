package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dzb {
    public static final dzb a;
    public static final dzb b;
    public static final /* synthetic */ dzb[] c;

    static {
        dzb dzbVar = new dzb("NEUTRAL", 0);
        a = dzbVar;
        dzb dzbVar2 = new dzb("NEGATIVE_AND_POSITIVE", 1);
        b = dzbVar2;
        c = new dzb[]{dzbVar, dzbVar2};
    }

    public static dzb valueOf(String str) {
        return (dzb) Enum.valueOf(dzb.class, str);
    }

    public static dzb[] values() {
        return (dzb[]) c.clone();
    }
}

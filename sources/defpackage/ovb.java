package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ovb {
    public static final ovb a;
    public static final /* synthetic */ ovb[] b;

    static {
        ovb ovbVar = new ovb("DISABLED", 0);
        a = ovbVar;
        b = new ovb[]{ovbVar, new ovb("SOFT", 1), new ovb("HARD", 2)};
    }

    public static ovb valueOf(String str) {
        return (ovb) Enum.valueOf(ovb.class, str);
    }

    public static ovb[] values() {
        return (ovb[]) b.clone();
    }
}

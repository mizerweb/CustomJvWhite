package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class hyb {
    public static final hyb a;
    public static final hyb b;
    public static final /* synthetic */ hyb[] c;

    static {
        hyb hybVar = new hyb("ICON", 0);
        a = hybVar;
        hyb hybVar2 = new hyb("ICON_WITH_TEXT", 1);
        b = hybVar2;
        c = new hyb[]{hybVar, hybVar2};
    }

    public static hyb valueOf(String str) {
        return (hyb) Enum.valueOf(hyb.class, str);
    }

    public static hyb[] values() {
        return (hyb[]) c.clone();
    }
}

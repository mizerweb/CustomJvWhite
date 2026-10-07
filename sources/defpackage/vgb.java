package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vgb {
    public static final vgb a;
    public static final vgb b;
    public static final /* synthetic */ vgb[] c;

    static {
        vgb vgbVar = new vgb("FAILED", 0);
        a = vgbVar;
        vgb vgbVar2 = new vgb("SUCCESS", 1);
        b = vgbVar2;
        c = new vgb[]{vgbVar, vgbVar2};
    }

    public static vgb valueOf(String str) {
        return (vgb) Enum.valueOf(vgb.class, str);
    }

    public static vgb[] values() {
        return (vgb[]) c.clone();
    }
}

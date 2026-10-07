package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class vmi {
    public static final vmi a;
    public static final vmi b;
    public static final vmi c;
    public static final vmi d;
    public static final /* synthetic */ vmi[] e;

    static {
        vmi vmiVar = new vmi("ENABLED", 0);
        a = vmiVar;
        vmi vmiVar2 = new vmi("DISABLED", 1);
        b = vmiVar2;
        vmi vmiVar3 = new vmi("USER_IGNORED", 2);
        c = vmiVar3;
        vmi vmiVar4 = new vmi("UNKNOWN", 3);
        d = vmiVar4;
        e = new vmi[]{vmiVar, vmiVar2, vmiVar3, vmiVar4};
    }

    public static vmi valueOf(String str) {
        return (vmi) Enum.valueOf(vmi.class, str);
    }

    public static vmi[] values() {
        return (vmi[]) e.clone();
    }
}

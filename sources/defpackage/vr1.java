package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class vr1 {
    public static final vr1 a;
    public static final vr1 b;
    public static final /* synthetic */ vr1[] c;

    /* JADX INFO: Fake field, exist only in values array */
    vr1 EF0;

    static {
        vr1 vr1Var = new vr1("UNDEFINE", 0);
        vr1 vr1Var2 = new vr1("MENU", 1);
        a = vr1Var2;
        vr1 vr1Var3 = new vr1("RECORD", 2);
        b = vr1Var3;
        c = new vr1[]{vr1Var, vr1Var2, vr1Var3};
    }

    public static vr1 valueOf(String str) {
        return (vr1) Enum.valueOf(vr1.class, str);
    }

    public static vr1[] values() {
        return (vr1[]) c.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class bu1 {
    public static final bu1 a;
    public static final bu1 b;
    public static final bu1 c;
    public static final /* synthetic */ bu1[] d;

    static {
        bu1 bu1Var = new bu1("CREATOR", 0);
        a = bu1Var;
        bu1 bu1Var2 = new bu1("ADMIN", 1);
        b = bu1Var2;
        bu1 bu1Var3 = new bu1("SPEAKER", 2);
        c = bu1Var3;
        d = new bu1[]{bu1Var, bu1Var2, bu1Var3};
    }

    public static bu1 valueOf(String str) {
        return (bu1) Enum.valueOf(bu1.class, str);
    }

    public static bu1[] values() {
        return (bu1[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class bt3 {
    public static final bt3 a;
    public static final /* synthetic */ bt3[] b;

    /* JADX INFO: Fake field, exist only in values array */
    bt3 EF0;

    static {
        bt3 bt3Var = new bt3("UNKNOWN", 0);
        bt3 bt3Var2 = new bt3("ANDROID_FIREBASE", 1);
        a = bt3Var2;
        b = new bt3[]{bt3Var, bt3Var2};
    }

    public static bt3 valueOf(String str) {
        return (bt3) Enum.valueOf(bt3.class, str);
    }

    public static bt3[] values() {
        return (bt3[]) b.clone();
    }
}

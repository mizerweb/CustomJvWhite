package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class s59 {
    public static final s59 a;
    public static final s59 b;
    public static final s59 c;
    public static final /* synthetic */ s59[] d;

    static {
        s59 s59Var = new s59("CHAT", 0);
        a = s59Var;
        s59 s59Var2 = new s59("CHANNEL", 1);
        b = s59Var2;
        s59 s59Var3 = new s59("USER", 2);
        c = s59Var3;
        d = new s59[]{s59Var, s59Var2, s59Var3};
    }

    public static s59 valueOf(String str) {
        return (s59) Enum.valueOf(s59.class, str);
    }

    public static s59[] values() {
        return (s59[]) d.clone();
    }
}

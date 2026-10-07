package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class l85 {
    public static final l85 a;
    public static final l85 b;
    public static final /* synthetic */ l85[] c;

    static {
        l85 l85Var = new l85("PHONE_RECALL", 0);
        a = l85Var;
        l85 l85Var2 = new l85("OPPONENT_NO_NETWORK", 1);
        b = l85Var2;
        c = new l85[]{l85Var, l85Var2};
    }

    public static l85 valueOf(String str) {
        return (l85) Enum.valueOf(l85.class, str);
    }

    public static l85[] values() {
        return (l85[]) c.clone();
    }
}

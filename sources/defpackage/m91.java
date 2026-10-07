package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class m91 {
    public static final m91 a;
    public static final m91 b;
    public static final m91 c;
    public static final m91 d;
    public static final m91 e;
    public static final m91 f;
    public static final m91 g;
    public static final m91 h;
    public static final /* synthetic */ m91[] i;

    static {
        m91 m91Var = new m91("REQUIRE_AUTH_TO_JOIN", 0);
        a = m91Var;
        m91 m91Var2 = new m91("WAITING_HALL", 1);
        b = m91Var2;
        m91 m91Var3 = new m91("RECURRING", 2);
        c = m91Var3;
        m91 m91Var4 = new m91("FEEDBACK", 3);
        d = m91Var4;
        m91 m91Var5 = new m91("AUDIENCE_MODE", 4);
        e = m91Var5;
        m91 m91Var6 = new m91("ASR", 5);
        f = m91Var6;
        m91 m91Var7 = new m91("WAIT_FOR_ADMIN", 6);
        g = m91Var7;
        m91 m91Var8 = new m91("ADMIN_IS_HERE", 7);
        h = m91Var8;
        i = new m91[]{m91Var, m91Var2, m91Var3, m91Var4, m91Var5, m91Var6, m91Var7, m91Var8};
    }

    public static m91 valueOf(String str) {
        return (m91) Enum.valueOf(m91.class, str);
    }

    public static m91[] values() {
        return (m91[]) i.clone();
    }
}

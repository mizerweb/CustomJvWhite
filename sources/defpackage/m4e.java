package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class m4e {
    public static final m4e a;
    public static final m4e b;
    public static final /* synthetic */ m4e[] c;

    static {
        m4e m4eVar = new m4e("SMALL", 0);
        a = m4eVar;
        m4e m4eVar2 = new m4e("BIG", 1);
        b = m4eVar2;
        c = new m4e[]{m4eVar, m4eVar2};
    }

    public static m4e valueOf(String str) {
        return (m4e) Enum.valueOf(m4e.class, str);
    }

    public static m4e[] values() {
        return (m4e[]) c.clone();
    }
}

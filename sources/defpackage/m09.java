package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m09 {
    private static final /* synthetic */ m09[] $VALUES;
    public static final k09 Companion;
    public static final m09 ON_ANY;
    public static final m09 ON_CREATE;
    public static final m09 ON_DESTROY;
    public static final m09 ON_PAUSE;
    public static final m09 ON_RESUME;
    public static final m09 ON_START;
    public static final m09 ON_STOP;

    static {
        m09 m09Var = new m09("ON_CREATE", 0);
        ON_CREATE = m09Var;
        m09 m09Var2 = new m09("ON_START", 1);
        ON_START = m09Var2;
        m09 m09Var3 = new m09("ON_RESUME", 2);
        ON_RESUME = m09Var3;
        m09 m09Var4 = new m09("ON_PAUSE", 3);
        ON_PAUSE = m09Var4;
        m09 m09Var5 = new m09("ON_STOP", 4);
        ON_STOP = m09Var5;
        m09 m09Var6 = new m09("ON_DESTROY", 5);
        ON_DESTROY = m09Var6;
        m09 m09Var7 = new m09("ON_ANY", 6);
        ON_ANY = m09Var7;
        $VALUES = new m09[]{m09Var, m09Var2, m09Var3, m09Var4, m09Var5, m09Var6, m09Var7};
        Companion = new k09();
    }

    public static m09 valueOf(String str) {
        return (m09) Enum.valueOf(m09.class, str);
    }

    public static m09[] values() {
        return (m09[]) $VALUES.clone();
    }

    public final n09 a() {
        switch (l09.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
                return n09.c;
            case 3:
            case 4:
                return n09.d;
            case 5:
                return n09.e;
            case 6:
                return n09.a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}

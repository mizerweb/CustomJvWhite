package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class eh6 {
    public static final eh6 a;
    public static final /* synthetic */ eh6[] b;

    static {
        eh6 eh6Var = new eh6("NONE", 0);
        a = eh6Var;
        b = new eh6[]{eh6Var, new eh6("SERVICE_UNAVAILABLE", 1), new eh6("PARTICIPANT_LIMIT_REACHED", 2)};
    }

    public static eh6 valueOf(String str) {
        return (eh6) Enum.valueOf(eh6.class, str);
    }

    public static eh6[] values() {
        return (eh6[]) b.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class s90 {
    public static final s90 a;
    public static final s90 b;
    public static final /* synthetic */ s90[] c;

    /* JADX INFO: Fake field, exist only in values array */
    s90 EF0;

    static {
        s90 s90Var = new s90("ACTION_PLAY", 0);
        s90 s90Var2 = new s90("FIRST_BYTES", 1);
        a = s90Var2;
        s90 s90Var3 = new s90("ACTION_READY", 2);
        b = s90Var3;
        c = new s90[]{s90Var, s90Var2, s90Var3, new s90("CONTENT_ERROR", 3)};
    }

    public static s90 valueOf(String str) {
        return (s90) Enum.valueOf(s90.class, str);
    }

    public static s90[] values() {
        return (s90[]) c.clone();
    }
}

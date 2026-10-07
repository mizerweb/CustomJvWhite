package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ty9 {
    public static final ty9 a;
    public static final ty9 b;
    public static final ty9 c;
    public static final ty9 d;
    public static final /* synthetic */ ty9[] e;
    public static final /* synthetic */ ma6 f;

    static {
        ty9 ty9Var = new ty9("UNKNOWN", 0);
        a = ty9Var;
        ty9 ty9Var2 = new ty9("AUDIO_MESSAGE", 1);
        b = ty9Var2;
        ty9 ty9Var3 = new ty9("AUDIO_DRAFT", 2);
        ty9 ty9Var4 = new ty9("AUDIO_RECORD", 3);
        c = ty9Var4;
        ty9 ty9Var5 = new ty9("MUSIC_FILE", 4);
        d = ty9Var5;
        ty9[] ty9VarArr = {ty9Var, ty9Var2, ty9Var3, ty9Var4, ty9Var5};
        e = ty9VarArr;
        f = new ma6(ty9VarArr);
    }

    public static ty9 valueOf(String str) {
        return (ty9) Enum.valueOf(ty9.class, str);
    }

    public static ty9[] values() {
        return (ty9[]) e.clone();
    }
}

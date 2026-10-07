package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a67 {
    public static final a67 a;
    public static final a67 b;
    public static final a67 c;
    public static final a67 d;
    public static final a67 e;
    public static final /* synthetic */ a67[] f;

    static {
        a67 a67Var = new a67("CHAT", 0);
        a = a67Var;
        a67 a67Var2 = new a67("CHANNEL_SINGLE", 1);
        b = a67Var2;
        a67 a67Var3 = new a67("BOT_SINGLE", 2);
        c = a67Var3;
        a67 a67Var4 = new a67("BOT_MANY", 3);
        d = a67Var4;
        a67 a67Var5 = new a67("CHATS", 4);
        e = a67Var5;
        f = new a67[]{a67Var, a67Var2, a67Var3, a67Var4, a67Var5};
    }

    public static a67 valueOf(String str) {
        return (a67) Enum.valueOf(a67.class, str);
    }

    public static a67[] values() {
        return (a67[]) f.clone();
    }
}

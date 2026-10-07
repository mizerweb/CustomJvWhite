package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class msg {
    public static final msg a;
    public static final msg b;
    public static final msg c;
    public static final /* synthetic */ msg[] d;

    static {
        msg msgVar = new msg("ADD", 0);
        a = msgVar;
        msg msgVar2 = new msg("ERROR", 1);
        b = msgVar2;
        msg msgVar3 = new msg("NONE", 2);
        c = msgVar3;
        d = new msg[]{msgVar, msgVar2, msgVar3};
    }

    public static msg valueOf(String str) {
        return (msg) Enum.valueOf(msg.class, str);
    }

    public static msg[] values() {
        return (msg[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class it7 {
    public static final it7 a;
    public static final it7 b;
    public static final it7 c;
    public static final it7 d;
    public static final it7 e;
    public static final it7 f;
    public static final it7 g;
    public static final it7 h;
    public static final it7 i;
    public static final it7 j;
    public static final /* synthetic */ it7[] k;

    static {
        it7 it7Var = new it7("TIMEOUT", 0);
        a = it7Var;
        it7 it7Var2 = new it7("BUSY", 1);
        b = it7Var2;
        it7 it7Var3 = new it7("MISSED", 2);
        it7 it7Var4 = new it7("REJECTED", 3);
        c = it7Var4;
        it7 it7Var5 = new it7("FAILED", 4);
        d = it7Var5;
        it7 it7Var6 = new it7("HUNGUP", 5);
        e = it7Var6;
        it7 it7Var7 = new it7("CANCELED", 6);
        f = it7Var7;
        it7 it7Var8 = new it7("CALL_TIMEOUT", 7);
        g = it7Var8;
        it7 it7Var9 = new it7("REMOVED", 8);
        it7 it7Var10 = new it7("SERVICE_UNAVAILABLE", 9);
        h = it7Var10;
        it7 it7Var11 = new it7("PARTICIPANT_LIMIT_EXCEEDED", 10);
        i = it7Var11;
        it7 it7Var12 = new it7("OBSOLETE_CLIENT", 11);
        j = it7Var12;
        k = new it7[]{it7Var, it7Var2, it7Var3, it7Var4, it7Var5, it7Var6, it7Var7, it7Var8, it7Var9, it7Var10, it7Var11, it7Var12, new it7("BANNED", 12), new it7("ANOTHER_DEVICE", 13), new it7("KILLED", 14), new it7("KILLED_WITHOUT_DELETE", 15), new it7("SOCKET_CLOSED", 16), new it7("INITIALLY_CLOSED", 17)};
    }

    public static it7 valueOf(String str) {
        return (it7) Enum.valueOf(it7.class, str);
    }

    public static it7[] values() {
        return (it7[]) k.clone();
    }
}

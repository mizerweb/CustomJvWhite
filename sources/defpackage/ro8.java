package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ro8 {
    public static final ro8 a;
    public static final ro8 b;
    public static final ro8 c;
    public static final ro8 d;
    public static final ro8 e;
    public static final ro8 f;
    public static final ro8 g;
    public static final ro8 h;
    public static final ro8 i;
    public static final ro8 j;
    public static final /* synthetic */ ro8[] k;

    static {
        ro8 ro8Var = new ro8("VOID", 0);
        a = ro8Var;
        ro8 ro8Var2 = new ro8("INT", 1);
        b = ro8Var2;
        ro8 ro8Var3 = new ro8("LONG", 2);
        c = ro8Var3;
        ro8 ro8Var4 = new ro8("FLOAT", 3);
        d = ro8Var4;
        ro8 ro8Var5 = new ro8("DOUBLE", 4);
        e = ro8Var5;
        ro8 ro8Var6 = new ro8("BOOLEAN", 5);
        f = ro8Var6;
        ro8 ro8Var7 = new ro8("STRING", 6);
        g = ro8Var7;
        c71 c71Var = c71.c;
        ro8 ro8Var8 = new ro8("BYTE_STRING", 7);
        h = ro8Var8;
        ro8 ro8Var9 = new ro8("ENUM", 8);
        i = ro8Var9;
        ro8 ro8Var10 = new ro8("MESSAGE", 9);
        j = ro8Var10;
        k = new ro8[]{ro8Var, ro8Var2, ro8Var3, ro8Var4, ro8Var5, ro8Var6, ro8Var7, ro8Var8, ro8Var9, ro8Var10};
    }

    public static ro8 valueOf(String str) {
        return (ro8) Enum.valueOf(ro8.class, str);
    }

    public static ro8[] values() {
        return (ro8[]) k.clone();
    }
}

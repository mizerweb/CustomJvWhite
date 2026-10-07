package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b81 {
    public static final b81 a;
    public static final b81 b;
    public static final b81 c;
    public static final b81 d;
    public static final b81 e;
    public static final b81 f;
    public static final b81 g;
    public static final b81 h;
    public static final b81 i;
    public static final b81 j;
    public static final b81 k;
    public static final b81 l;
    public static final /* synthetic */ b81[] m;

    static {
        b81 b81Var = new b81("ROOT", 0);
        a = b81Var;
        b81 b81Var2 = new b81("CONSTANT_ROOT", 1);
        b = b81Var2;
        b81 b81Var3 = new b81("IMAGES", 2);
        c = b81Var3;
        b81 b81Var4 = new b81("AUDIO", 3);
        d = b81Var4;
        b81 b81Var5 = new b81("GIF", 4);
        e = b81Var5;
        b81 b81Var6 = new b81("STICKERS", 5);
        f = b81Var6;
        b81 b81Var7 = new b81("UPLOAD", 6);
        g = b81Var7;
        b81 b81Var8 = new b81("MUSIC", 7);
        h = b81Var8;
        b81 b81Var9 = new b81("VIDEO", 8);
        i = b81Var9;
        b81 b81Var10 = new b81("RINGTONE", 9);
        j = b81Var10;
        b81 b81Var11 = new b81("RINGTONE_FILES", 10);
        k = b81Var11;
        b81 b81Var12 = new b81("OTHERS", 11);
        l = b81Var12;
        m = new b81[]{b81Var, b81Var2, b81Var3, b81Var4, b81Var5, b81Var6, b81Var7, b81Var8, b81Var9, b81Var10, b81Var11, b81Var12};
    }

    public static b81 valueOf(String str) {
        return (b81) Enum.valueOf(b81.class, str);
    }

    public static b81[] values() {
        return (b81[]) m.clone();
    }
}

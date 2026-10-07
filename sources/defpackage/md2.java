package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class md2 {
    public static final md2 a;
    public static final md2 b;
    public static final md2 c;
    public static final md2 d;
    public static final /* synthetic */ md2[] e;

    static {
        md2 md2Var = new md2("PhotoDefault", 0);
        a = md2Var;
        md2 md2Var2 = new md2("PhotoTaking", 1);
        b = md2Var2;
        md2 md2Var3 = new md2("VideoDefault", 2);
        c = md2Var3;
        md2 md2Var4 = new md2("VideoRecording", 3);
        d = md2Var4;
        e = new md2[]{md2Var, md2Var2, md2Var3, md2Var4};
    }

    public static md2 valueOf(String str) {
        return (md2) Enum.valueOf(md2.class, str);
    }

    public static md2[] values() {
        return (md2[]) e.clone();
    }
}

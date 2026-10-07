package defpackage;

import org.apache.http.util.VersionInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class yp9 {
    public static final yp9 a;
    public static final yp9 b;
    public static final yp9 c;
    public static final yp9 d;
    public static final yp9 e;
    public static final /* synthetic */ yp9[] f;

    static {
        yp9 yp9Var = new yp9("OFF", 0);
        a = yp9Var;
        yp9 yp9Var2 = new yp9("ON", 1);
        b = yp9Var2;
        yp9 yp9Var3 = new yp9("DISABLED", 2);
        c = yp9Var3;
        yp9 yp9Var4 = new yp9("HIDE", 3);
        d = yp9Var4;
        yp9 yp9Var5 = new yp9(VersionInfo.UNAVAILABLE, 4);
        e = yp9Var5;
        f = new yp9[]{yp9Var, yp9Var2, yp9Var3, yp9Var4, yp9Var5};
    }

    public static yp9 valueOf(String str) {
        return (yp9) Enum.valueOf(yp9.class, str);
    }

    public static yp9[] values() {
        return (yp9[]) f.clone();
    }
}

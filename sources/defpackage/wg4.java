package defpackage;

import org.apache.http.client.methods.HttpDelete;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wg4 {
    public static final wg4 a;
    public static final wg4 b;
    public static final wg4 c;
    public static final wg4 d;
    public static final wg4 e;
    public static final wg4 f;
    public static final wg4 g;
    public static final wg4 h;
    public static final wg4 i;
    public static final wg4 j;
    public static final /* synthetic */ wg4[] k;

    static {
        wg4 wg4Var = new wg4("OPEN_PROFILE", 0);
        a = wg4Var;
        wg4 wg4Var2 = new wg4("SHARE_CONTACT", 1);
        b = wg4Var2;
        wg4 wg4Var3 = new wg4("WRITE", 2);
        c = wg4Var3;
        wg4 wg4Var4 = new wg4("SELECT", 3);
        d = wg4Var4;
        wg4 wg4Var5 = new wg4("BLOCK", 4);
        e = wg4Var5;
        wg4 wg4Var6 = new wg4("UNBLOCK", 5);
        f = wg4Var6;
        wg4 wg4Var7 = new wg4(HttpDelete.METHOD_NAME, 6);
        g = wg4Var7;
        wg4 wg4Var8 = new wg4("AUDIO_CALL", 7);
        h = wg4Var8;
        wg4 wg4Var9 = new wg4("VIDEO_CALL", 8);
        i = wg4Var9;
        wg4 wg4Var10 = new wg4("SUSPEND", 9);
        j = wg4Var10;
        k = new wg4[]{wg4Var, wg4Var2, wg4Var3, wg4Var4, wg4Var5, wg4Var6, wg4Var7, wg4Var8, wg4Var9, wg4Var10};
    }

    public static wg4 valueOf(String str) {
        return (wg4) Enum.valueOf(wg4.class, str);
    }

    public static wg4[] values() {
        return (wg4[]) k.clone();
    }
}

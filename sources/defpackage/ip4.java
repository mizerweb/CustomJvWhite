package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ip4 {
    public static final ip4 a;
    public static final ip4 b;
    public static final ip4 c;
    public static final /* synthetic */ ip4[] d;

    static {
        ip4 ip4Var = new ip4("mp4", 0);
        a = ip4Var;
        ip4 ip4Var2 = new ip4("dash", 1);
        b = ip4Var2;
        ip4 ip4Var3 = new ip4("hls", 2);
        c = ip4Var3;
        d = new ip4[]{ip4Var, ip4Var2, ip4Var3, new ip4("embed", 3), new ip4("webm", 4), new ip4("rtmp", 5)};
    }

    public static ip4 valueOf(String str) {
        return (ip4) Enum.valueOf(ip4.class, str);
    }

    public static ip4[] values() {
        return (ip4[]) d.clone();
    }
}

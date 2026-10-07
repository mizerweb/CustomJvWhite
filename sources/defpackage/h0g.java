package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h0g {
    public static final h0g a;
    public static final h0g b;
    public static final h0g c;
    public static final /* synthetic */ h0g[] d;

    static {
        h0g h0gVar = new h0g("START", 0);
        a = h0gVar;
        h0g h0gVar2 = new h0g("STOP", 1);
        b = h0gVar2;
        h0g h0gVar3 = new h0g("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = h0gVar3;
        d = new h0g[]{h0gVar, h0gVar2, h0gVar3};
    }

    public static h0g valueOf(String str) {
        return (h0g) Enum.valueOf(h0g.class, str);
    }

    public static h0g[] values() {
        return (h0g[]) d.clone();
    }
}

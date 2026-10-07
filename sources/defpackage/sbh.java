package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class sbh {
    public static final sbh a;
    public static final sbh b;
    public static final sbh c;
    public static final sbh d;
    public static final sbh e;
    public static final /* synthetic */ sbh[] f;

    static {
        sbh sbhVar = new sbh("PRIV", 0);
        a = sbhVar;
        sbh sbhVar2 = new sbh("YUV", 1);
        b = sbhVar2;
        sbh sbhVar3 = new sbh("JPEG", 2);
        c = sbhVar3;
        sbh sbhVar4 = new sbh("JPEG_R", 3);
        d = sbhVar4;
        sbh sbhVar5 = new sbh("RAW", 4);
        e = sbhVar5;
        f = new sbh[]{sbhVar, sbhVar2, sbhVar3, sbhVar4, sbhVar5};
    }

    public static sbh valueOf(String str) {
        return (sbh) Enum.valueOf(sbh.class, str);
    }

    public static sbh[] values() {
        return (sbh[]) f.clone();
    }
}

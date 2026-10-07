package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ccd {
    public static final ccd a;
    public static final ccd b;
    public static final ccd c;
    public static final /* synthetic */ ccd[] d;
    public static final /* synthetic */ ma6 e;

    static {
        ccd ccdVar = new ccd("INVISIBLE", 0);
        a = ccdVar;
        ccd ccdVar2 = new ccd("HALF_SCREEN", 1);
        b = ccdVar2;
        ccd ccdVar3 = new ccd("FULL_SCREEN", 2);
        c = ccdVar3;
        ccd[] ccdVarArr = {ccdVar, ccdVar2, ccdVar3};
        d = ccdVarArr;
        e = new ma6(ccdVarArr);
    }

    public static ccd valueOf(String str) {
        return (ccd) Enum.valueOf(ccd.class, str);
    }

    public static ccd[] values() {
        return (ccd[]) d.clone();
    }
}

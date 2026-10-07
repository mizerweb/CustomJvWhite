package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wdc {
    public static final wdc a;
    public static final wdc b;
    public static final wdc c;
    public static final wdc d;
    public static final wdc e;
    public static final wdc f;
    public static final wdc g;
    public static final /* synthetic */ wdc[] h;

    static {
        wdc wdcVar = new wdc("AUTO_TRANSITION", 0);
        a = wdcVar;
        wdc wdcVar2 = new wdc("SEEK", 1);
        b = wdcVar2;
        wdc wdcVar3 = new wdc("SEEK_ADJUSTMENT", 2);
        c = wdcVar3;
        wdc wdcVar4 = new wdc("SKIP", 3);
        d = wdcVar4;
        wdc wdcVar5 = new wdc("REMOVE", 4);
        e = wdcVar5;
        wdc wdcVar6 = new wdc("INTERNAL", 5);
        f = wdcVar6;
        wdc wdcVar7 = new wdc("UNKNOWN", 6);
        g = wdcVar7;
        h = new wdc[]{wdcVar, wdcVar2, wdcVar3, wdcVar4, wdcVar5, wdcVar6, wdcVar7};
    }

    public static wdc valueOf(String str) {
        return (wdc) Enum.valueOf(wdc.class, str);
    }

    public static wdc[] values() {
        return (wdc[]) h.clone();
    }
}

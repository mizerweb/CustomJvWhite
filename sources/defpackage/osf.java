package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class osf {
    public static final osf a;
    public static final osf b;
    public static final osf c;
    public static final osf d;
    public static final osf e;
    public static final osf f;
    public static final /* synthetic */ osf[] g;

    static {
        osf osfVar = new osf("ACTION", 0);
        a = osfVar;
        osf osfVar2 = new osf("SIMPLE", 1);
        b = osfVar2;
        osf osfVar3 = new osf("SIMPLE_WITH_THEMED_ICON", 2);
        c = osfVar3;
        osf osfVar4 = new osf("NEGATIVE", 3);
        d = osfVar4;
        osf osfVar5 = new osf("DISABLE", 4);
        e = osfVar5;
        osf osfVar6 = new osf("SIMPLE_TEXT_ONLY", 5);
        osf osfVar7 = new osf("PROMO", 6);
        f = osfVar7;
        g = new osf[]{osfVar, osfVar2, osfVar3, osfVar4, osfVar5, osfVar6, osfVar7};
    }

    public static osf valueOf(String str) {
        return (osf) Enum.valueOf(osf.class, str);
    }

    public static osf[] values() {
        return (osf[]) g.clone();
    }
}

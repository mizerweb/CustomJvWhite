package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class emi {
    public static final emi a;
    public static final emi b;
    public static final emi c;
    public static final emi d;
    public static final emi e;
    public static final emi f;
    public static final /* synthetic */ emi[] g;

    static {
        emi emiVar = new emi("IMAGE_CAPTURE", 0);
        a = emiVar;
        emi emiVar2 = new emi("PREVIEW", 1);
        b = emiVar2;
        emi emiVar3 = new emi("IMAGE_ANALYSIS", 2);
        c = emiVar3;
        emi emiVar4 = new emi("VIDEO_CAPTURE", 3);
        d = emiVar4;
        emi emiVar5 = new emi("STREAM_SHARING", 4);
        e = emiVar5;
        emi emiVar6 = new emi("METERING_REPEATING", 5);
        f = emiVar6;
        g = new emi[]{emiVar, emiVar2, emiVar3, emiVar4, emiVar5, emiVar6};
    }

    public static emi valueOf(String str) {
        return (emi) Enum.valueOf(emi.class, str);
    }

    public static emi[] values() {
        return (emi[]) g.clone();
    }
}

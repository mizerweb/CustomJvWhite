package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qvd {
    public static final qvd a;
    public static final qvd b;
    public static final qvd c;
    public static final /* synthetic */ qvd[] d;

    static {
        qvd qvdVar = new qvd("PASS_THROUGH", 0);
        a = qvdVar;
        qvd qvdVar2 = new qvd("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        b = qvdVar2;
        qvd qvdVar3 = new qvd("DISCARDING", 2);
        c = qvdVar3;
        d = new qvd[]{qvdVar, qvdVar2, qvdVar3};
    }

    public static qvd valueOf(String str) {
        return (qvd) Enum.valueOf(qvd.class, str);
    }

    public static qvd[] values() {
        return (qvd[]) d.clone();
    }
}

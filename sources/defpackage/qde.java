package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class qde {
    public static final qde a;
    public static final qde b;
    public static final qde c;
    public static final /* synthetic */ qde[] d;

    static {
        qde qdeVar = new qde("NOTHING", 0);
        a = qdeVar;
        qde qdeVar2 = new qde("RECORD", 1);
        b = qdeVar2;
        qde qdeVar3 = new qde("STREAM", 2);
        c = qdeVar3;
        d = new qde[]{qdeVar, qdeVar2, qdeVar3};
    }

    public static qde valueOf(String str) {
        return (qde) Enum.valueOf(qde.class, str);
    }

    public static qde[] values() {
        return (qde[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hnf {
    public static final hnf a;
    public static final hnf b;
    public static final hnf c;
    public static final hnf d;
    public static final /* synthetic */ hnf[] e;

    static {
        hnf hnfVar = new hnf("UPDATE", 0);
        a = hnfVar;
        hnf hnfVar2 = new hnf("REMOVE", 1);
        b = hnfVar2;
        hnf hnfVar3 = new hnf("ACTIVATE", 2);
        c = hnfVar3;
        hnf hnfVar4 = new hnf("TIMEOUT", 3);
        d = hnfVar4;
        e = new hnf[]{hnfVar, hnfVar2, hnfVar3, hnfVar4};
    }

    public static hnf valueOf(String str) {
        return (hnf) Enum.valueOf(hnf.class, str);
    }

    public static hnf[] values() {
        return (hnf[]) e.clone();
    }
}

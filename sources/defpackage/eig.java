package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class eig {
    public static final eig a;
    public static final eig b;
    public static final /* synthetic */ eig[] c;

    static {
        eig eigVar = new eig("EXPANDED", 0);
        a = eigVar;
        eig eigVar2 = new eig("COLLAPSED", 1);
        b = eigVar2;
        c = new eig[]{eigVar, eigVar2};
    }

    public static eig valueOf(String str) {
        return (eig) Enum.valueOf(eig.class, str);
    }

    public static eig[] values() {
        return (eig[]) c.clone();
    }
}

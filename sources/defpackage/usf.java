package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class usf {
    public static final usf a;
    public static final usf b;
    public static final /* synthetic */ usf[] c;

    static {
        usf usfVar = new usf("NONE", 0);
        a = usfVar;
        usf usfVar2 = new usf("DARK", 1);
        b = usfVar2;
        c = new usf[]{usfVar, usfVar2};
    }

    public static usf valueOf(String str) {
        return (usf) Enum.valueOf(usf.class, str);
    }

    public static usf[] values() {
        return (usf[]) c.clone();
    }
}

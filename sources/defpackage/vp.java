package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vp {
    public static final vp a;
    public static final vp b;
    public static final /* synthetic */ vp[] c;

    static {
        vp vpVar = new vp("SAME", 0);
        a = vpVar;
        vp vpVar2 = new vp("NO_SESSION", 1);
        vp vpVar3 = new vp("ANONYMOUS_SESSION", 2);
        b = vpVar3;
        c = new vp[]{vpVar, vpVar2, vpVar3, new vp("SESSION", 3)};
    }

    public static vp valueOf(String str) {
        return (vp) Enum.valueOf(vp.class, str);
    }

    public static vp[] values() {
        return (vp[]) c.clone();
    }
}

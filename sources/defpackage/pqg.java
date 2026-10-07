package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class pqg {
    public static final pqg a;
    public static final pqg b;
    public static final pqg c;
    public static final pqg d;
    public static final pqg e;
    public static final pqg f;
    public static final /* synthetic */ pqg[] g;

    static {
        pqg pqgVar = new pqg("EXPANDED", 0);
        a = pqgVar;
        pqg pqgVar2 = new pqg("COLLAPSING", 1);
        b = pqgVar2;
        pqg pqgVar3 = new pqg("COLLAPSING_STACKED", 2);
        c = pqgVar3;
        pqg pqgVar4 = new pqg("COLLAPSED", 3);
        d = pqgVar4;
        pqg pqgVar5 = new pqg("EXPANDED_STACKED", 4);
        e = pqgVar5;
        pqg pqgVar6 = new pqg("EXPANDING", 5);
        f = pqgVar6;
        g = new pqg[]{pqgVar, pqgVar2, pqgVar3, pqgVar4, pqgVar5, pqgVar6};
    }

    public static pqg valueOf(String str) {
        return (pqg) Enum.valueOf(pqg.class, str);
    }

    public static pqg[] values() {
        return (pqg[]) g.clone();
    }

    public final boolean a() {
        return this == b || this == c;
    }
}

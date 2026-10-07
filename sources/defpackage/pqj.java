package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@mif
public final class pqj {
    public static final oqj Companion;
    public static final ny8 a;
    public static final pqj b;
    public static final pqj c;
    public static final /* synthetic */ pqj[] d;

    static {
        pqj pqjVar = new pqj("SHARED", 0);
        b = pqjVar;
        pqj pqjVar2 = new pqj("CANCELLED", 1);
        c = pqjVar2;
        d = new pqj[]{pqjVar, pqjVar2};
        Companion = new oqj();
        a = rx8.P(2, new o0j(25));
    }

    public static pqj valueOf(String str) {
        return (pqj) Enum.valueOf(pqj.class, str);
    }

    public static pqj[] values() {
        return (pqj[]) d.clone();
    }
}

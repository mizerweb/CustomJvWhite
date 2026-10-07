package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@mif
public final class ojj {
    public static final njj Companion;
    public static final ny8 a;
    public static final ojj b;
    public static final ojj c;
    public static final ojj d;
    public static final /* synthetic */ ojj[] e;

    static {
        ojj ojjVar = new ojj("IMPACT_OCCURED", 0);
        b = ojjVar;
        ojj ojjVar2 = new ojj("NOTIFICATION_OCCURED", 1);
        c = ojjVar2;
        ojj ojjVar3 = new ojj("SELECTION_CHANGED", 2);
        d = ojjVar3;
        e = new ojj[]{ojjVar, ojjVar2, ojjVar3};
        Companion = new njj();
        a = rx8.P(2, new o0j(15));
    }

    public static ojj valueOf(String str) {
        return (ojj) Enum.valueOf(ojj.class, str);
    }

    public static ojj[] values() {
        return (ojj[]) e.clone();
    }
}

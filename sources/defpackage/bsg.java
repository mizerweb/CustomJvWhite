package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bsg {
    public static final bsg a;
    public static final bsg b;
    public static final bsg c;
    public static final bsg d;
    public static final bsg e;
    public static final /* synthetic */ bsg[] f;

    static {
        bsg bsgVar = new bsg("EXPANDED", 0);
        a = bsgVar;
        bsg bsgVar2 = new bsg("EXPANDING", 1);
        b = bsgVar2;
        bsg bsgVar3 = new bsg("COLLAPSING", 2);
        c = bsgVar3;
        bsg bsgVar4 = new bsg("STACKED", 3);
        d = bsgVar4;
        bsg bsgVar5 = new bsg("COLLAPSED", 4);
        e = bsgVar5;
        f = new bsg[]{bsgVar, bsgVar2, bsgVar3, bsgVar4, bsgVar5};
    }

    public static bsg valueOf(String str) {
        return (bsg) Enum.valueOf(bsg.class, str);
    }

    public static bsg[] values() {
        return (bsg[]) f.clone();
    }
}

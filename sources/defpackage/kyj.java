package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kyj {
    public static final kyj a;
    public static final kyj b;
    public static final kyj c;
    public static final kyj d;
    public static final kyj e;
    public static final kyj f;
    public static final /* synthetic */ kyj[] g;

    static {
        kyj kyjVar = new kyj("ENQUEUED", 0);
        a = kyjVar;
        kyj kyjVar2 = new kyj("RUNNING", 1);
        b = kyjVar2;
        kyj kyjVar3 = new kyj("SUCCEEDED", 2);
        c = kyjVar3;
        kyj kyjVar4 = new kyj("FAILED", 3);
        d = kyjVar4;
        kyj kyjVar5 = new kyj("BLOCKED", 4);
        e = kyjVar5;
        kyj kyjVar6 = new kyj("CANCELLED", 5);
        f = kyjVar6;
        g = new kyj[]{kyjVar, kyjVar2, kyjVar3, kyjVar4, kyjVar5, kyjVar6};
    }

    public static kyj valueOf(String str) {
        return (kyj) Enum.valueOf(kyj.class, str);
    }

    public static kyj[] values() {
        return (kyj[]) g.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == f;
    }
}

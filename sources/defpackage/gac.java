package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gac {
    public static final gac a;
    public static final gac b;
    public static final gac c;
    public static final /* synthetic */ gac[] d;

    static {
        gac gacVar = new gac("ERROR", 0);
        a = gacVar;
        gac gacVar2 = new gac("HINT", 1);
        b = gacVar2;
        gac gacVar3 = new gac("DESCRIPTION", 2);
        c = gacVar3;
        d = new gac[]{gacVar, gacVar2, gacVar3};
    }

    public static gac valueOf(String str) {
        return (gac) Enum.valueOf(gac.class, str);
    }

    public static gac[] values() {
        return (gac[]) d.clone();
    }
}

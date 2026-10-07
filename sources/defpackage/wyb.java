package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wyb {
    public static final wyb a;
    public static final wyb b;
    public static final wyb c;
    public static final /* synthetic */ wyb[] d;

    static {
        wyb wybVar = new wyb("THEMED", 0);
        a = wybVar;
        wyb wybVar2 = new wyb("NEUTRAL", 1);
        b = wybVar2;
        wyb wybVar3 = new wyb("SECONDARY", 2);
        c = wybVar3;
        d = new wyb[]{wybVar, wybVar2, wybVar3};
    }

    public static wyb valueOf(String str) {
        return (wyb) Enum.valueOf(wyb.class, str);
    }

    public static wyb[] values() {
        return (wyb[]) d.clone();
    }
}

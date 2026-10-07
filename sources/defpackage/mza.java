package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class mza {
    public static final mza a;
    public static final mza b;
    public static final mza c;
    public static final /* synthetic */ mza[] d;

    static {
        mza mzaVar = new mza("X1", 0);
        a = mzaVar;
        mza mzaVar2 = new mza("X1_5", 1);
        b = mzaVar2;
        mza mzaVar3 = new mza("X2", 2);
        c = mzaVar3;
        d = new mza[]{mzaVar, mzaVar2, mzaVar3};
    }

    public static mza valueOf(String str) {
        return (mza) Enum.valueOf(mza.class, str);
    }

    public static mza[] values() {
        return (mza[]) d.clone();
    }
}

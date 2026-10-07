package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class eha {
    public static final eha a;
    public static final eha b;
    public static final eha c;
    public static final /* synthetic */ eha[] d;

    static {
        eha ehaVar = new eha("DISABLED", 0);
        a = ehaVar;
        eha ehaVar2 = new eha("EXPANDED", 1);
        b = ehaVar2;
        eha ehaVar3 = new eha("COLLAPSED", 2);
        c = ehaVar3;
        d = new eha[]{ehaVar, ehaVar2, ehaVar3};
    }

    public static eha valueOf(String str) {
        return (eha) Enum.valueOf(eha.class, str);
    }

    public static eha[] values() {
        return (eha[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ezb {
    public static final ezb a;
    public static final ezb b;
    public static final ezb c;
    public static final /* synthetic */ ezb[] d;

    static {
        ezb ezbVar = new ezb("DEFAULT", 0);
        a = ezbVar;
        ezb ezbVar2 = new ezb("SMALL", 1);
        b = ezbVar2;
        ezb ezbVar3 = new ezb("BIG", 2);
        c = ezbVar3;
        d = new ezb[]{ezbVar, ezbVar2, ezbVar3};
    }

    public static ezb valueOf(String str) {
        return (ezb) Enum.valueOf(ezb.class, str);
    }

    public static ezb[] values() {
        return (ezb[]) d.clone();
    }
}

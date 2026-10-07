package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class orb {
    public static final orb a;
    public static final orb b;
    public static final orb c;
    public static final /* synthetic */ orb[] d;

    static {
        orb orbVar = new orb("NO_OP", 0);
        a = orbVar;
        orb orbVar2 = new orb("ADD", 1);
        b = orbVar2;
        orb orbVar3 = new orb("REMOVE", 2);
        c = orbVar3;
        d = new orb[]{orbVar, orbVar2, orbVar3};
    }

    public static orb valueOf(String str) {
        return (orb) Enum.valueOf(orb.class, str);
    }

    public static orb[] values() {
        return (orb[]) d.clone();
    }
}

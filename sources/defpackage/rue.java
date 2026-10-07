package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class rue {
    public static final rue a;
    public static final rue b;
    public static final rue c;
    public static final rue d;
    public static final rue e;
    public static final rue f;
    public static final rue g;
    public static final rue h;
    public static final rue i;
    public static final /* synthetic */ rue[] j;

    static {
        rue rueVar = new rue("NEUTRAL", 0);
        a = rueVar;
        rue rueVar2 = new rue("SECONDARY_CONTRAST", 1);
        b = rueVar2;
        rue rueVar3 = new rue("POSITIVE", 2);
        c = rueVar3;
        rue rueVar4 = new rue("NEGATIVE", 3);
        d = rueVar4;
        rue rueVar5 = new rue("SELECTED", 4);
        e = rueVar5;
        rue rueVar6 = new rue("CONTRAST", 5);
        f = rueVar6;
        rue rueVar7 = new rue("INACTIVE", 6);
        g = rueVar7;
        rue rueVar8 = new rue("SELECTED_THEMED", 7);
        h = rueVar8;
        rue rueVar9 = new rue("NONE", 8);
        i = rueVar9;
        j = new rue[]{rueVar, rueVar2, rueVar3, rueVar4, rueVar5, rueVar6, rueVar7, rueVar8, rueVar9};
    }

    public static rue valueOf(String str) {
        return (rue) Enum.valueOf(rue.class, str);
    }

    public static rue[] values() {
        return (rue[]) j.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class cee {
    public static final cee a;
    public static final cee b;
    public static final cee c;
    public static final cee d;
    public static final cee e;
    public static final cee f;
    public static final cee g;
    public static final cee h;
    public static final cee i;
    public static final /* synthetic */ cee[] j;

    static {
        cee ceeVar = new cee("CONFIGURING", 0);
        a = ceeVar;
        cee ceeVar2 = new cee("PENDING_RECORDING", 1);
        b = ceeVar2;
        cee ceeVar3 = new cee("PENDING_PAUSED", 2);
        c = ceeVar3;
        cee ceeVar4 = new cee("IDLING", 3);
        d = ceeVar4;
        cee ceeVar5 = new cee("RECORDING", 4);
        e = ceeVar5;
        cee ceeVar6 = new cee("PAUSED", 5);
        f = ceeVar6;
        cee ceeVar7 = new cee("STOPPING", 6);
        g = ceeVar7;
        cee ceeVar8 = new cee("RESETTING", 7);
        h = ceeVar8;
        cee ceeVar9 = new cee("ERROR", 8);
        i = ceeVar9;
        j = new cee[]{ceeVar, ceeVar2, ceeVar3, ceeVar4, ceeVar5, ceeVar6, ceeVar7, ceeVar8, ceeVar9};
    }

    public static cee valueOf(String str) {
        return (cee) Enum.valueOf(cee.class, str);
    }

    public static cee[] values() {
        return (cee[]) j.clone();
    }
}

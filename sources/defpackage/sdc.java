package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class sdc {
    public static final sdc a;
    public static final sdc b;
    public static final sdc c;
    public static final sdc d;
    public static final sdc e;
    public static final /* synthetic */ sdc[] f;

    static {
        sdc sdcVar = new sdc("SOURCE", 0);
        a = sdcVar;
        sdc sdcVar2 = new sdc("RENDERER", 1);
        b = sdcVar2;
        sdc sdcVar3 = new sdc("UNEXPECTED", 2);
        c = sdcVar3;
        sdc sdcVar4 = new sdc("REMOTE", 3);
        d = sdcVar4;
        sdc sdcVar5 = new sdc("UNRESOLVED", 4);
        e = sdcVar5;
        f = new sdc[]{sdcVar, sdcVar2, sdcVar3, sdcVar4, sdcVar5};
    }

    public static sdc valueOf(String str) {
        return (sdc) Enum.valueOf(sdc.class, str);
    }

    public static sdc[] values() {
        return (sdc[]) f.clone();
    }
}

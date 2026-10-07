package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vdc {
    public static final vdc a;
    public static final vdc b;
    public static final vdc c;
    public static final vdc d;
    public static final vdc e;
    public static final vdc f;
    public static final vdc g;
    public static final vdc h;
    public static final vdc i;
    public static final /* synthetic */ vdc[] j;

    static {
        vdc vdcVar = new vdc("UNKNOWN", 0);
        a = vdcVar;
        vdc vdcVar2 = new vdc("MEDIA", 1);
        b = vdcVar2;
        vdc vdcVar3 = new vdc("MEDIA_INITIALIZATION", 2);
        c = vdcVar3;
        vdc vdcVar4 = new vdc("DRM", 3);
        d = vdcVar4;
        vdc vdcVar5 = new vdc("MANIFEST", 4);
        e = vdcVar5;
        vdc vdcVar6 = new vdc("TIME_SYNCHRONIZATION", 5);
        f = vdcVar6;
        vdc vdcVar7 = new vdc("AD", 6);
        g = vdcVar7;
        vdc vdcVar8 = new vdc("MEDIA_PROGRESSIVE_LIVE", 7);
        h = vdcVar8;
        vdc vdcVar9 = new vdc("UNRESOLVED", 8);
        i = vdcVar9;
        j = new vdc[]{vdcVar, vdcVar2, vdcVar3, vdcVar4, vdcVar5, vdcVar6, vdcVar7, vdcVar8, vdcVar9};
    }

    public static vdc valueOf(String str) {
        return (vdc) Enum.valueOf(vdc.class, str);
    }

    public static vdc[] values() {
        return (vdc[]) j.clone();
    }
}

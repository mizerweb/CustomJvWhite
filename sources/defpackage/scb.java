package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class scb {
    public static final SparseArray a;
    public static final /* synthetic */ scb[] b;

    /* JADX INFO: Fake field, exist only in values array */
    scb EF1;

    static {
        scb scbVar = new scb("MOBILE", 0);
        scb scbVar2 = new scb("WIFI", 1);
        scb scbVar3 = new scb("MOBILE_MMS", 2);
        scb scbVar4 = new scb("MOBILE_SUPL", 3);
        scb scbVar5 = new scb("MOBILE_DUN", 4);
        scb scbVar6 = new scb("MOBILE_HIPRI", 5);
        scb scbVar7 = new scb("WIMAX", 6);
        scb scbVar8 = new scb("BLUETOOTH", 7);
        scb scbVar9 = new scb("DUMMY", 8);
        scb scbVar10 = new scb("ETHERNET", 9);
        scb scbVar11 = new scb("MOBILE_FOTA", 10);
        scb scbVar12 = new scb("MOBILE_IMS", 11);
        scb scbVar13 = new scb("MOBILE_CBS", 12);
        scb scbVar14 = new scb("WIFI_P2P", 13);
        scb scbVar15 = new scb("MOBILE_IA", 14);
        scb scbVar16 = new scb("MOBILE_EMERGENCY", 15);
        scb scbVar17 = new scb("PROXY", 16);
        scb scbVar18 = new scb("VPN", 17);
        scb scbVar19 = new scb("NONE", 18);
        b = new scb[]{scbVar, scbVar2, scbVar3, scbVar4, scbVar5, scbVar6, scbVar7, scbVar8, scbVar9, scbVar10, scbVar11, scbVar12, scbVar13, scbVar14, scbVar15, scbVar16, scbVar17, scbVar18, scbVar19};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, scbVar);
        sparseArray.put(1, scbVar2);
        sparseArray.put(2, scbVar3);
        sparseArray.put(3, scbVar4);
        sparseArray.put(4, scbVar5);
        sparseArray.put(5, scbVar6);
        sparseArray.put(6, scbVar7);
        sparseArray.put(7, scbVar8);
        sparseArray.put(8, scbVar9);
        sparseArray.put(9, scbVar10);
        sparseArray.put(10, scbVar11);
        sparseArray.put(11, scbVar12);
        sparseArray.put(12, scbVar13);
        sparseArray.put(13, scbVar14);
        sparseArray.put(14, scbVar15);
        sparseArray.put(15, scbVar16);
        sparseArray.put(16, scbVar17);
        sparseArray.put(17, scbVar18);
        sparseArray.put(-1, scbVar19);
    }

    public static scb valueOf(String str) {
        return (scb) Enum.valueOf(scb.class, str);
    }

    public static scb[] values() {
        return (scb[]) b.clone();
    }
}

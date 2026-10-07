package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rcb {
    public static final SparseArray a;
    public static final /* synthetic */ rcb[] b;

    /* JADX INFO: Fake field, exist only in values array */
    rcb EF1;

    static {
        rcb rcbVar = new rcb("UNKNOWN_MOBILE_SUBTYPE", 0);
        rcb rcbVar2 = new rcb("GPRS", 1);
        rcb rcbVar3 = new rcb("EDGE", 2);
        rcb rcbVar4 = new rcb("UMTS", 3);
        rcb rcbVar5 = new rcb("CDMA", 4);
        rcb rcbVar6 = new rcb("EVDO_0", 5);
        rcb rcbVar7 = new rcb("EVDO_A", 6);
        rcb rcbVar8 = new rcb("RTT", 7);
        rcb rcbVar9 = new rcb("HSDPA", 8);
        rcb rcbVar10 = new rcb("HSUPA", 9);
        rcb rcbVar11 = new rcb("HSPA", 10);
        rcb rcbVar12 = new rcb("IDEN", 11);
        rcb rcbVar13 = new rcb("EVDO_B", 12);
        rcb rcbVar14 = new rcb("LTE", 13);
        rcb rcbVar15 = new rcb("EHRPD", 14);
        rcb rcbVar16 = new rcb("HSPAP", 15);
        rcb rcbVar17 = new rcb("GSM", 16);
        rcb rcbVar18 = new rcb("TD_SCDMA", 17);
        rcb rcbVar19 = new rcb("IWLAN", 18);
        rcb rcbVar20 = new rcb("LTE_CA", 19);
        b = new rcb[]{rcbVar, rcbVar2, rcbVar3, rcbVar4, rcbVar5, rcbVar6, rcbVar7, rcbVar8, rcbVar9, rcbVar10, rcbVar11, rcbVar12, rcbVar13, rcbVar14, rcbVar15, rcbVar16, rcbVar17, rcbVar18, rcbVar19, rcbVar20, new rcb("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, rcbVar);
        sparseArray.put(1, rcbVar2);
        sparseArray.put(2, rcbVar3);
        sparseArray.put(3, rcbVar4);
        sparseArray.put(4, rcbVar5);
        sparseArray.put(5, rcbVar6);
        sparseArray.put(6, rcbVar7);
        sparseArray.put(7, rcbVar8);
        sparseArray.put(8, rcbVar9);
        sparseArray.put(9, rcbVar10);
        sparseArray.put(10, rcbVar11);
        sparseArray.put(11, rcbVar12);
        sparseArray.put(12, rcbVar13);
        sparseArray.put(13, rcbVar14);
        sparseArray.put(14, rcbVar15);
        sparseArray.put(15, rcbVar16);
        sparseArray.put(16, rcbVar17);
        sparseArray.put(17, rcbVar18);
        sparseArray.put(18, rcbVar19);
        sparseArray.put(19, rcbVar20);
    }

    public static rcb valueOf(String str) {
        return (rcb) Enum.valueOf(rcb.class, str);
    }

    public static rcb[] values() {
        return (rcb[]) b.clone();
    }
}

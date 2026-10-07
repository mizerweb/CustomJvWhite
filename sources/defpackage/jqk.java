package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class jqk {
    private static final SparseArray a;
    private static final SparseArray b;
    static final AtomicReference c;
    private static final Map d;

    static {
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        b = sparseArray2;
        c = new AtomicReference();
        sparseArray.put(-1, l4m.FORMAT_UNKNOWN);
        sparseArray.put(1, l4m.FORMAT_CODE_128);
        sparseArray.put(2, l4m.FORMAT_CODE_39);
        sparseArray.put(4, l4m.FORMAT_CODE_93);
        sparseArray.put(8, l4m.FORMAT_CODABAR);
        sparseArray.put(16, l4m.FORMAT_DATA_MATRIX);
        sparseArray.put(32, l4m.FORMAT_EAN_13);
        sparseArray.put(64, l4m.FORMAT_EAN_8);
        sparseArray.put(np0.m, l4m.FORMAT_ITF);
        sparseArray.put(np0.n, l4m.FORMAT_QR_CODE);
        sparseArray.put(np0.o, l4m.FORMAT_UPC_A);
        sparseArray.put(1024, l4m.FORMAT_UPC_E);
        sparseArray.put(np0.q, l4m.FORMAT_PDF417);
        sparseArray.put(np0.r, l4m.FORMAT_AZTEC);
        sparseArray2.put(0, n4m.TYPE_UNKNOWN);
        sparseArray2.put(1, n4m.TYPE_CONTACT_INFO);
        sparseArray2.put(2, n4m.TYPE_EMAIL);
        sparseArray2.put(3, n4m.TYPE_ISBN);
        sparseArray2.put(4, n4m.TYPE_PHONE);
        sparseArray2.put(5, n4m.TYPE_PRODUCT);
        sparseArray2.put(6, n4m.TYPE_SMS);
        sparseArray2.put(7, n4m.TYPE_TEXT);
        sparseArray2.put(8, n4m.TYPE_URL);
        sparseArray2.put(9, n4m.TYPE_WIFI);
        sparseArray2.put(10, n4m.TYPE_GEO);
        sparseArray2.put(11, n4m.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, n4m.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        d = map;
        map.put(1, cam.CODE_128);
        map.put(2, cam.CODE_39);
        map.put(4, cam.CODE_93);
        map.put(8, cam.CODABAR);
        map.put(16, cam.DATA_MATRIX);
        map.put(32, cam.EAN_13);
        map.put(64, cam.EAN_8);
        map.put(Integer.valueOf(np0.m), cam.ITF);
        map.put(Integer.valueOf(np0.n), cam.QR_CODE);
        map.put(Integer.valueOf(np0.o), cam.UPC_A);
        map.put(1024, cam.UPC_E);
        map.put(Integer.valueOf(np0.q), cam.PDF417);
        map.put(Integer.valueOf(np0.r), cam.AZTEC);
    }

    public static l4m a(int i) {
        l4m l4mVar = (l4m) a.get(i);
        return l4mVar == null ? l4m.FORMAT_UNKNOWN : l4mVar;
    }

    public static n4m b(int i) {
        n4m n4mVar = (n4m) b.get(i);
        return n4mVar == null ? n4m.TYPE_UNKNOWN : n4mVar;
    }

    public static fam c(pp0 pp0Var) {
        int iA = pp0Var.a();
        zvk zvkVar = new zvk();
        if (iA == 0) {
            zvkVar.f(d.values());
        } else {
            for (Map.Entry entry : d.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & iA) != 0) {
                    zvkVar.e((cam) entry.getValue());
                }
            }
        }
        dam damVar = new dam();
        damVar.b(zvkVar.g());
        return damVar.c();
    }

    public static String d() {
        return true != f() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    public static void e(dbm dbmVar, final n3m n3mVar) {
        dbmVar.f(new cbm() { // from class: pmk
            @Override // defpackage.cbm
            public final sam zza() {
                r3m r3mVar = new r3m();
                l3m l3mVar = jqk.f() ? l3m.TYPE_THICK : l3m.TYPE_THIN;
                n3m n3mVar2 = n3mVar;
                r3mVar.e(l3mVar);
                u4m u4mVar = new u4m();
                u4mVar.b(n3mVar2);
                r3mVar.h(u4mVar.c());
                return gbm.e(r3mVar);
            }
        }, p3m.ON_DEVICE_BARCODE_LOAD);
    }

    public static boolean f() {
        AtomicReference atomicReference = c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zC = owl.c(j0b.c().b());
        atomicReference.set(Boolean.valueOf(zC));
        return zC;
    }
}

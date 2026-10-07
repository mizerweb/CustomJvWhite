package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xs9 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ xs9(ArrayList arrayList, int i, String str) {
        this.a = i;
        this.b = str;
        this.c = arrayList;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        int i2 = 1;
        ArrayList arrayList = this.c;
        String str = this.b;
        qxe qxeVar = (qxe) obj;
        switch (i) {
            case 0:
                vxe vxeVarO0 = qxeVar.O0(str);
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        vxeVarO0.c(i2, ((Number) it.next()).longValue());
                        i2++;
                    }
                    int iE = qyj.E(vxeVarO0, "attach_id");
                    int iE2 = qyj.E(vxeVarO0, "attachCount");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (vxeVarO0.M0()) {
                        long j = vxeVarO0.getLong(iE);
                        if (vxeVarO0.isNull(iE2)) {
                            throw new IllegalStateException("The column(s) of the map value object of type '[@MapColumn(\"attachCount\")] Int' are NULL but the map's value type argument expect it to be NON-NULL");
                        }
                        int i3 = (int) vxeVarO0.getLong(iE2);
                        if (!linkedHashMap.containsKey(Long.valueOf(j))) {
                            linkedHashMap.put(Long.valueOf(j), Integer.valueOf(i3));
                        }
                    }
                    vxeVarO0.close();
                    return linkedHashMap;
                } catch (Throwable th) {
                    vxeVarO0.close();
                    throw th;
                }
            case 1:
                vxe vxeVarO1 = qxeVar.O0(str);
                try {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        vxeVarO1.B(i2, (String) it2.next());
                        i2++;
                    }
                    vxeVarO1.M0();
                    return Integer.valueOf(e9i.e0(qxeVar));
                } finally {
                    vxeVarO1.close();
                }
            default:
                vxe vxeVarO2 = qxeVar.O0(str);
                try {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        vxeVarO2.c(i2, ((Number) it3.next()).longValue());
                        i2++;
                    }
                    vxeVarO2.M0();
                    return sbi.a;
                } finally {
                    vxeVarO2.close();
                }
        }
    }
}

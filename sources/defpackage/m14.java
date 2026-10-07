package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m14 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m14(Object obj, kja kjaVar, long j, long j2, int i) {
        this.a = i;
        this.b = obj;
        this.e = kjaVar;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        long j = this.d;
        long j2 = this.c;
        Object obj2 = this.e;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                List list = (List) obj2;
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO0 = qxeVar.O0((String) obj3);
                try {
                    vxeVarO0.c(1, j2);
                    vxeVarO0.c(2, j);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        vxeVarO0.c(i2, ((Number) it.next()).longValue());
                        i2++;
                    }
                    vxeVarO0.M0();
                    return Integer.valueOf(e9i.e0(qxeVar));
                } finally {
                    vxeVarO0.close();
                }
            case 1:
                Collection collection = (Collection) obj2;
                vxe vxeVarO1 = ((qxe) obj).O0((String) obj3);
                try {
                    vxeVarO1.c(1, j2);
                    vxeVarO1.c(2, j);
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        vxeVarO1.c(i2, ((Number) it2.next()).longValue());
                        i2++;
                    }
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO1.M0()) {
                        arrayList.add(Long.valueOf(vxeVarO1.getLong(0)));
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO1.close();
                }
            case 2:
                g24 g24Var = (g24) obj3;
                kja kjaVar = (kja) obj2;
                vxe vxeVarO2 = ((qxe) obj).O0("UPDATE comments SET reactions = ?, reactions_update_time = ? WHERE server_id = ?");
                try {
                    g24Var.a().getClass();
                    byte[] bArrX = pm9.x(kjaVar);
                    if (bArrX == null) {
                        vxeVarO2.e(1);
                    } else {
                        vxeVarO2.d(1, bArrX);
                    }
                    vxeVarO2.c(2, j2);
                    vxeVarO2.c(3, j);
                    vxeVarO2.M0();
                    return sbiVar;
                } finally {
                    vxeVarO2.close();
                }
            default:
                toa toaVar = (toa) obj3;
                kja kjaVar2 = (kja) obj2;
                vxe vxeVarO3 = ((qxe) obj).O0("UPDATE messages SET reactions = ?, reactions_update_time = ? WHERE server_id = ?");
                try {
                    toaVar.e().getClass();
                    byte[] bArrX2 = pm9.x(kjaVar2);
                    if (bArrX2 == null) {
                        vxeVarO3.e(1);
                    } else {
                        vxeVarO3.d(1, bArrX2);
                    }
                    vxeVarO3.c(2, j2);
                    vxeVarO3.c(3, j);
                    vxeVarO3.M0();
                    return sbiVar;
                } finally {
                    vxeVarO3.close();
                }
        }
    }

    public /* synthetic */ m14(String str, long j, long j2, Collection collection, int i) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = collection;
    }
}

package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class goa implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ List d;

    public /* synthetic */ goa(int i, long j, String str, List list) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = list;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        sbi sbiVar = sbi.a;
        int i2 = 2;
        List list = this.d;
        long j = this.c;
        String str = this.b;
        qxe qxeVar = (qxe) obj;
        switch (i) {
            case 0:
                vxe vxeVarO0 = qxeVar.O0(str);
                try {
                    vxeVarO0.c(1, 0L);
                    vxeVarO0.c(2, j);
                    Iterator it = list.iterator();
                    int i3 = 3;
                    while (it.hasNext()) {
                        vxeVarO0.c(i3, ((Number) it.next()).longValue());
                        i3++;
                    }
                    vxeVarO0.M0();
                    return sbiVar;
                } finally {
                    vxeVarO0.close();
                }
            default:
                vxe vxeVarO1 = qxeVar.O0(str);
                try {
                    vxeVarO1.c(1, j);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        vxeVarO1.c(i2, ((Number) it2.next()).longValue());
                        i2++;
                    }
                    vxeVarO1.M0();
                    return sbiVar;
                } finally {
                    vxeVarO1.close();
                }
        }
    }
}

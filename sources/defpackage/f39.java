package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f39 implements cf7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;

    public /* synthetic */ f39(long j, long j2, long j3, Long l, Long l2) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = l;
        this.f = l2;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        sbi sbiVar = sbi.a;
        Serializable serializable = this.f;
        long j = this.d;
        long j2 = this.c;
        long j3 = this.b;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                Long l = (Long) obj2;
                Long l2 = (Long) serializable;
                n65 n65Var = (n65) obj;
                n65Var.a = ":comments";
                n65Var.d(Long.valueOf(j3), "parent_chat_local_id");
                n65Var.d(Long.valueOf(j2), "parent_chat_server_id");
                n65Var.d(Long.valueOf(j), "parent_message_server_id");
                if (l != null) {
                    n65Var.d(Long.valueOf(l.longValue()), "load_mark");
                }
                if (l2 != null) {
                    n65Var.d(Long.valueOf(l2.longValue()), "message_id");
                }
                n65Var.d(Boolean.TRUE, "highlight_message");
                return sbiVar;
            default:
                ArrayList arrayList = (ArrayList) serializable;
                vxe vxeVarO0 = ((qxe) obj).O0((String) obj2);
                try {
                    vxeVarO0.c(1, j3);
                    vxeVarO0.c(2, j2);
                    vxeVarO0.c(3, j);
                    Iterator it = arrayList.iterator();
                    int i2 = 4;
                    while (it.hasNext()) {
                        vxeVarO0.c(i2, ((Number) it.next()).longValue());
                        i2++;
                    }
                    vxeVarO0.M0();
                    return sbiVar;
                } finally {
                    vxeVarO0.close();
                }
        }
    }

    public /* synthetic */ f39(String str, long j, long j2, long j3, ArrayList arrayList) {
        this.e = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.f = arrayList;
    }
}

package defpackage;

import androidx.work.impl.model.WorkersQueueDao_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yn6 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    public /* synthetic */ yn6(int i, String str, List list) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        long j;
        int i = this.a;
        sbi sbiVar = sbi.a;
        int i2 = 1;
        List list = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                vxe vxeVarO0 = ((qxe) obj).O0(str);
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        vxeVarO0.c(i2, ((Number) it.next()).longValue());
                        i2++;
                    }
                    int iE = qyj.E(vxeVarO0, "last_notify_msg_id");
                    int iE2 = qyj.E(vxeVarO0, "chat_id");
                    int iE3 = qyj.E(vxeVarO0, "post_id");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        arrayList.add(new ao6(new ilb(vxeVarO0.getLong(iE2), vxeVarO0.getLong(iE3)), vxeVarO0.getLong(iE)));
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO0.close();
                }
            case 1:
                vxe vxeVarO1 = ((qxe) obj).O0(str);
                try {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        vxeVarO1.c(i2, ((Number) it2.next()).longValue());
                        i2++;
                    }
                    int iE4 = qyj.E(vxeVarO1, "mark");
                    int iE5 = qyj.E(vxeVarO1, "chat_id");
                    int iE6 = qyj.E(vxeVarO1, "post_id");
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO1.M0()) {
                        arrayList2.add(new xmb(new ilb(vxeVarO1.getLong(iE5), vxeVarO1.getLong(iE6)), vxeVarO1.getLong(iE4)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    vxeVarO1.close();
                }
            case 2:
                vxe vxeVarO2 = ((qxe) obj).O0(str);
                try {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        vxeVarO2.c(i2, ((Number) it3.next()).longValue());
                        i2++;
                    }
                    int iE7 = qyj.E(vxeVarO2, "id");
                    int iE8 = qyj.E(vxeVarO2, "phonebook_id");
                    int iE9 = qyj.E(vxeVarO2, "contact_id");
                    int iE10 = qyj.E(vxeVarO2, "phone");
                    int iE11 = qyj.E(vxeVarO2, "phone_key");
                    int iE12 = qyj.E(vxeVarO2, "server_phone");
                    int iE13 = qyj.E(vxeVarO2, "email");
                    int iE14 = qyj.E(vxeVarO2, "first_name");
                    int iE15 = qyj.E(vxeVarO2, "last_name");
                    int iE16 = qyj.E(vxeVarO2, "avatar_path");
                    int iE17 = qyj.E(vxeVarO2, "type");
                    ArrayList arrayList3 = new ArrayList();
                    while (vxeVarO2.M0()) {
                        int i3 = iE8;
                        int i4 = iE9;
                        arrayList3.add(new stc(vxeVarO2.getLong(iE7), vxeVarO2.getLong(iE8), (int) vxeVarO2.getLong(iE9), vxeVarO2.B0(iE10), vxeVarO2.B0(iE11), vxeVarO2.getLong(iE12), vxeVarO2.isNull(iE13) ? null : vxeVarO2.B0(iE13), vxeVarO2.B0(iE14), vxeVarO2.isNull(iE15) ? null : vxeVarO2.B0(iE15), vxeVarO2.isNull(iE16) ? null : vxeVarO2.B0(iE16), iic.h((int) vxeVarO2.getLong(iE17))));
                        iE8 = i3;
                        iE9 = i4;
                        break;
                    }
                    return arrayList3;
                } finally {
                    vxeVarO2.close();
                }
            case 3:
                vxe vxeVarO3 = ((qxe) obj).O0(str);
                try {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        vxeVarO3.B(i2, (String) it4.next());
                        i2++;
                    }
                    vxeVarO3.M0();
                    return sbiVar;
                } finally {
                    vxeVarO3.close();
                }
            case 4:
                vxe vxeVarO4 = ((qxe) obj).O0(str);
                try {
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        vxeVarO4.c(i2, ((Number) it5.next()).longValue());
                        i2++;
                    }
                    vxeVarO4.M0();
                    return sbiVar;
                } finally {
                    vxeVarO4.close();
                }
            case 5:
                vxe vxeVarO5 = ((qxe) obj).O0(str);
                try {
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        vxeVarO5.c(i2, ((ctc) it6.next()).a);
                        i2++;
                    }
                    if (vxeVarO5.M0()) {
                        j = vxeVarO5.getLong(0);
                        break;
                    } else {
                        j = 0;
                    }
                    return Long.valueOf(j);
                } finally {
                    vxeVarO5.close();
                }
            case 6:
                vxe vxeVarO6 = ((qxe) obj).O0(str);
                try {
                    Iterator it7 = list.iterator();
                    while (it7.hasNext()) {
                        vxeVarO6.c(i2, ((rkh) it7.next()).a);
                        i2++;
                    }
                    return Integer.valueOf(vxeVarO6.M0() ? (int) vxeVarO6.getLong(0) : 0);
                } finally {
                    vxeVarO6.close();
                }
            default:
                return WorkersQueueDao_Impl.delete$lambda$0(str, list, (qxe) obj);
        }
    }

    public /* synthetic */ yn6(String str, List list, xkh xkhVar, int i) {
        this.a = i;
        this.b = str;
        this.c = list;
    }
}

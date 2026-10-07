package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tj1 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    public /* synthetic */ tj1(int i, Object obj, String str, List list) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        s8 s8Var;
        ye6 ye6Var;
        gj2 gj2Var;
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
                    vxeVarO0.M0();
                    return sbiVar;
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
                    vxeVarO1.M0();
                    return sbiVar;
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
                    int iE = qyj.E(vxeVarO2, "id");
                    int iE2 = qyj.E(vxeVarO2, "chat_id");
                    int iE3 = qyj.E(vxeVarO2, "message_id");
                    int iE4 = qyj.E(vxeVarO2, "attach_id");
                    int iE5 = qyj.E(vxeVarO2, "type");
                    int iE6 = qyj.E(vxeVarO2, "size");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO2.M0()) {
                        arrayList.add(new zs9(vxeVarO2.getLong(iE), vxeVarO2.getLong(iE2), vxeVarO2.getLong(iE3), vxeVarO2.getLong(iE4), (int) vxeVarO2.getLong(iE5), vxeVarO2.getLong(iE6)));
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO2.close();
                }
            case 3:
                vxe vxeVarO3 = ((qxe) obj).O0(str);
                try {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        vxeVarO3.c(i2, ((Number) it4.next()).longValue());
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
                    int i3 = 1;
                    while (it5.hasNext()) {
                        vxeVarO4.B(i3, (String) it5.next());
                        i3++;
                    }
                    int iE7 = qyj.E(vxeVarO4, "traceId");
                    int iE8 = qyj.E(vxeVarO4, "metricName");
                    int iE9 = qyj.E(vxeVarO4, "lastUpdatedTime");
                    int iE10 = qyj.E(vxeVarO4, "spanAndPropertiesDump");
                    int iE11 = qyj.E(vxeVarO4, "attempt");
                    int iE12 = qyj.E(vxeVarO4, "isMarkedAsFailed");
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO4.M0()) {
                        arrayList2.add(new txa(vxeVarO4.B0(iE7), vxeVarO4.B0(iE8), vxeVarO4.getLong(iE9), (ekg) sia.mergeFrom(new ekg(), vxeVarO4.getBlob(iE10)), vxeVarO4.getLong(iE11), ((int) vxeVarO4.getLong(iE12)) != 0));
                        break;
                    }
                    return arrayList2;
                } finally {
                    vxeVarO4.close();
                }
            case 5:
                vxe vxeVarO5 = ((qxe) obj).O0(str);
                try {
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        vxeVarO5.B(i2, (String) it6.next());
                        i2++;
                    }
                    vxeVarO5.M0();
                    return sbiVar;
                } finally {
                    vxeVarO5.close();
                }
            case 6:
                vxe vxeVarO6 = ((qxe) obj).O0(str);
                try {
                    Iterator it7 = list.iterator();
                    while (it7.hasNext()) {
                        vxeVarO6.c(i2, ((mae) it7.next()).a);
                        i2++;
                    }
                    int iE13 = qyj.E(vxeVarO6, "id");
                    int iE14 = qyj.E(vxeVarO6, "recent_type");
                    int iE15 = qyj.E(vxeVarO6, "recent_time");
                    int iE16 = qyj.E(vxeVarO6, "server_id");
                    int iE17 = qyj.E(vxeVarO6, "sticker_id");
                    int iE18 = qyj.E(vxeVarO6, "emoji");
                    int iE19 = qyj.E(vxeVarO6, "gif");
                    int iE20 = qyj.E(vxeVarO6, "gif_id");
                    ArrayList arrayList3 = new ArrayList();
                    while (vxeVarO6.M0()) {
                        if (vxeVarO6.isNull(iE17)) {
                            s8Var = null;
                        } else {
                            s8Var = new s8();
                            s8Var.a = vxeVarO6.getLong(iE17);
                        }
                        if (vxeVarO6.isNull(iE18)) {
                            ye6Var = null;
                        } else {
                            ye6Var = new ye6();
                            ye6Var.a = vxeVarO6.B0(iE18);
                        }
                        if (vxeVarO6.isNull(iE19) && vxeVarO6.isNull(iE20)) {
                            gj2Var = null;
                        } else {
                            gj2Var = new gj2(5);
                            gj2Var.c = vxeVarO6.getBlob(iE19);
                            gj2Var.b = vxeVarO6.getLong(iE20);
                        }
                        bae baeVar = new bae();
                        ye6 ye6Var2 = ye6Var;
                        baeVar.a = vxeVarO6.getLong(iE13);
                        baeVar.b = mnl.c(vxeVarO6.isNull(iE14) ? null : Integer.valueOf((int) vxeVarO6.getLong(iE14)));
                        baeVar.c = vxeVarO6.getLong(iE15);
                        baeVar.d = vxeVarO6.getLong(iE16);
                        baeVar.e = s8Var;
                        baeVar.f = ye6Var2;
                        baeVar.g = gj2Var;
                        arrayList3.add(baeVar);
                        break;
                    }
                    return arrayList3;
                } finally {
                    vxeVarO6.close();
                }
            case 7:
                vxe vxeVarO7 = ((qxe) obj).O0(str);
                try {
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        vxeVarO7.B(i2, (String) it8.next());
                        i2++;
                    }
                    vxeVarO7.M0();
                    return sbiVar;
                } finally {
                    vxeVarO7.close();
                }
            case 8:
                vxe vxeVarO8 = ((qxe) obj).O0(str);
                try {
                    Iterator it9 = list.iterator();
                    while (it9.hasNext()) {
                        vxeVarO8.c(i2, ((Number) it9.next()).longValue());
                        i2++;
                    }
                    vxeVarO8.M0();
                    return sbiVar;
                } finally {
                    vxeVarO8.close();
                }
            case 9:
                vxe vxeVarO9 = ((qxe) obj).O0(str);
                try {
                    Iterator it10 = list.iterator();
                    while (it10.hasNext()) {
                        vxeVarO9.c(i2, ((ctc) it10.next()).a);
                        i2++;
                    }
                    int iE21 = qyj.E(vxeVarO9, "id");
                    int iE22 = qyj.E(vxeVarO9, "type");
                    int iE23 = qyj.E(vxeVarO9, "status");
                    int iE24 = qyj.E(vxeVarO9, "fails_count");
                    int iE25 = qyj.E(vxeVarO9, "depends_request_id");
                    int iE26 = qyj.E(vxeVarO9, "dependency_type");
                    int iE27 = qyj.E(vxeVarO9, "data");
                    int iE28 = qyj.E(vxeVarO9, "created_time");
                    ArrayList arrayList4 = new ArrayList();
                    while (vxeVarO9.M0()) {
                        int i4 = iE22;
                        int i5 = iE23;
                        arrayList4.add(new ujh(vxeVarO9.getLong(iE21), xvc.x((int) vxeVarO9.getLong(iE22)), xvc.w((int) vxeVarO9.getLong(iE23)), (int) vxeVarO9.getLong(iE24), vxeVarO9.getLong(iE25), (int) vxeVarO9.getLong(iE26), vxeVarO9.getBlob(iE27), vxeVarO9.getLong(iE28)));
                        iE22 = i4;
                        iE23 = i5;
                        break;
                    }
                    return arrayList4;
                } finally {
                    vxeVarO9.close();
                }
            default:
                vxe vxeVarO10 = ((qxe) obj).O0(str);
                try {
                    Iterator it11 = list.iterator();
                    while (it11.hasNext()) {
                        vxeVarO10.c(i2, ((ctc) it11.next()).a);
                        i2++;
                    }
                    if (vxeVarO10.M0()) {
                        j = vxeVarO10.getLong(0);
                        break;
                    } else {
                        j = 0;
                    }
                    return Long.valueOf(j);
                } finally {
                    vxeVarO10.close();
                }
        }
    }

    public /* synthetic */ tj1(int i, String str, List list) {
        this.a = i;
        this.b = str;
        this.c = list;
    }
}

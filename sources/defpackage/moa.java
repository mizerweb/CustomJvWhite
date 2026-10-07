package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class moa implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ moa(toa toaVar, long j, long j2, zia ziaVar, Long l) {
        this.a = 0;
        List list = xfa.b;
        this.b = toaVar;
        this.c = j;
        this.d = j2;
        this.e = ziaVar;
        this.f = l;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i;
        toa toaVar;
        long j;
        boolean z;
        boolean z2;
        int i2;
        int i3 = this.a;
        int i4 = 8;
        long j2 = this.d;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.b;
        switch (i3) {
            case 0:
                toa toaVar2 = (toa) obj4;
                zia ziaVar = (zia) obj3;
                xfa xfaVar = xfa.SENT;
                Long l = (Long) obj2;
                rre rreVar = toaVar2.a;
                long j3 = this.c;
                long j4 = this.d;
                gga ggaVar = (gga) ch3.G(rreVar, true, false, new koa(j3, j4, toaVar2, 0));
                if (ggaVar == null) {
                    i = 0;
                } else {
                    long j5 = ggaVar.a;
                    zia ziaVarB = wna.b(toaVar2, ggaVar, ziaVar, j3, null, Long.valueOf(j4), 8);
                    ch3.G(rreVar, false, true, new t14(toaVar2, xfaVar, j5, 5));
                    int iIntValue = ((Number) ch3.G(rreVar, false, true, new iaa(toaVar2, i4, ziaVarB))).intValue();
                    if (l != null) {
                        ch3.G(rreVar, false, true, new x14(6, l.longValue(), j5));
                    }
                    i = iIntValue;
                }
                return Integer.valueOf(i);
            case 1:
                toa toaVar3 = (toa) obj4;
                rre rreVar2 = toaVar3.a;
                zia ziaVar2 = (zia) obj3;
                Long l2 = (Long) obj2;
                long j6 = this.c;
                gga ggaVarF = toaVar3.f(j6, j2);
                if (ggaVarF == null) {
                    i2 = 0;
                } else {
                    long j7 = ggaVarF.a;
                    zia ziaVarB2 = wna.b(toaVar3, ggaVarF, ziaVar2, j6, Long.valueOf(j2), null, 16);
                    if (j2 == 0 || ggaVarF.h != xfa.SENDING) {
                        toaVar = toaVar3;
                        j = j7;
                        z = true;
                        z2 = false;
                    } else {
                        toaVar = toaVar3;
                        j = j7;
                        z = true;
                        z2 = false;
                        ch3.G(rreVar2, false, true, new t14(toaVar, xfa.SENT, j, 5));
                    }
                    int iIntValue2 = ((Number) ch3.G(rreVar2, z2, z, new iaa(toaVar, i4, ziaVarB2))).intValue();
                    if (l2 != null) {
                        ch3.G(rreVar2, z2, z, new x14(6, l2.longValue(), j));
                    }
                    i2 = iIntValue2;
                }
                return Integer.valueOf(i2);
            default:
                long j8 = this.c;
                long[] jArr = (long[]) obj3;
                g24 g24Var = (g24) obj2;
                vxe vxeVarO0 = ((qxe) obj).O0((String) obj4);
                try {
                    vxeVarO0.c(1, j8);
                    vxeVarO0.c(2, j2);
                    int i5 = 3;
                    for (long j9 : jArr) {
                        vxeVarO0.c(i5, j9);
                        i5++;
                    }
                    int iE = qyj.E(vxeVarO0, "id");
                    int iE2 = qyj.E(vxeVarO0, "server_id");
                    int iE3 = qyj.E(vxeVarO0, "time");
                    int iE4 = qyj.E(vxeVarO0, "update_time");
                    int iE5 = qyj.E(vxeVarO0, "sender");
                    int iE6 = qyj.E(vxeVarO0, "cid");
                    int iE7 = qyj.E(vxeVarO0, "text");
                    int iE8 = qyj.E(vxeVarO0, "delivery_status");
                    int iE9 = qyj.E(vxeVarO0, "status");
                    int iE10 = qyj.E(vxeVarO0, "status_in_process");
                    int iE11 = qyj.E(vxeVarO0, "time_local");
                    int iE12 = qyj.E(vxeVarO0, "error");
                    int iE13 = qyj.E(vxeVarO0, "localized_error");
                    int iE14 = qyj.E(vxeVarO0, "attaches");
                    int iE15 = qyj.E(vxeVarO0, "media_type");
                    int iE16 = qyj.E(vxeVarO0, "message_type");
                    int iE17 = qyj.E(vxeVarO0, "detect_share");
                    int iE18 = qyj.E(vxeVarO0, "msg_link_type");
                    int iE19 = qyj.E(vxeVarO0, "msg_link_id");
                    int iE20 = qyj.E(vxeVarO0, "inserted_from_msg_link");
                    int iE21 = qyj.E(vxeVarO0, "msg_link_out_chat_id");
                    int iE22 = qyj.E(vxeVarO0, "msg_link_out_post_id");
                    int iE23 = qyj.E(vxeVarO0, "msg_link_out_msg_id");
                    int iE24 = qyj.E(vxeVarO0, "options");
                    int iE25 = qyj.E(vxeVarO0, "elements");
                    int iE26 = qyj.E(vxeVarO0, "reactions");
                    int iE27 = qyj.E(vxeVarO0, "reactions_update_time");
                    int iE28 = qyj.E(vxeVarO0, "parent_chat_server_id");
                    int iE29 = qyj.E(vxeVarO0, "parent_message_server_id");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        long j10 = vxeVarO0.getLong(iE);
                        long j11 = vxeVarO0.getLong(iE2);
                        long j12 = vxeVarO0.getLong(iE3);
                        long j13 = vxeVarO0.getLong(iE4);
                        long j14 = vxeVarO0.getLong(iE5);
                        long j15 = vxeVarO0.getLong(iE6);
                        String strB0 = vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7);
                        int i6 = (int) vxeVarO0.getLong(iE8);
                        g24Var.a().getClass();
                        xfa xfaVarB = dwa.b(i6);
                        int i7 = (int) vxeVarO0.getLong(iE9);
                        g24Var.a().getClass();
                        wja wjaVarD = dwa.d(i7);
                        boolean z3 = ((int) vxeVarO0.getLong(iE10)) != 0;
                        long j16 = vxeVarO0.getLong(iE11);
                        String strB1 = vxeVarO0.isNull(iE12) ? null : vxeVarO0.B0(iE12);
                        String strB2 = vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13);
                        byte[] blob = vxeVarO0.isNull(iE14) ? null : vxeVarO0.getBlob(iE14);
                        g24Var.a().getClass();
                        c46 c46VarA = dwa.a(blob);
                        int i8 = iE15;
                        int i9 = iE3;
                        int i10 = iE4;
                        int i11 = (int) vxeVarO0.getLong(i8);
                        int i12 = iE16;
                        int i13 = (int) vxeVarO0.getLong(i12);
                        g24Var.a().getClass();
                        int iE30 = dwa.e(i13);
                        int i14 = iE17;
                        boolean z4 = ((int) vxeVarO0.getLong(i14)) != 0;
                        iE17 = i14;
                        int i15 = iE18;
                        int i16 = (int) vxeVarO0.getLong(i15);
                        int i17 = iE19;
                        long j17 = vxeVarO0.getLong(i17);
                        iE18 = i15;
                        int i18 = iE20;
                        boolean z5 = ((int) vxeVarO0.getLong(i18)) != 0;
                        int i19 = iE21;
                        long j18 = vxeVarO0.getLong(i19);
                        int i20 = iE22;
                        long j19 = vxeVarO0.getLong(i20);
                        iE20 = i18;
                        int i21 = iE23;
                        long j20 = vxeVarO0.getLong(i21);
                        iE23 = i21;
                        iE21 = i19;
                        iE22 = i20;
                        int i22 = iE24;
                        int i23 = (int) vxeVarO0.getLong(i22);
                        int i24 = iE25;
                        byte[] blob2 = vxeVarO0.getBlob(i24);
                        g24Var.a().getClass();
                        List listC = dwa.c(blob2);
                        iE24 = i22;
                        int i25 = iE26;
                        iE26 = i25;
                        kja kjaVarF = g24Var.a().f(vxeVarO0.isNull(i25) ? null : vxeVarO0.getBlob(i25));
                        int i26 = iE27;
                        long j21 = vxeVarO0.getLong(i26);
                        int i27 = iE28;
                        int i28 = iE14;
                        int i29 = iE29;
                        int i30 = iE13;
                        arrayList.add(new uy3(j10, new q24(vxeVarO0.getLong(i27), vxeVarO0.getLong(i29)), j11, j12, j13, j14, j15, strB0, xfaVarB, wjaVarD, z3, j16, strB1, strB2, c46VarA, i11, iE30, z4, i16, j17, z5, j18, j19, j20, i23, listC, kjaVarF, j21));
                        iE3 = i9;
                        iE15 = i8;
                        iE16 = i12;
                        iE19 = i17;
                        iE25 = i24;
                        iE27 = i26;
                        iE13 = i30;
                        iE = iE;
                        iE4 = i10;
                        iE14 = i28;
                        iE29 = i29;
                        iE28 = i27;
                        iE2 = iE2;
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO0.close();
                }
        }
    }

    public /* synthetic */ moa(Object obj, long j, long j2, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = j;
        this.d = j2;
        this.e = obj2;
        this.f = obj3;
    }
}

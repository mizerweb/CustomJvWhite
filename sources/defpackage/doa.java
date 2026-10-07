package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class doa implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ toa b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ wja f;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    public /* synthetic */ doa(int i, long j, long j2, long j3, wja wjaVar, toa toaVar) {
        this.a = i;
        switch (i) {
        }
        List list = xfa.b;
        this.b = toaVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = wjaVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        wja wjaVar = this.f;
        toa toaVar = this.b;
        long j = this.e;
        long j2 = this.d;
        long j3 = this.c;
        switch (i) {
            case 0:
                List list = xfa.b;
                List list2 = xfa.b;
                toa toaVar2 = this.b;
                rre rreVar = toaVar2.a;
                long j4 = this.c;
                long j5 = this.d;
                long j6 = this.e;
                wja wjaVar2 = this.f;
                List list3 = (List) ch3.G(rreVar, true, false, new doa(j4, j5, j6, toaVar2, wjaVar2));
                int iIntValue = ((Number) ch3.G(rreVar, false, true, new doa(1, j4, j5, j6, wjaVar2, toaVar2))).intValue();
                if (list3.size() != iIntValue) {
                    gm0.Y(toa.class.getName(), qt4.l("updateDeliveryStatusWithMessages: ", iIntValue, list3.size(), " != "));
                }
                return list3;
            case 1:
                List list4 = xfa.b;
                List list5 = xfa.b;
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO0 = qxeVar.O0("UPDATE messages  SET delivery_status = ? WHERE chat_id = ? AND sender = ? AND time <= ? AND delivery_status = ? AND inserted_from_msg_link = 0 AND status <> ?");
                try {
                    toaVar.e().getClass();
                    vxeVarO0.c(1, 30L);
                    vxeVarO0.c(2, j3);
                    vxeVarO0.c(3, j2);
                    vxeVarO0.c(4, j);
                    toaVar.e().getClass();
                    vxeVarO0.c(5, 20L);
                    toaVar.e().getClass();
                    vxeVarO0.c(6, wjaVar.a);
                    vxeVarO0.M0();
                    return Integer.valueOf(e9i.e0(qxeVar));
                } finally {
                    vxeVarO0.close();
                }
            default:
                List list6 = xfa.b;
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM messages WHERE chat_id = ? AND sender = ? AND time <= ? AND delivery_status = ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL");
                try {
                    vxeVarO1.c(1, j3);
                    vxeVarO1.c(2, j2);
                    vxeVarO1.c(3, j);
                    toaVar.e().getClass();
                    vxeVarO1.c(4, 20L);
                    toaVar.e().getClass();
                    vxeVarO1.c(5, wjaVar.a);
                    int iE = qyj.E(vxeVarO1, "id");
                    int iE2 = qyj.E(vxeVarO1, "server_id");
                    int iE3 = qyj.E(vxeVarO1, "time");
                    int iE4 = qyj.E(vxeVarO1, "update_time");
                    int iE5 = qyj.E(vxeVarO1, "sender");
                    int iE6 = qyj.E(vxeVarO1, "cid");
                    int iE7 = qyj.E(vxeVarO1, "text");
                    int iE8 = qyj.E(vxeVarO1, "delivery_status");
                    int iE9 = qyj.E(vxeVarO1, "status");
                    int iE10 = qyj.E(vxeVarO1, "status_in_process");
                    int iE11 = qyj.E(vxeVarO1, "time_local");
                    int iE12 = qyj.E(vxeVarO1, "error");
                    int iE13 = qyj.E(vxeVarO1, "localized_error");
                    int iE14 = qyj.E(vxeVarO1, "attaches");
                    int iE15 = qyj.E(vxeVarO1, "media_type");
                    int iE16 = qyj.E(vxeVarO1, "detect_share");
                    int iE17 = qyj.E(vxeVarO1, "msg_link_type");
                    int iE18 = qyj.E(vxeVarO1, "msg_link_id");
                    int iE19 = qyj.E(vxeVarO1, "inserted_from_msg_link");
                    int iE20 = qyj.E(vxeVarO1, "msg_link_chat_id");
                    int iE21 = qyj.E(vxeVarO1, "msg_link_chat_name");
                    int iE22 = qyj.E(vxeVarO1, "msg_link_chat_link");
                    int iE23 = qyj.E(vxeVarO1, "msg_link_chat_icon_url");
                    int iE24 = qyj.E(vxeVarO1, "msg_link_chat_access_type");
                    int iE25 = qyj.E(vxeVarO1, "msg_link_out_chat_id");
                    int iE26 = qyj.E(vxeVarO1, "msg_link_out_msg_id");
                    int iE27 = qyj.E(vxeVarO1, "type");
                    int iE28 = qyj.E(vxeVarO1, "chat_id");
                    int iE29 = qyj.E(vxeVarO1, "channel_views");
                    int iE30 = qyj.E(vxeVarO1, "channel_forwards");
                    int iE31 = qyj.E(vxeVarO1, "view_time");
                    int iE32 = qyj.E(vxeVarO1, "options");
                    int iE33 = qyj.E(vxeVarO1, "live_until");
                    int iE34 = qyj.E(vxeVarO1, "elements");
                    int iE35 = qyj.E(vxeVarO1, "reactions");
                    int iE36 = qyj.E(vxeVarO1, "delayed_attrs_time_to_fire");
                    int iE37 = qyj.E(vxeVarO1, "delayed_attrs_notify_sender");
                    int iE38 = qyj.E(vxeVarO1, "reactions_update_time");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO1.M0()) {
                        long j7 = vxeVarO1.getLong(iE);
                        long j8 = vxeVarO1.getLong(iE2);
                        long j9 = vxeVarO1.getLong(iE3);
                        long j10 = vxeVarO1.getLong(iE4);
                        long j11 = vxeVarO1.getLong(iE5);
                        long j12 = vxeVarO1.getLong(iE6);
                        Boolean boolValueOf = null;
                        String strB0 = vxeVarO1.isNull(iE7) ? null : vxeVarO1.B0(iE7);
                        int i2 = (int) vxeVarO1.getLong(iE8);
                        toaVar.e().getClass();
                        xfa xfaVarB = dwa.b(i2);
                        int i3 = (int) vxeVarO1.getLong(iE9);
                        toaVar.e().getClass();
                        wja wjaVarD = dwa.d(i3);
                        boolean z = ((int) vxeVarO1.getLong(iE10)) != 0;
                        long j13 = vxeVarO1.getLong(iE11);
                        String strB1 = vxeVarO1.isNull(iE12) ? null : vxeVarO1.B0(iE12);
                        String strB2 = vxeVarO1.isNull(iE13) ? null : vxeVarO1.B0(iE13);
                        byte[] blob = vxeVarO1.isNull(iE14) ? null : vxeVarO1.getBlob(iE14);
                        toaVar.e().getClass();
                        c46 c46VarA = dwa.a(blob);
                        int i4 = iE15;
                        int i5 = iE4;
                        int i6 = (int) vxeVarO1.getLong(i4);
                        int i7 = iE16;
                        boolean z2 = ((int) vxeVarO1.getLong(i7)) != 0;
                        int i8 = iE17;
                        int i9 = (int) vxeVarO1.getLong(i8);
                        int i10 = iE18;
                        long j14 = vxeVarO1.getLong(i10);
                        int i11 = iE;
                        int i12 = iE19;
                        boolean z3 = ((int) vxeVarO1.getLong(i12)) != 0;
                        int i13 = iE20;
                        long j15 = vxeVarO1.getLong(i13);
                        int i14 = iE21;
                        String strB3 = vxeVarO1.isNull(i14) ? null : vxeVarO1.B0(i14);
                        int i15 = iE22;
                        String strB4 = vxeVarO1.isNull(i15) ? null : vxeVarO1.B0(i15);
                        iE22 = i15;
                        int i16 = iE23;
                        String strB5 = vxeVarO1.isNull(i16) ? null : vxeVarO1.B0(i16);
                        iE23 = i16;
                        int i17 = iE24;
                        Integer numValueOf = vxeVarO1.isNull(i17) ? null : Integer.valueOf((int) vxeVarO1.getLong(i17));
                        toaVar.d().getClass();
                        int iA = vo3.a(numValueOf);
                        int i18 = iE25;
                        long j16 = vxeVarO1.getLong(i18);
                        int i19 = iE26;
                        long j17 = vxeVarO1.getLong(i19);
                        int i20 = iE27;
                        int i21 = (int) vxeVarO1.getLong(i20);
                        toaVar.e().getClass();
                        int iE39 = dwa.e(i21);
                        int i22 = iE28;
                        long j18 = vxeVarO1.getLong(i22);
                        int i23 = iE5;
                        int i24 = iE29;
                        int i25 = (int) vxeVarO1.getLong(i24);
                        int i26 = iE30;
                        int i27 = (int) vxeVarO1.getLong(i26);
                        int i28 = iE31;
                        long j19 = vxeVarO1.getLong(i28);
                        int i29 = iE32;
                        int i30 = (int) vxeVarO1.getLong(i29);
                        int i31 = iE33;
                        long j20 = vxeVarO1.getLong(i31);
                        int i32 = iE34;
                        byte[] blob2 = vxeVarO1.getBlob(i32);
                        toaVar.e().getClass();
                        List listC = dwa.c(blob2);
                        iE34 = i32;
                        int i33 = iE35;
                        kja kjaVarF = toaVar.e().f(vxeVarO1.isNull(i33) ? null : vxeVarO1.getBlob(i33));
                        int i34 = iE36;
                        Long lValueOf = vxeVarO1.isNull(i34) ? null : Long.valueOf(vxeVarO1.getLong(i34));
                        int i35 = iE37;
                        Integer numValueOf2 = vxeVarO1.isNull(i35) ? null : Integer.valueOf((int) vxeVarO1.getLong(i35));
                        if (numValueOf2 != null) {
                            boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                        }
                        int i36 = iE38;
                        arrayList.add(new gga(j7, j8, j9, j10, j11, j12, strB0, xfaVarB, wjaVarD, z, j13, strB1, strB2, c46VarA, i6, z2, i9, j14, z3, j15, strB3, strB4, strB5, iA, j16, j17, iE39, j18, i25, i27, j19, i30, j20, listC, kjaVarF, lValueOf, boolValueOf, vxeVarO1.getLong(i36)));
                        iE30 = i26;
                        iE5 = i23;
                        iE28 = i22;
                        iE4 = i5;
                        iE15 = i4;
                        iE36 = i34;
                        iE37 = i35;
                        iE38 = i36;
                        iE16 = i7;
                        iE = i11;
                        iE17 = i8;
                        iE19 = i12;
                        iE20 = i13;
                        iE21 = i14;
                        iE24 = i17;
                        iE25 = i18;
                        iE26 = i19;
                        iE18 = i10;
                        iE27 = i20;
                        iE31 = i28;
                        iE32 = i29;
                        iE33 = i31;
                        iE2 = iE2;
                        iE3 = iE3;
                        iE29 = i24;
                        iE35 = i33;
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO1.close();
                }
        }
    }

    public /* synthetic */ doa(long j, long j2, long j3, toa toaVar, wja wjaVar) {
        this.a = 2;
        List list = xfa.b;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.b = toaVar;
        this.f = wjaVar;
    }
}

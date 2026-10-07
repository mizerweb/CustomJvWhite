package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class koa implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ toa d;

    public /* synthetic */ koa(long j, long j2, toa toaVar, int i) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = toaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        Object ggaVar = null;
        toa toaVar = this.d;
        long j = this.c;
        long j2 = this.b;
        switch (i) {
            case 0:
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM messages WHERE chat_id = ? AND cid = ?");
                try {
                    vxeVarO0.c(1, j2);
                    vxeVarO0.c(2, j);
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
                    int iE16 = qyj.E(vxeVarO0, "detect_share");
                    int iE17 = qyj.E(vxeVarO0, "msg_link_type");
                    int iE18 = qyj.E(vxeVarO0, "msg_link_id");
                    int iE19 = qyj.E(vxeVarO0, "inserted_from_msg_link");
                    int iE20 = qyj.E(vxeVarO0, "msg_link_chat_id");
                    int iE21 = qyj.E(vxeVarO0, "msg_link_chat_name");
                    int iE22 = qyj.E(vxeVarO0, "msg_link_chat_link");
                    int iE23 = qyj.E(vxeVarO0, "msg_link_chat_icon_url");
                    int iE24 = qyj.E(vxeVarO0, "msg_link_chat_access_type");
                    int iE25 = qyj.E(vxeVarO0, "msg_link_out_chat_id");
                    int iE26 = qyj.E(vxeVarO0, "msg_link_out_msg_id");
                    int iE27 = qyj.E(vxeVarO0, "type");
                    int iE28 = qyj.E(vxeVarO0, "chat_id");
                    int iE29 = qyj.E(vxeVarO0, "channel_views");
                    int iE30 = qyj.E(vxeVarO0, "channel_forwards");
                    int iE31 = qyj.E(vxeVarO0, "view_time");
                    int iE32 = qyj.E(vxeVarO0, "options");
                    int iE33 = qyj.E(vxeVarO0, "live_until");
                    int iE34 = qyj.E(vxeVarO0, "elements");
                    int iE35 = qyj.E(vxeVarO0, "reactions");
                    int iE36 = qyj.E(vxeVarO0, "delayed_attrs_time_to_fire");
                    int iE37 = qyj.E(vxeVarO0, "delayed_attrs_notify_sender");
                    int iE38 = qyj.E(vxeVarO0, "reactions_update_time");
                    if (vxeVarO0.M0()) {
                        long j3 = vxeVarO0.getLong(iE);
                        long j4 = vxeVarO0.getLong(iE2);
                        long j5 = vxeVarO0.getLong(iE3);
                        long j6 = vxeVarO0.getLong(iE4);
                        long j7 = vxeVarO0.getLong(iE5);
                        long j8 = vxeVarO0.getLong(iE6);
                        String strB0 = vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7);
                        int i2 = (int) vxeVarO0.getLong(iE8);
                        toaVar.e().getClass();
                        xfa xfaVarB = dwa.b(i2);
                        int i3 = (int) vxeVarO0.getLong(iE9);
                        toaVar.e().getClass();
                        wja wjaVarD = dwa.d(i3);
                        boolean z = ((int) vxeVarO0.getLong(iE10)) != 0;
                        long j9 = vxeVarO0.getLong(iE11);
                        String strB1 = vxeVarO0.isNull(iE12) ? null : vxeVarO0.B0(iE12);
                        String strB2 = vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13);
                        byte[] blob = vxeVarO0.isNull(iE14) ? null : vxeVarO0.getBlob(iE14);
                        toaVar.e().getClass();
                        c46 c46VarA = dwa.a(blob);
                        int i4 = (int) vxeVarO0.getLong(iE15);
                        boolean z2 = ((int) vxeVarO0.getLong(iE16)) != 0;
                        int i5 = (int) vxeVarO0.getLong(iE17);
                        long j10 = vxeVarO0.getLong(iE18);
                        boolean z3 = ((int) vxeVarO0.getLong(iE19)) != 0;
                        long j11 = vxeVarO0.getLong(iE20);
                        String strB3 = vxeVarO0.isNull(iE21) ? null : vxeVarO0.B0(iE21);
                        String strB4 = vxeVarO0.isNull(iE22) ? null : vxeVarO0.B0(iE22);
                        String strB5 = vxeVarO0.isNull(iE23) ? null : vxeVarO0.B0(iE23);
                        Integer numValueOf = vxeVarO0.isNull(iE24) ? null : Integer.valueOf((int) vxeVarO0.getLong(iE24));
                        toaVar.d().getClass();
                        int iA = vo3.a(numValueOf);
                        long j12 = vxeVarO0.getLong(iE25);
                        long j13 = vxeVarO0.getLong(iE26);
                        int i6 = (int) vxeVarO0.getLong(iE27);
                        toaVar.e().getClass();
                        int iE39 = dwa.e(i6);
                        long j14 = vxeVarO0.getLong(iE28);
                        int i7 = (int) vxeVarO0.getLong(iE29);
                        int i8 = (int) vxeVarO0.getLong(iE30);
                        long j15 = vxeVarO0.getLong(iE31);
                        int i9 = (int) vxeVarO0.getLong(iE32);
                        long j16 = vxeVarO0.getLong(iE33);
                        byte[] blob2 = vxeVarO0.getBlob(iE34);
                        toaVar.e().getClass();
                        List listC = dwa.c(blob2);
                        kja kjaVarF = toaVar.e().f(vxeVarO0.isNull(iE35) ? null : vxeVarO0.getBlob(iE35));
                        Long lValueOf = vxeVarO0.isNull(iE36) ? null : Long.valueOf(vxeVarO0.getLong(iE36));
                        Integer numValueOf2 = vxeVarO0.isNull(iE37) ? null : Integer.valueOf((int) vxeVarO0.getLong(iE37));
                        if (numValueOf2 != null) {
                            ggaVar = Boolean.valueOf(numValueOf2.intValue() != 0);
                        }
                        ggaVar = new gga(j3, j4, j5, j6, j7, j8, strB0, xfaVarB, wjaVarD, z, j9, strB1, strB2, c46VarA, i4, z2, i5, j10, z3, j11, strB3, strB4, strB5, iA, j12, j13, iE39, j14, i7, i8, j15, i9, j16, listC, kjaVarF, lValueOf, ggaVar, vxeVarO0.getLong(iE38));
                    }
                    return ggaVar;
                } finally {
                    vxeVarO0.close();
                }
            default:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM messages WHERE chat_id = ? AND server_id = ?");
                try {
                    vxeVarO1.c(1, j2);
                    vxeVarO1.c(2, j);
                    int iE40 = qyj.E(vxeVarO1, "id");
                    int iE41 = qyj.E(vxeVarO1, "server_id");
                    int iE42 = qyj.E(vxeVarO1, "time");
                    int iE43 = qyj.E(vxeVarO1, "update_time");
                    int iE44 = qyj.E(vxeVarO1, "sender");
                    int iE45 = qyj.E(vxeVarO1, "cid");
                    int iE46 = qyj.E(vxeVarO1, "text");
                    int iE47 = qyj.E(vxeVarO1, "delivery_status");
                    int iE48 = qyj.E(vxeVarO1, "status");
                    int iE49 = qyj.E(vxeVarO1, "status_in_process");
                    int iE50 = qyj.E(vxeVarO1, "time_local");
                    int iE51 = qyj.E(vxeVarO1, "error");
                    int iE52 = qyj.E(vxeVarO1, "localized_error");
                    int iE53 = qyj.E(vxeVarO1, "attaches");
                    int iE54 = qyj.E(vxeVarO1, "media_type");
                    int iE55 = qyj.E(vxeVarO1, "detect_share");
                    int iE56 = qyj.E(vxeVarO1, "msg_link_type");
                    int iE57 = qyj.E(vxeVarO1, "msg_link_id");
                    int iE58 = qyj.E(vxeVarO1, "inserted_from_msg_link");
                    int iE59 = qyj.E(vxeVarO1, "msg_link_chat_id");
                    int iE60 = qyj.E(vxeVarO1, "msg_link_chat_name");
                    int iE61 = qyj.E(vxeVarO1, "msg_link_chat_link");
                    int iE62 = qyj.E(vxeVarO1, "msg_link_chat_icon_url");
                    int iE63 = qyj.E(vxeVarO1, "msg_link_chat_access_type");
                    int iE64 = qyj.E(vxeVarO1, "msg_link_out_chat_id");
                    int iE65 = qyj.E(vxeVarO1, "msg_link_out_msg_id");
                    int iE66 = qyj.E(vxeVarO1, "type");
                    int iE67 = qyj.E(vxeVarO1, "chat_id");
                    int iE68 = qyj.E(vxeVarO1, "channel_views");
                    int iE69 = qyj.E(vxeVarO1, "channel_forwards");
                    int iE70 = qyj.E(vxeVarO1, "view_time");
                    int iE71 = qyj.E(vxeVarO1, "options");
                    int iE72 = qyj.E(vxeVarO1, "live_until");
                    int iE73 = qyj.E(vxeVarO1, "elements");
                    int iE74 = qyj.E(vxeVarO1, "reactions");
                    int iE75 = qyj.E(vxeVarO1, "delayed_attrs_time_to_fire");
                    int iE76 = qyj.E(vxeVarO1, "delayed_attrs_notify_sender");
                    int iE77 = qyj.E(vxeVarO1, "reactions_update_time");
                    if (vxeVarO1.M0()) {
                        long j17 = vxeVarO1.getLong(iE40);
                        long j18 = vxeVarO1.getLong(iE41);
                        long j19 = vxeVarO1.getLong(iE42);
                        long j20 = vxeVarO1.getLong(iE43);
                        long j21 = vxeVarO1.getLong(iE44);
                        long j22 = vxeVarO1.getLong(iE45);
                        String strB6 = vxeVarO1.isNull(iE46) ? null : vxeVarO1.B0(iE46);
                        int i10 = (int) vxeVarO1.getLong(iE47);
                        toaVar.e().getClass();
                        xfa xfaVarB2 = dwa.b(i10);
                        int i11 = (int) vxeVarO1.getLong(iE48);
                        toaVar.e().getClass();
                        wja wjaVarD2 = dwa.d(i11);
                        boolean z4 = ((int) vxeVarO1.getLong(iE49)) != 0;
                        long j23 = vxeVarO1.getLong(iE50);
                        String strB7 = vxeVarO1.isNull(iE51) ? null : vxeVarO1.B0(iE51);
                        String strB8 = vxeVarO1.isNull(iE52) ? null : vxeVarO1.B0(iE52);
                        byte[] blob3 = vxeVarO1.isNull(iE53) ? null : vxeVarO1.getBlob(iE53);
                        toaVar.e().getClass();
                        c46 c46VarA2 = dwa.a(blob3);
                        int i12 = (int) vxeVarO1.getLong(iE54);
                        boolean z5 = ((int) vxeVarO1.getLong(iE55)) != 0;
                        int i13 = (int) vxeVarO1.getLong(iE56);
                        long j24 = vxeVarO1.getLong(iE57);
                        boolean z6 = ((int) vxeVarO1.getLong(iE58)) != 0;
                        long j25 = vxeVarO1.getLong(iE59);
                        String strB9 = vxeVarO1.isNull(iE60) ? null : vxeVarO1.B0(iE60);
                        String strB10 = vxeVarO1.isNull(iE61) ? null : vxeVarO1.B0(iE61);
                        String strB11 = vxeVarO1.isNull(iE62) ? null : vxeVarO1.B0(iE62);
                        Integer numValueOf3 = vxeVarO1.isNull(iE63) ? null : Integer.valueOf((int) vxeVarO1.getLong(iE63));
                        toaVar.d().getClass();
                        int iA2 = vo3.a(numValueOf3);
                        long j26 = vxeVarO1.getLong(iE64);
                        long j27 = vxeVarO1.getLong(iE65);
                        int i14 = (int) vxeVarO1.getLong(iE66);
                        toaVar.e().getClass();
                        int iE78 = dwa.e(i14);
                        long j28 = vxeVarO1.getLong(iE67);
                        int i15 = (int) vxeVarO1.getLong(iE68);
                        int i16 = (int) vxeVarO1.getLong(iE69);
                        long j29 = vxeVarO1.getLong(iE70);
                        int i17 = (int) vxeVarO1.getLong(iE71);
                        long j30 = vxeVarO1.getLong(iE72);
                        byte[] blob4 = vxeVarO1.getBlob(iE73);
                        toaVar.e().getClass();
                        List listC2 = dwa.c(blob4);
                        kja kjaVarF2 = toaVar.e().f(vxeVarO1.isNull(iE74) ? null : vxeVarO1.getBlob(iE74));
                        Long lValueOf2 = vxeVarO1.isNull(iE75) ? null : Long.valueOf(vxeVarO1.getLong(iE75));
                        Integer numValueOf4 = vxeVarO1.isNull(iE76) ? null : Integer.valueOf((int) vxeVarO1.getLong(iE76));
                        if (numValueOf4 != null) {
                            ggaVar = Boolean.valueOf(numValueOf4.intValue() != 0);
                        }
                        ggaVar = new gga(j17, j18, j19, j20, j21, j22, strB6, xfaVarB2, wjaVarD2, z4, j23, strB7, strB8, c46VarA2, i12, z5, i13, j24, z6, j25, strB9, strB10, strB11, iA2, j26, j27, iE78, j28, i15, i16, j29, i17, j30, listC2, kjaVarF2, lValueOf2, ggaVar, vxeVarO1.getLong(iE77));
                    }
                    return ggaVar;
                } finally {
                    vxeVarO1.close();
                }
        }
    }
}

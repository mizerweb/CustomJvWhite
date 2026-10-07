package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hn4 implements cf7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hn4(long j, long j2, ki4 ki4Var) {
        this.b = j;
        this.d = ki4Var;
        this.c = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        Object obj2 = this.d;
        long j = this.c;
        long j2 = this.b;
        switch (i) {
            case 0:
                ki4 ki4Var = (ki4) obj2;
                vxe vxeVarO0 = ((qxe) obj).O0("UPDATE contacts SET server_id = ?, data = ? WHERE id = ?");
                try {
                    vxeVarO0.c(1, j2);
                    vxeVarO0.d(2, vd7.n(ki4Var));
                    vxeVarO0.c(3, j);
                    vxeVarO0.M0();
                    return sbi.a;
                } finally {
                    vxeVarO0.close();
                }
            default:
                toa toaVar = (toa) obj2;
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM messages WHERE chat_id = ? AND server_id = ?");
                try {
                    vxeVarO1.c(1, j2);
                    vxeVarO1.c(2, j);
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
                    Object ggaVar = null;
                    if (vxeVarO1.M0()) {
                        long j3 = vxeVarO1.getLong(iE);
                        long j4 = vxeVarO1.getLong(iE2);
                        long j5 = vxeVarO1.getLong(iE3);
                        long j6 = vxeVarO1.getLong(iE4);
                        long j7 = vxeVarO1.getLong(iE5);
                        long j8 = vxeVarO1.getLong(iE6);
                        String strB0 = vxeVarO1.isNull(iE7) ? null : vxeVarO1.B0(iE7);
                        int i2 = (int) vxeVarO1.getLong(iE8);
                        toaVar.e().getClass();
                        xfa xfaVarB = dwa.b(i2);
                        int i3 = (int) vxeVarO1.getLong(iE9);
                        toaVar.e().getClass();
                        wja wjaVarD = dwa.d(i3);
                        boolean z = ((int) vxeVarO1.getLong(iE10)) != 0;
                        long j9 = vxeVarO1.getLong(iE11);
                        String strB1 = vxeVarO1.isNull(iE12) ? null : vxeVarO1.B0(iE12);
                        String strB2 = vxeVarO1.isNull(iE13) ? null : vxeVarO1.B0(iE13);
                        byte[] blob = vxeVarO1.isNull(iE14) ? null : vxeVarO1.getBlob(iE14);
                        toaVar.e().getClass();
                        c46 c46VarA = dwa.a(blob);
                        int i4 = (int) vxeVarO1.getLong(iE15);
                        boolean z2 = ((int) vxeVarO1.getLong(iE16)) != 0;
                        int i5 = (int) vxeVarO1.getLong(iE17);
                        long j10 = vxeVarO1.getLong(iE18);
                        boolean z3 = ((int) vxeVarO1.getLong(iE19)) != 0;
                        long j11 = vxeVarO1.getLong(iE20);
                        String strB3 = vxeVarO1.isNull(iE21) ? null : vxeVarO1.B0(iE21);
                        String strB4 = vxeVarO1.isNull(iE22) ? null : vxeVarO1.B0(iE22);
                        String strB5 = vxeVarO1.isNull(iE23) ? null : vxeVarO1.B0(iE23);
                        Integer numValueOf = vxeVarO1.isNull(iE24) ? null : Integer.valueOf((int) vxeVarO1.getLong(iE24));
                        toaVar.d().getClass();
                        int iA = vo3.a(numValueOf);
                        long j12 = vxeVarO1.getLong(iE25);
                        long j13 = vxeVarO1.getLong(iE26);
                        int i6 = (int) vxeVarO1.getLong(iE27);
                        toaVar.e().getClass();
                        int iE39 = dwa.e(i6);
                        long j14 = vxeVarO1.getLong(iE28);
                        int i7 = (int) vxeVarO1.getLong(iE29);
                        int i8 = (int) vxeVarO1.getLong(iE30);
                        long j15 = vxeVarO1.getLong(iE31);
                        int i9 = (int) vxeVarO1.getLong(iE32);
                        long j16 = vxeVarO1.getLong(iE33);
                        byte[] blob2 = vxeVarO1.getBlob(iE34);
                        toaVar.e().getClass();
                        List listC = dwa.c(blob2);
                        kja kjaVarF = toaVar.e().f(vxeVarO1.isNull(iE35) ? null : vxeVarO1.getBlob(iE35));
                        Long lValueOf = vxeVarO1.isNull(iE36) ? null : Long.valueOf(vxeVarO1.getLong(iE36));
                        Integer numValueOf2 = vxeVarO1.isNull(iE37) ? null : Integer.valueOf((int) vxeVarO1.getLong(iE37));
                        if (numValueOf2 != null) {
                            ggaVar = Boolean.valueOf(numValueOf2.intValue() != 0);
                        }
                        ggaVar = new gga(j3, j4, j5, j6, j7, j8, strB0, xfaVarB, wjaVarD, z, j9, strB1, strB2, c46VarA, i4, z2, i5, j10, z3, j11, strB3, strB4, strB5, iA, j12, j13, iE39, j14, i7, i8, j15, i9, j16, listC, kjaVarF, lValueOf, ggaVar, vxeVarO1.getLong(iE38));
                    }
                    return ggaVar;
                } finally {
                    vxeVarO1.close();
                }
        }
    }

    public /* synthetic */ hn4(long j, long j2, toa toaVar) {
        this.b = j;
        this.c = j2;
        this.d = toaVar;
    }
}

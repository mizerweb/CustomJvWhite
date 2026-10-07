package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k14 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ g24 c;

    public /* synthetic */ k14(long j, g24 g24Var, int i) {
        this.a = i;
        this.b = j;
        this.c = g24Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        Object uy3Var = null;
        g24 g24Var = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM comments WHERE server_id = ?");
                try {
                    vxeVarO0.c(1, j);
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
                    if (vxeVarO0.M0()) {
                        long j2 = vxeVarO0.getLong(iE);
                        long j3 = vxeVarO0.getLong(iE2);
                        long j4 = vxeVarO0.getLong(iE3);
                        long j5 = vxeVarO0.getLong(iE4);
                        long j6 = vxeVarO0.getLong(iE5);
                        long j7 = vxeVarO0.getLong(iE6);
                        String strB0 = vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7);
                        int i2 = (int) vxeVarO0.getLong(iE8);
                        g24Var.a().getClass();
                        xfa xfaVarB = dwa.b(i2);
                        int i3 = (int) vxeVarO0.getLong(iE9);
                        g24Var.a().getClass();
                        wja wjaVarD = dwa.d(i3);
                        boolean z = ((int) vxeVarO0.getLong(iE10)) != 0;
                        long j8 = vxeVarO0.getLong(iE11);
                        String strB1 = vxeVarO0.isNull(iE12) ? null : vxeVarO0.B0(iE12);
                        String strB2 = vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13);
                        byte[] blob = vxeVarO0.isNull(iE14) ? null : vxeVarO0.getBlob(iE14);
                        g24Var.a().getClass();
                        c46 c46VarA = dwa.a(blob);
                        int i4 = (int) vxeVarO0.getLong(iE15);
                        int i5 = (int) vxeVarO0.getLong(iE16);
                        g24Var.a().getClass();
                        int iE30 = dwa.e(i5);
                        boolean z2 = ((int) vxeVarO0.getLong(iE17)) != 0;
                        int i6 = (int) vxeVarO0.getLong(iE18);
                        long j9 = vxeVarO0.getLong(iE19);
                        boolean z3 = ((int) vxeVarO0.getLong(iE20)) != 0;
                        long j10 = vxeVarO0.getLong(iE21);
                        long j11 = vxeVarO0.getLong(iE22);
                        long j12 = vxeVarO0.getLong(iE23);
                        int i7 = (int) vxeVarO0.getLong(iE24);
                        byte[] blob2 = vxeVarO0.getBlob(iE25);
                        g24Var.a().getClass();
                        uy3Var = new uy3(j2, new q24(vxeVarO0.getLong(iE28), vxeVarO0.getLong(iE29)), j3, j4, j5, j6, j7, strB0, xfaVarB, wjaVarD, z, j8, strB1, strB2, c46VarA, i4, iE30, z2, i6, j9, z3, j10, j11, j12, i7, dwa.c(blob2), g24Var.a().f(vxeVarO0.isNull(iE26) ? null : vxeVarO0.getBlob(iE26)), vxeVarO0.getLong(iE27));
                    }
                    return uy3Var;
                } finally {
                    vxeVarO0.close();
                }
            case 1:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM comments WHERE id = ?");
                try {
                    vxeVarO1.c(1, j);
                    int iE31 = qyj.E(vxeVarO1, "id");
                    int iE32 = qyj.E(vxeVarO1, "server_id");
                    int iE33 = qyj.E(vxeVarO1, "time");
                    int iE34 = qyj.E(vxeVarO1, "update_time");
                    int iE35 = qyj.E(vxeVarO1, "sender");
                    int iE36 = qyj.E(vxeVarO1, "cid");
                    int iE37 = qyj.E(vxeVarO1, "text");
                    int iE38 = qyj.E(vxeVarO1, "delivery_status");
                    int iE39 = qyj.E(vxeVarO1, "status");
                    int iE40 = qyj.E(vxeVarO1, "status_in_process");
                    int iE41 = qyj.E(vxeVarO1, "time_local");
                    int iE42 = qyj.E(vxeVarO1, "error");
                    int iE43 = qyj.E(vxeVarO1, "localized_error");
                    int iE44 = qyj.E(vxeVarO1, "attaches");
                    int iE45 = qyj.E(vxeVarO1, "media_type");
                    int iE46 = qyj.E(vxeVarO1, "message_type");
                    int iE47 = qyj.E(vxeVarO1, "detect_share");
                    int iE48 = qyj.E(vxeVarO1, "msg_link_type");
                    int iE49 = qyj.E(vxeVarO1, "msg_link_id");
                    int iE50 = qyj.E(vxeVarO1, "inserted_from_msg_link");
                    int iE51 = qyj.E(vxeVarO1, "msg_link_out_chat_id");
                    int iE52 = qyj.E(vxeVarO1, "msg_link_out_post_id");
                    int iE53 = qyj.E(vxeVarO1, "msg_link_out_msg_id");
                    int iE54 = qyj.E(vxeVarO1, "options");
                    int iE55 = qyj.E(vxeVarO1, "elements");
                    int iE56 = qyj.E(vxeVarO1, "reactions");
                    int iE57 = qyj.E(vxeVarO1, "reactions_update_time");
                    int iE58 = qyj.E(vxeVarO1, "parent_chat_server_id");
                    int iE59 = qyj.E(vxeVarO1, "parent_message_server_id");
                    if (vxeVarO1.M0()) {
                        long j13 = vxeVarO1.getLong(iE31);
                        long j14 = vxeVarO1.getLong(iE32);
                        long j15 = vxeVarO1.getLong(iE33);
                        long j16 = vxeVarO1.getLong(iE34);
                        long j17 = vxeVarO1.getLong(iE35);
                        long j18 = vxeVarO1.getLong(iE36);
                        String strB3 = vxeVarO1.isNull(iE37) ? null : vxeVarO1.B0(iE37);
                        int i8 = (int) vxeVarO1.getLong(iE38);
                        g24Var.a().getClass();
                        xfa xfaVarB2 = dwa.b(i8);
                        int i9 = (int) vxeVarO1.getLong(iE39);
                        g24Var.a().getClass();
                        wja wjaVarD2 = dwa.d(i9);
                        boolean z4 = ((int) vxeVarO1.getLong(iE40)) != 0;
                        long j19 = vxeVarO1.getLong(iE41);
                        String strB4 = vxeVarO1.isNull(iE42) ? null : vxeVarO1.B0(iE42);
                        String strB5 = vxeVarO1.isNull(iE43) ? null : vxeVarO1.B0(iE43);
                        byte[] blob3 = vxeVarO1.isNull(iE44) ? null : vxeVarO1.getBlob(iE44);
                        g24Var.a().getClass();
                        c46 c46VarA2 = dwa.a(blob3);
                        int i10 = (int) vxeVarO1.getLong(iE45);
                        int i11 = (int) vxeVarO1.getLong(iE46);
                        g24Var.a().getClass();
                        int iE60 = dwa.e(i11);
                        boolean z5 = ((int) vxeVarO1.getLong(iE47)) != 0;
                        int i12 = (int) vxeVarO1.getLong(iE48);
                        long j20 = vxeVarO1.getLong(iE49);
                        boolean z6 = ((int) vxeVarO1.getLong(iE50)) != 0;
                        long j21 = vxeVarO1.getLong(iE51);
                        long j22 = vxeVarO1.getLong(iE52);
                        long j23 = vxeVarO1.getLong(iE53);
                        int i13 = (int) vxeVarO1.getLong(iE54);
                        byte[] blob4 = vxeVarO1.getBlob(iE55);
                        g24Var.a().getClass();
                        uy3Var = new uy3(j13, new q24(vxeVarO1.getLong(iE58), vxeVarO1.getLong(iE59)), j14, j15, j16, j17, j18, strB3, xfaVarB2, wjaVarD2, z4, j19, strB4, strB5, c46VarA2, i10, iE60, z5, i12, j20, z6, j21, j22, j23, i13, dwa.c(blob4), g24Var.a().f(vxeVarO1.isNull(iE56) ? null : vxeVarO1.getBlob(iE56)), vxeVarO1.getLong(iE57));
                    }
                    return uy3Var;
                } finally {
                    vxeVarO1.close();
                }
            default:
                vxe vxeVarO2 = ((qxe) obj).O0("SELECT * FROM comments WHERE id = ?");
                try {
                    vxeVarO2.c(1, j);
                    int iE61 = qyj.E(vxeVarO2, "id");
                    int iE62 = qyj.E(vxeVarO2, "server_id");
                    int iE63 = qyj.E(vxeVarO2, "time");
                    int iE64 = qyj.E(vxeVarO2, "update_time");
                    int iE65 = qyj.E(vxeVarO2, "sender");
                    int iE66 = qyj.E(vxeVarO2, "cid");
                    int iE67 = qyj.E(vxeVarO2, "text");
                    int iE68 = qyj.E(vxeVarO2, "delivery_status");
                    int iE69 = qyj.E(vxeVarO2, "status");
                    int iE70 = qyj.E(vxeVarO2, "status_in_process");
                    int iE71 = qyj.E(vxeVarO2, "time_local");
                    int iE72 = qyj.E(vxeVarO2, "error");
                    int iE73 = qyj.E(vxeVarO2, "localized_error");
                    int iE74 = qyj.E(vxeVarO2, "attaches");
                    int iE75 = qyj.E(vxeVarO2, "media_type");
                    int iE76 = qyj.E(vxeVarO2, "message_type");
                    int iE77 = qyj.E(vxeVarO2, "detect_share");
                    int iE78 = qyj.E(vxeVarO2, "msg_link_type");
                    int iE79 = qyj.E(vxeVarO2, "msg_link_id");
                    int iE80 = qyj.E(vxeVarO2, "inserted_from_msg_link");
                    int iE81 = qyj.E(vxeVarO2, "msg_link_out_chat_id");
                    int iE82 = qyj.E(vxeVarO2, "msg_link_out_post_id");
                    int iE83 = qyj.E(vxeVarO2, "msg_link_out_msg_id");
                    int iE84 = qyj.E(vxeVarO2, "options");
                    int iE85 = qyj.E(vxeVarO2, "elements");
                    int iE86 = qyj.E(vxeVarO2, "reactions");
                    int iE87 = qyj.E(vxeVarO2, "reactions_update_time");
                    int iE88 = qyj.E(vxeVarO2, "parent_chat_server_id");
                    int iE89 = qyj.E(vxeVarO2, "parent_message_server_id");
                    if (vxeVarO2.M0()) {
                        long j24 = vxeVarO2.getLong(iE61);
                        long j25 = vxeVarO2.getLong(iE62);
                        long j26 = vxeVarO2.getLong(iE63);
                        long j27 = vxeVarO2.getLong(iE64);
                        long j28 = vxeVarO2.getLong(iE65);
                        long j29 = vxeVarO2.getLong(iE66);
                        String strB6 = vxeVarO2.isNull(iE67) ? null : vxeVarO2.B0(iE67);
                        int i14 = (int) vxeVarO2.getLong(iE68);
                        g24Var.a().getClass();
                        xfa xfaVarB3 = dwa.b(i14);
                        int i15 = (int) vxeVarO2.getLong(iE69);
                        g24Var.a().getClass();
                        wja wjaVarD3 = dwa.d(i15);
                        boolean z7 = ((int) vxeVarO2.getLong(iE70)) != 0;
                        long j30 = vxeVarO2.getLong(iE71);
                        String strB7 = vxeVarO2.isNull(iE72) ? null : vxeVarO2.B0(iE72);
                        String strB8 = vxeVarO2.isNull(iE73) ? null : vxeVarO2.B0(iE73);
                        byte[] blob5 = vxeVarO2.isNull(iE74) ? null : vxeVarO2.getBlob(iE74);
                        g24Var.a().getClass();
                        c46 c46VarA3 = dwa.a(blob5);
                        int i16 = (int) vxeVarO2.getLong(iE75);
                        int i17 = (int) vxeVarO2.getLong(iE76);
                        g24Var.a().getClass();
                        int iE90 = dwa.e(i17);
                        boolean z8 = ((int) vxeVarO2.getLong(iE77)) != 0;
                        int i18 = (int) vxeVarO2.getLong(iE78);
                        long j31 = vxeVarO2.getLong(iE79);
                        boolean z9 = ((int) vxeVarO2.getLong(iE80)) != 0;
                        long j32 = vxeVarO2.getLong(iE81);
                        long j33 = vxeVarO2.getLong(iE82);
                        long j34 = vxeVarO2.getLong(iE83);
                        int i19 = (int) vxeVarO2.getLong(iE84);
                        byte[] blob6 = vxeVarO2.getBlob(iE85);
                        g24Var.a().getClass();
                        uy3Var = new uy3(j24, new q24(vxeVarO2.getLong(iE88), vxeVarO2.getLong(iE89)), j25, j26, j27, j28, j29, strB6, xfaVarB3, wjaVarD3, z7, j30, strB7, strB8, c46VarA3, i16, iE90, z8, i18, j31, z9, j32, j33, j34, i19, dwa.c(blob6), g24Var.a().f(vxeVarO2.isNull(iE86) ? null : vxeVarO2.getBlob(iE86)), vxeVarO2.getLong(iE87));
                    }
                    return uy3Var;
                } finally {
                    vxeVarO2.close();
                }
        }
    }
}

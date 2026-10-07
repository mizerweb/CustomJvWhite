package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s14 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ g24 e;

    public /* synthetic */ s14(long j, long j2, long j3, g24 g24Var, int i) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = g24Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        uy3 uy3Var;
        uy3 uy3Var2;
        int i = this.a;
        g24 g24Var = this.e;
        long j = this.d;
        long j2 = this.c;
        long j3 = this.b;
        switch (i) {
            case 0:
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT id FROM comments WHERE parent_chat_server_id = ? AND parent_message_server_id = ? AND sender = ? AND status = ? AND inserted_from_msg_link = 0");
                try {
                    vxeVarO0.c(1, j3);
                    vxeVarO0.c(2, j2);
                    vxeVarO0.c(3, j);
                    g24Var.a().getClass();
                    vxeVarO0.c(4, 0L);
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        arrayList.add(Long.valueOf(vxeVarO0.getLong(0)));
                    }
                    vxeVarO0.close();
                    return arrayList;
                } catch (Throwable th) {
                    vxeVarO0.close();
                    throw th;
                }
            case 1:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM comments WHERE parent_chat_server_id = ? AND parent_message_server_id = ? AND server_id = ?");
                try {
                    vxeVarO1.c(1, j3);
                    vxeVarO1.c(2, j2);
                    vxeVarO1.c(3, j);
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
                    int iE16 = qyj.E(vxeVarO1, "message_type");
                    int iE17 = qyj.E(vxeVarO1, "detect_share");
                    int iE18 = qyj.E(vxeVarO1, "msg_link_type");
                    int iE19 = qyj.E(vxeVarO1, "msg_link_id");
                    int iE20 = qyj.E(vxeVarO1, "inserted_from_msg_link");
                    int iE21 = qyj.E(vxeVarO1, "msg_link_out_chat_id");
                    int iE22 = qyj.E(vxeVarO1, "msg_link_out_post_id");
                    int iE23 = qyj.E(vxeVarO1, "msg_link_out_msg_id");
                    int iE24 = qyj.E(vxeVarO1, "options");
                    int iE25 = qyj.E(vxeVarO1, "elements");
                    int iE26 = qyj.E(vxeVarO1, "reactions");
                    int iE27 = qyj.E(vxeVarO1, "reactions_update_time");
                    int iE28 = qyj.E(vxeVarO1, "parent_chat_server_id");
                    int iE29 = qyj.E(vxeVarO1, "parent_message_server_id");
                    if (vxeVarO1.M0()) {
                        long j4 = vxeVarO1.getLong(iE);
                        long j5 = vxeVarO1.getLong(iE2);
                        long j6 = vxeVarO1.getLong(iE3);
                        long j7 = vxeVarO1.getLong(iE4);
                        long j8 = vxeVarO1.getLong(iE5);
                        long j9 = vxeVarO1.getLong(iE6);
                        String strB0 = vxeVarO1.isNull(iE7) ? null : vxeVarO1.B0(iE7);
                        int i2 = (int) vxeVarO1.getLong(iE8);
                        g24Var.a().getClass();
                        xfa xfaVarB = dwa.b(i2);
                        int i3 = (int) vxeVarO1.getLong(iE9);
                        g24Var.a().getClass();
                        wja wjaVarD = dwa.d(i3);
                        boolean z = ((int) vxeVarO1.getLong(iE10)) != 0;
                        long j10 = vxeVarO1.getLong(iE11);
                        String strB1 = vxeVarO1.isNull(iE12) ? null : vxeVarO1.B0(iE12);
                        String strB2 = vxeVarO1.isNull(iE13) ? null : vxeVarO1.B0(iE13);
                        byte[] blob = vxeVarO1.isNull(iE14) ? null : vxeVarO1.getBlob(iE14);
                        g24Var.a().getClass();
                        c46 c46VarA = dwa.a(blob);
                        int i4 = (int) vxeVarO1.getLong(iE15);
                        int i5 = (int) vxeVarO1.getLong(iE16);
                        g24Var.a().getClass();
                        int iE30 = dwa.e(i5);
                        boolean z2 = ((int) vxeVarO1.getLong(iE17)) != 0;
                        int i6 = (int) vxeVarO1.getLong(iE18);
                        long j11 = vxeVarO1.getLong(iE19);
                        boolean z3 = ((int) vxeVarO1.getLong(iE20)) != 0;
                        long j12 = vxeVarO1.getLong(iE21);
                        long j13 = vxeVarO1.getLong(iE22);
                        long j14 = vxeVarO1.getLong(iE23);
                        int i7 = (int) vxeVarO1.getLong(iE24);
                        byte[] blob2 = vxeVarO1.getBlob(iE25);
                        g24Var.a().getClass();
                        uy3Var = new uy3(j4, new q24(vxeVarO1.getLong(iE28), vxeVarO1.getLong(iE29)), j5, j6, j7, j8, j9, strB0, xfaVarB, wjaVarD, z, j10, strB1, strB2, c46VarA, i4, iE30, z2, i6, j11, z3, j12, j13, j14, i7, dwa.c(blob2), g24Var.a().f(vxeVarO1.isNull(iE26) ? null : vxeVarO1.getBlob(iE26)), vxeVarO1.getLong(iE27));
                    } else {
                        uy3Var = null;
                    }
                    return uy3Var;
                } finally {
                    vxeVarO1.close();
                }
            default:
                vxe vxeVarO2 = ((qxe) obj).O0("SELECT * FROM comments WHERE parent_chat_server_id = ? AND parent_message_server_id = ? AND cid = ?");
                try {
                    vxeVarO2.c(1, j3);
                    vxeVarO2.c(2, j2);
                    vxeVarO2.c(3, j);
                    int iE31 = qyj.E(vxeVarO2, "id");
                    int iE32 = qyj.E(vxeVarO2, "server_id");
                    int iE33 = qyj.E(vxeVarO2, "time");
                    int iE34 = qyj.E(vxeVarO2, "update_time");
                    int iE35 = qyj.E(vxeVarO2, "sender");
                    int iE36 = qyj.E(vxeVarO2, "cid");
                    int iE37 = qyj.E(vxeVarO2, "text");
                    int iE38 = qyj.E(vxeVarO2, "delivery_status");
                    int iE39 = qyj.E(vxeVarO2, "status");
                    int iE40 = qyj.E(vxeVarO2, "status_in_process");
                    int iE41 = qyj.E(vxeVarO2, "time_local");
                    int iE42 = qyj.E(vxeVarO2, "error");
                    int iE43 = qyj.E(vxeVarO2, "localized_error");
                    int iE44 = qyj.E(vxeVarO2, "attaches");
                    int iE45 = qyj.E(vxeVarO2, "media_type");
                    int iE46 = qyj.E(vxeVarO2, "message_type");
                    int iE47 = qyj.E(vxeVarO2, "detect_share");
                    int iE48 = qyj.E(vxeVarO2, "msg_link_type");
                    int iE49 = qyj.E(vxeVarO2, "msg_link_id");
                    int iE50 = qyj.E(vxeVarO2, "inserted_from_msg_link");
                    int iE51 = qyj.E(vxeVarO2, "msg_link_out_chat_id");
                    int iE52 = qyj.E(vxeVarO2, "msg_link_out_post_id");
                    int iE53 = qyj.E(vxeVarO2, "msg_link_out_msg_id");
                    int iE54 = qyj.E(vxeVarO2, "options");
                    int iE55 = qyj.E(vxeVarO2, "elements");
                    int iE56 = qyj.E(vxeVarO2, "reactions");
                    int iE57 = qyj.E(vxeVarO2, "reactions_update_time");
                    int iE58 = qyj.E(vxeVarO2, "parent_chat_server_id");
                    int iE59 = qyj.E(vxeVarO2, "parent_message_server_id");
                    if (vxeVarO2.M0()) {
                        long j15 = vxeVarO2.getLong(iE31);
                        long j16 = vxeVarO2.getLong(iE32);
                        long j17 = vxeVarO2.getLong(iE33);
                        long j18 = vxeVarO2.getLong(iE34);
                        long j19 = vxeVarO2.getLong(iE35);
                        long j20 = vxeVarO2.getLong(iE36);
                        String strB3 = vxeVarO2.isNull(iE37) ? null : vxeVarO2.B0(iE37);
                        int i8 = (int) vxeVarO2.getLong(iE38);
                        g24Var.a().getClass();
                        xfa xfaVarB2 = dwa.b(i8);
                        int i9 = (int) vxeVarO2.getLong(iE39);
                        g24Var.a().getClass();
                        wja wjaVarD2 = dwa.d(i9);
                        boolean z4 = ((int) vxeVarO2.getLong(iE40)) != 0;
                        long j21 = vxeVarO2.getLong(iE41);
                        String strB4 = vxeVarO2.isNull(iE42) ? null : vxeVarO2.B0(iE42);
                        String strB5 = vxeVarO2.isNull(iE43) ? null : vxeVarO2.B0(iE43);
                        byte[] blob3 = vxeVarO2.isNull(iE44) ? null : vxeVarO2.getBlob(iE44);
                        g24Var.a().getClass();
                        c46 c46VarA2 = dwa.a(blob3);
                        int i10 = (int) vxeVarO2.getLong(iE45);
                        int i11 = (int) vxeVarO2.getLong(iE46);
                        g24Var.a().getClass();
                        int iE60 = dwa.e(i11);
                        boolean z5 = ((int) vxeVarO2.getLong(iE47)) != 0;
                        int i12 = (int) vxeVarO2.getLong(iE48);
                        long j22 = vxeVarO2.getLong(iE49);
                        boolean z6 = ((int) vxeVarO2.getLong(iE50)) != 0;
                        long j23 = vxeVarO2.getLong(iE51);
                        long j24 = vxeVarO2.getLong(iE52);
                        long j25 = vxeVarO2.getLong(iE53);
                        int i13 = (int) vxeVarO2.getLong(iE54);
                        byte[] blob4 = vxeVarO2.getBlob(iE55);
                        g24Var.a().getClass();
                        uy3Var2 = new uy3(j15, new q24(vxeVarO2.getLong(iE58), vxeVarO2.getLong(iE59)), j16, j17, j18, j19, j20, strB3, xfaVarB2, wjaVarD2, z4, j21, strB4, strB5, c46VarA2, i10, iE60, z5, i12, j22, z6, j23, j24, j25, i13, dwa.c(blob4), g24Var.a().f(vxeVarO2.isNull(iE56) ? null : vxeVarO2.getBlob(iE56)), vxeVarO2.getLong(iE57));
                    } else {
                        uy3Var2 = null;
                    }
                    return uy3Var2;
                } finally {
                    vxeVarO2.close();
                }
        }
    }
}

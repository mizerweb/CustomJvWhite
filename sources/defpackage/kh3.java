package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kh3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ long g;

    public /* synthetic */ kh3(String str, long j, long j2, g24 g24Var, wja wjaVar, List list) {
        this.a = 2;
        this.c = str;
        this.b = j;
        this.g = j2;
        this.d = g24Var;
        this.e = wjaVar;
        this.f = list;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        sbi sbiVar = sbi.a;
        int i2 = 4;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        long j = this.g;
        long j2 = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                vxe vxeVarO0 = ((qxe) obj).O0("INSERT OR REPLACE INTO chat_title (docid, normalizedTitle, originalTitle, normalizedTitleWithoutEmoji, originalTitleWithoutEmoji, sortTime) VALUES(?, ?, ?, ?, ?, ?)");
                try {
                    vxeVarO0.c(1, j2);
                    vxeVarO0.B(2, str);
                    vxeVarO0.B(3, str2);
                    if (str3 == null) {
                        vxeVarO0.e(4);
                    } else {
                        vxeVarO0.B(4, str3);
                    }
                    if (str4 == null) {
                        vxeVarO0.e(5);
                    } else {
                        vxeVarO0.B(5, str4);
                    }
                    vxeVarO0.c(6, j);
                    vxeVarO0.M0();
                    return sbiVar;
                } finally {
                    vxeVarO0.close();
                }
            case 1:
                String str5 = (String) obj4;
                String str6 = (String) obj3;
                String str7 = (String) obj2;
                vxe vxeVarO1 = ((qxe) obj).O0("INSERT OR REPLACE INTO chat_title (docid, normalizedTitle, originalTitle, normalizedTitleWithoutEmoji, originalTitleWithoutEmoji, sortTime) VALUES(?, ?, ?, ?, ?, ?)");
                try {
                    vxeVarO1.c(1, j2);
                    vxeVarO1.B(2, str);
                    vxeVarO1.B(3, str5);
                    if (str6 == null) {
                        vxeVarO1.e(4);
                    } else {
                        vxeVarO1.B(4, str6);
                    }
                    if (str7 == null) {
                        vxeVarO1.e(5);
                    } else {
                        vxeVarO1.B(5, str7);
                    }
                    vxeVarO1.c(6, j);
                    vxeVarO1.M0();
                    return sbiVar;
                } finally {
                    vxeVarO1.close();
                }
            default:
                g24 g24Var = (g24) obj4;
                wja wjaVar = (wja) obj3;
                List list = (List) obj2;
                vxe vxeVarO2 = ((qxe) obj).O0(str);
                try {
                    vxeVarO2.c(1, j2);
                    vxeVarO2.c(2, j);
                    g24Var.a().getClass();
                    vxeVarO2.c(3, wjaVar.a);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        vxeVarO2.c(i2, ((Number) it.next()).longValue());
                        i2++;
                    }
                    int iE = qyj.E(vxeVarO2, "id");
                    int iE2 = qyj.E(vxeVarO2, "server_id");
                    int iE3 = qyj.E(vxeVarO2, "time");
                    int iE4 = qyj.E(vxeVarO2, "update_time");
                    int iE5 = qyj.E(vxeVarO2, "sender");
                    int iE6 = qyj.E(vxeVarO2, "cid");
                    int iE7 = qyj.E(vxeVarO2, "text");
                    int iE8 = qyj.E(vxeVarO2, "delivery_status");
                    int iE9 = qyj.E(vxeVarO2, "status");
                    int iE10 = qyj.E(vxeVarO2, "status_in_process");
                    int iE11 = qyj.E(vxeVarO2, "time_local");
                    int iE12 = qyj.E(vxeVarO2, "error");
                    int iE13 = qyj.E(vxeVarO2, "localized_error");
                    int iE14 = qyj.E(vxeVarO2, "attaches");
                    int iE15 = qyj.E(vxeVarO2, "media_type");
                    int iE16 = qyj.E(vxeVarO2, "message_type");
                    int iE17 = qyj.E(vxeVarO2, "detect_share");
                    int iE18 = qyj.E(vxeVarO2, "msg_link_type");
                    int iE19 = qyj.E(vxeVarO2, "msg_link_id");
                    int iE20 = qyj.E(vxeVarO2, "inserted_from_msg_link");
                    int iE21 = qyj.E(vxeVarO2, "msg_link_out_chat_id");
                    int iE22 = qyj.E(vxeVarO2, "msg_link_out_post_id");
                    int iE23 = qyj.E(vxeVarO2, "msg_link_out_msg_id");
                    int iE24 = qyj.E(vxeVarO2, "options");
                    int iE25 = qyj.E(vxeVarO2, "elements");
                    int iE26 = qyj.E(vxeVarO2, "reactions");
                    int iE27 = qyj.E(vxeVarO2, "reactions_update_time");
                    int iE28 = qyj.E(vxeVarO2, "parent_chat_server_id");
                    int iE29 = qyj.E(vxeVarO2, "parent_message_server_id");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO2.M0()) {
                        long j3 = vxeVarO2.getLong(iE);
                        long j4 = vxeVarO2.getLong(iE2);
                        long j5 = vxeVarO2.getLong(iE3);
                        long j6 = vxeVarO2.getLong(iE4);
                        long j7 = vxeVarO2.getLong(iE5);
                        long j8 = vxeVarO2.getLong(iE6);
                        String strB0 = vxeVarO2.isNull(iE7) ? null : vxeVarO2.B0(iE7);
                        int i3 = (int) vxeVarO2.getLong(iE8);
                        g24Var.a().getClass();
                        xfa xfaVarB = dwa.b(i3);
                        int i4 = (int) vxeVarO2.getLong(iE9);
                        g24Var.a().getClass();
                        wja wjaVarD = dwa.d(i4);
                        boolean z = ((int) vxeVarO2.getLong(iE10)) != 0;
                        long j9 = vxeVarO2.getLong(iE11);
                        String strB1 = vxeVarO2.isNull(iE12) ? null : vxeVarO2.B0(iE12);
                        String strB2 = vxeVarO2.isNull(iE13) ? null : vxeVarO2.B0(iE13);
                        byte[] blob = vxeVarO2.isNull(iE14) ? null : vxeVarO2.getBlob(iE14);
                        g24Var.a().getClass();
                        c46 c46VarA = dwa.a(blob);
                        int i5 = iE15;
                        int i6 = iE4;
                        int i7 = (int) vxeVarO2.getLong(i5);
                        int i8 = iE16;
                        int i9 = (int) vxeVarO2.getLong(i8);
                        g24Var.a().getClass();
                        int iE30 = dwa.e(i9);
                        int i10 = iE17;
                        boolean z2 = ((int) vxeVarO2.getLong(i10)) != 0;
                        int i11 = iE18;
                        int i12 = iE5;
                        int i13 = (int) vxeVarO2.getLong(i11);
                        int i14 = iE19;
                        long j10 = vxeVarO2.getLong(i14);
                        int i15 = iE;
                        int i16 = iE20;
                        boolean z3 = ((int) vxeVarO2.getLong(i16)) != 0;
                        int i17 = iE21;
                        long j11 = vxeVarO2.getLong(i17);
                        int i18 = iE22;
                        long j12 = vxeVarO2.getLong(i18);
                        int i19 = iE23;
                        long j13 = vxeVarO2.getLong(i19);
                        iE23 = i19;
                        int i20 = iE24;
                        int i21 = (int) vxeVarO2.getLong(i20);
                        int i22 = iE25;
                        byte[] blob2 = vxeVarO2.getBlob(i22);
                        g24Var.a().getClass();
                        List listC = dwa.c(blob2);
                        int i23 = iE26;
                        iE26 = i23;
                        kja kjaVarF = g24Var.a().f(vxeVarO2.isNull(i23) ? null : vxeVarO2.getBlob(i23));
                        int i24 = iE27;
                        long j14 = vxeVarO2.getLong(i24);
                        int i25 = iE28;
                        int i26 = iE29;
                        int i27 = iE6;
                        arrayList.add(new uy3(j3, new q24(vxeVarO2.getLong(i25), vxeVarO2.getLong(i26)), j4, j5, j6, j7, j8, strB0, xfaVarB, wjaVarD, z, j9, strB1, strB2, c46VarA, i7, iE30, z2, i13, j10, z3, j11, j12, j13, i21, listC, kjaVarF, j14));
                        iE4 = i6;
                        iE15 = i5;
                        iE16 = i8;
                        iE5 = i12;
                        iE = i15;
                        iE17 = i10;
                        iE20 = i16;
                        iE21 = i17;
                        iE22 = i18;
                        iE24 = i20;
                        iE25 = i22;
                        iE27 = i24;
                        iE6 = i27;
                        iE3 = iE3;
                        iE18 = i11;
                        iE19 = i14;
                        iE29 = i26;
                        iE28 = i25;
                        iE2 = iE2;
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO2.close();
                }
        }
    }

    public /* synthetic */ kh3(int i, long j, long j2, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = j2;
    }
}

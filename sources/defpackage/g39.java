package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g39 implements cf7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g39(long j, String str, Boolean bool, Long l) {
        this.c = j;
        this.b = str;
        this.d = bool;
        this.e = l;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        sbi sbiVar = sbi.a;
        int i2 = 2;
        Object obj2 = this.e;
        long j = this.c;
        Object obj3 = this.d;
        String str = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj3;
                Long l = (Long) obj2;
                n65 n65Var = (n65) obj;
                n65Var.a = ":chats";
                n65Var.d(Long.valueOf(j), "id");
                n65Var.d("local", "type");
                if (str != null) {
                    n65Var.d(str, ApiProtocol.PARAM_PAYLOAD);
                }
                if (bool != null) {
                    n65Var.d(bool, "highlight_message");
                }
                if (l != null) {
                    n65Var.d(Long.valueOf(l.longValue()), "message_id");
                }
                return sbiVar;
            case 1:
                long[] jArr = (long[]) obj3;
                toa toaVar = (toa) obj2;
                vxe vxeVarO0 = ((qxe) obj).O0(str);
                try {
                    vxeVarO0.c(1, j);
                    for (long j2 : jArr) {
                        vxeVarO0.c(i2, j2);
                        i2++;
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
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        long j3 = vxeVarO0.getLong(iE);
                        long j4 = vxeVarO0.getLong(iE2);
                        long j5 = vxeVarO0.getLong(iE3);
                        long j6 = vxeVarO0.getLong(iE4);
                        long j7 = vxeVarO0.getLong(iE5);
                        long j8 = vxeVarO0.getLong(iE6);
                        String strB0 = vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7);
                        int i3 = (int) vxeVarO0.getLong(iE8);
                        toaVar.e().getClass();
                        xfa xfaVarB = dwa.b(i3);
                        int i4 = (int) vxeVarO0.getLong(iE9);
                        toaVar.e().getClass();
                        wja wjaVarD = dwa.d(i4);
                        boolean z = ((int) vxeVarO0.getLong(iE10)) != 0;
                        long j9 = vxeVarO0.getLong(iE11);
                        String strB1 = vxeVarO0.isNull(iE12) ? null : vxeVarO0.B0(iE12);
                        String strB2 = vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13);
                        int i5 = iE14;
                        byte[] blob = vxeVarO0.isNull(i5) ? null : vxeVarO0.getBlob(i5);
                        toaVar.e().getClass();
                        c46 c46VarA = dwa.a(blob);
                        int i6 = iE2;
                        int i7 = iE15;
                        int i8 = iE12;
                        int i9 = (int) vxeVarO0.getLong(i7);
                        int i10 = iE13;
                        int i11 = iE16;
                        int i12 = iE3;
                        boolean z2 = ((int) vxeVarO0.getLong(i11)) != 0;
                        int i13 = iE17;
                        int i14 = (int) vxeVarO0.getLong(i13);
                        long j10 = vxeVarO0.getLong(iE18);
                        int i15 = iE;
                        int i16 = iE19;
                        boolean z3 = ((int) vxeVarO0.getLong(i16)) != 0;
                        iE20 = iE20;
                        long j11 = vxeVarO0.getLong(iE20);
                        iE21 = iE21;
                        String strB3 = vxeVarO0.isNull(iE21) ? null : vxeVarO0.B0(iE21);
                        iE19 = i16;
                        int i17 = iE22;
                        String strB4 = vxeVarO0.isNull(i17) ? null : vxeVarO0.B0(i17);
                        iE22 = i17;
                        int i18 = iE23;
                        String strB5 = vxeVarO0.isNull(i18) ? null : vxeVarO0.B0(i18);
                        iE23 = i18;
                        int i19 = iE24;
                        Integer numValueOf = vxeVarO0.isNull(i19) ? null : Integer.valueOf((int) vxeVarO0.getLong(i19));
                        toaVar.d().getClass();
                        int iA = vo3.a(numValueOf);
                        int i20 = iE25;
                        long j12 = vxeVarO0.getLong(i20);
                        long j13 = vxeVarO0.getLong(iE26);
                        int i21 = iE27;
                        int i22 = (int) vxeVarO0.getLong(i21);
                        toaVar.e().getClass();
                        int iE39 = dwa.e(i22);
                        int i23 = iE28;
                        long j14 = vxeVarO0.getLong(i23);
                        int i24 = iE29;
                        int i25 = (int) vxeVarO0.getLong(i24);
                        int i26 = iE30;
                        int i27 = (int) vxeVarO0.getLong(i26);
                        int i28 = iE31;
                        long j15 = vxeVarO0.getLong(i28);
                        int i29 = iE32;
                        int i30 = (int) vxeVarO0.getLong(i29);
                        int i31 = iE33;
                        long j16 = vxeVarO0.getLong(i31);
                        int i32 = iE34;
                        byte[] blob2 = vxeVarO0.getBlob(i32);
                        toaVar.e().getClass();
                        List listC = dwa.c(blob2);
                        iE34 = i32;
                        int i33 = iE35;
                        kja kjaVarF = toaVar.e().f(vxeVarO0.isNull(i33) ? null : vxeVarO0.getBlob(i33));
                        int i34 = iE36;
                        Long lValueOf = vxeVarO0.isNull(i34) ? null : Long.valueOf(vxeVarO0.getLong(i34));
                        int i35 = iE37;
                        Integer numValueOf2 = vxeVarO0.isNull(i35) ? null : Integer.valueOf((int) vxeVarO0.getLong(i35));
                        Boolean boolValueOf = numValueOf2 != null ? Boolean.valueOf(numValueOf2.intValue() != 0) : null;
                        int i36 = iE38;
                        arrayList.add(new gga(j3, j4, j5, j6, j7, j8, strB0, xfaVarB, wjaVarD, z, j9, strB1, strB2, c46VarA, i9, z2, i14, j10, z3, j11, strB3, strB4, strB5, iA, j12, j13, iE39, j14, i25, i27, j15, i30, j16, listC, kjaVarF, lValueOf, boolValueOf, vxeVarO0.getLong(i36)));
                        iE36 = i34;
                        iE37 = i35;
                        iE38 = i36;
                        iE12 = i8;
                        iE3 = i12;
                        iE = i15;
                        iE17 = i13;
                        iE16 = i11;
                        iE25 = i20;
                        iE27 = i21;
                        iE28 = i23;
                        iE29 = i24;
                        iE24 = i19;
                        iE30 = i26;
                        iE32 = i29;
                        iE33 = i31;
                        iE35 = i33;
                        iE2 = i6;
                        iE31 = i28;
                        iE14 = i5;
                        iE15 = i7;
                        iE4 = iE4;
                        iE5 = iE5;
                        iE13 = i10;
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO0.close();
                }
            default:
                w0h w0hVar = (w0h) obj3;
                Set set = (Set) obj2;
                vxe vxeVarO1 = ((qxe) obj).O0(str);
                try {
                    vxeVarO1.c(1, w0hVar.a);
                    vxeVarO1.c(2, j);
                    Iterator it = set.iterator();
                    int i37 = 3;
                    while (it.hasNext()) {
                        vxeVarO1.c(i37, ((w0h) it.next()).a);
                        i37++;
                    }
                    vxeVarO1.M0();
                    return sbiVar;
                } finally {
                    vxeVarO1.close();
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g39(String str, long j, long[] jArr, toa toaVar) {
        this.b = str;
        this.c = j;
        this.d = jArr;
        this.e = toaVar;
    }

    public /* synthetic */ g39(String str, yzg yzgVar, w0h w0hVar, long j, Set set) {
        this.b = str;
        this.d = w0hVar;
        this.c = j;
        this.e = set;
    }
}

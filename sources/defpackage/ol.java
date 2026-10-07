package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import one.me.android.OneMeApplication;
import one.me.android.initialization.AccountInitializer;
import one.me.chats.list.ChatsListWidget;
import one.me.login.inputphone.InputPhoneScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ol implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ol(toa toaVar, wja wjaVar) {
        this.a = 7;
        List list = xfa.b;
        this.b = toaVar;
        this.c = wjaVar;
    }

    /* JADX WARN: Code duplicated, block: B:183:0x06b9  */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        Object obj2;
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                Collection collection = (Collection) this.c;
                vxe vxeVarO0 = ((qxe) obj).O0(str);
                try {
                    Iterator it = collection.iterator();
                    int i = 1;
                    while (it.hasNext()) {
                        vxeVarO0.c(i, ((Number) it.next()).longValue());
                        i++;
                    }
                    int iE = qyj.E(vxeVarO0, "id");
                    int iE2 = qyj.E(vxeVarO0, "update_time");
                    int iE3 = qyj.E(vxeVarO0, "emoji");
                    int iE4 = qyj.E(vxeVarO0, "lottie_url");
                    int iE5 = qyj.E(vxeVarO0, "lottie_play_url");
                    int iE6 = qyj.E(vxeVarO0, "set_id");
                    int iE7 = qyj.E(vxeVarO0, "icon_url");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        arrayList.add(new xl(vxeVarO0.getLong(iE), vxeVarO0.getLong(iE2), vxeVarO0.B0(iE3), vxeVarO0.isNull(iE4) ? null : vxeVarO0.B0(iE4), vxeVarO0.isNull(iE5) ? null : vxeVarO0.B0(iE5), vxeVarO0.isNull(iE6) ? null : Long.valueOf(vxeVarO0.getLong(iE6)), vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7)));
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO0.close();
                }
            case 1:
                b00 b00Var = (b00) this.b;
                l8b l8bVar = (l8b) this.c;
                List list = (List) obj;
                int i2 = 0;
                for (Object obj3 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        xw3.V0();
                        throw null;
                    }
                    kw7 kw7Var = (kw7) l8bVar.f(((kw7) obj3).getA());
                    if (kw7Var != null) {
                        list.set(i2, kw7Var);
                    }
                    i2 = i3;
                }
                bx3.Y0(list, b00Var.g().c());
                return sbi.a;
            case 2:
                return Long.valueOf(((ph3) this.b).b.e((qxe) obj, (jy2) this.c));
            case 3:
                ChatsListWidget chatsListWidget = (ChatsListWidget) this.b;
                ek4 ek4Var = (ek4) this.c;
                if (((Integer) obj).intValue() != chatsListWidget.u.l() || chatsListWidget.x.l() <= 0) {
                    return null;
                }
                return ek4Var.b;
            case 4:
                sy4 sy4Var = (sy4) this.c;
                String str2 = (String) this.b;
                String str3 = sy4Var.c;
                a4c a4cVar = gm0.f;
                if (a4cVar == null) {
                    obj2 = null;
                } else {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        obj2 = null;
                        a4cVar.c(je9Var, str3, c0a.o("Accessing folder(", str2, ") before them loaded from cache"), null);
                    } else {
                        obj2 = null;
                    }
                }
                return p90.a(obj2);
            case 5:
                ((rs7) this.b).c.removeCallbacks((o90) this.c);
                return sbi.a;
            case 6:
                rcc rccVar = (rcc) this.b;
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) this.c;
                zv8[] zv8VarArr = InputPhoneScreen.v;
                ml9.d(rccVar);
                ic6 ic6Var = inputPhoneScreen.s1().i;
                lg9.b.getClass();
                a8j.x(ic6Var, lg9.j());
                return sbi.a;
            case 7:
                toa toaVar = (toa) this.b;
                List list2 = xfa.b;
                wja wjaVar = (wja) this.c;
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM messages WHERE delivery_status = ? AND inserted_from_msg_link = 0 AND status <> ?");
                try {
                    toaVar.e().getClass();
                    vxeVarO1.c(1, 10L);
                    toaVar.e().getClass();
                    vxeVarO1.c(2, wjaVar.a);
                    int iE8 = qyj.E(vxeVarO1, "id");
                    int iE9 = qyj.E(vxeVarO1, "server_id");
                    int iE10 = qyj.E(vxeVarO1, "time");
                    int iE11 = qyj.E(vxeVarO1, "update_time");
                    int iE12 = qyj.E(vxeVarO1, "sender");
                    int iE13 = qyj.E(vxeVarO1, "cid");
                    int iE14 = qyj.E(vxeVarO1, "text");
                    int iE15 = qyj.E(vxeVarO1, "delivery_status");
                    int iE16 = qyj.E(vxeVarO1, "status");
                    int iE17 = qyj.E(vxeVarO1, "status_in_process");
                    int iE18 = qyj.E(vxeVarO1, "time_local");
                    int iE19 = qyj.E(vxeVarO1, "error");
                    int iE20 = qyj.E(vxeVarO1, "localized_error");
                    int iE21 = qyj.E(vxeVarO1, "attaches");
                    int iE22 = qyj.E(vxeVarO1, "media_type");
                    int iE23 = qyj.E(vxeVarO1, "detect_share");
                    int iE24 = qyj.E(vxeVarO1, "msg_link_type");
                    int iE25 = qyj.E(vxeVarO1, "msg_link_id");
                    int iE26 = qyj.E(vxeVarO1, "inserted_from_msg_link");
                    int iE27 = qyj.E(vxeVarO1, "msg_link_chat_id");
                    int iE28 = qyj.E(vxeVarO1, "msg_link_chat_name");
                    int iE29 = qyj.E(vxeVarO1, "msg_link_chat_link");
                    int iE30 = qyj.E(vxeVarO1, "msg_link_chat_icon_url");
                    int iE31 = qyj.E(vxeVarO1, "msg_link_chat_access_type");
                    int iE32 = qyj.E(vxeVarO1, "msg_link_out_chat_id");
                    int iE33 = qyj.E(vxeVarO1, "msg_link_out_msg_id");
                    int iE34 = qyj.E(vxeVarO1, "type");
                    int iE35 = qyj.E(vxeVarO1, "chat_id");
                    int iE36 = qyj.E(vxeVarO1, "channel_views");
                    int iE37 = qyj.E(vxeVarO1, "channel_forwards");
                    int iE38 = qyj.E(vxeVarO1, "view_time");
                    int iE39 = qyj.E(vxeVarO1, "options");
                    int iE40 = qyj.E(vxeVarO1, "live_until");
                    int iE41 = qyj.E(vxeVarO1, "elements");
                    int iE42 = qyj.E(vxeVarO1, "reactions");
                    int iE43 = qyj.E(vxeVarO1, "delayed_attrs_time_to_fire");
                    int iE44 = qyj.E(vxeVarO1, "delayed_attrs_notify_sender");
                    int iE45 = qyj.E(vxeVarO1, "reactions_update_time");
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO1.M0()) {
                        long j = vxeVarO1.getLong(iE8);
                        long j2 = vxeVarO1.getLong(iE9);
                        long j3 = vxeVarO1.getLong(iE10);
                        long j4 = vxeVarO1.getLong(iE11);
                        long j5 = vxeVarO1.getLong(iE12);
                        long j6 = vxeVarO1.getLong(iE13);
                        String strB0 = vxeVarO1.isNull(iE14) ? null : vxeVarO1.B0(iE14);
                        int i4 = iE11;
                        int i5 = iE9;
                        int i6 = (int) vxeVarO1.getLong(iE15);
                        toaVar.e().getClass();
                        xfa xfaVarB = dwa.b(i6);
                        int i7 = (int) vxeVarO1.getLong(iE16);
                        toaVar.e().getClass();
                        wja wjaVarD = dwa.d(i7);
                        boolean z = ((int) vxeVarO1.getLong(iE17)) != 0;
                        long j7 = vxeVarO1.getLong(iE18);
                        String strB1 = vxeVarO1.isNull(iE19) ? null : vxeVarO1.B0(iE19);
                        String strB2 = vxeVarO1.isNull(iE20) ? null : vxeVarO1.B0(iE20);
                        byte[] blob = vxeVarO1.isNull(iE21) ? null : vxeVarO1.getBlob(iE21);
                        toaVar.e().getClass();
                        c46 c46VarA = dwa.a(blob);
                        int i8 = iE22;
                        int i9 = iE10;
                        int i10 = (int) vxeVarO1.getLong(i8);
                        int i11 = iE23;
                        boolean z2 = ((int) vxeVarO1.getLong(i11)) != 0;
                        int i12 = iE24;
                        int i13 = (int) vxeVarO1.getLong(i12);
                        int i14 = iE25;
                        long j8 = vxeVarO1.getLong(i14);
                        int i15 = iE8;
                        int i16 = iE26;
                        boolean z3 = ((int) vxeVarO1.getLong(i16)) != 0;
                        int i17 = iE27;
                        long j9 = vxeVarO1.getLong(i17);
                        int i18 = iE28;
                        String strB3 = vxeVarO1.isNull(i18) ? null : vxeVarO1.B0(i18);
                        int i19 = iE29;
                        String strB4 = vxeVarO1.isNull(i19) ? null : vxeVarO1.B0(i19);
                        iE29 = i19;
                        int i20 = iE30;
                        String strB5 = vxeVarO1.isNull(i20) ? null : vxeVarO1.B0(i20);
                        iE30 = i20;
                        int i21 = iE31;
                        Integer numValueOf = vxeVarO1.isNull(i21) ? null : Integer.valueOf((int) vxeVarO1.getLong(i21));
                        toaVar.d().getClass();
                        int iA = vo3.a(numValueOf);
                        int i22 = iE32;
                        long j10 = vxeVarO1.getLong(i22);
                        int i23 = iE33;
                        long j11 = vxeVarO1.getLong(i23);
                        int i24 = iE34;
                        int i25 = (int) vxeVarO1.getLong(i24);
                        toaVar.e().getClass();
                        int iE46 = dwa.e(i25);
                        int i26 = iE35;
                        long j12 = vxeVarO1.getLong(i26);
                        int i27 = iE12;
                        int i28 = iE36;
                        int i29 = (int) vxeVarO1.getLong(i28);
                        int i30 = iE37;
                        int i31 = (int) vxeVarO1.getLong(i30);
                        int i32 = iE38;
                        long j13 = vxeVarO1.getLong(i32);
                        int i33 = iE39;
                        int i34 = (int) vxeVarO1.getLong(i33);
                        int i35 = iE40;
                        long j14 = vxeVarO1.getLong(i35);
                        int i36 = iE41;
                        byte[] blob2 = vxeVarO1.getBlob(i36);
                        toaVar.e().getClass();
                        List listC = dwa.c(blob2);
                        iE41 = i36;
                        int i37 = iE42;
                        kja kjaVarF = toaVar.e().f(vxeVarO1.isNull(i37) ? null : vxeVarO1.getBlob(i37));
                        int i38 = iE43;
                        Long lValueOf = vxeVarO1.isNull(i38) ? null : Long.valueOf(vxeVarO1.getLong(i38));
                        int i39 = iE44;
                        Integer numValueOf2 = vxeVarO1.isNull(i39) ? null : Integer.valueOf((int) vxeVarO1.getLong(i39));
                        Boolean boolValueOf = numValueOf2 != null ? Boolean.valueOf(numValueOf2.intValue() != 0) : null;
                        int i40 = iE45;
                        arrayList2.add(new gga(j, j2, j3, j4, j5, j6, strB0, xfaVarB, wjaVarD, z, j7, strB1, strB2, c46VarA, i10, z2, i13, j8, z3, j9, strB3, strB4, strB5, iA, j10, j11, iE46, j12, i29, i31, j13, i34, j14, listC, kjaVarF, lValueOf, boolValueOf, vxeVarO1.getLong(i40)));
                        iE37 = i30;
                        iE12 = i27;
                        iE35 = i26;
                        iE10 = i9;
                        iE22 = i8;
                        iE43 = i38;
                        iE44 = i39;
                        iE45 = i40;
                        iE23 = i11;
                        iE8 = i15;
                        iE24 = i12;
                        iE26 = i16;
                        iE27 = i17;
                        iE28 = i18;
                        iE31 = i21;
                        iE32 = i22;
                        iE33 = i23;
                        iE25 = i14;
                        iE34 = i24;
                        iE38 = i32;
                        iE39 = i33;
                        iE40 = i35;
                        iE9 = i5;
                        iE11 = i4;
                        iE36 = i28;
                        iE42 = i37;
                        break;
                    }
                    return arrayList2;
                } finally {
                    vxeVarO1.close();
                }
            case 8:
                ((fpb) this.b).b.c((qxe) obj, (List) this.c);
                return sbi.a;
            case 9:
                c46 c46Var = (c46) this.b;
                OneMeApplication oneMeApplication = (OneMeApplication) this.c;
                int i41 = OneMeApplication.g;
                return new qvb(new AccountInitializer(c46Var, (ha9) obj), oneMeApplication);
            case 10:
                a2c a2cVar = (a2c) this.b;
                od6 od6Var = (od6) this.c;
                return a2cVar.i(a2cVar.b().a(od6Var), od6Var.a);
            case 11:
                if (((SharedPreferences) ((mbc) this.c).a.getValue()).getString((String) this.b, null) == null) {
                    return null;
                }
                oel.a();
                throw null;
            case 12:
                ((odd) this.b).b.d((qxe) obj, (ndd) this.c);
                return sbi.a;
            case 13:
                ((gmd) this.b).b.d((qxe) obj, (cpd) this.c);
                return sbi.a;
            case 14:
                ((j7e) this.b).b.d((qxe) obj, (i7e) this.c);
                return sbi.a;
            case 15:
                ((Handler) this.b).post(new ff((fbc) this.c, ((Long) obj).longValue(), 12));
                return sbi.a;
            case 16:
                c0g c0gVar = (c0g) this.c;
                String str4 = (String) this.b;
                return new ry8(c0gVar.a, new bs6(str4), c0gVar.c, new yja(str4, 1), null, 40);
            case 17:
                icg icgVar = (icg) this.b;
                jcg jcgVar = (jcg) this.c;
                vxe vxeVarO2 = ((qxe) obj).O0("DELETE FROM perf_snapshots WHERE type = ?");
                try {
                    icgVar.d.getClass();
                    vxeVarO2.c(1, jcgVar.a);
                    vxeVarO2.M0();
                    return sbi.a;
                } finally {
                    vxeVarO2.close();
                }
            case 18:
                ((kkg) this.b).b.c((qxe) obj, (List) this.c);
                return sbi.a;
            case 19:
                String str5 = (String) this.b;
                long[] jArr = (long[]) this.c;
                vxe vxeVarO3 = ((qxe) obj).O0(str5);
                try {
                    int i42 = 1;
                    for (long j15 : jArr) {
                        vxeVarO3.c(i42, j15);
                        i42++;
                    }
                    int iE47 = qyj.E(vxeVarO3, "id");
                    int iE48 = qyj.E(vxeVarO3, SdkMetricStatEvent.NAME_KEY);
                    int iE49 = qyj.E(vxeVarO3, "icon_url");
                    int iE50 = qyj.E(vxeVarO3, "author_id");
                    int iE51 = qyj.E(vxeVarO3, "created_time");
                    int iE52 = qyj.E(vxeVarO3, "updated_time");
                    int iE53 = qyj.E(vxeVarO3, "link");
                    int iE54 = qyj.E(vxeVarO3, "stickers");
                    int iE55 = qyj.E(vxeVarO3, "draft");
                    ArrayList arrayList3 = new ArrayList();
                    while (vxeVarO3.M0()) {
                        jmg jmgVar = new jmg();
                        int i43 = iE53;
                        jmgVar.a = vxeVarO3.getLong(iE47);
                        if (vxeVarO3.isNull(iE48)) {
                            jmgVar.b = null;
                        } else {
                            jmgVar.b = vxeVarO3.B0(iE48);
                        }
                        if (vxeVarO3.isNull(iE49)) {
                            jmgVar.c = null;
                        } else {
                            jmgVar.c = vxeVarO3.B0(iE49);
                        }
                        jmgVar.d = vxeVarO3.getLong(iE50);
                        jmgVar.e = vxeVarO3.getLong(iE51);
                        jmgVar.f = vxeVarO3.getLong(iE52);
                        jmgVar.g = vxeVarO3.B0(i43);
                        jmgVar.h = e9i.L0(vxeVarO3.isNull(iE54) ? null : vxeVarO3.B0(iE54));
                        int i44 = iE52;
                        jmgVar.i = ((int) vxeVarO3.getLong(iE55)) != 0;
                        arrayList3.add(jmgVar);
                        iE52 = i44;
                        iE53 = i43;
                        break;
                    }
                    return arrayList3;
                } finally {
                    vxeVarO3.close();
                }
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((pmg) this.b).b.c((qxe) obj, (ArrayList) this.c);
                return sbi.a;
            case 21:
                ((ymg) this.b).b.c((qxe) obj, (ArrayList) this.c);
                return sbi.a;
            case 22:
                ((ufh) this.b).b.d((qxe) obj, (tfh) this.c);
                return sbi.a;
            case 23:
                return Long.valueOf(((xkh) this.b).b.e((qxe) obj, (ujh) this.c));
            case 24:
                return new q4i(obj, (cf7) this.b, (cf7) this.c);
            case 25:
                ((czj) this.b).b.d((qxe) obj, (bzj) this.c);
                return sbi.a;
            case 26:
                kyj kyjVar = (kyj) this.c;
                String str6 = (String) this.b;
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO4 = qxeVar.O0("UPDATE workspec SET state=? WHERE id=?");
                try {
                    vxeVarO4.c(1, rx8.a0(kyjVar));
                    vxeVarO4.B(2, str6);
                    vxeVarO4.M0();
                    return Integer.valueOf(e9i.e0(qxeVar));
                } finally {
                    vxeVarO4.close();
                }
            case 27:
                d25 d25Var = (d25) this.c;
                String str7 = (String) this.b;
                vxe vxeVarO5 = ((qxe) obj).O0("UPDATE workspec SET output=? WHERE id=?");
                try {
                    d25 d25Var2 = d25.b;
                    vxeVarO5.d(1, f55.y(d25Var));
                    vxeVarO5.B(2, str7);
                    vxeVarO5.M0();
                    return sbi.a;
                } finally {
                    vxeVarO5.close();
                }
            default:
                ((szj) this.b).b.d((qxe) obj, (rzj) this.c);
                return sbi.a;
        }
    }

    public /* synthetic */ ol(int i, Object obj, String str) {
        this.a = i;
        this.c = obj;
        this.b = str;
    }

    public /* synthetic */ ol(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}

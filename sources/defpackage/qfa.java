package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import ru.ok.tamtam.messages.a;
import ru.ok.tamtam.messages.b;

/* JADX INFO: loaded from: classes.dex */
public final class qfa {
    public final ExecutorService a;
    public final n25 b;
    public final t51 c;
    public final zed d;
    public final hjc e;
    public final b f;
    public final dp5 g;
    public final String h;

    public qfa(n25 n25Var, t51 t51Var, zed zedVar, hjc hjcVar, b bVar, dp5 dp5Var, String str, ExecutorService executorService) {
        this.b = n25Var;
        this.c = t51Var;
        this.d = zedVar;
        this.e = hjcVar;
        this.f = bVar;
        this.g = dp5Var;
        this.h = str;
        this.a = executorService;
    }

    public final long a(long j, long j2) {
        gm0.m("qfa", "countMessagesFrom chatId = %d, timeFrom = %d", Long.valueOf(j), Long.valueOf(j2));
        toa toaVar = (toa) ((ose) this.b.c()).h();
        return ((Number) ch3.G(toaVar.a, true, false, new ooa(j, j2, toaVar, wja.DELETED, 2))).longValue();
    }

    public final void b(long j, long j2, long j3) {
        n25 n25Var = this.b;
        ose oseVar = (ose) n25Var.c();
        toa toaVar = (toa) oseVar.h();
        List list = (List) ch3.G(toaVar.a, true, false, new hoa(j2, toaVar, 1));
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(oseVar.b((gga) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                sfa sfaVar = ((sfa) it2.next()).q;
                arrayList2.add(Long.valueOf(sfaVar != null ? sfaVar.a : 0L));
            } catch (Throwable th) {
                qr7.o(th);
                return;
            }
        }
        uoa uoaVarC = n25Var.c();
        mg5 mg5Var = mg5.REGULAR;
        ose oseVar2 = (ose) uoaVarC;
        oseVar2.getClass();
        toa toaVar2 = (toa) oseVar2.h();
        toaVar2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND id NOT IN (");
        vd7.b(sb, arrayList2.size());
        sb.append(")");
        ch3.G(toaVar2.a, false, true, new f39(sb.toString(), j, j2, j3, arrayList2));
        this.c.c(new j3b(j, j2, j3, mg5Var));
    }

    public final void c(long j, List list) {
        Long lValueOf = Long.valueOf(j);
        nv4 nv4Var = new nv4(28, new f4a(21));
        StringBuilder sb = new StringBuilder();
        ww3.x1(list, sb, ",", "[", "]", -1, "", nv4Var);
        gm0.m("qfa", "deleteMessages %d ids = %s", lValueOf, sb.toString());
        hjc hjcVar = this.e;
        hjcVar.getClass();
        if (j != 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hjcVar.c(j, ((Number) it.next()).longValue());
            }
        }
        b bVar = this.f;
        bVar.getClass();
        List list2 = list;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            bVar.g.remove(Long.valueOf(((Number) it2.next()).longValue()));
        }
        wna wnaVarH = ((ose) this.b.c()).h();
        List listT1 = ww3.T1(list2);
        toa toaVar = (toa) wnaVarH;
        toaVar.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM messages WHERE chat_id = ? AND id in (");
        ch3.G(toaVar.a, false, true, new goa(1, j, nbh.x(")", sb2, listT1), listT1));
    }

    public final long d(long j, gda gdaVar, long j2, Long l) {
        Collections.singletonList(gdaVar);
        ose oseVar = (ose) this.b.c();
        return ((Number) oseVar.e().a(new idc(oseVar, j, gdaVar, j2, l))).longValue();
    }

    public final void e(long j) {
        uoa uoaVarC = this.b.c();
        uoaVarC.getClass();
        ku6 ku6Var = mg5.d;
        ose oseVar = (ose) uoaVarC;
        toa toaVar = (toa) oseVar.h();
        List list = (List) ch3.G(toaVar.a, true, false, new hoa(j, toaVar, 5));
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(oseVar.b((gga) it.next()));
        }
    }

    public final sfa f(long j, long j2) {
        return ((ose) this.b.c()).c(j, j2);
    }

    public final ArrayList g(long j, long[] jArr) {
        ose oseVar = (ose) this.b.c();
        toa toaVar = (toa) oseVar.h();
        toaVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM messages WHERE chat_id = ? AND server_id in (");
        vd7.b(sb, jArr.length);
        sb.append(")");
        List list = (List) ch3.G(toaVar.a, true, false, new g39(sb.toString(), j, jArr, toaVar));
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(oseVar.b((gga) it.next()));
        }
        return arrayList;
    }

    public final ArrayList h(long j, long j2) {
        a aVar = (a) this.g.get();
        ose oseVar = (ose) this.b.c();
        wna wnaVarH = oseVar.h();
        Set setSingleton = Collections.singleton(8);
        toa toaVar = (toa) wnaVarH;
        toaVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM messages WHERE media_type in (");
        int size = setSingleton.size();
        vd7.b(sb, size);
        sb.append(") AND time >= ");
        sb.append("?");
        sb.append(" AND time <= ");
        nbh.G(sb, "?", " AND inserted_from_msg_link = 0 AND status <> ", "?", " AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC LIMIT ");
        sb.append("?");
        List list = (List) ch3.G(toaVar.a, true, false, new o14(sb.toString(), setSingleton, size, j, j2, toaVar, wja.DELETED));
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(oseVar.b((gga) it.next()));
        }
        return aVar.b(arrayList);
    }

    public final List i(long j, long j2, long j3, ArrayList arrayList) {
        List list = xfa.b;
        toa toaVar = (toa) ((ose) this.b.c()).h();
        toaVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND server_id <> 0 AND server_id NOT IN (");
        int size = arrayList.size();
        vd7.b(sb, size);
        sb.append(") AND delivery_status <> ");
        sb.append("?");
        return (List) ch3.G(toaVar.a, true, false, new a24(sb.toString(), j, j2, j3, arrayList, size, toaVar));
    }

    public final ArrayList j(final long j, final long j2, final long j3, boolean z, mg5 mg5Var) {
        List list;
        StringBuilder sbS = qt4.s(j, "selectFromTo chatId = ", "; timeFrom = ");
        sbS.append(j2);
        qt4.z(j3, "; timeTo = ", "; backwards = ", sbS);
        sbS.append(z);
        gm0.n("qfa", sbS.toString());
        ose oseVar = (ose) this.b.c();
        oseVar.getClass();
        int iOrdinal = mg5Var.ordinal();
        if (iOrdinal == 0) {
            wna wnaVarH = oseVar.h();
            wnaVarH.getClass();
            if (z) {
                final toa toaVar = (toa) wnaVarH;
                list = (List) ch3.G(toaVar.a, true, false, new cf7() { // from class: roa
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) throws Exception {
                        long j4 = j;
                        long j5 = j2;
                        long j6 = j3;
                        toa toaVar2 = toaVar;
                        vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC, time_local DESC LIMIT ?");
                        try {
                            vxeVarO0.c(1, j4);
                            vxeVarO0.c(2, j5);
                            vxeVarO0.c(3, j6);
                            toaVar2.e().getClass();
                            vxeVarO0.c(4, 10L);
                            vxeVarO0.c(5, 40L);
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
                                long j7 = vxeVarO0.getLong(iE);
                                long j8 = vxeVarO0.getLong(iE2);
                                long j9 = vxeVarO0.getLong(iE3);
                                long j10 = vxeVarO0.getLong(iE4);
                                long j11 = vxeVarO0.getLong(iE5);
                                long j12 = vxeVarO0.getLong(iE6);
                                Boolean boolValueOf = null;
                                String strB0 = vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7);
                                int i = (int) vxeVarO0.getLong(iE8);
                                toaVar2.e().getClass();
                                xfa xfaVarB = dwa.b(i);
                                int i2 = (int) vxeVarO0.getLong(iE9);
                                toaVar2.e().getClass();
                                wja wjaVarD = dwa.d(i2);
                                boolean z2 = ((int) vxeVarO0.getLong(iE10)) != 0;
                                long j13 = vxeVarO0.getLong(iE11);
                                String strB1 = vxeVarO0.isNull(iE12) ? null : vxeVarO0.B0(iE12);
                                String strB2 = vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13);
                                byte[] blob = vxeVarO0.isNull(iE14) ? null : vxeVarO0.getBlob(iE14);
                                toaVar2.e().getClass();
                                c46 c46VarA = dwa.a(blob);
                                int i3 = iE15;
                                int i4 = iE3;
                                int i5 = (int) vxeVarO0.getLong(i3);
                                int i6 = iE16;
                                boolean z3 = ((int) vxeVarO0.getLong(i6)) != 0;
                                int i7 = iE17;
                                int i8 = (int) vxeVarO0.getLong(i7);
                                int i9 = iE18;
                                long j14 = vxeVarO0.getLong(i9);
                                int i10 = iE19;
                                boolean z4 = ((int) vxeVarO0.getLong(i10)) != 0;
                                int i11 = iE20;
                                long j15 = vxeVarO0.getLong(i11);
                                int i12 = iE21;
                                String strB3 = vxeVarO0.isNull(i12) ? null : vxeVarO0.B0(i12);
                                int i13 = iE22;
                                String strB4 = vxeVarO0.isNull(i13) ? null : vxeVarO0.B0(i13);
                                iE22 = i13;
                                int i14 = iE23;
                                String strB5 = vxeVarO0.isNull(i14) ? null : vxeVarO0.B0(i14);
                                iE23 = i14;
                                int i15 = iE24;
                                Integer numValueOf = vxeVarO0.isNull(i15) ? null : Integer.valueOf((int) vxeVarO0.getLong(i15));
                                toaVar2.d().getClass();
                                int iA = vo3.a(numValueOf);
                                int i16 = iE25;
                                long j16 = vxeVarO0.getLong(i16);
                                int i17 = iE26;
                                long j17 = vxeVarO0.getLong(i17);
                                int i18 = iE27;
                                int i19 = (int) vxeVarO0.getLong(i18);
                                toaVar2.e().getClass();
                                int iE39 = dwa.e(i19);
                                int i20 = iE28;
                                long j18 = vxeVarO0.getLong(i20);
                                int i21 = iE29;
                                int i22 = (int) vxeVarO0.getLong(i21);
                                int i23 = iE30;
                                int i24 = iE4;
                                int i25 = (int) vxeVarO0.getLong(i23);
                                int i26 = iE31;
                                long j19 = vxeVarO0.getLong(i26);
                                int i27 = iE32;
                                int i28 = (int) vxeVarO0.getLong(i27);
                                int i29 = iE33;
                                long j20 = vxeVarO0.getLong(i29);
                                iE32 = i27;
                                int i30 = iE34;
                                byte[] blob2 = vxeVarO0.getBlob(i30);
                                toaVar2.e().getClass();
                                List listC = dwa.c(blob2);
                                iE34 = i30;
                                iE35 = iE35;
                                kja kjaVarF = toaVar2.e().f(vxeVarO0.isNull(iE35) ? null : vxeVarO0.getBlob(iE35));
                                int i31 = iE36;
                                Long lValueOf = vxeVarO0.isNull(i31) ? null : Long.valueOf(vxeVarO0.getLong(i31));
                                int i32 = iE37;
                                Integer numValueOf2 = vxeVarO0.isNull(i32) ? null : Integer.valueOf((int) vxeVarO0.getLong(i32));
                                if (numValueOf2 != null) {
                                    boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                                }
                                int i33 = iE38;
                                arrayList.add(new gga(j7, j8, j9, j10, j11, j12, strB0, xfaVarB, wjaVarD, z2, j13, strB1, strB2, c46VarA, i5, z3, i8, j14, z4, j15, strB3, strB4, strB5, iA, j16, j17, iE39, j18, i22, i25, j19, i28, j20, listC, kjaVarF, lValueOf, boolValueOf, vxeVarO0.getLong(i33)));
                                iE37 = i32;
                                iE38 = i33;
                                iE19 = i10;
                                iE20 = i11;
                                iE21 = i12;
                                iE24 = i15;
                                iE25 = i16;
                                iE26 = i17;
                                iE27 = i18;
                                iE28 = i20;
                                iE4 = i24;
                                iE30 = i23;
                                iE31 = i26;
                                iE33 = i29;
                                iE2 = iE2;
                                iE29 = i21;
                                iE3 = i4;
                                iE36 = i31;
                                iE15 = i3;
                                iE16 = i6;
                                iE17 = i7;
                                iE = iE;
                                iE18 = i9;
                            }
                            return arrayList;
                        } finally {
                            vxeVarO0.close();
                        }
                    }
                });
            } else {
                final toa toaVar2 = (toa) wnaVarH;
                final int i = 2;
                list = (List) ch3.G(toaVar2.a, true, false, new cf7() { // from class: yna
                    private final Object a(Object obj) throws Exception {
                        long j4 = j;
                        long j5 = j2;
                        long j6 = j3;
                        toa toaVar3 = toaVar2;
                        vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire ASC LIMIT ?");
                        try {
                            vxeVarO0.c(1, j4);
                            vxeVarO0.c(2, j5);
                            vxeVarO0.c(3, j6);
                            toaVar3.e().getClass();
                            vxeVarO0.c(4, 10L);
                            vxeVarO0.c(5, 40L);
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
                                long j7 = vxeVarO0.getLong(iE);
                                long j8 = vxeVarO0.getLong(iE2);
                                long j9 = vxeVarO0.getLong(iE3);
                                long j10 = vxeVarO0.getLong(iE4);
                                long j11 = vxeVarO0.getLong(iE5);
                                long j12 = vxeVarO0.getLong(iE6);
                                Boolean boolValueOf = null;
                                String strB0 = vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7);
                                int i2 = (int) vxeVarO0.getLong(iE8);
                                toaVar3.e().getClass();
                                xfa xfaVarB = dwa.b(i2);
                                int i3 = (int) vxeVarO0.getLong(iE9);
                                toaVar3.e().getClass();
                                wja wjaVarD = dwa.d(i3);
                                boolean z2 = ((int) vxeVarO0.getLong(iE10)) != 0;
                                long j13 = vxeVarO0.getLong(iE11);
                                String strB1 = vxeVarO0.isNull(iE12) ? null : vxeVarO0.B0(iE12);
                                String strB2 = vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13);
                                byte[] blob = vxeVarO0.isNull(iE14) ? null : vxeVarO0.getBlob(iE14);
                                toaVar3.e().getClass();
                                c46 c46VarA = dwa.a(blob);
                                int i4 = iE15;
                                int i5 = iE3;
                                int i6 = (int) vxeVarO0.getLong(i4);
                                int i7 = iE16;
                                boolean z3 = ((int) vxeVarO0.getLong(i7)) != 0;
                                int i8 = iE17;
                                int i9 = (int) vxeVarO0.getLong(i8);
                                int i10 = iE18;
                                long j14 = vxeVarO0.getLong(i10);
                                int i11 = iE19;
                                boolean z4 = ((int) vxeVarO0.getLong(i11)) != 0;
                                int i12 = iE20;
                                long j15 = vxeVarO0.getLong(i12);
                                int i13 = iE21;
                                String strB3 = vxeVarO0.isNull(i13) ? null : vxeVarO0.B0(i13);
                                int i14 = iE22;
                                String strB4 = vxeVarO0.isNull(i14) ? null : vxeVarO0.B0(i14);
                                iE22 = i14;
                                int i15 = iE23;
                                String strB5 = vxeVarO0.isNull(i15) ? null : vxeVarO0.B0(i15);
                                iE23 = i15;
                                int i16 = iE24;
                                Integer numValueOf = vxeVarO0.isNull(i16) ? null : Integer.valueOf((int) vxeVarO0.getLong(i16));
                                toaVar3.d().getClass();
                                int iA = vo3.a(numValueOf);
                                int i17 = iE25;
                                long j16 = vxeVarO0.getLong(i17);
                                int i18 = iE26;
                                long j17 = vxeVarO0.getLong(i18);
                                int i19 = iE27;
                                int i20 = (int) vxeVarO0.getLong(i19);
                                toaVar3.e().getClass();
                                int iE39 = dwa.e(i20);
                                int i21 = iE28;
                                long j18 = vxeVarO0.getLong(i21);
                                int i22 = iE29;
                                int i23 = (int) vxeVarO0.getLong(i22);
                                int i24 = iE30;
                                int i25 = iE4;
                                int i26 = (int) vxeVarO0.getLong(i24);
                                int i27 = iE31;
                                long j19 = vxeVarO0.getLong(i27);
                                int i28 = iE32;
                                int i29 = (int) vxeVarO0.getLong(i28);
                                int i30 = iE33;
                                long j20 = vxeVarO0.getLong(i30);
                                iE32 = i28;
                                int i31 = iE34;
                                byte[] blob2 = vxeVarO0.getBlob(i31);
                                toaVar3.e().getClass();
                                List listC = dwa.c(blob2);
                                iE34 = i31;
                                iE35 = iE35;
                                kja kjaVarF = toaVar3.e().f(vxeVarO0.isNull(iE35) ? null : vxeVarO0.getBlob(iE35));
                                int i32 = iE36;
                                Long lValueOf = vxeVarO0.isNull(i32) ? null : Long.valueOf(vxeVarO0.getLong(i32));
                                int i33 = iE37;
                                Integer numValueOf2 = vxeVarO0.isNull(i33) ? null : Integer.valueOf((int) vxeVarO0.getLong(i33));
                                if (numValueOf2 != null) {
                                    boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                                }
                                int i34 = iE38;
                                arrayList.add(new gga(j7, j8, j9, j10, j11, j12, strB0, xfaVarB, wjaVarD, z2, j13, strB1, strB2, c46VarA, i6, z3, i9, j14, z4, j15, strB3, strB4, strB5, iA, j16, j17, iE39, j18, i23, i26, j19, i29, j20, listC, kjaVarF, lValueOf, boolValueOf, vxeVarO0.getLong(i34)));
                                iE37 = i33;
                                iE38 = i34;
                                iE19 = i11;
                                iE20 = i12;
                                iE21 = i13;
                                iE24 = i16;
                                iE25 = i17;
                                iE26 = i18;
                                iE27 = i19;
                                iE28 = i21;
                                iE4 = i25;
                                iE30 = i24;
                                iE31 = i27;
                                iE33 = i30;
                                iE2 = iE2;
                                iE29 = i22;
                                iE3 = i5;
                                iE36 = i32;
                                iE15 = i4;
                                iE16 = i7;
                                iE17 = i8;
                                iE = iE;
                                iE18 = i10;
                            }
                            return arrayList;
                        } finally {
                            vxeVarO0.close();
                        }
                    }

                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) throws Exception {
                        Boolean boolValueOf;
                        Boolean boolValueOf2;
                        int i2 = i;
                        toa toaVar3 = toaVar2;
                        long j4 = j3;
                        long j5 = j2;
                        long j6 = j;
                        switch (i2) {
                            case 0:
                                vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
                                try {
                                    vxeVarO0.c(1, j6);
                                    vxeVarO0.c(2, j5);
                                    vxeVarO0.c(3, j4);
                                    toaVar3.e().getClass();
                                    vxeVarO0.c(4, 10L);
                                    vxeVarO0.c(5, 40L);
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
                                        long j7 = vxeVarO0.getLong(iE);
                                        long j8 = vxeVarO0.getLong(iE2);
                                        long j9 = vxeVarO0.getLong(iE3);
                                        long j10 = vxeVarO0.getLong(iE4);
                                        long j11 = vxeVarO0.getLong(iE5);
                                        long j12 = vxeVarO0.getLong(iE6);
                                        String strB0 = vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7);
                                        int i3 = (int) vxeVarO0.getLong(iE8);
                                        toaVar3.e().getClass();
                                        xfa xfaVarB = dwa.b(i3);
                                        int i4 = (int) vxeVarO0.getLong(iE9);
                                        toaVar3.e().getClass();
                                        wja wjaVarD = dwa.d(i4);
                                        boolean z2 = ((int) vxeVarO0.getLong(iE10)) != 0;
                                        long j13 = vxeVarO0.getLong(iE11);
                                        String strB1 = vxeVarO0.isNull(iE12) ? null : vxeVarO0.B0(iE12);
                                        String strB2 = vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13);
                                        byte[] blob = vxeVarO0.isNull(iE14) ? null : vxeVarO0.getBlob(iE14);
                                        toaVar3.e().getClass();
                                        c46 c46VarA = dwa.a(blob);
                                        int i5 = iE15;
                                        int i6 = iE8;
                                        int i7 = iE7;
                                        int i8 = (int) vxeVarO0.getLong(i5);
                                        int i9 = iE16;
                                        boolean z3 = ((int) vxeVarO0.getLong(i9)) != 0;
                                        int i10 = iE17;
                                        int i11 = (int) vxeVarO0.getLong(i10);
                                        long j14 = vxeVarO0.getLong(iE18);
                                        iE17 = i10;
                                        int i12 = iE19;
                                        boolean z4 = ((int) vxeVarO0.getLong(i12)) != 0;
                                        iE20 = iE20;
                                        long j15 = vxeVarO0.getLong(iE20);
                                        iE21 = iE21;
                                        String strB3 = vxeVarO0.isNull(iE21) ? null : vxeVarO0.B0(iE21);
                                        iE19 = i12;
                                        int i13 = iE22;
                                        String strB4 = vxeVarO0.isNull(i13) ? null : vxeVarO0.B0(i13);
                                        iE22 = i13;
                                        int i14 = iE23;
                                        String strB5 = vxeVarO0.isNull(i14) ? null : vxeVarO0.B0(i14);
                                        iE23 = i14;
                                        int i15 = iE24;
                                        Integer numValueOf = vxeVarO0.isNull(i15) ? null : Integer.valueOf((int) vxeVarO0.getLong(i15));
                                        toaVar3.d().getClass();
                                        int iA = vo3.a(numValueOf);
                                        int i16 = iE25;
                                        long j16 = vxeVarO0.getLong(i16);
                                        int i17 = iE26;
                                        long j17 = vxeVarO0.getLong(i17);
                                        iE24 = i15;
                                        iE25 = i16;
                                        iE26 = i17;
                                        int i18 = iE27;
                                        int i19 = (int) vxeVarO0.getLong(i18);
                                        toaVar3.e().getClass();
                                        int iE39 = dwa.e(i19);
                                        int i20 = iE28;
                                        long j18 = vxeVarO0.getLong(i20);
                                        int i21 = iE29;
                                        int i22 = (int) vxeVarO0.getLong(i21);
                                        int i23 = iE30;
                                        int i24 = (int) vxeVarO0.getLong(i23);
                                        long j19 = vxeVarO0.getLong(iE31);
                                        int i25 = iE32;
                                        int i26 = (int) vxeVarO0.getLong(i25);
                                        int i27 = iE33;
                                        long j20 = vxeVarO0.getLong(i27);
                                        iE32 = i25;
                                        int i28 = iE34;
                                        byte[] blob2 = vxeVarO0.getBlob(i28);
                                        toaVar3.e().getClass();
                                        List listC = dwa.c(blob2);
                                        iE34 = i28;
                                        iE35 = iE35;
                                        kja kjaVarF = toaVar3.e().f(vxeVarO0.isNull(iE35) ? null : vxeVarO0.getBlob(iE35));
                                        int i29 = iE36;
                                        Long lValueOf = vxeVarO0.isNull(i29) ? null : Long.valueOf(vxeVarO0.getLong(i29));
                                        int i30 = iE37;
                                        Integer numValueOf2 = vxeVarO0.isNull(i30) ? null : Integer.valueOf((int) vxeVarO0.getLong(i30));
                                        if (numValueOf2 != null) {
                                            boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                                        } else {
                                            boolValueOf = null;
                                        }
                                        int i31 = iE38;
                                        arrayList.add(new gga(j7, j8, j9, j10, j11, j12, strB0, xfaVarB, wjaVarD, z2, j13, strB1, strB2, c46VarA, i8, z3, i11, j14, z4, j15, strB3, strB4, strB5, iA, j16, j17, iE39, j18, i22, i24, j19, i26, j20, listC, kjaVarF, lValueOf, boolValueOf, vxeVarO0.getLong(i31)));
                                        iE7 = i7;
                                        iE37 = i30;
                                        iE38 = i31;
                                        iE2 = iE2;
                                        iE15 = i5;
                                        iE8 = i6;
                                        iE16 = i9;
                                        iE27 = i18;
                                        iE28 = i20;
                                        iE29 = i21;
                                        iE30 = i23;
                                        iE33 = i27;
                                        iE36 = i29;
                                        iE = iE;
                                        break;
                                    }
                                    return arrayList;
                                } finally {
                                    vxeVarO0.close();
                                }
                            case 1:
                                return a(obj);
                            default:
                                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC, time_local ASC LIMIT ?");
                                try {
                                    vxeVarO1.c(1, j6);
                                    vxeVarO1.c(2, j5);
                                    vxeVarO1.c(3, j4);
                                    toaVar3.e().getClass();
                                    vxeVarO1.c(4, 10L);
                                    vxeVarO1.c(5, 40L);
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
                                    ArrayList arrayList2 = new ArrayList();
                                    while (vxeVarO1.M0()) {
                                        long j21 = vxeVarO1.getLong(iE40);
                                        long j22 = vxeVarO1.getLong(iE41);
                                        long j23 = vxeVarO1.getLong(iE42);
                                        long j24 = vxeVarO1.getLong(iE43);
                                        long j25 = vxeVarO1.getLong(iE44);
                                        long j26 = vxeVarO1.getLong(iE45);
                                        String strB6 = vxeVarO1.isNull(iE46) ? null : vxeVarO1.B0(iE46);
                                        int i32 = iE46;
                                        int i33 = iE45;
                                        int i34 = (int) vxeVarO1.getLong(iE47);
                                        toaVar3.e().getClass();
                                        xfa xfaVarB2 = dwa.b(i34);
                                        int i35 = (int) vxeVarO1.getLong(iE48);
                                        toaVar3.e().getClass();
                                        wja wjaVarD2 = dwa.d(i35);
                                        boolean z5 = ((int) vxeVarO1.getLong(iE49)) != 0;
                                        long j27 = vxeVarO1.getLong(iE50);
                                        String strB7 = vxeVarO1.isNull(iE51) ? null : vxeVarO1.B0(iE51);
                                        String strB8 = vxeVarO1.isNull(iE52) ? null : vxeVarO1.B0(iE52);
                                        byte[] blob3 = vxeVarO1.isNull(iE53) ? null : vxeVarO1.getBlob(iE53);
                                        toaVar3.e().getClass();
                                        c46 c46VarA2 = dwa.a(blob3);
                                        int i36 = iE54;
                                        int i37 = iE48;
                                        int i38 = iE47;
                                        int i39 = (int) vxeVarO1.getLong(i36);
                                        int i40 = iE55;
                                        boolean z6 = ((int) vxeVarO1.getLong(i40)) != 0;
                                        int i41 = iE56;
                                        int i42 = (int) vxeVarO1.getLong(i41);
                                        long j28 = vxeVarO1.getLong(iE57);
                                        int i43 = iE40;
                                        int i44 = iE58;
                                        boolean z7 = ((int) vxeVarO1.getLong(i44)) != 0;
                                        iE59 = iE59;
                                        long j29 = vxeVarO1.getLong(iE59);
                                        iE60 = iE60;
                                        String strB9 = vxeVarO1.isNull(iE60) ? null : vxeVarO1.B0(iE60);
                                        iE58 = i44;
                                        int i45 = iE61;
                                        String strB10 = vxeVarO1.isNull(i45) ? null : vxeVarO1.B0(i45);
                                        iE61 = i45;
                                        int i46 = iE62;
                                        String strB11 = vxeVarO1.isNull(i46) ? null : vxeVarO1.B0(i46);
                                        iE62 = i46;
                                        int i47 = iE63;
                                        Integer numValueOf3 = vxeVarO1.isNull(i47) ? null : Integer.valueOf((int) vxeVarO1.getLong(i47));
                                        toaVar3.d().getClass();
                                        int iA2 = vo3.a(numValueOf3);
                                        int i48 = iE64;
                                        long j30 = vxeVarO1.getLong(i48);
                                        int i49 = iE65;
                                        long j31 = vxeVarO1.getLong(i49);
                                        iE63 = i47;
                                        iE64 = i48;
                                        iE65 = i49;
                                        int i50 = iE66;
                                        int i51 = (int) vxeVarO1.getLong(i50);
                                        toaVar3.e().getClass();
                                        int iE78 = dwa.e(i51);
                                        int i52 = iE67;
                                        long j32 = vxeVarO1.getLong(i52);
                                        int i53 = iE68;
                                        int i54 = (int) vxeVarO1.getLong(i53);
                                        int i55 = iE69;
                                        int i56 = (int) vxeVarO1.getLong(i55);
                                        int i57 = iE70;
                                        long j33 = vxeVarO1.getLong(i57);
                                        int i58 = iE71;
                                        int i59 = (int) vxeVarO1.getLong(i58);
                                        int i60 = iE72;
                                        long j34 = vxeVarO1.getLong(i60);
                                        int i61 = iE73;
                                        byte[] blob4 = vxeVarO1.getBlob(i61);
                                        toaVar3.e().getClass();
                                        List listC2 = dwa.c(blob4);
                                        iE73 = i61;
                                        int i62 = iE74;
                                        kja kjaVarF2 = toaVar3.e().f(vxeVarO1.isNull(i62) ? null : vxeVarO1.getBlob(i62));
                                        int i63 = iE75;
                                        Long lValueOf2 = vxeVarO1.isNull(i63) ? null : Long.valueOf(vxeVarO1.getLong(i63));
                                        int i64 = iE76;
                                        Integer numValueOf4 = vxeVarO1.isNull(i64) ? null : Integer.valueOf((int) vxeVarO1.getLong(i64));
                                        if (numValueOf4 != null) {
                                            boolValueOf2 = Boolean.valueOf(numValueOf4.intValue() != 0);
                                        } else {
                                            boolValueOf2 = null;
                                        }
                                        int i65 = iE77;
                                        arrayList2.add(new gga(j21, j22, j23, j24, j25, j26, strB6, xfaVarB2, wjaVarD2, z5, j27, strB7, strB8, c46VarA2, i39, z6, i42, j28, z7, j29, strB9, strB10, strB11, iA2, j30, j31, iE78, j32, i54, i56, j33, i59, j34, listC2, kjaVarF2, lValueOf2, boolValueOf2, vxeVarO1.getLong(i65)));
                                        iE75 = i63;
                                        iE76 = i64;
                                        iE77 = i65;
                                        iE40 = i43;
                                        iE56 = i41;
                                        iE66 = i50;
                                        iE70 = i57;
                                        iE71 = i58;
                                        iE72 = i60;
                                        iE46 = i32;
                                        iE48 = i37;
                                        iE74 = i62;
                                        iE47 = i38;
                                        iE54 = i36;
                                        iE55 = i40;
                                        iE67 = i52;
                                        iE68 = i53;
                                        iE69 = i55;
                                        iE45 = i33;
                                        break;
                                    }
                                    return arrayList2;
                                } finally {
                                    vxeVarO1.close();
                                }
                        }
                    }
                });
            }
        } else {
            if (iOrdinal != 1) {
                ore.o();
                return null;
            }
            wna wnaVarH2 = oseVar.h();
            wnaVarH2.getClass();
            if (z) {
                final toa toaVar3 = (toa) wnaVarH2;
                final int i2 = 0;
                list = (List) ch3.G(toaVar3.a, true, false, new cf7() { // from class: yna
                    private final Object a(Object obj) throws Exception {
                        long j4 = j;
                        long j5 = j2;
                        long j6 = j3;
                        toa toaVar4 = toaVar3;
                        vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire ASC LIMIT ?");
                        try {
                            vxeVarO0.c(1, j4);
                            vxeVarO0.c(2, j5);
                            vxeVarO0.c(3, j6);
                            toaVar4.e().getClass();
                            vxeVarO0.c(4, 10L);
                            vxeVarO0.c(5, 40L);
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
                                long j7 = vxeVarO0.getLong(iE);
                                long j8 = vxeVarO0.getLong(iE2);
                                long j9 = vxeVarO0.getLong(iE3);
                                long j10 = vxeVarO0.getLong(iE4);
                                long j11 = vxeVarO0.getLong(iE5);
                                long j12 = vxeVarO0.getLong(iE6);
                                Boolean boolValueOf = null;
                                String strB0 = vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7);
                                int i3 = (int) vxeVarO0.getLong(iE8);
                                toaVar4.e().getClass();
                                xfa xfaVarB = dwa.b(i3);
                                int i4 = (int) vxeVarO0.getLong(iE9);
                                toaVar4.e().getClass();
                                wja wjaVarD = dwa.d(i4);
                                boolean z2 = ((int) vxeVarO0.getLong(iE10)) != 0;
                                long j13 = vxeVarO0.getLong(iE11);
                                String strB1 = vxeVarO0.isNull(iE12) ? null : vxeVarO0.B0(iE12);
                                String strB2 = vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13);
                                byte[] blob = vxeVarO0.isNull(iE14) ? null : vxeVarO0.getBlob(iE14);
                                toaVar4.e().getClass();
                                c46 c46VarA = dwa.a(blob);
                                int i5 = iE15;
                                int i6 = iE3;
                                int i7 = (int) vxeVarO0.getLong(i5);
                                int i8 = iE16;
                                boolean z3 = ((int) vxeVarO0.getLong(i8)) != 0;
                                int i9 = iE17;
                                int i10 = (int) vxeVarO0.getLong(i9);
                                int i11 = iE18;
                                long j14 = vxeVarO0.getLong(i11);
                                int i12 = iE19;
                                boolean z4 = ((int) vxeVarO0.getLong(i12)) != 0;
                                int i13 = iE20;
                                long j15 = vxeVarO0.getLong(i13);
                                int i14 = iE21;
                                String strB3 = vxeVarO0.isNull(i14) ? null : vxeVarO0.B0(i14);
                                int i15 = iE22;
                                String strB4 = vxeVarO0.isNull(i15) ? null : vxeVarO0.B0(i15);
                                iE22 = i15;
                                int i16 = iE23;
                                String strB5 = vxeVarO0.isNull(i16) ? null : vxeVarO0.B0(i16);
                                iE23 = i16;
                                int i17 = iE24;
                                Integer numValueOf = vxeVarO0.isNull(i17) ? null : Integer.valueOf((int) vxeVarO0.getLong(i17));
                                toaVar4.d().getClass();
                                int iA = vo3.a(numValueOf);
                                int i18 = iE25;
                                long j16 = vxeVarO0.getLong(i18);
                                int i19 = iE26;
                                long j17 = vxeVarO0.getLong(i19);
                                int i110 = iE27;
                                int i20 = (int) vxeVarO0.getLong(i110);
                                toaVar4.e().getClass();
                                int iE39 = dwa.e(i20);
                                int i21 = iE28;
                                long j18 = vxeVarO0.getLong(i21);
                                int i22 = iE29;
                                int i23 = (int) vxeVarO0.getLong(i22);
                                int i24 = iE30;
                                int i25 = iE4;
                                int i26 = (int) vxeVarO0.getLong(i24);
                                int i27 = iE31;
                                long j19 = vxeVarO0.getLong(i27);
                                int i28 = iE32;
                                int i29 = (int) vxeVarO0.getLong(i28);
                                int i30 = iE33;
                                long j20 = vxeVarO0.getLong(i30);
                                iE32 = i28;
                                int i31 = iE34;
                                byte[] blob2 = vxeVarO0.getBlob(i31);
                                toaVar4.e().getClass();
                                List listC = dwa.c(blob2);
                                iE34 = i31;
                                iE35 = iE35;
                                kja kjaVarF = toaVar4.e().f(vxeVarO0.isNull(iE35) ? null : vxeVarO0.getBlob(iE35));
                                int i32 = iE36;
                                Long lValueOf = vxeVarO0.isNull(i32) ? null : Long.valueOf(vxeVarO0.getLong(i32));
                                int i33 = iE37;
                                Integer numValueOf2 = vxeVarO0.isNull(i33) ? null : Integer.valueOf((int) vxeVarO0.getLong(i33));
                                if (numValueOf2 != null) {
                                    boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                                }
                                int i34 = iE38;
                                arrayList.add(new gga(j7, j8, j9, j10, j11, j12, strB0, xfaVarB, wjaVarD, z2, j13, strB1, strB2, c46VarA, i7, z3, i10, j14, z4, j15, strB3, strB4, strB5, iA, j16, j17, iE39, j18, i23, i26, j19, i29, j20, listC, kjaVarF, lValueOf, boolValueOf, vxeVarO0.getLong(i34)));
                                iE37 = i33;
                                iE38 = i34;
                                iE19 = i12;
                                iE20 = i13;
                                iE21 = i14;
                                iE24 = i17;
                                iE25 = i18;
                                iE26 = i19;
                                iE27 = i110;
                                iE28 = i21;
                                iE4 = i25;
                                iE30 = i24;
                                iE31 = i27;
                                iE33 = i30;
                                iE2 = iE2;
                                iE29 = i22;
                                iE3 = i6;
                                iE36 = i32;
                                iE15 = i5;
                                iE16 = i8;
                                iE17 = i9;
                                iE = iE;
                                iE18 = i11;
                            }
                            return arrayList;
                        } finally {
                            vxeVarO0.close();
                        }
                    }

                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) throws Exception {
                        Boolean boolValueOf;
                        Boolean boolValueOf2;
                        int i3 = i2;
                        toa toaVar4 = toaVar3;
                        long j4 = j3;
                        long j5 = j2;
                        long j6 = j;
                        switch (i3) {
                            case 0:
                                vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
                                try {
                                    vxeVarO0.c(1, j6);
                                    vxeVarO0.c(2, j5);
                                    vxeVarO0.c(3, j4);
                                    toaVar4.e().getClass();
                                    vxeVarO0.c(4, 10L);
                                    vxeVarO0.c(5, 40L);
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
                                        long j7 = vxeVarO0.getLong(iE);
                                        long j8 = vxeVarO0.getLong(iE2);
                                        long j9 = vxeVarO0.getLong(iE3);
                                        long j10 = vxeVarO0.getLong(iE4);
                                        long j11 = vxeVarO0.getLong(iE5);
                                        long j12 = vxeVarO0.getLong(iE6);
                                        String strB0 = vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7);
                                        int i4 = (int) vxeVarO0.getLong(iE8);
                                        toaVar4.e().getClass();
                                        xfa xfaVarB = dwa.b(i4);
                                        int i5 = (int) vxeVarO0.getLong(iE9);
                                        toaVar4.e().getClass();
                                        wja wjaVarD = dwa.d(i5);
                                        boolean z2 = ((int) vxeVarO0.getLong(iE10)) != 0;
                                        long j13 = vxeVarO0.getLong(iE11);
                                        String strB1 = vxeVarO0.isNull(iE12) ? null : vxeVarO0.B0(iE12);
                                        String strB2 = vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13);
                                        byte[] blob = vxeVarO0.isNull(iE14) ? null : vxeVarO0.getBlob(iE14);
                                        toaVar4.e().getClass();
                                        c46 c46VarA = dwa.a(blob);
                                        int i6 = iE15;
                                        int i7 = iE8;
                                        int i8 = iE7;
                                        int i9 = (int) vxeVarO0.getLong(i6);
                                        int i10 = iE16;
                                        boolean z3 = ((int) vxeVarO0.getLong(i10)) != 0;
                                        int i11 = iE17;
                                        int i12 = (int) vxeVarO0.getLong(i11);
                                        long j14 = vxeVarO0.getLong(iE18);
                                        iE17 = i11;
                                        int i13 = iE19;
                                        boolean z4 = ((int) vxeVarO0.getLong(i13)) != 0;
                                        iE20 = iE20;
                                        long j15 = vxeVarO0.getLong(iE20);
                                        iE21 = iE21;
                                        String strB3 = vxeVarO0.isNull(iE21) ? null : vxeVarO0.B0(iE21);
                                        iE19 = i13;
                                        int i14 = iE22;
                                        String strB4 = vxeVarO0.isNull(i14) ? null : vxeVarO0.B0(i14);
                                        iE22 = i14;
                                        int i15 = iE23;
                                        String strB5 = vxeVarO0.isNull(i15) ? null : vxeVarO0.B0(i15);
                                        iE23 = i15;
                                        int i16 = iE24;
                                        Integer numValueOf = vxeVarO0.isNull(i16) ? null : Integer.valueOf((int) vxeVarO0.getLong(i16));
                                        toaVar4.d().getClass();
                                        int iA = vo3.a(numValueOf);
                                        int i17 = iE25;
                                        long j16 = vxeVarO0.getLong(i17);
                                        int i18 = iE26;
                                        long j17 = vxeVarO0.getLong(i18);
                                        iE24 = i16;
                                        iE25 = i17;
                                        iE26 = i18;
                                        int i19 = iE27;
                                        int i110 = (int) vxeVarO0.getLong(i19);
                                        toaVar4.e().getClass();
                                        int iE39 = dwa.e(i110);
                                        int i20 = iE28;
                                        long j18 = vxeVarO0.getLong(i20);
                                        int i21 = iE29;
                                        int i22 = (int) vxeVarO0.getLong(i21);
                                        int i23 = iE30;
                                        int i24 = (int) vxeVarO0.getLong(i23);
                                        long j19 = vxeVarO0.getLong(iE31);
                                        int i25 = iE32;
                                        int i26 = (int) vxeVarO0.getLong(i25);
                                        int i27 = iE33;
                                        long j20 = vxeVarO0.getLong(i27);
                                        iE32 = i25;
                                        int i28 = iE34;
                                        byte[] blob2 = vxeVarO0.getBlob(i28);
                                        toaVar4.e().getClass();
                                        List listC = dwa.c(blob2);
                                        iE34 = i28;
                                        iE35 = iE35;
                                        kja kjaVarF = toaVar4.e().f(vxeVarO0.isNull(iE35) ? null : vxeVarO0.getBlob(iE35));
                                        int i29 = iE36;
                                        Long lValueOf = vxeVarO0.isNull(i29) ? null : Long.valueOf(vxeVarO0.getLong(i29));
                                        int i30 = iE37;
                                        Integer numValueOf2 = vxeVarO0.isNull(i30) ? null : Integer.valueOf((int) vxeVarO0.getLong(i30));
                                        if (numValueOf2 != null) {
                                            boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                                        } else {
                                            boolValueOf = null;
                                        }
                                        int i31 = iE38;
                                        arrayList.add(new gga(j7, j8, j9, j10, j11, j12, strB0, xfaVarB, wjaVarD, z2, j13, strB1, strB2, c46VarA, i9, z3, i12, j14, z4, j15, strB3, strB4, strB5, iA, j16, j17, iE39, j18, i22, i24, j19, i26, j20, listC, kjaVarF, lValueOf, boolValueOf, vxeVarO0.getLong(i31)));
                                        iE7 = i8;
                                        iE37 = i30;
                                        iE38 = i31;
                                        iE2 = iE2;
                                        iE15 = i6;
                                        iE8 = i7;
                                        iE16 = i10;
                                        iE27 = i19;
                                        iE28 = i20;
                                        iE29 = i21;
                                        iE30 = i23;
                                        iE33 = i27;
                                        iE36 = i29;
                                        iE = iE;
                                        break;
                                    }
                                    return arrayList;
                                } finally {
                                    vxeVarO0.close();
                                }
                            case 1:
                                return a(obj);
                            default:
                                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC, time_local ASC LIMIT ?");
                                try {
                                    vxeVarO1.c(1, j6);
                                    vxeVarO1.c(2, j5);
                                    vxeVarO1.c(3, j4);
                                    toaVar4.e().getClass();
                                    vxeVarO1.c(4, 10L);
                                    vxeVarO1.c(5, 40L);
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
                                    ArrayList arrayList2 = new ArrayList();
                                    while (vxeVarO1.M0()) {
                                        long j21 = vxeVarO1.getLong(iE40);
                                        long j22 = vxeVarO1.getLong(iE41);
                                        long j23 = vxeVarO1.getLong(iE42);
                                        long j24 = vxeVarO1.getLong(iE43);
                                        long j25 = vxeVarO1.getLong(iE44);
                                        long j26 = vxeVarO1.getLong(iE45);
                                        String strB6 = vxeVarO1.isNull(iE46) ? null : vxeVarO1.B0(iE46);
                                        int i32 = iE46;
                                        int i33 = iE45;
                                        int i34 = (int) vxeVarO1.getLong(iE47);
                                        toaVar4.e().getClass();
                                        xfa xfaVarB2 = dwa.b(i34);
                                        int i35 = (int) vxeVarO1.getLong(iE48);
                                        toaVar4.e().getClass();
                                        wja wjaVarD2 = dwa.d(i35);
                                        boolean z5 = ((int) vxeVarO1.getLong(iE49)) != 0;
                                        long j27 = vxeVarO1.getLong(iE50);
                                        String strB7 = vxeVarO1.isNull(iE51) ? null : vxeVarO1.B0(iE51);
                                        String strB8 = vxeVarO1.isNull(iE52) ? null : vxeVarO1.B0(iE52);
                                        byte[] blob3 = vxeVarO1.isNull(iE53) ? null : vxeVarO1.getBlob(iE53);
                                        toaVar4.e().getClass();
                                        c46 c46VarA2 = dwa.a(blob3);
                                        int i36 = iE54;
                                        int i37 = iE48;
                                        int i38 = iE47;
                                        int i39 = (int) vxeVarO1.getLong(i36);
                                        int i40 = iE55;
                                        boolean z6 = ((int) vxeVarO1.getLong(i40)) != 0;
                                        int i41 = iE56;
                                        int i42 = (int) vxeVarO1.getLong(i41);
                                        long j28 = vxeVarO1.getLong(iE57);
                                        int i43 = iE40;
                                        int i44 = iE58;
                                        boolean z7 = ((int) vxeVarO1.getLong(i44)) != 0;
                                        iE59 = iE59;
                                        long j29 = vxeVarO1.getLong(iE59);
                                        iE60 = iE60;
                                        String strB9 = vxeVarO1.isNull(iE60) ? null : vxeVarO1.B0(iE60);
                                        iE58 = i44;
                                        int i45 = iE61;
                                        String strB10 = vxeVarO1.isNull(i45) ? null : vxeVarO1.B0(i45);
                                        iE61 = i45;
                                        int i46 = iE62;
                                        String strB11 = vxeVarO1.isNull(i46) ? null : vxeVarO1.B0(i46);
                                        iE62 = i46;
                                        int i47 = iE63;
                                        Integer numValueOf3 = vxeVarO1.isNull(i47) ? null : Integer.valueOf((int) vxeVarO1.getLong(i47));
                                        toaVar4.d().getClass();
                                        int iA2 = vo3.a(numValueOf3);
                                        int i48 = iE64;
                                        long j30 = vxeVarO1.getLong(i48);
                                        int i49 = iE65;
                                        long j31 = vxeVarO1.getLong(i49);
                                        iE63 = i47;
                                        iE64 = i48;
                                        iE65 = i49;
                                        int i50 = iE66;
                                        int i51 = (int) vxeVarO1.getLong(i50);
                                        toaVar4.e().getClass();
                                        int iE78 = dwa.e(i51);
                                        int i52 = iE67;
                                        long j32 = vxeVarO1.getLong(i52);
                                        int i53 = iE68;
                                        int i54 = (int) vxeVarO1.getLong(i53);
                                        int i55 = iE69;
                                        int i56 = (int) vxeVarO1.getLong(i55);
                                        int i57 = iE70;
                                        long j33 = vxeVarO1.getLong(i57);
                                        int i58 = iE71;
                                        int i59 = (int) vxeVarO1.getLong(i58);
                                        int i60 = iE72;
                                        long j34 = vxeVarO1.getLong(i60);
                                        int i61 = iE73;
                                        byte[] blob4 = vxeVarO1.getBlob(i61);
                                        toaVar4.e().getClass();
                                        List listC2 = dwa.c(blob4);
                                        iE73 = i61;
                                        int i62 = iE74;
                                        kja kjaVarF2 = toaVar4.e().f(vxeVarO1.isNull(i62) ? null : vxeVarO1.getBlob(i62));
                                        int i63 = iE75;
                                        Long lValueOf2 = vxeVarO1.isNull(i63) ? null : Long.valueOf(vxeVarO1.getLong(i63));
                                        int i64 = iE76;
                                        Integer numValueOf4 = vxeVarO1.isNull(i64) ? null : Integer.valueOf((int) vxeVarO1.getLong(i64));
                                        if (numValueOf4 != null) {
                                            boolValueOf2 = Boolean.valueOf(numValueOf4.intValue() != 0);
                                        } else {
                                            boolValueOf2 = null;
                                        }
                                        int i65 = iE77;
                                        arrayList2.add(new gga(j21, j22, j23, j24, j25, j26, strB6, xfaVarB2, wjaVarD2, z5, j27, strB7, strB8, c46VarA2, i39, z6, i42, j28, z7, j29, strB9, strB10, strB11, iA2, j30, j31, iE78, j32, i54, i56, j33, i59, j34, listC2, kjaVarF2, lValueOf2, boolValueOf2, vxeVarO1.getLong(i65)));
                                        iE75 = i63;
                                        iE76 = i64;
                                        iE77 = i65;
                                        iE40 = i43;
                                        iE56 = i41;
                                        iE66 = i50;
                                        iE70 = i57;
                                        iE71 = i58;
                                        iE72 = i60;
                                        iE46 = i32;
                                        iE48 = i37;
                                        iE74 = i62;
                                        iE47 = i38;
                                        iE54 = i36;
                                        iE55 = i40;
                                        iE67 = i52;
                                        iE68 = i53;
                                        iE69 = i55;
                                        iE45 = i33;
                                        break;
                                    }
                                    return arrayList2;
                                } finally {
                                    vxeVarO1.close();
                                }
                        }
                    }
                });
            } else {
                final toa toaVar4 = (toa) wnaVarH2;
                final int i3 = 1;
                list = (List) ch3.G(toaVar4.a, true, false, new cf7() { // from class: yna
                    private final Object a(Object obj) throws Exception {
                        long j4 = j;
                        long j5 = j2;
                        long j6 = j3;
                        toa toaVar5 = toaVar4;
                        vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire ASC LIMIT ?");
                        try {
                            vxeVarO0.c(1, j4);
                            vxeVarO0.c(2, j5);
                            vxeVarO0.c(3, j6);
                            toaVar5.e().getClass();
                            vxeVarO0.c(4, 10L);
                            vxeVarO0.c(5, 40L);
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
                                long j7 = vxeVarO0.getLong(iE);
                                long j8 = vxeVarO0.getLong(iE2);
                                long j9 = vxeVarO0.getLong(iE3);
                                long j10 = vxeVarO0.getLong(iE4);
                                long j11 = vxeVarO0.getLong(iE5);
                                long j12 = vxeVarO0.getLong(iE6);
                                Boolean boolValueOf = null;
                                String strB0 = vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7);
                                int i4 = (int) vxeVarO0.getLong(iE8);
                                toaVar5.e().getClass();
                                xfa xfaVarB = dwa.b(i4);
                                int i5 = (int) vxeVarO0.getLong(iE9);
                                toaVar5.e().getClass();
                                wja wjaVarD = dwa.d(i5);
                                boolean z2 = ((int) vxeVarO0.getLong(iE10)) != 0;
                                long j13 = vxeVarO0.getLong(iE11);
                                String strB1 = vxeVarO0.isNull(iE12) ? null : vxeVarO0.B0(iE12);
                                String strB2 = vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13);
                                byte[] blob = vxeVarO0.isNull(iE14) ? null : vxeVarO0.getBlob(iE14);
                                toaVar5.e().getClass();
                                c46 c46VarA = dwa.a(blob);
                                int i6 = iE15;
                                int i7 = iE3;
                                int i8 = (int) vxeVarO0.getLong(i6);
                                int i9 = iE16;
                                boolean z3 = ((int) vxeVarO0.getLong(i9)) != 0;
                                int i10 = iE17;
                                int i11 = (int) vxeVarO0.getLong(i10);
                                int i12 = iE18;
                                long j14 = vxeVarO0.getLong(i12);
                                int i13 = iE19;
                                boolean z4 = ((int) vxeVarO0.getLong(i13)) != 0;
                                int i14 = iE20;
                                long j15 = vxeVarO0.getLong(i14);
                                int i15 = iE21;
                                String strB3 = vxeVarO0.isNull(i15) ? null : vxeVarO0.B0(i15);
                                int i16 = iE22;
                                String strB4 = vxeVarO0.isNull(i16) ? null : vxeVarO0.B0(i16);
                                iE22 = i16;
                                int i17 = iE23;
                                String strB5 = vxeVarO0.isNull(i17) ? null : vxeVarO0.B0(i17);
                                iE23 = i17;
                                int i18 = iE24;
                                Integer numValueOf = vxeVarO0.isNull(i18) ? null : Integer.valueOf((int) vxeVarO0.getLong(i18));
                                toaVar5.d().getClass();
                                int iA = vo3.a(numValueOf);
                                int i19 = iE25;
                                long j16 = vxeVarO0.getLong(i19);
                                int i110 = iE26;
                                long j17 = vxeVarO0.getLong(i110);
                                int i111 = iE27;
                                int i20 = (int) vxeVarO0.getLong(i111);
                                toaVar5.e().getClass();
                                int iE39 = dwa.e(i20);
                                int i21 = iE28;
                                long j18 = vxeVarO0.getLong(i21);
                                int i22 = iE29;
                                int i23 = (int) vxeVarO0.getLong(i22);
                                int i24 = iE30;
                                int i25 = iE4;
                                int i26 = (int) vxeVarO0.getLong(i24);
                                int i27 = iE31;
                                long j19 = vxeVarO0.getLong(i27);
                                int i28 = iE32;
                                int i29 = (int) vxeVarO0.getLong(i28);
                                int i30 = iE33;
                                long j20 = vxeVarO0.getLong(i30);
                                iE32 = i28;
                                int i31 = iE34;
                                byte[] blob2 = vxeVarO0.getBlob(i31);
                                toaVar5.e().getClass();
                                List listC = dwa.c(blob2);
                                iE34 = i31;
                                iE35 = iE35;
                                kja kjaVarF = toaVar5.e().f(vxeVarO0.isNull(iE35) ? null : vxeVarO0.getBlob(iE35));
                                int i32 = iE36;
                                Long lValueOf = vxeVarO0.isNull(i32) ? null : Long.valueOf(vxeVarO0.getLong(i32));
                                int i33 = iE37;
                                Integer numValueOf2 = vxeVarO0.isNull(i33) ? null : Integer.valueOf((int) vxeVarO0.getLong(i33));
                                if (numValueOf2 != null) {
                                    boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                                }
                                int i34 = iE38;
                                arrayList.add(new gga(j7, j8, j9, j10, j11, j12, strB0, xfaVarB, wjaVarD, z2, j13, strB1, strB2, c46VarA, i8, z3, i11, j14, z4, j15, strB3, strB4, strB5, iA, j16, j17, iE39, j18, i23, i26, j19, i29, j20, listC, kjaVarF, lValueOf, boolValueOf, vxeVarO0.getLong(i34)));
                                iE37 = i33;
                                iE38 = i34;
                                iE19 = i13;
                                iE20 = i14;
                                iE21 = i15;
                                iE24 = i18;
                                iE25 = i19;
                                iE26 = i110;
                                iE27 = i111;
                                iE28 = i21;
                                iE4 = i25;
                                iE30 = i24;
                                iE31 = i27;
                                iE33 = i30;
                                iE2 = iE2;
                                iE29 = i22;
                                iE3 = i7;
                                iE36 = i32;
                                iE15 = i6;
                                iE16 = i9;
                                iE17 = i10;
                                iE = iE;
                                iE18 = i12;
                            }
                            return arrayList;
                        } finally {
                            vxeVarO0.close();
                        }
                    }

                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) throws Exception {
                        Boolean boolValueOf;
                        Boolean boolValueOf2;
                        int i4 = i3;
                        toa toaVar5 = toaVar4;
                        long j4 = j3;
                        long j5 = j2;
                        long j6 = j;
                        switch (i4) {
                            case 0:
                                vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
                                try {
                                    vxeVarO0.c(1, j6);
                                    vxeVarO0.c(2, j5);
                                    vxeVarO0.c(3, j4);
                                    toaVar5.e().getClass();
                                    vxeVarO0.c(4, 10L);
                                    vxeVarO0.c(5, 40L);
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
                                        long j7 = vxeVarO0.getLong(iE);
                                        long j8 = vxeVarO0.getLong(iE2);
                                        long j9 = vxeVarO0.getLong(iE3);
                                        long j10 = vxeVarO0.getLong(iE4);
                                        long j11 = vxeVarO0.getLong(iE5);
                                        long j12 = vxeVarO0.getLong(iE6);
                                        String strB0 = vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7);
                                        int i5 = (int) vxeVarO0.getLong(iE8);
                                        toaVar5.e().getClass();
                                        xfa xfaVarB = dwa.b(i5);
                                        int i6 = (int) vxeVarO0.getLong(iE9);
                                        toaVar5.e().getClass();
                                        wja wjaVarD = dwa.d(i6);
                                        boolean z2 = ((int) vxeVarO0.getLong(iE10)) != 0;
                                        long j13 = vxeVarO0.getLong(iE11);
                                        String strB1 = vxeVarO0.isNull(iE12) ? null : vxeVarO0.B0(iE12);
                                        String strB2 = vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13);
                                        byte[] blob = vxeVarO0.isNull(iE14) ? null : vxeVarO0.getBlob(iE14);
                                        toaVar5.e().getClass();
                                        c46 c46VarA = dwa.a(blob);
                                        int i7 = iE15;
                                        int i8 = iE8;
                                        int i9 = iE7;
                                        int i10 = (int) vxeVarO0.getLong(i7);
                                        int i11 = iE16;
                                        boolean z3 = ((int) vxeVarO0.getLong(i11)) != 0;
                                        int i12 = iE17;
                                        int i13 = (int) vxeVarO0.getLong(i12);
                                        long j14 = vxeVarO0.getLong(iE18);
                                        iE17 = i12;
                                        int i14 = iE19;
                                        boolean z4 = ((int) vxeVarO0.getLong(i14)) != 0;
                                        iE20 = iE20;
                                        long j15 = vxeVarO0.getLong(iE20);
                                        iE21 = iE21;
                                        String strB3 = vxeVarO0.isNull(iE21) ? null : vxeVarO0.B0(iE21);
                                        iE19 = i14;
                                        int i15 = iE22;
                                        String strB4 = vxeVarO0.isNull(i15) ? null : vxeVarO0.B0(i15);
                                        iE22 = i15;
                                        int i16 = iE23;
                                        String strB5 = vxeVarO0.isNull(i16) ? null : vxeVarO0.B0(i16);
                                        iE23 = i16;
                                        int i17 = iE24;
                                        Integer numValueOf = vxeVarO0.isNull(i17) ? null : Integer.valueOf((int) vxeVarO0.getLong(i17));
                                        toaVar5.d().getClass();
                                        int iA = vo3.a(numValueOf);
                                        int i18 = iE25;
                                        long j16 = vxeVarO0.getLong(i18);
                                        int i19 = iE26;
                                        long j17 = vxeVarO0.getLong(i19);
                                        iE24 = i17;
                                        iE25 = i18;
                                        iE26 = i19;
                                        int i110 = iE27;
                                        int i111 = (int) vxeVarO0.getLong(i110);
                                        toaVar5.e().getClass();
                                        int iE39 = dwa.e(i111);
                                        int i20 = iE28;
                                        long j18 = vxeVarO0.getLong(i20);
                                        int i21 = iE29;
                                        int i22 = (int) vxeVarO0.getLong(i21);
                                        int i23 = iE30;
                                        int i24 = (int) vxeVarO0.getLong(i23);
                                        long j19 = vxeVarO0.getLong(iE31);
                                        int i25 = iE32;
                                        int i26 = (int) vxeVarO0.getLong(i25);
                                        int i27 = iE33;
                                        long j20 = vxeVarO0.getLong(i27);
                                        iE32 = i25;
                                        int i28 = iE34;
                                        byte[] blob2 = vxeVarO0.getBlob(i28);
                                        toaVar5.e().getClass();
                                        List listC = dwa.c(blob2);
                                        iE34 = i28;
                                        iE35 = iE35;
                                        kja kjaVarF = toaVar5.e().f(vxeVarO0.isNull(iE35) ? null : vxeVarO0.getBlob(iE35));
                                        int i29 = iE36;
                                        Long lValueOf = vxeVarO0.isNull(i29) ? null : Long.valueOf(vxeVarO0.getLong(i29));
                                        int i30 = iE37;
                                        Integer numValueOf2 = vxeVarO0.isNull(i30) ? null : Integer.valueOf((int) vxeVarO0.getLong(i30));
                                        if (numValueOf2 != null) {
                                            boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                                        } else {
                                            boolValueOf = null;
                                        }
                                        int i31 = iE38;
                                        arrayList.add(new gga(j7, j8, j9, j10, j11, j12, strB0, xfaVarB, wjaVarD, z2, j13, strB1, strB2, c46VarA, i10, z3, i13, j14, z4, j15, strB3, strB4, strB5, iA, j16, j17, iE39, j18, i22, i24, j19, i26, j20, listC, kjaVarF, lValueOf, boolValueOf, vxeVarO0.getLong(i31)));
                                        iE7 = i9;
                                        iE37 = i30;
                                        iE38 = i31;
                                        iE2 = iE2;
                                        iE15 = i7;
                                        iE8 = i8;
                                        iE16 = i11;
                                        iE27 = i110;
                                        iE28 = i20;
                                        iE29 = i21;
                                        iE30 = i23;
                                        iE33 = i27;
                                        iE36 = i29;
                                        iE = iE;
                                        break;
                                    }
                                    return arrayList;
                                } finally {
                                    vxeVarO0.close();
                                }
                            case 1:
                                return a(obj);
                            default:
                                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC, time_local ASC LIMIT ?");
                                try {
                                    vxeVarO1.c(1, j6);
                                    vxeVarO1.c(2, j5);
                                    vxeVarO1.c(3, j4);
                                    toaVar5.e().getClass();
                                    vxeVarO1.c(4, 10L);
                                    vxeVarO1.c(5, 40L);
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
                                    ArrayList arrayList2 = new ArrayList();
                                    while (vxeVarO1.M0()) {
                                        long j21 = vxeVarO1.getLong(iE40);
                                        long j22 = vxeVarO1.getLong(iE41);
                                        long j23 = vxeVarO1.getLong(iE42);
                                        long j24 = vxeVarO1.getLong(iE43);
                                        long j25 = vxeVarO1.getLong(iE44);
                                        long j26 = vxeVarO1.getLong(iE45);
                                        String strB6 = vxeVarO1.isNull(iE46) ? null : vxeVarO1.B0(iE46);
                                        int i32 = iE46;
                                        int i33 = iE45;
                                        int i34 = (int) vxeVarO1.getLong(iE47);
                                        toaVar5.e().getClass();
                                        xfa xfaVarB2 = dwa.b(i34);
                                        int i35 = (int) vxeVarO1.getLong(iE48);
                                        toaVar5.e().getClass();
                                        wja wjaVarD2 = dwa.d(i35);
                                        boolean z5 = ((int) vxeVarO1.getLong(iE49)) != 0;
                                        long j27 = vxeVarO1.getLong(iE50);
                                        String strB7 = vxeVarO1.isNull(iE51) ? null : vxeVarO1.B0(iE51);
                                        String strB8 = vxeVarO1.isNull(iE52) ? null : vxeVarO1.B0(iE52);
                                        byte[] blob3 = vxeVarO1.isNull(iE53) ? null : vxeVarO1.getBlob(iE53);
                                        toaVar5.e().getClass();
                                        c46 c46VarA2 = dwa.a(blob3);
                                        int i36 = iE54;
                                        int i37 = iE48;
                                        int i38 = iE47;
                                        int i39 = (int) vxeVarO1.getLong(i36);
                                        int i40 = iE55;
                                        boolean z6 = ((int) vxeVarO1.getLong(i40)) != 0;
                                        int i41 = iE56;
                                        int i42 = (int) vxeVarO1.getLong(i41);
                                        long j28 = vxeVarO1.getLong(iE57);
                                        int i43 = iE40;
                                        int i44 = iE58;
                                        boolean z7 = ((int) vxeVarO1.getLong(i44)) != 0;
                                        iE59 = iE59;
                                        long j29 = vxeVarO1.getLong(iE59);
                                        iE60 = iE60;
                                        String strB9 = vxeVarO1.isNull(iE60) ? null : vxeVarO1.B0(iE60);
                                        iE58 = i44;
                                        int i45 = iE61;
                                        String strB10 = vxeVarO1.isNull(i45) ? null : vxeVarO1.B0(i45);
                                        iE61 = i45;
                                        int i46 = iE62;
                                        String strB11 = vxeVarO1.isNull(i46) ? null : vxeVarO1.B0(i46);
                                        iE62 = i46;
                                        int i47 = iE63;
                                        Integer numValueOf3 = vxeVarO1.isNull(i47) ? null : Integer.valueOf((int) vxeVarO1.getLong(i47));
                                        toaVar5.d().getClass();
                                        int iA2 = vo3.a(numValueOf3);
                                        int i48 = iE64;
                                        long j30 = vxeVarO1.getLong(i48);
                                        int i49 = iE65;
                                        long j31 = vxeVarO1.getLong(i49);
                                        iE63 = i47;
                                        iE64 = i48;
                                        iE65 = i49;
                                        int i50 = iE66;
                                        int i51 = (int) vxeVarO1.getLong(i50);
                                        toaVar5.e().getClass();
                                        int iE78 = dwa.e(i51);
                                        int i52 = iE67;
                                        long j32 = vxeVarO1.getLong(i52);
                                        int i53 = iE68;
                                        int i54 = (int) vxeVarO1.getLong(i53);
                                        int i55 = iE69;
                                        int i56 = (int) vxeVarO1.getLong(i55);
                                        int i57 = iE70;
                                        long j33 = vxeVarO1.getLong(i57);
                                        int i58 = iE71;
                                        int i59 = (int) vxeVarO1.getLong(i58);
                                        int i60 = iE72;
                                        long j34 = vxeVarO1.getLong(i60);
                                        int i61 = iE73;
                                        byte[] blob4 = vxeVarO1.getBlob(i61);
                                        toaVar5.e().getClass();
                                        List listC2 = dwa.c(blob4);
                                        iE73 = i61;
                                        int i62 = iE74;
                                        kja kjaVarF2 = toaVar5.e().f(vxeVarO1.isNull(i62) ? null : vxeVarO1.getBlob(i62));
                                        int i63 = iE75;
                                        Long lValueOf2 = vxeVarO1.isNull(i63) ? null : Long.valueOf(vxeVarO1.getLong(i63));
                                        int i64 = iE76;
                                        Integer numValueOf4 = vxeVarO1.isNull(i64) ? null : Integer.valueOf((int) vxeVarO1.getLong(i64));
                                        if (numValueOf4 != null) {
                                            boolValueOf2 = Boolean.valueOf(numValueOf4.intValue() != 0);
                                        } else {
                                            boolValueOf2 = null;
                                        }
                                        int i65 = iE77;
                                        arrayList2.add(new gga(j21, j22, j23, j24, j25, j26, strB6, xfaVarB2, wjaVarD2, z5, j27, strB7, strB8, c46VarA2, i39, z6, i42, j28, z7, j29, strB9, strB10, strB11, iA2, j30, j31, iE78, j32, i54, i56, j33, i59, j34, listC2, kjaVarF2, lValueOf2, boolValueOf2, vxeVarO1.getLong(i65)));
                                        iE75 = i63;
                                        iE76 = i64;
                                        iE77 = i65;
                                        iE40 = i43;
                                        iE56 = i41;
                                        iE66 = i50;
                                        iE70 = i57;
                                        iE71 = i58;
                                        iE72 = i60;
                                        iE46 = i32;
                                        iE48 = i37;
                                        iE74 = i62;
                                        iE47 = i38;
                                        iE54 = i36;
                                        iE55 = i40;
                                        iE67 = i52;
                                        iE68 = i53;
                                        iE69 = i55;
                                        iE45 = i33;
                                        break;
                                    }
                                    return arrayList2;
                                } finally {
                                    vxeVarO1.close();
                                }
                        }
                    }
                });
            }
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(oseVar.b((gga) it.next()));
        }
        if (z) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    public final sfa k(long j, mg5 mg5Var) {
        return ((ose) this.b.c()).r(j, mg5Var);
    }

    public final sfa l(long j) {
        ose oseVar = (ose) this.b.c();
        gga ggaVarG = ((toa) oseVar.h()).g(j);
        if (ggaVarG != null) {
            return oseVar.b(ggaVarG);
        }
        return null;
    }

    public final ArrayList m() {
        List list = xfa.b;
        ose oseVar = (ose) this.b.c();
        toa toaVar = (toa) oseVar.h();
        List list2 = (List) ch3.G(toaVar.a, true, false, new ol(toaVar, wja.DELETED));
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(oseVar.b((gga) it.next()));
        }
        return arrayList;
    }

    public final void n(long j, String str, tg4 tg4Var) {
        ((ose) this.b.c()).C(j, new fv9(str, 13, tg4Var));
    }

    public final void o(sfa sfaVar, c46 c46Var) {
        ((ose) this.b.c()).C(sfaVar.a, new oo(this, sfaVar, c46Var, 16));
    }

    public final void p(sfa sfaVar, xfa xfaVar) {
        n25 n25Var = this.b;
        uoa uoaVarC = n25Var.c();
        long j = sfaVar.a;
        toa toaVar = (toa) ((ose) uoaVarC).h();
        ch3.G(toaVar.a, false, true, new t14(toaVar, xfaVar, j, 5));
        if (xfaVar == xfa.ERROR && sfaVar.C()) {
            ((ose) n25Var.c()).C(sfaVar.a, new pfa(this, 0));
        }
    }

    public final void q(long j, List list, wja wjaVar, boolean z) {
        ((toa) ((ose) this.b.c()).h()).h(j, list, wjaVar, z);
    }

    public final void r(long j, long j2, wja wjaVar) {
        toa toaVar = (toa) ((ose) this.b.c()).h();
        ch3.G(toaVar.a, false, true, new ooa(toaVar, wjaVar, j, j2));
    }

    public final void s(long j, String str, List list, qw2 qw2Var, wja wjaVar) {
        wna wnaVarH = ((ose) this.b.c()).h();
        toa toaVar = (toa) wnaVarH;
        ((Number) ch3.G(toaVar.a, false, true, new iaa(toaVar, 11, new rfi(j, str, list, wjaVar)))).intValue();
        sfa sfaVarL = l(j);
        if (sfaVarL != null) {
            this.f.d(qw2Var.N(sfaVarL.h), sfaVarL);
        }
    }

    public final void t(long j, long j2, Long l) {
        ose oseVar = (ose) this.b.c();
        if (l == null) {
            ((Number) ch3.G(((toa) oseVar.h()).a, false, true, new x14(9, j2, j))).intValue();
            return;
        }
        ((Number) ch3.G(((toa) oseVar.h()).a, false, true, new z14(4, j2, l.longValue(), j))).intValue();
    }
}

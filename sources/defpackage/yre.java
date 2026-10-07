package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yre implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yre(xkh xkhVar, ctc ctcVar) {
        this.a = 7;
        this.b = ctcVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        String str;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final List list = (List) obj;
                wna wnaVarH = ((ose) obj2).h();
                final wja wjaVar = wja.DELETED;
                final toa toaVar = (toa) wnaVarH;
                toaVar.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM messages WHERE id in (");
                final int size = list.size();
                vd7.b(sb, size);
                sb.append(") AND inserted_from_msg_link = 0 AND status <> ");
                sb.append("?");
                final String string = sb.toString();
                return (List) ch3.G(toaVar.a, true, false, new cf7() { // from class: coa
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj3) throws Exception {
                        List list2 = list;
                        int i2 = size;
                        toa toaVar2 = toaVar;
                        wja wjaVar2 = wjaVar;
                        vxe vxeVarO0 = ((qxe) obj3).O0(string);
                        try {
                            Iterator it = list2.iterator();
                            int i3 = 1;
                            while (it.hasNext()) {
                                vxeVarO0.c(i3, ((Number) it.next()).longValue());
                                i3++;
                            }
                            toaVar2.e().getClass();
                            vxeVarO0.c(i2 + 1, wjaVar2.a);
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
                                long j = vxeVarO0.getLong(iE);
                                long j2 = vxeVarO0.getLong(iE2);
                                long j3 = vxeVarO0.getLong(iE3);
                                long j4 = vxeVarO0.getLong(iE4);
                                long j5 = vxeVarO0.getLong(iE5);
                                long j6 = vxeVarO0.getLong(iE6);
                                Boolean boolValueOf = null;
                                String strB0 = vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7);
                                int i4 = (int) vxeVarO0.getLong(iE8);
                                toaVar2.e().getClass();
                                xfa xfaVarB = dwa.b(i4);
                                int i5 = (int) vxeVarO0.getLong(iE9);
                                toaVar2.e().getClass();
                                wja wjaVarD = dwa.d(i5);
                                boolean z = ((int) vxeVarO0.getLong(iE10)) != 0;
                                long j7 = vxeVarO0.getLong(iE11);
                                String strB1 = vxeVarO0.isNull(iE12) ? null : vxeVarO0.B0(iE12);
                                String strB2 = vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13);
                                byte[] blob = vxeVarO0.isNull(iE14) ? null : vxeVarO0.getBlob(iE14);
                                toaVar2.e().getClass();
                                c46 c46VarA = dwa.a(blob);
                                int i6 = iE15;
                                int i7 = iE6;
                                int i8 = (int) vxeVarO0.getLong(i6);
                                int i9 = iE14;
                                int i10 = iE16;
                                int i11 = iE;
                                boolean z2 = ((int) vxeVarO0.getLong(i10)) != 0;
                                int i12 = iE17;
                                int i13 = iE2;
                                int i14 = (int) vxeVarO0.getLong(i12);
                                int i15 = iE18;
                                long j8 = vxeVarO0.getLong(i15);
                                int i16 = iE19;
                                boolean z3 = ((int) vxeVarO0.getLong(i16)) != 0;
                                int i17 = iE20;
                                long j9 = vxeVarO0.getLong(i17);
                                int i18 = iE21;
                                String strB3 = vxeVarO0.isNull(i18) ? null : vxeVarO0.B0(i18);
                                int i19 = iE22;
                                String strB4 = vxeVarO0.isNull(i19) ? null : vxeVarO0.B0(i19);
                                iE22 = i19;
                                int i20 = iE23;
                                String strB5 = vxeVarO0.isNull(i20) ? null : vxeVarO0.B0(i20);
                                iE23 = i20;
                                int i21 = iE24;
                                Integer numValueOf = vxeVarO0.isNull(i21) ? null : Integer.valueOf((int) vxeVarO0.getLong(i21));
                                toaVar2.d().getClass();
                                int iA = vo3.a(numValueOf);
                                int i22 = iE25;
                                long j10 = vxeVarO0.getLong(i22);
                                int i23 = iE26;
                                long j11 = vxeVarO0.getLong(i23);
                                int i24 = iE27;
                                int i25 = (int) vxeVarO0.getLong(i24);
                                toaVar2.e().getClass();
                                int iE39 = dwa.e(i25);
                                int i26 = iE28;
                                long j12 = vxeVarO0.getLong(i26);
                                int i27 = iE29;
                                int i28 = (int) vxeVarO0.getLong(i27);
                                int i29 = iE30;
                                int i30 = (int) vxeVarO0.getLong(i29);
                                int i31 = iE31;
                                long j13 = vxeVarO0.getLong(i31);
                                int i32 = iE32;
                                int i33 = (int) vxeVarO0.getLong(i32);
                                int i34 = iE33;
                                long j14 = vxeVarO0.getLong(i34);
                                int i35 = iE34;
                                byte[] blob2 = vxeVarO0.getBlob(i35);
                                toaVar2.e().getClass();
                                List listC = dwa.c(blob2);
                                iE34 = i35;
                                int i36 = iE35;
                                kja kjaVarF = toaVar2.e().f(vxeVarO0.isNull(i36) ? null : vxeVarO0.getBlob(i36));
                                int i37 = iE36;
                                Long lValueOf = vxeVarO0.isNull(i37) ? null : Long.valueOf(vxeVarO0.getLong(i37));
                                int i38 = iE37;
                                Integer numValueOf2 = vxeVarO0.isNull(i38) ? null : Integer.valueOf((int) vxeVarO0.getLong(i38));
                                if (numValueOf2 != null) {
                                    boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                                }
                                int i39 = iE38;
                                arrayList.add(new gga(j, j2, j3, j4, j5, j6, strB0, xfaVarB, wjaVarD, z, j7, strB1, strB2, c46VarA, i8, z2, i14, j8, z3, j9, strB3, strB4, strB5, iA, j10, j11, iE39, j12, i28, i30, j13, i33, j14, listC, kjaVarF, lValueOf, boolValueOf, vxeVarO0.getLong(i39)));
                                iE33 = i34;
                                iE2 = i13;
                                iE17 = i12;
                                iE18 = i15;
                                iE19 = i16;
                                iE20 = i17;
                                iE21 = i18;
                                iE24 = i21;
                                iE25 = i22;
                                iE26 = i23;
                                iE27 = i24;
                                iE28 = i26;
                                iE29 = i27;
                                iE32 = i32;
                                iE36 = i37;
                                iE37 = i38;
                                iE38 = i39;
                                iE = i11;
                                iE31 = i31;
                                iE4 = iE4;
                                iE5 = iE5;
                                iE14 = i9;
                                iE35 = i36;
                                iE16 = i10;
                                iE6 = i7;
                                iE15 = i6;
                                iE30 = i29;
                            }
                            return arrayList;
                        } finally {
                            vxeVarO0.close();
                        }
                    }
                });
            case 1:
                List list2 = (List) obj;
                nuc nucVarB = ((sse) obj2).b();
                nucVarB.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SELECT * FROM phones WHERE server_phone in (");
                List list3 = (List) ch3.G(nucVarB.a, true, false, new yn6(2, nbh.x(")", sb2, list2), list2));
                ArrayList arrayList = new ArrayList(yw3.W0(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(sse.c((stc) it.next()));
                }
                return arrayList;
            case 2:
                ((yre) obj2).invoke(new mw0((vxe) obj));
                return sbi.a;
            case 3:
                tse tseVar = (tse) obj2;
                vxe vxeVar = (vxe) obj;
                int i2 = tseVar.g;
                if (1 <= i2) {
                    int i3 = 1;
                    while (true) {
                        int i4 = tseVar.f[i3];
                        if (i4 == 1) {
                            vxeVar.e(i3);
                        } else if (i4 == 2) {
                            vxeVar.c(i3, tseVar.b[i3]);
                        } else if (i4 == 3) {
                            vxeVar.a(i3, tseVar.c[i3]);
                        } else if (i4 == 4) {
                            String str2 = tseVar.d[i3];
                            if (str2 == null) {
                                ore.p("Required value was null.");
                                return null;
                            }
                            vxeVar.B(i3, str2);
                        } else if (i4 == 5) {
                            byte[] bArr = tseVar.e[i3];
                            if (bArr == null) {
                                ore.p("Required value was null.");
                                return null;
                            }
                            vxeVar.d(i3, bArr);
                        }
                        if (i3 != i2) {
                            i3++;
                        }
                    }
                }
                return sbi.a;
            case 4:
                ((cf7) obj2).invoke(obj);
                return obj;
            case 5:
                ((amf) obj2).C();
                amf.g = null;
                return sbi.a;
            case 6:
                gvb gvbVar = (gvb) obj2;
                ore oreVar = mzj.A;
                r5e r5eVarT = ((WorkDatabase) obj).t();
                List list4 = (List) gvbVar.c;
                List list5 = (List) gvbVar.d;
                List list6 = (List) gvbVar.b;
                ArrayList arrayList2 = new ArrayList();
                StringBuilder sb3 = new StringBuilder("SELECT * FROM workspec");
                List list7 = (List) gvbVar.a;
                String str3 = " AND";
                if (list7.isEmpty()) {
                    str = " WHERE";
                } else {
                    List list8 = list7;
                    ArrayList arrayList3 = new ArrayList(yw3.W0(list8, 10));
                    Iterator it2 = list8.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(Integer.valueOf(rx8.a0((kyj) it2.next())));
                    }
                    sb3.append(" WHERE state IN (");
                    yab.i(sb3, arrayList3.size());
                    sb3.append(")");
                    arrayList2.addAll(arrayList3);
                    str = " AND";
                }
                if (!list6.isEmpty()) {
                    List list9 = list6;
                    ArrayList arrayList4 = new ArrayList(yw3.W0(list9, 10));
                    Iterator it3 = list9.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((UUID) it3.next()).toString());
                    }
                    sb3.append(str.concat(" id IN ("));
                    yab.i(sb3, list6.size());
                    sb3.append(")");
                    arrayList2.addAll(arrayList4);
                    str = " AND";
                }
                List list10 = list5;
                if (list10.isEmpty()) {
                    str3 = str;
                } else {
                    sb3.append(str.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
                    yab.i(sb3, list5.size());
                    sb3.append("))");
                    arrayList2.addAll(list10);
                }
                List list11 = list4;
                if (!list11.isEmpty()) {
                    sb3.append(str3.concat(" id IN (SELECT work_spec_id FROM workname WHERE name IN ("));
                    yab.i(sb3, list4.size());
                    sb3.append("))");
                    arrayList2.addAll(list11);
                }
                sb3.append(";");
                fbc fbcVar = new fbc(sb3.toString(), 13, arrayList2.toArray(new Object[0]));
                r5eVarT.getClass();
                TreeMap treeMap = tse.h;
                tse tseVarN = qe7.n(fbcVar);
                String strL = tseVarN.l();
                return (List) oreVar.mo41apply((List) ch3.G(r5eVarT.a, true, false, new gn4(strL, new p3c(strL, new yre(3, tseVarN)), r5eVarT)));
            case 7:
                ctc ctcVar = (ctc) obj2;
                vxe vxeVarO0 = ((qxe) obj).O0("DELETE FROM tasks WHERE type = ?");
                try {
                    vxeVarO0.c(1, ctcVar.a);
                    vxeVarO0.M0();
                    return sbi.a;
                } finally {
                    vxeVarO0.close();
                }
            default:
                ((a8j) obj2).z();
                return sbi.a;
        }
    }

    public /* synthetic */ yre(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}

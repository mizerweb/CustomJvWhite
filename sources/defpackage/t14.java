package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t14 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t14(String str, long j, Set set, yzg yzgVar) {
        this.a = 6;
        this.c = str;
        this.b = j;
        this.d = set;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = 2;
        switch (this.a) {
            case 0:
                g24 g24Var = (g24) this.c;
                xfa xfaVar = (xfa) this.d;
                long j = this.b;
                vxe vxeVarO0 = ((qxe) obj).O0("UPDATE comments SET delivery_status = ? WHERE id = ?");
                try {
                    g24Var.a().getClass();
                    vxeVarO0.c(1, xfaVar.a);
                    vxeVarO0.c(2, j);
                    vxeVarO0.M0();
                    return sbi.a;
                } finally {
                    vxeVarO0.close();
                }
            case 1:
                jfa jfaVar = (jfa) this.c;
                long j2 = this.b;
                sgg sggVar = (sgg) this.d;
                String str = jfaVar.e;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.e;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.j(j2, "stop viewport polling for chat#"), null);
                    }
                }
                jfaVar.g.remove(Long.valueOf(j2));
                jfaVar.f.remove(Long.valueOf(j2));
                jfaVar.i.remove(Long.valueOf(j2), sggVar);
                return sbi.a;
            case 2:
                toa toaVar = (toa) this.c;
                final long j3 = this.b;
                final ArrayList arrayList = (ArrayList) this.d;
                StringBuilder sbC = nbh.C("DELETE FROM messages WHERE chat_id = ? AND id IN (");
                vd7.b(sbC, arrayList.size());
                sbC.append(") AND id NOT IN (SELECT DISTINCT msg_link_id FROM messages WHERE msg_link_id > 0 AND status != 10)");
                final String string = sbC.toString();
                rre rreVar = toaVar.a;
                final int i2 = 0;
                ((Number) ch3.G(rreVar, false, true, new cf7() { // from class: ioa
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj2) throws Exception {
                        int iE0;
                        int i3 = i2;
                        int i4 = 2;
                        ArrayList arrayList2 = arrayList;
                        long j4 = j3;
                        String str2 = string;
                        qxe qxeVar = (qxe) obj2;
                        switch (i3) {
                            case 0:
                                vxe vxeVarO1 = qxeVar.O0(str2);
                                try {
                                    vxeVarO1.c(1, j4);
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        vxeVarO1.c(i4, ((Number) it.next()).longValue());
                                        i4++;
                                    }
                                    vxeVarO1.M0();
                                    iE0 = e9i.e0(qxeVar);
                                } finally {
                                    vxeVarO1.close();
                                }
                                break;
                            default:
                                vxe vxeVarO2 = qxeVar.O0(str2);
                                try {
                                    vxeVarO2.c(1, j4);
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        vxeVarO2.c(i4, ((Number) it2.next()).longValue());
                                        i4++;
                                    }
                                    vxeVarO2.M0();
                                    iE0 = e9i.e0(qxeVar);
                                } finally {
                                    vxeVarO2.close();
                                }
                                break;
                        }
                        return Integer.valueOf(iE0);
                    }
                })).intValue();
                StringBuilder sb = new StringBuilder();
                sb.append("UPDATE messages SET status = 10 WHERE chat_id = ? AND id IN (");
                vd7.b(sb, arrayList.size());
                sb.append(") AND id IN (SELECT DISTINCT msg_link_id FROM messages WHERE msg_link_id > 0 AND status != 10)");
                final String string2 = sb.toString();
                final int i3 = 1;
                ((Number) ch3.G(rreVar, false, true, new cf7() { // from class: ioa
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj2) throws Exception {
                        int iE0;
                        int i4 = i3;
                        int i5 = 2;
                        ArrayList arrayList2 = arrayList;
                        long j4 = j3;
                        String str2 = string2;
                        qxe qxeVar = (qxe) obj2;
                        switch (i4) {
                            case 0:
                                vxe vxeVarO1 = qxeVar.O0(str2);
                                try {
                                    vxeVarO1.c(1, j4);
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        vxeVarO1.c(i5, ((Number) it.next()).longValue());
                                        i5++;
                                    }
                                    vxeVarO1.M0();
                                    iE0 = e9i.e0(qxeVar);
                                } finally {
                                    vxeVarO1.close();
                                }
                                break;
                            default:
                                vxe vxeVarO2 = qxeVar.O0(str2);
                                try {
                                    vxeVarO2.c(1, j4);
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        vxeVarO2.c(i5, ((Number) it2.next()).longValue());
                                        i5++;
                                    }
                                    vxeVarO2.M0();
                                    iE0 = e9i.e0(qxeVar);
                                } finally {
                                    vxeVarO2.close();
                                }
                                break;
                        }
                        return Integer.valueOf(iE0);
                    }
                })).intValue();
                return sbi.a;
            case 3:
                String str2 = (String) this.c;
                long j4 = this.b;
                Collection collection = (Collection) this.d;
                vxe vxeVarO1 = ((qxe) obj).O0(str2);
                try {
                    vxeVarO1.c(1, j4);
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        vxeVarO1.c(i, ((Number) it.next()).longValue());
                        i++;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO1.M0()) {
                        arrayList2.add(Long.valueOf(vxeVarO1.getLong(0)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    vxeVarO1.close();
                }
            case 4:
                Long l = (Long) this.c;
                Boolean bool = (Boolean) this.d;
                long j5 = this.b;
                vxe vxeVarO2 = ((qxe) obj).O0("UPDATE messages SET delayed_attrs_time_to_fire = ?, delayed_attrs_notify_sender = ? WHERE id = ?");
                try {
                    if (l == null) {
                        vxeVarO2.e(1);
                    } else {
                        vxeVarO2.c(1, l.longValue());
                    }
                    Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                    if (numValueOf == null) {
                        vxeVarO2.e(2);
                    } else {
                        vxeVarO2.c(2, numValueOf.intValue());
                    }
                    vxeVarO2.c(3, j5);
                    vxeVarO2.M0();
                    vxeVarO2.close();
                    return sbi.a;
                } catch (Throwable th) {
                    vxeVarO2.close();
                    throw th;
                }
            case 5:
                toa toaVar2 = (toa) this.c;
                xfa xfaVar2 = (xfa) this.d;
                long j6 = this.b;
                vxe vxeVarO3 = ((qxe) obj).O0("UPDATE messages SET delivery_status = ? WHERE id = ?");
                try {
                    toaVar2.e().getClass();
                    vxeVarO3.c(1, xfaVar2.a);
                    vxeVarO3.c(2, j6);
                    vxeVarO3.M0();
                    return sbi.a;
                } finally {
                    vxeVarO3.close();
                }
            case 6:
                String str3 = (String) this.c;
                long j7 = this.b;
                Set set = (Set) this.d;
                vxe vxeVarO4 = ((qxe) obj).O0(str3);
                try {
                    vxeVarO4.c(1, j7);
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        vxeVarO4.c(i, ((w0h) it2.next()).a);
                        i++;
                    }
                    int iE = qyj.E(vxeVarO4, "publish_id");
                    int iE2 = qyj.E(vxeVarO4, "draft_id");
                    int iE3 = qyj.E(vxeVarO4, "segment_index");
                    int iE4 = qyj.E(vxeVarO4, "story_id");
                    int iE5 = qyj.E(vxeVarO4, "segment_path");
                    int iE6 = qyj.E(vxeVarO4, "is_video");
                    int iE7 = qyj.E(vxeVarO4, "upload_token");
                    int iE8 = qyj.E(vxeVarO4, "status");
                    int iE9 = qyj.E(vxeVarO4, "created_at");
                    ArrayList arrayList3 = new ArrayList();
                    while (vxeVarO4.M0()) {
                        arrayList3.add(new zzg(vxeVarO4.getLong(iE), vxeVarO4.getLong(iE2), (int) vxeVarO4.getLong(iE3), vxeVarO4.getLong(iE4), vxeVarO4.B0(iE5), ((int) vxeVarO4.getLong(iE6)) != 0, vxeVarO4.isNull(iE7) ? null : vxeVarO4.B0(iE7), nv8.g((int) vxeVarO4.getLong(iE8)), vxeVarO4.getLong(iE9)));
                        break;
                    }
                    return arrayList3;
                } finally {
                    vxeVarO4.close();
                }
            default:
                e1i e1iVar = (e1i) this.c;
                long j8 = this.b;
                sgg sggVar2 = (sgg) this.d;
                ((n0i) e1iVar.h.getValue()).b.remove(Long.valueOf(j8));
                e1iVar.j.remove(Long.valueOf(j8), sggVar2);
                return sbi.a;
        }
    }

    public /* synthetic */ t14(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }

    public /* synthetic */ t14(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }
}

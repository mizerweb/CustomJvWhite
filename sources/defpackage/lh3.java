package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.cookie.ClientCookie;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lh3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lh3(xkh xkhVar, rkh rkhVar, long j) {
        this.a = 4;
        this.c = rkhVar;
        this.b = j;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        c01 c01Var;
        int i;
        int i2;
        bji bjiVar;
        int iC;
        int i3 = this.a;
        long j = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                jy2 jy2Var = null;
                ph3 ph3Var = (ph3) obj2;
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM chats WHERE server_id = ?");
                try {
                    vxeVarO0.c(1, j);
                    int iE = qyj.E(vxeVarO0, "id");
                    int iE2 = qyj.E(vxeVarO0, "server_id");
                    int iE3 = qyj.E(vxeVarO0, "data");
                    int iE4 = qyj.E(vxeVarO0, "favourite_index");
                    int iE5 = qyj.E(vxeVarO0, "sort_time");
                    int iE6 = qyj.E(vxeVarO0, "cid");
                    if (vxeVarO0.M0()) {
                        jy2Var = new jy2(vxeVarO0.getLong(iE), vxeVarO0.getLong(iE2), ph3Var.c().c(vxeVarO0.getBlob(iE3)), vxeVarO0.getLong(iE4), vxeVarO0.getLong(iE5), vxeVarO0.getLong(iE6));
                    }
                    return jy2Var;
                } finally {
                    vxeVarO0.close();
                }
            case 1:
                pq3 pq3Var = (pq3) obj2;
                ConcurrentHashMap concurrentHashMap = pq3Var.h().i;
                long j2 = this.b;
                mjg mjgVarA = p90.a((rt2) concurrentHashMap.get(Long.valueOf(j2)));
                rt2 rt2Var = (rt2) mjgVarA.getValue();
                if (rt2Var == null) {
                    yab.i0((gu4) ((ifh) pq3Var.d).getValue(), null, 0, new gn3(mjgVarA, null, pq3Var, j2, 0), 3);
                } else {
                    long jA = rt2Var.A();
                    if (jA != 0) {
                        ((f9b) ((ConcurrentHashMap) pq3Var.f).computeIfAbsent(Long.valueOf(jA), new hn3(new kl3(1, rt2Var)))).setValue(rt2Var);
                    }
                }
                return mjgVarA;
            case 2:
                return p90.a(((no4) obj2).a.e(j));
            case 3:
                Long l = (Long) obj;
                return Boolean.valueOf(l.longValue() <= 0 || l.longValue() == j || !((yfd) obj2).E(l.longValue()));
            case 4:
                rkh rkhVar = (rkh) obj2;
                vxe vxeVarO1 = ((qxe) obj).O0("UPDATE tasks SET status = ? WHERE id = ?");
                try {
                    vxeVarO1.c(1, rkhVar.a);
                    vxeVarO1.c(2, j);
                    vxeVarO1.M0();
                    return sbi.a;
                } finally {
                    vxeVarO1.close();
                }
            default:
                nki nkiVar = (nki) obj2;
                vxe vxeVarO2 = ((qxe) obj).O0("SELECT * FROM uploads WHERE upload_status <> 1 AND created_time < ?");
                try {
                    vxeVarO2.c(1, j);
                    int iE7 = qyj.E(vxeVarO2, "attach_local_id");
                    int iE8 = qyj.E(vxeVarO2, "prepared_path");
                    int iE9 = qyj.E(vxeVarO2, "file_name");
                    int iE10 = qyj.E(vxeVarO2, ApiProtocol.KEY_UPLOAD_URL);
                    int iE11 = qyj.E(vxeVarO2, "upload_progress");
                    int iE12 = qyj.E(vxeVarO2, "total_bytes");
                    int iE13 = qyj.E(vxeVarO2, "upload_status");
                    int iE14 = qyj.E(vxeVarO2, "created_time");
                    int iE15 = qyj.E(vxeVarO2, "is_transload");
                    int iE16 = qyj.E(vxeVarO2, ClientCookie.PATH_ATTR);
                    int iE17 = qyj.E(vxeVarO2, "last_modified");
                    int iE18 = qyj.E(vxeVarO2, "upload_type");
                    int iE19 = qyj.E(vxeVarO2, "photo_token");
                    int iE20 = qyj.E(vxeVarO2, "attach_id");
                    int iE21 = qyj.E(vxeVarO2, "thumbhash_base64");
                    int i4 = iE15;
                    int iE22 = qyj.E(vxeVarO2, "desired_uploader");
                    int i5 = iE14;
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO2.M0()) {
                        ArrayList arrayList2 = arrayList;
                        bhi bhiVar = new bhi();
                        int i6 = iE13;
                        bhiVar.a = vxeVarO2.B0(iE16);
                        int i7 = iE12;
                        bhiVar.b = vxeVarO2.getLong(iE17);
                        bhiVar.c = k1m.d(vxeVarO2.isNull(iE18) ? null : Integer.valueOf((int) vxeVarO2.getLong(iE18)));
                        if (vxeVarO2.isNull(iE19) && vxeVarO2.isNull(iE20) && vxeVarO2.isNull(iE21)) {
                            i = iE18;
                            i2 = iE19;
                            c01Var = null;
                        } else {
                            c01Var = new c01();
                            if (vxeVarO2.isNull(iE19)) {
                                c01Var.a = null;
                            } else {
                                c01Var.a = vxeVarO2.B0(iE19);
                            }
                            i = iE18;
                            i2 = iE19;
                            c01Var.c = vxeVarO2.getLong(iE20);
                            if (vxeVarO2.isNull(iE21)) {
                                c01Var.b = null;
                            } else {
                                c01Var.b = vxeVarO2.B0(iE21);
                            }
                        }
                        if (vxeVarO2.isNull(iE22)) {
                            bjiVar = null;
                        } else {
                            if (vxeVarO2.isNull(iE22)) {
                                iC = 0;
                            } else {
                                String strB0 = vxeVarO2.B0(iE22);
                                nkiVar.getClass();
                                iC = nki.c(strB0);
                            }
                            bjiVar = new bji(iC);
                        }
                        chi chiVar = new chi();
                        if (vxeVarO2.isNull(iE7)) {
                            chiVar.b = null;
                        } else {
                            chiVar.b = vxeVarO2.B0(iE7);
                        }
                        if (vxeVarO2.isNull(iE8)) {
                            chiVar.c = null;
                        } else {
                            chiVar.c = vxeVarO2.B0(iE8);
                        }
                        if (vxeVarO2.isNull(iE9)) {
                            chiVar.d = null;
                        } else {
                            chiVar.d = vxeVarO2.B0(iE9);
                        }
                        if (vxeVarO2.isNull(iE10)) {
                            chiVar.e = null;
                        } else {
                            chiVar.e = vxeVarO2.B0(iE10);
                        }
                        int i8 = iE8;
                        int i9 = iE9;
                        chiVar.f = (float) vxeVarO2.getDouble(iE11);
                        chiVar.g = vxeVarO2.getLong(i7);
                        chiVar.h = k1m.c(vxeVarO2.isNull(i6) ? null : Integer.valueOf((int) vxeVarO2.getLong(i6)));
                        int i10 = i5;
                        chiVar.k = vxeVarO2.getLong(i10);
                        int i11 = i4;
                        int i12 = iE10;
                        chiVar.l = ((int) vxeVarO2.getLong(i11)) != 0;
                        chiVar.a = bhiVar;
                        chiVar.i = c01Var;
                        chiVar.j = bjiVar;
                        arrayList2.add(chiVar);
                        arrayList = arrayList2;
                        iE12 = i7;
                        iE18 = i;
                        iE13 = i6;
                        iE11 = iE11;
                        iE19 = i2;
                        iE20 = iE20;
                        iE9 = i9;
                        i5 = i10;
                        iE10 = i12;
                        i4 = i11;
                        iE8 = i8;
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO2.close();
                }
        }
    }

    public /* synthetic */ lh3(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    public /* synthetic */ lh3(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}

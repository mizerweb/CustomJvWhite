package defpackage;

import org.apache.http.cookie.ClientCookie;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lki implements cf7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ oji c;
    public final /* synthetic */ long d;

    public /* synthetic */ lki(String str, oji ojiVar, long j) {
        this.b = str;
        this.c = ojiVar;
        this.d = j;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        chi chiVar;
        c01 c01Var;
        bji bjiVar;
        Integer num;
        int i = this.a;
        long j = this.d;
        oji ojiVar = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO0 = qxeVar.O0("DELETE FROM uploads WHERE path=? AND upload_type=? AND last_modified=?");
                try {
                    vxeVarO0.B(1, str);
                    vxeVarO0.c(2, ojiVar.a);
                    vxeVarO0.c(3, j);
                    vxeVarO0.M0();
                    return Integer.valueOf(e9i.e0(qxeVar));
                } finally {
                    vxeVarO0.close();
                }
            default:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM uploads WHERE path=? AND upload_type=? AND last_modified=? LIMIT 1");
                try {
                    vxeVarO1.B(1, str);
                    vxeVarO1.c(2, ojiVar.a);
                    vxeVarO1.c(3, j);
                    int iE = qyj.E(vxeVarO1, "attach_local_id");
                    int iE2 = qyj.E(vxeVarO1, "prepared_path");
                    int iE3 = qyj.E(vxeVarO1, "file_name");
                    int iE4 = qyj.E(vxeVarO1, ApiProtocol.KEY_UPLOAD_URL);
                    int iE5 = qyj.E(vxeVarO1, "upload_progress");
                    int iE6 = qyj.E(vxeVarO1, "total_bytes");
                    int iE7 = qyj.E(vxeVarO1, "upload_status");
                    int iE8 = qyj.E(vxeVarO1, "created_time");
                    int iE9 = qyj.E(vxeVarO1, "is_transload");
                    int iE10 = qyj.E(vxeVarO1, ClientCookie.PATH_ATTR);
                    int iE11 = qyj.E(vxeVarO1, "last_modified");
                    int iE12 = qyj.E(vxeVarO1, "upload_type");
                    int iE13 = qyj.E(vxeVarO1, "photo_token");
                    int iE14 = qyj.E(vxeVarO1, "attach_id");
                    int iE15 = qyj.E(vxeVarO1, "thumbhash_base64");
                    int iE16 = qyj.E(vxeVarO1, "desired_uploader");
                    if (vxeVarO1.M0()) {
                        bhi bhiVar = new bhi();
                        bhiVar.a = vxeVarO1.B0(iE10);
                        bhiVar.b = vxeVarO1.getLong(iE11);
                        bhiVar.c = k1m.d(vxeVarO1.isNull(iE12) ? null : Integer.valueOf((int) vxeVarO1.getLong(iE12)));
                        if (vxeVarO1.isNull(iE13) && vxeVarO1.isNull(iE14) && vxeVarO1.isNull(iE15)) {
                            c01Var = null;
                        } else {
                            c01Var = new c01();
                            if (vxeVarO1.isNull(iE13)) {
                                c01Var.a = null;
                            } else {
                                c01Var.a = vxeVarO1.B0(iE13);
                            }
                            c01Var.c = vxeVarO1.getLong(iE14);
                            if (vxeVarO1.isNull(iE15)) {
                                c01Var.b = null;
                            } else {
                                c01Var.b = vxeVarO1.B0(iE15);
                            }
                        }
                        if (vxeVarO1.isNull(iE16)) {
                            bjiVar = null;
                        } else {
                            bjiVar = new bji(vxeVarO1.isNull(iE16) ? 0 : nki.c(vxeVarO1.B0(iE16)));
                        }
                        chi chiVar2 = new chi();
                        if (vxeVarO1.isNull(iE)) {
                            chiVar2.b = null;
                        } else {
                            chiVar2.b = vxeVarO1.B0(iE);
                        }
                        if (vxeVarO1.isNull(iE2)) {
                            chiVar2.c = null;
                        } else {
                            chiVar2.c = vxeVarO1.B0(iE2);
                        }
                        if (vxeVarO1.isNull(iE3)) {
                            chiVar2.d = null;
                        } else {
                            chiVar2.d = vxeVarO1.B0(iE3);
                        }
                        if (vxeVarO1.isNull(iE4)) {
                            num = null;
                            chiVar2.e = null;
                        } else {
                            num = null;
                            chiVar2.e = vxeVarO1.B0(iE4);
                        }
                        chiVar2.f = (float) vxeVarO1.getDouble(iE5);
                        chiVar2.g = vxeVarO1.getLong(iE6);
                        chiVar2.h = k1m.c(vxeVarO1.isNull(iE7) ? num : Integer.valueOf((int) vxeVarO1.getLong(iE7)));
                        chiVar2.k = vxeVarO1.getLong(iE8);
                        chiVar2.l = ((int) vxeVarO1.getLong(iE9)) != 0;
                        chiVar2.a = bhiVar;
                        chiVar2.i = c01Var;
                        chiVar2.j = bjiVar;
                        chiVar = chiVar2;
                    } else {
                        chiVar = null;
                    }
                    return chiVar;
                } finally {
                    vxeVarO1.close();
                }
        }
    }

    public /* synthetic */ lki(String str, oji ojiVar, long j, nki nkiVar) {
        this.b = str;
        this.c = ojiVar;
        this.d = j;
    }
}

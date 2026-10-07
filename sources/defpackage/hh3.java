package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hh3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ph3 c;

    public /* synthetic */ hh3(long j, ph3 ph3Var, int i) {
        this.a = i;
        this.b = j;
        this.c = ph3Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        jy2 jy2Var = null;
        ph3 ph3Var = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM chats WHERE id = ?");
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
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM chats WHERE id = ?");
                try {
                    vxeVarO1.c(1, j);
                    int iE7 = qyj.E(vxeVarO1, "id");
                    int iE8 = qyj.E(vxeVarO1, "server_id");
                    int iE9 = qyj.E(vxeVarO1, "data");
                    int iE10 = qyj.E(vxeVarO1, "favourite_index");
                    int iE11 = qyj.E(vxeVarO1, "sort_time");
                    int iE12 = qyj.E(vxeVarO1, "cid");
                    if (vxeVarO1.M0()) {
                        jy2Var = new jy2(vxeVarO1.getLong(iE7), vxeVarO1.getLong(iE8), ph3Var.c().c(vxeVarO1.getBlob(iE9)), vxeVarO1.getLong(iE10), vxeVarO1.getLong(iE11), vxeVarO1.getLong(iE12));
                    }
                    return jy2Var;
                } finally {
                    vxeVarO1.close();
                }
            case 2:
                vxe vxeVarO2 = ((qxe) obj).O0("SELECT * FROM chats WHERE cid = ?");
                try {
                    vxeVarO2.c(1, j);
                    int iE13 = qyj.E(vxeVarO2, "id");
                    int iE14 = qyj.E(vxeVarO2, "server_id");
                    int iE15 = qyj.E(vxeVarO2, "data");
                    int iE16 = qyj.E(vxeVarO2, "favourite_index");
                    int iE17 = qyj.E(vxeVarO2, "sort_time");
                    int iE18 = qyj.E(vxeVarO2, "cid");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO2.M0()) {
                        arrayList.add(new jy2(vxeVarO2.getLong(iE13), vxeVarO2.getLong(iE14), ph3Var.c().c(vxeVarO2.getBlob(iE15)), vxeVarO2.getLong(iE16), vxeVarO2.getLong(iE17), vxeVarO2.getLong(iE18)));
                    }
                    vxeVarO2.close();
                    return arrayList;
                } catch (Throwable th) {
                    vxeVarO2.close();
                    throw th;
                }
            default:
                vxe vxeVarO3 = ((qxe) obj).O0("SELECT * FROM chats WHERE id = ?");
                try {
                    vxeVarO3.c(1, j);
                    int iE19 = qyj.E(vxeVarO3, "id");
                    int iE20 = qyj.E(vxeVarO3, "server_id");
                    int iE21 = qyj.E(vxeVarO3, "data");
                    int iE22 = qyj.E(vxeVarO3, "favourite_index");
                    int iE23 = qyj.E(vxeVarO3, "sort_time");
                    int iE24 = qyj.E(vxeVarO3, "cid");
                    if (vxeVarO3.M0()) {
                        jy2Var = new jy2(vxeVarO3.getLong(iE19), vxeVarO3.getLong(iE20), ph3Var.c().c(vxeVarO3.getBlob(iE21)), vxeVarO3.getLong(iE22), vxeVarO3.getLong(iE23), vxeVarO3.getLong(iE24));
                    }
                    return jy2Var;
                } finally {
                    vxeVarO3.close();
                }
        }
    }
}

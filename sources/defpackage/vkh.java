package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vkh implements cf7 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ ctc c;

    public /* synthetic */ vkh(long j, xkh xkhVar, ctc ctcVar) {
        this.b = j;
        this.c = ctcVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        ctc ctcVar = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO0 = qxeVar.O0("DELETE FROM tasks WHERE type = ? AND created_time < ?");
                try {
                    vxeVarO0.c(1, ctcVar.a);
                    vxeVarO0.c(2, j);
                    vxeVarO0.M0();
                    return Integer.valueOf(e9i.e0(qxeVar));
                } finally {
                    vxeVarO0.close();
                }
            default:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM tasks WHERE id > ? AND type = ?");
                try {
                    vxeVarO1.c(1, j);
                    vxeVarO1.c(2, ctcVar.a);
                    int iE = qyj.E(vxeVarO1, "id");
                    int iE2 = qyj.E(vxeVarO1, "type");
                    int iE3 = qyj.E(vxeVarO1, "status");
                    int iE4 = qyj.E(vxeVarO1, "fails_count");
                    int iE5 = qyj.E(vxeVarO1, "depends_request_id");
                    int iE6 = qyj.E(vxeVarO1, "dependency_type");
                    int iE7 = qyj.E(vxeVarO1, "data");
                    int iE8 = qyj.E(vxeVarO1, "created_time");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO1.M0()) {
                        int i2 = iE2;
                        int i3 = iE3;
                        arrayList.add(new ujh(vxeVarO1.getLong(iE), xvc.x((int) vxeVarO1.getLong(iE2)), xvc.w((int) vxeVarO1.getLong(iE3)), (int) vxeVarO1.getLong(iE4), vxeVarO1.getLong(iE5), (int) vxeVarO1.getLong(iE6), vxeVarO1.getBlob(iE7), vxeVarO1.getLong(iE8)));
                        iE2 = i2;
                        iE3 = i3;
                    }
                    vxeVarO1.close();
                    return arrayList;
                } catch (Throwable th) {
                    vxeVarO1.close();
                    throw th;
                }
        }
    }

    public /* synthetic */ vkh(xkh xkhVar, ctc ctcVar, long j) {
        this.c = ctcVar;
        this.b = j;
    }
}

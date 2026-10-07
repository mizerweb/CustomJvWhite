package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uy6 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ uy6(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        long j = this.b;
        switch (i) {
            case 0:
                return Long.valueOf(j);
            case 1:
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO0 = qxeVar.O0("\n            DELETE FROM stat_events\n            WHERE timestamp < ?\n        ");
                try {
                    vxeVarO0.c(1, j);
                    vxeVarO0.M0();
                    return Integer.valueOf(e9i.e0(qxeVar));
                } finally {
                    vxeVarO0.close();
                }
            case 2:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM story_drafts WHERE created_at < ?");
                try {
                    vxeVarO1.c(1, j);
                    int iE = qyj.E(vxeVarO1, "draft_id");
                    int iE2 = qyj.E(vxeVarO1, "media_path");
                    int iE3 = qyj.E(vxeVarO1, "preview_path");
                    int iE4 = qyj.E(vxeVarO1, "type");
                    int iE5 = qyj.E(vxeVarO1, "expiration_ms");
                    int iE6 = qyj.E(vxeVarO1, "settings");
                    int iE7 = qyj.E(vxeVarO1, "canvas_width");
                    int iE8 = qyj.E(vxeVarO1, "canvas_height");
                    int iE9 = qyj.E(vxeVarO1, "created_at");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO1.M0()) {
                        int i2 = iE2;
                        int i3 = iE3;
                        arrayList.add(new swg(vxeVarO1.getLong(iE), vxeVarO1.B0(iE2), vxeVarO1.isNull(iE3) ? null : vxeVarO1.B0(iE3), ghb.t((int) vxeVarO1.getLong(iE4)), vxeVarO1.getLong(iE5), (int) vxeVarO1.getLong(iE6), (int) vxeVarO1.getLong(iE7), (int) vxeVarO1.getLong(iE8), vxeVarO1.getLong(iE9)));
                        iE2 = i2;
                        iE3 = i3;
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO1.close();
                }
            case 3:
                qxe qxeVar2 = (qxe) obj;
                vxe vxeVarO2 = qxeVar2.O0("DELETE FROM story_drafts WHERE created_at < ?");
                try {
                    vxeVarO2.c(1, j);
                    vxeVarO2.M0();
                    return Integer.valueOf(e9i.e0(qxeVar2));
                } finally {
                    vxeVarO2.close();
                }
            case 4:
                vxe vxeVarO3 = ((qxe) obj).O0("SELECT * FROM story_publish WHERE created_at < ?");
                try {
                    vxeVarO3.c(1, j);
                    int iE10 = qyj.E(vxeVarO3, "publish_id");
                    int iE11 = qyj.E(vxeVarO3, "draft_id");
                    int iE12 = qyj.E(vxeVarO3, "segment_index");
                    int iE13 = qyj.E(vxeVarO3, "story_id");
                    int iE14 = qyj.E(vxeVarO3, "segment_path");
                    int iE15 = qyj.E(vxeVarO3, "is_video");
                    int iE16 = qyj.E(vxeVarO3, "upload_token");
                    int iE17 = qyj.E(vxeVarO3, "status");
                    int iE18 = qyj.E(vxeVarO3, "created_at");
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO3.M0()) {
                        arrayList2.add(new zzg(vxeVarO3.getLong(iE10), vxeVarO3.getLong(iE11), (int) vxeVarO3.getLong(iE12), vxeVarO3.getLong(iE13), vxeVarO3.B0(iE14), ((int) vxeVarO3.getLong(iE15)) != 0, vxeVarO3.isNull(iE16) ? null : vxeVarO3.B0(iE16), nv8.g((int) vxeVarO3.getLong(iE17)), vxeVarO3.getLong(iE18)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    vxeVarO3.close();
                }
            case 5:
                vxe vxeVarO4 = ((qxe) obj).O0("UPDATE tasks SET status = ?, fails_count = fails_count + 1 WHERE id = ?");
                try {
                    vxeVarO4.c(1, 20L);
                    vxeVarO4.c(2, j);
                    vxeVarO4.M0();
                    return sbi.a;
                } finally {
                    vxeVarO4.close();
                }
            case 6:
                qxe qxeVar3 = (qxe) obj;
                vxe vxeVarO5 = qxeVar3.O0("DELETE FROM tasks WHERE id = ?");
                try {
                    vxeVarO5.c(1, j);
                    vxeVarO5.M0();
                    return Integer.valueOf(e9i.e0(qxeVar3));
                } finally {
                    vxeVarO5.close();
                }
            case 7:
                qxe qxeVar4 = (qxe) obj;
                vxe vxeVarO6 = qxeVar4.O0("DELETE FROM tasks WHERE id = ?");
                try {
                    vxeVarO6.c(1, j);
                    vxeVarO6.M0();
                    return Integer.valueOf(e9i.e0(qxeVar4));
                } finally {
                    vxeVarO6.close();
                }
            default:
                vxe vxeVarO7 = ((qxe) obj).O0("SELECT * FROM tasks WHERE id = ?");
                try {
                    vxeVarO7.c(1, j);
                    return vxeVarO7.M0() ? new ujh(vxeVarO7.getLong(qyj.E(vxeVarO7, "id")), xvc.x((int) vxeVarO7.getLong(qyj.E(vxeVarO7, "type"))), xvc.w((int) vxeVarO7.getLong(qyj.E(vxeVarO7, "status"))), (int) vxeVarO7.getLong(qyj.E(vxeVarO7, "fails_count")), vxeVarO7.getLong(qyj.E(vxeVarO7, "depends_request_id")), (int) vxeVarO7.getLong(qyj.E(vxeVarO7, "dependency_type")), vxeVarO7.getBlob(qyj.E(vxeVarO7, "data")), vxeVarO7.getLong(qyj.E(vxeVarO7, "created_time"))) : null;
                } finally {
                    vxeVarO7.close();
                }
        }
    }

    public /* synthetic */ uy6(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
    }
}

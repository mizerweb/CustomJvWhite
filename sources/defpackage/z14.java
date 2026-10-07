package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z14 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ z14(int i, long j, long j2, long j3) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int iE0;
        int i = this.a;
        sbi sbiVar = sbi.a;
        Object objValueOf = null;
        long j = this.d;
        long j2 = this.c;
        long j3 = this.b;
        switch (i) {
            case 0:
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT id FROM comments WHERE parent_chat_server_id = ? AND parent_message_server_id = ? AND server_id = ?");
                try {
                    vxeVarO0.c(1, j3);
                    vxeVarO0.c(2, j2);
                    vxeVarO0.c(3, j);
                    if (vxeVarO0.M0() && !vxeVarO0.isNull(0)) {
                        objValueOf = Long.valueOf(vxeVarO0.getLong(0));
                        break;
                    }
                    return objValueOf;
                } finally {
                    vxeVarO0.close();
                }
            case 1:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT server_id FROM comments WHERE parent_chat_server_id = ? AND parent_message_server_id = ? AND cid = ?");
                try {
                    vxeVarO1.c(1, j3);
                    vxeVarO1.c(2, j2);
                    vxeVarO1.c(3, j);
                    if (vxeVarO1.M0() && !vxeVarO1.isNull(0)) {
                        objValueOf = Long.valueOf(vxeVarO1.getLong(0));
                        break;
                    }
                    return objValueOf;
                } finally {
                    vxeVarO1.close();
                }
            case 2:
                vxe vxeVarO2 = ((qxe) obj).O0("DELETE FROM fcm_notifications_analytics WHERE analytics_status=? AND chat_id=? AND post_id=? AND time<=?");
                try {
                    vxeVarO2.c(1, qt4.D(3));
                    vxeVarO2.c(2, j3);
                    vxeVarO2.c(3, j2);
                    vxeVarO2.c(4, j);
                    vxeVarO2.M0();
                    return sbiVar;
                } finally {
                    vxeVarO2.close();
                }
            case 3:
                vxe vxeVarO3 = ((qxe) obj).O0("SELECT chat_id, msg_id, post_id FROM fcm_notifications_analytics WHERE analytics_status=? AND chat_id=? AND post_id=? AND time<=?");
                try {
                    vxeVarO3.c(1, qt4.D(3));
                    vxeVarO3.c(2, j3);
                    vxeVarO3.c(3, j2);
                    vxeVarO3.c(4, j);
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO3.M0()) {
                        arrayList.add(new in6(vxeVarO3.getLong(0), vxeVarO3.getLong(1), vxeVarO3.getLong(2)));
                    }
                    vxeVarO3.close();
                    return arrayList;
                } catch (Throwable th) {
                    vxeVarO3.close();
                    throw th;
                }
            case 4:
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO4 = qxeVar.O0("UPDATE messages SET update_time = ?, reactions_update_time=? WHERE id = ?");
                try {
                    vxeVarO4.c(1, j3);
                    vxeVarO4.c(2, j2);
                    vxeVarO4.c(3, j);
                    vxeVarO4.M0();
                    iE0 = e9i.e0(qxeVar);
                } finally {
                    vxeVarO4.close();
                }
                break;
            case 5:
                qxe qxeVar2 = (qxe) obj;
                vxe vxeVarO5 = qxeVar2.O0("DELETE FROM fcm_notifications WHERE chat_id = ? AND message_id = ? AND post_id = ?");
                try {
                    vxeVarO5.c(1, j3);
                    vxeVarO5.c(2, j2);
                    vxeVarO5.c(3, j);
                    vxeVarO5.M0();
                    iE0 = e9i.e0(qxeVar2);
                } finally {
                    vxeVarO5.close();
                }
                break;
            case 6:
                vxe vxeVarO6 = ((qxe) obj).O0("UPDATE notifications_tracker_messages SET show_analytics_sent=1 WHERE chat_id=? AND message_id=? AND post_id=?");
                try {
                    vxeVarO6.c(1, j3);
                    vxeVarO6.c(2, j2);
                    vxeVarO6.c(3, j);
                    vxeVarO6.M0();
                    return sbiVar;
                } finally {
                    vxeVarO6.close();
                }
            default:
                vxe vxeVarO7 = ((qxe) obj).O0("SELECT * FROM notifications_tracker_messages WHERE chat_id=? AND message_id=? AND post_id=?");
                try {
                    vxeVarO7.c(1, j3);
                    vxeVarO7.c(2, j2);
                    vxeVarO7.c(3, j);
                    int iE = qyj.E(vxeVarO7, "message_id");
                    int iE2 = qyj.E(vxeVarO7, "time");
                    int iE3 = qyj.E(vxeVarO7, "push_source");
                    int iE4 = qyj.E(vxeVarO7, "drop_reason");
                    int iE5 = qyj.E(vxeVarO7, "push_type");
                    int iE6 = qyj.E(vxeVarO7, "show_analytics_sent");
                    int iE7 = qyj.E(vxeVarO7, "chat_id");
                    int iE8 = qyj.E(vxeVarO7, "post_id");
                    if (vxeVarO7.M0()) {
                        long j4 = vxeVarO7.getLong(iE);
                        long j5 = vxeVarO7.getLong(iE2);
                        Integer numValueOf = vxeVarO7.isNull(iE3) ? null : Integer.valueOf((int) vxeVarO7.getLong(iE3));
                        String strB0 = vxeVarO7.isNull(iE4) ? null : vxeVarO7.B0(iE4);
                        qv5[] qv5VarArr = qv5.b;
                        objValueOf = new dpb(new ilb(vxeVarO7.getLong(iE7), vxeVarO7.getLong(iE8)), j4, j5, numValueOf, vd7.y(strB0), vxeVarO7.isNull(iE5) ? null : vxeVarO7.B0(iE5), ((int) vxeVarO7.getLong(iE6)) != 0);
                    }
                    return objValueOf;
                } finally {
                    vxeVarO7.close();
                }
        }
        return Integer.valueOf(iE0);
    }
}

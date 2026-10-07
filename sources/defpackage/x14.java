package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x14 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ x14(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int iE0;
        int i = this.a;
        sbi sbiVar = sbi.a;
        Object objValueOf = null;
        long j = this.c;
        long j2 = this.b;
        switch (i) {
            case 0:
                vxe vxeVarO0 = ((qxe) obj).O0("UPDATE comments SET reactions_update_time = ? WHERE id = ?");
                try {
                    vxeVarO0.c(1, j2);
                    vxeVarO0.c(2, j);
                    vxeVarO0.M0();
                    return sbiVar;
                } finally {
                    vxeVarO0.close();
                }
            case 1:
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO1 = qxeVar.O0("DELETE FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL");
                try {
                    vxeVarO1.c(1, j2);
                    vxeVarO1.c(2, j);
                    vxeVarO1.M0();
                    iE0 = e9i.e0(qxeVar);
                } finally {
                    vxeVarO1.close();
                }
                break;
            case 2:
                qxe qxeVar2 = (qxe) obj;
                vxe vxeVarO2 = qxeVar2.O0("DELETE FROM messages WHERE chat_id = ? AND time <= ? AND inserted_from_msg_link = 0 AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL");
                try {
                    vxeVarO2.c(1, j2);
                    vxeVarO2.c(2, j);
                    vxeVarO2.M0();
                    iE0 = e9i.e0(qxeVar2);
                } finally {
                    vxeVarO2.close();
                }
                break;
            case 3:
                qxe qxeVar3 = (qxe) obj;
                vxe vxeVarO3 = qxeVar3.O0("DELETE FROM messages WHERE chat_id = ? AND time <= ? AND inserted_from_msg_link = 0 AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL AND id NOT IN (SELECT DISTINCT msg_link_id FROM messages WHERE msg_link_id > 0 AND status != 10)");
                try {
                    vxeVarO3.c(1, j2);
                    vxeVarO3.c(2, j);
                    vxeVarO3.M0();
                    iE0 = e9i.e0(qxeVar3);
                } finally {
                    vxeVarO3.close();
                }
                break;
            case 4:
                vxe vxeVarO4 = ((qxe) obj).O0("UPDATE messages SET chat_id = ? WHERE id = ?");
                try {
                    vxeVarO4.c(1, j2);
                    vxeVarO4.c(2, j);
                    vxeVarO4.M0();
                    return sbiVar;
                } finally {
                    vxeVarO4.close();
                }
            case 5:
                vxe vxeVarO5 = ((qxe) obj).O0("SELECT server_id FROM messages WHERE chat_id = ? AND id = ?");
                try {
                    vxeVarO5.c(1, j2);
                    vxeVarO5.c(2, j);
                    if (vxeVarO5.M0() && !vxeVarO5.isNull(0)) {
                        objValueOf = Long.valueOf(vxeVarO5.getLong(0));
                        break;
                    }
                    return objValueOf;
                } finally {
                    vxeVarO5.close();
                }
            case 6:
                vxe vxeVarO6 = ((qxe) obj).O0("UPDATE messages SET reactions_update_time = ? WHERE id = ?");
                try {
                    vxeVarO6.c(1, j2);
                    vxeVarO6.c(2, j);
                    vxeVarO6.M0();
                    return sbiVar;
                } finally {
                    vxeVarO6.close();
                }
            case 7:
                vxe vxeVarO7 = ((qxe) obj).O0("SELECT id FROM messages WHERE chat_id = ? AND server_id = ?");
                try {
                    vxeVarO7.c(1, j2);
                    vxeVarO7.c(2, j);
                    if (vxeVarO7.M0() && !vxeVarO7.isNull(0)) {
                        objValueOf = Long.valueOf(vxeVarO7.getLong(0));
                        break;
                    }
                    return objValueOf;
                } finally {
                    vxeVarO7.close();
                }
            case 8:
                vxe vxeVarO8 = ((qxe) obj).O0("SELECT server_id FROM messages WHERE chat_id = ? AND cid = ?");
                try {
                    vxeVarO8.c(1, j2);
                    vxeVarO8.c(2, j);
                    if (vxeVarO8.M0() && !vxeVarO8.isNull(0)) {
                        objValueOf = Long.valueOf(vxeVarO8.getLong(0));
                        break;
                    }
                    return objValueOf;
                } finally {
                    vxeVarO8.close();
                }
            case 9:
                qxe qxeVar4 = (qxe) obj;
                vxe vxeVarO9 = qxeVar4.O0("UPDATE messages SET update_time = ? WHERE id = ?");
                try {
                    vxeVarO9.c(1, j2);
                    vxeVarO9.c(2, j);
                    vxeVarO9.M0();
                    iE0 = e9i.e0(qxeVar4);
                } finally {
                    vxeVarO9.close();
                }
                break;
            case 10:
                vxe vxeVarO10 = ((qxe) obj).O0("DELETE FROM fcm_notifications WHERE chat_id = ? AND post_id = ?");
                try {
                    vxeVarO10.c(1, j2);
                    vxeVarO10.c(2, j);
                    vxeVarO10.M0();
                    return sbiVar;
                } finally {
                    vxeVarO10.close();
                }
            case 11:
                vxe vxeVarO11 = ((qxe) obj).O0("SELECT * FROM notifications_read_marks WHERE chat_id = ? AND post_id = ?");
                try {
                    vxeVarO11.c(1, j2);
                    vxeVarO11.c(2, j);
                    return vxeVarO11.M0() ? new xmb(new ilb(vxeVarO11.getLong(qyj.E(vxeVarO11, "chat_id")), vxeVarO11.getLong(qyj.E(vxeVarO11, "post_id"))), vxeVarO11.getLong(qyj.E(vxeVarO11, "mark"))) : null;
                } finally {
                    vxeVarO11.close();
                }
            case 12:
                vxe vxeVarO12 = ((qxe) obj).O0("INSERT OR REPLACE INTO saved_msg_chat(user_id, chat_id) VALUES(?, ?)");
                try {
                    vxeVarO12.c(1, j2);
                    vxeVarO12.c(2, j);
                    vxeVarO12.M0();
                    return sbiVar;
                } finally {
                    vxeVarO12.close();
                }
            case 13:
                qxe qxeVar5 = (qxe) obj;
                vxe vxeVarO13 = qxeVar5.O0("UPDATE webapp_biometry SET access_requested = ?, access_granted = ? WHERE user_id = ? AND bot_id = ?");
                try {
                    vxeVarO13.c(1, 1L);
                    vxeVarO13.c(2, 1L);
                    vxeVarO13.c(3, j2);
                    vxeVarO13.c(4, j);
                    vxeVarO13.M0();
                    iE0 = e9i.e0(qxeVar5);
                } finally {
                    vxeVarO13.close();
                }
                break;
            default:
                vxe vxeVarO14 = ((qxe) obj).O0("SELECT * FROM webapp_biometry WHERE user_id = ? AND bot_id = ?");
                try {
                    vxeVarO14.c(1, j2);
                    vxeVarO14.c(2, j);
                    int iE = qyj.E(vxeVarO14, "id");
                    int iE2 = qyj.E(vxeVarO14, "user_id");
                    int iE3 = qyj.E(vxeVarO14, "bot_id");
                    int iE4 = qyj.E(vxeVarO14, ApiProtocol.KEY_TOKEN);
                    return vxeVarO14.M0() ? new sej(vxeVarO14.getLong(iE), vxeVarO14.getLong(iE2), vxeVarO14.getLong(iE3), vxeVarO14.isNull(iE4) ? null : vxeVarO14.B0(iE4), ((int) vxeVarO14.getLong(qyj.E(vxeVarO14, "access_requested"))) != 0, ((int) vxeVarO14.getLong(qyj.E(vxeVarO14, "access_granted"))) != 0) : null;
                } finally {
                    vxeVarO14.close();
                }
        }
        return Integer.valueOf(iE0);
    }
}

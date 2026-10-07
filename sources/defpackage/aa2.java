package defpackage;

import java.util.ArrayList;
import one.me.rlottie.RLottieImageView;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aa2 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ aa2(yzg yzgVar, long j) {
        this.a = 23;
        this.b = j;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        long j;
        long j2;
        long j3;
        Long lValueOf;
        long j4;
        q0f q0fVar;
        zzg zzgVar;
        int i = this.a;
        sbi sbiVar = sbi.a;
        long j5 = this.b;
        switch (i) {
            case 0:
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO0 = qxeVar.O0("DELETE FROM call_notifications_analytics WHERE received_time<=?");
                try {
                    vxeVarO0.c(1, j5);
                    vxeVarO0.M0();
                    return Integer.valueOf(e9i.e0(qxeVar));
                } finally {
                    vxeVarO0.close();
                }
            case 1:
                vxe vxeVarO1 = ((qxe) obj).O0("DELETE FROM chats WHERE id = ?");
                try {
                    vxeVarO1.c(1, j5);
                    vxeVarO1.M0();
                    return sbiVar;
                } finally {
                    vxeVarO1.close();
                }
            case 2:
                vxe vxeVarO2 = ((qxe) obj).O0("DELETE FROM chat_title WHERE docid=?");
                try {
                    vxeVarO2.c(1, j5);
                    vxeVarO2.M0();
                    return sbiVar;
                } finally {
                    vxeVarO2.close();
                }
            case 3:
                vxe vxeVarO3 = ((qxe) obj).O0("SELECT id FROM chats WHERE server_id = ?");
                try {
                    vxeVarO3.c(1, j5);
                    if (vxeVarO3.M0()) {
                        j = vxeVarO3.getLong(0);
                        break;
                    } else {
                        j = 0;
                    }
                    return Long.valueOf(j);
                } finally {
                    vxeVarO3.close();
                }
            case 4:
                vxe vxeVarO4 = ((qxe) obj).O0("SELECT id FROM chats WHERE server_id = ?");
                try {
                    vxeVarO4.c(1, j5);
                    if (vxeVarO4.M0()) {
                        j2 = vxeVarO4.getLong(0);
                        break;
                    } else {
                        j2 = 0;
                    }
                    return Long.valueOf(j2);
                } finally {
                    vxeVarO4.close();
                }
            case 5:
                vxe vxeVarO5 = ((qxe) obj).O0("SELECT id FROM chats WHERE cid = ?");
                try {
                    vxeVarO5.c(1, j5);
                    if (vxeVarO5.M0()) {
                        j3 = vxeVarO5.getLong(0);
                        break;
                    } else {
                        j3 = 0;
                    }
                    return Long.valueOf(j3);
                } finally {
                    vxeVarO5.close();
                }
            case 6:
                qxe qxeVar2 = (qxe) obj;
                vxe vxeVarO6 = qxeVar2.O0("DELETE FROM comments WHERE id = ?");
                try {
                    vxeVarO6.c(1, j5);
                    vxeVarO6.M0();
                    return Integer.valueOf(e9i.e0(qxeVar2));
                } finally {
                    vxeVarO6.close();
                }
            case 7:
                vxe vxeVarO7 = ((qxe) obj).O0("DELETE FROM contact_title WHERE docid=?");
                try {
                    vxeVarO7.c(1, j5);
                    vxeVarO7.M0();
                    return sbiVar;
                } finally {
                    vxeVarO7.close();
                }
            case 8:
                qxe qxeVar3 = (qxe) obj;
                vxe vxeVarO8 = qxeVar3.O0("DELETE FROM fcm_notifications_analytics WHERE received_time<=?");
                try {
                    vxeVarO8.c(1, j5);
                    vxeVarO8.M0();
                    return Integer.valueOf(e9i.e0(qxeVar3));
                } finally {
                    vxeVarO8.close();
                }
            case 9:
                return Boolean.valueOf(((rt2) obj).A() == j5);
            case 10:
                vxe vxeVarO9 = ((qxe) obj).O0("SELECT MAX(update_time,time) FROM messages where id = ?");
                try {
                    vxeVarO9.c(1, j5);
                    if (vxeVarO9.M0() && !vxeVarO9.isNull(0)) {
                        lValueOf = Long.valueOf(vxeVarO9.getLong(0));
                        break;
                    } else {
                        lValueOf = null;
                    }
                    return lValueOf;
                } finally {
                    vxeVarO9.close();
                }
            case 11:
                vxe vxeVarO10 = ((qxe) obj).O0("SELECT time FROM messages WHERE id = ?");
                try {
                    vxeVarO10.c(1, j5);
                    if (vxeVarO10.M0()) {
                        j4 = vxeVarO10.getLong(0);
                        break;
                    } else {
                        j4 = 0;
                    }
                    return Long.valueOf(j4);
                } finally {
                    vxeVarO10.close();
                }
            case 12:
                vxe vxeVarO11 = ((qxe) obj).O0("DELETE FROM messages WHERE chat_id = ?");
                try {
                    vxeVarO11.c(1, j5);
                    vxeVarO11.M0();
                    return sbiVar;
                } finally {
                    vxeVarO11.close();
                }
            case 13:
                vxe vxeVarO12 = ((qxe) obj).O0("DELETE FROM notifications_read_marks WHERE mark > ?");
                try {
                    vxeVarO12.c(1, j5);
                    vxeVarO12.M0();
                    return sbiVar;
                } finally {
                    vxeVarO12.close();
                }
            case 14:
                qxe qxeVar4 = (qxe) obj;
                vxe vxeVarO13 = qxeVar4.O0("DELETE FROM notifications_tracker_messages WHERE time<=?");
                try {
                    vxeVarO13.c(1, j5);
                    vxeVarO13.M0();
                    return Integer.valueOf(e9i.e0(qxeVar4));
                } finally {
                    vxeVarO13.close();
                }
            case 15:
                vxe vxeVarO14 = ((qxe) obj).O0("DELETE FROM phones WHERE id = ?");
                try {
                    vxeVarO14.c(1, j5);
                    vxeVarO14.M0();
                    return sbiVar;
                } finally {
                    vxeVarO14.close();
                }
            case 16:
                return Boolean.valueOf(cqk.d(tre.h0((RLottieImageView) obj, R.id.tag_reaction_effects_view), Long.valueOf(j5)));
            case 17:
                vxe vxeVarO15 = ((qxe) obj).O0("DELETE FROM saved_msg_chat WHERE chat_id = ?");
                try {
                    vxeVarO15.c(1, j5);
                    vxeVarO15.M0();
                    return sbiVar;
                } finally {
                    vxeVarO15.close();
                }
            case 18:
                vxe vxeVarO16 = ((qxe) obj).O0("SELECT * FROM saved_msg_chat WHERE user_id = ?");
                try {
                    vxeVarO16.c(1, j5);
                    int iE = qyj.E(vxeVarO16, "user_id");
                    int iE2 = qyj.E(vxeVarO16, "chat_id");
                    if (vxeVarO16.M0()) {
                        q0fVar = new q0f(vxeVarO16.getLong(iE), vxeVarO16.getLong(iE2));
                        break;
                    } else {
                        q0fVar = null;
                    }
                    return q0fVar;
                } finally {
                    vxeVarO16.close();
                }
            case 19:
                return Boolean.valueOf(((xyc) obj).a == j5);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                vxe vxeVarO17 = ((qxe) obj).O0("DELETE FROM story_draft_text_layers WHERE draft_id = ?");
                try {
                    vxeVarO17.c(1, j5);
                    vxeVarO17.M0();
                    return sbiVar;
                } finally {
                    vxeVarO17.close();
                }
            case 21:
                vxe vxeVarO18 = ((qxe) obj).O0("DELETE FROM story_drafts WHERE draft_id = ?");
                try {
                    vxeVarO18.c(1, j5);
                    vxeVarO18.M0();
                    return sbiVar;
                } finally {
                    vxeVarO18.close();
                }
            case 22:
                vxe vxeVarO19 = ((qxe) obj).O0("DELETE FROM story_draft_drawing_layers WHERE draft_id = ?");
                try {
                    vxeVarO19.c(1, j5);
                    vxeVarO19.M0();
                    return sbiVar;
                } finally {
                    vxeVarO19.close();
                }
            case 23:
                vxe vxeVarO20 = ((qxe) obj).O0("\n        UPDATE story_publish SET status = CASE status\n            WHEN ? THEN ?\n            WHEN ? THEN ?\n        END\n        WHERE draft_id = ? AND status IN (?, ?)\n    ");
                try {
                    vxeVarO20.c(1, 2L);
                    vxeVarO20.c(2, 6L);
                    vxeVarO20.c(3, 4L);
                    vxeVarO20.c(4, 7L);
                    vxeVarO20.c(5, j5);
                    vxeVarO20.c(6, 2L);
                    vxeVarO20.c(7, 4L);
                    vxeVarO20.M0();
                    return sbiVar;
                } finally {
                    vxeVarO20.close();
                }
            case 24:
                vxe vxeVarO21 = ((qxe) obj).O0("SELECT * FROM story_publish WHERE draft_id = ? ORDER BY segment_index ASC");
                try {
                    vxeVarO21.c(1, j5);
                    int iE3 = qyj.E(vxeVarO21, "publish_id");
                    int iE4 = qyj.E(vxeVarO21, "draft_id");
                    int iE5 = qyj.E(vxeVarO21, "segment_index");
                    int iE6 = qyj.E(vxeVarO21, "story_id");
                    int iE7 = qyj.E(vxeVarO21, "segment_path");
                    int iE8 = qyj.E(vxeVarO21, "is_video");
                    int iE9 = qyj.E(vxeVarO21, "upload_token");
                    int iE10 = qyj.E(vxeVarO21, "status");
                    int iE11 = qyj.E(vxeVarO21, "created_at");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO21.M0()) {
                        arrayList.add(new zzg(vxeVarO21.getLong(iE3), vxeVarO21.getLong(iE4), (int) vxeVarO21.getLong(iE5), vxeVarO21.getLong(iE6), vxeVarO21.B0(iE7), ((int) vxeVarO21.getLong(iE8)) != 0, vxeVarO21.isNull(iE9) ? null : vxeVarO21.B0(iE9), nv8.g((int) vxeVarO21.getLong(iE10)), vxeVarO21.getLong(iE11)));
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO21.close();
                }
            case 25:
                vxe vxeVarO22 = ((qxe) obj).O0("SELECT * FROM story_publish WHERE publish_id = ?");
                try {
                    vxeVarO22.c(1, j5);
                    int iE12 = qyj.E(vxeVarO22, "publish_id");
                    int iE13 = qyj.E(vxeVarO22, "draft_id");
                    int iE14 = qyj.E(vxeVarO22, "segment_index");
                    int iE15 = qyj.E(vxeVarO22, "story_id");
                    int iE16 = qyj.E(vxeVarO22, "segment_path");
                    int iE17 = qyj.E(vxeVarO22, "is_video");
                    int iE18 = qyj.E(vxeVarO22, "upload_token");
                    int iE19 = qyj.E(vxeVarO22, "status");
                    int iE20 = qyj.E(vxeVarO22, "created_at");
                    if (vxeVarO22.M0()) {
                        zzgVar = new zzg(vxeVarO22.getLong(iE12), vxeVarO22.getLong(iE13), (int) vxeVarO22.getLong(iE14), vxeVarO22.getLong(iE15), vxeVarO22.B0(iE16), ((int) vxeVarO22.getLong(iE17)) != 0, vxeVarO22.isNull(iE18) ? null : vxeVarO22.B0(iE18), nv8.g((int) vxeVarO22.getLong(iE19)), vxeVarO22.getLong(iE20));
                    } else {
                        zzgVar = null;
                    }
                    return zzgVar;
                } finally {
                    vxeVarO22.close();
                }
            case 26:
                return Boolean.valueOf(((d0h) obj).a() == j5);
            case 27:
                vxe vxeVarO23 = ((qxe) obj).O0("UPDATE tasks SET status = ?, fails_count = fails_count + 1 WHERE id = ?");
                try {
                    vxeVarO23.c(1, 20L);
                    vxeVarO23.c(2, j5);
                    vxeVarO23.M0();
                    return sbiVar;
                } finally {
                    vxeVarO23.close();
                }
            case 28:
                vxe vxeVarO24 = ((qxe) obj).O0("SELECT * FROM tasks WHERE id = ?");
                try {
                    vxeVarO24.c(1, j5);
                    return vxeVarO24.M0() ? new ujh(vxeVarO24.getLong(qyj.E(vxeVarO24, "id")), xvc.x((int) vxeVarO24.getLong(qyj.E(vxeVarO24, "type"))), xvc.w((int) vxeVarO24.getLong(qyj.E(vxeVarO24, "status"))), (int) vxeVarO24.getLong(qyj.E(vxeVarO24, "fails_count")), vxeVarO24.getLong(qyj.E(vxeVarO24, "depends_request_id")), (int) vxeVarO24.getLong(qyj.E(vxeVarO24, "dependency_type")), vxeVarO24.getBlob(qyj.E(vxeVarO24, "data")), vxeVarO24.getLong(qyj.E(vxeVarO24, "created_time"))) : null;
                } finally {
                    vxeVarO24.close();
                }
            default:
                vxe vxeVarO25 = ((qxe) obj).O0("SELECT type FROM tasks WHERE id = ?");
                try {
                    vxeVarO25.c(1, j5);
                    if (!vxeVarO25.M0()) {
                        throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type 'one.me.sdk.tasks.PersistableTaskType'.");
                    }
                    ctc ctcVarX = xvc.x((int) vxeVarO25.getLong(0));
                    vxeVarO25.close();
                    return ctcVarX;
                } catch (Throwable th) {
                    vxeVarO25.close();
                    throw th;
                }
        }
    }

    public /* synthetic */ aa2(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
    }

    public /* synthetic */ aa2(long j, int i) {
        this.a = i;
        this.b = j;
    }
}

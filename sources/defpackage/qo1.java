package defpackage;

import android.content.Intent;
import androidx.work.impl.model.WorkersQueueDao_Impl;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import ru.ok.tamtam.nano.Protos;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qo1 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ qo1(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        kb1 kb1Var;
        boolean z;
        boolean z2;
        ge8 ge8Var;
        rqe rqeVar;
        List listA;
        Set setE;
        jji jjiVarC;
        g0j g0jVar;
        int i = this.a;
        sbi sbiVar = sbi.a;
        String str = this.b;
        switch (i) {
            case 0:
                Intent intent = (Intent) obj;
                intent.setAction("action-finished-call");
                intent.putExtra("arg_call_session_id", str);
                return sbiVar;
            case 1:
                Intent intent2 = (Intent) obj;
                intent2.setAction("action-open-call");
                intent2.putExtra("arg_call_session_id", str);
                intent2.setFlags(268435456);
                return sbiVar;
            case 2:
                Intent intent3 = (Intent) obj;
                intent3.setAction("action-decline-call");
                intent3.putExtra("arg_call_session_id", str);
                return sbiVar;
            case 3:
                Intent intent4 = (Intent) obj;
                intent4.setAction("action-open-call");
                intent4.putExtra("arg_call_session_id", str);
                intent4.setFlags(268435456);
                return sbiVar;
            case 4:
                ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
                keySetViewNewKeySet.add(str);
                return keySetViewNewKeySet;
            case 5:
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM call_notifications_analytics WHERE call_id=?");
                try {
                    vxeVarO0.B(1, str);
                    int iE = qyj.E(vxeVarO0, "call_id");
                    int iE2 = qyj.E(vxeVarO0, "chat_id");
                    int iE3 = qyj.E(vxeVarO0, "push_source");
                    int iE4 = qyj.E(vxeVarO0, "received_time");
                    int iE5 = qyj.E(vxeVarO0, "push_id");
                    int iE6 = qyj.E(vxeVarO0, "event_key");
                    int iE7 = qyj.E(vxeVarO0, "suid");
                    int iE8 = qyj.E(vxeVarO0, "sent_time");
                    int iE9 = qyj.E(vxeVarO0, "fcm_sent_time");
                    int iE10 = qyj.E(vxeVarO0, "drop_reason");
                    int iE11 = qyj.E(vxeVarO0, "created_time");
                    if (vxeVarO0.M0()) {
                        kb1Var = new kb1(vxeVarO0.B0(iE), vxeVarO0.getLong(iE2), (int) vxeVarO0.getLong(iE3), vxeVarO0.getLong(iE4), vxeVarO0.isNull(iE5) ? null : Long.valueOf(vxeVarO0.getLong(iE5)), vxeVarO0.isNull(iE6) ? null : vxeVarO0.B0(iE6), vxeVarO0.isNull(iE7) ? null : Long.valueOf(vxeVarO0.getLong(iE7)), vxeVarO0.isNull(iE8) ? null : Long.valueOf(vxeVarO0.getLong(iE8)), vxeVarO0.isNull(iE9) ? null : Long.valueOf(vxeVarO0.getLong(iE9)), vxeVarO0.isNull(iE10) ? null : vxeVarO0.B0(iE10), vxeVarO0.getLong(iE11));
                    } else {
                        kb1Var = null;
                    }
                    return kb1Var;
                } finally {
                    vxeVarO0.close();
                }
            case 6:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    vxeVarO1.B(1, str);
                    if (vxeVarO1.M0()) {
                        z = false;
                        if (((int) vxeVarO1.getLong(0)) != 0) {
                            z2 = true;
                        }
                        vxeVarO1.close();
                        return Boolean.valueOf(z2);
                    }
                    z = false;
                    z2 = z;
                    vxeVarO1.close();
                    return Boolean.valueOf(z2);
                } catch (Throwable th) {
                    vxeVarO1.close();
                    throw th;
                }
            case 7:
                vxe vxeVarO2 = ((qxe) obj).O0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    vxeVarO2.B(1, str);
                    return Boolean.valueOf(vxeVarO2.M0() && ((int) vxeVarO2.getLong(0)) != 0);
                } finally {
                    vxeVarO2.close();
                }
            case 8:
                vxe vxeVarO3 = ((qxe) obj).O0("SELECT * FROM informer_banner WHERE id = ? LIMIT 1");
                try {
                    vxeVarO3.B(1, str);
                    int iE12 = qyj.E(vxeVarO3, "id");
                    int iE13 = qyj.E(vxeVarO3, "title");
                    int iE14 = qyj.E(vxeVarO3, "settings");
                    int iE15 = qyj.E(vxeVarO3, "description");
                    int iE16 = qyj.E(vxeVarO3, LogFactory.PRIORITY_KEY);
                    int iE17 = qyj.E(vxeVarO3, "repeat");
                    int iE18 = qyj.E(vxeVarO3, "rerun");
                    int iE19 = qyj.E(vxeVarO3, "animoji_id");
                    int iE20 = qyj.E(vxeVarO3, MLFeatureConfigProviderBase.URL_KEY);
                    int iE21 = qyj.E(vxeVarO3, "type");
                    int iE22 = qyj.E(vxeVarO3, "click_time");
                    int iE23 = qyj.E(vxeVarO3, "show_time");
                    int iE24 = qyj.E(vxeVarO3, "close_time");
                    int iE25 = qyj.E(vxeVarO3, "show_count");
                    int iE26 = qyj.E(vxeVarO3, "button_text");
                    if (vxeVarO3.M0()) {
                        ge8Var = new ge8(vxeVarO3.B0(iE12), vxeVarO3.B0(iE13), (int) vxeVarO3.getLong(iE14), vxeVarO3.isNull(iE15) ? null : vxeVarO3.B0(iE15), (byte) vxeVarO3.getLong(iE16), (byte) vxeVarO3.getLong(iE17), vxeVarO3.getLong(iE18), vxeVarO3.isNull(iE19) ? null : Long.valueOf(vxeVarO3.getLong(iE19)), vxeVarO3.isNull(iE20) ? null : vxeVarO3.B0(iE20), y3m.i((int) vxeVarO3.getLong(iE21)), vxeVarO3.getLong(iE22), vxeVarO3.getLong(iE23), vxeVarO3.getLong(iE24), (int) vxeVarO3.getLong(iE25), vxeVarO3.isNull(iE26) ? null : vxeVarO3.B0(iE26));
                    } else {
                        ge8Var = null;
                    }
                    return ge8Var;
                } finally {
                    vxeVarO3.close();
                }
            case 9:
                vxe vxeVarO4 = ((qxe) obj).O0("DELETE FROM metrics WHERE traceId = ?");
                try {
                    vxeVarO4.B(1, str);
                    vxeVarO4.M0();
                    return sbiVar;
                } finally {
                    vxeVarO4.close();
                }
            case 10:
                vxe vxeVarO5 = ((qxe) obj).O0("UPDATE metrics SET isMarkedAsFailed = 1 WHERE traceId = ?");
                try {
                    vxeVarO5.B(1, str);
                    vxeVarO5.M0();
                    return sbiVar;
                } finally {
                    vxeVarO5.close();
                }
            case 11:
                rx8.c0(qv1.k("watchdog-", str), new bka((Runnable) obj, 1));
                return sbiVar;
            case 12:
                vxe vxeVarO6 = ((qxe) obj).O0("SELECT * FROM chat_folder WHERE id = ?");
                try {
                    vxeVarO6.B(1, str);
                    int iE27 = qyj.E(vxeVarO6, "id");
                    int iE28 = qyj.E(vxeVarO6, "title");
                    int iE29 = qyj.E(vxeVarO6, "order");
                    int iE30 = qyj.E(vxeVarO6, "emoji");
                    int iE31 = qyj.E(vxeVarO6, "filters");
                    int iE32 = qyj.E(vxeVarO6, "isHiddenForAllFolder");
                    int iE33 = qyj.E(vxeVarO6, "elements");
                    int iE34 = qyj.E(vxeVarO6, "filterSubjects");
                    int iE35 = qyj.E(vxeVarO6, "widgets");
                    int iE36 = qyj.E(vxeVarO6, "options");
                    int iE37 = qyj.E(vxeVarO6, "updateTime");
                    int iE38 = qyj.E(vxeVarO6, "favorites");
                    int iE39 = qyj.E(vxeVarO6, "templateId");
                    int iE40 = qyj.E(vxeVarO6, "sourceId");
                    if (vxeVarO6.M0()) {
                        String strB0 = vxeVarO6.B0(iE27);
                        String strB1 = vxeVarO6.B0(iE28);
                        int i2 = (int) vxeVarO6.getLong(iE29);
                        String strB2 = vxeVarO6.isNull(iE30) ? null : vxeVarO6.B0(iE30);
                        EnumSet enumSetK0 = e9i.K0(vxeVarO6.B0(iE31));
                        boolean z3 = ((int) vxeVarO6.getLong(iE32)) != 0;
                        byte[] blob = vxeVarO6.isNull(iE33) ? null : vxeVarO6.getBlob(iE33);
                        if (blob != null) {
                            Protos.MessageElements messageElements = new Protos.MessageElements();
                            sia.mergeFrom(messageElements, blob);
                            listA = dga.a(messageElements.elements);
                        } else {
                            listA = r66.a;
                        }
                        List list = listA;
                        Map mapV = e9i.V(vxeVarO6.isNull(iE34) ? null : vxeVarO6.getBlob(iE34));
                        List listW = e9i.W(vxeVarO6.isNull(iE35) ? null : vxeVarO6.getBlob(iE35));
                        byte[] blob2 = vxeVarO6.isNull(iE36) ? null : vxeVarO6.getBlob(iE36);
                        if (blob2 != null) {
                            f67 f67Var = new f67(1);
                            sia.mergeFrom(f67Var, blob2);
                            setE = yab.E(f67Var);
                        } else {
                            setE = c76.a;
                        }
                        rqeVar = new rqe(strB0, strB1, i2, strB2, enumSetK0, z3, list, mapV, listW, setE, vxeVarO6.getLong(iE37), e9i.n(vxeVarO6.isNull(iE38) ? null : vxeVarO6.getBlob(iE38)), vxeVarO6.isNull(iE39) ? null : Long.valueOf(vxeVarO6.getLong(iE39)), vxeVarO6.isNull(iE40) ? null : Long.valueOf(vxeVarO6.getLong(iE40)));
                    } else {
                        rqeVar = null;
                    }
                    return rqeVar;
                } finally {
                    vxeVarO6.close();
                }
            case 13:
                vxe vxeVarO7 = ((qxe) obj).O0("DELETE FROM folder_and_chats WHERE folderId = ?");
                try {
                    vxeVarO7.B(1, str);
                    vxeVarO7.M0();
                    return sbiVar;
                } finally {
                    vxeVarO7.close();
                }
            case 14:
                String str2 = (String) obj;
                if (r5h.X0(str2)) {
                    return str2.length() < str.length() ? str : str2;
                }
                return str.concat(str2);
            case 15:
                hj8 hj8Var = (hj8) obj;
                return str.subSequence(hj8Var.a, hj8Var.b + 1).toString();
            case 16:
                vxe vxeVarO8 = ((qxe) obj).O0("DELETE FROM uploads WHERE photo_token=?");
                try {
                    vxeVarO8.B(1, str);
                    vxeVarO8.M0();
                    return sbiVar;
                } finally {
                    vxeVarO8.close();
                }
            case 17:
                vxe vxeVarO9 = ((qxe) obj).O0("SELECT upload_status FROM uploads WHERE attach_local_id=?");
                try {
                    vxeVarO9.B(1, str);
                    if (vxeVarO9.M0()) {
                        jjiVarC = k1m.c(vxeVarO9.isNull(0) ? null : Integer.valueOf((int) vxeVarO9.getLong(0)));
                        break;
                    } else {
                        jjiVarC = null;
                    }
                    return jjiVarC;
                } finally {
                    vxeVarO9.close();
                }
            case 18:
                vxe vxeVarO10 = ((qxe) obj).O0("SELECT * FROM video_message_preparations WHERE attach_local_id = ?");
                try {
                    vxeVarO10.B(1, str);
                    int iE41 = qyj.E(vxeVarO10, "attach_local_id");
                    int iE42 = qyj.E(vxeVarO10, "result_path");
                    int iE43 = qyj.E(vxeVarO10, "unrecoverable_exception");
                    if (vxeVarO10.M0()) {
                        g0jVar = new g0j(vxeVarO10.B0(iE41), vxeVarO10.B0(iE42), vxeVarO10.isNull(iE43) ? null : vxeVarO10.B0(iE43));
                    } else {
                        g0jVar = null;
                    }
                    return g0jVar;
                } finally {
                    vxeVarO10.close();
                }
            case 19:
                vxe vxeVarO11 = ((qxe) obj).O0("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    vxeVarO11.B(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO11.M0()) {
                        arrayList.add(vxeVarO11.B0(0));
                    }
                    vxeVarO11.close();
                    return arrayList;
                } catch (Throwable th2) {
                    vxeVarO11.close();
                    throw th2;
                }
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO12 = qxeVar.O0("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    vxeVarO12.B(1, str);
                    vxeVarO12.M0();
                    return Integer.valueOf(e9i.e0(qxeVar));
                } finally {
                    vxeVarO12.close();
                }
            default:
                return WorkersQueueDao_Impl.delete$lambda$1("DELETE FROM WorkerQueueItem WHERE uuid = ?", str, (qxe) obj);
        }
    }
}

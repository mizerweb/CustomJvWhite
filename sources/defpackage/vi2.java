package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.stat.accept.AcceptCallStat;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vi2 implements cf7 {
    public final /* synthetic */ int a;

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        boolean z = true;
        switch (this.a) {
            case 0:
                wi2 wi2Var = new wi2(((ew5) obj).a, null);
                gm0.V(hj2.class.getName(), wi2Var.getMessage(), wi2Var);
                return sbi.a;
            case 1:
                aj2 aj2Var = new aj2(((ew5) obj).a, null);
                gm0.V(hj2.class.getName(), aj2Var.getMessage(), aj2Var);
                return sbi.a;
            case 2:
                return AcceptCallStat.onAcceptCall$lambda$0((fi1) obj);
            case 3:
                return AcceptCallStat.onAcceptCall$lambda$1((fi1) obj);
            case 4:
                return AcceptCallStat.onAcceptCall$lambda$2((fi1) obj);
            case 5:
                return ((de6) obj).toString();
            case 6:
                ((Long) obj).getClass();
                zv8[] zv8VarArr = AddChatAdminsScreen.l;
                return r66.a;
            case 7:
                return ((oc) obj).b.toString();
            case 8:
                vg4 vg4Var = (vg4) obj;
                if (!vg4Var.f && !vg4Var.I() && !vg4Var.C() && (!vg4Var.E() || !vg4Var.H())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                return ((oc) obj).b.toString();
            case 10:
                vxe vxeVarO0 = ((qxe) obj).O0("DELETE FROM animoji");
                try {
                    vxeVarO0.M0();
                    return sbi.a;
                } finally {
                    vxeVarO0.close();
                }
            case 11:
                ((ms1) obj).getClass();
                throw null;
            case 12:
                ((ms1) obj).getClass();
                return sbi.a;
            case 13:
                return ((dn) obj).f;
            case 14:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM animoji_set");
                try {
                    int iE = qyj.E(vxeVarO1, "id");
                    int iE2 = qyj.E(vxeVarO1, SdkMetricStatEvent.NAME_KEY);
                    int iE3 = qyj.E(vxeVarO1, "icon_url");
                    int iE4 = qyj.E(vxeVarO1, "icon_lottie_url");
                    int iE5 = qyj.E(vxeVarO1, "update_time");
                    int iE6 = qyj.E(vxeVarO1, "animoji_ids");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO1.M0()) {
                        arrayList.add(new dn(vxeVarO1.getLong(iE), vxeVarO1.B0(iE2), vxeVarO1.B0(iE3), vxeVarO1.isNull(iE4) ? null : vxeVarO1.B0(iE4), vxeVarO1.getLong(iE5), e9i.L0(vxeVarO1.isNull(iE6) ? null : vxeVarO1.B0(iE6))));
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO1.close();
                }
            case 15:
                vxe vxeVarO2 = ((qxe) obj).O0("DELETE FROM animoji_set");
                try {
                    vxeVarO2.M0();
                    return sbi.a;
                } finally {
                    vxeVarO2.close();
                }
            case 16:
                w73 w73Var = (w73) obj;
                return "l:" + w73Var.a + "|s:" + w73Var.v;
            case 17:
                return Boolean.valueOf(((w73) obj).q == 0);
            case 18:
                ((List) obj).clear();
                return sbi.a;
            case 19:
                return Boolean.valueOf(((kw7) obj) instanceof jw7);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return sbi.a;
            case 21:
                Throwable th = (Throwable) obj;
                String strConcat = "dg0".concat("");
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, strConcat, zo5.r("buffer flush failed -> ", th), null);
                    }
                }
                return sbi.a;
            case 22:
                vxe vxeVarO3 = ((qxe) obj).O0("DELETE FROM gallery_saved_index");
                try {
                    vxeVarO3.M0();
                    return sbi.a;
                } finally {
                    vxeVarO3.close();
                }
            case 23:
                kbc kbcVar = (kbc) obj;
                return Integer.valueOf(kbcVar.A() == ix3.b ? kbcVar.getIcon().b : kbcVar.getIcon().h);
            case 24:
                return -1;
            case 25:
                return 0;
            case 26:
                ((Integer) obj).getClass();
                return 0;
            case 27:
                return obj instanceof Iterable ? (Iterable) obj : Collections.singletonList(obj);
            case 28:
                vxe vxeVarO4 = ((qxe) obj).O0("DELETE FROM call_history");
                try {
                    vxeVarO4.M0();
                    return sbi.a;
                } finally {
                    vxeVarO4.close();
                }
            default:
                vxe vxeVarO5 = ((qxe) obj).O0("SELECT * FROM call_history ORDER BY time DESC");
                try {
                    int iE7 = qyj.E(vxeVarO5, "history_id");
                    int iE8 = qyj.E(vxeVarO5, "call_id");
                    int iE9 = qyj.E(vxeVarO5, "call_name");
                    int iE10 = qyj.E(vxeVarO5, "caller_id");
                    int iE11 = qyj.E(vxeVarO5, "message_id");
                    int iE12 = qyj.E(vxeVarO5, "chat_id");
                    int iE13 = qyj.E(vxeVarO5, "call_type");
                    int iE14 = qyj.E(vxeVarO5, "hangup_type");
                    int iE15 = qyj.E(vxeVarO5, ApiProtocol.KEY_JOIN_LINK);
                    int iE16 = qyj.E(vxeVarO5, "time");
                    int iE17 = qyj.E(vxeVarO5, "duration_ms");
                    int iE18 = qyj.E(vxeVarO5, "group_call_type");
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO5.M0()) {
                        arrayList2.add(new dk1(vxeVarO5.getLong(iE7), vxeVarO5.B0(iE8), vxeVarO5.isNull(iE9) ? null : vxeVarO5.B0(iE9), vxeVarO5.getLong(iE10), vxeVarO5.isNull(iE11) ? null : Long.valueOf(vxeVarO5.getLong(iE11)), vxeVarO5.getLong(iE12), vxeVarO5.B0(iE13), vxeVarO5.isNull(iE14) ? null : vxeVarO5.B0(iE14), vxeVarO5.isNull(iE15) ? null : vxeVarO5.B0(iE15), vxeVarO5.getLong(iE16), vxeVarO5.isNull(iE17) ? null : Long.valueOf(vxeVarO5.getLong(iE17)), vxeVarO5.isNull(iE18) ? null : Integer.valueOf((int) vxeVarO5.getLong(iE18))));
                        iE11 = iE11;
                        break;
                    }
                    return arrayList2;
                } finally {
                    vxeVarO5.close();
                }
        }
    }

    public /* synthetic */ vi2(int i, Object obj) {
        this.a = i;
    }

    public /* synthetic */ vi2(int i) {
        this.a = i;
    }
}

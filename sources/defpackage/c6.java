package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import one.me.android.concurrent.ThreadExecutorHangException;
import one.me.android.concurrent.ThreadExecutorStuckException;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.tab.ChatsTabWidget;
import one.me.sdk.design.theme.ChromaIllegalApplyThemeException;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c6 implements cf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ c6(int i) {
        this.a = i;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        boolean z = true;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                rp9 rp9Var = (rp9) obj;
                StringBuilder sbB = nbh.B(rp9Var.c / 1000000, "    ", rp9Var.a, ": executing=");
                sbB.append("ms");
                return sbB.toString();
            case 1:
                rp9 rp9Var2 = (rp9) obj;
                StringBuilder sbB2 = nbh.B(rp9Var2.b / 1000000, "    ", rp9Var2.a, ": waiting=");
                sbB2.append("ms");
                return sbB2.toString();
            case 2:
                rp9 rp9Var3 = (rp9) obj;
                return qt4.k(rp9Var3.b / 1000000, "ms, waiting=", nbh.B(rp9Var3.c / 1000000, "    ", rp9Var3.a, ": executing="));
            case 3:
                Throwable th = (Throwable) obj;
                ChromaIllegalApplyThemeException chromaIllegalApplyThemeException = th instanceof ChromaIllegalApplyThemeException ? (ChromaIllegalApplyThemeException) th : null;
                return chromaIllegalApplyThemeException != null ? chromaIllegalApplyThemeException : new ChromaIllegalApplyThemeException(th);
            case 4:
                View view = (View) obj;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    if (viewGroup.getChildCount() <= 0) {
                        viewGroup = null;
                    }
                    if (viewGroup != null) {
                        return new sw(4, viewGroup);
                    }
                }
                return null;
            case 5:
                return ((lfe) obj).a;
            case 6:
                return (Activity) ((WeakReference) obj).get();
            case 7:
                Activity activity = (Activity) obj;
                if (!activity.isDestroyed() && !activity.isFinishing()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                return ((Activity) obj).getWindow().getDecorView().getRootView();
            case 9:
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT COUNT(*) FROM animoji");
                try {
                    return Integer.valueOf(vxeVarO0.M0() ? (int) vxeVarO0.getLong(0) : 0);
                } finally {
                    vxeVarO0.close();
                }
            case 10:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM animoji");
                try {
                    int iE = qyj.E(vxeVarO1, "id");
                    int iE2 = qyj.E(vxeVarO1, "update_time");
                    int iE3 = qyj.E(vxeVarO1, "emoji");
                    int iE4 = qyj.E(vxeVarO1, "lottie_url");
                    int iE5 = qyj.E(vxeVarO1, "lottie_play_url");
                    int iE6 = qyj.E(vxeVarO1, "set_id");
                    int iE7 = qyj.E(vxeVarO1, "icon_url");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO1.M0()) {
                        arrayList.add(new xl(vxeVarO1.getLong(iE), vxeVarO1.getLong(iE2), vxeVarO1.B0(iE3), vxeVarO1.isNull(iE4) ? null : vxeVarO1.B0(iE4), vxeVarO1.isNull(iE5) ? null : vxeVarO1.B0(iE5), vxeVarO1.isNull(iE6) ? null : Long.valueOf(vxeVarO1.getLong(iE6)), vxeVarO1.isNull(iE7) ? null : vxeVarO1.B0(iE7)));
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO1.close();
                }
            case 11:
                return p90.a(null);
            case 12:
                w73 w73Var = (w73) obj;
                return "l:" + w73Var.a + "|s:" + w73Var.v;
            case 13:
                return String.valueOf(((w73) obj).v);
            case 14:
                ((List) obj).clear();
                return sbiVar;
            case 15:
                return vvj.e((fka) obj);
            case 16:
                return Boolean.TRUE;
            case 17:
                vxe vxeVarO2 = ((qxe) obj).O0("SELECT * FROM call_history ORDER BY time DESC");
                try {
                    int iE8 = qyj.E(vxeVarO2, "history_id");
                    int iE9 = qyj.E(vxeVarO2, "call_id");
                    int iE10 = qyj.E(vxeVarO2, "call_name");
                    int iE11 = qyj.E(vxeVarO2, "caller_id");
                    int iE12 = qyj.E(vxeVarO2, "message_id");
                    int iE13 = qyj.E(vxeVarO2, "chat_id");
                    int iE14 = qyj.E(vxeVarO2, "call_type");
                    int iE15 = qyj.E(vxeVarO2, "hangup_type");
                    int iE16 = qyj.E(vxeVarO2, ApiProtocol.KEY_JOIN_LINK);
                    int iE17 = qyj.E(vxeVarO2, "time");
                    int iE18 = qyj.E(vxeVarO2, "duration_ms");
                    int iE19 = qyj.E(vxeVarO2, "group_call_type");
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO2.M0()) {
                        arrayList2.add(new dk1(vxeVarO2.getLong(iE8), vxeVarO2.B0(iE9), vxeVarO2.isNull(iE10) ? null : vxeVarO2.B0(iE10), vxeVarO2.getLong(iE11), vxeVarO2.isNull(iE12) ? null : Long.valueOf(vxeVarO2.getLong(iE12)), vxeVarO2.getLong(iE13), vxeVarO2.B0(iE14), vxeVarO2.isNull(iE15) ? null : vxeVarO2.B0(iE15), vxeVarO2.isNull(iE16) ? null : vxeVarO2.B0(iE16), vxeVarO2.getLong(iE17), vxeVarO2.isNull(iE18) ? null : Long.valueOf(vxeVarO2.getLong(iE18)), vxeVarO2.isNull(iE19) ? null : Integer.valueOf((int) vxeVarO2.getLong(iE19))));
                        iE16 = iE16;
                        break;
                    }
                    return arrayList2;
                } finally {
                    vxeVarO2.close();
                }
            case 18:
                return Integer.valueOf(((kbc) obj).getText().c);
            case 19:
                tia tiaVar = (tia) obj;
                long j = tiaVar.a;
                long j2 = tiaVar.e;
                long j3 = tiaVar.g;
                StringBuilder sbS = qt4.s(j, "p_id=", ",m_id=");
                sbS.append(j2);
                return qt4.k(j3, ",sender=", sbS);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                rt2 rt2Var = (rt2) obj;
                nx2 nx2Var = rt2Var.b;
                if ((nx2Var.b != lx2.c && nx2Var.a == 0 && nx2Var.j == 0 && nx2Var.e0 == null) || rt2Var.Z() || (nx2Var.I.g && rt2Var.c == null)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                return ((w73) obj).r;
            case 22:
                zv8[] zv8VarArr = ChatsListWidget.X;
                return tre.Y((RecyclerView) obj);
            case 23:
                zv8[] zv8VarArr2 = ChatsListWidget.X;
                return tre.Y((RecyclerView) obj);
            case 24:
                zm3.b.p();
                return sbiVar;
            case 25:
                ((Integer) obj).getClass();
                zv8[] zv8VarArr3 = ChatsTabWidget.B1;
                return sbiVar;
            case 26:
                gm0.V("OneMeExecutors", "hanged threads", new ThreadExecutorHangException((Collection) obj, m94.g));
                return sbiVar;
            case 27:
                gm0.V("OneMeExecutors", "stucked threads", new ThreadExecutorStuckException((Collection) obj, m94.g));
                return sbiVar;
            case 28:
                return ConcurrentHashMap.newKeySet();
            default:
                return ConcurrentHashMap.newKeySet();
        }
    }
}

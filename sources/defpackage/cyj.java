package defpackage;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class cyj extends np4 {
    public static final String v = n1g.Z("WorkContinuationImpl");
    public final oyj n;
    public final String o;
    public final ve6 p;
    public final List q;
    public final ArrayList r;
    public final ArrayList s = new ArrayList();
    public boolean t;
    public nhb u;

    public cyj(oyj oyjVar, String str, ve6 ve6Var, List list, int i) {
        this.n = oyjVar;
        this.o = str;
        this.p = ve6Var;
        this.q = list;
        this.r = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (ve6Var == ve6.a && ((WorkRequest) list.get(i2)).getWorkSpec().u != BuildConfig.MAX_TIME_TO_UPLOAD) {
                ore.p("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String stringId = ((WorkRequest) list.get(i2)).getStringId();
            this.r.add(stringId);
            this.s.add(stringId);
        }
    }

    public static HashSet P(cyj cyjVar) {
        HashSet hashSet = new HashSet();
        cyjVar.getClass();
        return hashSet;
    }

    public final ogc N() {
        if (this.t) {
            n1g.x().j0(v, "Already enqueued work ids (" + TextUtils.join(", ", this.r) + ")");
        } else {
            oyj oyjVar = this.n;
            this.u = lvb.v0(oyjVar.b.m, "EnqueueRunnable_" + this.p.name(), oyjVar.d.a, new xlf(7, this));
        }
        return this.u;
    }

    public final b99 O() {
        oyj oyjVar = this.n;
        qzj qzjVarX = oyjVar.c.x();
        qzjVarX.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        ArrayList arrayList = this.s;
        vd7.b(sb, arrayList.size());
        sb.append(")");
        String string = sb.toString();
        jl8 jl8Var = qzjVarX.a.f;
        if (jl8Var == null) {
            jl8Var = null;
        }
        String[] strArr = {"WorkTag", "WorkProgress", "workspec"};
        os1 os1Var = new os1(string, arrayList, qzjVarX, 27);
        jl8Var.c.l(strArr);
        qg7 qg7Var = jl8Var.h;
        return xjg.a(new vre((rre) qg7Var.b, qg7Var, strArr, os1Var), mzj.A, oyjVar.d);
    }
}

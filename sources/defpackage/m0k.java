package defpackage;

import androidx.work.impl.model.WorkersQueueDao_Impl;

/* JADX INFO: loaded from: classes.dex */
public final class m0k extends ha6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WorkersQueueDao_Impl b;

    public /* synthetic */ m0k(int i, WorkersQueueDao_Impl workersQueueDao_Impl) {
        this.a = i;
        this.b = workersQueueDao_Impl;
    }

    @Override // defpackage.ha6
    public final void a(vxe vxeVar, Object obj) {
        int i = this.a;
        WorkersQueueDao_Impl workersQueueDao_Impl = this.b;
        switch (i) {
            case 0:
                vzj vzjVar = (vzj) obj;
                vxeVar.B(1, vzjVar.a);
                vxeVar.B(2, vzjVar.b);
                vxeVar.B(3, workersQueueDao_Impl.__ExistingWorkPolicy_enumToString(vzjVar.c));
                vxeVar.B(4, ww3.z1(vzjVar.e, ",", null, null, null, 62));
                vxeVar.c(5, vzjVar.f);
                vxeVar.c(6, vzjVar.g);
                mzj mzjVar = vzjVar.d;
                vxeVar.B(7, mzjVar.a);
                vxeVar.c(8, rx8.a0(mzjVar.b));
                vxeVar.B(9, mzjVar.c);
                vxeVar.B(10, mzjVar.d);
                d25 d25Var = d25.b;
                vxeVar.d(11, f55.y(mzjVar.e));
                vxeVar.d(12, f55.y(mzjVar.f));
                vxeVar.c(13, mzjVar.g);
                vxeVar.c(14, mzjVar.h);
                vxeVar.c(15, mzjVar.i);
                vxeVar.c(16, mzjVar.k);
                vxeVar.c(17, rx8.g(mzjVar.l));
                vxeVar.c(18, mzjVar.m);
                vxeVar.c(19, mzjVar.n);
                vxeVar.c(20, mzjVar.o);
                vxeVar.c(21, mzjVar.p);
                vxeVar.c(22, mzjVar.q ? 1L : 0L);
                vxeVar.c(23, rx8.W(mzjVar.r));
                vxeVar.c(24, mzjVar.s);
                vxeVar.c(25, mzjVar.t);
                vxeVar.c(26, mzjVar.u);
                vxeVar.c(27, mzjVar.v);
                vxeVar.c(28, mzjVar.w);
                String str = mzjVar.x;
                if (str == null) {
                    vxeVar.e(29);
                } else {
                    vxeVar.B(29, str);
                }
                Boolean bool = mzjVar.y;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    vxeVar.e(30);
                } else {
                    vxeVar.c(30, numValueOf.intValue());
                }
                kg4 kg4Var = mzjVar.j;
                vxeVar.c(31, rx8.T(kg4Var.a));
                vxeVar.d(32, rx8.A(kg4Var.b));
                vxeVar.c(33, kg4Var.c ? 1L : 0L);
                vxeVar.c(34, kg4Var.d ? 1L : 0L);
                vxeVar.c(35, kg4Var.e ? 1L : 0L);
                vxeVar.c(36, kg4Var.f ? 1L : 0L);
                vxeVar.c(37, kg4Var.g);
                vxeVar.c(38, kg4Var.h);
                vxeVar.d(39, rx8.Z(kg4Var.i));
                break;
            default:
                vzj vzjVar2 = (vzj) obj;
                vxeVar.B(1, vzjVar2.a);
                vxeVar.B(2, vzjVar2.b);
                vxeVar.B(3, workersQueueDao_Impl.__ExistingWorkPolicy_enumToString(vzjVar2.c));
                vxeVar.B(4, ww3.z1(vzjVar2.e, ",", null, null, null, 62));
                vxeVar.c(5, vzjVar2.f);
                vxeVar.c(6, vzjVar2.g);
                mzj mzjVar2 = vzjVar2.d;
                vxeVar.B(7, mzjVar2.a);
                vxeVar.c(8, rx8.a0(mzjVar2.b));
                vxeVar.B(9, mzjVar2.c);
                vxeVar.B(10, mzjVar2.d);
                d25 d25Var2 = d25.b;
                vxeVar.d(11, f55.y(mzjVar2.e));
                vxeVar.d(12, f55.y(mzjVar2.f));
                vxeVar.c(13, mzjVar2.g);
                vxeVar.c(14, mzjVar2.h);
                vxeVar.c(15, mzjVar2.i);
                vxeVar.c(16, mzjVar2.k);
                vxeVar.c(17, rx8.g(mzjVar2.l));
                vxeVar.c(18, mzjVar2.m);
                vxeVar.c(19, mzjVar2.n);
                vxeVar.c(20, mzjVar2.o);
                vxeVar.c(21, mzjVar2.p);
                vxeVar.c(22, mzjVar2.q ? 1L : 0L);
                vxeVar.c(23, rx8.W(mzjVar2.r));
                vxeVar.c(24, mzjVar2.s);
                vxeVar.c(25, mzjVar2.t);
                vxeVar.c(26, mzjVar2.u);
                vxeVar.c(27, mzjVar2.v);
                vxeVar.c(28, mzjVar2.w);
                String str2 = mzjVar2.x;
                if (str2 == null) {
                    vxeVar.e(29);
                } else {
                    vxeVar.B(29, str2);
                }
                Boolean bool2 = mzjVar2.y;
                Integer numValueOf2 = bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null;
                if (numValueOf2 == null) {
                    vxeVar.e(30);
                } else {
                    vxeVar.c(30, numValueOf2.intValue());
                }
                kg4 kg4Var2 = mzjVar2.j;
                vxeVar.c(31, rx8.T(kg4Var2.a));
                vxeVar.d(32, rx8.A(kg4Var2.b));
                vxeVar.c(33, kg4Var2.c ? 1L : 0L);
                vxeVar.c(34, kg4Var2.d ? 1L : 0L);
                vxeVar.c(35, kg4Var2.e ? 1L : 0L);
                vxeVar.c(36, kg4Var2.f ? 1L : 0L);
                vxeVar.c(37, kg4Var2.g);
                vxeVar.c(38, kg4Var2.h);
                vxeVar.d(39, rx8.Z(kg4Var2.i));
                break;
        }
    }

    @Override // defpackage.ha6
    public final String b() {
        switch (this.a) {
            case 0:
                return "INSERT OR IGNORE INTO `WorkerQueueItem` (`uuid`,`uniqueWorkName`,`existingWorkPolicy`,`tags`,`time`,`state`,`work_spec_id`,`work_spec_state`,`work_spec_worker_class_name`,`work_spec_input_merger_class_name`,`work_spec_input`,`work_spec_output`,`work_spec_initial_delay`,`work_spec_interval_duration`,`work_spec_flex_duration`,`work_spec_run_attempt_count`,`work_spec_backoff_policy`,`work_spec_backoff_delay_duration`,`work_spec_last_enqueue_time`,`work_spec_minimum_retention_duration`,`work_spec_schedule_requested_at`,`work_spec_run_in_foreground`,`work_spec_out_of_quota_policy`,`work_spec_period_count`,`work_spec_generation`,`work_spec_next_schedule_time_override`,`work_spec_next_schedule_time_override_generation`,`work_spec_stop_reason`,`work_spec_trace_tag`,`work_spec_backoff_on_system_interruptions`,`work_spec_required_network_type`,`work_spec_required_network_request`,`work_spec_requires_charging`,`work_spec_requires_device_idle`,`work_spec_requires_battery_not_low`,`work_spec_requires_storage_not_low`,`work_spec_trigger_content_update_delay`,`work_spec_trigger_max_content_delay`,`work_spec_content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `WorkerQueueItem` (`uuid`,`uniqueWorkName`,`existingWorkPolicy`,`tags`,`time`,`state`,`work_spec_id`,`work_spec_state`,`work_spec_worker_class_name`,`work_spec_input_merger_class_name`,`work_spec_input`,`work_spec_output`,`work_spec_initial_delay`,`work_spec_interval_duration`,`work_spec_flex_duration`,`work_spec_run_attempt_count`,`work_spec_backoff_policy`,`work_spec_backoff_delay_duration`,`work_spec_last_enqueue_time`,`work_spec_minimum_retention_duration`,`work_spec_schedule_requested_at`,`work_spec_run_in_foreground`,`work_spec_out_of_quota_policy`,`work_spec_period_count`,`work_spec_generation`,`work_spec_next_schedule_time_override`,`work_spec_next_schedule_time_override_generation`,`work_spec_stop_reason`,`work_spec_trace_tag`,`work_spec_backoff_on_system_interruptions`,`work_spec_required_network_type`,`work_spec_required_network_request`,`work_spec_requires_charging`,`work_spec_requires_device_idle`,`work_spec_requires_battery_not_low`,`work_spec_requires_storage_not_low`,`work_spec_trigger_content_update_delay`,`work_spec_trigger_max_content_delay`,`work_spec_content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}

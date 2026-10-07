package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ezj extends ha6 {
    public final /* synthetic */ int a;

    @Override // defpackage.ha6
    public final void a(vxe vxeVar, Object obj) {
        switch (this.a) {
            case 0:
                dzj dzjVar = (dzj) obj;
                vxeVar.B(1, dzjVar.b());
                d25 d25Var = d25.b;
                vxeVar.d(2, f55.y(dzjVar.a()));
                break;
            case 1:
                mzj mzjVar = (mzj) obj;
                vxeVar.B(1, mzjVar.a);
                vxeVar.c(2, rx8.a0(mzjVar.b));
                vxeVar.B(3, mzjVar.c);
                vxeVar.B(4, mzjVar.d);
                d25 d25Var2 = d25.b;
                vxeVar.d(5, f55.y(mzjVar.e));
                vxeVar.d(6, f55.y(mzjVar.f));
                vxeVar.c(7, mzjVar.g);
                vxeVar.c(8, mzjVar.h);
                vxeVar.c(9, mzjVar.i);
                vxeVar.c(10, mzjVar.k);
                vxeVar.c(11, rx8.g(mzjVar.l));
                vxeVar.c(12, mzjVar.m);
                vxeVar.c(13, mzjVar.n);
                vxeVar.c(14, mzjVar.o);
                vxeVar.c(15, mzjVar.p);
                vxeVar.c(16, mzjVar.q ? 1L : 0L);
                vxeVar.c(17, rx8.W(mzjVar.r));
                vxeVar.c(18, mzjVar.s);
                vxeVar.c(19, mzjVar.t);
                vxeVar.c(20, mzjVar.u);
                vxeVar.c(21, mzjVar.v);
                vxeVar.c(22, mzjVar.w);
                String str = mzjVar.x;
                if (str == null) {
                    vxeVar.e(23);
                } else {
                    vxeVar.B(23, str);
                }
                Boolean bool = mzjVar.y;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    vxeVar.e(24);
                } else {
                    vxeVar.c(24, numValueOf.intValue());
                }
                kg4 kg4Var = mzjVar.j;
                vxeVar.c(25, rx8.T(kg4Var.a));
                vxeVar.d(26, rx8.A(kg4Var.b));
                vxeVar.c(27, kg4Var.c ? 1L : 0L);
                vxeVar.c(28, kg4Var.d ? 1L : 0L);
                vxeVar.c(29, kg4Var.e ? 1L : 0L);
                vxeVar.c(30, kg4Var.f ? 1L : 0L);
                vxeVar.c(31, kg4Var.g);
                vxeVar.c(32, kg4Var.h);
                vxeVar.d(33, rx8.Z(kg4Var.i));
                break;
            default:
                rzj rzjVar = (rzj) obj;
                vxeVar.B(1, rzjVar.a);
                vxeVar.B(2, rzjVar.b);
                break;
        }
    }

    @Override // defpackage.ha6
    public final String b() {
        switch (this.a) {
            case 0:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 1:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}

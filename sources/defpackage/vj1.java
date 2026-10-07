package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vj1 extends qyj {
    public final /* synthetic */ int e;

    public /* synthetic */ vj1(int i) {
        this.e = i;
    }

    @Override // defpackage.qyj
    public final void c(vxe vxeVar, Object obj) {
        switch (this.e) {
            case 0:
                dk1 dk1Var = (dk1) obj;
                vxeVar.c(1, dk1Var.i());
                vxeVar.B(2, dk1Var.a());
                String strB = dk1Var.b();
                if (strB == null) {
                    vxeVar.e(3);
                } else {
                    vxeVar.B(3, strB);
                }
                vxeVar.c(4, dk1Var.d());
                Long lK = dk1Var.k();
                if (lK == null) {
                    vxeVar.e(5);
                } else {
                    vxeVar.c(5, lK.longValue());
                }
                vxeVar.c(6, dk1Var.e());
                vxeVar.B(7, dk1Var.c());
                String strH = dk1Var.h();
                if (strH == null) {
                    vxeVar.e(8);
                } else {
                    vxeVar.B(8, strH);
                }
                String strJ = dk1Var.j();
                if (strJ == null) {
                    vxeVar.e(9);
                } else {
                    vxeVar.B(9, strJ);
                }
                vxeVar.c(10, dk1Var.l());
                Long lF = dk1Var.f();
                if (lF == null) {
                    vxeVar.e(11);
                } else {
                    vxeVar.c(11, lF.longValue());
                }
                Integer numG = dk1Var.g();
                if (numG == null) {
                    vxeVar.e(12);
                } else {
                    vxeVar.c(12, numG.intValue());
                }
                vxeVar.c(13, dk1Var.i());
                break;
            case 1:
                stc stcVar = (stc) obj;
                vxeVar.c(1, stcVar.e());
                vxeVar.c(2, stcVar.i());
                vxeVar.c(3, stcVar.b());
                vxeVar.B(4, stcVar.g());
                vxeVar.B(5, stcVar.h());
                vxeVar.c(6, stcVar.j());
                String strC = stcVar.c();
                if (strC == null) {
                    vxeVar.e(7);
                } else {
                    vxeVar.B(7, strC);
                }
                vxeVar.B(8, stcVar.d());
                String strF = stcVar.f();
                if (strF == null) {
                    vxeVar.e(9);
                } else {
                    vxeVar.B(9, strF);
                }
                String strA = stcVar.a();
                if (strA == null) {
                    vxeVar.e(10);
                } else {
                    vxeVar.B(10, strA);
                }
                vxeVar.c(11, qt4.D(stcVar.k()));
                vxeVar.c(12, stcVar.e());
                break;
            default:
                mzj mzjVar = (mzj) obj;
                String str = mzjVar.a;
                vxeVar.B(1, str);
                vxeVar.c(2, rx8.a0(mzjVar.b));
                vxeVar.B(3, mzjVar.c);
                vxeVar.B(4, mzjVar.d);
                d25 d25Var = d25.b;
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
                String str2 = mzjVar.x;
                if (str2 == null) {
                    vxeVar.e(23);
                } else {
                    vxeVar.B(23, str2);
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
                vxeVar.B(34, str);
                break;
        }
    }

    @Override // defpackage.qyj
    public final String s() {
        switch (this.e) {
            case 0:
                return "UPDATE `call_history` SET `history_id` = ?,`call_id` = ?,`call_name` = ?,`caller_id` = ?,`message_id` = ?,`chat_id` = ?,`call_type` = ?,`hangup_type` = ?,`join_link` = ?,`time` = ?,`duration_ms` = ?,`group_call_type` = ? WHERE `history_id` = ?";
            case 1:
                return "UPDATE OR ABORT `phones` SET `id` = ?,`phonebook_id` = ?,`contact_id` = ?,`phone` = ?,`phone_key` = ?,`server_phone` = ?,`email` = ?,`first_name` = ?,`last_name` = ?,`avatar_path` = ?,`type` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }
}

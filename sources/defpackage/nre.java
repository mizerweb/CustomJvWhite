package defpackage;

import java.net.InetAddress;
import java.util.ArrayList;
import one.me.sdk.arch.Widget;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nre implements cf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ nre(int i) {
        this.a = i;
    }

    private final Object a(Object obj) throws Exception {
        vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            vxeVarO0.c(1, 200L);
            int iE = qyj.E(vxeVarO0, "id");
            int iE2 = qyj.E(vxeVarO0, "state");
            int iE3 = qyj.E(vxeVarO0, "worker_class_name");
            int iE4 = qyj.E(vxeVarO0, "input_merger_class_name");
            int iE5 = qyj.E(vxeVarO0, "input");
            int iE6 = qyj.E(vxeVarO0, "output");
            int iE7 = qyj.E(vxeVarO0, "initial_delay");
            int iE8 = qyj.E(vxeVarO0, "interval_duration");
            int iE9 = qyj.E(vxeVarO0, "flex_duration");
            int iE10 = qyj.E(vxeVarO0, "run_attempt_count");
            int iE11 = qyj.E(vxeVarO0, "backoff_policy");
            int iE12 = qyj.E(vxeVarO0, "backoff_delay_duration");
            int iE13 = qyj.E(vxeVarO0, "last_enqueue_time");
            int iE14 = qyj.E(vxeVarO0, "minimum_retention_duration");
            int iE15 = qyj.E(vxeVarO0, "schedule_requested_at");
            int iE16 = qyj.E(vxeVarO0, "run_in_foreground");
            int iE17 = qyj.E(vxeVarO0, "out_of_quota_policy");
            int iE18 = qyj.E(vxeVarO0, "period_count");
            int iE19 = qyj.E(vxeVarO0, "generation");
            int iE20 = qyj.E(vxeVarO0, "next_schedule_time_override");
            int iE21 = qyj.E(vxeVarO0, "next_schedule_time_override_generation");
            int iE22 = qyj.E(vxeVarO0, "stop_reason");
            int iE23 = qyj.E(vxeVarO0, "trace_tag");
            int iE24 = qyj.E(vxeVarO0, "backoff_on_system_interruptions");
            int iE25 = qyj.E(vxeVarO0, "required_network_type");
            int iE26 = qyj.E(vxeVarO0, "required_network_request");
            int iE27 = qyj.E(vxeVarO0, "requires_charging");
            int iE28 = qyj.E(vxeVarO0, "requires_device_idle");
            int iE29 = qyj.E(vxeVarO0, "requires_battery_not_low");
            int iE30 = qyj.E(vxeVarO0, "requires_storage_not_low");
            int iE31 = qyj.E(vxeVarO0, "trigger_content_update_delay");
            int iE32 = qyj.E(vxeVarO0, "trigger_max_content_delay");
            int iE33 = qyj.E(vxeVarO0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (vxeVarO0.M0()) {
                String strB0 = vxeVarO0.B0(iE);
                int i = iE13;
                int i2 = iE14;
                kyj kyjVarN = rx8.N((int) vxeVarO0.getLong(iE2));
                String strB1 = vxeVarO0.B0(iE3);
                String strB2 = vxeVarO0.B0(iE4);
                byte[] blob = vxeVarO0.getBlob(iE5);
                d25 d25Var = d25.b;
                d25 d25VarI = f55.i(blob);
                d25 d25VarI2 = f55.i(vxeVarO0.getBlob(iE6));
                long j = vxeVarO0.getLong(iE7);
                long j2 = vxeVarO0.getLong(iE8);
                long j3 = vxeVarO0.getLong(iE9);
                int i3 = (int) vxeVarO0.getLong(iE10);
                int i4 = iE;
                int i5 = iE2;
                rn0 rn0VarK = rx8.K((int) vxeVarO0.getLong(iE11));
                long j4 = vxeVarO0.getLong(iE12);
                long j5 = vxeVarO0.getLong(i);
                long j6 = vxeVarO0.getLong(i2);
                int i6 = iE15;
                long j7 = vxeVarO0.getLong(i6);
                iE15 = i6;
                int i7 = iE16;
                int i8 = iE3;
                boolean z = ((int) vxeVarO0.getLong(i7)) != 0;
                int i9 = iE17;
                int i10 = iE4;
                yic yicVarM = rx8.M((int) vxeVarO0.getLong(i9));
                int i11 = iE18;
                int i12 = (int) vxeVarO0.getLong(i11);
                int i13 = iE19;
                int i14 = (int) vxeVarO0.getLong(i13);
                int i15 = iE20;
                long j8 = vxeVarO0.getLong(i15);
                int i16 = iE21;
                int i17 = (int) vxeVarO0.getLong(i16);
                iE21 = i16;
                iE22 = iE22;
                int i18 = (int) vxeVarO0.getLong(iE22);
                int i19 = iE23;
                Boolean boolValueOf = null;
                String strB3 = vxeVarO0.isNull(i19) ? null : vxeVarO0.B0(i19);
                int i20 = iE24;
                Integer numValueOf = vxeVarO0.isNull(i20) ? null : Integer.valueOf((int) vxeVarO0.getLong(i20));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i21 = iE25;
                int iL = rx8.L((int) vxeVarO0.getLong(i21));
                int i22 = iE26;
                adb adbVarK0 = rx8.k0(vxeVarO0.getBlob(i22));
                int i23 = iE27;
                boolean z2 = ((int) vxeVarO0.getLong(i23)) != 0;
                int i24 = iE28;
                boolean z3 = ((int) vxeVarO0.getLong(i24)) != 0;
                int i25 = iE29;
                boolean z4 = ((int) vxeVarO0.getLong(i25)) != 0;
                iE29 = i25;
                int i26 = iE30;
                int i27 = iE31;
                int i28 = iE32;
                iE31 = i27;
                int i29 = iE33;
                arrayList.add(new mzj(strB0, kyjVarN, strB1, strB2, d25VarI, d25VarI2, j, j2, j3, new kg4(adbVarK0, iL, z2, z3, z4, ((int) vxeVarO0.getLong(i26)) != 0, vxeVarO0.getLong(i27), vxeVarO0.getLong(i28), rx8.k(vxeVarO0.getBlob(i29))), i3, rn0VarK, j4, j5, j6, j7, z, yicVarM, i12, i14, j8, i17, i18, strB3, bool));
                iE28 = i24;
                iE4 = i10;
                iE17 = i9;
                iE18 = i11;
                iE19 = i13;
                iE20 = i15;
                iE23 = i19;
                iE24 = i20;
                iE25 = i21;
                iE26 = i22;
                iE27 = i23;
                iE33 = i29;
                iE32 = i28;
                iE30 = i26;
                iE = i4;
                iE3 = i8;
                iE13 = i;
                iE14 = i2;
                iE2 = i5;
                iE16 = i7;
            }
            return arrayList;
        } finally {
            vxeVarO0.close();
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        boolean z = false;
        switch (this.a) {
            case 0:
                throw new jib();
            case 1:
                return Integer.valueOf(i4e.b.d(2147418112) + 65536);
            case 2:
                return ((Iterable) obj).iterator();
            case 3:
                return obj;
            case 4:
                return ((ohf) obj).iterator();
            case 5:
                return Boolean.valueOf(obj == null);
            case 6:
                rv8 rv8Var = (rv8) obj;
                aw8 aw8VarL = qe7.l(rv8Var, new aw8[0]);
                if (aw8VarL == null) {
                    aw8VarL = uhd.b(rv8Var);
                }
                if (aw8VarL == null) {
                    if (!((qr3) rv8Var).d().isInterface()) {
                        return null;
                    }
                    aw8VarL = new uad(rv8Var);
                }
                return aw8VarL;
            case 7:
                rv8 rv8Var2 = (rv8) obj;
                aw8 aw8VarL2 = qe7.l(rv8Var2, new aw8[0]);
                if (aw8VarL2 == null) {
                    aw8VarL2 = uhd.b(rv8Var2);
                }
                if (aw8VarL2 == null) {
                    aw8VarL2 = ((qr3) rv8Var2).d().isInterface() ? new uad(rv8Var2) : null;
                }
                if (aw8VarL2 != null) {
                    return lvb.o0(aw8VarL2);
                }
                return null;
            case 8:
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM story_drafts");
                try {
                    int iE = qyj.E(vxeVarO0, "draft_id");
                    int iE2 = qyj.E(vxeVarO0, "media_path");
                    int iE3 = qyj.E(vxeVarO0, "preview_path");
                    int iE4 = qyj.E(vxeVarO0, "type");
                    int iE5 = qyj.E(vxeVarO0, "expiration_ms");
                    int iE6 = qyj.E(vxeVarO0, "settings");
                    int iE7 = qyj.E(vxeVarO0, "canvas_width");
                    int iE8 = qyj.E(vxeVarO0, "canvas_height");
                    int iE9 = qyj.E(vxeVarO0, "created_at");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        arrayList.add(new swg(vxeVarO0.getLong(iE), vxeVarO0.B0(iE2), vxeVarO0.isNull(iE3) ? null : vxeVarO0.B0(iE3), ghb.t((int) vxeVarO0.getLong(iE4)), vxeVarO0.getLong(iE5), (int) vxeVarO0.getLong(iE6), (int) vxeVarO0.getLong(iE7), (int) vxeVarO0.getLong(iE8), vxeVarO0.getLong(iE9)));
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO0.close();
                }
            case 9:
                return Integer.valueOf(((kbc) obj).getIcon().e);
            case 10:
                return Integer.valueOf(((kbc) obj).b().e);
            case 11:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO1.M0()) {
                        arrayList2.add(vxeVarO1.B0(0));
                    }
                    vxeVarO1.close();
                    return arrayList2;
                } catch (Throwable th) {
                    vxeVarO1.close();
                    throw th;
                }
            case 12:
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO2 = qxeVar.O0("UPDATE tasks SET status = ?, fails_count = fails_count + 1 WHERE status = ?");
                try {
                    vxeVarO2.c(1, 20L);
                    vxeVarO2.c(2, 10L);
                    vxeVarO2.M0();
                    return Integer.valueOf(e9i.e0(qxeVar));
                } finally {
                    vxeVarO2.close();
                }
            case 13:
                vxe vxeVarO3 = ((qxe) obj).O0("SELECT id FROM tasks WHERE status = ? OR status = ?");
                try {
                    vxeVarO3.c(1, 0L);
                    vxeVarO3.c(2, 20L);
                    ArrayList arrayList3 = new ArrayList();
                    while (vxeVarO3.M0()) {
                        arrayList3.add(Long.valueOf(vxeVarO3.getLong(0)));
                    }
                    vxeVarO3.close();
                    return arrayList3;
                } catch (Throwable th2) {
                    vxeVarO3.close();
                    throw th2;
                }
            case 14:
                return "  " + ((InetAddress) obj);
            case 15:
                return Boolean.valueOf(((vxe) obj).M0());
            case 16:
                vxe vxeVar = (vxe) obj;
                gof gofVar = new gof();
                while (vxeVar.M0()) {
                    gofVar.add(Integer.valueOf((int) vxeVar.getLong(0)));
                }
                return p90.e(gofVar);
            case 17:
                return Widget.findWidgetByScopeId$lambda$4((hve) obj);
            case 18:
                vxe vxeVarO4 = ((qxe) obj).O0("DELETE FROM WorkProgress");
                try {
                    vxeVarO4.M0();
                    return sbi.a;
                } finally {
                    vxeVarO4.close();
                }
            case 19:
                vxe vxeVarO5 = ((qxe) obj).O0("SELECT * FROM workspec WHERE state=1");
                try {
                    int iE10 = qyj.E(vxeVarO5, "id");
                    int iE11 = qyj.E(vxeVarO5, "state");
                    int iE12 = qyj.E(vxeVarO5, "worker_class_name");
                    int iE13 = qyj.E(vxeVarO5, "input_merger_class_name");
                    int iE14 = qyj.E(vxeVarO5, "input");
                    int iE15 = qyj.E(vxeVarO5, "output");
                    int iE16 = qyj.E(vxeVarO5, "initial_delay");
                    int iE17 = qyj.E(vxeVarO5, "interval_duration");
                    int iE18 = qyj.E(vxeVarO5, "flex_duration");
                    int iE19 = qyj.E(vxeVarO5, "run_attempt_count");
                    int iE20 = qyj.E(vxeVarO5, "backoff_policy");
                    int iE21 = qyj.E(vxeVarO5, "backoff_delay_duration");
                    int iE22 = qyj.E(vxeVarO5, "last_enqueue_time");
                    int iE23 = qyj.E(vxeVarO5, "minimum_retention_duration");
                    int iE24 = qyj.E(vxeVarO5, "schedule_requested_at");
                    int iE25 = qyj.E(vxeVarO5, "run_in_foreground");
                    int iE26 = qyj.E(vxeVarO5, "out_of_quota_policy");
                    int iE27 = qyj.E(vxeVarO5, "period_count");
                    int iE28 = qyj.E(vxeVarO5, "generation");
                    int iE29 = qyj.E(vxeVarO5, "next_schedule_time_override");
                    int iE30 = qyj.E(vxeVarO5, "next_schedule_time_override_generation");
                    int iE31 = qyj.E(vxeVarO5, "stop_reason");
                    int iE32 = qyj.E(vxeVarO5, "trace_tag");
                    int iE33 = qyj.E(vxeVarO5, "backoff_on_system_interruptions");
                    int iE34 = qyj.E(vxeVarO5, "required_network_type");
                    int iE35 = qyj.E(vxeVarO5, "required_network_request");
                    int iE36 = qyj.E(vxeVarO5, "requires_charging");
                    int iE37 = qyj.E(vxeVarO5, "requires_device_idle");
                    int iE38 = qyj.E(vxeVarO5, "requires_battery_not_low");
                    int iE39 = qyj.E(vxeVarO5, "requires_storage_not_low");
                    int iE40 = qyj.E(vxeVarO5, "trigger_content_update_delay");
                    int iE41 = qyj.E(vxeVarO5, "trigger_max_content_delay");
                    int iE42 = qyj.E(vxeVarO5, "content_uri_triggers");
                    ArrayList arrayList4 = new ArrayList();
                    while (vxeVarO5.M0()) {
                        String strB0 = vxeVarO5.B0(iE10);
                        int i = iE23;
                        int i2 = iE22;
                        kyj kyjVarN = rx8.N((int) vxeVarO5.getLong(iE11));
                        String strB1 = vxeVarO5.B0(iE12);
                        String strB2 = vxeVarO5.B0(iE13);
                        byte[] blob = vxeVarO5.getBlob(iE14);
                        d25 d25Var = d25.b;
                        d25 d25VarI = f55.i(blob);
                        d25 d25VarI2 = f55.i(vxeVarO5.getBlob(iE15));
                        long j = vxeVarO5.getLong(iE16);
                        long j2 = vxeVarO5.getLong(iE17);
                        long j3 = vxeVarO5.getLong(iE18);
                        int i3 = (int) vxeVarO5.getLong(iE19);
                        int i4 = iE14;
                        int i5 = iE13;
                        rn0 rn0VarK = rx8.K((int) vxeVarO5.getLong(iE20));
                        long j4 = vxeVarO5.getLong(iE21);
                        long j5 = vxeVarO5.getLong(i2);
                        long j6 = vxeVarO5.getLong(i);
                        int i6 = iE24;
                        long j7 = vxeVarO5.getLong(i6);
                        iE24 = i6;
                        int i7 = iE25;
                        int i8 = iE12;
                        boolean z2 = ((int) vxeVarO5.getLong(i7)) != 0;
                        int i9 = iE26;
                        int i10 = iE11;
                        yic yicVarM = rx8.M((int) vxeVarO5.getLong(i9));
                        int i11 = iE27;
                        int i12 = (int) vxeVarO5.getLong(i11);
                        int i13 = iE28;
                        int i14 = (int) vxeVarO5.getLong(i13);
                        int i15 = iE29;
                        long j8 = vxeVarO5.getLong(i15);
                        int i16 = iE30;
                        int i17 = (int) vxeVarO5.getLong(i16);
                        iE30 = i16;
                        iE31 = iE31;
                        int i18 = (int) vxeVarO5.getLong(iE31);
                        iE32 = iE32;
                        String strB3 = vxeVarO5.isNull(iE32) ? null : vxeVarO5.B0(iE32);
                        int i19 = iE33;
                        Integer numValueOf = vxeVarO5.isNull(i19) ? null : Integer.valueOf((int) vxeVarO5.getLong(i19));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i20 = iE34;
                        int iL = rx8.L((int) vxeVarO5.getLong(i20));
                        int i21 = iE35;
                        adb adbVarK0 = rx8.k0(vxeVarO5.getBlob(i21));
                        int i22 = iE36;
                        boolean z3 = ((int) vxeVarO5.getLong(i22)) != 0;
                        int i23 = iE37;
                        boolean z4 = ((int) vxeVarO5.getLong(i23)) != 0;
                        int i24 = iE38;
                        boolean z5 = ((int) vxeVarO5.getLong(i24)) != 0;
                        iE38 = i24;
                        int i25 = iE39;
                        int i26 = iE40;
                        int i27 = iE41;
                        iE40 = i26;
                        int i28 = iE42;
                        arrayList4.add(new mzj(strB0, kyjVarN, strB1, strB2, d25VarI, d25VarI2, j, j2, j3, new kg4(adbVarK0, iL, z3, z4, z5, ((int) vxeVarO5.getLong(i25)) != 0, vxeVarO5.getLong(i26), vxeVarO5.getLong(i27), rx8.k(vxeVarO5.getBlob(i28))), i3, rn0VarK, j4, j5, j6, j7, z2, yicVarM, i12, i14, j8, i17, i18, strB3, boolValueOf));
                        iE37 = i23;
                        iE11 = i10;
                        iE26 = i9;
                        iE27 = i11;
                        iE28 = i13;
                        iE29 = i15;
                        iE33 = i19;
                        iE34 = i20;
                        iE35 = i21;
                        iE36 = i22;
                        iE42 = i28;
                        iE41 = i27;
                        iE39 = i25;
                        iE13 = i5;
                        iE22 = i2;
                        iE23 = i;
                        iE14 = i4;
                        iE12 = i8;
                        iE25 = i7;
                        break;
                    }
                    return arrayList4;
                } finally {
                    vxeVarO5.close();
                }
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                vxe vxeVarO6 = ((qxe) obj).O0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int iE43 = qyj.E(vxeVarO6, "id");
                    int iE44 = qyj.E(vxeVarO6, "state");
                    int iE45 = qyj.E(vxeVarO6, "worker_class_name");
                    int iE46 = qyj.E(vxeVarO6, "input_merger_class_name");
                    int iE47 = qyj.E(vxeVarO6, "input");
                    int iE48 = qyj.E(vxeVarO6, "output");
                    int iE49 = qyj.E(vxeVarO6, "initial_delay");
                    int iE50 = qyj.E(vxeVarO6, "interval_duration");
                    int iE51 = qyj.E(vxeVarO6, "flex_duration");
                    int iE52 = qyj.E(vxeVarO6, "run_attempt_count");
                    int iE53 = qyj.E(vxeVarO6, "backoff_policy");
                    int iE54 = qyj.E(vxeVarO6, "backoff_delay_duration");
                    int iE55 = qyj.E(vxeVarO6, "last_enqueue_time");
                    int iE56 = qyj.E(vxeVarO6, "minimum_retention_duration");
                    int iE57 = qyj.E(vxeVarO6, "schedule_requested_at");
                    int iE58 = qyj.E(vxeVarO6, "run_in_foreground");
                    int iE59 = qyj.E(vxeVarO6, "out_of_quota_policy");
                    int iE60 = qyj.E(vxeVarO6, "period_count");
                    int iE61 = qyj.E(vxeVarO6, "generation");
                    int iE62 = qyj.E(vxeVarO6, "next_schedule_time_override");
                    int iE63 = qyj.E(vxeVarO6, "next_schedule_time_override_generation");
                    int iE64 = qyj.E(vxeVarO6, "stop_reason");
                    int iE65 = qyj.E(vxeVarO6, "trace_tag");
                    int iE66 = qyj.E(vxeVarO6, "backoff_on_system_interruptions");
                    int iE67 = qyj.E(vxeVarO6, "required_network_type");
                    int iE68 = qyj.E(vxeVarO6, "required_network_request");
                    int iE69 = qyj.E(vxeVarO6, "requires_charging");
                    int iE70 = qyj.E(vxeVarO6, "requires_device_idle");
                    int iE71 = qyj.E(vxeVarO6, "requires_battery_not_low");
                    int iE72 = qyj.E(vxeVarO6, "requires_storage_not_low");
                    int iE73 = qyj.E(vxeVarO6, "trigger_content_update_delay");
                    int iE74 = qyj.E(vxeVarO6, "trigger_max_content_delay");
                    int iE75 = qyj.E(vxeVarO6, "content_uri_triggers");
                    ArrayList arrayList5 = new ArrayList();
                    while (vxeVarO6.M0()) {
                        String strB4 = vxeVarO6.B0(iE43);
                        int i29 = iE56;
                        int i30 = iE55;
                        kyj kyjVarN2 = rx8.N((int) vxeVarO6.getLong(iE44));
                        String strB5 = vxeVarO6.B0(iE45);
                        String strB6 = vxeVarO6.B0(iE46);
                        byte[] blob2 = vxeVarO6.getBlob(iE47);
                        d25 d25Var2 = d25.b;
                        d25 d25VarI3 = f55.i(blob2);
                        d25 d25VarI4 = f55.i(vxeVarO6.getBlob(iE48));
                        long j9 = vxeVarO6.getLong(iE49);
                        long j10 = vxeVarO6.getLong(iE50);
                        long j11 = vxeVarO6.getLong(iE51);
                        int i31 = (int) vxeVarO6.getLong(iE52);
                        int i32 = iE47;
                        int i33 = iE46;
                        rn0 rn0VarK2 = rx8.K((int) vxeVarO6.getLong(iE53));
                        long j12 = vxeVarO6.getLong(iE54);
                        long j13 = vxeVarO6.getLong(i30);
                        long j14 = vxeVarO6.getLong(i29);
                        int i34 = iE57;
                        long j15 = vxeVarO6.getLong(i34);
                        int i35 = iE45;
                        int i36 = iE58;
                        boolean z6 = ((int) vxeVarO6.getLong(i36)) != 0;
                        int i37 = iE44;
                        int i38 = iE59;
                        yic yicVarM2 = rx8.M((int) vxeVarO6.getLong(i38));
                        iE59 = i38;
                        int i39 = iE60;
                        int i40 = (int) vxeVarO6.getLong(i39);
                        iE60 = i39;
                        int i41 = iE61;
                        int i42 = (int) vxeVarO6.getLong(i41);
                        int i43 = iE62;
                        long j16 = vxeVarO6.getLong(i43);
                        int i44 = iE63;
                        int i45 = (int) vxeVarO6.getLong(i44);
                        iE63 = i44;
                        iE64 = iE64;
                        int i46 = (int) vxeVarO6.getLong(iE64);
                        iE65 = iE65;
                        String strB7 = vxeVarO6.isNull(iE65) ? null : vxeVarO6.B0(iE65);
                        int i47 = iE66;
                        Integer numValueOf2 = vxeVarO6.isNull(i47) ? null : Integer.valueOf((int) vxeVarO6.getLong(i47));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i48 = iE67;
                        int iL2 = rx8.L((int) vxeVarO6.getLong(i48));
                        int i49 = iE68;
                        adb adbVarK1 = rx8.k0(vxeVarO6.getBlob(i49));
                        int i50 = iE69;
                        boolean z7 = ((int) vxeVarO6.getLong(i50)) != 0;
                        int i51 = iE70;
                        boolean z8 = ((int) vxeVarO6.getLong(i51)) != 0;
                        int i52 = iE71;
                        boolean z9 = ((int) vxeVarO6.getLong(i52)) != 0;
                        iE71 = i52;
                        int i53 = iE72;
                        int i54 = iE73;
                        int i55 = iE74;
                        iE73 = i54;
                        int i56 = iE75;
                        arrayList5.add(new mzj(strB4, kyjVarN2, strB5, strB6, d25VarI3, d25VarI4, j9, j10, j11, new kg4(adbVarK1, iL2, z7, z8, z9, ((int) vxeVarO6.getLong(i53)) != 0, vxeVarO6.getLong(i54), vxeVarO6.getLong(i55), rx8.k(vxeVarO6.getBlob(i56))), i31, rn0VarK2, j12, j13, j14, j15, z6, yicVarM2, i40, i42, j16, i45, i46, strB7, boolValueOf2));
                        iE44 = i37;
                        iE58 = i36;
                        iE61 = i41;
                        iE62 = i43;
                        iE66 = i47;
                        iE67 = i48;
                        iE68 = i49;
                        iE69 = i50;
                        iE70 = i51;
                        iE75 = i56;
                        iE74 = i55;
                        iE72 = i53;
                        iE56 = i29;
                        iE46 = i33;
                        iE47 = i32;
                        iE45 = i35;
                        iE57 = i34;
                        iE55 = i30;
                        break;
                    }
                    return arrayList5;
                } finally {
                    vxeVarO6.close();
                }
            case 21:
                vxe vxeVarO7 = ((qxe) obj).O0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (vxeVarO7.M0() && ((int) vxeVarO7.getLong(0)) != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } finally {
                    vxeVarO7.close();
                }
            case 22:
                return a(obj);
            default:
                qxe qxeVar2 = (qxe) obj;
                vxe vxeVarO8 = qxeVar2.O0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    vxeVarO8.M0();
                    return Integer.valueOf(e9i.e0(qxeVar2));
                } finally {
                    vxeVarO8.close();
                }
        }
    }

    public /* synthetic */ nre(int i, Object obj) {
        this.a = i;
    }
}

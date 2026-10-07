package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rh5 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ rh5(String str, int i) {
        this.a = i;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01a6  */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        Long lValueOf;
        mzj mzjVar;
        kyj kyjVarN;
        int iE0;
        int i = this.a;
        sbi sbiVar = sbi.a;
        String str = this.b;
        switch (i) {
            case 0:
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    vxeVarO0.B(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        arrayList.add(vxeVarO0.B0(0));
                    }
                    vxeVarO0.close();
                    return arrayList;
                } catch (Throwable th) {
                    vxeVarO0.close();
                    throw th;
                }
            case 1:
                rx8.c0(qv1.k("watchdog-", str), new x1c((Runnable) obj, 0));
                return sbiVar;
            case 2:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT long_value FROM Preference where `key`=?");
                try {
                    vxeVarO1.B(1, str);
                    if (vxeVarO1.M0() && !vxeVarO1.isNull(0)) {
                        lValueOf = Long.valueOf(vxeVarO1.getLong(0));
                        break;
                    } else {
                        lValueOf = null;
                    }
                    return lValueOf;
                } finally {
                    vxeVarO1.close();
                }
            case 3:
                vxe vxeVarO2 = ((qxe) obj).O0("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    vxeVarO2.B(1, str);
                    vxeVarO2.M0();
                    return sbiVar;
                } finally {
                    vxeVarO2.close();
                }
            case 4:
                vxe vxeVarO3 = ((qxe) obj).O0("DELETE from WorkProgress where work_spec_id=?");
                try {
                    vxeVarO3.B(1, str);
                    vxeVarO3.M0();
                    return sbiVar;
                } finally {
                    vxeVarO3.close();
                }
            case 5:
                vxe vxeVarO4 = ((qxe) obj).O0("SELECT * FROM workspec WHERE id=?");
                try {
                    vxeVarO4.B(1, str);
                    int iE = qyj.E(vxeVarO4, "id");
                    int iE2 = qyj.E(vxeVarO4, "state");
                    int iE3 = qyj.E(vxeVarO4, "worker_class_name");
                    int iE4 = qyj.E(vxeVarO4, "input_merger_class_name");
                    int iE5 = qyj.E(vxeVarO4, "input");
                    int iE6 = qyj.E(vxeVarO4, "output");
                    int iE7 = qyj.E(vxeVarO4, "initial_delay");
                    int iE8 = qyj.E(vxeVarO4, "interval_duration");
                    int iE9 = qyj.E(vxeVarO4, "flex_duration");
                    int iE10 = qyj.E(vxeVarO4, "run_attempt_count");
                    int iE11 = qyj.E(vxeVarO4, "backoff_policy");
                    int iE12 = qyj.E(vxeVarO4, "backoff_delay_duration");
                    int iE13 = qyj.E(vxeVarO4, "last_enqueue_time");
                    int iE14 = qyj.E(vxeVarO4, "minimum_retention_duration");
                    int iE15 = qyj.E(vxeVarO4, "schedule_requested_at");
                    int iE16 = qyj.E(vxeVarO4, "run_in_foreground");
                    int iE17 = qyj.E(vxeVarO4, "out_of_quota_policy");
                    int iE18 = qyj.E(vxeVarO4, "period_count");
                    int iE19 = qyj.E(vxeVarO4, "generation");
                    int iE20 = qyj.E(vxeVarO4, "next_schedule_time_override");
                    int iE21 = qyj.E(vxeVarO4, "next_schedule_time_override_generation");
                    int iE22 = qyj.E(vxeVarO4, "stop_reason");
                    int iE23 = qyj.E(vxeVarO4, "trace_tag");
                    int iE24 = qyj.E(vxeVarO4, "backoff_on_system_interruptions");
                    int iE25 = qyj.E(vxeVarO4, "required_network_type");
                    int iE26 = qyj.E(vxeVarO4, "required_network_request");
                    int iE27 = qyj.E(vxeVarO4, "requires_charging");
                    int iE28 = qyj.E(vxeVarO4, "requires_device_idle");
                    int iE29 = qyj.E(vxeVarO4, "requires_battery_not_low");
                    int iE30 = qyj.E(vxeVarO4, "requires_storage_not_low");
                    int iE31 = qyj.E(vxeVarO4, "trigger_content_update_delay");
                    int iE32 = qyj.E(vxeVarO4, "trigger_max_content_delay");
                    int iE33 = qyj.E(vxeVarO4, "content_uri_triggers");
                    if (vxeVarO4.M0()) {
                        String strB0 = vxeVarO4.B0(iE);
                        kyj kyjVarN2 = rx8.N((int) vxeVarO4.getLong(iE2));
                        String strB1 = vxeVarO4.B0(iE3);
                        String strB2 = vxeVarO4.B0(iE4);
                        byte[] blob = vxeVarO4.getBlob(iE5);
                        d25 d25Var = d25.b;
                        d25 d25VarI = f55.i(blob);
                        d25 d25VarI2 = f55.i(vxeVarO4.getBlob(iE6));
                        long j = vxeVarO4.getLong(iE7);
                        long j2 = vxeVarO4.getLong(iE8);
                        long j3 = vxeVarO4.getLong(iE9);
                        int i2 = (int) vxeVarO4.getLong(iE10);
                        rn0 rn0VarK = rx8.K((int) vxeVarO4.getLong(iE11));
                        long j4 = vxeVarO4.getLong(iE12);
                        long j5 = vxeVarO4.getLong(iE13);
                        long j6 = vxeVarO4.getLong(iE14);
                        long j7 = vxeVarO4.getLong(iE15);
                        boolean z = ((int) vxeVarO4.getLong(iE16)) != 0;
                        yic yicVarM = rx8.M((int) vxeVarO4.getLong(iE17));
                        int i3 = (int) vxeVarO4.getLong(iE18);
                        int i4 = (int) vxeVarO4.getLong(iE19);
                        long j8 = vxeVarO4.getLong(iE20);
                        int i5 = (int) vxeVarO4.getLong(iE21);
                        int i6 = (int) vxeVarO4.getLong(iE22);
                        String strB3 = vxeVarO4.isNull(iE23) ? null : vxeVarO4.B0(iE23);
                        Integer numValueOf = vxeVarO4.isNull(iE24) ? null : Integer.valueOf((int) vxeVarO4.getLong(iE24));
                        mzjVar = new mzj(strB0, kyjVarN2, strB1, strB2, d25VarI, d25VarI2, j, j2, j3, new kg4(rx8.k0(vxeVarO4.getBlob(iE26)), rx8.L((int) vxeVarO4.getLong(iE25)), ((int) vxeVarO4.getLong(iE27)) != 0, ((int) vxeVarO4.getLong(iE28)) != 0, ((int) vxeVarO4.getLong(iE29)) != 0, ((int) vxeVarO4.getLong(iE30)) != 0, vxeVarO4.getLong(iE31), vxeVarO4.getLong(iE32), rx8.k(vxeVarO4.getBlob(iE33))), i2, rn0VarK, j4, j5, j6, j7, z, yicVarM, i3, i4, j8, i5, i6, strB3, numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null);
                    } else {
                        mzjVar = null;
                    }
                    return mzjVar;
                } finally {
                    vxeVarO4.close();
                }
            case 6:
                vxe vxeVarO5 = ((qxe) obj).O0("SELECT state FROM workspec WHERE id=?");
                try {
                    vxeVarO5.B(1, str);
                    if (vxeVarO5.M0()) {
                        Integer numValueOf2 = vxeVarO5.isNull(0) ? null : Integer.valueOf((int) vxeVarO5.getLong(0));
                        if (numValueOf2 != null) {
                            kyjVarN = rx8.N(numValueOf2.intValue());
                        } else {
                            kyjVarN = null;
                        }
                        break;
                    } else {
                        kyjVarN = null;
                    }
                    return kyjVarN;
                } finally {
                    vxeVarO5.close();
                }
            case 7:
                vxe vxeVarO6 = ((qxe) obj).O0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    vxeVarO6.B(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO6.M0()) {
                        arrayList2.add(vxeVarO6.B0(0));
                    }
                    vxeVarO6.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    vxeVarO6.close();
                    throw th2;
                }
            case 8:
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO7 = qxeVar.O0("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    vxeVarO7.B(1, str);
                    vxeVarO7.M0();
                    iE0 = e9i.e0(qxeVar);
                } finally {
                    vxeVarO7.close();
                }
                break;
            case 9:
                vxe vxeVarO8 = ((qxe) obj).O0("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    vxeVarO8.B(1, str);
                    vxeVarO8.M0();
                    return sbiVar;
                } finally {
                    vxeVarO8.close();
                }
            case 10:
                vxe vxeVarO9 = ((qxe) obj).O0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    vxeVarO9.B(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (vxeVarO9.M0()) {
                        byte[] blob2 = vxeVarO9.getBlob(0);
                        d25 d25Var2 = d25.b;
                        arrayList3.add(f55.i(blob2));
                    }
                    vxeVarO9.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    vxeVarO9.close();
                    throw th3;
                }
            case 11:
                qxe qxeVar2 = (qxe) obj;
                vxe vxeVarO10 = qxeVar2.O0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    vxeVarO10.B(1, str);
                    vxeVarO10.M0();
                    iE0 = e9i.e0(qxeVar2);
                } finally {
                    vxeVarO10.close();
                }
                break;
            case 12:
                vxe vxeVarO11 = ((qxe) obj).O0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    vxeVarO11.B(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (vxeVarO11.M0()) {
                        arrayList4.add(vxeVarO11.B0(0));
                    }
                    vxeVarO11.close();
                    return arrayList4;
                } catch (Throwable th4) {
                    vxeVarO11.close();
                    throw th4;
                }
            case 13:
                vxe vxeVarO12 = ((qxe) obj).O0("DELETE FROM workspec WHERE id=?");
                try {
                    vxeVarO12.B(1, str);
                    vxeVarO12.M0();
                    return sbiVar;
                } finally {
                    vxeVarO12.close();
                }
            case 14:
                vxe vxeVarO13 = ((qxe) obj).O0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    vxeVarO13.B(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (vxeVarO13.M0()) {
                        String strB4 = vxeVarO13.B0(0);
                        kyj kyjVarN3 = rx8.N((int) vxeVarO13.getLong(1));
                        kzj kzjVar = new kzj();
                        kzjVar.a = strB4;
                        kzjVar.b = kyjVarN3;
                        arrayList5.add(kzjVar);
                    }
                    vxeVarO13.close();
                    return arrayList5;
                } catch (Throwable th5) {
                    vxeVarO13.close();
                    throw th5;
                }
            case 15:
                vxe vxeVarO14 = ((qxe) obj).O0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    vxeVarO14.B(1, str);
                    ArrayList arrayList6 = new ArrayList();
                    while (vxeVarO14.M0()) {
                        arrayList6.add(vxeVarO14.B0(0));
                    }
                    vxeVarO14.close();
                    return arrayList6;
                } catch (Throwable th6) {
                    vxeVarO14.close();
                    throw th6;
                }
            default:
                vxe vxeVarO15 = ((qxe) obj).O0("DELETE FROM worktag WHERE work_spec_id=?");
                try {
                    vxeVarO15.B(1, str);
                    vxeVarO15.M0();
                    return sbiVar;
                } finally {
                    vxeVarO15.close();
                }
        }
        return Integer.valueOf(iE0);
    }
}

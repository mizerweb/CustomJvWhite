package androidx.work.impl.model;

import androidx.work.impl.model.WorkersQueueDao_Impl;
import defpackage.aa;
import defpackage.adb;
import defpackage.aoj;
import defpackage.cf7;
import defpackage.ch3;
import defpackage.d25;
import defpackage.e9i;
import defpackage.en6;
import defpackage.f55;
import defpackage.ha6;
import defpackage.hu4;
import defpackage.k0k;
import defpackage.kg4;
import defpackage.kyj;
import defpackage.lq4;
import defpackage.m0k;
import defpackage.mzj;
import defpackage.n0k;
import defpackage.nbh;
import defpackage.o0k;
import defpackage.ore;
import defpackage.q4c;
import defpackage.qo1;
import defpackage.qxe;
import defpackage.qyj;
import defpackage.rn0;
import defpackage.rre;
import defpackage.rx8;
import defpackage.sbi;
import defpackage.ve6;
import defpackage.vxe;
import defpackage.vzj;
import defpackage.yic;
import defpackage.yn6;
import defpackage.z56;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0011J\u001d\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\u0017J%\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u0018\u0010%\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\bH\u0096@¢\u0006\u0004\b%\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,¨\u00060"}, d2 = {"Landroidx/work/impl/model/WorkersQueueDao_Impl;", "Landroidx/work/impl/model/WorkersQueueDao;", "Lrre;", "__db", "<init>", "(Lrre;)V", "Lve6;", "_value", "", "__ExistingWorkPolicy_enumToString", "(Lve6;)Ljava/lang/String;", "__ExistingWorkPolicy_stringToEnum", "(Ljava/lang/String;)Lve6;", "Lvzj;", DatabaseHelper.ITEM_COLUMN_NAME, "Lsbi;", "insertOrIgnore", "(Lvzj;)V", "insertOrReplace", "", "limit", "", "getItemsForRunning", "(I)Ljava/util/List;", "workerQueueItem", "insert", "ids", "", "contains", "(Ljava/util/List;)Z", "state", "count", "(I)I", "select", "(II)Ljava/util/List;", "updateState", "(ILjava/util/List;)V", "delete", "(Ljava/util/List;)V", "id", "(Ljava/lang/String;Llq4;)Ljava/lang/Object;", "Lrre;", "Lha6;", "__insertAdapterOfWorkerQueueItem", "Lha6;", "__insertAdapterOfWorkerQueueItem_1", "Companion", "n0k", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkersQueueDao_Impl implements WorkersQueueDao {
    public static final n0k Companion = new n0k();
    private final rre __db;
    private final ha6 __insertAdapterOfWorkerQueueItem = new m0k(0, this);
    private final ha6 __insertAdapterOfWorkerQueueItem_1 = new m0k(1, this);

    public WorkersQueueDao_Impl(rre rreVar) {
        this.__db = rreVar;
    }

    public final String __ExistingWorkPolicy_enumToString(ve6 _value) {
        int i = o0k.$EnumSwitchMapping$0[_value.ordinal()];
        if (i == 1) {
            return "REPLACE";
        }
        if (i == 2) {
            return "KEEP";
        }
        if (i == 3) {
            return "APPEND";
        }
        if (i == 4) {
            return "APPEND_OR_REPLACE";
        }
        ore.o();
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final ve6 __ExistingWorkPolicy_stringToEnum(String _value) {
        switch (_value.hashCode()) {
            case -1086924163:
                if (_value.equals("APPEND_OR_REPLACE")) {
                    return ve6.d;
                }
                break;
            case 2302853:
                if (_value.equals("KEEP")) {
                    return ve6.b;
                }
                break;
            case 1812479636:
                if (_value.equals("REPLACE")) {
                    return ve6.a;
                }
                break;
            case 1937228570:
                if (_value.equals("APPEND")) {
                    return ve6.c;
                }
                break;
        }
        ore.p("Can't convert value to enum, unknown value: ".concat(_value));
        return null;
    }

    public static final boolean contains$lambda$0(WorkersQueueDao_Impl workersQueueDao_Impl, List list, qxe qxeVar) {
        return super.contains(list);
    }

    public static final int count$lambda$0(String str, int i, qxe qxeVar) throws Exception {
        vxe vxeVarO0 = qxeVar.O0(str);
        try {
            vxeVarO0.c(1, i);
            return vxeVarO0.M0() ? (int) vxeVarO0.getLong(0) : 0;
        } finally {
            vxeVarO0.close();
        }
    }

    public static final sbi delete$lambda$0(String str, List list, qxe qxeVar) throws Exception {
        vxe vxeVarO0 = qxeVar.O0(str);
        try {
            Iterator it = list.iterator();
            int i = 1;
            while (it.hasNext()) {
                vxeVarO0.B(i, (String) it.next());
                i++;
            }
            vxeVarO0.M0();
            return sbi.a;
        } finally {
            vxeVarO0.close();
        }
    }

    public static final sbi delete$lambda$1(String str, String str2, qxe qxeVar) throws Exception {
        vxe vxeVarO0 = qxeVar.O0(str);
        try {
            vxeVarO0.B(1, str2);
            vxeVarO0.M0();
            return sbi.a;
        } finally {
            vxeVarO0.close();
        }
    }

    public static final List getItemsForRunning$lambda$0(WorkersQueueDao_Impl workersQueueDao_Impl, int i, qxe qxeVar) {
        return super.getItemsForRunning(i);
    }

    public static final sbi insert$lambda$0(WorkersQueueDao_Impl workersQueueDao_Impl, vzj vzjVar, qxe qxeVar) {
        super.insert(vzjVar);
        return sbi.a;
    }

    public static final sbi insertOrIgnore$lambda$0(WorkersQueueDao_Impl workersQueueDao_Impl, vzj vzjVar, qxe qxeVar) {
        workersQueueDao_Impl.__insertAdapterOfWorkerQueueItem.d(qxeVar, vzjVar);
        return sbi.a;
    }

    public static final sbi insertOrReplace$lambda$0(WorkersQueueDao_Impl workersQueueDao_Impl, vzj vzjVar, qxe qxeVar) {
        workersQueueDao_Impl.__insertAdapterOfWorkerQueueItem_1.d(qxeVar, vzjVar);
        return sbi.a;
    }

    public static final List select$lambda$0(String str, int i, WorkersQueueDao_Impl workersQueueDao_Impl, qxe qxeVar) throws Exception {
        vxe vxeVar;
        vxe vxeVarO0 = qxeVar.O0(str);
        try {
            vxeVarO0.c(1, i);
            int iE = qyj.E(vxeVarO0, "uuid");
            int iE2 = qyj.E(vxeVarO0, "uniqueWorkName");
            int iE3 = qyj.E(vxeVarO0, "existingWorkPolicy");
            int iE4 = qyj.E(vxeVarO0, "tags");
            int iE5 = qyj.E(vxeVarO0, "time");
            int iE6 = qyj.E(vxeVarO0, "state");
            int iE7 = qyj.E(vxeVarO0, "work_spec_id");
            int iE8 = qyj.E(vxeVarO0, "work_spec_state");
            int iE9 = qyj.E(vxeVarO0, "work_spec_worker_class_name");
            int iE10 = qyj.E(vxeVarO0, "work_spec_input_merger_class_name");
            int iE11 = qyj.E(vxeVarO0, "work_spec_input");
            int iE12 = qyj.E(vxeVarO0, "work_spec_output");
            int iE13 = qyj.E(vxeVarO0, "work_spec_initial_delay");
            int iE14 = qyj.E(vxeVarO0, "work_spec_interval_duration");
            int iE15 = qyj.E(vxeVarO0, "work_spec_flex_duration");
            int iE16 = qyj.E(vxeVarO0, "work_spec_run_attempt_count");
            int iE17 = qyj.E(vxeVarO0, "work_spec_backoff_policy");
            int iE18 = qyj.E(vxeVarO0, "work_spec_backoff_delay_duration");
            int iE19 = qyj.E(vxeVarO0, "work_spec_last_enqueue_time");
            int iE20 = qyj.E(vxeVarO0, "work_spec_minimum_retention_duration");
            int iE21 = qyj.E(vxeVarO0, "work_spec_schedule_requested_at");
            int iE22 = qyj.E(vxeVarO0, "work_spec_run_in_foreground");
            int iE23 = qyj.E(vxeVarO0, "work_spec_out_of_quota_policy");
            int iE24 = qyj.E(vxeVarO0, "work_spec_period_count");
            int iE25 = qyj.E(vxeVarO0, "work_spec_generation");
            int iE26 = qyj.E(vxeVarO0, "work_spec_next_schedule_time_override");
            int iE27 = qyj.E(vxeVarO0, "work_spec_next_schedule_time_override_generation");
            int iE28 = qyj.E(vxeVarO0, "work_spec_stop_reason");
            int iE29 = qyj.E(vxeVarO0, "work_spec_trace_tag");
            int iE30 = qyj.E(vxeVarO0, "work_spec_backoff_on_system_interruptions");
            int iE31 = qyj.E(vxeVarO0, "work_spec_required_network_type");
            int iE32 = qyj.E(vxeVarO0, "work_spec_required_network_request");
            int iE33 = qyj.E(vxeVarO0, "work_spec_requires_charging");
            int iE34 = qyj.E(vxeVarO0, "work_spec_requires_device_idle");
            int iE35 = qyj.E(vxeVarO0, "work_spec_requires_battery_not_low");
            int iE36 = qyj.E(vxeVarO0, "work_spec_requires_storage_not_low");
            int iE37 = qyj.E(vxeVarO0, "work_spec_trigger_content_update_delay");
            int iE38 = qyj.E(vxeVarO0, "work_spec_trigger_max_content_delay");
            int iE39 = qyj.E(vxeVarO0, "work_spec_content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (vxeVarO0.M0()) {
                String strB0 = vxeVarO0.B0(iE);
                String strB1 = vxeVarO0.B0(iE2);
                int i2 = iE;
                int i3 = iE2;
                ve6 ve6Var__ExistingWorkPolicy_stringToEnum = workersQueueDao_Impl.__ExistingWorkPolicy_stringToEnum(vxeVarO0.B0(iE3));
                HashSet hashSetX = e9i.X(vxeVarO0.B0(iE4));
                long j = vxeVarO0.getLong(iE5);
                int i4 = (int) vxeVarO0.getLong(iE6);
                String strB2 = vxeVarO0.B0(iE7);
                kyj kyjVarN = rx8.N((int) vxeVarO0.getLong(iE8));
                String strB3 = vxeVarO0.B0(iE9);
                String strB4 = vxeVarO0.B0(iE10);
                byte[] blob = vxeVarO0.getBlob(iE11);
                d25 d25Var = d25.b;
                d25 d25VarI = f55.i(blob);
                d25 d25VarI2 = f55.i(vxeVarO0.getBlob(iE12));
                long j2 = vxeVarO0.getLong(iE13);
                long j3 = vxeVarO0.getLong(iE14);
                int i5 = iE15;
                long j4 = vxeVarO0.getLong(i5);
                int i6 = iE16;
                int i7 = iE3;
                int i8 = iE4;
                int i9 = (int) vxeVarO0.getLong(i6);
                int i10 = iE17;
                rn0 rn0VarK = rx8.K((int) vxeVarO0.getLong(i10));
                int i11 = iE18;
                long j5 = vxeVarO0.getLong(i11);
                int i12 = iE19;
                long j6 = vxeVarO0.getLong(i12);
                iE18 = i11;
                int i13 = iE20;
                long j7 = vxeVarO0.getLong(i13);
                iE20 = i13;
                int i14 = iE21;
                long j8 = vxeVarO0.getLong(i14);
                iE21 = i14;
                iE19 = i12;
                int i15 = iE22;
                boolean z = ((int) vxeVarO0.getLong(i15)) != 0;
                int i16 = iE23;
                yic yicVarM = rx8.M((int) vxeVarO0.getLong(i16));
                int i17 = iE24;
                int i18 = (int) vxeVarO0.getLong(i17);
                int i19 = iE25;
                int i20 = (int) vxeVarO0.getLong(i19);
                int i21 = iE26;
                long j9 = vxeVarO0.getLong(i21);
                int i22 = iE27;
                int i23 = (int) vxeVarO0.getLong(i22);
                iE27 = i22;
                iE28 = iE28;
                int i24 = (int) vxeVarO0.getLong(iE28);
                int i25 = iE29;
                Boolean boolValueOf = null;
                String strB5 = vxeVarO0.isNull(i25) ? null : vxeVarO0.B0(i25);
                int i26 = iE30;
                Integer numValueOf = vxeVarO0.isNull(i26) ? null : Integer.valueOf((int) vxeVarO0.getLong(i26));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i27 = iE31;
                int iL = rx8.L((int) vxeVarO0.getLong(i27));
                int i28 = iE32;
                adb adbVarK0 = rx8.k0(vxeVarO0.getBlob(i28));
                int i29 = iE33;
                boolean z2 = ((int) vxeVarO0.getLong(i29)) != 0;
                int i30 = iE34;
                boolean z3 = ((int) vxeVarO0.getLong(i30)) != 0;
                int i31 = iE35;
                boolean z4 = ((int) vxeVarO0.getLong(i31)) != 0;
                iE35 = i31;
                int i32 = iE36;
                int i33 = iE37;
                int i34 = iE38;
                iE37 = i33;
                int i35 = iE39;
                vxeVar = vxeVarO0;
                try {
                    arrayList.add(new vzj(strB0, strB1, ve6Var__ExistingWorkPolicy_stringToEnum, new mzj(strB2, kyjVarN, strB3, strB4, d25VarI, d25VarI2, j2, j3, j4, new kg4(adbVarK0, iL, z2, z3, z4, ((int) vxeVarO0.getLong(i32)) != 0, vxeVarO0.getLong(i33), vxeVarO0.getLong(i34), rx8.k(vxeVarO0.getBlob(i35))), i9, rn0VarK, j5, j6, j7, j8, z, yicVarM, i18, i20, j9, i23, i24, strB5, bool), hashSetX, j, i4));
                    iE39 = i35;
                    iE38 = i34;
                    iE36 = i32;
                    vxeVarO0 = vxeVar;
                    iE23 = i16;
                    iE24 = i17;
                    iE25 = i19;
                    iE26 = i21;
                    iE29 = i25;
                    iE30 = i26;
                    iE31 = i27;
                    iE32 = i28;
                    iE33 = i29;
                    iE = i2;
                    iE2 = i3;
                    iE3 = i7;
                    iE34 = i30;
                    iE15 = i5;
                    iE17 = i10;
                    iE22 = i15;
                    iE4 = i8;
                    iE16 = i6;
                } catch (Throwable th) {
                    th = th;
                    vxeVar.close();
                    throw th;
                }
            }
            vxeVarO0.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            vxeVar = vxeVarO0;
        }
    }

    public static final List select$lambda$1(String str, int i, int i2, WorkersQueueDao_Impl workersQueueDao_Impl, qxe qxeVar) throws Exception {
        vxe vxeVar;
        vxe vxeVarO0 = qxeVar.O0(str);
        try {
            vxeVarO0.c(1, i);
            vxeVarO0.c(2, i2);
            int iE = qyj.E(vxeVarO0, "uuid");
            int iE2 = qyj.E(vxeVarO0, "uniqueWorkName");
            int iE3 = qyj.E(vxeVarO0, "existingWorkPolicy");
            int iE4 = qyj.E(vxeVarO0, "tags");
            int iE5 = qyj.E(vxeVarO0, "time");
            int iE6 = qyj.E(vxeVarO0, "state");
            int iE7 = qyj.E(vxeVarO0, "work_spec_id");
            int iE8 = qyj.E(vxeVarO0, "work_spec_state");
            int iE9 = qyj.E(vxeVarO0, "work_spec_worker_class_name");
            int iE10 = qyj.E(vxeVarO0, "work_spec_input_merger_class_name");
            int iE11 = qyj.E(vxeVarO0, "work_spec_input");
            int iE12 = qyj.E(vxeVarO0, "work_spec_output");
            int iE13 = qyj.E(vxeVarO0, "work_spec_initial_delay");
            int iE14 = qyj.E(vxeVarO0, "work_spec_interval_duration");
            int iE15 = qyj.E(vxeVarO0, "work_spec_flex_duration");
            int iE16 = qyj.E(vxeVarO0, "work_spec_run_attempt_count");
            int iE17 = qyj.E(vxeVarO0, "work_spec_backoff_policy");
            int iE18 = qyj.E(vxeVarO0, "work_spec_backoff_delay_duration");
            int iE19 = qyj.E(vxeVarO0, "work_spec_last_enqueue_time");
            int iE20 = qyj.E(vxeVarO0, "work_spec_minimum_retention_duration");
            int iE21 = qyj.E(vxeVarO0, "work_spec_schedule_requested_at");
            int iE22 = qyj.E(vxeVarO0, "work_spec_run_in_foreground");
            int iE23 = qyj.E(vxeVarO0, "work_spec_out_of_quota_policy");
            int iE24 = qyj.E(vxeVarO0, "work_spec_period_count");
            int iE25 = qyj.E(vxeVarO0, "work_spec_generation");
            int iE26 = qyj.E(vxeVarO0, "work_spec_next_schedule_time_override");
            int iE27 = qyj.E(vxeVarO0, "work_spec_next_schedule_time_override_generation");
            int iE28 = qyj.E(vxeVarO0, "work_spec_stop_reason");
            int iE29 = qyj.E(vxeVarO0, "work_spec_trace_tag");
            int iE30 = qyj.E(vxeVarO0, "work_spec_backoff_on_system_interruptions");
            int iE31 = qyj.E(vxeVarO0, "work_spec_required_network_type");
            int iE32 = qyj.E(vxeVarO0, "work_spec_required_network_request");
            int iE33 = qyj.E(vxeVarO0, "work_spec_requires_charging");
            int iE34 = qyj.E(vxeVarO0, "work_spec_requires_device_idle");
            int iE35 = qyj.E(vxeVarO0, "work_spec_requires_battery_not_low");
            int iE36 = qyj.E(vxeVarO0, "work_spec_requires_storage_not_low");
            int iE37 = qyj.E(vxeVarO0, "work_spec_trigger_content_update_delay");
            int iE38 = qyj.E(vxeVarO0, "work_spec_trigger_max_content_delay");
            int iE39 = qyj.E(vxeVarO0, "work_spec_content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (vxeVarO0.M0()) {
                String strB0 = vxeVarO0.B0(iE);
                String strB1 = vxeVarO0.B0(iE2);
                int i3 = iE;
                int i4 = iE2;
                ve6 ve6Var__ExistingWorkPolicy_stringToEnum = workersQueueDao_Impl.__ExistingWorkPolicy_stringToEnum(vxeVarO0.B0(iE3));
                HashSet hashSetX = e9i.X(vxeVarO0.B0(iE4));
                long j = vxeVarO0.getLong(iE5);
                int i5 = (int) vxeVarO0.getLong(iE6);
                String strB2 = vxeVarO0.B0(iE7);
                kyj kyjVarN = rx8.N((int) vxeVarO0.getLong(iE8));
                String strB3 = vxeVarO0.B0(iE9);
                String strB4 = vxeVarO0.B0(iE10);
                byte[] blob = vxeVarO0.getBlob(iE11);
                d25 d25Var = d25.b;
                d25 d25VarI = f55.i(blob);
                d25 d25VarI2 = f55.i(vxeVarO0.getBlob(iE12));
                long j2 = vxeVarO0.getLong(iE13);
                long j3 = vxeVarO0.getLong(iE14);
                int i6 = iE15;
                long j4 = vxeVarO0.getLong(i6);
                int i7 = iE16;
                int i8 = iE3;
                int i9 = iE4;
                int i10 = (int) vxeVarO0.getLong(i7);
                int i11 = iE17;
                rn0 rn0VarK = rx8.K((int) vxeVarO0.getLong(i11));
                int i12 = iE18;
                long j5 = vxeVarO0.getLong(i12);
                int i13 = iE19;
                long j6 = vxeVarO0.getLong(i13);
                iE18 = i12;
                int i14 = iE20;
                long j7 = vxeVarO0.getLong(i14);
                iE20 = i14;
                int i15 = iE21;
                long j8 = vxeVarO0.getLong(i15);
                iE21 = i15;
                iE19 = i13;
                int i16 = iE22;
                boolean z = ((int) vxeVarO0.getLong(i16)) != 0;
                int i17 = iE23;
                yic yicVarM = rx8.M((int) vxeVarO0.getLong(i17));
                int i18 = iE24;
                int i19 = (int) vxeVarO0.getLong(i18);
                int i20 = iE25;
                int i21 = (int) vxeVarO0.getLong(i20);
                int i22 = iE26;
                long j9 = vxeVarO0.getLong(i22);
                int i23 = iE27;
                int i24 = (int) vxeVarO0.getLong(i23);
                iE27 = i23;
                iE28 = iE28;
                int i25 = (int) vxeVarO0.getLong(iE28);
                int i26 = iE29;
                Boolean boolValueOf = null;
                String strB5 = vxeVarO0.isNull(i26) ? null : vxeVarO0.B0(i26);
                int i27 = iE30;
                Integer numValueOf = vxeVarO0.isNull(i27) ? null : Integer.valueOf((int) vxeVarO0.getLong(i27));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i28 = iE31;
                int iL = rx8.L((int) vxeVarO0.getLong(i28));
                int i29 = iE32;
                adb adbVarK0 = rx8.k0(vxeVarO0.getBlob(i29));
                int i30 = iE33;
                boolean z2 = ((int) vxeVarO0.getLong(i30)) != 0;
                int i31 = iE34;
                boolean z3 = ((int) vxeVarO0.getLong(i31)) != 0;
                int i32 = iE35;
                boolean z4 = ((int) vxeVarO0.getLong(i32)) != 0;
                iE35 = i32;
                int i33 = iE36;
                int i34 = iE37;
                int i35 = iE38;
                iE37 = i34;
                int i36 = iE39;
                vxeVar = vxeVarO0;
                try {
                    arrayList.add(new vzj(strB0, strB1, ve6Var__ExistingWorkPolicy_stringToEnum, new mzj(strB2, kyjVarN, strB3, strB4, d25VarI, d25VarI2, j2, j3, j4, new kg4(adbVarK0, iL, z2, z3, z4, ((int) vxeVarO0.getLong(i33)) != 0, vxeVarO0.getLong(i34), vxeVarO0.getLong(i35), rx8.k(vxeVarO0.getBlob(i36))), i10, rn0VarK, j5, j6, j7, j8, z, yicVarM, i19, i21, j9, i24, i25, strB5, bool), hashSetX, j, i5));
                    iE39 = i36;
                    iE38 = i35;
                    iE36 = i33;
                    vxeVarO0 = vxeVar;
                    iE23 = i17;
                    iE24 = i18;
                    iE25 = i20;
                    iE26 = i22;
                    iE29 = i26;
                    iE30 = i27;
                    iE31 = i28;
                    iE32 = i29;
                    iE33 = i30;
                    iE = i3;
                    iE2 = i4;
                    iE3 = i8;
                    iE15 = i6;
                    iE34 = i31;
                    iE17 = i11;
                    iE22 = i16;
                    iE4 = i9;
                    iE16 = i7;
                } catch (Throwable th) {
                    th = th;
                    vxeVar.close();
                    throw th;
                }
            }
            vxeVarO0.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            vxeVar = vxeVarO0;
        }
    }

    public static final sbi updateState$lambda$0(String str, int i, List list, qxe qxeVar) throws Exception {
        vxe vxeVarO0 = qxeVar.O0(str);
        try {
            vxeVarO0.c(1, i);
            Iterator it = list.iterator();
            int i2 = 2;
            while (it.hasNext()) {
                vxeVarO0.B(i2, (String) it.next());
                i2++;
            }
            vxeVarO0.M0();
            return sbi.a;
        } finally {
            vxeVarO0.close();
        }
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public boolean contains(List<String> ids) {
        return ((Boolean) ch3.G(this.__db, false, true, new aoj(this, 2, ids))).booleanValue();
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public int count(int state) {
        return ((Number) ch3.G(this.__db, true, false, new q4c(state, 2))).intValue();
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public void delete(List<String> ids) {
        ch3.G(this.__db, false, true, new yn6(7, nbh.x(")", nbh.C("DELETE FROM WorkerQueueItem WHERE uuid IN ("), ids), ids));
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public List<vzj> getItemsForRunning(int limit) {
        return (List) ch3.G(this.__db, false, true, new aa(this, limit, 3));
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public void insert(vzj workerQueueItem) {
        ch3.G(this.__db, false, true, new k0k(this, workerQueueItem, 0));
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public void insertOrIgnore(vzj vzjVar) {
        ch3.G(this.__db, false, true, new k0k(this, vzjVar, 1));
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public void insertOrReplace(vzj vzjVar) {
        ch3.G(this.__db, false, true, new k0k(this, vzjVar, 2));
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public List<vzj> select(int limit) {
        return (List) ch3.G(this.__db, true, false, new z56(limit, this));
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public void updateState(int state, List<String> ids) {
        ch3.G(this.__db, false, true, new en6(nbh.x(")", nbh.C("UPDATE WorkerQueueItem SET state = ? WHERE uuid IN ("), ids), state, ids, 2));
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public List<vzj> select(final int limit, final int state) {
        return (List) ch3.G(this.__db, true, false, new cf7() { // from class: l0k
            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                return WorkersQueueDao_Impl.select$lambda$1("SELECT * FROM WorkerQueueItem WHERE state = ? ORDER BY time ASC LIMIT ?", state, limit, this, (qxe) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public Object delete(String str, lq4 lq4Var) {
        Object objI = ch3.I(lq4Var, this.__db, false, true, new qo1(str, 21));
        return objI == hu4.a ? objI : sbi.a;
    }
}

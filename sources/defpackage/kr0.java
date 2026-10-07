package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.vk.push.common.Logger;
import com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource;
import com.vk.push.core.deviceid.contentprovider.DeviceIdUriMatcher;
import com.vk.push.core.filedatastore.flow.FlowableFileDataStoreImpl;
import com.vk.push.core.ipc.BaseIPCClient;
import defpackage.ch3;
import defpackage.hu4;
import defpackage.lq4;
import defpackage.nq4;
import defpackage.ore;
import defpackage.sbi;
import defpackage.yx6;
import defpackage.z45;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.rustore.sdk.metrics.MetricsException;
import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;

/* JADX INFO: loaded from: classes3.dex */
public final class kr0 extends ux8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kr0(Object obj, int i, Object obj2) {
        super(0);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.af7
    public final Object invoke() throws MetricsException.SaveMetricsEventError {
        switch (this.a) {
            case 0:
                return ((Logger) this.b).createLogger(((BaseIPCClient) this.c).getLogTag());
            case 1:
                return ((DeviceIdRemoteDataSource) this.b).a.getContentResolver().query((Uri) this.c, new String[]{DeviceIdUriMatcher.INSTANCE.getVirtualColumnName()}, null, null, null, null);
            case 2:
                pzf pzfVarB = e9i.b(1, 0, 6);
                gu4 gu4Var = (gu4) this.b;
                FlowableFileDataStoreImpl flowableFileDataStoreImpl = (FlowableFileDataStoreImpl) this.c;
                final gjg gjgVarC = pzfVarB.c();
                e9i.j0(new fz6(e9i.I(new xx6() { // from class: com.vk.push.core.filedatastore.flow.FlowableFileDataStoreImpl$valueFlow$2$invoke$lambda$1$$inlined$map$1

                    /* JADX INFO: renamed from: com.vk.push.core.filedatastore.flow.FlowableFileDataStoreImpl$valueFlow$2$invoke$lambda$1$$inlined$map$1$2, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", SdkMetricStatEvent.VALUE_KEY, "Lsbi;", "emit", "(Ljava/lang/Object;Llq4;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
                    public static final class AnonymousClass2<T> implements yx6 {
                        public final /* synthetic */ yx6 a;

                        /* JADX INFO: renamed from: com.vk.push.core.filedatastore.flow.FlowableFileDataStoreImpl$valueFlow$2$invoke$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                        @z45(c = "com.vk.push.core.filedatastore.flow.FlowableFileDataStoreImpl$valueFlow$2$invoke$lambda$1$$inlined$map$1$2", f = "FlowableFileDataStoreImpl.kt", l = {223}, m = "emit")
                        public static final class AnonymousClass1 extends nq4 {
                            public /* synthetic */ Object d;
                            public int e;

                            public AnonymousClass1(lq4 lq4Var) {
                                super(lq4Var);
                            }

                            @Override // defpackage.mq0
                            public final Object invokeSuspend(Object obj) {
                                this.d = obj;
                                this.e |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(yx6 yx6Var) {
                            this.a = yx6Var;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // defpackage.yx6
                        public final Object emit(Object obj, lq4 lq4Var) {
                            AnonymousClass1 anonymousClass1;
                            if (lq4Var instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) lq4Var;
                                int i = anonymousClass1.e;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.e = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(lq4Var);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(lq4Var);
                            }
                            Object obj2 = anonymousClass1.d;
                            int i2 = anonymousClass1.e;
                            if (i2 == 0) {
                                ch3.d0(obj2);
                                Boolean boolValueOf = Boolean.valueOf(((Number) obj).intValue() != 0);
                                anonymousClass1.e = 1;
                                Object objEmit = this.a.emit(boolValueOf, anonymousClass1);
                                hu4 hu4Var = hu4.a;
                                if (objEmit == hu4Var) {
                                    return hu4Var;
                                }
                            } else {
                                if (i2 != 1) {
                                    ore.k("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                ch3.d0(obj2);
                            }
                            return sbi.a;
                        }
                    }

                    @Override // defpackage.xx6
                    public Object collect(yx6 yx6Var, lq4 lq4Var) {
                        Object objCollect = gjgVarC.collect(new AnonymousClass2(yx6Var), lq4Var);
                        return objCollect == hu4.a ? objCollect : sbi.a;
                    }
                }), new q40(pzfVarB, flowableFileDataStoreImpl, (lq4) null), 3), gu4Var);
                return pzfVarB;
            case 3:
                return new File(((Context) this.b).getApplicationContext().getFilesDir(), cqk.M(cqk.M(".preferences_pb", (String) ((eoc) this.c).a), "datastore/"));
            case 4:
                SendMetricsEventJobService sendMetricsEventJobService = (SendMetricsEventJobService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                if (!sendMetricsEventJobService.c) {
                    sendMetricsEventJobService.jobFinished(jobParameters, false);
                }
                return sbi.a;
            case 5:
                ((g8g) ((d8g) this.b).b).a((r8g) this.c);
                return sbi.a;
            case 6:
                ((ptb) this.b).onComplete((Throwable) this.c);
                return sbi.a;
            case 7:
                ((t64) this.b).a.onComplete((Throwable) this.c);
                return sbi.a;
            case 8:
                return new pv5(lu6.q0(lu6.q0(((Context) this.b).getCacheDir(), "tracer-lite-".concat((String) this.c)), "drops.json"));
            case 9:
                return ((Logger) this.b).createLogger((ewe) this.c);
            default:
                ri riVar = (ri) this.b;
                if (!riVar.a) {
                    g8g g8gVar = new g8g(0, new qv(15, riVar));
                    ifh ifhVar = zn5.a;
                    synchronized (so2.h) {
                    }
                    new d8g(g8gVar, (vn5) zn5.b.getValue(), 1).a(new c8g(new tek(riVar, 4), new tek(riVar, 5)));
                    Context context = (Context) ((c4h) riVar.d).b;
                    JobScheduler jobScheduler = (JobScheduler) context.getSystemService(JobScheduler.class);
                    List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
                    if ((allPendingJobs instanceof Collection) && allPendingJobs.isEmpty()) {
                        JobInfo.Builder builder = new JobInfo.Builder(88123556, new ComponentName(context, (Class<?>) SendMetricsEventJobService.class));
                        ghb ghbVar = ew5.b;
                        jobScheduler.schedule(builder.setPeriodic(ew5.g(qe7.O(1440, lw5.MINUTES))).setPersisted(true).build());
                    } else {
                        Iterator<T> it = allPendingJobs.iterator();
                        do {
                            if (!it.hasNext()) {
                                JobInfo.Builder builder2 = new JobInfo.Builder(88123556, new ComponentName(context, (Class<?>) SendMetricsEventJobService.class));
                                ghb ghbVar2 = ew5.b;
                                jobScheduler.schedule(builder2.setPeriodic(ew5.g(qe7.O(1440, lw5.MINUTES))).setPersisted(true).build());
                            }
                        } while (((JobInfo) it.next()).getId() != 88123556);
                    }
                    riVar.a = true;
                }
                vog vogVar = (vog) riVar.c;
                uxa uxaVar = (uxa) this.c;
                rj5 rj5Var = (rj5) vogVar.a;
                String string = UUID.randomUUID().toString();
                byte[] bytes = iw8.i(uxaVar).getBytes(pt2.a);
                ifh ifhVar2 = ((r28) rj5Var.b).b;
                ContentValues contentValues = new ContentValues();
                contentValues.put("uuid", string);
                contentValues.put("metrics_event", bytes);
                try {
                    ((SQLiteDatabase) ifhVar2.getValue()).beginTransactionNonExclusive();
                    long jInsert = ((SQLiteDatabase) ifhVar2.getValue()).insert("metrics_event_table", null, contentValues);
                    ((SQLiteDatabase) ifhVar2.getValue()).setTransactionSuccessful();
                    ((SQLiteDatabase) ifhVar2.getValue()).endTransaction();
                    if (jInsert != -1) {
                        return sbi.a;
                    }
                    throw new MetricsException.SaveMetricsEventError("Saving error " + ((Object) ("MetricsEventUuid(value=" + string + ')')), null);
                } catch (Throwable th) {
                    try {
                        throw new MetricsException.MetricsDbError("Interaction with database failed", th);
                    } catch (Throwable th2) {
                        ((SQLiteDatabase) ifhVar2.getValue()).endTransaction();
                        throw th2;
                    }
                }
        }
    }
}

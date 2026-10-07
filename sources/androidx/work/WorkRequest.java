package androidx.work;

import defpackage.d25;
import defpackage.izj;
import defpackage.kg4;
import defpackage.kyj;
import defpackage.m89;
import defpackage.mzj;
import defpackage.ore;
import defpackage.r5h;
import defpackage.rn0;
import defpackage.ttl;
import defpackage.wm9;
import defpackage.ww3;
import defpackage.yic;
import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0013\b&\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068G¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/work/WorkRequest;", "", "Ljava/util/UUID;", "id", "Lmzj;", "workSpec", "", "", "tags", "<init>", "(Ljava/util/UUID;Lmzj;Ljava/util/Set;)V", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "Lmzj;", "getWorkSpec", "()Lmzj;", "Ljava/util/Set;", "getTags", "()Ljava/util/Set;", "getStringId", "()Ljava/lang/String;", "stringId", "Companion", "Builder", "izj", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class WorkRequest {
    public static final izj Companion = new izj();
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;
    public static final long MAX_BACKOFF_MILLIS = 18000000;
    private static final int MAX_TRACE_SPAN_LENGTH = 127;
    public static final long MIN_BACKOFF_MILLIS = 10000;
    private final UUID id;
    private final Set<String> tags;
    private final mzj workSpec;

    public WorkRequest(UUID uuid, mzj mzjVar, Set<String> set) {
        this.id = uuid;
        this.workSpec = mzjVar;
        this.tags = set;
    }

    public UUID getId() {
        return this.id;
    }

    public final String getStringId() {
        return getId().toString();
    }

    public final Set<String> getTags() {
        return this.tags;
    }

    public final mzj getWorkSpec() {
        return this.workSpec;
    }

    @Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0007\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0019\b\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0014\u0010\u0018J\u0015\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00028\u00002\u0006\u0010%\u001a\u00020!¢\u0006\u0004\b&\u0010$J\u001d\u0010'\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00028\u0000H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010'\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b'\u0010+J\u001f\u0010,\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010(J\u0017\u0010,\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b,\u0010+J\u0017\u0010/\u001a\u00028\u00002\u0006\u0010.\u001a\u00020-H\u0017¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00028\u0001¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u00028\u0001H ¢\u0006\u0004\b3\u00102J\u0017\u00107\u001a\u00028\u00002\u0006\u00106\u001a\u000205H\u0007¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00028\u00002\u0006\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00028\u00002\u0006\u0010=\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b>\u0010(J\u001f\u0010@\u001a\u00028\u00002\u0006\u0010?\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b@\u0010(R\"\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010CR\"\u0010E\u001a\u00020D8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010Q\u001a\u00020P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR \u0010X\u001a\b\u0012\u0004\u0012\u00020!0W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00028\u00008 X \u0004¢\u0006\u0006\u001a\u0004\b\\\u0010*¨\u0006^"}, d2 = {"Landroidx/work/WorkRequest$Builder;", "B", "Landroidx/work/WorkRequest;", "W", "", "Ljava/lang/Class;", "Lm89;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "Ljava/util/UUID;", "id", "setId", "(Ljava/util/UUID;)Landroidx/work/WorkRequest$Builder;", "Lrn0;", "backoffPolicy", "", "backoffDelay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "setBackoffCriteria", "(Lrn0;JLjava/util/concurrent/TimeUnit;)Landroidx/work/WorkRequest$Builder;", "Ljava/time/Duration;", "duration", "(Lrn0;Ljava/time/Duration;)Landroidx/work/WorkRequest$Builder;", "Lkg4;", "constraints", "setConstraints", "(Lkg4;)Landroidx/work/WorkRequest$Builder;", "Ld25;", "inputData", "setInputData", "(Ld25;)Landroidx/work/WorkRequest$Builder;", "", "tag", "addTag", "(Ljava/lang/String;)Landroidx/work/WorkRequest$Builder;", "traceTag", "setTraceTag", "keepResultsForAtLeast", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/WorkRequest$Builder;", "setBackoffForSystemInterruptions", "()Landroidx/work/WorkRequest$Builder;", "(Ljava/time/Duration;)Landroidx/work/WorkRequest$Builder;", "setInitialDelay", "Lyic;", "policy", "setExpedited", "(Lyic;)Landroidx/work/WorkRequest$Builder;", "build", "()Landroidx/work/WorkRequest;", "buildInternal$work_runtime_release", "buildInternal", "Lkyj;", "state", "setInitialState", "(Lkyj;)Landroidx/work/WorkRequest$Builder;", "", "runAttemptCount", "setInitialRunAttemptCount", "(I)Landroidx/work/WorkRequest$Builder;", "lastEnqueueTime", "setLastEnqueueTime", "scheduleRequestedAt", "setScheduleRequestedAt", "Ljava/lang/Class;", "getWorkerClass$work_runtime_release", "()Ljava/lang/Class;", "", "backoffCriteriaSet", "Z", "getBackoffCriteriaSet$work_runtime_release", "()Z", "setBackoffCriteriaSet$work_runtime_release", "(Z)V", "Ljava/util/UUID;", "getId$work_runtime_release", "()Ljava/util/UUID;", "setId$work_runtime_release", "(Ljava/util/UUID;)V", "Lmzj;", "workSpec", "Lmzj;", "getWorkSpec$work_runtime_release", "()Lmzj;", "setWorkSpec$work_runtime_release", "(Lmzj;)V", "", "tags", "Ljava/util/Set;", "getTags$work_runtime_release", "()Ljava/util/Set;", "getThisObject$work_runtime_release", "thisObject", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Builder<B extends Builder<B, ?>, W extends WorkRequest> {
        private boolean backoffCriteriaSet;
        private UUID id = UUID.randomUUID();
        private final Set<String> tags;
        private mzj workSpec;
        private final Class<? extends m89> workerClass;

        public Builder(Class<? extends m89> cls) {
            this.workerClass = cls;
            this.workSpec = new mzj(this.id.toString(), (kyj) null, cls.getName(), (String) null, (d25) null, (d25) null, 0L, 0L, 0L, (kg4) null, 0, (rn0) null, 0L, 0L, 0L, 0L, false, (yic) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
            String[] strArr = {cls.getName()};
            LinkedHashSet linkedHashSet = new LinkedHashSet(wm9.P0(1));
            kotlin.collections.a.l1(strArr, linkedHashSet);
            this.tags = linkedHashSet;
        }

        public final B addTag(String tag) {
            this.tags.add(tag);
            return (B) getThisObject$work_runtime_release();
        }

        public final W build() {
            W w = (W) buildInternal$work_runtime_release();
            kg4 kg4Var = this.workSpec.j;
            boolean z = !kg4Var.i.isEmpty() || kg4Var.e || kg4Var.c || kg4Var.d;
            mzj mzjVar = this.workSpec;
            if (mzjVar.q) {
                if (z) {
                    ore.p("Expedited jobs only support network and storage constraints");
                    return null;
                }
                if (mzjVar.g > 0) {
                    ore.p("Expedited jobs cannot be delayed");
                    return null;
                }
            }
            String str = mzjVar.x;
            if (str == null) {
                izj izjVar = WorkRequest.Companion;
                String str2 = mzjVar.c;
                izjVar.getClass();
                List listM1 = r5h.m1(str2, new String[]{"."}, 6);
                String strU1 = listM1.size() == 1 ? (String) listM1.get(0) : (String) ww3.B1(listM1);
                if (strU1.length() > WorkRequest.MAX_TRACE_SPAN_LENGTH) {
                    strU1 = r5h.u1(WorkRequest.MAX_TRACE_SPAN_LENGTH, strU1);
                }
                mzjVar.x = strU1;
            } else if (str.length() > WorkRequest.MAX_TRACE_SPAN_LENGTH) {
                this.workSpec.x = r5h.u1(WorkRequest.MAX_TRACE_SPAN_LENGTH, str);
            }
            setId(UUID.randomUUID());
            return w;
        }

        public abstract W buildInternal$work_runtime_release();

        /* JADX INFO: renamed from: getBackoffCriteriaSet$work_runtime_release, reason: from getter */
        public final boolean getBackoffCriteriaSet() {
            return this.backoffCriteriaSet;
        }

        /* JADX INFO: renamed from: getId$work_runtime_release, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        public final Set<String> getTags$work_runtime_release() {
            return this.tags;
        }

        public abstract B getThisObject$work_runtime_release();

        /* JADX INFO: renamed from: getWorkSpec$work_runtime_release, reason: from getter */
        public final mzj getWorkSpec() {
            return this.workSpec;
        }

        public final Class<? extends m89> getWorkerClass$work_runtime_release() {
            return this.workerClass;
        }

        public final B keepResultsForAtLeast(long duration, TimeUnit timeUnit) {
            this.workSpec.o = timeUnit.toMillis(duration);
            return (B) getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(rn0 backoffPolicy, long backoffDelay, TimeUnit timeUnit) {
            this.backoffCriteriaSet = true;
            mzj mzjVar = this.workSpec;
            mzjVar.l = backoffPolicy;
            mzjVar.d(timeUnit.toMillis(backoffDelay));
            return (B) getThisObject$work_runtime_release();
        }

        public final void setBackoffCriteriaSet$work_runtime_release(boolean z) {
            this.backoffCriteriaSet = z;
        }

        public final B setBackoffForSystemInterruptions() {
            this.workSpec.y = Boolean.TRUE;
            return (B) getThisObject$work_runtime_release();
        }

        public final B setConstraints(kg4 constraints) {
            this.workSpec.j = constraints;
            return (B) getThisObject$work_runtime_release();
        }

        public B setExpedited(yic policy) {
            mzj mzjVar = this.workSpec;
            mzjVar.q = true;
            mzjVar.r = policy;
            return (B) getThisObject$work_runtime_release();
        }

        public final B setId(UUID id) {
            this.id = id;
            String string = id.toString();
            mzj mzjVar = this.workSpec;
            this.workSpec = new mzj(string, mzjVar.b, mzjVar.c, mzjVar.d, new d25(mzjVar.e), new d25(mzjVar.f), mzjVar.g, mzjVar.h, mzjVar.i, new kg4(mzjVar.j), mzjVar.k, mzjVar.l, mzjVar.m, mzjVar.n, mzjVar.o, mzjVar.p, mzjVar.q, mzjVar.r, mzjVar.s, mzjVar.u, mzjVar.v, mzjVar.w, mzjVar.x, mzjVar.y, 524288);
            return (B) getThisObject$work_runtime_release();
        }

        public final void setId$work_runtime_release(UUID uuid) {
            this.id = uuid;
        }

        public B setInitialDelay(long duration, TimeUnit timeUnit) {
            this.workSpec.g = timeUnit.toMillis(duration);
            if (BuildConfig.MAX_TIME_TO_UPLOAD - System.currentTimeMillis() > this.workSpec.g) {
                return (B) getThisObject$work_runtime_release();
            }
            ore.p("The given initial delay is too large and will cause an overflow!");
            return null;
        }

        public final B setInitialRunAttemptCount(int runAttemptCount) {
            this.workSpec.k = runAttemptCount;
            return (B) getThisObject$work_runtime_release();
        }

        public final B setInitialState(kyj state) {
            this.workSpec.b = state;
            return (B) getThisObject$work_runtime_release();
        }

        public final B setInputData(d25 inputData) {
            this.workSpec.e = inputData;
            return (B) getThisObject$work_runtime_release();
        }

        public final B setLastEnqueueTime(long lastEnqueueTime, TimeUnit timeUnit) {
            this.workSpec.n = timeUnit.toMillis(lastEnqueueTime);
            return (B) getThisObject$work_runtime_release();
        }

        public final B setScheduleRequestedAt(long scheduleRequestedAt, TimeUnit timeUnit) {
            this.workSpec.p = timeUnit.toMillis(scheduleRequestedAt);
            return (B) getThisObject$work_runtime_release();
        }

        public final B setTraceTag(String traceTag) {
            this.workSpec.x = traceTag;
            return (B) getThisObject$work_runtime_release();
        }

        public final void setWorkSpec$work_runtime_release(mzj mzjVar) {
            this.workSpec = mzjVar;
        }

        public final B keepResultsForAtLeast(Duration duration) {
            this.workSpec.o = ttl.c(duration);
            return (B) getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(rn0 backoffPolicy, Duration duration) {
            this.backoffCriteriaSet = true;
            mzj mzjVar = this.workSpec;
            mzjVar.l = backoffPolicy;
            mzjVar.d(ttl.c(duration));
            return (B) getThisObject$work_runtime_release();
        }

        public B setInitialDelay(Duration duration) {
            this.workSpec.g = ttl.c(duration);
            if (BuildConfig.MAX_TIME_TO_UPLOAD - System.currentTimeMillis() > this.workSpec.g) {
                return (B) getThisObject$work_runtime_release();
            }
            ore.p("The given initial delay is too large and will cause an overflow!");
            return null;
        }
    }
}

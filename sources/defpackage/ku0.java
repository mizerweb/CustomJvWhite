package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJR\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b+\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b,\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010)\u001a\u0004\b-\u0010\u0015R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010.\u001a\u0004\b/\u0010\u000fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u00100\u001a\u0004\b1\u0010\u001dR\u0011\u00103\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001d¨\u00064"}, d2 = {"Lku0;", "", "", "startRealtime", "startUptime", "lastRealtime", "lastUptime", "", "visibilityTimes", "", "isStartedInForeground", "<init>", "(JJJJLjava/util/List;Z)V", "Lf7k;", "a", "()Ljava/util/List;", "Lylc;", "Lew5;", "k", "()Lylc;", "l", "()J", "j", "b", DatabaseHelper.COMPRESSED_COLUMN_NAME, "d", "e", "f", "g", "()Z", "h", "(JJJJLjava/util/List;Z)Lku0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "o", "p", "m", "n", "Ljava/util/List;", "q", "Z", "s", "r", "isEmpty", "batterylib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ku0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long startRealtime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long startUptime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long lastRealtime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long lastUptime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final List visibilityTimes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean isStartedInForeground;

    public /* synthetic */ ku0(long j, long j2, long j3, long j4, List list, boolean z, int i, j95 j95Var) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4, (i & 16) != 0 ? r66.a : list, (i & 32) != 0 ? true : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ku0 i(ku0 ku0Var, long j, long j2, long j3, long j4, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ku0Var.startRealtime;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = ku0Var.startUptime;
        }
        return ku0Var.h(j5, j2, (i & 4) != 0 ? ku0Var.lastRealtime : j3, (i & 8) != 0 ? ku0Var.lastUptime : j4, (i & 16) != 0 ? ku0Var.visibilityTimes : list, (i & 32) != 0 ? ku0Var.isStartedInForeground : z);
    }

    public final List<f7k> a() {
        ArrayList arrayList = new ArrayList();
        boolean z = this.isStartedInForeground;
        long j = this.startRealtime;
        Iterator it = this.visibilityTimes.iterator();
        boolean z2 = z;
        long j2 = j;
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            arrayList.add(new f7k(j2, jLongValue, z2));
            z2 = !z2;
            j2 = jLongValue + 1;
        }
        arrayList.add(new f7k(j2, this.lastRealtime, z2));
        return arrayList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getStartRealtime() {
        return this.startRealtime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getStartUptime() {
        return this.startUptime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getLastRealtime() {
        return this.lastRealtime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getLastUptime() {
        return this.lastUptime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ku0)) {
            return false;
        }
        ku0 ku0Var = (ku0) other;
        return this.startRealtime == ku0Var.startRealtime && this.startUptime == ku0Var.startUptime && this.lastRealtime == ku0Var.lastRealtime && this.lastUptime == ku0Var.lastUptime && cqk.d(this.visibilityTimes, ku0Var.visibilityTimes) && this.isStartedInForeground == ku0Var.isStartedInForeground;
    }

    public final List<Long> f() {
        return this.visibilityTimes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsStartedInForeground() {
        return this.isStartedInForeground;
    }

    public final ku0 h(long startRealtime, long startUptime, long lastRealtime, long lastUptime, List<Long> visibilityTimes, boolean isStartedInForeground) {
        return new ku0(startRealtime, startUptime, lastRealtime, lastUptime, visibilityTimes, isStartedInForeground);
    }

    public int hashCode() {
        return Boolean.hashCode(this.isStartedInForeground) + qv1.c(ml9.a(ml9.a(ml9.a(Long.hashCode(this.startRealtime) * 31, this.startUptime), this.lastRealtime), this.lastUptime), 31, this.visibilityTimes);
    }

    public final long j() {
        ghb ghbVar = ew5.b;
        return qe7.P((this.lastRealtime - this.startRealtime) - (this.lastUptime - this.startUptime), lw5.MILLISECONDS);
    }

    public final ylc k() {
        boolean zIsEmpty = this.visibilityTimes.isEmpty();
        lw5 lw5Var = lw5.MILLISECONDS;
        long j = 0;
        if (zIsEmpty) {
            long j2 = this.lastRealtime - this.startRealtime;
            if (this.isStartedInForeground) {
                ghb ghbVar = ew5.b;
                return new ylc(new ew5(qe7.P(j2, lw5Var)), new ew5(j));
            }
            ghb ghbVar2 = ew5.b;
            return new ylc(new ew5(j), new ew5(qe7.P(j2, lw5Var)));
        }
        boolean z = this.isStartedInForeground;
        long j3 = this.startRealtime;
        Iterator it = this.visibilityTimes.iterator();
        long j4 = j3;
        long j5 = 0;
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            long j6 = jLongValue - j4;
            if (z) {
                j5 += j6;
            } else {
                j += j6;
            }
            z = !z;
            j4 = jLongValue;
        }
        long j7 = this.lastRealtime - j4;
        if (z) {
            j5 += j7;
        } else {
            j += j7;
        }
        ghb ghbVar3 = ew5.b;
        return new ylc(new ew5(qe7.P(j5, lw5Var)), new ew5(qe7.P(j, lw5Var)));
    }

    public final long l() {
        ghb ghbVar = ew5.b;
        return qe7.P(this.lastRealtime - this.startRealtime, lw5.MILLISECONDS);
    }

    public final long m() {
        return this.lastRealtime;
    }

    public final long n() {
        return this.lastUptime;
    }

    public final long o() {
        return this.startRealtime;
    }

    public final long p() {
        return this.startUptime;
    }

    public final List<Long> q() {
        return this.visibilityTimes;
    }

    public final boolean r() {
        return this.startRealtime == 0 && this.startUptime == 0 && this.lastRealtime == 0 && this.lastUptime == 0 && this.visibilityTimes.isEmpty();
    }

    public final boolean s() {
        return this.isStartedInForeground;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BatteryClockDump(startRealtime=");
        sb.append(this.startRealtime);
        sb.append(", startUptime=");
        sb.append(this.startUptime);
        sb.append(", lastRealtime=");
        sb.append(this.lastRealtime);
        sb.append(", lastUptime=");
        sb.append(this.lastUptime);
        sb.append(", visibilityTimes=");
        sb.append(this.visibilityTimes);
        sb.append(", isStartedInForeground=");
        return c0a.p(sb, this.isStartedInForeground, ')');
    }

    public ku0(long j, long j2, long j3, long j4, List<Long> list, boolean z) {
        this.startRealtime = j;
        this.startUptime = j2;
        this.lastRealtime = j3;
        this.lastUptime = j4;
        this.visibilityTimes = list;
        this.isStartedInForeground = z;
    }

    public ku0() {
        this(0L, 0L, 0L, 0L, null, false, 63, null);
    }
}

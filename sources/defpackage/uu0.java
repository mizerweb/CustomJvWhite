package defpackage;

import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJj\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b*\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b+\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b,\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b.\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b/\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010-\u001a\u0004\b0\u0010\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b2\u0010\u001aR\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u00101\u001a\u0004\b3\u0010\u001a¨\u00064"}, d2 = {"Luu0;", "", "Lew5;", "estimatedRealtime", "cachedTime", "fgTime", "bgTime", "", "clkTck", "fgScore", "bgScore", "Lxu0;", "fgDiff", "bgDiff", "<init>", "(JJJJDDDLxu0;Lxu0;Lj95;)V", "a", "()J", "b", DatabaseHelper.COMPRESSED_COLUMN_NAME, "d", "e", "()D", "f", "g", "h", "()Lxu0;", "i", "j", "(JJJJDDDLxu0;Lxu0;)Luu0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "q", "o", "t", "n", "D", "p", "s", "m", "Lxu0;", "r", "l", "batterylib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class uu0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long estimatedRealtime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long cachedTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long fgTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long bgTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final double clkTck;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final double fgScore;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final double bgScore;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final xu0 fgDiff;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final xu0 bgDiff;

    public uu0(long j, long j2, long j3, long j4, double d, double d2, double d3, xu0 xu0Var, xu0 xu0Var2, j95 j95Var) {
        this.estimatedRealtime = j;
        this.cachedTime = j2;
        this.fgTime = j3;
        this.bgTime = j4;
        this.clkTck = d;
        this.fgScore = d2;
        this.bgScore = d3;
        this.fgDiff = xu0Var;
        this.bgDiff = xu0Var2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getEstimatedRealtime() {
        return this.estimatedRealtime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCachedTime() {
        return this.cachedTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getFgTime() {
        return this.fgTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getBgTime() {
        return this.bgTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final double getClkTck() {
        return this.clkTck;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof uu0)) {
            return false;
        }
        uu0 uu0Var = (uu0) other;
        return ew5.f(this.estimatedRealtime, uu0Var.estimatedRealtime) && ew5.f(this.cachedTime, uu0Var.cachedTime) && ew5.f(this.fgTime, uu0Var.fgTime) && ew5.f(this.bgTime, uu0Var.bgTime) && Double.compare(this.clkTck, uu0Var.clkTck) == 0 && Double.compare(this.fgScore, uu0Var.fgScore) == 0 && Double.compare(this.bgScore, uu0Var.bgScore) == 0 && cqk.d(this.fgDiff, uu0Var.fgDiff) && cqk.d(this.bgDiff, uu0Var.bgDiff);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getFgScore() {
        return this.fgScore;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getBgScore() {
        return this.bgScore;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final xu0 getFgDiff() {
        return this.fgDiff;
    }

    public int hashCode() {
        long j = this.estimatedRealtime;
        ghb ghbVar = ew5.b;
        return this.bgDiff.hashCode() + ((this.fgDiff.hashCode() + ((Double.hashCode(this.bgScore) + ((Double.hashCode(this.fgScore) + ((Double.hashCode(this.clkTck) + qt4.g(qt4.g(qt4.g(Long.hashCode(j) * 31, 31, this.cachedTime), 31, this.fgTime), 31, this.bgTime)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final xu0 getBgDiff() {
        return this.bgDiff;
    }

    public final uu0 j(long estimatedRealtime, long cachedTime, long fgTime, long bgTime, double clkTck, double fgScore, double bgScore, xu0 fgDiff, xu0 bgDiff) {
        return new uu0(estimatedRealtime, cachedTime, fgTime, bgTime, clkTck, fgScore, bgScore, fgDiff, bgDiff, null);
    }

    public final xu0 l() {
        return this.bgDiff;
    }

    public final double m() {
        return this.bgScore;
    }

    public final long n() {
        return this.bgTime;
    }

    public final long o() {
        return this.cachedTime;
    }

    public final double p() {
        return this.clkTck;
    }

    public final long q() {
        return this.estimatedRealtime;
    }

    public final xu0 r() {
        return this.fgDiff;
    }

    public final double s() {
        return this.fgScore;
    }

    public final long t() {
        return this.fgTime;
    }

    public String toString() {
        return "BatteryMetricReport(estimatedRealtime=" + ((Object) ew5.t(this.estimatedRealtime)) + ", cachedTime=" + ((Object) ew5.t(this.cachedTime)) + ", fgTime=" + ((Object) ew5.t(this.fgTime)) + ", bgTime=" + ((Object) ew5.t(this.bgTime)) + ", clkTck=" + this.clkTck + ", fgScore=" + this.fgScore + ", bgScore=" + this.bgScore + ", fgDiff=" + this.fgDiff + ", bgDiff=" + this.bgDiff + ')';
    }
}

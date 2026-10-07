package com.vk.push.core.backoff;

import com.vk.push.core.utils.RandomUtils;
import defpackage.j95;
import defpackage.nbh;
import defpackage.ore;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/vk/push/core/backoff/ExponentialBackOff;", "Lcom/vk/push/core/backoff/BackOff;", "", "getNextBackOff", "()J", "Lsbi;", "resetBackOff", "()V", "Builder", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ExponentialBackOff implements BackOff {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final double e;
    public long f;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/vk/push/core/backoff/ExponentialBackOff$Builder;", "", "<init>", "()V", "", "backOff", "initialBackOff", "(J)Lcom/vk/push/core/backoff/ExponentialBackOff$Builder;", "maxBackOff", "deviation", "standardDeviation", "averageDeviation", "", "factor", "scaleFactor", "(D)Lcom/vk/push/core/backoff/ExponentialBackOff$Builder;", "Lcom/vk/push/core/backoff/BackOff;", "build", "()Lcom/vk/push/core/backoff/BackOff;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        public long a = 100;
        public long b = 600000;
        public long c = 100;
        public long d = 1000;
        public double e = 2.0d;

        public final Builder averageDeviation(long deviation) {
            if (deviation >= 0) {
                this.d = deviation;
                return this;
            }
            ore.c(nbh.s(deviation, "average deviation should be positive: ", " <= 0"));
            return null;
        }

        public final BackOff build() {
            return new ExponentialBackOff(this.a, this.b, this.c, this.d, this.e, null);
        }

        public final Builder initialBackOff(long backOff) {
            if (backOff > 0) {
                this.a = backOff;
                return this;
            }
            ore.c(nbh.s(backOff, "initial back off should be positive: ", " < 0"));
            return null;
        }

        public final Builder maxBackOff(long backOff) {
            if (backOff > 0) {
                this.b = backOff;
                return this;
            }
            ore.c(nbh.s(backOff, "max back off should be positive: ", " < 0"));
            return null;
        }

        public final Builder scaleFactor(double factor) {
            if (factor > 1.0d) {
                this.e = factor;
                return this;
            }
            throw new IllegalStateException(("scale factor should be above one: " + factor + " < 1").toString());
        }

        public final Builder standardDeviation(long deviation) {
            if (deviation > 0) {
                this.c = deviation;
                return this;
            }
            ore.c(nbh.s(deviation, "standard deviation should be positive: ", " < 0"));
            return null;
        }
    }

    public ExponentialBackOff(long j, long j2, long j3, long j4, double d, j95 j95Var) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = d;
        this.f = j;
    }

    @Override // com.vk.push.core.backoff.BackOff
    public long getNextBackOff() {
        double d = this.f * this.e;
        double dNextGaussian = (RandomUtils.INSTANCE.nextGaussian() * this.c) + this.d;
        long j = (long) d;
        long j2 = this.b;
        if (j > j2) {
            j = j2;
        }
        long j3 = j + ((long) dNextGaussian);
        this.f = j3;
        return j3;
    }

    @Override // com.vk.push.core.backoff.BackOff
    public void resetBackOff() {
        this.f = this.a;
    }
}

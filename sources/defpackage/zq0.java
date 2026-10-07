package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class zq0 implements Serializable {
    public final long a;

    public zq0() {
        this(Long.MIN_VALUE);
    }

    public String toString() {
        return zo5.u(new StringBuilder("BaseEvent{requestId="), this.a, '}');
    }

    public zq0(long j) {
        this.a = j;
    }
}

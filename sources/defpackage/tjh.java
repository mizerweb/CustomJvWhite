package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tjh {
    public final long a;
    public final rkh b;
    public final int c;
    public final long d;
    public final int e;
    public final btc f;
    public final long g;

    public tjh(long j, rkh rkhVar, int i, long j2, int i2, btc btcVar, long j3) {
        this.a = j;
        this.b = rkhVar;
        this.c = i;
        this.d = j2;
        this.e = i2;
        this.f = btcVar;
        this.g = j3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaskDb{id=");
        sb.append(this.a);
        sb.append(",status=");
        sb.append(this.b);
        sb.append(",failsCount=");
        sb.append(this.c);
        sb.append(",dependsRequestId=");
        sb.append(this.d);
        sb.append(",dependencyType=");
        sb.append(this.e);
        sb.append(",task.type=");
        sb.append(this.f.getType());
        sb.append(",createdTime=");
        return zo5.u(sb, this.g, '}');
    }
}

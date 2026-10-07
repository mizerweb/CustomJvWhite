package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class yq0 extends zq0 {
    public final yhh b;

    public yq0(yhh yhhVar) {
        this(Long.MIN_VALUE, yhhVar);
    }

    @Override // defpackage.zq0
    public String toString() {
        StringBuilder sb = new StringBuilder("BaseErrorEvent{error=");
        sb.append(this.b);
        sb.append(", requestId=");
        return zo5.u(sb, this.a, '}');
    }

    public yq0(long j, yhh yhhVar) {
        super(j);
        this.b = yhhVar;
    }
}

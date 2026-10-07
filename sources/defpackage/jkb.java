package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jkb extends kih {
    public st2 c;
    public long d;
    public long e;
    public long f;

    public jkb(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        switch (str) {
            case "startTime":
                this.e = ch3.T(fkaVar, 0L);
                break;
            case "endTime":
                this.f = ch3.T(fkaVar, 0L);
                break;
            case "postId":
                this.d = ch3.T(fkaVar, 0L);
                break;
            case "chat":
                this.c = st2.b(fkaVar);
                break;
            default:
                fkaVar.x();
                break;
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        long j = this.e;
        long j2 = this.f;
        String strValueOf = String.valueOf(this.c);
        long j3 = this.d;
        StringBuilder sbS = qt4.s(j, "{startTime=", ", endTime=");
        qv1.s(j2, ", chat=", strValueOf, sbS);
        return zo5.k(j3, ", postId=", "}", sbS);
    }
}

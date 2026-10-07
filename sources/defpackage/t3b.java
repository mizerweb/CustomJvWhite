package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t3b extends zq0 {
    public final long b;
    public final long[] c;
    public final hm4 d;
    public final long[] e;

    public t3b(long j, long j2, long[] jArr, hm4 hm4Var, long[] jArr2) {
        super(j);
        this.b = j2;
        this.c = jArr;
        this.d = hm4Var;
        this.e = jArr2;
    }

    @Override // defpackage.zq0
    public final String toString() {
        return "MsgGetEvent{serverChatId=" + this.b + ", serverMessageIds=" + this.c + ", messages=" + this.d + ", requestedMessageIds=" + this.e + "}";
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s04 extends rt2 {
    public final q24 r;

    public s04(q24 q24Var, jzb jzbVar, ef3 ef3Var, long j, nx2 nx2Var, my2 my2Var) {
        super(jzbVar, ef3Var, 0L, j, nx2Var, null, null, null, my2Var);
        this.r = q24Var;
        if (this.a != 0) {
            ore.p("unexpected id for comments chat");
            throw null;
        }
        if (nx2Var.a == 0) {
            return;
        }
        ore.p("unexpected serverId for comments chat");
        throw null;
    }

    @Override // defpackage.rt2
    public final long A() {
        return 0L;
    }

    @Override // defpackage.rt2
    public final String E() {
        return null;
    }

    @Override // defpackage.rt2
    public final String F() {
        return "";
    }

    @Override // defpackage.rt2
    public final String toString() {
        return "CommentsChat{commentsId=" + this.r + ",id=" + this.a + ",data=" + this.b + "}";
    }
}

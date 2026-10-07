package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j3b extends zq0 {
    public final long b;
    public final long c;
    public final long d;
    public final List e;
    public final mg5 f;

    public j3b(long j, long j2, long j3, mg5 mg5Var) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = new ArrayList();
        this.f = mg5Var;
    }

    @Override // defpackage.zq0
    public final String toString() {
        return "MsgDeleteEvent{chatId=" + this.b + ", startTime=" + this.c + ", endTime=" + this.d + ", messageIds=" + this.e.size() + ", itemType=" + this.f + '}';
    }

    public j3b(long j, List list, mg5 mg5Var) {
        this.b = j;
        this.f = mg5Var;
        this.c = 0L;
        this.d = 0L;
        this.e = list;
    }
}

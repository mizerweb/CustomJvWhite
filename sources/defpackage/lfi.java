package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lfi extends zq0 {
    public final long b;
    public final List c;

    public lfi(long j, List list) {
        this.b = j;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfi)) {
            return false;
        }
        lfi lfiVar = (lfi) obj;
        return this.b == lfiVar.b && cqk.d(this.c, lfiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    @Override // defpackage.zq0
    public final String toString() {
        return "UpdateMessagesEvent(chatId=" + this.b + ", messageIds=" + this.c + ")";
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ina implements lna {
    public final int a;
    public final e7d b;
    public final long c;

    public ina(int i, e7d e7dVar, long j) {
        this.a = i;
        this.b = e7dVar;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ina)) {
            return false;
        }
        ina inaVar = (ina) obj;
        return this.a == inaVar.a && cqk.d(this.b, inaVar.b) && this.c == inaVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    @Override // defpackage.una
    public final long l() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnPollAnswerSelected(answerId=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", messageId=");
        return c0a.m(this.c, ")", sb);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ip1 implements jp1 {
    public final boolean a;

    public ip1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ip1) && this.a == ((ip1) obj).a;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 9223372036854775806L;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return 9223372036854775806L == k79Var.getItemId();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    @Override // defpackage.k79
    public final int j() {
        return 4;
    }

    public final String toString() {
        return qv1.m("CallWaitingRoomState(isWaitingForAdmin=", ")", this.a);
    }
}

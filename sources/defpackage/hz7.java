package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hz7 implements k79 {
    public final String a;
    public final Boolean b;

    public hz7(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz7)) {
            return false;
        }
        hz7 hz7Var = (hz7) obj;
        return cqk.d(this.a, hz7Var.a) && this.b.equals(hz7Var.b);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a.hashCode();
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return getItemId() == k79Var.getItemId();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 0;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        hz7 hz7Var = k79Var instanceof hz7 ? (hz7) k79Var : null;
        if (hz7Var != null) {
            Boolean bool = hz7Var.b;
            if (!this.b.equals(bool)) {
                return new gz7(bool);
            }
        }
        return null;
    }

    public final String toString() {
        return "HostItem(host=" + this.a + ", isSelected=" + this.b + ")";
    }
}

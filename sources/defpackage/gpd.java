package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gpd implements ipd {
    public final Long a;

    public gpd(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gpd) && this.a.equals(((gpd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return iic.m(this.a, "UpdateSuccess(requestId=", ")");
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v7e {
    public final Long a;

    public /* synthetic */ v7e(Long l) {
        this.a = l;
    }

    public static final Long a(Long l) {
        if (l == null || l.longValue() <= 0) {
            return null;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v7e) {
            return cqk.d(this.a, ((v7e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Long l = this.a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return iic.m(this.a, "ReactionsUpdateTimeMode(time=", ")");
    }
}

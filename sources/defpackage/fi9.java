package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fi9 {
    public Long a;

    public final Long a(Long l) {
        if (l == null) {
            this.a = null;
            return null;
        }
        if (l.longValue() < 0) {
            this.a = null;
            return null;
        }
        Long l2 = this.a;
        this.a = l;
        if (l2 != null && l.longValue() >= l2.longValue()) {
            return Long.valueOf(l.longValue() - l2.longValue());
        }
        return null;
    }
}

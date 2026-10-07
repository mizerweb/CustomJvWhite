package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class qzk extends owk {
    final transient Object[] d;

    private qzk(Object obj, Object[] objArr, int i) {
        this.d = objArr;
    }

    public static qzk g(int i, Object[] objArr, lwk lwkVar) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        gtk.b(obj, obj2);
        return new qzk(null, objArr, 1);
    }

    @Override // defpackage.owk
    public final tvk a() {
        return new nzk(this.d, 1, 1);
    }

    @Override // defpackage.owk
    public final rwk d() {
        return new hzk(this, this.d, 0, 1);
    }

    @Override // defpackage.owk
    public final rwk e() {
        return new kzk(this, new nzk(this.d, 0, 1));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // defpackage.owk, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.d;
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                Objects.requireNonNull(obj2);
            } else {
                obj2 = null;
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }
}

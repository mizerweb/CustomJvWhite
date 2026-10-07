package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t9a implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Collection b;

    public /* synthetic */ t9a(int i, Collection collection) {
        this.a = i;
        this.b = collection;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        boolean zContains;
        int i = this.a;
        Collection collection = this.b;
        switch (i) {
            case 0:
                zContains = collection.contains(Long.valueOf(((l8a) obj).a));
                break;
            default:
                Long l = (Long) obj;
                l.longValue();
                zContains = collection.contains(l);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}

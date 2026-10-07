package defpackage;

import java.util.Collection;
import java.util.function.Predicate;
import one.me.sdk.concurrent.LinkedTransferQueue34;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f69 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Collection b;

    public /* synthetic */ f69(int i, Collection collection) {
        this.a = i;
        this.b = collection;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        Collection collection = this.b;
        switch (i) {
            case 0:
                return LinkedTransferQueue34.lambda$retainAll$1(collection, obj);
            default:
                return collection.contains(obj);
        }
    }
}

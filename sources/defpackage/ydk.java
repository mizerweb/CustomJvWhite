package defpackage;

import java.util.function.BiPredicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ydk implements BiPredicate {
    public final /* synthetic */ int a;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                return true;
            default:
                return !str.startsWith(":");
        }
    }
}

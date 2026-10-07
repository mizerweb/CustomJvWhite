package defpackage;

import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ci4 implements Predicate {
    public final /* synthetic */ int a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return Objects.isNull((fi4) obj);
            default:
                cga cgaVar = (cga) obj;
                return (cgaVar == null || cgaVar.b() == null) ? false : true;
        }
    }
}

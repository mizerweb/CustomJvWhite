package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bu4 implements BinaryOperator {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ bu4() {
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        switch (this.a) {
            case 0:
                tt4 tt4Var = (xf5) obj;
                xf5 xf5Var = (xf5) obj2;
                if (tt4Var != null) {
                    ((up8) tt4Var).b(null);
                }
                return xf5Var;
            default:
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                arrayList.addAll((List) obj2);
                return arrayList;
        }
    }

    public /* synthetic */ bu4(jek jekVar) {
    }
}

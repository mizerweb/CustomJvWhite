package defpackage;

import java.util.ArrayList;
import java.util.function.BiFunction;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class he7 implements BiFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ qf7 b;

    public /* synthetic */ he7(qf7 qf7Var, int i) {
        this.a = i;
        this.b = qf7Var;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.a;
        qf7 qf7Var = this.b;
        switch (i) {
            case 0:
                return (je7) ((ge7) qf7Var).invoke(obj, obj2);
            case 1:
                return (je7) ((ie7) qf7Var).invoke(obj, obj2);
            case 2:
                return (f9b) ((wfd) qf7Var).invoke(obj, obj2);
            case 3:
                return (ArrayList) ((z00) qf7Var).invoke(obj, obj2);
            case 4:
                return (f9b) ((z00) qf7Var).invoke(obj, obj2);
            default:
                return (ole) ((z00) qf7Var).invoke(obj, obj2);
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fwj {
    public final b9b a = new b9b(1);
    public final b9b b = new b9b(1);

    public final a8j a(Class cls, y7j y7jVar) {
        String strK = qv1.k("one.me.sdk.arch.ViewModelStore:key:", cls.getCanonicalName());
        b9b b9bVar = this.a;
        a8j a8jVar = (a8j) b9bVar.d(strK);
        if (cls.isInstance(a8jVar)) {
            Object objCast = cls.cast(a8jVar);
            if (objCast != null) {
                return (a8j) objCast;
            }
            ore.p("Required value was null.");
            return null;
        }
        y7j y7jVar2 = (y7j) this.b.d(strK);
        if (y7jVar2 != null) {
            y7jVar = y7jVar2;
        }
        if (y7jVar == null) {
            gm0.Y("WidgetViewModelStore", "Wrong usage of ViewModelStore - trying to access ViewModel without adding its Factory");
            return null;
        }
        a8j a8jVarA = y7jVar.a(cls);
        b9bVar.o(strK, a8jVarA);
        return a8jVarA;
    }
}

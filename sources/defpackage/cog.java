package defpackage;

import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cog implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ eng b;

    public /* synthetic */ cog(eng engVar, int i) {
        this.a = i;
        this.b = engVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        eng engVar = this.b;
        switch (i) {
            case 0:
                return Long.valueOf(engVar.b);
            case 1:
                return new fog(engVar.b, ((fog) obj).b);
            default:
                return new fog(engVar.b, ((fog) obj).b);
        }
    }
}

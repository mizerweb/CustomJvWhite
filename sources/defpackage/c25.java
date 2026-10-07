package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c25 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object[] b;

    public c25(int i, Object obj) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = (Object[]) obj;
                break;
            default:
                this.b = (Object[]) obj;
                break;
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        Object[] objArr = this.b;
        switch (i) {
            case 0:
                Object obj2 = objArr[((Number) obj).intValue()];
                if (obj2 != null) {
                    return (Long) obj2;
                }
                ore.n("null cannot be cast to non-null type kotlin.Long");
                return null;
            default:
                Object obj3 = objArr[((Number) obj).intValue()];
                if (obj3 != null) {
                    return (String) obj3;
                }
                ore.n("null cannot be cast to non-null type kotlin.String");
                return null;
        }
    }
}

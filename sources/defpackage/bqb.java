package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bqb extends ux8 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bqb(int i, Object obj) {
        super(1);
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return obj == ((u8b) obj2) ? "(this)" : String.valueOf(obj);
            default:
                return obj == ((c9b) obj2) ? "(this)" : String.valueOf(obj);
        }
    }
}

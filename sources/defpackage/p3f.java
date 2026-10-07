package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p3f extends ux8 implements af7 {
    public final /* synthetic */ r3f a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3f(int i, r3f r3fVar) {
        super(0);
        this.a = r3fVar;
        this.b = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        return this.a.b(this.b);
    }
}

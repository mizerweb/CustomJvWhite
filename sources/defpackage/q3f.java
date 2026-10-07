package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q3f extends ux8 implements af7 {
    public final /* synthetic */ r3f a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3f(r3f r3fVar, int i, boolean z) {
        super(0);
        this.a = r3fVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        return this.a.c(this.b, this.c);
    }
}

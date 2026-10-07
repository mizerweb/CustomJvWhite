package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hjh extends ux8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bub b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hjh(bub bubVar, Object obj, int i) {
        super(0);
        this.a = i;
        this.b = bubVar;
        this.c = obj;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        Object obj = this.c;
        bub bubVar = this.b;
        switch (i) {
            case 0:
                bubVar.a(obj);
                break;
            default:
                bubVar.a(obj);
                break;
        }
        return sbiVar;
    }
}

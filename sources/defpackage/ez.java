package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ez implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8b b;

    public /* synthetic */ ez(m8b m8bVar, int i) {
        this.a = i;
        this.b = m8bVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        boolean zD;
        int i = this.a;
        m8b m8bVar = this.b;
        switch (i) {
            case 0:
                zD = m8bVar.d(((kw7) obj).getA());
                break;
            case 1:
                zD = m8bVar.d(((kw7) obj).getA());
                break;
            case 2:
                zD = !m8bVar.a(((qxc) obj).a);
                break;
            default:
                zD = m8bVar.d(((Long) obj).longValue());
                break;
        }
        return Boolean.valueOf(zD);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y8i implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b9i b;

    public /* synthetic */ y8i(b9i b9iVar, int i) {
        this.a = i;
        this.b = b9iVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        b9i b9iVar = this.b;
        CharSequence charSequence = (CharSequence) obj;
        switch (i) {
            case 0:
                a9i a9iVar = b9iVar.j;
                if (a9iVar != null) {
                    a9iVar.Q(charSequence);
                }
                break;
            default:
                a9i a9iVar2 = b9iVar.j;
                if (a9iVar2 != null) {
                    a9iVar2.t(charSequence);
                }
                break;
        }
        return sbiVar;
    }
}

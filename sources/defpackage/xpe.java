package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xpe extends s1 {
    public int c;
    public int d;
    public final /* synthetic */ ype e;

    public xpe(ype ypeVar) {
        this.e = ypeVar;
        this.c = ypeVar.d;
        this.d = ypeVar.c;
    }

    @Override // defpackage.s1
    public final void a() {
        int i = this.c;
        if (i == 0) {
            this.a = 2;
            return;
        }
        ype ypeVar = this.e;
        Object[] objArr = ypeVar.a;
        int i2 = this.d;
        this.b = objArr[i2];
        this.a = 1;
        this.d = (i2 + 1) % ypeVar.b;
        this.c = i - 1;
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zre implements af7 {
    public final /* synthetic */ List a;
    public final /* synthetic */ Long b;
    public final /* synthetic */ ose c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ zre(List list, Long l, ose oseVar, long j, long j2, boolean z) {
        this.a = list;
        this.b = l;
        this.c = oseVar;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        for (gda gdaVar : this.a) {
            Long l = this.b;
            if (l == null || l.longValue() < 0) {
                l = null;
            }
            ose.i(this.c, this.d, gdaVar, this.e, l, this.f, 16);
        }
        return sbi.a;
    }
}

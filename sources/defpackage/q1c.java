package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q1c extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ r1c d;

    /* JADX WARN: Illegal instructions before constructor call */
    public q1c(r1c r1cVar, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 1:
                Boolean bool = Boolean.TRUE;
                this.d = r1cVar;
                super(i2, bool);
                break;
            default:
                this.d = r1cVar;
                super(i2, null);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        r1c r1cVar = this.d;
        switch (i) {
            case 0:
                kbc kbcVarH = (kbc) obj2;
                if (!cqk.d((kbc) obj, kbcVarH)) {
                    if (kbcVarH == null) {
                        kbcVarH = pq3.j.h(r1cVar);
                    }
                    r1cVar.onThemeChanged(kbcVarH);
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    r1cVar.g(zBooleanValue);
                }
                break;
        }
    }
}

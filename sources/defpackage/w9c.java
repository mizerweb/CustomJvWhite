package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w9c extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ z9c d;

    /* JADX WARN: Illegal instructions before constructor call */
    public w9c(z9c z9cVar, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 2:
                Boolean bool = Boolean.TRUE;
                this.d = z9cVar;
                super(i2, bool);
                break;
            default:
                this.d = z9cVar;
                super(i2, null);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        z9c z9cVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d((owb) obj, (owb) obj2)) {
                    z9c.a(z9cVar);
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    kbc kbcVarH = (kbc) obj2;
                    if (kbcVarH == null) {
                        kbcVarH = pq3.j.h(z9cVar);
                    }
                    z9cVar.onThemeChanged(kbcVarH);
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    z9c.a(z9cVar);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9c(owb owbVar, z9c z9cVar) {
        super(4, owbVar);
        this.c = 0;
        this.d = z9cVar;
    }
}

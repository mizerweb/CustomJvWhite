package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class byb extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ cyb d;

    /* JADX WARN: Illegal instructions before constructor call */
    public byb(cyb cybVar, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 3:
                this.d = cybVar;
                super(i2, zxb.PRIMARY);
                break;
            case 6:
                this.d = cybVar;
                super(i2, "");
                break;
            default:
                Boolean bool = Boolean.FALSE;
                this.d = cybVar;
                super(i2, bool);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        zxb zxbVar = zxb.GHOST;
        cyb cybVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    cybVar.e();
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    cybVar.e();
                }
                break;
            case 2:
                if (!cqk.d(obj, obj2)) {
                    cybVar.e();
                }
                break;
            case 3:
                if (!cqk.d(obj, obj2)) {
                    cybVar.e();
                }
                break;
            case 4:
                if (!cqk.d(obj, obj2) && cybVar.getAppearance() == zxbVar) {
                    cybVar.e();
                    break;
                }
                break;
            case 5:
                if (!cqk.d(obj, obj2) && cybVar.getAppearance() == zxbVar) {
                    cybVar.e();
                    break;
                }
                break;
            case 6:
                if (!cqk.d(obj, obj2)) {
                    cybVar.e();
                }
                break;
            case 7:
                if (!cqk.d(obj, obj2)) {
                    cybVar.e();
                }
                break;
            case 8:
                if (!cqk.d(obj, obj2)) {
                    cybVar.e();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    cybVar.e();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ byb(cyb cybVar, int i, boolean z) {
        super(4, null);
        this.c = i;
        this.d = cybVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byb(Object obj, cyb cybVar) {
        super(4, obj);
        this.c = 2;
        this.d = cybVar;
    }
}

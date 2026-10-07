package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sha extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ tha d;

    /* JADX WARN: Illegal instructions before constructor call */
    public sha(tha thaVar, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 1:
                this.d = thaVar;
                super(i2, gha.a);
                break;
            case 2:
                Boolean bool = Boolean.FALSE;
                this.d = thaVar;
                super(i2, bool);
                break;
            case 3:
                Boolean bool2 = Boolean.FALSE;
                this.d = thaVar;
                super(i2, bool2);
                break;
            case 4:
                Boolean bool3 = Boolean.FALSE;
                this.d = thaVar;
                super(i2, bool3);
                break;
            default:
                Boolean bool4 = Boolean.FALSE;
                this.d = thaVar;
                super(i2, bool4);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        tha thaVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    thaVar.setVideoMsgButtonVisible(zBooleanValue);
                    thaVar.p(thaVar.getCurrentTheme());
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    thaVar.k((gha) obj2);
                    thaVar.p(thaVar.getCurrentTheme());
                }
                break;
            case 2:
                if (!cqk.d(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    thaVar.onThemeChanged(thaVar.getCurrentTheme());
                }
                break;
            case 3:
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    if (!zBooleanValue2) {
                        thaVar.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    thaVar.p(thaVar.getCurrentTheme());
                    tha.g(thaVar);
                }
                break;
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r64 implements lq4 {
    public static final r64 b = new r64(0);
    public static final r64 c = new r64(1);
    public final /* synthetic */ int a;

    public /* synthetic */ r64(int i) {
        this.a = i;
    }

    private final void a(Object obj) {
    }

    @Override // defpackage.lq4
    public final vt4 getContext() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return k66.a;
        }
    }

    @Override // defpackage.lq4
    public final void resumeWith(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }
}

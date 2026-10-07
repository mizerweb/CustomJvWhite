package defpackage;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class i88 extends wf5 {
    public final /* synthetic */ int n = 0;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i88(ich ichVar, Size size) {
        super(34, size);
        this.o = ichVar;
    }

    @Override // defpackage.wf5
    public final e89 f() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return o9b.f((Surface) obj);
            default:
                return ((ich) obj).h;
        }
    }

    public i88(Surface surface, Size size, int i) {
        super(i, size);
        this.o = surface;
    }
}

package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final class dn2 extends a29 {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn2(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.q = 0;
    }

    @Override // defpackage.a29
    public int b(View view, int i) {
        switch (this.q) {
            case 0:
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // defpackage.a29
    public int c(View view, int i) {
        switch (this.q) {
            case 0:
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // defpackage.a29
    public PointF g(int i) {
        switch (this.q) {
            case 0:
                return null;
            default:
                return super.g(i);
        }
    }

    @Override // defpackage.a29
    public int i() {
        switch (this.q) {
            case 1:
                return -1;
            case 2:
                return -1;
            default:
                return super.i();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dn2(Context context, int i) {
        super(context);
        this.q = i;
    }
}

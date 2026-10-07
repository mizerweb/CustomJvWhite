package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final class fn2 extends gn2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ CarouselLayoutManager d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn2(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 0);
        this.c = i;
        switch (i) {
            case 1:
                this.d = carouselLayoutManager;
                super(0, 0);
                break;
            default:
                this.d = carouselLayoutManager;
                break;
        }
    }

    @Override // defpackage.gn2
    public final int b() {
        int i = this.c;
        CarouselLayoutManager carouselLayoutManager = this.d;
        switch (i) {
            case 0:
                return carouselLayoutManager.o;
            default:
                return carouselLayoutManager.o - carouselLayoutManager.I();
        }
    }

    @Override // defpackage.gn2
    public final int c() {
        switch (this.c) {
            case 0:
                return this.d.J();
            default:
                return 0;
        }
    }

    @Override // defpackage.gn2
    public final int d() {
        int i = this.c;
        CarouselLayoutManager carouselLayoutManager = this.d;
        switch (i) {
            case 0:
                return carouselLayoutManager.n - carouselLayoutManager.K();
            default:
                return carouselLayoutManager.n;
        }
    }

    @Override // defpackage.gn2
    public final int e() {
        switch (this.c) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.d;
                if (carouselLayoutManager.N0()) {
                    return carouselLayoutManager.n;
                }
                return 0;
        }
    }

    @Override // defpackage.gn2
    public final int f() {
        switch (this.c) {
            case 0:
                return 0;
            default:
                return this.d.L();
        }
    }
}

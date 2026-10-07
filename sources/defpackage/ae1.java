package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ae1 extends yk {
    public static final /* synthetic */ int s = 0;
    public final int k;
    public final boolean l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public final pk5 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae1(int i, int i2, boolean z) {
        super(0);
        i = (i2 & 1) != 0 ? 3 : i;
        final int i3 = 2;
        final int i4 = 1;
        z = (i2 & 2) != 0 ? true : z;
        final int i5 = 0;
        this.k = i;
        this.l = z;
        r7 r7Var = r7.a;
        sx1 sx1Var = new sx1(r7.d(ha9.b));
        this.m = rx8.P(3, new va(24));
        this.n = rx8.P(3, new af7(this) { // from class: zd1
            public final /* synthetic */ ae1 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                ae1 ae1Var = this.b;
                switch (i6) {
                    case 0:
                        int i7 = ae1.s;
                        return new ww1(250L, ae1Var.d());
                    case 1:
                        int i8 = ae1.s;
                        return new g22(250L, ae1Var.d());
                    default:
                        int i9 = ae1.s;
                        return new lg1(250L, ae1Var.d());
                }
            }
        });
        this.o = rx8.P(3, new af7(this) { // from class: zd1
            public final /* synthetic */ ae1 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i4;
                ae1 ae1Var = this.b;
                switch (i6) {
                    case 0:
                        int i7 = ae1.s;
                        return new ww1(250L, ae1Var.d());
                    case 1:
                        int i8 = ae1.s;
                        return new g22(250L, ae1Var.d());
                    default:
                        int i9 = ae1.s;
                        return new lg1(250L, ae1Var.d());
                }
            }
        });
        this.p = rx8.P(3, new af7(this) { // from class: zd1
            public final /* synthetic */ ae1 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i3;
                ae1 ae1Var = this.b;
                switch (i6) {
                    case 0:
                        int i7 = ae1.s;
                        return new ww1(250L, ae1Var.d());
                    case 1:
                        int i8 = ae1.s;
                        return new g22(250L, ae1Var.d());
                    default:
                        int i9 = ae1.s;
                        return new lg1(250L, ae1Var.d());
                }
            }
        });
        this.q = sx1Var.getAccessor().d(66);
        this.r = (pk5) sx1Var.getAccessor().c(88);
    }

    public static boolean o(View view) {
        return view != null && view.getId() == R.id.call_screen_container_id;
    }

    @Override // defpackage.yk, defpackage.gr4
    public final boolean d() {
        if (this.r.a()) {
            return true;
        }
        return this.l;
    }

    @Override // defpackage.yk
    public final Animator l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        int i;
        boolean zA = this.r.a();
        ny8 ny8Var = this.p;
        if (!zA && (i = this.k) != 4) {
            if (o(view2) && i == 2) {
                return ((lg1) ny8Var.getValue()).l(viewGroup, view, view2, z, z2);
            }
            boolean zO = o(view2);
            ny8 ny8Var2 = this.n;
            if (zO && i == 1) {
                return ((ww1) ny8Var2.getValue()).l(viewGroup, view, view2, z, z2);
            }
            ny8 ny8Var3 = this.m;
            if (view != null && view.getId() == R.id.call_screen_incoming_container_id && o(view2)) {
                return (AnimatorSet) ny8Var3.getValue();
            }
            ny8 ny8Var4 = this.o;
            if ((view2 != null && view2.getId() == R.id.call_screen_incoming_container_id) || (view != null && view.getId() == R.id.call_screen_incoming_container_id)) {
                return ((g22) ny8Var4.getValue()).l(viewGroup, view, view2, z, z2);
            }
            if ((view != null && view.getId() == R.id.call_pip_container_id) || (view2 != null && view2.getId() == R.id.call_pip_container_id)) {
                return (AnimatorSet) ny8Var3.getValue();
            }
            boolean zO2 = o(view);
            ny8 ny8Var5 = this.q;
            if (zO2 && ((f62) ((n42) ((k42) ny8Var5.getValue())).f.a.getValue()).e) {
                return ((ww1) ny8Var2.getValue()).l(viewGroup, view, view2, z, z2);
            }
            if ((!o(view) || !((n42) ((k42) ny8Var5.getValue())).c().C()) && !((n42) ((k42) ny8Var5.getValue())).c().C()) {
                return ((lg1) ny8Var.getValue()).l(viewGroup, view, view2, z, z2);
            }
            return ((g22) ny8Var4.getValue()).l(viewGroup, view, view2, z, z2);
        }
        return ((lg1) ny8Var.getValue()).l(viewGroup, view, view2, z, z2);
    }

    @Override // defpackage.yk
    public final void n(View view) {
    }

    public ae1() {
        this(0, 7, false);
    }
}

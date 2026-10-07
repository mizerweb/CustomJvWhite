package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.a;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class mr1 extends g6g {
    public final c1d f;
    public final s22 g;
    public final ej1 h;
    public final q12 i;
    public final o22 j;
    public final ExecutorService k;
    public final s32 l;
    public final lxi m;
    public final a n;
    public final qq7 o;
    public final a9j p;
    public final ha9 q;
    public final ny8 r;
    public final ny8 s;

    public mr1(c1d c1dVar, px1 px1Var, hx1 hx1Var, nx1 nx1Var, o22 o22Var, ny8 ny8Var, ny8 ny8Var2, ExecutorService executorService, s32 s32Var, lxi lxiVar, a aVar, qq7 qq7Var, a9j a9jVar, ha9 ha9Var) {
        super(executorService);
        this.f = c1dVar;
        this.g = px1Var;
        this.h = hx1Var;
        this.i = nx1Var;
        this.j = o22Var;
        this.k = executorService;
        this.l = s32Var;
        this.m = lxiVar;
        this.n = aVar;
        this.o = qq7Var;
        this.p = a9jVar;
        this.q = ha9Var;
        this.r = ny8Var;
        this.s = ny8Var2;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        s7gVar.B((lr1) ((k79) F(i)));
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: M */
    public final void B(s7g s7gVar) {
        s7gVar.G();
        y22 y22Var = s7gVar instanceof y22 ? (y22) s7gVar : null;
        if (y22Var != null) {
            y22Var.u.a.remove(y22Var);
        }
    }

    public final es4 N() {
        return (es4) this.s.getValue();
    }

    @Override // defpackage.nee
    public final void v(lfe lfeVar, int i, List list) {
        f83 hr1Var;
        s7g s7gVar = (s7g) lfeVar;
        if (list.isEmpty()) {
            u(s7gVar, i);
            return;
        }
        k79 k79Var = (lr1) ((k79) F(i));
        if (k79Var instanceof kr1) {
            hr1Var = new jr1(3);
            for (Object obj : list) {
                f83 f83Var = obj instanceof jr1 ? (jr1) obj : null;
                if (f83Var != null) {
                    hr1Var.e(f83Var);
                }
            }
        } else if (k79Var instanceof gr1) {
            hr1Var = new fr1(3);
            for (Object obj2 : list) {
                f83 f83Var2 = obj2 instanceof fr1 ? (fr1) obj2 : null;
                if (f83Var2 != null) {
                    hr1Var.e(f83Var2);
                }
            }
        } else {
            if (!(k79Var instanceof ir1)) {
                ore.o();
                return;
            }
            hr1Var = new hr1(3);
            for (Object obj3 : list) {
                f83 f83Var3 = obj3 instanceof hr1 ? (hr1) obj3 : null;
                if (f83Var3 != null) {
                    hr1Var.e(f83Var3);
                }
            }
        }
        s7gVar.C(k79Var, hr1Var);
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        ny8 ny8Var = this.r;
        a aVar = this.n;
        lxi lxiVar = this.m;
        ExecutorService executorService = this.k;
        ha9 ha9Var = this.q;
        if (i == 111) {
            w22 w22Var = new w22(viewGroup.getContext(), ha9Var, executorService);
            w22Var.setLayoutParams(new uf4(-1, -1));
            w22Var.setVisibility(0);
            w22Var.setOnTouchListener((View.OnTouchListener) ny8Var.getValue());
            w22Var.setControlsMediator(N());
            w22Var.setVideoLayoutUpdatesController(lxiVar);
            w22Var.setCallSpeakerMediator(this.j);
            w22Var.setListener(this.g);
            w22Var.setOpponentsViewPool(aVar);
            N().b(w22Var);
            this.f.a.add(w22Var);
            return new y22(w22Var, this.l);
        }
        if (i != 222) {
            if (i != 225) {
                ore.k(nbh.q(i, "unknown item view type "));
                return null;
            }
            r12 r12Var = new r12(viewGroup.getContext());
            r12Var.setLayoutParams(new uf4(-1, -1));
            r12Var.setVisibility(0);
            r12Var.setControlsMediator(N());
            r12Var.setListener(this.i);
            N().b(r12Var);
            return new z91(r12Var, 6);
        }
        fj1 fj1Var = new fj1(viewGroup.getContext(), ha9Var, executorService);
        fj1Var.setLayoutParams(new uf4(-1, -1));
        fj1Var.setVisibility(0);
        fj1Var.setOnTouchListener((View.OnTouchListener) ny8Var.getValue());
        fj1Var.setControlsMediator(N());
        fj1Var.setListener(this.h);
        fj1Var.setVideoLayoutUpdatesController(lxiVar);
        fj1Var.setOpponentsViewPool(aVar);
        fj1Var.setGridMediator(this.o);
        N().b(fj1Var);
        this.p.a = fj1Var;
        return new z91(fj1Var, 3);
    }
}

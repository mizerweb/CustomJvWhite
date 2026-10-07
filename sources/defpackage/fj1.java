package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.a;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fj1 extends wf4 implements zr4 {
    public as4 A;
    public final wy7 B;
    public final GestureDetector C;
    public md1 D;
    public final Executor s;
    public final xme t;
    public final y8j u;
    public final nj1 v;
    public qq7 w;
    public a x;
    public ej1 y;
    public lxi z;

    public fj1(Context context, ha9 ha9Var, ExecutorService executorService) {
        super(context);
        this.s = executorService;
        this.t = p90.M(new ca0(context, 4));
        int i = 2;
        this.B = new wy7(i, this);
        setLayoutParams(new uf4(-1, -1));
        y8j y8jVar = new y8j(context);
        y8jVar.setId(R.id.call_users_speakers_view_pager);
        this.u = y8jVar;
        int i2 = 6;
        nj1 nj1Var = new nj1(ha9Var, new zo7(i2, this), new ex8(i2, this), executorService, new dj1(this, 0), new dj1(this, 1));
        y8jVar.setAdapter(nj1Var);
        this.v = nj1Var;
        ylc ylcVarU = u(getContext().getResources().getConfiguration().orientation == 1);
        addView(y8jVar, ((Number) ylcVarU.a).intValue(), ((Number) ylcVarU.b).intValue());
        eg4 eg4VarH = ch3.h(this);
        int id = y8jVar.getId();
        eg4VarH.d(id, 4, 0, 4);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.a(this);
        this.C = new GestureDetector(context, new pi9(i, this));
    }

    @Override // defpackage.zr4
    public final void A(yr4 yr4Var) {
        if (!p90.F(this)) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 0);
            return;
        }
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), zo5.b(12.0f, yl5.d().getDisplayMetrics().density, yr4Var.b()));
    }

    @Override // defpackage.zr4
    public final void G(yr4 yr4Var) {
        if (!p90.F(this)) {
            setPadding(getPaddingLeft(), 0, getPaddingRight(), getPaddingBottom());
        } else {
            setPadding(getPaddingLeft(), yr4Var.b(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // defpackage.zr4
    public final List J(xr4 xr4Var, xr4 xr4Var2) {
        return r66.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qq7 qq7Var = this.w;
        if (qq7Var != null && !qq7Var.c) {
            qq7Var.c = true;
            if (((f5d) qq7Var.c()).a()) {
                qq7Var.d(qq7Var.d);
                y8j y8jVar = qq7Var.d;
                qq7Var.e = y8jVar != null ? y8jVar.getAdapter() : null;
            }
            qq7Var.d(qq7Var.g);
            y8j y8jVar2 = qq7Var.g;
            qq7Var.h = y8jVar2 != null ? y8jVar2.getAdapter() : null;
            vq7 vq7Var = qq7Var.j;
            y8j y8jVar3 = qq7Var.d;
            if (vq7Var != null) {
                pq7 pq7Var = new pq7(vq7Var, ((f5d) qq7Var.c()).a() ? new mp5(20, y8jVar3) : null);
                qq7Var.i = pq7Var;
                y8j y8jVar4 = qq7Var.g;
                if (y8jVar4 != null) {
                    y8jVar4.e(pq7Var);
                }
                if (((f5d) qq7Var.c()).a()) {
                    pq7 pq7Var2 = new pq7(vq7Var, null);
                    qq7Var.f = pq7Var2;
                    if (y8jVar3 != null) {
                        y8jVar3.e(pq7Var2);
                    }
                }
            }
            qq7Var.e();
        }
        this.u.e(this.B);
        Context context = getContext();
        ufe ufeVar = new ufe();
        ufeVar.a = context.getResources().getConfiguration().orientation;
        md1 md1Var = new md1(ufeVar, this, 2);
        context.registerComponentCallbacks(md1Var);
        this.D = md1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qq7 qq7Var = this.w;
        if (qq7Var != null) {
            qq7Var.a();
        }
        this.u.j(this.B);
        md1 md1Var = this.D;
        if (md1Var != null) {
            getContext().unregisterComponentCallbacks(md1Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.C.onTouchEvent(motionEvent);
    }

    public final void setControlsMediator(as4 as4Var) {
        this.A = as4Var;
    }

    public final void setGridMediator(qq7 qq7Var) {
        qq7Var.g = this.u;
        this.w = qq7Var;
    }

    public final void setListener(ej1 ej1Var) {
        this.y = ej1Var;
    }

    public final void setOpponents(List<wgc> list) {
        this.v.H(list);
        qq7 qq7Var = this.w;
        if (qq7Var != null) {
            int size = list.size();
            int i = 8;
            if (((f5d) qq7Var.c()).a()) {
                nee neeVar = qq7Var.e;
                if (neeVar == null) {
                    gm0.n(qq7Var.a, "updateOpponentsCountInHorizontalMode: Nothing to do because rootAdapter not attached");
                } else {
                    int iL = neeVar.l();
                    vq7 vq7Var = qq7Var.j;
                    if (vq7Var != null) {
                        vq7Var.setVisibility(iL > 1 ? 0 : 8);
                    }
                    nee neeVar2 = qq7Var.h;
                    int iL2 = ((neeVar2 != null ? neeVar2.l() : 0) + iL) - 1;
                    if (iL2 >= iL) {
                        iL = iL2;
                    }
                    int iB = qq7Var.b();
                    vq7 vq7Var2 = qq7Var.j;
                    if (vq7Var2 != null) {
                        vq7Var2.d(iL, iB);
                    }
                }
            } else {
                vq7 vq7Var3 = qq7Var.j;
                if (vq7Var3 != null) {
                    y8j y8jVar = qq7Var.d;
                    if ((y8jVar == null || y8jVar.getCurrentItem() != 0) && !((f5d) qq7Var.c()).a() && size > 1) {
                        i = 0;
                    }
                    vq7Var3.setVisibility(i);
                }
                vq7 vq7Var4 = qq7Var.j;
                if (vq7Var4 != null) {
                    int i2 = size - 1;
                    y8j y8jVar2 = qq7Var.g;
                    vq7Var4.d(size, Math.min(i2, y8jVar2 != null ? y8jVar2.getCurrentItem() : 0));
                }
            }
        }
        as4 as4Var = this.A;
        if (as4Var != null) {
            es4 es4Var = (es4) as4Var;
            G(es4Var.j);
            A(es4Var.k);
        }
    }

    public final void setOpponentsViewPool(a aVar) {
        this.x = aVar;
    }

    public final void setVideoLayoutUpdatesController(lxi lxiVar) {
        this.z = lxiVar;
    }

    public final ylc u(boolean z) {
        xme xmeVar = this.t;
        int i = 0;
        int i2 = (((k4f) xmeVar.getValue()).k && z) ? (((k4f) xmeVar.getValue()).a * 9) / 16 : 0;
        if (((k4f) xmeVar.getValue()).j && z) {
            i = ((k4f) xmeVar.getValue()).b;
        }
        return new ylc(Integer.valueOf(i2), Integer.valueOf(i));
    }
}

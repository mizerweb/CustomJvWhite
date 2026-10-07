package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nj1 extends g6g {
    public final /* synthetic */ int f = 0;
    public final Object g;
    public final Object h;
    public Object i;
    public Object j;
    public final Object k;
    public final Object l;

    public nj1(ExecutorService executorService, zw8 zw8Var) {
        super(executorService);
        this.g = executorService;
        this.h = zw8Var;
        this.k = new phf(new i1m(this), new occ(0, zw8Var, zw8.class, "onAddNewClick", "onAddNewClick()V", 0, 10), false, 3);
        this.l = new wmg(this, 0);
    }

    @Override // defpackage.g6g
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        switch (this.f) {
            case 0:
                ((mj1) s7gVar).u.setOpponents((wgc) ((k79) F(i)));
                break;
            default:
                if (s7gVar instanceof zn2) {
                    ((zn2) s7gVar).v = (kbc) this.j;
                } else if (s7gVar instanceof zng) {
                    ((zng) s7gVar).u.setCustomTheme((kbc) this.j);
                }
                super.u(s7gVar, i);
                break;
        }
    }

    @Override // defpackage.y69, defpackage.nee
    public int l() {
        switch (this.f) {
            case 0:
                return this.d.f.size();
            default:
                return super.l();
        }
    }

    @Override // defpackage.g6g, defpackage.nee
    public int n(int i) {
        switch (this.f) {
            case 1:
                return ((k79) F(i)).getF();
            default:
                return super.n(i);
        }
    }

    @Override // defpackage.g6g, defpackage.nee
    public final void u(lfe lfeVar, int i) {
        switch (this.f) {
            case 0:
                ((mj1) lfeVar).u.setOpponents((wgc) ((k79) F(i)));
                break;
            default:
                u((s7g) lfeVar, i);
                break;
        }
    }

    @Override // defpackage.nee
    public void v(lfe lfeVar, int i, List list) {
        switch (this.f) {
            case 0:
                mj1 mj1Var = (mj1) lfeVar;
                if (!list.isEmpty()) {
                    mj1Var.C((wgc) this.d.f.get(i), list);
                } else {
                    mj1Var.u.setOpponents((wgc) ((k79) F(i)));
                }
                break;
            default:
                super.v(lfeVar, i, list);
                break;
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        int i2 = this.f;
        Object obj = this.k;
        Object obj2 = this.l;
        Object obj3 = this.g;
        Object obj4 = this.h;
        switch (i2) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                lj1 lj1Var = new lj1(viewGroup.getContext(), (ha9) obj3, (Executor) this.j);
                lj1Var.setId(R.id.call_opponents);
                lj1Var.setParentSizeProvider((zo7) obj4);
                lj1Var.setVideoLayoutUpdatesControllerProvider((dj1) obj);
                lj1Var.setListener((ex8) this.i);
                lj1Var.setOpponentsViewPool(((dj1) obj2).b.x);
                frameLayout.addView(lj1Var, -1, -1);
                return new mj1(frameLayout);
            default:
                if (i != R.id.oneme_media_keyboard_view_type_fake_search) {
                    if (i == R.id.oneme_stickers_view_type_stickers_set) {
                        return new zn2(viewGroup.getContext(), new occ(0, (zw8) obj4, zw8.class, "onRecentClearClick", "onRecentClearClick()V", 0, 9));
                    }
                    return i == R.id.oneme_stickers_view_type_stickers_set_showcase ? new zng(viewGroup.getContext(), (dj9) this.i, (ExecutorService) obj3, (wmg) obj2) : phf.f((phf) obj, viewGroup.getContext(), i, (kbc) this.j, 4);
                }
                Context context = viewGroup.getContext();
                occ occVar = new occ(0, (zw8) obj4, zw8.class, "onFakeSearchClick", "onFakeSearchClick()V", 0, 8);
                kbc kbcVar = (kbc) this.j;
                TextView textViewE = qv1.e(context, R.id.oneme_media_keyboard_fake_search_view);
                int iK = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
                int iK2 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 16;
                layoutParams.topMargin = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
                textViewE.setLayoutParams(layoutParams);
                textViewE.setClipToOutline(true);
                textViewE.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 10.0f));
                textViewE.setText(context.getString(R.string.oneme_search_view_default_hint));
                Drawable drawable = context.getDrawable(R.drawable.icon_search);
                ArrayList arrayList = soh.a;
                textViewE.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                textViewE.setCompoundDrawablePadding(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                textViewE.setPadding(iK2, iK, iK2, iK);
                q9i.e.b(textViewE, bx5.b);
                n1g.N(new vzc(kbcVar, (lq4) null, 13), textViewE);
                qe7.H(textViewE, 300L, new gwc(29, occVar));
                return new lvf(textViewE, 3);
        }
    }

    public nj1(ha9 ha9Var, zo7 zo7Var, ex8 ex8Var, Executor executor, dj1 dj1Var, dj1 dj1Var2) {
        super(executor);
        this.g = ha9Var;
        this.h = zo7Var;
        this.i = ex8Var;
        this.j = executor;
        this.k = dj1Var;
        this.l = dj1Var2;
    }
}

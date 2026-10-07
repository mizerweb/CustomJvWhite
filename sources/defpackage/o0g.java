package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class o0g extends FrameLayout implements eph {
    public static final /* synthetic */ zv8[] f;
    public final FrameLayout a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final q0g d;
    public final t5d e;

    static {
        z8b z8bVar = new z8b(o0g.class, "shimmerBackground", "getShimmerBackground()Lone/me/sdk/uikit/common/shimmers/ShimmerContactCell$Companion$Background;");
        zfe.a.getClass();
        f = new zv8[]{z8bVar};
    }

    public o0g(Context context) {
        super(context, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.oneme_contact_cell_shimmer_avatar);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
        this.a = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.oneme_contact_cell_shimmer_title);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(gm0.K(169.0f * yl5.d().getDisplayMetrics().density), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
        this.b = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.oneme_contact_cell_shimmer_subtitle);
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(gm0.K(90.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f)));
        this.c = frameLayout3;
        wf4 wf4Var = new wf4(context);
        wf4Var.setId(R.id.oneme_contact_cell_shimmer_content_container);
        wf4Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        q0g q0gVar = new q0g(context);
        q0gVar.setId(R.id.oneme_contact_cell_shimmer_container);
        q0gVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.d = q0gVar;
        this.e = new t5d(this);
        setId(R.id.oneme_contact_cell_shimmer);
        setLayoutParams(new FrameLayout.LayoutParams(-1, gm0.K(62.0f * yl5.d().getDisplayMetrics().density)));
        wf4Var.addView(frameLayout);
        wf4Var.addView(frameLayout2);
        wf4Var.addView(frameLayout3);
        q0gVar.addView(wf4Var);
        addView(q0gVar);
        onThemeChanged(pq3.j.h(this));
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = frameLayout.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 4, 0, 4);
        eg4VarH.d(id, 6, 0, 6);
        new bsb(6, eg4VarH, id).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id2 = frameLayout2.getId();
        eg4VarH.d(id2, 3, frameLayout.getId(), 3);
        eg4VarH.d(id2, 6, frameLayout.getId(), 7);
        new bsb(6, eg4VarH, id2).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id3 = frameLayout3.getId();
        eg4VarH.d(id3, 4, frameLayout.getId(), 4);
        eg4VarH.d(id3, 6, frameLayout.getId(), 7);
        new bsb(6, eg4VarH, id3).a(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.a(wf4Var);
    }

    public final void a(kbc kbcVar) {
        int iOrdinal = getShimmerBackground().ordinal();
        if (iOrdinal == 0) {
            kbcVar.h();
            setBackgroundColor(0);
        } else if (iOrdinal == 1) {
            setBackgroundColor(kbcVar.b().c);
        } else {
            ore.o();
        }
    }

    public final n0g getShimmerBackground() {
        zv8 zv8Var = f[0];
        return (n0g) this.e.b;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        a(kbcVar);
        this.a.setBackground(qyj.O(Integer.valueOf(((fn8) kbcVar.u().c.b).c)));
        this.b.setBackground(qyj.T(Integer.valueOf(((fn8) kbcVar.u().c.b).c), null, null, gm0.K(yl5.d().getDisplayMetrics().density * 4.0f)));
        this.c.setBackground(qyj.T(Integer.valueOf(((fn8) kbcVar.u().c.b).c), null, null, gm0.K(4.0f * yl5.d().getDisplayMetrics().density)));
        ex8 ex8Var = new ex8(28);
        m0g m0gVar = (m0g) ex8Var.b;
        m0gVar.j = false;
        ex8Var.N(1200L);
        ex8Var.M(((fn8) kbcVar.u().c.b).c);
        m0gVar.d = kbcVar.b().c;
        ex8Var.L(1.0f);
        this.d.a(ex8Var.s());
    }

    public final void setShimmerBackground(n0g n0gVar) {
        this.e.B(this, f[0], n0gVar);
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.ok.tamtam.messages.scheduled.SliderLayoutManager;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class g45 extends wf4 implements eph {
    public boolean A;
    public final int B;
    public final RecyclerView s;
    public final RecyclerView t;
    public final RecyclerView u;
    public final View v;
    public final View w;
    public f45 x;
    public boolean y;
    public boolean z;

    public g45(Context context) {
        super(context, null);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.date_picker_today_margin_top);
        this.B = dimensionPixelSize;
        View.inflate(context, R.layout.date_time_picker, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.days_recycler_view);
        this.s = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.hours_recycler_view);
        this.t = recyclerView2;
        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.minutes_recycler_view);
        this.u = recyclerView3;
        this.v = findViewById(R.id.top_line);
        this.w = findViewById(R.id.bottom_line);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.date_picker_item_height);
        m45 m45Var = new m45(k45.h);
        final int i = 1;
        m45Var.D(true);
        recyclerView.setAdapter(m45Var);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        final int i2 = 0;
        recyclerView.h(new q35(dimensionPixelSize, i2), -1);
        recyclerView.setLayoutManager(new SliderLayoutManager(context, new hu(this, 10, m45Var)));
        recyclerView.setEdgeEffectFactory(new lkc(dimensionPixelSize2));
        final bsh bshVar = new bsh();
        recyclerView2.setAdapter(bshVar);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setItemAnimator(null);
        recyclerView2.h(new q35(dimensionPixelSize, i2), -1);
        recyclerView2.setLayoutManager(new SliderLayoutManager(context, new pag(this) { // from class: d45
            public final /* synthetic */ g45 b;

            {
                this.b = this;
            }

            @Override // defpackage.pag
            public final void a(int i3) {
                int i4 = i2;
                bsh bshVar2 = bshVar;
                g45 g45Var = this.b;
                switch (i4) {
                    case 0:
                        if (!g45Var.z) {
                            zrh zrhVarF = bshVar2.F(i3);
                            f45 f45Var = g45Var.x;
                            if (f45Var != null) {
                                t2f t2fVar = (t2f) f45Var;
                                gm0.n(t2f.n, "hour = " + zrhVarF);
                                mjg mjgVar = t2fVar.h;
                                x35 x35Var = (x35) mjgVar.getValue();
                                if (x35Var != null) {
                                    if (!cqk.d(x35Var.b, zrhVarF)) {
                                        mjgVar.j(null, x35.a(x35Var, null, zrhVarF, null, 5));
                                        t2fVar.E();
                                        break;
                                    }
                                } else {
                                    gm0.Y(t2f.class.getName(), "Early return in onHourPick cuz of _dateTime.value is null");
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (!g45Var.A) {
                            zrh zrhVarF2 = bshVar2.F(i3);
                            f45 f45Var2 = g45Var.x;
                            if (f45Var2 != null) {
                                gm0.n(t2f.n, "minute = " + zrhVarF2);
                                mjg mjgVar2 = ((t2f) f45Var2).h;
                                x35 x35Var2 = (x35) mjgVar2.getValue();
                                if (x35Var2 != null) {
                                    if (!cqk.d(x35Var2.c, zrhVarF2)) {
                                        mjgVar2.j(null, x35.a(x35Var2, null, null, zrhVarF2, 3));
                                        break;
                                    }
                                } else {
                                    gm0.Y(t2f.class.getName(), "Early return in onMinutePick cuz of _dateTime.value is null");
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        }));
        recyclerView2.setEdgeEffectFactory(new lkc(dimensionPixelSize2));
        final bsh bshVar2 = new bsh();
        recyclerView3.setAdapter(bshVar2);
        recyclerView3.setItemAnimator(null);
        recyclerView3.setHasFixedSize(true);
        recyclerView3.h(new q35(dimensionPixelSize, i2), -1);
        recyclerView3.setLayoutManager(new SliderLayoutManager(context, new pag(this) { // from class: d45
            public final /* synthetic */ g45 b;

            {
                this.b = this;
            }

            @Override // defpackage.pag
            public final void a(int i3) {
                int i4 = i;
                bsh bshVar3 = bshVar2;
                g45 g45Var = this.b;
                switch (i4) {
                    case 0:
                        if (!g45Var.z) {
                            zrh zrhVarF = bshVar3.F(i3);
                            f45 f45Var = g45Var.x;
                            if (f45Var != null) {
                                t2f t2fVar = (t2f) f45Var;
                                gm0.n(t2f.n, "hour = " + zrhVarF);
                                mjg mjgVar = t2fVar.h;
                                x35 x35Var = (x35) mjgVar.getValue();
                                if (x35Var != null) {
                                    if (!cqk.d(x35Var.b, zrhVarF)) {
                                        mjgVar.j(null, x35.a(x35Var, null, zrhVarF, null, 5));
                                        t2fVar.E();
                                        break;
                                    }
                                } else {
                                    gm0.Y(t2f.class.getName(), "Early return in onHourPick cuz of _dateTime.value is null");
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (!g45Var.A) {
                            zrh zrhVarF2 = bshVar3.F(i3);
                            f45 f45Var2 = g45Var.x;
                            if (f45Var2 != null) {
                                gm0.n(t2f.n, "minute = " + zrhVarF2);
                                mjg mjgVar2 = ((t2f) f45Var2).h;
                                x35 x35Var2 = (x35) mjgVar2.getValue();
                                if (x35Var2 != null) {
                                    if (!cqk.d(x35Var2.c, zrhVarF2)) {
                                        mjgVar2.j(null, x35.a(x35Var2, null, null, zrhVarF2, 3));
                                        break;
                                    }
                                } else {
                                    gm0.Y(t2f.class.getName(), "Early return in onMinutePick cuz of _dateTime.value is null");
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        }));
        recyclerView3.setEdgeEffectFactory(new lkc(dimensionPixelSize2));
        onThemeChanged(pq3.j.e(context).m());
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        setBackgroundColor(kbcVar.b().f);
        this.v.setBackgroundColor(kbcVar.B().b);
        this.w.setBackgroundColor(kbcVar.B().b);
    }

    public final void setListener$scheduled_send_picker_dialog(f45 f45Var) {
        this.x = f45Var;
    }
}

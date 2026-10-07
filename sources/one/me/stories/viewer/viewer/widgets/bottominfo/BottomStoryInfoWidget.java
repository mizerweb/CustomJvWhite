package one.me.stories.viewer.viewer.widgets.bottominfo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.gpi;
import defpackage.gwg;
import defpackage.i19;
import defpackage.j8e;
import defpackage.jz;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qo7;
import defpackage.r;
import defpackage.r2h;
import defpackage.t3f;
import defpackage.w11;
import defpackage.wtc;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z11;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.stories.viewer.viewer.widgets.bottominfo.BottomStoryInfoWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/stories/viewer/viewer/widgets/bottominfo/BottomStoryInfoWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "(Lt3f;)V", "stories-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BottomStoryInfoWidget extends Widget {
    public static final /* synthetic */ zv8[] j = {new dwd(BottomStoryInfoWidget.class, "viewsCounter", "getViewsCounter()Lone/me/stories/viewer/viewer/view/StoryCounterView;", 0), zo5.f(zfe.a, BottomStoryInfoWidget.class, "reactionsCounter", "getReactionsCounter()Lone/me/stories/viewer/viewer/view/StoryCounterView;", 0), new dwd(BottomStoryInfoWidget.class, "noViewsPlaceholder", "getNoViewsPlaceholder()Landroid/widget/TextView;", 0), new dwd(BottomStoryInfoWidget.class, "storyTimerView", "getStoryTimerView()Lone/me/stories/viewer/viewer/view/StoryTimerView;", 0)};
    public boolean a;
    public Long b;
    public final wtc c;
    public final ny8 d;
    public final ny8 e;
    public final j8e f;
    public final j8e g;
    public final j8e h;
    public final j8e i;

    public BottomStoryInfoWidget(Bundle bundle) {
        super(bundle);
        this.c = new wtc(m35getAccountScopeuqN4xOY());
        this.d = createViewModelLazy(w11.class, new r(11, new qo7(25, this)));
        this.e = getSharedViewModel(getA(), gpi.class, null);
        this.f = viewBinding(R.id.story_views_counter);
        this.g = viewBinding(R.id.story_reactions_counter);
        this.h = viewBinding(R.id.story_no_views_placeholder);
        this.i = viewBinding(R.id.story_timer);
    }

    public final gwg o1() {
        return (gwg) this.g.m(this, j[1]);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, gm0.K(48.0f * yl5.d().getDisplayMetrics().density), 80));
        final int i = 0;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        View gwgVar = new gwg(linearLayout.getContext(), R.drawable.icon_eye);
        gwgVar.setId(R.id.story_views_counter);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, gm0.K(28.0f * yl5.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        gwgVar.setLayoutParams(layoutParams2);
        gwgVar.setVisibility(8);
        final int i2 = 1;
        qe7.H(gwgVar, 300L, new View.OnClickListener(this) { // from class: y11
            public final /* synthetic */ BottomStoryInfoWidget b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                BottomStoryInfoWidget bottomStoryInfoWidget = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = BottomStoryInfoWidget.j;
                        w11 w11VarP1 = bottomStoryInfoWidget.p1();
                        Long l = w11VarP1.z.c;
                        if (l == null) {
                            gm0.n(w11VarP1.c, "retryStats: no current story");
                        } else {
                            long jLongValue = l.longValue();
                            w11VarP1.v.B(w11VarP1, w11.B[0], yab.h0(w11VarP1.b, ((n0c) ((xhh) w11VarP1.g.getValue())).a(), 2, new u11(0, jLongValue, w11VarP1, null)));
                        }
                        break;
                    case 1:
                        zv8[] zv8VarArr2 = BottomStoryInfoWidget.j;
                        a8j.x(bottomStoryInfoWidget.p1().n, new qxg(true));
                        break;
                    default:
                        zv8[] zv8VarArr3 = BottomStoryInfoWidget.j;
                        a8j.x(bottomStoryInfoWidget.p1().n, new qxg(false));
                        break;
                }
            }
        });
        linearLayout.addView(gwgVar);
        View gwgVar2 = new gwg(linearLayout.getContext(), R.drawable.icon_heart);
        gwgVar2.setId(R.id.story_reactions_counter);
        gwgVar2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        gwgVar2.setVisibility(8);
        final int i3 = 2;
        qe7.H(gwgVar2, 300L, new View.OnClickListener(this) { // from class: y11
            public final /* synthetic */ BottomStoryInfoWidget b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                BottomStoryInfoWidget bottomStoryInfoWidget = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = BottomStoryInfoWidget.j;
                        w11 w11VarP1 = bottomStoryInfoWidget.p1();
                        Long l = w11VarP1.z.c;
                        if (l == null) {
                            gm0.n(w11VarP1.c, "retryStats: no current story");
                        } else {
                            long jLongValue = l.longValue();
                            w11VarP1.v.B(w11VarP1, w11.B[0], yab.h0(w11VarP1.b, ((n0c) ((xhh) w11VarP1.g.getValue())).a(), 2, new u11(0, jLongValue, w11VarP1, null)));
                        }
                        break;
                    case 1:
                        zv8[] zv8VarArr2 = BottomStoryInfoWidget.j;
                        a8j.x(bottomStoryInfoWidget.p1().n, new qxg(true));
                        break;
                    default:
                        zv8[] zv8VarArr3 = BottomStoryInfoWidget.j;
                        a8j.x(bottomStoryInfoWidget.p1().n, new qxg(false));
                        break;
                }
            }
        });
        linearLayout.addView(gwgVar2);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(R.id.story_no_views_placeholder);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
        textView.setLayoutParams(layoutParams3);
        textView.setText(R.string.oneme_stories_views_bottom_sheet_no_views_placeholder);
        textView.setTextColor(pq3.j.e(getContext()).j().b.getText().b);
        q9i.a(q9i.e, textView);
        textView.setAlpha(0.44f);
        qe7.H(textView, 300L, new View.OnClickListener(this) { // from class: y11
            public final /* synthetic */ BottomStoryInfoWidget b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                BottomStoryInfoWidget bottomStoryInfoWidget = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = BottomStoryInfoWidget.j;
                        w11 w11VarP1 = bottomStoryInfoWidget.p1();
                        Long l = w11VarP1.z.c;
                        if (l == null) {
                            gm0.n(w11VarP1.c, "retryStats: no current story");
                        } else {
                            long jLongValue = l.longValue();
                            w11VarP1.v.B(w11VarP1, w11.B[0], yab.h0(w11VarP1.b, ((n0c) ((xhh) w11VarP1.g.getValue())).a(), 2, new u11(0, jLongValue, w11VarP1, null)));
                        }
                        break;
                    case 1:
                        zv8[] zv8VarArr2 = BottomStoryInfoWidget.j;
                        a8j.x(bottomStoryInfoWidget.p1().n, new qxg(true));
                        break;
                    default:
                        zv8[] zv8VarArr3 = BottomStoryInfoWidget.j;
                        a8j.x(bottomStoryInfoWidget.p1().n, new qxg(false));
                        break;
                }
            }
        });
        linearLayout.addView(textView);
        View r2hVar = new r2h(linearLayout.getContext(), R.drawable.icon_clock_timer);
        r2hVar.setId(R.id.story_timer);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams4.gravity = 8388629;
        layoutParams4.setMarginEnd(gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        r2hVar.setLayoutParams(layoutParams4);
        r2hVar.setVisibility(8);
        linearLayout.addView(r2hVar);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        jz jzVar = new jz(((gpi) this.e.getValue()).F, 13);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(jzVar, i19VarF, n09Var), new z11(null, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().n, getViewLifecycleOwner().f(), n09Var), new z11(null, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().m, getViewLifecycleOwner().f(), n09Var), new z11(null, this, 2), i), getViewLifecycleScope());
    }

    public final w11 p1() {
        return (w11) this.d.getValue();
    }

    public final gwg q1() {
        return (gwg) this.f.m(this, j[0]);
    }

    public BottomStoryInfoWidget(t3f t3fVar) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}

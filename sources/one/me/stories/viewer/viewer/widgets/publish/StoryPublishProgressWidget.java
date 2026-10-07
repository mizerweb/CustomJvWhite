package one.me.stories.viewer.viewer.widgets.publish;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.ayb;
import defpackage.azg;
import defpackage.btl;
import defpackage.c;
import defpackage.c0a;
import defpackage.c0h;
import defpackage.cyb;
import defpackage.czg;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.gpi;
import defpackage.i19;
import defpackage.j8e;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.p0h;
import defpackage.qe7;
import defpackage.r0h;
import defpackage.r8e;
import defpackage.rx8;
import defpackage.t2g;
import defpackage.t3f;
import defpackage.tre;
import defpackage.u0h;
import defpackage.wtc;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.stories.viewer.viewer.widgets.publish.StoryPublishProgressWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/stories/viewer/viewer/widgets/publish/StoryPublishProgressWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "Lazg;", "storyOwnerModel", "(Lt3f;Lazg;)V", "stories-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StoryPublishProgressWidget extends Widget {
    public static final /* synthetic */ zv8[] h = {new dwd(StoryPublishProgressWidget.class, "progressView", "getProgressView()Landroid/widget/ImageView;", 0), zo5.f(zfe.a, StoryPublishProgressWidget.class, "retryButton", "getRetryButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final wtc a;
    public final azg b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final j8e f;
    public final j8e g;

    public StoryPublishProgressWidget(Bundle bundle) {
        super(bundle);
        this.a = new wtc(m35getAccountScopeuqN4xOY());
        Object objF0 = tre.f0(bundle, "story_owner", czg.class);
        if (objF0 == null) {
            c.o(c0a.o("No value passed for key story_owner of type ", czg.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.b = ((czg) ((Parcelable) objF0)).a();
        this.c = createViewModelLazy(p0h.class, new t2g(17, new r0h(this, 0)));
        this.d = getSharedViewModel(getC(), gpi.class, null);
        this.e = rx8.P(3, new r0h(this, 1));
        this.f = viewBinding(R.id.story_publish_progress);
        this.g = viewBinding(R.id.story_publish_retry_btn);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, gm0.K(yl5.d().getDisplayMetrics().density * 48.0f), 80));
        ImageView imageView = new ImageView(frameLayout.getContext());
        imageView.setId(R.id.story_publish_progress);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 48.0f), gm0.K(48.0f * yl5.d().getDisplayMetrics().density), 17));
        imageView.setImageDrawable((c0h) this.e.getValue());
        final int i = 0;
        qe7.H(imageView, 300L, new View.OnClickListener(this) { // from class: s0h
            public final /* synthetic */ StoryPublishProgressWidget b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                StoryPublishProgressWidget storyPublishProgressWidget = this.b;
                switch (i2) {
                    case 0:
                        zv8[] zv8VarArr = StoryPublishProgressWidget.h;
                        lsg lsgVar = (lsg) ((gpi) storyPublishProgressWidget.d.getValue()).F.a.getValue();
                        Long lG = lsgVar != null ? lsgVar.g() : null;
                        p0h p0hVar = (p0h) storyPublishProgressWidget.c.getValue();
                        azg azgVar = storyPublishProgressWidget.b;
                        je9 je9Var = je9.f;
                        sgg sggVar = p0hVar.g;
                        if (sggVar != null && sggVar.isActive()) {
                            String str = p0hVar.h;
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null && a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "cancel job is already active", null);
                            }
                        } else if (lG == null) {
                            String str2 = p0hVar.h;
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, str2, "We cannot cancel, draftId is null", null);
                            }
                        } else {
                            p0hVar.g = yab.i0(p0hVar.b, ((n0c) ((xhh) p0hVar.e.getValue())).a(), 0, new p7g(p0hVar, azgVar, lG, (lq4) null), 2);
                        }
                        break;
                    default:
                        zv8[] zv8VarArr2 = StoryPublishProgressWidget.h;
                        lsg lsgVar2 = (lsg) ((gpi) storyPublishProgressWidget.d.getValue()).F.a.getValue();
                        Long lG2 = lsgVar2 != null ? lsgVar2.g() : null;
                        p0h p0hVar2 = (p0h) storyPublishProgressWidget.c.getValue();
                        azg azgVar2 = storyPublishProgressWidget.b;
                        if (lG2 != null) {
                            g1h g1hVar = (g1h) p0hVar2.d.getValue();
                            long jLongValue = lG2.longValue();
                            ha9 ha9Var = p0hVar2.c;
                            String str3 = g1hVar.d;
                            a4c a4cVar3 = gm0.f;
                            if (a4cVar3 != null) {
                                je9 je9Var2 = je9.d;
                                if (a4cVar3.b(je9Var2)) {
                                    a4cVar3.c(je9Var2, str3, zo5.j(jLongValue, "Retry story publish for draftId="), null);
                                }
                            }
                            g1hVar.c(azgVar2, jLongValue, ha9Var);
                            break;
                        } else {
                            String str4 = p0hVar2.h;
                            a4c a4cVar4 = gm0.f;
                            if (a4cVar4 != null) {
                                je9 je9Var3 = je9.f;
                                if (a4cVar4.b(je9Var3)) {
                                    a4cVar4.c(je9Var3, str4, "We cannot cancel, draftId is null", null);
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView);
        cyb cybVar = new cyb(frameLayout.getContext());
        cybVar.setId(R.id.story_publish_retry_btn);
        cybVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        cybVar.setSize(ayb.j);
        cybVar.setAppearance(zxb.OVERLAY);
        cybVar.setIconResource(R.drawable.icon_redo);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.oneme_stories_viewer_retry_publish));
        cybVar.setVisibility(8);
        final int i2 = 1;
        qe7.H(cybVar, 300L, new View.OnClickListener(this) { // from class: s0h
            public final /* synthetic */ StoryPublishProgressWidget b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                StoryPublishProgressWidget storyPublishProgressWidget = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = StoryPublishProgressWidget.h;
                        lsg lsgVar = (lsg) ((gpi) storyPublishProgressWidget.d.getValue()).F.a.getValue();
                        Long lG = lsgVar != null ? lsgVar.g() : null;
                        p0h p0hVar = (p0h) storyPublishProgressWidget.c.getValue();
                        azg azgVar = storyPublishProgressWidget.b;
                        je9 je9Var = je9.f;
                        sgg sggVar = p0hVar.g;
                        if (sggVar != null && sggVar.isActive()) {
                            String str = p0hVar.h;
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null && a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "cancel job is already active", null);
                            }
                        } else if (lG == null) {
                            String str2 = p0hVar.h;
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, str2, "We cannot cancel, draftId is null", null);
                            }
                        } else {
                            p0hVar.g = yab.i0(p0hVar.b, ((n0c) ((xhh) p0hVar.e.getValue())).a(), 0, new p7g(p0hVar, azgVar, lG, (lq4) null), 2);
                        }
                        break;
                    default:
                        zv8[] zv8VarArr2 = StoryPublishProgressWidget.h;
                        lsg lsgVar2 = (lsg) ((gpi) storyPublishProgressWidget.d.getValue()).F.a.getValue();
                        Long lG2 = lsgVar2 != null ? lsgVar2.g() : null;
                        p0h p0hVar2 = (p0h) storyPublishProgressWidget.c.getValue();
                        azg azgVar2 = storyPublishProgressWidget.b;
                        if (lG2 != null) {
                            g1h g1hVar = (g1h) p0hVar2.d.getValue();
                            long jLongValue = lG2.longValue();
                            ha9 ha9Var = p0hVar2.c;
                            String str3 = g1hVar.d;
                            a4c a4cVar3 = gm0.f;
                            if (a4cVar3 != null) {
                                je9 je9Var2 = je9.d;
                                if (a4cVar3.b(je9Var2)) {
                                    a4cVar3.c(je9Var2, str3, zo5.j(jLongValue, "Retry story publish for draftId="), null);
                                }
                            }
                            g1hVar.c(azgVar2, jLongValue, ha9Var);
                            break;
                        } else {
                            String str4 = p0hVar2.h;
                            a4c a4cVar4 = gm0.f;
                            if (a4cVar4 != null) {
                                je9 je9Var3 = je9.f;
                                if (a4cVar4.b(je9Var3)) {
                                    a4cVar4.c(je9Var3, str4, "We cannot cancel, draftId is null", null);
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(cybVar);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        c0h c0hVar = (c0h) this.e.getValue();
        ValueAnimator valueAnimator = c0hVar.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c0hVar.f = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        r8e r8eVar = ((gpi) this.d.getValue()).F;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new u0h(null, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((p0h) this.c.getValue()).i, getViewLifecycleOwner().f(), n09Var), new u0h(null, this, 1), i), getViewLifecycleScope());
    }

    public StoryPublishProgressWidget(t3f t3fVar, azg azgVar) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("story_owner", btl.b(azgVar))));
    }
}

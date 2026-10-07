package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import java.util.concurrent.Executor;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class qh1 extends g6g {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qh1(Executor executor, int i) {
        super(executor);
        this.f = i;
    }

    @Override // defpackage.g6g
    /* JADX INFO: renamed from: K */
    public void u(s7g s7gVar, int i) {
        switch (this.f) {
            case 4:
                throw new ClassCastException();
            case 5:
                q0g q0gVar = ((o0g) ((t0g) s7gVar).a).d;
                q0gVar.c = true;
                q0gVar.b.c();
                return;
            case 6:
                q0g q0gVar2 = ((o0g) ((u0g) s7gVar).a).d;
                q0gVar2.c = true;
                q0gVar2.b.c();
                return;
            default:
                super.u(s7gVar, i);
                return;
        }
    }

    @Override // defpackage.g6g, defpackage.nee
    public int n(int i) {
        switch (this.f) {
            case 0:
                return R.id.call_event_view_item;
            case 1:
            default:
                return super.n(i);
            case 2:
                return R.id.chats_search_empty_view_type;
            case 3:
                return R.id.chats_search_loading_view_type;
        }
    }

    @Override // defpackage.g6g, defpackage.nee
    public void u(lfe lfeVar, int i) {
        switch (this.f) {
            case 4:
                throw new ClassCastException();
            case 5:
                q0g q0gVar = ((o0g) ((t0g) lfeVar).a).d;
                q0gVar.c = true;
                q0gVar.b.c();
                return;
            case 6:
                q0g q0gVar2 = ((o0g) ((u0g) lfeVar).a).d;
                q0gVar2.c = true;
                q0gVar2.b.c();
                return;
            default:
                super.u(lfeVar, i);
                return;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        switch (this.f) {
            case 0:
                if (i == R.id.call_event_view_item) {
                    return new am0(new nh1(viewGroup.getContext()));
                }
                ore.p("Not supported viewType for CallEventsAdapter");
                return null;
            case 1:
                return new z91(new a76(viewGroup.getContext()), 7);
            case 2:
                r1c r1cVar = new r1c(viewGroup.getContext());
                z91 z91Var = new z91(r1cVar, 8);
                r1cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                r1cVar.setIcon(R.drawable.icon_search);
                r1cVar.setTitle(new tnh(R.string.oneme_empty_search_view_title));
                r1cVar.setSubtitle(new tnh(R.string.oneme_empty_search_subtitle));
                return z91Var;
            case 3:
                Context context = viewGroup.getContext();
                d8a d8aVar = new d8a(context, 1);
                d8aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                ProgressBar progressBar = new ProgressBar(context);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 48.0f), gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
                layoutParams.gravity = 17;
                progressBar.setLayoutParams(layoutParams);
                int i2 = pq3.j.h(progressBar).getIcon().c;
                Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                if (indeterminateDrawable == null) {
                    indeterminateDrawable = progressBar.getProgressDrawable();
                }
                if (indeterminateDrawable != null) {
                    sb8.m0(i2, indeterminateDrawable);
                }
                d8aVar.addView(progressBar);
                return new z91(d8aVar, 10);
            case 4:
                return new etf(new cyb(viewGroup.getContext()));
            case 5:
                return new t0g(new o0g(viewGroup.getContext()));
            default:
                return new u0g(new o0g(viewGroup.getContext()));
        }
    }
}

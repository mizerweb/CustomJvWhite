package defpackage;

import android.content.Context;
import android.view.ViewStub;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class pd1 extends wf4 {
    public final g52 s;
    public od1 t;
    public md1 u;
    public final ifh v;

    public pd1(Context context, ha9 ha9Var) {
        super(context);
        this.v = new ifh(new ca0(context, 3));
        setLayoutParams(new uf4(-1, -1));
        setBackgroundColor(pq3.j.l(this).b.b().c);
        setFocusable(true);
        setClickable(true);
        g52 g52Var = new g52(context, ha9Var);
        g52Var.setId(R.id.call_user_full_avatar);
        g52Var.setMode(c52.b);
        this.s = g52Var;
        new ViewStub(context).setId(R.id.call_recall);
        new ViewStub(context).setId(R.id.call_cancel);
        addView(g52Var, -1, 0);
        eg4 eg4VarH = ch3.h(this);
        int id = g52Var.getId();
        eg4VarH.d(id, 7, 0, 7);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 4, 0, 4);
        eg4VarH.a(this);
    }

    private final EnhancedAnimatedVectorDrawable getChatIcon() {
        return (EnhancedAnimatedVectorDrawable) this.v.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Context context = getContext();
        ufe ufeVar = new ufe();
        ufeVar.a = context.getResources().getConfiguration().orientation;
        md1 md1Var = new md1(ufeVar, this, 1);
        context.registerComponentCallbacks(md1Var);
        this.u = md1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        md1 md1Var = this.u;
        if (md1Var != null) {
            getContext().unregisterComponentCallbacks(md1Var);
        }
    }

    public final void setClickListener(od1 od1Var) {
        this.t = od1Var;
    }

    public final void setOrganization(CharSequence charSequence) {
        this.s.setOrganization(charSequence);
    }

    public final void setStatus(CharSequence charSequence) {
        this.s.setStatus(charSequence);
    }

    public final void u(boolean z) {
        EnhancedAnimatedVectorDrawable chatIcon = getChatIcon();
        tnh tnhVar = new tnh(R.string.call_write_message);
        nd1 nd1Var = new nd1(this, 2);
        g52 g52Var = this.s;
        g52Var.getClass();
        g52Var.b0(z, R.string.call_write_message, tnhVar, nd1Var, new j22(1, chatIcon));
    }
}

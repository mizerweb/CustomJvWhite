package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements e9j {
    public boolean a = false;
    public int b;
    public final /* synthetic */ ActionBarContextView c;

    public b0(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
    }

    @Override // defpackage.e9j
    public final void a() {
        this.a = true;
    }

    @Override // defpackage.e9j
    public final void b() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }

    @Override // defpackage.e9j
    public final void c() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.f = null;
        super/*android.view.View*/.setVisibility(this.b);
    }
}

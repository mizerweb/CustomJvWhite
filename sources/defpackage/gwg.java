package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class gwg extends dq0 {
    public v0c g;

    @Override // defpackage.dq0
    public final void a() {
        addView(this.b);
        v0c v0cVar = new v0c(getContext());
        v0cVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        v0cVar.setHasBackground(false);
        v0cVar.setTypography(q9i.f);
        v0cVar.setTextColor(getCustomTheme().getText().b);
        this.g = v0cVar;
        setContentView(v0cVar);
        addView(this.g);
    }

    public final void b() {
        v0c v0cVar = this.g;
        if (v0cVar != null) {
            v0cVar.b = null;
            v0cVar.f = null;
            v0cVar.j = 0;
        }
    }
}

package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vpg {
    public final View a;
    public int b;
    public int c;

    public vpg(View view) {
        this.a = view;
        view.setLayoutDirection(mw7.d(view.getContext().getResources().getConfiguration().getLayoutDirection() != 1 ? 2 : 1));
    }
}

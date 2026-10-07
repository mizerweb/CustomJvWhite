package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x6j implements View.OnApplyWindowInsetsListener {
    public ixj a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ btb c;

    public x6j(View view, btb btbVar) {
        this.b = view;
        this.c = btbVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ixj ixjVarG = ixj.g(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        btb btbVar = this.c;
        if (i < 30) {
            y6j.a(windowInsets, this.b);
            if (ixjVarG.equals(this.a)) {
                return btbVar.s(view, ixjVarG).f();
            }
        }
        this.a = ixjVarG;
        ixj ixjVarS = btbVar.s(view, ixjVarG);
        if (i >= 30) {
            return ixjVarS.f();
        }
        WeakHashMap weakHashMap = i7j.a;
        w6j.c(view);
        return ixjVarS.f();
    }
}

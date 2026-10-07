package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class fj9 extends FrameLayout {
    public final zo7 a;
    public final bj9 b;
    public boolean c;
    public boolean d;
    public rmg e;

    public fj9(Context context) {
        super(context, null);
        zo7 zo7Var = new zo7(context, 15);
        this.a = zo7Var;
        bj9 bj9Var = new bj9(context, null);
        bj9Var.setId(R.id.oneme_stickers_sticker_lottie);
        bj9Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.b = bj9Var;
        addView((l1c) zo7Var.b);
        addView(bj9Var);
    }

    public final void a(tlg tlgVar, int i) {
        rmg rmgVar = this.e;
        if (rmgVar != null) {
            rmgVar.b(tlgVar);
        }
        String str = tlgVar.e;
        zo7 zo7Var = this.a;
        boolean z = true;
        bj9 bj9Var = this.b;
        if (str == null || str.length() == 0) {
            bj9Var.f();
            bj9Var.setVisibility(8);
            ((l1c) zo7Var.b).setVisibility(0);
        } else {
            bj9Var.setAutoRepeat(true);
            bj9Var.setOnFirstFrameListener(new oo6(17, this));
            bj9Var.setFailureListener(new ch9(2, this));
            bj9Var.setVisibility(0);
            this.c = true;
            boolean zA = bj9Var.a(i, i, str);
            this.c = false;
            z = zA && !this.d;
            this.d = false;
        }
        if (z) {
            zo7Var.g(tlgVar.d);
        }
    }

    public final void b(dj9 dj9Var) {
        if (dj9Var.a == null) {
            dj9Var.a = Collections.newSetFromMap(new WeakHashMap());
        }
        Set set = dj9Var.a;
        if (set != null) {
            set.add(this.b);
        }
    }

    public final rmg getSizeConfigurator() {
        return this.e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        rmg rmgVar = this.e;
        gx gxVarA = rmgVar != null ? rmgVar.a(i, i2) : null;
        if (gxVarA != null) {
            i = gxVarA.a;
        }
        if (gxVarA != null) {
            i2 = gxVarA.b;
        }
        super.onMeasure(i, i2);
    }

    public final void setSizeConfigurator(rmg rmgVar) {
        this.e = rmgVar;
    }
}

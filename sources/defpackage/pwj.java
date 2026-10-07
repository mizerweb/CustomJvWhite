package defpackage;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pwj extends WindowInsetsAnimation$Callback {
    public final tu3 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public pwj(tu3 tu3Var) {
        super(tu3Var.a);
        this.d = new HashMap();
        this.a = tu3Var;
    }

    public final swj a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        swj swjVar = (swj) map.get(windowInsetsAnimation);
        if (swjVar == null) {
            swjVar = new swj(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                swjVar.a = new qwj(windowInsetsAnimation);
            }
            map.put(windowInsetsAnimation, swjVar);
        }
        return swjVar;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.e(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.f(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationI = xcg.i(list.get(size));
            swj swjVarA = a(windowInsetsAnimationI);
            swjVarA.a.d(windowInsetsAnimationI.getFraction());
            this.c.add(swjVarA);
        }
        return this.a.g(ixj.g(windowInsets, null), this.b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        wze wzeVarH = this.a.h(a(windowInsetsAnimation), new wze(bounds));
        wzeVarH.getClass();
        xcg.j();
        return xcg.g(((mi8) wzeVarH.b).d(), ((mi8) wzeVarH.c).d());
    }
}

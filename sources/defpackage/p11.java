package defpackage;

import android.view.View;
import androidx.media3.common.util.GlUtil$GlException;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class p11 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Object d;
    public final Object e;

    public p11(boolean z, int i) {
        this.a = 2;
        this.b = i;
        this.c = z;
        this.d = new ArrayDeque(i);
        this.e = new ArrayDeque(i);
    }

    public void a(int i) {
        int i2 = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.t1;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        WeakHashMap weakHashMap = i7j.a;
                        ((View) bottomSheetBehavior.t1.get()).postOnAnimation((pi) obj);
                        this.c = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        WeakHashMap weakHashMap2 = i7j.a;
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((f4g) obj);
                        this.c = true;
                    }
                    break;
                }
                break;
        }
    }

    public void b(wm7 wm7Var, int i, int i2) {
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        lvb.b0(arrayDeque.isEmpty());
        lvb.b0(((ArrayDeque) this.e).isEmpty());
        for (int i3 = 0; i3 < this.b; i3++) {
            arrayDeque.add(wm7Var.o(tab.n(i, i2, this.c), i, i2));
        }
    }

    public void c() throws GlUtil$GlException {
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        ArrayDeque arrayDeque2 = (ArrayDeque) this.e;
        Iterable[] iterableArr = {arrayDeque, arrayDeque2};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        Iterator it = new j17(iterableArr).iterator();
        while (true) {
            xn8 xn8Var = (xn8) it;
            if (!xn8Var.hasNext()) {
                arrayDeque.clear();
                arrayDeque2.clear();
                return;
            }
            ((dn7) xn8Var.next()).a();
        }
    }

    public void d(wm7 wm7Var, int i, int i2) {
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        ArrayDeque arrayDeque2 = (ArrayDeque) this.e;
        Iterable[] iterableArr = {arrayDeque, arrayDeque2};
        for (int i3 = 0; i3 < 2; i3++) {
            iterableArr[i3].getClass();
        }
        if (!((xn8) new j17(iterableArr).iterator()).hasNext()) {
            b(wm7Var, i, i2);
            return;
        }
        Iterable[] iterableArr2 = {arrayDeque, arrayDeque2};
        for (int i4 = 0; i4 < 2; i4++) {
            iterableArr2[i4].getClass();
        }
        dn7 dn7Var = (dn7) ((xn8) new j17(iterableArr2).iterator()).next();
        if (dn7Var.c == i && dn7Var.d == i2) {
            return;
        }
        c();
        b(wm7Var, i, i2);
    }

    public int e() {
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        Iterable[] iterableArr = {arrayDeque, (ArrayDeque) this.e};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return !((xn8) new j17(iterableArr).iterator()).hasNext() ? this.b : arrayDeque.size();
    }

    public dn7 f() {
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (arrayDeque.isEmpty()) {
            ore.k("Textures are all in use. Please release in-use textures before calling useTexture.");
            return null;
        }
        dn7 dn7Var = (dn7) arrayDeque.remove();
        ((ArrayDeque) this.e).add(dn7Var);
        return dn7Var;
    }

    public p11(SideSheetBehavior sideSheetBehavior) {
        this.a = 1;
        this.e = sideSheetBehavior;
        this.d = new f4g(0, this);
    }

    public p11(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.e = bottomSheetBehavior;
        this.d = new pi(6, this);
    }
}
